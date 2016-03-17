# OpenNLP on Steroids


This fork of OpenNLP includes simple optimisations that seriously enhance its performance.
* Replace a custom hashtable by the standard Java Hashtable. Increases performance on more or less every training task since this component is central.
* Uses fast exponentiaion for the Maxent model for both training and evaluation, passes all tests, increase performance
* Uses a priorityQueue for the beamsearch instead of the custom heap. Drastically improve evaluation performance.
* Remove the I/O bound issue when using two phase training where the system was previously hindered by writing performance. Writing is now in a separate thread.


## Performance gain

Depending on your configuration, tasks and size of your training dataset, you will have a performance gain of at least 10 percent and up to 300 percent on 2 phase training on large datasets.
