// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link UpdateEventStreamingRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventStreamingRequest</p>
 */
public class UpdateEventStreamingRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EventStreamingName")
    @Validation(required = true)
    private String eventStreamingName;

    @Body
    @NameInMap("FilterPattern")
    @Validation(required = true)
    private String filterPattern;

    @Body
    @NameInMap("RunOptions")
    private RunOptions runOptions;

    @Body
    @NameInMap("Sink")
    @Validation(required = true)
    private Sink sink;

    @Body
    @NameInMap("Source")
    @Validation(required = true)
    private Source source;

    @Body
    @NameInMap("Transforms")
    private java.util.List < Transforms> transforms;

    private UpdateEventStreamingRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventStreamingName = builder.eventStreamingName;
        this.filterPattern = builder.filterPattern;
        this.runOptions = builder.runOptions;
        this.sink = builder.sink;
        this.source = builder.source;
        this.transforms = builder.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventStreamingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventStreamingName
     */
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    /**
     * @return filterPattern
     */
    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * @return runOptions
     */
    public RunOptions getRunOptions() {
        return this.runOptions;
    }

    /**
     * @return sink
     */
    public Sink getSink() {
        return this.sink;
    }

    /**
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * @return transforms
     */
    public java.util.List < Transforms> getTransforms() {
        return this.transforms;
    }

    public static final class Builder extends Request.Builder<UpdateEventStreamingRequest, Builder> {
        private String description; 
        private String eventStreamingName; 
        private String filterPattern; 
        private RunOptions runOptions; 
        private Sink sink; 
        private Source source; 
        private java.util.List < Transforms> transforms; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventStreamingRequest request) {
            super(request);
            this.description = request.description;
            this.eventStreamingName = request.eventStreamingName;
            this.filterPattern = request.filterPattern;
            this.runOptions = request.runOptions;
            this.sink = request.sink;
            this.source = request.source;
            this.transforms = request.transforms;
        } 

        /**
         * The description of the event stream.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the event stream.
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        /**
         * The rule that is used to filter events. If you leave this parameter empty, all events are matched.
         */
        public Builder filterPattern(String filterPattern) {
            this.putBodyParameter("FilterPattern", filterPattern);
            this.filterPattern = filterPattern;
            return this;
        }

        /**
         * The parameters that are configured for the runtime environment.
         */
        public Builder runOptions(RunOptions runOptions) {
            String runOptionsShrink = shrink(runOptions, "RunOptions", "json");
            this.putBodyParameter("RunOptions", runOptionsShrink);
            this.runOptions = runOptions;
            return this;
        }

        /**
         * The event target. You must and can specify only one event target.
         */
        public Builder sink(Sink sink) {
            String sinkShrink = shrink(sink, "Sink", "json");
            this.putBodyParameter("Sink", sinkShrink);
            this.sink = sink;
            return this;
        }

        /**
         * The event source, which is also known as the event source. You must and can specify only one event source.
         */
        public Builder source(Source source) {
            String sourceShrink = shrink(source, "Source", "json");
            this.putBodyParameter("Source", sourceShrink);
            this.source = source;
            return this;
        }

        /**
         * Transforms.
         */
        public Builder transforms(java.util.List < Transforms> transforms) {
            String transformsShrink = shrink(transforms, "Transforms", "json");
            this.putBodyParameter("Transforms", transformsShrink);
            this.transforms = transforms;
            return this;
        }

        @Override
        public UpdateEventStreamingRequest build() {
            return new UpdateEventStreamingRequest(this);
        } 

    } 

    public static class BatchWindow extends TeaModel {
        @NameInMap("CountBasedWindow")
        private Integer countBasedWindow;

        @NameInMap("TimeBasedWindow")
        private Integer timeBasedWindow;

        private BatchWindow(Builder builder) {
            this.countBasedWindow = builder.countBasedWindow;
            this.timeBasedWindow = builder.timeBasedWindow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchWindow create() {
            return builder().build();
        }

        /**
         * @return countBasedWindow
         */
        public Integer getCountBasedWindow() {
            return this.countBasedWindow;
        }

        /**
         * @return timeBasedWindow
         */
        public Integer getTimeBasedWindow() {
            return this.timeBasedWindow;
        }

        public static final class Builder {
            private Integer countBasedWindow; 
            private Integer timeBasedWindow; 

            /**
             * The maximum number of events that is allowed in the batch window. If the value specified by this parameter is reached, the data in the batch window is pushed to the downstream application. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.
             */
            public Builder countBasedWindow(Integer countBasedWindow) {
                this.countBasedWindow = countBasedWindow;
                return this;
            }

            /**
             * The maximum period of time during which events are allowed in the batch window. Unit: seconds. If the value specified by this parameter is reached, the data in the batch window is pushed to the downstream application. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.
             */
            public Builder timeBasedWindow(Integer timeBasedWindow) {
                this.timeBasedWindow = timeBasedWindow;
                return this;
            }

            public BatchWindow build() {
                return new BatchWindow(this);
            } 

        } 

    }
    public static class DeadLetterQueue extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        private DeadLetterQueue(Builder builder) {
            this.arn = builder.arn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeadLetterQueue create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        public static final class Builder {
            private String arn; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            public DeadLetterQueue build() {
                return new DeadLetterQueue(this);
            } 

        } 

    }
    public static class RetryStrategy extends TeaModel {
        @NameInMap("MaximumEventAgeInSeconds")
        private Long maximumEventAgeInSeconds;

        @NameInMap("MaximumRetryAttempts")
        private Long maximumRetryAttempts;

        @NameInMap("PushRetryStrategy")
        private String pushRetryStrategy;

        private RetryStrategy(Builder builder) {
            this.maximumEventAgeInSeconds = builder.maximumEventAgeInSeconds;
            this.maximumRetryAttempts = builder.maximumRetryAttempts;
            this.pushRetryStrategy = builder.pushRetryStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryStrategy create() {
            return builder().build();
        }

        /**
         * @return maximumEventAgeInSeconds
         */
        public Long getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        /**
         * @return maximumRetryAttempts
         */
        public Long getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        /**
         * @return pushRetryStrategy
         */
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public static final class Builder {
            private Long maximumEventAgeInSeconds; 
            private Long maximumRetryAttempts; 
            private String pushRetryStrategy; 

            /**
             * The maximum period of time during which retries are performed.
             */
            public Builder maximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
                this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
                return this;
            }

            /**
             * The maximum number of retries.
             */
            public Builder maximumRetryAttempts(Long maximumRetryAttempts) {
                this.maximumRetryAttempts = maximumRetryAttempts;
                return this;
            }

            /**
             * The retry policy that is used if an event failed to be pushed. Valid values: BACKOFF_RETRY and EXPONENTIAL_DECAY_RETRY.
             */
            public Builder pushRetryStrategy(String pushRetryStrategy) {
                this.pushRetryStrategy = pushRetryStrategy;
                return this;
            }

            public RetryStrategy build() {
                return new RetryStrategy(this);
            } 

        } 

    }
    public static class RunOptions extends TeaModel {
        @NameInMap("BatchWindow")
        private BatchWindow batchWindow;

        @NameInMap("DeadLetterQueue")
        private DeadLetterQueue deadLetterQueue;

        @NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @NameInMap("MaximumTasks")
        private Long maximumTasks;

        @NameInMap("RetryStrategy")
        private RetryStrategy retryStrategy;

        private RunOptions(Builder builder) {
            this.batchWindow = builder.batchWindow;
            this.deadLetterQueue = builder.deadLetterQueue;
            this.errorsTolerance = builder.errorsTolerance;
            this.maximumTasks = builder.maximumTasks;
            this.retryStrategy = builder.retryStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunOptions create() {
            return builder().build();
        }

        /**
         * @return batchWindow
         */
        public BatchWindow getBatchWindow() {
            return this.batchWindow;
        }

        /**
         * @return deadLetterQueue
         */
        public DeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        /**
         * @return errorsTolerance
         */
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        /**
         * @return maximumTasks
         */
        public Long getMaximumTasks() {
            return this.maximumTasks;
        }

        /**
         * @return retryStrategy
         */
        public RetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

        public static final class Builder {
            private BatchWindow batchWindow; 
            private DeadLetterQueue deadLetterQueue; 
            private String errorsTolerance; 
            private Long maximumTasks; 
            private RetryStrategy retryStrategy; 

            /**
             * The information about the batch window.
             */
            public Builder batchWindow(BatchWindow batchWindow) {
                this.batchWindow = batchWindow;
                return this;
            }

            /**
             * Specifies whether to enable dead-letter queues. By default, dead-letter queues are disabled. Messages that fail to be pushed are discarded after the maximum number of retries specified by the retry policy is reached.
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * The fault tolerance policy. The value NONE specifies that faults are not tolerated, and the value All specifies that all faults are tolerated.
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * The concurrency level.
             */
            public Builder maximumTasks(Long maximumTasks) {
                this.maximumTasks = maximumTasks;
                return this;
            }

            /**
             * The information about the retry policy that is used if the event fails to be pushed.
             */
            public Builder retryStrategy(RetryStrategy retryStrategy) {
                this.retryStrategy = retryStrategy;
                return this;
            }

            public RunOptions build() {
                return new RunOptions(this);
            } 

        } 

    }
    public static class SinkFcParametersBody extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkFcParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkFcParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkFcParametersBody build() {
                return new SinkFcParametersBody(this);
            } 

        } 

    }
    public static class Concurrency extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Concurrency(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Concurrency create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The delivery concurrency. Minimum value: 1.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Concurrency build() {
                return new Concurrency(this);
            } 

        } 

    }
    public static class FunctionName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private FunctionName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the Function Compute function.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FunctionName build() {
                return new FunctionName(this);
            } 

        } 

    }
    public static class InvocationType extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private InvocationType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvocationType create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The invocation type. Valid values: Sync and Async.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InvocationType build() {
                return new InvocationType(this);
            } 

        } 

    }
    public static class Qualifier extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Qualifier(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Qualifier create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The alias of the service to which the function belongs.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Qualifier build() {
                return new Qualifier(this);
            } 

        } 

    }
    public static class ServiceName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private ServiceName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the Function Compute service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ServiceName build() {
                return new ServiceName(this);
            } 

        } 

    }
    public static class SinkFcParameters extends TeaModel {
        @NameInMap("Body")
        private SinkFcParametersBody body;

        @NameInMap("Concurrency")
        private Concurrency concurrency;

        @NameInMap("FunctionName")
        private FunctionName functionName;

        @NameInMap("InvocationType")
        private InvocationType invocationType;

        @NameInMap("Qualifier")
        private Qualifier qualifier;

        @NameInMap("ServiceName")
        private ServiceName serviceName;

        private SinkFcParameters(Builder builder) {
            this.body = builder.body;
            this.concurrency = builder.concurrency;
            this.functionName = builder.functionName;
            this.invocationType = builder.invocationType;
            this.qualifier = builder.qualifier;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkFcParameters create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public SinkFcParametersBody getBody() {
            return this.body;
        }

        /**
         * @return concurrency
         */
        public Concurrency getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return functionName
         */
        public FunctionName getFunctionName() {
            return this.functionName;
        }

        /**
         * @return invocationType
         */
        public InvocationType getInvocationType() {
            return this.invocationType;
        }

        /**
         * @return qualifier
         */
        public Qualifier getQualifier() {
            return this.qualifier;
        }

        /**
         * @return serviceName
         */
        public ServiceName getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private SinkFcParametersBody body; 
            private Concurrency concurrency; 
            private FunctionName functionName; 
            private InvocationType invocationType; 
            private Qualifier qualifier; 
            private ServiceName serviceName; 

            /**
             * The message body that is sent to the function.
             */
            public Builder body(SinkFcParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The information about the delivery concurrency.
             */
            public Builder concurrency(Concurrency concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * The information about the Function Compute function.
             */
            public Builder functionName(FunctionName functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The information about the invocation type.
             */
            public Builder invocationType(InvocationType invocationType) {
                this.invocationType = invocationType;
                return this;
            }

            /**
             * The information about the service to which the function belongs.
             */
            public Builder qualifier(Qualifier qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The information about the Function Compute service.
             */
            public Builder serviceName(ServiceName serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public SinkFcParameters build() {
                return new SinkFcParameters(this);
            } 

        } 

    }
    public static class ExecutionName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private ExecutionName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the Function Compute service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExecutionName build() {
                return new ExecutionName(this);
            } 

        } 

    }
    public static class FlowName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private FlowName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the Function Compute service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FlowName build() {
                return new FlowName(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Input(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the Function Compute service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class RoleName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private RoleName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the Function Compute service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RoleName build() {
                return new RoleName(this);
            } 

        } 

    }
    public static class SinkFnfParameters extends TeaModel {
        @NameInMap("ExecutionName")
        private ExecutionName executionName;

        @NameInMap("FlowName")
        private FlowName flowName;

        @NameInMap("Input")
        private Input input;

        @NameInMap("RoleName")
        private RoleName roleName;

        private SinkFnfParameters(Builder builder) {
            this.executionName = builder.executionName;
            this.flowName = builder.flowName;
            this.input = builder.input;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkFnfParameters create() {
            return builder().build();
        }

        /**
         * @return executionName
         */
        public ExecutionName getExecutionName() {
            return this.executionName;
        }

        /**
         * @return flowName
         */
        public FlowName getFlowName() {
            return this.flowName;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return roleName
         */
        public RoleName getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private ExecutionName executionName; 
            private FlowName flowName; 
            private Input input; 
            private RoleName roleName; 

            /**
             * ExecutionName.
             */
            public Builder executionName(ExecutionName executionName) {
                this.executionName = executionName;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(FlowName flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(RoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            public SinkFnfParameters build() {
                return new SinkFnfParameters(this);
            } 

        } 

    }
    public static class Acks extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Acks(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acks create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The ACK mode. If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high. If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader. If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Acks build() {
                return new Acks(this);
            } 

        } 

    }
    public static class InstanceId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private InstanceId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache Kafka instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceId build() {
                return new InstanceId(this);
            } 

        } 

    }
    public static class Key extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Key(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Key create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The message key.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Key build() {
                return new Key(this);
            } 

        } 

    }
    public static class Topic extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Topic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topic create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the topic in Message Queue for Apache Kafka instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Topic build() {
                return new Topic(this);
            } 

        } 

    }
    public static class Value extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Value(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    public static class SinkKafkaParameters extends TeaModel {
        @NameInMap("Acks")
        private Acks acks;

        @NameInMap("InstanceId")
        private InstanceId instanceId;

        @NameInMap("Key")
        private Key key;

        @NameInMap("Topic")
        private Topic topic;

        @NameInMap("Value")
        private Value value;

        private SinkKafkaParameters(Builder builder) {
            this.acks = builder.acks;
            this.instanceId = builder.instanceId;
            this.key = builder.key;
            this.topic = builder.topic;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return acks
         */
        public Acks getAcks() {
            return this.acks;
        }

        /**
         * @return instanceId
         */
        public InstanceId getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return key
         */
        public Key getKey() {
            return this.key;
        }

        /**
         * @return topic
         */
        public Topic getTopic() {
            return this.topic;
        }

        /**
         * @return value
         */
        public Value getValue() {
            return this.value;
        }

        public static final class Builder {
            private Acks acks; 
            private InstanceId instanceId; 
            private Key key; 
            private Topic topic; 
            private Value value; 

            /**
             * The information about the acknowledgment (ACK) mode. If you set this parameter to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high. If you set this parameter to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader. If you set this parameter to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.
             */
            public Builder acks(Acks acks) {
                this.acks = acks;
                return this;
            }

            /**
             * The information about the Message Queue for Apache Kafka instance.
             */
            public Builder instanceId(InstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The information about the message key.
             */
            public Builder key(Key key) {
                this.key = key;
                return this;
            }

            /**
             * The information about the topic in Message Queue for Apache Kafka instance.
             */
            public Builder topic(Topic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The information about the message value.
             */
            public Builder value(Value value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParameters build() {
                return new SinkKafkaParameters(this);
            } 

        } 

    }
    public static class SinkMNSParametersBody extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkMNSParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkMNSParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkMNSParametersBody build() {
                return new SinkMNSParametersBody(this);
            } 

        } 

    }
    public static class IsBase64Encode extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private IsBase64Encode(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IsBase64Encode create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Specifies that Base64 encoding is enabled.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public IsBase64Encode build() {
                return new IsBase64Encode(this);
            } 

        } 

    }
    public static class QueueName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private QueueName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueueName build() {
                return new QueueName(this);
            } 

        } 

    }
    public static class SinkMNSParameters extends TeaModel {
        @NameInMap("Body")
        private SinkMNSParametersBody body;

        @NameInMap("IsBase64Encode")
        private IsBase64Encode isBase64Encode;

        @NameInMap("QueueName")
        private QueueName queueName;

        private SinkMNSParameters(Builder builder) {
            this.body = builder.body;
            this.isBase64Encode = builder.isBase64Encode;
            this.queueName = builder.queueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkMNSParameters create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public SinkMNSParametersBody getBody() {
            return this.body;
        }

        /**
         * @return isBase64Encode
         */
        public IsBase64Encode getIsBase64Encode() {
            return this.isBase64Encode;
        }

        /**
         * @return queueName
         */
        public QueueName getQueueName() {
            return this.queueName;
        }

        public static final class Builder {
            private SinkMNSParametersBody body; 
            private IsBase64Encode isBase64Encode; 
            private QueueName queueName; 

            /**
             * The message content.
             */
            public Builder body(SinkMNSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * Specifies whether to enable Base64 encoding.
             */
            public Builder isBase64Encode(IsBase64Encode isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * The information about the MNS queue.
             */
            public Builder queueName(QueueName queueName) {
                this.queueName = queueName;
                return this;
            }

            public SinkMNSParameters build() {
                return new SinkMNSParameters(this);
            } 

        } 

    }
    public static class AuthorizationType extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private AuthorizationType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationType create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AuthorizationType build() {
                return new AuthorizationType(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class NetworkType extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private NetworkType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkType create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NetworkType build() {
                return new NetworkType(this);
            } 

        } 

    }
    public static class Password extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Password(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Password create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Password build() {
                return new Password(this);
            } 

        } 

    }
    public static class SecurityGroupId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SecurityGroupId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SecurityGroupId build() {
                return new SecurityGroupId(this);
            } 

        } 

    }
    public static class URL extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private URL(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static URL create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public URL build() {
                return new URL(this);
            } 

        } 

    }
    public static class Username extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Username(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Username create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Username build() {
                return new Username(this);
            } 

        } 

    }
    public static class VSwitchId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private VSwitchId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VSwitchId build() {
                return new VSwitchId(this);
            } 

        } 

    }
    public static class VpcId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private VpcId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in MNS.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VpcId build() {
                return new VpcId(this);
            } 

        } 

    }
    public static class SinkPrometheusParameters extends TeaModel {
        @NameInMap("AuthorizationType")
        private AuthorizationType authorizationType;

        @NameInMap("Data")
        private Data data;

        @NameInMap("NetworkType")
        private NetworkType networkType;

        @NameInMap("Password")
        private Password password;

        @NameInMap("SecurityGroupId")
        private SecurityGroupId securityGroupId;

        @NameInMap("URL")
        private URL URL;

        @NameInMap("Username")
        private Username username;

        @NameInMap("VSwitchId")
        private VSwitchId vSwitchId;

        @NameInMap("VpcId")
        private VpcId vpcId;

        private SinkPrometheusParameters(Builder builder) {
            this.authorizationType = builder.authorizationType;
            this.data = builder.data;
            this.networkType = builder.networkType;
            this.password = builder.password;
            this.securityGroupId = builder.securityGroupId;
            this.URL = builder.URL;
            this.username = builder.username;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkPrometheusParameters create() {
            return builder().build();
        }

        /**
         * @return authorizationType
         */
        public AuthorizationType getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return networkType
         */
        public NetworkType getNetworkType() {
            return this.networkType;
        }

        /**
         * @return password
         */
        public Password getPassword() {
            return this.password;
        }

        /**
         * @return securityGroupId
         */
        public SecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return URL
         */
        public URL getURL() {
            return this.URL;
        }

        /**
         * @return username
         */
        public Username getUsername() {
            return this.username;
        }

        /**
         * @return vSwitchId
         */
        public VSwitchId getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public VpcId getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private AuthorizationType authorizationType; 
            private Data data; 
            private NetworkType networkType; 
            private Password password; 
            private SecurityGroupId securityGroupId; 
            private URL URL; 
            private Username username; 
            private VSwitchId vSwitchId; 
            private VpcId vpcId; 

            /**
             * AuthorizationType.
             */
            public Builder authorizationType(AuthorizationType authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(NetworkType networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(Password password) {
                this.password = password;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(SecurityGroupId securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * URL.
             */
            public Builder URL(URL URL) {
                this.URL = URL;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(Username username) {
                this.username = username;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(VSwitchId vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(VpcId vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkPrometheusParameters build() {
                return new SinkPrometheusParameters(this);
            } 

        } 

    }
    public static class SinkRabbitMQParametersBody extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersBody build() {
                return new SinkRabbitMQParametersBody(this);
            } 

        } 

    }
    public static class Exchange extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Exchange(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exchange create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the exchange in the Message Queue for RabbitMQ instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Exchange build() {
                return new Exchange(this);
            } 

        } 

    }
    public static class SinkRabbitMQParametersInstanceId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersInstanceId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersInstanceId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The ID of the Message Queue for RabbitMQ instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersInstanceId build() {
                return new SinkRabbitMQParametersInstanceId(this);
            } 

        } 

    }
    public static class MessageId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private MessageId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MessageId build() {
                return new MessageId(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class SinkRabbitMQParametersQueueName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersQueueName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersQueueName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue in the Message Queue for RabbitMQ instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersQueueName build() {
                return new SinkRabbitMQParametersQueueName(this);
            } 

        } 

    }
    public static class RoutingKey extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private RoutingKey(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutingKey create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The routing rule of the message.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RoutingKey build() {
                return new RoutingKey(this);
            } 

        } 

    }
    public static class TargetType extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private TargetType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetType create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The type of the resource to which events are delivered. Valid values: Exchange: exchanges. Queue: queues.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TargetType build() {
                return new TargetType(this);
            } 

        } 

    }
    public static class VirtualHostName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private VirtualHostName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualHostName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The vhost name of the Message Queue for RabbitMQ instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VirtualHostName build() {
                return new VirtualHostName(this);
            } 

        } 

    }
    public static class SinkRabbitMQParameters extends TeaModel {
        @NameInMap("Body")
        private SinkRabbitMQParametersBody body;

        @NameInMap("Exchange")
        private Exchange exchange;

        @NameInMap("InstanceId")
        private SinkRabbitMQParametersInstanceId instanceId;

        @NameInMap("MessageId")
        private MessageId messageId;

        @NameInMap("Properties")
        private Properties properties;

        @NameInMap("QueueName")
        private SinkRabbitMQParametersQueueName queueName;

        @NameInMap("RoutingKey")
        private RoutingKey routingKey;

        @NameInMap("TargetType")
        private TargetType targetType;

        @NameInMap("VirtualHostName")
        private VirtualHostName virtualHostName;

        private SinkRabbitMQParameters(Builder builder) {
            this.body = builder.body;
            this.exchange = builder.exchange;
            this.instanceId = builder.instanceId;
            this.messageId = builder.messageId;
            this.properties = builder.properties;
            this.queueName = builder.queueName;
            this.routingKey = builder.routingKey;
            this.targetType = builder.targetType;
            this.virtualHostName = builder.virtualHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParameters create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public SinkRabbitMQParametersBody getBody() {
            return this.body;
        }

        /**
         * @return exchange
         */
        public Exchange getExchange() {
            return this.exchange;
        }

        /**
         * @return instanceId
         */
        public SinkRabbitMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return messageId
         */
        public MessageId getMessageId() {
            return this.messageId;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return queueName
         */
        public SinkRabbitMQParametersQueueName getQueueName() {
            return this.queueName;
        }

        /**
         * @return routingKey
         */
        public RoutingKey getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return targetType
         */
        public TargetType getTargetType() {
            return this.targetType;
        }

        /**
         * @return virtualHostName
         */
        public VirtualHostName getVirtualHostName() {
            return this.virtualHostName;
        }

        public static final class Builder {
            private SinkRabbitMQParametersBody body; 
            private Exchange exchange; 
            private SinkRabbitMQParametersInstanceId instanceId; 
            private MessageId messageId; 
            private Properties properties; 
            private SinkRabbitMQParametersQueueName queueName; 
            private RoutingKey routingKey; 
            private TargetType targetType; 
            private VirtualHostName virtualHostName; 

            /**
             * The message content.
             */
            public Builder body(SinkRabbitMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The information about the exchange to which events are delivered. This parameter is available only if you set TargetType to Exchange.
             */
            public Builder exchange(Exchange exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * The information about the Message Queue for RabbitMQ instance.
             */
            public Builder instanceId(SinkRabbitMQParametersInstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The message ID.
             */
            public Builder messageId(MessageId messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * The properties that are used to filter messages.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The information about the queue to which events are delivered. This parameter is available only if you set TargetType to Queue.
             */
            public Builder queueName(SinkRabbitMQParametersQueueName queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The information about the routing rule of the message. This parameter is available only if you set TargetType to Exchange.
             */
            public Builder routingKey(RoutingKey routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * The information about the type of the resource to which events are delivered.
             */
            public Builder targetType(TargetType targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The information about the vhost of the Message Queue for RabbitMQ instance.
             */
            public Builder virtualHostName(VirtualHostName virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            public SinkRabbitMQParameters build() {
                return new SinkRabbitMQParameters(this);
            } 

        } 

    }
    public static class SinkRocketMQParametersBody extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRocketMQParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersBody build() {
                return new SinkRocketMQParametersBody(this);
            } 

        } 

    }
    public static class SinkRocketMQParametersInstanceId extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRocketMQParametersInstanceId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersInstanceId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache RocketMQ instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersInstanceId build() {
                return new SinkRocketMQParametersInstanceId(this);
            } 

        } 

    }
    public static class Keys extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Keys(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
    public static class SinkRocketMQParametersProperties extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRocketMQParametersProperties(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersProperties create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersProperties build() {
                return new SinkRocketMQParametersProperties(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SinkRocketMQParametersTopic extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkRocketMQParametersTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersTopic create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the topic in the Message Queue for Apache RocketMQ instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersTopic build() {
                return new SinkRocketMQParametersTopic(this);
            } 

        } 

    }
    public static class SinkRocketMQParameters extends TeaModel {
        @NameInMap("Body")
        private SinkRocketMQParametersBody body;

        @NameInMap("InstanceId")
        private SinkRocketMQParametersInstanceId instanceId;

        @NameInMap("Keys")
        private Keys keys;

        @NameInMap("Properties")
        private SinkRocketMQParametersProperties properties;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Topic")
        private SinkRocketMQParametersTopic topic;

        private SinkRocketMQParameters(Builder builder) {
            this.body = builder.body;
            this.instanceId = builder.instanceId;
            this.keys = builder.keys;
            this.properties = builder.properties;
            this.tags = builder.tags;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParameters create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public SinkRocketMQParametersBody getBody() {
            return this.body;
        }

        /**
         * @return instanceId
         */
        public SinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return keys
         */
        public Keys getKeys() {
            return this.keys;
        }

        /**
         * @return properties
         */
        public SinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return topic
         */
        public SinkRocketMQParametersTopic getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private SinkRocketMQParametersBody body; 
            private SinkRocketMQParametersInstanceId instanceId; 
            private Keys keys; 
            private SinkRocketMQParametersProperties properties; 
            private Tags tags; 
            private SinkRocketMQParametersTopic topic; 

            /**
             * The message content.
             */
            public Builder body(SinkRocketMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The parameters that are configured if the event target is Message Queue for Apache RocketMQ.
             */
            public Builder instanceId(SinkRocketMQParametersInstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The properties that are used to filter messages.
             */
            public Builder keys(Keys keys) {
                this.keys = keys;
                return this;
            }

            /**
             * The properties that are used to filter messages.
             */
            public Builder properties(SinkRocketMQParametersProperties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The properties that are used to filter messages.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The information about the topic in the Message Queue for Apache RocketMQ instance.
             */
            public Builder topic(SinkRocketMQParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            public SinkRocketMQParameters build() {
                return new SinkRocketMQParameters(this);
            } 

        } 

    }
    public static class SinkSLSParametersBody extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkSLSParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkSLSParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The template based on which events are transformed.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value before event transformation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkSLSParametersBody build() {
                return new SinkSLSParametersBody(this);
            } 

        } 

    }
    public static class LogStore extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private LogStore(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogStore create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The Log Service Logstore.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LogStore build() {
                return new LogStore(this);
            } 

        } 

    }
    public static class Project extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private Project(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The Log Service project.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    public static class SinkSLSParametersRoleName extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkSLSParametersRoleName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkSLSParametersRoleName create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkSLSParametersRoleName build() {
                return new SinkSLSParametersRoleName(this);
            } 

        } 

    }
    public static class SinkSLSParametersTopic extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private SinkSLSParametersTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkSLSParametersTopic create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Log Service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkSLSParametersTopic build() {
                return new SinkSLSParametersTopic(this);
            } 

        } 

    }
    public static class SinkSLSParameters extends TeaModel {
        @NameInMap("Body")
        private SinkSLSParametersBody body;

        @NameInMap("LogStore")
        private LogStore logStore;

        @NameInMap("Project")
        private Project project;

        @NameInMap("RoleName")
        private SinkSLSParametersRoleName roleName;

        @NameInMap("Topic")
        private SinkSLSParametersTopic topic;

        private SinkSLSParameters(Builder builder) {
            this.body = builder.body;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.roleName = builder.roleName;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkSLSParameters create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public SinkSLSParametersBody getBody() {
            return this.body;
        }

        /**
         * @return logStore
         */
        public LogStore getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public Project getProject() {
            return this.project;
        }

        /**
         * @return roleName
         */
        public SinkSLSParametersRoleName getRoleName() {
            return this.roleName;
        }

        /**
         * @return topic
         */
        public SinkSLSParametersTopic getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private SinkSLSParametersBody body; 
            private LogStore logStore; 
            private Project project; 
            private SinkSLSParametersRoleName roleName; 
            private SinkSLSParametersTopic topic; 

            /**
             * The message body that is sent to Log Service.
             */
            public Builder body(SinkSLSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The information about the Log Service Logstore.
             */
            public Builder logStore(LogStore logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The information about the Log Service project.
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * The information about the role. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.
             */
            public Builder roleName(SinkSLSParametersRoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The information about the topic in which logs are stored. The topic corresponds to the topic reserved field in Log Service.
             */
            public Builder topic(SinkSLSParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            public SinkSLSParameters build() {
                return new SinkSLSParameters(this);
            } 

        } 

    }
    public static class Sink extends TeaModel {
        @NameInMap("SinkFcParameters")
        private SinkFcParameters sinkFcParameters;

        @NameInMap("SinkFnfParameters")
        private SinkFnfParameters sinkFnfParameters;

        @NameInMap("SinkKafkaParameters")
        private SinkKafkaParameters sinkKafkaParameters;

        @NameInMap("SinkMNSParameters")
        private SinkMNSParameters sinkMNSParameters;

        @NameInMap("SinkPrometheusParameters")
        private SinkPrometheusParameters sinkPrometheusParameters;

        @NameInMap("SinkRabbitMQParameters")
        private SinkRabbitMQParameters sinkRabbitMQParameters;

        @NameInMap("SinkRocketMQParameters")
        private SinkRocketMQParameters sinkRocketMQParameters;

        @NameInMap("SinkSLSParameters")
        private SinkSLSParameters sinkSLSParameters;

        private Sink(Builder builder) {
            this.sinkFcParameters = builder.sinkFcParameters;
            this.sinkFnfParameters = builder.sinkFnfParameters;
            this.sinkKafkaParameters = builder.sinkKafkaParameters;
            this.sinkMNSParameters = builder.sinkMNSParameters;
            this.sinkPrometheusParameters = builder.sinkPrometheusParameters;
            this.sinkRabbitMQParameters = builder.sinkRabbitMQParameters;
            this.sinkRocketMQParameters = builder.sinkRocketMQParameters;
            this.sinkSLSParameters = builder.sinkSLSParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sink create() {
            return builder().build();
        }

        /**
         * @return sinkFcParameters
         */
        public SinkFcParameters getSinkFcParameters() {
            return this.sinkFcParameters;
        }

        /**
         * @return sinkFnfParameters
         */
        public SinkFnfParameters getSinkFnfParameters() {
            return this.sinkFnfParameters;
        }

        /**
         * @return sinkKafkaParameters
         */
        public SinkKafkaParameters getSinkKafkaParameters() {
            return this.sinkKafkaParameters;
        }

        /**
         * @return sinkMNSParameters
         */
        public SinkMNSParameters getSinkMNSParameters() {
            return this.sinkMNSParameters;
        }

        /**
         * @return sinkPrometheusParameters
         */
        public SinkPrometheusParameters getSinkPrometheusParameters() {
            return this.sinkPrometheusParameters;
        }

        /**
         * @return sinkRabbitMQParameters
         */
        public SinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        /**
         * @return sinkRocketMQParameters
         */
        public SinkRocketMQParameters getSinkRocketMQParameters() {
            return this.sinkRocketMQParameters;
        }

        /**
         * @return sinkSLSParameters
         */
        public SinkSLSParameters getSinkSLSParameters() {
            return this.sinkSLSParameters;
        }

        public static final class Builder {
            private SinkFcParameters sinkFcParameters; 
            private SinkFnfParameters sinkFnfParameters; 
            private SinkKafkaParameters sinkKafkaParameters; 
            private SinkMNSParameters sinkMNSParameters; 
            private SinkPrometheusParameters sinkPrometheusParameters; 
            private SinkRabbitMQParameters sinkRabbitMQParameters; 
            private SinkRocketMQParameters sinkRocketMQParameters; 
            private SinkSLSParameters sinkSLSParameters; 

            /**
             * The parameters that are configured if the event target is Function Compute.
             */
            public Builder sinkFcParameters(SinkFcParameters sinkFcParameters) {
                this.sinkFcParameters = sinkFcParameters;
                return this;
            }

            /**
             * SinkFnfParameters.
             */
            public Builder sinkFnfParameters(SinkFnfParameters sinkFnfParameters) {
                this.sinkFnfParameters = sinkFnfParameters;
                return this;
            }

            /**
             * The parameters that are configured if the event target is Message Queue for Apache Kafka.
             */
            public Builder sinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
                this.sinkKafkaParameters = sinkKafkaParameters;
                return this;
            }

            /**
             * The parameters that are configured if the event target is MNS.
             */
            public Builder sinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
                this.sinkMNSParameters = sinkMNSParameters;
                return this;
            }

            /**
             * SinkPrometheusParameters.
             */
            public Builder sinkPrometheusParameters(SinkPrometheusParameters sinkPrometheusParameters) {
                this.sinkPrometheusParameters = sinkPrometheusParameters;
                return this;
            }

            /**
             * The parameters that are configured if the event target is Message Queue for RabbitMQ.
             */
            public Builder sinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
                this.sinkRabbitMQParameters = sinkRabbitMQParameters;
                return this;
            }

            /**
             * Sink RocketMQ Parameters
             */
            public Builder sinkRocketMQParameters(SinkRocketMQParameters sinkRocketMQParameters) {
                this.sinkRocketMQParameters = sinkRocketMQParameters;
                return this;
            }

            /**
             * Sink SLS Parameters
             */
            public Builder sinkSLSParameters(SinkSLSParameters sinkSLSParameters) {
                this.sinkSLSParameters = sinkSLSParameters;
                return this;
            }

            public Sink build() {
                return new Sink(this);
            } 

        } 

    }
    public static class SourceDTSParameters extends TeaModel {
        @NameInMap("BrokerUrl")
        private String brokerUrl;

        @NameInMap("InitCheckPoint")
        private Long initCheckPoint;

        @NameInMap("Password")
        private String password;

        @NameInMap("Sid")
        private String sid;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("Username")
        private String username;

        private SourceDTSParameters(Builder builder) {
            this.brokerUrl = builder.brokerUrl;
            this.initCheckPoint = builder.initCheckPoint;
            this.password = builder.password;
            this.sid = builder.sid;
            this.taskId = builder.taskId;
            this.topic = builder.topic;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDTSParameters create() {
            return builder().build();
        }

        /**
         * @return brokerUrl
         */
        public String getBrokerUrl() {
            return this.brokerUrl;
        }

        /**
         * @return initCheckPoint
         */
        public Long getInitCheckPoint() {
            return this.initCheckPoint;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String brokerUrl; 
            private Long initCheckPoint; 
            private String password; 
            private String sid; 
            private String taskId; 
            private String topic; 
            private String username; 

            /**
             * The URL and port number of the change tracking instance.
             */
            public Builder brokerUrl(String brokerUrl) {
                this.brokerUrl = brokerUrl;
                return this;
            }

            /**
             * The UNIX timestamp that is generated when the SDK client consumes the first data record.
             */
            public Builder initCheckPoint(Long initCheckPoint) {
                this.initCheckPoint = initCheckPoint;
                return this;
            }

            /**
             * The consumer group password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The consumer group ID.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the tracked topic of the change tracking instance.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The consumer group username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public SourceDTSParameters build() {
                return new SourceDTSParameters(this);
            } 

        } 

    }
    public static class SourceKafkaParameters extends TeaModel {
        @NameInMap("ConsumerGroup")
        private String consumerGroup;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Network")
        private String network;

        @NameInMap("OffsetReset")
        private String offsetReset;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("VSwitchIds")
        private String vSwitchIds;

        @NameInMap("ValueDataType")
        private String valueDataType;

        @NameInMap("VpcId")
        private String vpcId;

        private SourceKafkaParameters(Builder builder) {
            this.consumerGroup = builder.consumerGroup;
            this.instanceId = builder.instanceId;
            this.network = builder.network;
            this.offsetReset = builder.offsetReset;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.valueDataType = builder.valueDataType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return consumerGroup
         */
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return offsetReset
         */
        public String getOffsetReset() {
            return this.offsetReset;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return valueDataType
         */
        public String getValueDataType() {
            return this.valueDataType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String consumerGroup; 
            private String instanceId; 
            private String network; 
            private String offsetReset; 
            private String regionId; 
            private String securityGroupId; 
            private String topic; 
            private String vSwitchIds; 
            private String valueDataType; 
            private String vpcId; 

            /**
             * The group ID of the consumer that subscribes to the topic.
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache Kafka instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The network setting. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * The offset.
             */
            public Builder offsetReset(String offsetReset) {
                this.offsetReset = offsetReset;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for Apache Kafka instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The topic name.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * ValueDataType.
             */
            public Builder valueDataType(String valueDataType) {
                this.valueDataType = valueDataType;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceKafkaParameters build() {
                return new SourceKafkaParameters(this);
            } 

        } 

    }
    public static class SourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        private Boolean isBase64Decode;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("RegionId")
        private String regionId;

        private SourceMNSParameters(Builder builder) {
            this.isBase64Decode = builder.isBase64Decode;
            this.queueName = builder.queueName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMNSParameters create() {
            return builder().build();
        }

        /**
         * @return isBase64Decode
         */
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Boolean isBase64Decode; 
            private String queueName; 
            private String regionId; 

            /**
             * Specifies whether to enable Base64 encoding. Default value: true.
             */
            public Builder isBase64Decode(Boolean isBase64Decode) {
                this.isBase64Decode = isBase64Decode;
                return this;
            }

            /**
             * The name of the MNS queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The ID of the region where the MNS queue resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SourceMNSParameters build() {
                return new SourceMNSParameters(this);
            } 

        } 

    }
    public static class SourceMQTTParameters extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Topic")
        private String topic;

        private SourceMQTTParameters(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMQTTParameters create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 
            private String topic; 

            /**
             * The ID of the Message Queue for MQTT instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for MQTT instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The topic name.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public SourceMQTTParameters build() {
                return new SourceMQTTParameters(this);
            } 

        } 

    }
    public static class SourcePrometheusParameters extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Labels")
        private String labels;

        private SourcePrometheusParameters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dataType = builder.dataType;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourcePrometheusParameters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String clusterId; 
            private String dataType; 
            private String labels; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            public SourcePrometheusParameters build() {
                return new SourcePrometheusParameters(this);
            } 

        } 

    }
    public static class SourceRabbitMQParameters extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VirtualHostName")
        private String virtualHostName;

        private SourceRabbitMQParameters(Builder builder) {
            this.instanceId = builder.instanceId;
            this.queueName = builder.queueName;
            this.regionId = builder.regionId;
            this.virtualHostName = builder.virtualHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRabbitMQParameters create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return virtualHostName
         */
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public static final class Builder {
            private String instanceId; 
            private String queueName; 
            private String regionId; 
            private String virtualHostName; 

            /**
             * The ID of the Message Queue for RabbitMQ instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the queue on the Message Queue for RabbitMQ instance.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for RabbitMQ instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the vhost of the Message Queue for RabbitMQ instance.
             */
            public Builder virtualHostName(String virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            public SourceRabbitMQParameters build() {
                return new SourceRabbitMQParameters(this);
            } 

        } 

    }
    public static class SourceRocketMQParameters extends TeaModel {
        @NameInMap("AuthType")
        private String authType;

        @NameInMap("GroupID")
        private String groupID;

        @NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceNetwork")
        private String instanceNetwork;

        @NameInMap("InstancePassword")
        private String instancePassword;

        @NameInMap("InstanceSecurityGroupId")
        private String instanceSecurityGroupId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceUsername")
        private String instanceUsername;

        @NameInMap("InstanceVSwitchIds")
        private String instanceVSwitchIds;

        @NameInMap("InstanceVpcId")
        private String instanceVpcId;

        @NameInMap("Offset")
        private String offset;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Topic")
        private String topic;

        private SourceRocketMQParameters(Builder builder) {
            this.authType = builder.authType;
            this.groupID = builder.groupID;
            this.instanceEndpoint = builder.instanceEndpoint;
            this.instanceId = builder.instanceId;
            this.instanceNetwork = builder.instanceNetwork;
            this.instancePassword = builder.instancePassword;
            this.instanceSecurityGroupId = builder.instanceSecurityGroupId;
            this.instanceType = builder.instanceType;
            this.instanceUsername = builder.instanceUsername;
            this.instanceVSwitchIds = builder.instanceVSwitchIds;
            this.instanceVpcId = builder.instanceVpcId;
            this.offset = builder.offset;
            this.regionId = builder.regionId;
            this.tag = builder.tag;
            this.timestamp = builder.timestamp;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRocketMQParameters create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return groupID
         */
        public String getGroupID() {
            return this.groupID;
        }

        /**
         * @return instanceEndpoint
         */
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceNetwork
         */
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        /**
         * @return instancePassword
         */
        public String getInstancePassword() {
            return this.instancePassword;
        }

        /**
         * @return instanceSecurityGroupId
         */
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceUsername
         */
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        /**
         * @return instanceVSwitchIds
         */
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        /**
         * @return instanceVpcId
         */
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        /**
         * @return offset
         */
        public String getOffset() {
            return this.offset;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String authType; 
            private String groupID; 
            private String instanceEndpoint; 
            private String instanceId; 
            private String instanceNetwork; 
            private String instancePassword; 
            private String instanceSecurityGroupId; 
            private String instanceType; 
            private String instanceUsername; 
            private String instanceVSwitchIds; 
            private String instanceVpcId; 
            private String offset; 
            private String regionId; 
            private String tag; 
            private Long timestamp; 
            private String topic; 

            /**
             * The authentication method.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * The ID of the consumer group on the Message Queue for Apache RocketMQ instance.
             */
            public Builder groupID(String groupID) {
                this.groupID = groupID;
                return this;
            }

            /**
             * The instance endpoint.
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache RocketMQ instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * PublicNetwork and PrivateNetwork.
             */
            public Builder instanceNetwork(String instanceNetwork) {
                this.instanceNetwork = instanceNetwork;
                return this;
            }

            /**
             * The instance password.
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * The security group ID of the instance.
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance username.
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * The vSwitch ID of the instance.
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * The VPC ID of the instance.
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * The offset from which messages are consumed. Valid values:
             * <p>
             * 
             * *   CONSUMEFROMLASTOFFSET: Messages are consumed from the latest offset.
             * *   CONSUMEFROMFIRSTOFFSET: Messages are consumed from the earliest offset.
             * *   CONSUMEFROMTIMESTAMP: Messages are consumed from the offset at the specified point in time.
             * 
             * Default value: CONSUMEFROMLASTOFFSET.
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for Apache RocketMQ instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The tag that you want to use to filter messages.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUMEFROMTIMESTAMP.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The topic name.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public SourceRocketMQParameters build() {
                return new SourceRocketMQParameters(this);
            } 

        } 

    }
    public static class SourceSLSParameters extends TeaModel {
        @NameInMap("RoleName")
        private String roleName;

        private SourceSLSParameters(Builder builder) {
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceSLSParameters create() {
            return builder().build();
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String roleName; 

            /**
             * The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public SourceSLSParameters build() {
                return new SourceSLSParameters(this);
            } 

        } 

    }
    public static class Source extends TeaModel {
        @NameInMap("SourceDTSParameters")
        private SourceDTSParameters sourceDTSParameters;

        @NameInMap("SourceKafkaParameters")
        private SourceKafkaParameters sourceKafkaParameters;

        @NameInMap("SourceMNSParameters")
        private SourceMNSParameters sourceMNSParameters;

        @NameInMap("SourceMQTTParameters")
        private SourceMQTTParameters sourceMQTTParameters;

        @NameInMap("SourcePrometheusParameters")
        private SourcePrometheusParameters sourcePrometheusParameters;

        @NameInMap("SourceRabbitMQParameters")
        private SourceRabbitMQParameters sourceRabbitMQParameters;

        @NameInMap("SourceRocketMQParameters")
        private SourceRocketMQParameters sourceRocketMQParameters;

        @NameInMap("SourceSLSParameters")
        private SourceSLSParameters sourceSLSParameters;

        private Source(Builder builder) {
            this.sourceDTSParameters = builder.sourceDTSParameters;
            this.sourceKafkaParameters = builder.sourceKafkaParameters;
            this.sourceMNSParameters = builder.sourceMNSParameters;
            this.sourceMQTTParameters = builder.sourceMQTTParameters;
            this.sourcePrometheusParameters = builder.sourcePrometheusParameters;
            this.sourceRabbitMQParameters = builder.sourceRabbitMQParameters;
            this.sourceRocketMQParameters = builder.sourceRocketMQParameters;
            this.sourceSLSParameters = builder.sourceSLSParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return sourceDTSParameters
         */
        public SourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
        }

        /**
         * @return sourceKafkaParameters
         */
        public SourceKafkaParameters getSourceKafkaParameters() {
            return this.sourceKafkaParameters;
        }

        /**
         * @return sourceMNSParameters
         */
        public SourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        /**
         * @return sourceMQTTParameters
         */
        public SourceMQTTParameters getSourceMQTTParameters() {
            return this.sourceMQTTParameters;
        }

        /**
         * @return sourcePrometheusParameters
         */
        public SourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        /**
         * @return sourceRabbitMQParameters
         */
        public SourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        /**
         * @return sourceRocketMQParameters
         */
        public SourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        /**
         * @return sourceSLSParameters
         */
        public SourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

        public static final class Builder {
            private SourceDTSParameters sourceDTSParameters; 
            private SourceKafkaParameters sourceKafkaParameters; 
            private SourceMNSParameters sourceMNSParameters; 
            private SourceMQTTParameters sourceMQTTParameters; 
            private SourcePrometheusParameters sourcePrometheusParameters; 
            private SourceRabbitMQParameters sourceRabbitMQParameters; 
            private SourceRocketMQParameters sourceRocketMQParameters; 
            private SourceSLSParameters sourceSLSParameters; 

            /**
             * The parameters that are configured if you specify Data Transmission Service (DTS) as the event source.
             */
            public Builder sourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
                this.sourceDTSParameters = sourceDTSParameters;
                return this;
            }

            /**
             * The parameters that are configured if you specify Message Queue for Apache Kafka as the event source.
             */
            public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
                this.sourceKafkaParameters = sourceKafkaParameters;
                return this;
            }

            /**
             * The parameters that are configured if you specify Message Service (MNS) as the event source.
             */
            public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
                this.sourceMNSParameters = sourceMNSParameters;
                return this;
            }

            /**
             * The parameters that are configured if you specify Message Queue for MQTT as the event source.
             */
            public Builder sourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
                this.sourceMQTTParameters = sourceMQTTParameters;
                return this;
            }

            /**
             * SourcePrometheusParameters.
             */
            public Builder sourcePrometheusParameters(SourcePrometheusParameters sourcePrometheusParameters) {
                this.sourcePrometheusParameters = sourcePrometheusParameters;
                return this;
            }

            /**
             * The parameters that are configured if you specify Message Queue for RabbitMQ as the event source.
             */
            public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
                this.sourceRabbitMQParameters = sourceRabbitMQParameters;
                return this;
            }

            /**
             * The parameters that are configured if you specify Message Queue for Apache RocketMQ as the event source.
             */
            public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
                this.sourceRocketMQParameters = sourceRocketMQParameters;
                return this;
            }

            /**
             * The parameters that are configured if you specify Log Service as the event source.
             */
            public Builder sourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
                this.sourceSLSParameters = sourceSLSParameters;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    public static class Transforms extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        private Transforms(Builder builder) {
            this.arn = builder.arn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transforms create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        public static final class Builder {
            private String arn; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            public Transforms build() {
                return new Transforms(this);
            } 

        } 

    }
}
