// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CreateEventStreamingRequest} extends {@link RequestModel}
 *
 * <p>CreateEventStreamingRequest</p>
 */
public class CreateEventStreamingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventStreamingName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 2)
    private String eventStreamingName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterPattern")
    private String filterPattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private String metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunOptions")
    private RunOptions runOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sink")
    private Sink sink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private Source source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Transforms")
    private java.util.List<Transforms> transforms;

    private CreateEventStreamingRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventStreamingName = builder.eventStreamingName;
        this.filterPattern = builder.filterPattern;
        this.metadata = builder.metadata;
        this.runOptions = builder.runOptions;
        this.sink = builder.sink;
        this.source = builder.source;
        this.tags = builder.tags;
        this.transforms = builder.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventStreamingRequest create() {
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
     * @return metadata
     */
    public String getMetadata() {
        return this.metadata;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return transforms
     */
    public java.util.List<Transforms> getTransforms() {
        return this.transforms;
    }

    public static final class Builder extends Request.Builder<CreateEventStreamingRequest, Builder> {
        private String description; 
        private String eventStreamingName; 
        private String filterPattern; 
        private String metadata; 
        private RunOptions runOptions; 
        private Sink sink; 
        private Source source; 
        private java.util.List<Tags> tags; 
        private java.util.List<Transforms> transforms; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventStreamingRequest request) {
            super(request);
            this.description = request.description;
            this.eventStreamingName = request.eventStreamingName;
            this.filterPattern = request.filterPattern;
            this.metadata = request.metadata;
            this.runOptions = request.runOptions;
            this.sink = request.sink;
            this.source = request.source;
            this.tags = request.tags;
            this.transforms = request.transforms;
        } 

        /**
         * <p>The description of the event stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rocketmq2mns</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the event stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myeventstreaming</p>
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        /**
         * <p>The event filtering rule. If you do not specify this parameter, all events are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;source&quot;: [
         * {
         * &quot;prefix&quot;: &quot;acs:mns&quot;
         * }
         * ],
         * &quot;type&quot;: [
         * {
         * &quot;prefix&quot;: &quot;mns:Queue&quot;
         * }
         * ],
         * &quot;subject&quot;: [
         * {
         * &quot;prefix&quot;: &quot;acs:mns:cn-hangzhou:123456789098****:queues/zeus&quot;
         * }
         * ]
         * }</p>
         */
        public Builder filterPattern(String filterPattern) {
            this.putBodyParameter("FilterPattern", filterPattern);
            this.filterPattern = filterPattern;
            return this;
        }

        /**
         * <p>The generic JSON Configurations for the event source. This parameter is mutually exclusive with Source.</p>
         */
        public Builder metadata(String metadata) {
            this.putBodyParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The runtime environment parameters.</p>
         */
        public Builder runOptions(RunOptions runOptions) {
            String runOptionsShrink = shrink(runOptions, "RunOptions", "json");
            this.putBodyParameter("RunOptions", runOptionsShrink);
            this.runOptions = runOptions;
            return this;
        }

        /**
         * <p>The event target. You must select one Sink type, and you can select only one Sink type.</p>
         */
        public Builder sink(Sink sink) {
            String sinkShrink = shrink(sink, "Sink", "json");
            this.putBodyParameter("Sink", sinkShrink);
            this.sink = sink;
            return this;
        }

        /**
         * <p>The event provider. You must specify one source type, and you can specify only one source type.</p>
         */
        public Builder source(Source source) {
            String sourceShrink = shrink(source, "Source", "json");
            this.putBodyParameter("Source", sourceShrink);
            this.source = source;
            return this;
        }

        /**
         * <p>The tag list, containing up to 20 items.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The Transform-related configurations.</p>
         */
        public Builder transforms(java.util.List<Transforms> transforms) {
            String transformsShrink = shrink(transforms, "Transforms", "json");
            this.putBodyParameter("Transforms", transformsShrink);
            this.transforms = transforms;
            return this;
        }

        @Override
        public CreateEventStreamingRequest build() {
            return new CreateEventStreamingRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class BatchWindow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountBasedWindow")
        private Integer countBasedWindow;

        @com.aliyun.core.annotation.NameInMap("TimeBasedWindow")
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

            private Builder() {
            } 

            private Builder(BatchWindow model) {
                this.countBasedWindow = model.countBasedWindow;
                this.timeBasedWindow = model.timeBasedWindow;
            } 

            /**
             * <p>The maximum number of events that the window can contain. When this threshold is reached, the data in the window is pushed downstream. If multiple windows exist, data is pushed when any window meets the threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder countBasedWindow(Integer countBasedWindow) {
                this.countBasedWindow = countBasedWindow;
                return this;
            }

            /**
             * <p>The maximum time range (in seconds) of events that the window can contain. When this threshold is reached, the data in the window is pushed downstream. If multiple windows exist, data is pushed when any window meets the threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class BusinessOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessMode")
        private String businessMode;

        @com.aliyun.core.annotation.NameInMap("MaxCapacityUnitCount")
        private Long maxCapacityUnitCount;

        @com.aliyun.core.annotation.NameInMap("MinCapacityUnitCount")
        private Long minCapacityUnitCount;

        private BusinessOption(Builder builder) {
            this.businessMode = builder.businessMode;
            this.maxCapacityUnitCount = builder.maxCapacityUnitCount;
            this.minCapacityUnitCount = builder.minCapacityUnitCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessOption create() {
            return builder().build();
        }

        /**
         * @return businessMode
         */
        public String getBusinessMode() {
            return this.businessMode;
        }

        /**
         * @return maxCapacityUnitCount
         */
        public Long getMaxCapacityUnitCount() {
            return this.maxCapacityUnitCount;
        }

        /**
         * @return minCapacityUnitCount
         */
        public Long getMinCapacityUnitCount() {
            return this.minCapacityUnitCount;
        }

        public static final class Builder {
            private String businessMode; 
            private Long maxCapacityUnitCount; 
            private Long minCapacityUnitCount; 

            private Builder() {
            } 

            private Builder(BusinessOption model) {
                this.businessMode = model.businessMode;
                this.maxCapacityUnitCount = model.maxCapacityUnitCount;
                this.minCapacityUnitCount = model.minCapacityUnitCount;
            } 

            /**
             * BusinessMode.
             */
            public Builder businessMode(String businessMode) {
                this.businessMode = businessMode;
                return this;
            }

            /**
             * MaxCapacityUnitCount.
             */
            public Builder maxCapacityUnitCount(Long maxCapacityUnitCount) {
                this.maxCapacityUnitCount = maxCapacityUnitCount;
                return this;
            }

            /**
             * MinCapacityUnitCount.
             */
            public Builder minCapacityUnitCount(Long minCapacityUnitCount) {
                this.minCapacityUnitCount = minCapacityUnitCount;
                return this;
            }

            public BusinessOption build() {
                return new BusinessOption(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class DeadLetterQueue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private DeadLetterQueue(Builder builder) {
            this.arn = builder.arn;
            this.network = builder.network;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
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

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String arn; 
            private String network; 
            private String securityGroupId; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(DeadLetterQueue model) {
                this.arn = model.arn;
                this.network = model.network;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ARN of the dead-letter queue.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::131733464781****:role/rdstoecsassumekms</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public DeadLetterQueue build() {
                return new DeadLetterQueue(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class RetryStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaximumEventAgeInSeconds")
        private Long maximumEventAgeInSeconds;

        @com.aliyun.core.annotation.NameInMap("MaximumRetryAttempts")
        private Long maximumRetryAttempts;

        @com.aliyun.core.annotation.NameInMap("PushRetryStrategy")
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

            private Builder() {
            } 

            private Builder(RetryStrategy model) {
                this.maximumEventAgeInSeconds = model.maximumEventAgeInSeconds;
                this.maximumRetryAttempts = model.maximumRetryAttempts;
                this.pushRetryStrategy = model.pushRetryStrategy;
            } 

            /**
             * <p>The maximum retry time.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
                this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
                return this;
            }

            /**
             * <p>The maximum number of retry attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumRetryAttempts(Long maximumRetryAttempts) {
                this.maximumRetryAttempts = maximumRetryAttempts;
                return this;
            }

            /**
             * <p>The retry strategy:</p>
             * 
             * <strong>example:</strong>
             * <p>BACKOFF_RETRY</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class RunOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchWindow")
        private BatchWindow batchWindow;

        @com.aliyun.core.annotation.NameInMap("BusinessOption")
        private BusinessOption businessOption;

        @com.aliyun.core.annotation.NameInMap("DeadLetterQueue")
        private DeadLetterQueue deadLetterQueue;

        @com.aliyun.core.annotation.NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @com.aliyun.core.annotation.NameInMap("MaximumTasks")
        private Long maximumTasks;

        @com.aliyun.core.annotation.NameInMap("RetryStrategy")
        private RetryStrategy retryStrategy;

        @com.aliyun.core.annotation.NameInMap("Throttling")
        private Integer throttling;

        private RunOptions(Builder builder) {
            this.batchWindow = builder.batchWindow;
            this.businessOption = builder.businessOption;
            this.deadLetterQueue = builder.deadLetterQueue;
            this.errorsTolerance = builder.errorsTolerance;
            this.maximumTasks = builder.maximumTasks;
            this.retryStrategy = builder.retryStrategy;
            this.throttling = builder.throttling;
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
         * @return businessOption
         */
        public BusinessOption getBusinessOption() {
            return this.businessOption;
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

        /**
         * @return throttling
         */
        public Integer getThrottling() {
            return this.throttling;
        }

        public static final class Builder {
            private BatchWindow batchWindow; 
            private BusinessOption businessOption; 
            private DeadLetterQueue deadLetterQueue; 
            private String errorsTolerance; 
            private Long maximumTasks; 
            private RetryStrategy retryStrategy; 
            private Integer throttling; 

            private Builder() {
            } 

            private Builder(RunOptions model) {
                this.batchWindow = model.batchWindow;
                this.businessOption = model.businessOption;
                this.deadLetterQueue = model.deadLetterQueue;
                this.errorsTolerance = model.errorsTolerance;
                this.maximumTasks = model.maximumTasks;
                this.retryStrategy = model.retryStrategy;
                this.throttling = model.throttling;
            } 

            /**
             * <p>The batch window.</p>
             */
            public Builder batchWindow(BatchWindow batchWindow) {
                this.batchWindow = batchWindow;
                return this;
            }

            /**
             * BusinessOption.
             */
            public Builder businessOption(BusinessOption businessOption) {
                this.businessOption = businessOption;
                return this;
            }

            /**
             * <p>Specifies whether to enable the dead-letter queue. The dead-letter queue is disabled by default. Messages that exceed the retry policy are discarded.</p>
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * <p>The error tolerance policy:</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * <p>The concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumTasks(Long maximumTasks) {
                this.maximumTasks = maximumTasks;
                return this;
            }

            /**
             * <p>The retry strategy when event pushing fails.</p>
             */
            public Builder retryStrategy(RetryStrategy retryStrategy) {
                this.retryStrategy = retryStrategy;
                return this;
            }

            /**
             * Throttling.
             */
            public Builder throttling(Integer throttling) {
                this.throttling = throttling;
                return this;
            }

            public RunOptions build() {
                return new RunOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class DynamicTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DynamicTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicTopic create() {
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

            private Builder() {
            } 

            private Builder(DynamicTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DynamicTopic build() {
                return new DynamicTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Headers(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
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

            private Builder() {
            } 

            private Builder(Headers model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Key extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Key model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class NetworkType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(NetworkType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SecurityGroupId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SecurityGroupId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SslKeystoreKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KmsArn")
        private String kmsArn;

        @com.aliyun.core.annotation.NameInMap("KmsSecretValueKey")
        private String kmsSecretValueKey;

        private SslKeystoreKey(Builder builder) {
            this.kmsArn = builder.kmsArn;
            this.kmsSecretValueKey = builder.kmsSecretValueKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslKeystoreKey create() {
            return builder().build();
        }

        /**
         * @return kmsArn
         */
        public String getKmsArn() {
            return this.kmsArn;
        }

        /**
         * @return kmsSecretValueKey
         */
        public String getKmsSecretValueKey() {
            return this.kmsSecretValueKey;
        }

        public static final class Builder {
            private String kmsArn; 
            private String kmsSecretValueKey; 

            private Builder() {
            } 

            private Builder(SslKeystoreKey model) {
                this.kmsArn = model.kmsArn;
                this.kmsSecretValueKey = model.kmsSecretValueKey;
            } 

            /**
             * <p>[Required] The KMS resource ARN that stores the SSL private key. Used to locate the Key Management Service instance that stores the client private key. Format example: \&quot;acs:kms:cn-hangzhou:123456789:secret/ssl-keystore-key-xxxx\&quot;. Obtain this value from the ARN information of the corresponding key in the KMS console.</p>
             */
            public Builder kmsArn(String kmsArn) {
                this.kmsArn = kmsArn;
                return this;
            }

            /**
             * <p>[KMS KV mode] The key name in the KMS credential. When the KMS credential is stored in key-value (KV) format, specify this parameter to indicate the key corresponding to the SSL private key. Example: if the KMS credential is \&quot;{&quot;ssl_keystore_key&quot;:&quot;-----BEGIN PRIVATE KEY-----...&quot;,&quot;ssl_truststore_key&quot;:&quot;...&quot;}\&quot;, enter \&quot;ssl_keystore_key\&quot;. Leave empty if the KMS credential is in plain text mode (directly storing the PEM content of the private key).</p>
             */
            public Builder kmsSecretValueKey(String kmsSecretValueKey) {
                this.kmsSecretValueKey = kmsSecretValueKey;
                return this;
            }

            public SslKeystoreKey build() {
                return new SslKeystoreKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private VSwitchIds(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
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

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Value model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class VpcId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(VpcId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkApacheKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acks")
        private String acks;

        @com.aliyun.core.annotation.NameInMap("Bootstraps")
        private String bootstraps;

        @com.aliyun.core.annotation.NameInMap("CompressionType")
        private String compressionType;

        @com.aliyun.core.annotation.NameInMap("DynamicTopic")
        private DynamicTopic dynamicTopic;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private Headers headers;

        @com.aliyun.core.annotation.NameInMap("Key")
        private Key key;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private NetworkType networkType;

        @com.aliyun.core.annotation.NameInMap("SaslMechanism")
        private String saslMechanism;

        @com.aliyun.core.annotation.NameInMap("SaslPassword")
        private String saslPassword;

        @com.aliyun.core.annotation.NameInMap("SaslUser")
        private String saslUser;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private SecurityGroupId securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityProtocol")
        private String securityProtocol;

        @com.aliyun.core.annotation.NameInMap("SslKeyPassword")
        private String sslKeyPassword;

        @com.aliyun.core.annotation.NameInMap("SslKeystoreCertificateChain")
        private String sslKeystoreCertificateChain;

        @com.aliyun.core.annotation.NameInMap("SslKeystoreKey")
        private SslKeystoreKey sslKeystoreKey;

        @com.aliyun.core.annotation.NameInMap("SslTruststoreCertificates")
        private String sslTruststoreCertificates;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Value value;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private VpcId vpcId;

        private SinkApacheKafkaParameters(Builder builder) {
            this.acks = builder.acks;
            this.bootstraps = builder.bootstraps;
            this.compressionType = builder.compressionType;
            this.dynamicTopic = builder.dynamicTopic;
            this.headers = builder.headers;
            this.key = builder.key;
            this.networkType = builder.networkType;
            this.saslMechanism = builder.saslMechanism;
            this.saslPassword = builder.saslPassword;
            this.saslUser = builder.saslUser;
            this.securityGroupId = builder.securityGroupId;
            this.securityProtocol = builder.securityProtocol;
            this.sslKeyPassword = builder.sslKeyPassword;
            this.sslKeystoreCertificateChain = builder.sslKeystoreCertificateChain;
            this.sslKeystoreKey = builder.sslKeystoreKey;
            this.sslTruststoreCertificates = builder.sslTruststoreCertificates;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.value = builder.value;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkApacheKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return acks
         */
        public String getAcks() {
            return this.acks;
        }

        /**
         * @return bootstraps
         */
        public String getBootstraps() {
            return this.bootstraps;
        }

        /**
         * @return compressionType
         */
        public String getCompressionType() {
            return this.compressionType;
        }

        /**
         * @return dynamicTopic
         */
        public DynamicTopic getDynamicTopic() {
            return this.dynamicTopic;
        }

        /**
         * @return headers
         */
        public Headers getHeaders() {
            return this.headers;
        }

        /**
         * @return key
         */
        public Key getKey() {
            return this.key;
        }

        /**
         * @return networkType
         */
        public NetworkType getNetworkType() {
            return this.networkType;
        }

        /**
         * @return saslMechanism
         */
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        /**
         * @return saslPassword
         */
        public String getSaslPassword() {
            return this.saslPassword;
        }

        /**
         * @return saslUser
         */
        public String getSaslUser() {
            return this.saslUser;
        }

        /**
         * @return securityGroupId
         */
        public SecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityProtocol
         */
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        /**
         * @return sslKeyPassword
         */
        public String getSslKeyPassword() {
            return this.sslKeyPassword;
        }

        /**
         * @return sslKeystoreCertificateChain
         */
        public String getSslKeystoreCertificateChain() {
            return this.sslKeystoreCertificateChain;
        }

        /**
         * @return sslKeystoreKey
         */
        public SslKeystoreKey getSslKeystoreKey() {
            return this.sslKeystoreKey;
        }

        /**
         * @return sslTruststoreCertificates
         */
        public String getSslTruststoreCertificates() {
            return this.sslTruststoreCertificates;
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
        public VSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return value
         */
        public Value getValue() {
            return this.value;
        }

        /**
         * @return vpcId
         */
        public VpcId getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String acks; 
            private String bootstraps; 
            private String compressionType; 
            private DynamicTopic dynamicTopic; 
            private Headers headers; 
            private Key key; 
            private NetworkType networkType; 
            private String saslMechanism; 
            private String saslPassword; 
            private String saslUser; 
            private SecurityGroupId securityGroupId; 
            private String securityProtocol; 
            private String sslKeyPassword; 
            private String sslKeystoreCertificateChain; 
            private SslKeystoreKey sslKeystoreKey; 
            private String sslTruststoreCertificates; 
            private String topic; 
            private VSwitchIds vSwitchIds; 
            private Value value; 
            private VpcId vpcId; 

            private Builder() {
            } 

            private Builder(SinkApacheKafkaParameters model) {
                this.acks = model.acks;
                this.bootstraps = model.bootstraps;
                this.compressionType = model.compressionType;
                this.dynamicTopic = model.dynamicTopic;
                this.headers = model.headers;
                this.key = model.key;
                this.networkType = model.networkType;
                this.saslMechanism = model.saslMechanism;
                this.saslPassword = model.saslPassword;
                this.saslUser = model.saslUser;
                this.securityGroupId = model.securityGroupId;
                this.securityProtocol = model.securityProtocol;
                this.sslKeyPassword = model.sslKeyPassword;
                this.sslKeystoreCertificateChain = model.sslKeystoreCertificateChain;
                this.sslKeystoreKey = model.sslKeystoreKey;
                this.sslTruststoreCertificates = model.sslTruststoreCertificates;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.value = model.value;
                this.vpcId = model.vpcId;
            } 

            /**
             * Acks.
             */
            public Builder acks(String acks) {
                this.acks = acks;
                return this;
            }

            /**
             * <p>The initial endpoint of the Kafka cluster.</p>
             */
            public Builder bootstraps(String bootstraps) {
                this.bootstraps = bootstraps;
                return this;
            }

            /**
             * CompressionType.
             */
            public Builder compressionType(String compressionType) {
                this.compressionType = compressionType;
                return this;
            }

            /**
             * <p>Specifies the target topic routing policy for messages. If both the Topic and DynamicTopic parameters are specified, the value of the DynamicTopic parameter takes precedence. The following two configuration modes are supported:</p>
             */
            public Builder dynamicTopic(DynamicTopic dynamicTopic) {
                this.dynamicTopic = dynamicTopic;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(Headers headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(Key key) {
                this.key = key;
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
             * SaslMechanism.
             */
            public Builder saslMechanism(String saslMechanism) {
                this.saslMechanism = saslMechanism;
                return this;
            }

            /**
             * SaslPassword.
             */
            public Builder saslPassword(String saslPassword) {
                this.saslPassword = saslPassword;
                return this;
            }

            /**
             * SaslUser.
             */
            public Builder saslUser(String saslUser) {
                this.saslUser = saslUser;
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
             * SecurityProtocol.
             */
            public Builder securityProtocol(String securityProtocol) {
                this.securityProtocol = securityProtocol;
                return this;
            }

            /**
             * <p>[Required for encrypted private key] The Kafka client private key password. Required when the client private key is encrypted with a password (the PEM file contains \&quot;Proc-Type: 4,ENCRYPTED\&quot; or \&quot;ENCRYPTED\&quot; markers). Leave empty if the private key is not encrypted. Note: This password is only used to decrypt the private key and is unrelated to Kafka authentication.</p>
             */
            public Builder sslKeyPassword(String sslKeyPassword) {
                this.sslKeyPassword = sslKeyPassword;
                return this;
            }

            /**
             * <p>[Required for mutual authentication] The Kafka client certificate chain. Required when the Kafka server enables mutual SSL authentication (ssl.client.auth=required). Format: Base64-encoded PEM format, containing the client certificate and the complete certificate chain (client certificate first, intermediate CA certificate next, root CA certificate optional). Note: Ensure that the beginning and end of each PEM file content are \&quot;-----BEGIN CERTIFICATE-----\&quot; and \&quot;-----END CERTIFICATE-----\&quot; respectively, then Base64-encode the concatenated content.</p>
             */
            public Builder sslKeystoreCertificateChain(String sslKeystoreCertificateChain) {
                this.sslKeystoreCertificateChain = sslKeystoreCertificateChain;
                return this;
            }

            /**
             * <p>[Required for bidirectional authentication] The SSL private key configuration object. When the Kafka server enables bidirectional SSL authentication, provide the client private key. Only KMS pattern is supported: specify the Key Management Service EPS resource that stores the private key by using KmsArn. The system retrieves the private key content from KMS only in memory, which provides higher security. Configuration example: {\&quot;KmsArn\&quot;: \&quot;acs:kms:ap-southeast-1:123456789:secret/ssl-key-xxxx\&quot;, \&quot;KmsSecretValueKey\&quot;: \&quot;keystore_private_key\&quot;}</p>
             */
            public Builder sslKeystoreKey(SslKeystoreKey sslKeystoreKey) {
                this.sslKeystoreKey = sslKeystoreKey;
                return this;
            }

            /**
             * <p>[Required for SSL] The Kafka server trust certificate. Used to authenticate the validity of the Kafka Broker SSL certificate and prevent man-in-the-middle attacks. Format: Base64-encoded PEM format, typically containing the CA certificate or the server certificate of the Kafka server. Example: Base64-encode the PEM file content of the CA certificate (ensure the content starts with \&quot;-----BEGIN CERTIFICATE-----\&quot; and ends with \&quot;-----END CERTIFICATE-----\&quot;). If Kafka uses a self-signed certificate, provide the CA certificate that issued the certificate.</p>
             */
            public Builder sslTruststoreCertificates(String sslTruststoreCertificates) {
                this.sslTruststoreCertificates = sslTruststoreCertificates;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(Value value) {
                this.value = value;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(VpcId vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkApacheKafkaParameters build() {
                return new SinkApacheKafkaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ConsumeTimestamp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConsumeTimestamp(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeTimestamp create() {
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

            private Builder() {
            } 

            private Builder(ConsumeTimestamp model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConsumeTimestamp build() {
                return new ConsumeTimestamp(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Group(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
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

            private Builder() {
            } 

            private Builder(Group model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Topic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Topic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkApacheRocketMQCheckpointParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeTimestamp")
        private ConsumeTimestamp consumeTimestamp;

        @com.aliyun.core.annotation.NameInMap("Group")
        private Group group;

        @com.aliyun.core.annotation.NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstancePassword")
        private String instancePassword;

        @com.aliyun.core.annotation.NameInMap("InstanceUsername")
        private String instanceUsername;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private Topic topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SinkApacheRocketMQCheckpointParameters(Builder builder) {
            this.consumeTimestamp = builder.consumeTimestamp;
            this.group = builder.group;
            this.instanceEndpoint = builder.instanceEndpoint;
            this.instancePassword = builder.instancePassword;
            this.instanceUsername = builder.instanceUsername;
            this.networkType = builder.networkType;
            this.securityGroupId = builder.securityGroupId;
            this.topic = builder.topic;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkApacheRocketMQCheckpointParameters create() {
            return builder().build();
        }

        /**
         * @return consumeTimestamp
         */
        public ConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        /**
         * @return group
         */
        public Group getGroup() {
            return this.group;
        }

        /**
         * @return instanceEndpoint
         */
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        /**
         * @return instancePassword
         */
        public String getInstancePassword() {
            return this.instancePassword;
        }

        /**
         * @return instanceUsername
         */
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
        public Topic getTopic() {
            return this.topic;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private ConsumeTimestamp consumeTimestamp; 
            private Group group; 
            private String instanceEndpoint; 
            private String instancePassword; 
            private String instanceUsername; 
            private String networkType; 
            private String securityGroupId; 
            private Topic topic; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SinkApacheRocketMQCheckpointParameters model) {
                this.consumeTimestamp = model.consumeTimestamp;
                this.group = model.group;
                this.instanceEndpoint = model.instanceEndpoint;
                this.instancePassword = model.instancePassword;
                this.instanceUsername = model.instanceUsername;
                this.networkType = model.networkType;
                this.securityGroupId = model.securityGroupId;
                this.topic = model.topic;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * ConsumeTimestamp.
             */
            public Builder consumeTimestamp(ConsumeTimestamp consumeTimestamp) {
                this.consumeTimestamp = consumeTimestamp;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(Group group) {
                this.group = group;
                return this;
            }

            /**
             * InstanceEndpoint.
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * InstancePassword.
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * InstanceUsername.
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(Topic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkApacheRocketMQCheckpointParameters build() {
                return new SinkApacheRocketMQCheckpointParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ConnectorParameters(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectorParameters create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map<String, ?> config; 
            private String name; 

            private Builder() {
            } 

            private Builder(ConnectorParameters model) {
                this.config = model.config;
                this.name = model.name;
            } 

            /**
             * <p>The connector configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *           &quot;connector.class&quot;: &quot;com.mongodb.kafka.connect.MongoSinkConnector&quot;,
             *           &quot;tasks.max&quot;: &quot;1&quot;,
             *           &quot;topics&quot;: &quot;sourceA,sourceB&quot;
             *         }</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The connector name.</p>
             * 
             * <strong>example:</strong>
             * <p>mongo-sink</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ConnectorParameters build() {
                return new ConnectorParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkCustomizedKafkaConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorPackageUrl")
        private String connectorPackageUrl;

        @com.aliyun.core.annotation.NameInMap("ConnectorParameters")
        private ConnectorParameters connectorParameters;

        @com.aliyun.core.annotation.NameInMap("WorkerParameters")
        private java.util.Map<String, ?> workerParameters;

        private SinkCustomizedKafkaConnectorParameters(Builder builder) {
            this.connectorPackageUrl = builder.connectorPackageUrl;
            this.connectorParameters = builder.connectorParameters;
            this.workerParameters = builder.workerParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkCustomizedKafkaConnectorParameters create() {
            return builder().build();
        }

        /**
         * @return connectorPackageUrl
         */
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        /**
         * @return connectorParameters
         */
        public ConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        /**
         * @return workerParameters
         */
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

        public static final class Builder {
            private String connectorPackageUrl; 
            private ConnectorParameters connectorParameters; 
            private java.util.Map<String, ?> workerParameters; 

            private Builder() {
            } 

            private Builder(SinkCustomizedKafkaConnectorParameters model) {
                this.connectorPackageUrl = model.connectorPackageUrl;
                this.connectorParameters = model.connectorParameters;
                this.workerParameters = model.workerParameters;
            } 

            /**
             * <p>The OSS file download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;<a href="https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&Expires=1725539627&Signature=rb8q3OpV2i3gZJ">https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&amp;Expires=1725539627&amp;Signature=rb8q3OpV2i3gZJ</a>&quot;</p>
             */
            public Builder connectorPackageUrl(String connectorPackageUrl) {
                this.connectorPackageUrl = connectorPackageUrl;
                return this;
            }

            /**
             * <p>Parses the properties file in the current ZIP package.</p>
             */
            public Builder connectorParameters(ConnectorParameters connectorParameters) {
                this.connectorParameters = connectorParameters;
                return this;
            }

            /**
             * <p>The instance configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;group.id&quot;: &quot;connect-eb-cluster-KAFKA_CONNECTORC&quot;,
             *         &quot;offset.storage.topic&quot;: &quot;connect-eb-offset-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
             *         &quot;config.storage.topic&quot;: &quot;connect-eb-config-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
             *         &quot;status.storage.topic&quot;: &quot;connect-eb-status-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
             *         &quot;consumer.group.id&quot;: &quot;connector-eb-cluster-KAFKA_CONNECTOR_yjqC8K5ewC-mongo-sink&quot;,
             *         &quot;bootstrap.servers&quot;: &quot;alikafka-post:9092&quot;
             *       }</p>
             */
            public Builder workerParameters(java.util.Map<String, ?> workerParameters) {
                this.workerParameters = workerParameters;
                return this;
            }

            public SinkCustomizedKafkaConnectorParameters build() {
                return new SinkCustomizedKafkaConnectorParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkCustomizedKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private SinkCustomizedKafkaParameters(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkCustomizedKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            private Builder() {
            } 

            private Builder(SinkCustomizedKafkaParameters model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The instance ID of ApsaraMQ for Kafka.</p>
             * 
             * <strong>example:</strong>
             * <p>90be1f96-4229-4535-bb76-34b4f6fb2b71</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public SinkCustomizedKafkaParameters build() {
                return new SinkCustomizedKafkaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Name extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Name(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Name create() {
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

            private Builder() {
            } 

            private Builder(Name model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Form</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>Template</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Name build() {
                return new Name(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Type extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Type(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Type create() {
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

            private Builder() {
            } 

            private Builder(Type model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Form</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>Template</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Type build() {
                return new Type(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class DashVectorSchemaParametersValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DashVectorSchemaParametersValue(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashVectorSchemaParametersValue create() {
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

            private Builder() {
            } 

            private Builder(DashVectorSchemaParametersValue model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Form</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>Template</p>
             * 
             * <strong>example:</strong>
             * <p>${content}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.content</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DashVectorSchemaParametersValue build() {
                return new DashVectorSchemaParametersValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class DashVectorSchemaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private Name name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Type type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private DashVectorSchemaParametersValue value;

        private DashVectorSchemaParameters(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashVectorSchemaParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public Name getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Type getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public DashVectorSchemaParametersValue getValue() {
            return this.value;
        }

        public static final class Builder {
            private Name name; 
            private Type type; 
            private DashVectorSchemaParametersValue value; 

            private Builder() {
            } 

            private Builder(DashVectorSchemaParameters model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The attribute name.</p>
             */
            public Builder name(Name name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The DashVector attribute type.</p>
             */
            public Builder type(Type type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute value.</p>
             */
            public Builder value(DashVectorSchemaParametersValue value) {
                this.value = value;
                return this;
            }

            public DashVectorSchemaParameters build() {
                return new DashVectorSchemaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Partition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Partition(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Partition create() {
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

            private Builder() {
            } 

            private Builder(Partition model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             * 
             * <strong>example:</strong>
             * <p>${partition}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <ul>
             * <li>If Form is set to CONSTANT: a constant value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Partition build() {
                return new Partition(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class PrimaryKeyId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PrimaryKeyId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrimaryKeyId create() {
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

            private Builder() {
            } 

            private Builder(PrimaryKeyId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The primary key ID template. This parameter is required only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>${ID}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <ul>
             * <li>If Form is set to JSONPATH: the content extracted by JSONPath.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>$.data.requestId</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PrimaryKeyId build() {
                return new PrimaryKeyId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Vector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Vector(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vector create() {
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

            private Builder() {
            } 

            private Builder(Vector model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             * 
             * <strong>example:</strong>
             * <p>${vector}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The content extracted by JSONPath.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.messageBody</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Vector build() {
                return new Vector(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDashVectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("Collection")
        private String collection;

        @com.aliyun.core.annotation.NameInMap("DashVectorSchemaParameters")
        private java.util.List<DashVectorSchemaParameters> dashVectorSchemaParameters;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Partition partition;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyId")
        private PrimaryKeyId primaryKeyId;

        @com.aliyun.core.annotation.NameInMap("Vector")
        private Vector vector;

        private SinkDashVectorParameters(Builder builder) {
            this.apiKey = builder.apiKey;
            this.collection = builder.collection;
            this.dashVectorSchemaParameters = builder.dashVectorSchemaParameters;
            this.instanceId = builder.instanceId;
            this.network = builder.network;
            this.operation = builder.operation;
            this.partition = builder.partition;
            this.primaryKeyId = builder.primaryKeyId;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDashVectorParameters create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return collection
         */
        public String getCollection() {
            return this.collection;
        }

        /**
         * @return dashVectorSchemaParameters
         */
        public java.util.List<DashVectorSchemaParameters> getDashVectorSchemaParameters() {
            return this.dashVectorSchemaParameters;
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
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return partition
         */
        public Partition getPartition() {
            return this.partition;
        }

        /**
         * @return primaryKeyId
         */
        public PrimaryKeyId getPrimaryKeyId() {
            return this.primaryKeyId;
        }

        /**
         * @return vector
         */
        public Vector getVector() {
            return this.vector;
        }

        public static final class Builder {
            private String apiKey; 
            private String collection; 
            private java.util.List<DashVectorSchemaParameters> dashVectorSchemaParameters; 
            private String instanceId; 
            private String network; 
            private String operation; 
            private Partition partition; 
            private PrimaryKeyId primaryKeyId; 
            private Vector vector; 

            private Builder() {
            } 

            private Builder(SinkDashVectorParameters model) {
                this.apiKey = model.apiKey;
                this.collection = model.collection;
                this.dashVectorSchemaParameters = model.dashVectorSchemaParameters;
                this.instanceId = model.instanceId;
                this.network = model.network;
                this.operation = model.operation;
                this.partition = model.partition;
                this.primaryKeyId = model.primaryKeyId;
                this.vector = model.vector;
            } 

            /**
             * <p>The API key created in the DashVector console.</p>
             * 
             * <strong>example:</strong>
             * <p>Q34nExQH7sQ****</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The collection name.</p>
             * 
             * <strong>example:</strong>
             * <p>collection1</p>
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * <p>The schema field definition of the table entry when inserting into DashVector. The result after event content transformation must be in JSON format.</p>
             */
            public Builder dashVectorSchemaParameters(java.util.List<DashVectorSchemaParameters> dashVectorSchemaParameters) {
                this.dashVectorSchemaParameters = dashVectorSchemaParameters;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vrs-cn-lbj3ru1***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>PublicNetwork</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The DashVector database operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>Upsert</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The partition. Default value: default.</p>
             */
            public Builder partition(Partition partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The primary key ID used when inserting or deleting records.</p>
             */
            public Builder primaryKeyId(PrimaryKeyId primaryKeyId) {
                this.primaryKeyId = primaryKeyId;
                return this;
            }

            /**
             * <p>The vector of the DashVector record to insert.</p>
             */
            public Builder vector(Vector vector) {
                this.vector = vector;
                return this;
            }

            public SinkDashVectorParameters build() {
                return new SinkDashVectorParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDataHubParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDataHubParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDataHubParametersBody create() {
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

            private Builder() {
            } 

            private Builder(SinkDataHubParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>ORIGINAL</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The Record content template for the BLOB type.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDataHubParametersBody build() {
                return new SinkDataHubParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Project model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The DataHub project name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-project</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class RoleName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(RoleName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The task role name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-role</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDataHubParametersTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDataHubParametersTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDataHubParametersTopic create() {
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

            private Builder() {
            } 

            private Builder(SinkDataHubParametersTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The DataHub topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-topic</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDataHubParametersTopic build() {
                return new SinkDataHubParametersTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class TopicSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TopicSchema(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicSchema create() {
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

            private Builder() {
            } 

            private Builder(TopicSchema model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;${k1}&quot;,&quot;k2&quot;:&quot;${k2}&quot;}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic content schema for the TUPLE type.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;value1&quot;,&quot;k2&quot;:&quot;value2&quot;}</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TopicSchema build() {
                return new TopicSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class TopicType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TopicType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicType create() {
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

            private Builder() {
            } 

            private Builder(TopicType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TopicType build() {
                return new TopicType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDataHubParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkDataHubParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Project")
        private Project project;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private RoleName roleName;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private SinkDataHubParametersTopic topic;

        @com.aliyun.core.annotation.NameInMap("TopicSchema")
        private TopicSchema topicSchema;

        @com.aliyun.core.annotation.NameInMap("TopicType")
        private TopicType topicType;

        private SinkDataHubParameters(Builder builder) {
            this.body = builder.body;
            this.project = builder.project;
            this.roleName = builder.roleName;
            this.topic = builder.topic;
            this.topicSchema = builder.topicSchema;
            this.topicType = builder.topicType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDataHubParameters create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public SinkDataHubParametersBody getBody() {
            return this.body;
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
        public RoleName getRoleName() {
            return this.roleName;
        }

        /**
         * @return topic
         */
        public SinkDataHubParametersTopic getTopic() {
            return this.topic;
        }

        /**
         * @return topicSchema
         */
        public TopicSchema getTopicSchema() {
            return this.topicSchema;
        }

        /**
         * @return topicType
         */
        public TopicType getTopicType() {
            return this.topicType;
        }

        public static final class Builder {
            private SinkDataHubParametersBody body; 
            private Project project; 
            private RoleName roleName; 
            private SinkDataHubParametersTopic topic; 
            private TopicSchema topicSchema; 
            private TopicType topicType; 

            private Builder() {
            } 

            private Builder(SinkDataHubParameters model) {
                this.body = model.body;
                this.project = model.project;
                this.roleName = model.roleName;
                this.topic = model.topic;
                this.topicSchema = model.topicSchema;
                this.topicType = model.topicType;
            } 

            /**
             * <p>The Record content template for the BLOB type.</p>
             */
            public Builder body(SinkDataHubParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The DataHub project name.</p>
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The task role name.</p>
             */
            public Builder roleName(RoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The DataHub topic name.</p>
             */
            public Builder topic(SinkDataHubParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The topic content schema for the TUPLE type.</p>
             */
            public Builder topicSchema(TopicSchema topicSchema) {
                this.topicSchema = topicSchema;
                return this;
            }

            /**
             * <p>The topic type:</p>
             */
            public Builder topicType(TopicType topicType) {
                this.topicType = topicType;
                return this;
            }

            public SinkDataHubParameters build() {
                return new SinkDataHubParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class BeHttpEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BeHttpEndpoint(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeHttpEndpoint create() {
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

            private Builder() {
            } 

            private Builder(BeHttpEndpoint model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BeHttpEndpoint build() {
                return new BeHttpEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDorisParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDorisParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDorisParametersBody create() {
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

            private Builder() {
            } 

            private Builder(SinkDorisParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDorisParametersBody build() {
                return new SinkDorisParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Database(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
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

            private Builder() {
            } 

            private Builder(Database model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class FeHttpEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private FeHttpEndpoint(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeHttpEndpoint create() {
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

            private Builder() {
            } 

            private Builder(FeHttpEndpoint model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FeHttpEndpoint build() {
                return new FeHttpEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDorisParametersNetworkType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDorisParametersNetworkType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDorisParametersNetworkType create() {
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

            private Builder() {
            } 

            private Builder(SinkDorisParametersNetworkType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDorisParametersNetworkType build() {
                return new SinkDorisParametersNetworkType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Password extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Password model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class QueryEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryEndpoint(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryEndpoint create() {
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

            private Builder() {
            } 

            private Builder(QueryEndpoint model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryEndpoint build() {
                return new QueryEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDorisParametersSecurityGroupId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDorisParametersSecurityGroupId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDorisParametersSecurityGroupId create() {
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

            private Builder() {
            } 

            private Builder(SinkDorisParametersSecurityGroupId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDorisParametersSecurityGroupId build() {
                return new SinkDorisParametersSecurityGroupId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Table(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
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

            private Builder() {
            } 

            private Builder(Table model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class UserName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UserName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserName create() {
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

            private Builder() {
            } 

            private Builder(UserName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserName build() {
                return new UserName(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDorisParametersVSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDorisParametersVSwitchIds(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDorisParametersVSwitchIds create() {
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

            private Builder() {
            } 

            private Builder(SinkDorisParametersVSwitchIds model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDorisParametersVSwitchIds build() {
                return new SinkDorisParametersVSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDorisParametersVpcId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkDorisParametersVpcId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDorisParametersVpcId create() {
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

            private Builder() {
            } 

            private Builder(SinkDorisParametersVpcId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic type:</p>
             * 
             * <strong>example:</strong>
             * <p>TUPLE</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkDorisParametersVpcId build() {
                return new SinkDorisParametersVpcId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkDorisParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeHttpEndpoint")
        private BeHttpEndpoint beHttpEndpoint;

        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkDorisParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Database")
        private Database database;

        @com.aliyun.core.annotation.NameInMap("FeHttpEndpoint")
        private FeHttpEndpoint feHttpEndpoint;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private SinkDorisParametersNetworkType networkType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private Password password;

        @com.aliyun.core.annotation.NameInMap("QueryEndpoint")
        private QueryEndpoint queryEndpoint;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private SinkDorisParametersSecurityGroupId securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Table")
        private Table table;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private UserName userName;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private SinkDorisParametersVSwitchIds vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private SinkDorisParametersVpcId vpcId;

        private SinkDorisParameters(Builder builder) {
            this.beHttpEndpoint = builder.beHttpEndpoint;
            this.body = builder.body;
            this.database = builder.database;
            this.feHttpEndpoint = builder.feHttpEndpoint;
            this.networkType = builder.networkType;
            this.password = builder.password;
            this.queryEndpoint = builder.queryEndpoint;
            this.securityGroupId = builder.securityGroupId;
            this.table = builder.table;
            this.userName = builder.userName;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDorisParameters create() {
            return builder().build();
        }

        /**
         * @return beHttpEndpoint
         */
        public BeHttpEndpoint getBeHttpEndpoint() {
            return this.beHttpEndpoint;
        }

        /**
         * @return body
         */
        public SinkDorisParametersBody getBody() {
            return this.body;
        }

        /**
         * @return database
         */
        public Database getDatabase() {
            return this.database;
        }

        /**
         * @return feHttpEndpoint
         */
        public FeHttpEndpoint getFeHttpEndpoint() {
            return this.feHttpEndpoint;
        }

        /**
         * @return networkType
         */
        public SinkDorisParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        /**
         * @return password
         */
        public Password getPassword() {
            return this.password;
        }

        /**
         * @return queryEndpoint
         */
        public QueryEndpoint getQueryEndpoint() {
            return this.queryEndpoint;
        }

        /**
         * @return securityGroupId
         */
        public SinkDorisParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return table
         */
        public Table getTable() {
            return this.table;
        }

        /**
         * @return userName
         */
        public UserName getUserName() {
            return this.userName;
        }

        /**
         * @return vSwitchIds
         */
        public SinkDorisParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public SinkDorisParametersVpcId getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private BeHttpEndpoint beHttpEndpoint; 
            private SinkDorisParametersBody body; 
            private Database database; 
            private FeHttpEndpoint feHttpEndpoint; 
            private SinkDorisParametersNetworkType networkType; 
            private Password password; 
            private QueryEndpoint queryEndpoint; 
            private SinkDorisParametersSecurityGroupId securityGroupId; 
            private Table table; 
            private UserName userName; 
            private SinkDorisParametersVSwitchIds vSwitchIds; 
            private SinkDorisParametersVpcId vpcId; 

            private Builder() {
            } 

            private Builder(SinkDorisParameters model) {
                this.beHttpEndpoint = model.beHttpEndpoint;
                this.body = model.body;
                this.database = model.database;
                this.feHttpEndpoint = model.feHttpEndpoint;
                this.networkType = model.networkType;
                this.password = model.password;
                this.queryEndpoint = model.queryEndpoint;
                this.securityGroupId = model.securityGroupId;
                this.table = model.table;
                this.userName = model.userName;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * BeHttpEndpoint.
             */
            public Builder beHttpEndpoint(BeHttpEndpoint beHttpEndpoint) {
                this.beHttpEndpoint = beHttpEndpoint;
                return this;
            }

            /**
             * <p>The Record content template for the BLOB type.</p>
             */
            public Builder body(SinkDorisParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(Database database) {
                this.database = database;
                return this;
            }

            /**
             * FeHttpEndpoint.
             */
            public Builder feHttpEndpoint(FeHttpEndpoint feHttpEndpoint) {
                this.feHttpEndpoint = feHttpEndpoint;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(SinkDorisParametersNetworkType networkType) {
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
             * QueryEndpoint.
             */
            public Builder queryEndpoint(QueryEndpoint queryEndpoint) {
                this.queryEndpoint = queryEndpoint;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(SinkDorisParametersSecurityGroupId securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(Table table) {
                this.table = table;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(UserName userName) {
                this.userName = userName;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(SinkDorisParametersVSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(SinkDorisParametersVpcId vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkDorisParameters build() {
                return new SinkDorisParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ColumnValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ColumnValue(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnValue create() {
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

            private Builder() {
            } 

            private Builder(ColumnValue model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation method, such as JSONPATH.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The extraction path, such as $.data.value.name.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ColumnValue build() {
                return new ColumnValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class MappingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("ColumnValue")
        private ColumnValue columnValue;

        private MappingRules(Builder builder) {
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.columnValue = builder.columnValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappingRules create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return columnValue
         */
        public ColumnValue getColumnValue() {
            return this.columnValue;
        }

        public static final class Builder {
            private String columnName; 
            private String columnType; 
            private ColumnValue columnValue; 

            private Builder() {
            } 

            private Builder(MappingRules model) {
                this.columnName = model.columnName;
                this.columnType = model.columnType;
                this.columnValue = model.columnValue;
            } 

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The column type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The column value extraction rule.</p>
             */
            public Builder columnValue(ColumnValue columnValue) {
                this.columnValue = columnValue;
                return this;
            }

            public MappingRules build() {
                return new MappingRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkEventHouseParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("EventTableName")
        private String eventTableName;

        @com.aliyun.core.annotation.NameInMap("MappingRules")
        private java.util.List<MappingRules> mappingRules;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        private SinkEventHouseParameters(Builder builder) {
            this.catalogName = builder.catalogName;
            this.eventTableName = builder.eventTableName;
            this.mappingRules = builder.mappingRules;
            this.namespaceName = builder.namespaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkEventHouseParameters create() {
            return builder().build();
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return eventTableName
         */
        public String getEventTableName() {
            return this.eventTableName;
        }

        /**
         * @return mappingRules
         */
        public java.util.List<MappingRules> getMappingRules() {
            return this.mappingRules;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public static final class Builder {
            private String catalogName; 
            private String eventTableName; 
            private java.util.List<MappingRules> mappingRules; 
            private String namespaceName; 

            private Builder() {
            } 

            private Builder(SinkEventHouseParameters model) {
                this.catalogName = model.catalogName;
                this.eventTableName = model.eventTableName;
                this.mappingRules = model.mappingRules;
                this.namespaceName = model.namespaceName;
            } 

            /**
             * <p>The catalog name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * <p>The name of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-table</p>
             */
            public Builder eventTableName(String eventTableName) {
                this.eventTableName = eventTableName;
                return this;
            }

            /**
             * <p>The field mapping rules.</p>
             */
            public Builder mappingRules(java.util.List<MappingRules> mappingRules) {
                this.mappingRules = mappingRules;
                return this;
            }

            /**
             * <p>The namespace of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            public SinkEventHouseParameters build() {
                return new SinkEventHouseParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkFcParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkFcParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform format:</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Concurrency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Concurrency model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The delivery concurrency. The minimum value is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class DataFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataFormat(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataFormat create() {
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

            private Builder() {
            } 

            private Builder(DataFormat model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The delivery concurrency. The minimum value is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataFormat build() {
                return new DataFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class FunctionName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(FunctionName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The function name.</p>
             * 
             * <strong>example:</strong>
             * <p>myFunction</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class InvocationType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(InvocationType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Specifies whether the invocation is synchronous or asynchronous.</p>
             * 
             * <strong>example:</strong>
             * <p>Async</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Qualifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Qualifier model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The service version.</p>
             * 
             * <strong>example:</strong>
             * <p>LATEST</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ServiceName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(ServiceName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>myService</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkFcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkFcParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Concurrency concurrency;

        @com.aliyun.core.annotation.NameInMap("DataFormat")
        private DataFormat dataFormat;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private FunctionName functionName;

        @com.aliyun.core.annotation.NameInMap("InvocationType")
        private InvocationType invocationType;

        @com.aliyun.core.annotation.NameInMap("Qualifier")
        private Qualifier qualifier;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private ServiceName serviceName;

        private SinkFcParameters(Builder builder) {
            this.body = builder.body;
            this.concurrency = builder.concurrency;
            this.dataFormat = builder.dataFormat;
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
         * @return dataFormat
         */
        public DataFormat getDataFormat() {
            return this.dataFormat;
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
            private DataFormat dataFormat; 
            private FunctionName functionName; 
            private InvocationType invocationType; 
            private Qualifier qualifier; 
            private ServiceName serviceName; 

            private Builder() {
            } 

            private Builder(SinkFcParameters model) {
                this.body = model.body;
                this.concurrency = model.concurrency;
                this.dataFormat = model.dataFormat;
                this.functionName = model.functionName;
                this.invocationType = model.invocationType;
                this.qualifier = model.qualifier;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The content body sent to the function.</p>
             */
            public Builder body(SinkFcParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The delivery concurrency. The minimum value is 1.</p>
             */
            public Builder concurrency(Concurrency concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * DataFormat.
             */
            public Builder dataFormat(DataFormat dataFormat) {
                this.dataFormat = dataFormat;
                return this;
            }

            /**
             * <p>The function name.</p>
             */
            public Builder functionName(FunctionName functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>Specifies whether the invocation is synchronous or asynchronous.</p>
             */
            public Builder invocationType(InvocationType invocationType) {
                this.invocationType = invocationType;
                return this;
            }

            /**
             * <p>The service version.</p>
             */
            public Builder qualifier(Qualifier qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * <p>The service name.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ExecutionName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(ExecutionName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The execution name.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class FlowName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(FlowName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-streaming-fnf</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform format:</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The execution input information.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkFnfParametersRoleName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkFnfParametersRoleName(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkFnfParametersRoleName create() {
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

            private Builder() {
            } 

            private Builder(SinkFnfParametersRoleName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The role configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Al<strong><strong>FNF-x</strong></strong></p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkFnfParametersRoleName build() {
                return new SinkFnfParametersRoleName(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkFnfParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionName")
        private ExecutionName executionName;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private FlowName flowName;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private SinkFnfParametersRoleName roleName;

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
        public SinkFnfParametersRoleName getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private ExecutionName executionName; 
            private FlowName flowName; 
            private Input input; 
            private SinkFnfParametersRoleName roleName; 

            private Builder() {
            } 

            private Builder(SinkFnfParameters model) {
                this.executionName = model.executionName;
                this.flowName = model.flowName;
                this.input = model.input;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The execution name.</p>
             */
            public Builder executionName(ExecutionName executionName) {
                this.executionName = executionName;
                return this;
            }

            /**
             * <p>The flow name.</p>
             */
            public Builder flowName(FlowName flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>The execution input information.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The role configuration.</p>
             */
            public Builder roleName(SinkFnfParametersRoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            public SinkFnfParameters build() {
                return new SinkFnfParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Acks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Acks model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The acknowledgment mode for writing to Kafka:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkKafkaParametersDynamicTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkKafkaParametersDynamicTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkKafkaParametersDynamicTopic create() {
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

            private Builder() {
            } 

            private Builder(SinkKafkaParametersDynamicTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParametersDynamicTopic build() {
                return new SinkKafkaParametersDynamicTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkKafkaParametersHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkKafkaParametersHeaders(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkKafkaParametersHeaders create() {
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

            private Builder() {
            } 

            private Builder(SinkKafkaParametersHeaders model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transform type.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParametersHeaders build() {
                return new SinkKafkaParametersHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class InstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(InstanceId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Defaut_1283278472_s****</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkKafkaParametersKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkKafkaParametersKey(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkKafkaParametersKey create() {
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

            private Builder() {
            } 

            private Builder(SinkKafkaParametersKey model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The message key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParametersKey build() {
                return new SinkKafkaParametersKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkKafkaParametersTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkKafkaParametersTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkKafkaParametersTopic create() {
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

            private Builder() {
            } 

            private Builder(SinkKafkaParametersTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParametersTopic build() {
                return new SinkKafkaParametersTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkKafkaParametersValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkKafkaParametersValue(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkKafkaParametersValue create() {
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

            private Builder() {
            } 

            private Builder(SinkKafkaParametersValue model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;key&quot;: &quot;value&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParametersValue build() {
                return new SinkKafkaParametersValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acks")
        private Acks acks;

        @com.aliyun.core.annotation.NameInMap("CompressionType")
        private String compressionType;

        @com.aliyun.core.annotation.NameInMap("DynamicTopic")
        private SinkKafkaParametersDynamicTopic dynamicTopic;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private SinkKafkaParametersHeaders headers;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private InstanceId instanceId;

        @com.aliyun.core.annotation.NameInMap("Key")
        private SinkKafkaParametersKey key;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private SinkKafkaParametersTopic topic;

        @com.aliyun.core.annotation.NameInMap("Value")
        private SinkKafkaParametersValue value;

        private SinkKafkaParameters(Builder builder) {
            this.acks = builder.acks;
            this.compressionType = builder.compressionType;
            this.dynamicTopic = builder.dynamicTopic;
            this.headers = builder.headers;
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
         * @return compressionType
         */
        public String getCompressionType() {
            return this.compressionType;
        }

        /**
         * @return dynamicTopic
         */
        public SinkKafkaParametersDynamicTopic getDynamicTopic() {
            return this.dynamicTopic;
        }

        /**
         * @return headers
         */
        public SinkKafkaParametersHeaders getHeaders() {
            return this.headers;
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
        public SinkKafkaParametersKey getKey() {
            return this.key;
        }

        /**
         * @return topic
         */
        public SinkKafkaParametersTopic getTopic() {
            return this.topic;
        }

        /**
         * @return value
         */
        public SinkKafkaParametersValue getValue() {
            return this.value;
        }

        public static final class Builder {
            private Acks acks; 
            private String compressionType; 
            private SinkKafkaParametersDynamicTopic dynamicTopic; 
            private SinkKafkaParametersHeaders headers; 
            private InstanceId instanceId; 
            private SinkKafkaParametersKey key; 
            private SinkKafkaParametersTopic topic; 
            private SinkKafkaParametersValue value; 

            private Builder() {
            } 

            private Builder(SinkKafkaParameters model) {
                this.acks = model.acks;
                this.compressionType = model.compressionType;
                this.dynamicTopic = model.dynamicTopic;
                this.headers = model.headers;
                this.instanceId = model.instanceId;
                this.key = model.key;
                this.topic = model.topic;
                this.value = model.value;
            } 

            /**
             * <p>The acknowledgment mode for writing to Kafka:</p>
             */
            public Builder acks(Acks acks) {
                this.acks = acks;
                return this;
            }

            /**
             * CompressionType.
             */
            public Builder compressionType(String compressionType) {
                this.compressionType = compressionType;
                return this;
            }

            /**
             * <p>Specifies the target topic routing policy for messages. If both the Topic and DynamicTopic parameters are specified, the value of the DynamicTopic parameter takes precedence. The following two configuration modes are supported:</p>
             */
            public Builder dynamicTopic(SinkKafkaParametersDynamicTopic dynamicTopic) {
                this.dynamicTopic = dynamicTopic;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(SinkKafkaParametersHeaders headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The event target type is MSMQ for Apache Kafka.</p>
             */
            public Builder instanceId(InstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The message key.</p>
             */
            public Builder key(SinkKafkaParametersKey key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The topic name.</p>
             */
            public Builder topic(SinkKafkaParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The message body.</p>
             */
            public Builder value(SinkKafkaParametersValue value) {
                this.value = value;
                return this;
            }

            public SinkKafkaParameters build() {
                return new SinkKafkaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkMNSParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkMNSParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class IsBase64Encode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(IsBase64Encode model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The event transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Specifies whether to enable Base64 encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class QueueName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(QueueName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkMNSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkMNSParametersBody body;

        @com.aliyun.core.annotation.NameInMap("IsBase64Encode")
        private IsBase64Encode isBase64Encode;

        @com.aliyun.core.annotation.NameInMap("QueueName")
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

            private Builder() {
            } 

            private Builder(SinkMNSParameters model) {
                this.body = model.body;
                this.isBase64Encode = model.isBase64Encode;
                this.queueName = model.queueName;
            } 

            /**
             * <p>The message body.</p>
             */
            public Builder body(SinkMNSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>Specifies whether to enable Base64 encoding.</p>
             */
            public Builder isBase64Encode(IsBase64Encode isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * <p>The event target type is Message Service (MNS).</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkOpenSourceRabbitMQParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkOpenSourceRabbitMQParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkOpenSourceRabbitMQParametersBody create() {
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

            private Builder() {
            } 

            private Builder(SinkOpenSourceRabbitMQParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkOpenSourceRabbitMQParametersBody build() {
                return new SinkOpenSourceRabbitMQParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class MessageId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(MessageId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Properties model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class RoutingKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(RoutingKey model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkOpenSourceRabbitMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkOpenSourceRabbitMQParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Exchange")
        private String exchange;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private MessageId messageId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private RoutingKey routingKey;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
        private String virtualHostName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SinkOpenSourceRabbitMQParameters(Builder builder) {
            this.authType = builder.authType;
            this.body = builder.body;
            this.endpoint = builder.endpoint;
            this.exchange = builder.exchange;
            this.messageId = builder.messageId;
            this.networkType = builder.networkType;
            this.password = builder.password;
            this.properties = builder.properties;
            this.queueName = builder.queueName;
            this.routingKey = builder.routingKey;
            this.securityGroupId = builder.securityGroupId;
            this.targetType = builder.targetType;
            this.username = builder.username;
            this.vSwitchIds = builder.vSwitchIds;
            this.virtualHostName = builder.virtualHostName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkOpenSourceRabbitMQParameters create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return body
         */
        public SinkOpenSourceRabbitMQParametersBody getBody() {
            return this.body;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return exchange
         */
        public String getExchange() {
            return this.exchange;
        }

        /**
         * @return messageId
         */
        public MessageId getMessageId() {
            return this.messageId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
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
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return routingKey
         */
        public RoutingKey getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return virtualHostName
         */
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String authType; 
            private SinkOpenSourceRabbitMQParametersBody body; 
            private String endpoint; 
            private String exchange; 
            private MessageId messageId; 
            private String networkType; 
            private String password; 
            private Properties properties; 
            private String queueName; 
            private RoutingKey routingKey; 
            private String securityGroupId; 
            private String targetType; 
            private String username; 
            private String vSwitchIds; 
            private String virtualHostName; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SinkOpenSourceRabbitMQParameters model) {
                this.authType = model.authType;
                this.body = model.body;
                this.endpoint = model.endpoint;
                this.exchange = model.exchange;
                this.messageId = model.messageId;
                this.networkType = model.networkType;
                this.password = model.password;
                this.properties = model.properties;
                this.queueName = model.queueName;
                this.routingKey = model.routingKey;
                this.securityGroupId = model.securityGroupId;
                this.targetType = model.targetType;
                this.username = model.username;
                this.vSwitchIds = model.vSwitchIds;
                this.virtualHostName = model.virtualHostName;
                this.vpcId = model.vpcId;
            } 

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The message body.</p>
             */
            public Builder body(SinkOpenSourceRabbitMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Exchange.
             */
            public Builder exchange(String exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(MessageId messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The event target type is Message Service (MNS).</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * RoutingKey.
             */
            public Builder routingKey(RoutingKey routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VirtualHostName.
             */
            public Builder virtualHostName(String virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkOpenSourceRabbitMQParameters build() {
                return new SinkOpenSourceRabbitMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class AuthorizationType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(AuthorizationType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC_AUTH</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: JSONPATH.</p>
             * 
             * <strong>example:</strong>
             * <p>JSAONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The metric content.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class HeaderParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderParameters(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderParameters create() {
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

            private Builder() {
            } 

            private Builder(HeaderParameters model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The HTTP request header template style. Specify this parameter when Form is set to TEMPLATE. The result after event content transformation must be in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;user_name&quot;:&quot;${name}&quot;
             * }</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <ul>
             * <li>If Form is set to CONSTANT: a constant value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderParameters build() {
                return new HeaderParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkPrometheusParametersNetworkType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkPrometheusParametersNetworkType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkPrometheusParametersNetworkType create() {
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

            private Builder() {
            } 

            private Builder(SinkPrometheusParametersNetworkType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateNetwork</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkPrometheusParametersNetworkType build() {
                return new SinkPrometheusParametersNetworkType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkPrometheusParametersPassword extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkPrometheusParametersPassword(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkPrometheusParametersPassword create() {
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

            private Builder() {
            } 

            private Builder(SinkPrometheusParametersPassword model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkPrometheusParametersPassword build() {
                return new SinkPrometheusParametersPassword(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkPrometheusParametersSecurityGroupId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkPrometheusParametersSecurityGroupId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkPrometheusParametersSecurityGroupId create() {
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

            private Builder() {
            } 

            private Builder(SinkPrometheusParametersSecurityGroupId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-mw43*****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkPrometheusParametersSecurityGroupId build() {
                return new SinkPrometheusParametersSecurityGroupId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class URL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(URL model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style. This parameter is left empty when Form is set to CONSTANT.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The Prometheus Remote Write URL.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Username extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Username model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>****admin</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class VSwitchId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(VSwitchId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-dwaafds****</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkPrometheusParametersVpcId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkPrometheusParametersVpcId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkPrometheusParametersVpcId create() {
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

            private Builder() {
            } 

            private Builder(SinkPrometheusParametersVpcId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze7u5i17mbqtx1p****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkPrometheusParametersVpcId build() {
                return new SinkPrometheusParametersVpcId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkPrometheusParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationType")
        private AuthorizationType authorizationType;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("HeaderParameters")
        private HeaderParameters headerParameters;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private SinkPrometheusParametersNetworkType networkType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private SinkPrometheusParametersPassword password;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private SinkPrometheusParametersSecurityGroupId securityGroupId;

        @com.aliyun.core.annotation.NameInMap("URL")
        private URL URL;

        @com.aliyun.core.annotation.NameInMap("Username")
        private Username username;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private VSwitchId vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private SinkPrometheusParametersVpcId vpcId;

        private SinkPrometheusParameters(Builder builder) {
            this.authorizationType = builder.authorizationType;
            this.data = builder.data;
            this.headerParameters = builder.headerParameters;
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
         * @return headerParameters
         */
        public HeaderParameters getHeaderParameters() {
            return this.headerParameters;
        }

        /**
         * @return networkType
         */
        public SinkPrometheusParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        /**
         * @return password
         */
        public SinkPrometheusParametersPassword getPassword() {
            return this.password;
        }

        /**
         * @return securityGroupId
         */
        public SinkPrometheusParametersSecurityGroupId getSecurityGroupId() {
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
        public SinkPrometheusParametersVpcId getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private AuthorizationType authorizationType; 
            private Data data; 
            private HeaderParameters headerParameters; 
            private SinkPrometheusParametersNetworkType networkType; 
            private SinkPrometheusParametersPassword password; 
            private SinkPrometheusParametersSecurityGroupId securityGroupId; 
            private URL URL; 
            private Username username; 
            private VSwitchId vSwitchId; 
            private SinkPrometheusParametersVpcId vpcId; 

            private Builder() {
            } 

            private Builder(SinkPrometheusParameters model) {
                this.authorizationType = model.authorizationType;
                this.data = model.data;
                this.headerParameters = model.headerParameters;
                this.networkType = model.networkType;
                this.password = model.password;
                this.securityGroupId = model.securityGroupId;
                this.URL = model.URL;
                this.username = model.username;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The authentication method.</p>
             */
            public Builder authorizationType(AuthorizationType authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * <p>The metric content.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The data structure of the request header parameters.</p>
             */
            public Builder headerParameters(HeaderParameters headerParameters) {
                this.headerParameters = headerParameters;
                return this;
            }

            /**
             * <p>The network type.</p>
             */
            public Builder networkType(SinkPrometheusParametersNetworkType networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The password.</p>
             */
            public Builder password(SinkPrometheusParametersPassword password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             */
            public Builder securityGroupId(SinkPrometheusParametersSecurityGroupId securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The Prometheus Remote Write URL.</p>
             */
            public Builder URL(URL URL) {
                this.URL = URL;
                return this;
            }

            /**
             * <p>The username.</p>
             */
            public Builder username(Username username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             */
            public Builder vSwitchId(VSwitchId vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             */
            public Builder vpcId(SinkPrometheusParametersVpcId vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkPrometheusParameters build() {
                return new SinkPrometheusParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Exchange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Exchange model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the exchange in the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>a_exchange</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersInstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersInstanceId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance ID of ApsaraMQ for RabbitMQ.</p>
             * 
             * <strong>example:</strong>
             * <p>a5ff91ad4f3f24947887fe184fc2****</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersMessageId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersMessageId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersMessageId create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersMessageId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersMessageId build() {
                return new SinkRabbitMQParametersMessageId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersNetworkType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersNetworkType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersNetworkType create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersNetworkType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersNetworkType build() {
                return new SinkRabbitMQParametersNetworkType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersProperties(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersProperties create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersProperties model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersProperties build() {
                return new SinkRabbitMQParametersProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersQueueName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersQueueName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The name of the queue in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersRoutingKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersRoutingKey(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersRoutingKey create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersRoutingKey model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The routing rule of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>housekeeping</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersRoutingKey build() {
                return new SinkRabbitMQParametersRoutingKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersSecurityGroupId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersSecurityGroupId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersSecurityGroupId create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersSecurityGroupId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The routing rule of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>housekeeping</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersSecurityGroupId build() {
                return new SinkRabbitMQParametersSecurityGroupId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class TargetType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(TargetType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The target type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Exchange/Queue</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersVSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersVSwitchIds(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersVSwitchIds create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersVSwitchIds model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The target type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Exchange/Queue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersVSwitchIds build() {
                return new SinkRabbitMQParametersVSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class VirtualHostName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(VirtualHostName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rabbit-host</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParametersVpcId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQParametersVpcId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQParametersVpcId create() {
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

            private Builder() {
            } 

            private Builder(SinkRabbitMQParametersVpcId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rabbit-host</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQParametersVpcId build() {
                return new SinkRabbitMQParametersVpcId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRabbitMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkRabbitMQParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Exchange")
        private Exchange exchange;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private SinkRabbitMQParametersInstanceId instanceId;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private SinkRabbitMQParametersMessageId messageId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private SinkRabbitMQParametersNetworkType networkType;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private SinkRabbitMQParametersProperties properties;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private SinkRabbitMQParametersQueueName queueName;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private SinkRabbitMQParametersRoutingKey routingKey;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private SinkRabbitMQParametersSecurityGroupId securityGroupId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private TargetType targetType;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private SinkRabbitMQParametersVSwitchIds vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
        private VirtualHostName virtualHostName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private SinkRabbitMQParametersVpcId vpcId;

        private SinkRabbitMQParameters(Builder builder) {
            this.body = builder.body;
            this.exchange = builder.exchange;
            this.instanceId = builder.instanceId;
            this.messageId = builder.messageId;
            this.networkType = builder.networkType;
            this.properties = builder.properties;
            this.queueName = builder.queueName;
            this.routingKey = builder.routingKey;
            this.securityGroupId = builder.securityGroupId;
            this.targetType = builder.targetType;
            this.vSwitchIds = builder.vSwitchIds;
            this.virtualHostName = builder.virtualHostName;
            this.vpcId = builder.vpcId;
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
        public SinkRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
        }

        /**
         * @return networkType
         */
        public SinkRabbitMQParametersNetworkType getNetworkType() {
            return this.networkType;
        }

        /**
         * @return properties
         */
        public SinkRabbitMQParametersProperties getProperties() {
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
        public SinkRabbitMQParametersRoutingKey getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return securityGroupId
         */
        public SinkRabbitMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return targetType
         */
        public TargetType getTargetType() {
            return this.targetType;
        }

        /**
         * @return vSwitchIds
         */
        public SinkRabbitMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return virtualHostName
         */
        public VirtualHostName getVirtualHostName() {
            return this.virtualHostName;
        }

        /**
         * @return vpcId
         */
        public SinkRabbitMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private SinkRabbitMQParametersBody body; 
            private Exchange exchange; 
            private SinkRabbitMQParametersInstanceId instanceId; 
            private SinkRabbitMQParametersMessageId messageId; 
            private SinkRabbitMQParametersNetworkType networkType; 
            private SinkRabbitMQParametersProperties properties; 
            private SinkRabbitMQParametersQueueName queueName; 
            private SinkRabbitMQParametersRoutingKey routingKey; 
            private SinkRabbitMQParametersSecurityGroupId securityGroupId; 
            private TargetType targetType; 
            private SinkRabbitMQParametersVSwitchIds vSwitchIds; 
            private VirtualHostName virtualHostName; 
            private SinkRabbitMQParametersVpcId vpcId; 

            private Builder() {
            } 

            private Builder(SinkRabbitMQParameters model) {
                this.body = model.body;
                this.exchange = model.exchange;
                this.instanceId = model.instanceId;
                this.messageId = model.messageId;
                this.networkType = model.networkType;
                this.properties = model.properties;
                this.queueName = model.queueName;
                this.routingKey = model.routingKey;
                this.securityGroupId = model.securityGroupId;
                this.targetType = model.targetType;
                this.vSwitchIds = model.vSwitchIds;
                this.virtualHostName = model.virtualHostName;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The message body.</p>
             */
            public Builder body(SinkRabbitMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The Exchange mode.</p>
             */
            public Builder exchange(Exchange exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * <p>The event target type is ApsaraMQ for RabbitMQ.</p>
             */
            public Builder instanceId(SinkRabbitMQParametersInstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The message ID.</p>
             */
            public Builder messageId(SinkRabbitMQParametersMessageId messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The network type.</p>
             */
            public Builder networkType(SinkRabbitMQParametersNetworkType networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The filtering properties.</p>
             */
            public Builder properties(SinkRabbitMQParametersProperties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The Queue mode.</p>
             */
            public Builder queueName(SinkRabbitMQParametersQueueName queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The routing rule of the message.</p>
             */
            public Builder routingKey(SinkRabbitMQParametersRoutingKey routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             */
            public Builder securityGroupId(SinkRabbitMQParametersSecurityGroupId securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The target type.</p>
             */
            public Builder targetType(TargetType targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(SinkRabbitMQParametersVSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             */
            public Builder virtualHostName(VirtualHostName virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             */
            public Builder vpcId(SinkRabbitMQParametersVpcId vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkRabbitMQParameters build() {
                return new SinkRabbitMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQCheckpointParametersConsumeTimestamp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQCheckpointParametersConsumeTimestamp(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQCheckpointParametersConsumeTimestamp create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQCheckpointParametersConsumeTimestamp model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rabbit-host</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQCheckpointParametersConsumeTimestamp build() {
                return new SinkRocketMQCheckpointParametersConsumeTimestamp(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQCheckpointParametersGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQCheckpointParametersGroup(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQCheckpointParametersGroup create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQCheckpointParametersGroup model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rabbit-host</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQCheckpointParametersGroup build() {
                return new SinkRocketMQCheckpointParametersGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQCheckpointParametersTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQCheckpointParametersTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQCheckpointParametersTopic create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQCheckpointParametersTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rabbit-host</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQCheckpointParametersTopic build() {
                return new SinkRocketMQCheckpointParametersTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQCheckpointParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeTimestamp")
        private SinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp;

        @com.aliyun.core.annotation.NameInMap("Group")
        private SinkRocketMQCheckpointParametersGroup group;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private SinkRocketMQCheckpointParametersTopic topic;

        private SinkRocketMQCheckpointParameters(Builder builder) {
            this.consumeTimestamp = builder.consumeTimestamp;
            this.group = builder.group;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQCheckpointParameters create() {
            return builder().build();
        }

        /**
         * @return consumeTimestamp
         */
        public SinkRocketMQCheckpointParametersConsumeTimestamp getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        /**
         * @return group
         */
        public SinkRocketMQCheckpointParametersGroup getGroup() {
            return this.group;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return topic
         */
        public SinkRocketMQCheckpointParametersTopic getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private SinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp; 
            private SinkRocketMQCheckpointParametersGroup group; 
            private String instanceId; 
            private String instanceType; 
            private SinkRocketMQCheckpointParametersTopic topic; 

            private Builder() {
            } 

            private Builder(SinkRocketMQCheckpointParameters model) {
                this.consumeTimestamp = model.consumeTimestamp;
                this.group = model.group;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.topic = model.topic;
            } 

            /**
             * ConsumeTimestamp.
             */
            public Builder consumeTimestamp(SinkRocketMQCheckpointParametersConsumeTimestamp consumeTimestamp) {
                this.consumeTimestamp = consumeTimestamp;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(SinkRocketMQCheckpointParametersGroup group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The event target type is ApsaraMQ for RabbitMQ.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The topic name.</p>
             */
            public Builder topic(SinkRocketMQCheckpointParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            public SinkRocketMQCheckpointParameters build() {
                return new SinkRocketMQCheckpointParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class DeliveryOrderType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DeliveryOrderType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryOrderType create() {
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

            private Builder() {
            } 

            private Builder(DeliveryOrderType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DeliveryOrderType build() {
                return new DeliveryOrderType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class InstanceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceEndpoint(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceEndpoint create() {
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

            private Builder() {
            } 

            private Builder(InstanceEndpoint model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-8vbsvkkbpf3vb0zef****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceEndpoint build() {
                return new InstanceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersInstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersInstanceId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance ID of ApsaraMQ for RocketMQ.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class InstancePassword extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstancePassword(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePassword create() {
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

            private Builder() {
            } 

            private Builder(InstancePassword model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance password.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstancePassword build() {
                return new InstancePassword(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
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

            private Builder() {
            } 

            private Builder(InstanceType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud_4</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class InstanceUsername extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceUsername(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceUsername create() {
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

            private Builder() {
            } 

            private Builder(InstanceUsername model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The instance username.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceUsername build() {
                return new InstanceUsername(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Keys model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Network(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
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

            private Builder() {
            } 

            private Builder(Network model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The network type:</p>
             * 
             * <strong>example:</strong>
             * <p>PublicNetwork</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersProperties model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersSecurityGroupId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQParametersSecurityGroupId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersSecurityGroupId create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersSecurityGroupId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b4bf375515f6440f942e3a20c33d****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersSecurityGroupId build() {
                return new SinkRocketMQParametersSecurityGroupId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ShardingKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ShardingKey(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardingKey create() {
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

            private Builder() {
            } 

            private Builder(ShardingKey model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b4bf375515f6440f942e3a20c33d****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ShardingKey build() {
                return new ShardingKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQParametersTags(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersTags create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersTags model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key&quot;: &quot;value&quot;
             * }</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersTags build() {
                return new SinkRocketMQParametersTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic name of the ApsaraMQ for RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Mytopic</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersVSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQParametersVSwitchIds(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersVSwitchIds create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersVSwitchIds model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-8vb835n3zf9shwl****mp</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersVSwitchIds build() {
                return new SinkRocketMQParametersVSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParametersVpcId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRocketMQParametersVpcId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRocketMQParametersVpcId create() {
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

            private Builder() {
            } 

            private Builder(SinkRocketMQParametersVpcId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The event transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-8vb835n3zf9shwlvb****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRocketMQParametersVpcId build() {
                return new SinkRocketMQParametersVpcId(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkRocketMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkRocketMQParametersBody body;

        @com.aliyun.core.annotation.NameInMap("DeliveryOrderType")
        private DeliveryOrderType deliveryOrderType;

        @com.aliyun.core.annotation.NameInMap("InstanceEndpoint")
        private InstanceEndpoint instanceEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private SinkRocketMQParametersInstanceId instanceId;

        @com.aliyun.core.annotation.NameInMap("InstancePassword")
        private InstancePassword instancePassword;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private InstanceType instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceUsername")
        private InstanceUsername instanceUsername;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private Keys keys;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private SinkRocketMQParametersProperties properties;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private SinkRocketMQParametersSecurityGroupId securityGroupId;

        @com.aliyun.core.annotation.NameInMap("ShardingKey")
        private ShardingKey shardingKey;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private SinkRocketMQParametersTags tags;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private SinkRocketMQParametersTopic topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private SinkRocketMQParametersVSwitchIds vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private SinkRocketMQParametersVpcId vpcId;

        private SinkRocketMQParameters(Builder builder) {
            this.body = builder.body;
            this.deliveryOrderType = builder.deliveryOrderType;
            this.instanceEndpoint = builder.instanceEndpoint;
            this.instanceId = builder.instanceId;
            this.instancePassword = builder.instancePassword;
            this.instanceType = builder.instanceType;
            this.instanceUsername = builder.instanceUsername;
            this.keys = builder.keys;
            this.network = builder.network;
            this.properties = builder.properties;
            this.securityGroupId = builder.securityGroupId;
            this.shardingKey = builder.shardingKey;
            this.tags = builder.tags;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
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
         * @return deliveryOrderType
         */
        public DeliveryOrderType getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        /**
         * @return instanceEndpoint
         */
        public InstanceEndpoint getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        /**
         * @return instanceId
         */
        public SinkRocketMQParametersInstanceId getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instancePassword
         */
        public InstancePassword getInstancePassword() {
            return this.instancePassword;
        }

        /**
         * @return instanceType
         */
        public InstanceType getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceUsername
         */
        public InstanceUsername getInstanceUsername() {
            return this.instanceUsername;
        }

        /**
         * @return keys
         */
        public Keys getKeys() {
            return this.keys;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return properties
         */
        public SinkRocketMQParametersProperties getProperties() {
            return this.properties;
        }

        /**
         * @return securityGroupId
         */
        public SinkRocketMQParametersSecurityGroupId getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return shardingKey
         */
        public ShardingKey getShardingKey() {
            return this.shardingKey;
        }

        /**
         * @return tags
         */
        public SinkRocketMQParametersTags getTags() {
            return this.tags;
        }

        /**
         * @return topic
         */
        public SinkRocketMQParametersTopic getTopic() {
            return this.topic;
        }

        /**
         * @return vSwitchIds
         */
        public SinkRocketMQParametersVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public SinkRocketMQParametersVpcId getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private SinkRocketMQParametersBody body; 
            private DeliveryOrderType deliveryOrderType; 
            private InstanceEndpoint instanceEndpoint; 
            private SinkRocketMQParametersInstanceId instanceId; 
            private InstancePassword instancePassword; 
            private InstanceType instanceType; 
            private InstanceUsername instanceUsername; 
            private Keys keys; 
            private Network network; 
            private SinkRocketMQParametersProperties properties; 
            private SinkRocketMQParametersSecurityGroupId securityGroupId; 
            private ShardingKey shardingKey; 
            private SinkRocketMQParametersTags tags; 
            private SinkRocketMQParametersTopic topic; 
            private SinkRocketMQParametersVSwitchIds vSwitchIds; 
            private SinkRocketMQParametersVpcId vpcId; 

            private Builder() {
            } 

            private Builder(SinkRocketMQParameters model) {
                this.body = model.body;
                this.deliveryOrderType = model.deliveryOrderType;
                this.instanceEndpoint = model.instanceEndpoint;
                this.instanceId = model.instanceId;
                this.instancePassword = model.instancePassword;
                this.instanceType = model.instanceType;
                this.instanceUsername = model.instanceUsername;
                this.keys = model.keys;
                this.network = model.network;
                this.properties = model.properties;
                this.securityGroupId = model.securityGroupId;
                this.shardingKey = model.shardingKey;
                this.tags = model.tags;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The message body.</p>
             */
            public Builder body(SinkRocketMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * DeliveryOrderType.
             */
            public Builder deliveryOrderType(DeliveryOrderType deliveryOrderType) {
                this.deliveryOrderType = deliveryOrderType;
                return this;
            }

            /**
             * <p>The instance endpoint.</p>
             */
            public Builder instanceEndpoint(InstanceEndpoint instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The event target type is ApsaraMQ for RocketMQ.</p>
             */
            public Builder instanceId(SinkRocketMQParametersInstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance password.</p>
             */
            public Builder instancePassword(InstancePassword instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * <p>The instance type.</p>
             */
            public Builder instanceType(InstanceType instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The instance username.</p>
             */
            public Builder instanceUsername(InstanceUsername instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * <p>The filtering properties.</p>
             */
            public Builder keys(Keys keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>The network type:</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The filtering properties.</p>
             */
            public Builder properties(SinkRocketMQParametersProperties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             */
            public Builder securityGroupId(SinkRocketMQParametersSecurityGroupId securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * ShardingKey.
             */
            public Builder shardingKey(ShardingKey shardingKey) {
                this.shardingKey = shardingKey;
                return this;
            }

            /**
             * <p>The filtering properties.</p>
             */
            public Builder tags(SinkRocketMQParametersTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The topic of the ApsaraMQ for RocketMQ instance.</p>
             */
            public Builder topic(SinkRocketMQParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             */
            public Builder vSwitchIds(SinkRocketMQParametersVSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             */
            public Builder vpcId(SinkRocketMQParametersVpcId vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SinkRocketMQParameters build() {
                return new SinkRocketMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkSLSParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkSLSParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;key&quot;: &quot;value&quot;
             * }</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ContentSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ContentSchema(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentSchema create() {
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

            private Builder() {
            } 

            private Builder(ContentSchema model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The template style.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Key_1&quot;:{&quot;form&quot;:&quot;CONSTANT&quot;,&quot;value&quot;:&quot;demoKey&quot;},&quot;Value_1&quot;:{&quot;form&quot;:&quot;JSONPATH&quot;,&quot;value&quot;:&quot;$.data.value&quot;}}</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ContentSchema build() {
                return new ContentSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class ContentType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ContentType(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentType create() {
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

            private Builder() {
            } 

            private Builder(ContentType model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template style.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before transformation.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ContentType build() {
                return new ContentType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class LogStore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(LogStore model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test-logstore</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkSLSParametersProject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkSLSParametersProject(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkSLSParametersProject create() {
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

            private Builder() {
            } 

            private Builder(SinkSLSParametersProject model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkSLSParametersProject build() {
                return new SinkSLSParametersProject(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkSLSParametersRoleName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkSLSParametersRoleName model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The role that provides authorization for the event bus EventBridge to read SLS log content. The following conditions must be met: when you create the role used by the service in the Resource Access Management (RAM) console, select &quot;Alibaba Cloud Service&quot; and set &quot;Trusted Service&quot; to &quot;event bus&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>testRole</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkSLSParametersTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SinkSLSParametersTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The transformation format. Default value: CONSTANT.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>None.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The topic of the log, which corresponds to the SLS reserved field &quot;<strong>topic</strong>&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>testTopic</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SinkSLSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkSLSParametersBody body;

        @com.aliyun.core.annotation.NameInMap("ContentSchema")
        private ContentSchema contentSchema;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private ContentType contentType;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private LogStore logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private SinkSLSParametersProject project;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private SinkSLSParametersRoleName roleName;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private SinkSLSParametersTopic topic;

        private SinkSLSParameters(Builder builder) {
            this.body = builder.body;
            this.contentSchema = builder.contentSchema;
            this.contentType = builder.contentType;
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
         * @return contentSchema
         */
        public ContentSchema getContentSchema() {
            return this.contentSchema;
        }

        /**
         * @return contentType
         */
        public ContentType getContentType() {
            return this.contentType;
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
        public SinkSLSParametersProject getProject() {
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
            private ContentSchema contentSchema; 
            private ContentType contentType; 
            private LogStore logStore; 
            private SinkSLSParametersProject project; 
            private SinkSLSParametersRoleName roleName; 
            private SinkSLSParametersTopic topic; 

            private Builder() {
            } 

            private Builder(SinkSLSParameters model) {
                this.body = model.body;
                this.contentSchema = model.contentSchema;
                this.contentType = model.contentType;
                this.logStore = model.logStore;
                this.project = model.project;
                this.roleName = model.roleName;
                this.topic = model.topic;
            } 

            /**
             * <p>The content sent to SLS.</p>
             */
            public Builder body(SinkSLSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The custom log key-value pairs. This parameter takes effect only when ContentType is set to KeyValue. Each key-value pair is represented by Key_n and Value_n.</p>
             */
            public Builder contentSchema(ContentSchema contentSchema) {
                this.contentSchema = contentSchema;
                return this;
            }

            /**
             * <p>The SLS data format. You can select the default format or configure a specified key-value pair.</p>
             */
            public Builder contentType(ContentType contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The Log Service Logstore.</p>
             */
            public Builder logStore(LogStore logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The Log Service project.</p>
             */
            public Builder project(SinkSLSParametersProject project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The role that provides authorization for the event bus EventBridge to read SLS log content. The following conditions must be met: when you create the role used by the service in the Resource Access Management (RAM) console, select &quot;Alibaba Cloud Service&quot; and set &quot;Trusted Service&quot; to &quot;event bus&quot;.</p>
             */
            public Builder roleName(SinkSLSParametersRoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The topic of the log, which corresponds to the SLS reserved field &quot;<strong>topic</strong>&quot;.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SinkAgentRunParameters")
        private SinkAgentRunParameters sinkAgentRunParameters;

        @com.aliyun.core.annotation.NameInMap("SinkApacheKafkaParameters")
        private SinkApacheKafkaParameters sinkApacheKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkApacheRocketMQCheckpointParameters")
        private SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

        @com.aliyun.core.annotation.NameInMap("SinkApiDestinationParameters")
        private SinkApiDestinationParameters sinkApiDestinationParameters;

        @com.aliyun.core.annotation.NameInMap("SinkBaiLianParameters")
        private SinkBaiLianParameters sinkBaiLianParameters;

        @com.aliyun.core.annotation.NameInMap("SinkCustomizedKafkaConnectorParameters")
        private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        @com.aliyun.core.annotation.NameInMap("SinkCustomizedKafkaParameters")
        private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkDashVectorParameters")
        private SinkDashVectorParameters sinkDashVectorParameters;

        @com.aliyun.core.annotation.NameInMap("SinkDataHubParameters")
        private SinkDataHubParameters sinkDataHubParameters;

        @com.aliyun.core.annotation.NameInMap("SinkDataWorksTriggerParameters")
        private SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters;

        @com.aliyun.core.annotation.NameInMap("SinkDorisParameters")
        private SinkDorisParameters sinkDorisParameters;

        @com.aliyun.core.annotation.NameInMap("SinkEventHouseParameters")
        private SinkEventHouseParameters sinkEventHouseParameters;

        @com.aliyun.core.annotation.NameInMap("SinkFcParameters")
        private SinkFcParameters sinkFcParameters;

        @com.aliyun.core.annotation.NameInMap("SinkFnfParameters")
        private SinkFnfParameters sinkFnfParameters;

        @com.aliyun.core.annotation.NameInMap("SinkHttpsParameters")
        private SinkHttpsParameters sinkHttpsParameters;

        @com.aliyun.core.annotation.NameInMap("SinkKafkaParameters")
        private SinkKafkaParameters sinkKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkMNSParameters")
        private SinkMNSParameters sinkMNSParameters;

        @com.aliyun.core.annotation.NameInMap("SinkMQTTParameters")
        private SinkMQTTParameters sinkMQTTParameters;

        @com.aliyun.core.annotation.NameInMap("SinkOSSParameters")
        private SinkOSSParameters sinkOSSParameters;

        @com.aliyun.core.annotation.NameInMap("SinkOpenSourceRabbitMQParameters")
        private SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkPrometheusParameters")
        private SinkPrometheusParameters sinkPrometheusParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRabbitMQMetaParameters")
        private SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRabbitMQMsgSyncParameters")
        private SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRabbitMQParameters")
        private SinkRabbitMQParameters sinkRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRocketMQCheckpointParameters")
        private SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRocketMQParameters")
        private SinkRocketMQParameters sinkRocketMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkSLSParameters")
        private SinkSLSParameters sinkSLSParameters;

        private Sink(Builder builder) {
            this.sinkAgentRunParameters = builder.sinkAgentRunParameters;
            this.sinkApacheKafkaParameters = builder.sinkApacheKafkaParameters;
            this.sinkApacheRocketMQCheckpointParameters = builder.sinkApacheRocketMQCheckpointParameters;
            this.sinkApiDestinationParameters = builder.sinkApiDestinationParameters;
            this.sinkBaiLianParameters = builder.sinkBaiLianParameters;
            this.sinkCustomizedKafkaConnectorParameters = builder.sinkCustomizedKafkaConnectorParameters;
            this.sinkCustomizedKafkaParameters = builder.sinkCustomizedKafkaParameters;
            this.sinkDashVectorParameters = builder.sinkDashVectorParameters;
            this.sinkDataHubParameters = builder.sinkDataHubParameters;
            this.sinkDataWorksTriggerParameters = builder.sinkDataWorksTriggerParameters;
            this.sinkDorisParameters = builder.sinkDorisParameters;
            this.sinkEventHouseParameters = builder.sinkEventHouseParameters;
            this.sinkFcParameters = builder.sinkFcParameters;
            this.sinkFnfParameters = builder.sinkFnfParameters;
            this.sinkHttpsParameters = builder.sinkHttpsParameters;
            this.sinkKafkaParameters = builder.sinkKafkaParameters;
            this.sinkMNSParameters = builder.sinkMNSParameters;
            this.sinkMQTTParameters = builder.sinkMQTTParameters;
            this.sinkOSSParameters = builder.sinkOSSParameters;
            this.sinkOpenSourceRabbitMQParameters = builder.sinkOpenSourceRabbitMQParameters;
            this.sinkPrometheusParameters = builder.sinkPrometheusParameters;
            this.sinkRabbitMQMetaParameters = builder.sinkRabbitMQMetaParameters;
            this.sinkRabbitMQMsgSyncParameters = builder.sinkRabbitMQMsgSyncParameters;
            this.sinkRabbitMQParameters = builder.sinkRabbitMQParameters;
            this.sinkRocketMQCheckpointParameters = builder.sinkRocketMQCheckpointParameters;
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
         * @return sinkAgentRunParameters
         */
        public SinkAgentRunParameters getSinkAgentRunParameters() {
            return this.sinkAgentRunParameters;
        }

        /**
         * @return sinkApacheKafkaParameters
         */
        public SinkApacheKafkaParameters getSinkApacheKafkaParameters() {
            return this.sinkApacheKafkaParameters;
        }

        /**
         * @return sinkApacheRocketMQCheckpointParameters
         */
        public SinkApacheRocketMQCheckpointParameters getSinkApacheRocketMQCheckpointParameters() {
            return this.sinkApacheRocketMQCheckpointParameters;
        }

        /**
         * @return sinkApiDestinationParameters
         */
        public SinkApiDestinationParameters getSinkApiDestinationParameters() {
            return this.sinkApiDestinationParameters;
        }

        /**
         * @return sinkBaiLianParameters
         */
        public SinkBaiLianParameters getSinkBaiLianParameters() {
            return this.sinkBaiLianParameters;
        }

        /**
         * @return sinkCustomizedKafkaConnectorParameters
         */
        public SinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
            return this.sinkCustomizedKafkaConnectorParameters;
        }

        /**
         * @return sinkCustomizedKafkaParameters
         */
        public SinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
            return this.sinkCustomizedKafkaParameters;
        }

        /**
         * @return sinkDashVectorParameters
         */
        public SinkDashVectorParameters getSinkDashVectorParameters() {
            return this.sinkDashVectorParameters;
        }

        /**
         * @return sinkDataHubParameters
         */
        public SinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
        }

        /**
         * @return sinkDataWorksTriggerParameters
         */
        public SinkDataWorksTriggerParameters getSinkDataWorksTriggerParameters() {
            return this.sinkDataWorksTriggerParameters;
        }

        /**
         * @return sinkDorisParameters
         */
        public SinkDorisParameters getSinkDorisParameters() {
            return this.sinkDorisParameters;
        }

        /**
         * @return sinkEventHouseParameters
         */
        public SinkEventHouseParameters getSinkEventHouseParameters() {
            return this.sinkEventHouseParameters;
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
         * @return sinkHttpsParameters
         */
        public SinkHttpsParameters getSinkHttpsParameters() {
            return this.sinkHttpsParameters;
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
         * @return sinkMQTTParameters
         */
        public SinkMQTTParameters getSinkMQTTParameters() {
            return this.sinkMQTTParameters;
        }

        /**
         * @return sinkOSSParameters
         */
        public SinkOSSParameters getSinkOSSParameters() {
            return this.sinkOSSParameters;
        }

        /**
         * @return sinkOpenSourceRabbitMQParameters
         */
        public SinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
            return this.sinkOpenSourceRabbitMQParameters;
        }

        /**
         * @return sinkPrometheusParameters
         */
        public SinkPrometheusParameters getSinkPrometheusParameters() {
            return this.sinkPrometheusParameters;
        }

        /**
         * @return sinkRabbitMQMetaParameters
         */
        public SinkRabbitMQMetaParameters getSinkRabbitMQMetaParameters() {
            return this.sinkRabbitMQMetaParameters;
        }

        /**
         * @return sinkRabbitMQMsgSyncParameters
         */
        public SinkRabbitMQMsgSyncParameters getSinkRabbitMQMsgSyncParameters() {
            return this.sinkRabbitMQMsgSyncParameters;
        }

        /**
         * @return sinkRabbitMQParameters
         */
        public SinkRabbitMQParameters getSinkRabbitMQParameters() {
            return this.sinkRabbitMQParameters;
        }

        /**
         * @return sinkRocketMQCheckpointParameters
         */
        public SinkRocketMQCheckpointParameters getSinkRocketMQCheckpointParameters() {
            return this.sinkRocketMQCheckpointParameters;
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
            private SinkAgentRunParameters sinkAgentRunParameters; 
            private SinkApacheKafkaParameters sinkApacheKafkaParameters; 
            private SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters; 
            private SinkApiDestinationParameters sinkApiDestinationParameters; 
            private SinkBaiLianParameters sinkBaiLianParameters; 
            private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters; 
            private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters; 
            private SinkDashVectorParameters sinkDashVectorParameters; 
            private SinkDataHubParameters sinkDataHubParameters; 
            private SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters; 
            private SinkDorisParameters sinkDorisParameters; 
            private SinkEventHouseParameters sinkEventHouseParameters; 
            private SinkFcParameters sinkFcParameters; 
            private SinkFnfParameters sinkFnfParameters; 
            private SinkHttpsParameters sinkHttpsParameters; 
            private SinkKafkaParameters sinkKafkaParameters; 
            private SinkMNSParameters sinkMNSParameters; 
            private SinkMQTTParameters sinkMQTTParameters; 
            private SinkOSSParameters sinkOSSParameters; 
            private SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters; 
            private SinkPrometheusParameters sinkPrometheusParameters; 
            private SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters; 
            private SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters; 
            private SinkRabbitMQParameters sinkRabbitMQParameters; 
            private SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters; 
            private SinkRocketMQParameters sinkRocketMQParameters; 
            private SinkSLSParameters sinkSLSParameters; 

            private Builder() {
            } 

            private Builder(Sink model) {
                this.sinkAgentRunParameters = model.sinkAgentRunParameters;
                this.sinkApacheKafkaParameters = model.sinkApacheKafkaParameters;
                this.sinkApacheRocketMQCheckpointParameters = model.sinkApacheRocketMQCheckpointParameters;
                this.sinkApiDestinationParameters = model.sinkApiDestinationParameters;
                this.sinkBaiLianParameters = model.sinkBaiLianParameters;
                this.sinkCustomizedKafkaConnectorParameters = model.sinkCustomizedKafkaConnectorParameters;
                this.sinkCustomizedKafkaParameters = model.sinkCustomizedKafkaParameters;
                this.sinkDashVectorParameters = model.sinkDashVectorParameters;
                this.sinkDataHubParameters = model.sinkDataHubParameters;
                this.sinkDataWorksTriggerParameters = model.sinkDataWorksTriggerParameters;
                this.sinkDorisParameters = model.sinkDorisParameters;
                this.sinkEventHouseParameters = model.sinkEventHouseParameters;
                this.sinkFcParameters = model.sinkFcParameters;
                this.sinkFnfParameters = model.sinkFnfParameters;
                this.sinkHttpsParameters = model.sinkHttpsParameters;
                this.sinkKafkaParameters = model.sinkKafkaParameters;
                this.sinkMNSParameters = model.sinkMNSParameters;
                this.sinkMQTTParameters = model.sinkMQTTParameters;
                this.sinkOSSParameters = model.sinkOSSParameters;
                this.sinkOpenSourceRabbitMQParameters = model.sinkOpenSourceRabbitMQParameters;
                this.sinkPrometheusParameters = model.sinkPrometheusParameters;
                this.sinkRabbitMQMetaParameters = model.sinkRabbitMQMetaParameters;
                this.sinkRabbitMQMsgSyncParameters = model.sinkRabbitMQMsgSyncParameters;
                this.sinkRabbitMQParameters = model.sinkRabbitMQParameters;
                this.sinkRocketMQCheckpointParameters = model.sinkRocketMQCheckpointParameters;
                this.sinkRocketMQParameters = model.sinkRocketMQParameters;
                this.sinkSLSParameters = model.sinkSLSParameters;
            } 

            /**
             * SinkAgentRunParameters.
             */
            public Builder sinkAgentRunParameters(SinkAgentRunParameters sinkAgentRunParameters) {
                this.sinkAgentRunParameters = sinkAgentRunParameters;
                return this;
            }

            /**
             * <p>The description.</p>
             */
            public Builder sinkApacheKafkaParameters(SinkApacheKafkaParameters sinkApacheKafkaParameters) {
                this.sinkApacheKafkaParameters = sinkApacheKafkaParameters;
                return this;
            }

            /**
             * <p>The event source type.</p>
             */
            public Builder sinkApacheRocketMQCheckpointParameters(SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
                this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
                return this;
            }

            /**
             * SinkApiDestinationParameters.
             */
            public Builder sinkApiDestinationParameters(SinkApiDestinationParameters sinkApiDestinationParameters) {
                this.sinkApiDestinationParameters = sinkApiDestinationParameters;
                return this;
            }

            /**
             * SinkBaiLianParameters.
             */
            public Builder sinkBaiLianParameters(SinkBaiLianParameters sinkBaiLianParameters) {
                this.sinkBaiLianParameters = sinkBaiLianParameters;
                return this;
            }

            /**
             * <p>The Sink Kafka connector parameters.</p>
             */
            public Builder sinkCustomizedKafkaConnectorParameters(SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
                this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
                return this;
            }

            /**
             * <p>The Sink Kafka parameters.</p>
             */
            public Builder sinkCustomizedKafkaParameters(SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
                this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
                return this;
            }

            /**
             * <p>The Sink DashVector parameters.</p>
             */
            public Builder sinkDashVectorParameters(SinkDashVectorParameters sinkDashVectorParameters) {
                this.sinkDashVectorParameters = sinkDashVectorParameters;
                return this;
            }

            /**
             * <p>The Sink DataHub parameters.</p>
             */
            public Builder sinkDataHubParameters(SinkDataHubParameters sinkDataHubParameters) {
                this.sinkDataHubParameters = sinkDataHubParameters;
                return this;
            }

            /**
             * SinkDataWorksTriggerParameters.
             */
            public Builder sinkDataWorksTriggerParameters(SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters) {
                this.sinkDataWorksTriggerParameters = sinkDataWorksTriggerParameters;
                return this;
            }

            /**
             * <p>The event source type.</p>
             */
            public Builder sinkDorisParameters(SinkDorisParameters sinkDorisParameters) {
                this.sinkDorisParameters = sinkDorisParameters;
                return this;
            }

            /**
             * <p>The event target name.</p>
             */
            public Builder sinkEventHouseParameters(SinkEventHouseParameters sinkEventHouseParameters) {
                this.sinkEventHouseParameters = sinkEventHouseParameters;
                return this;
            }

            /**
             * <p>The function target.</p>
             */
            public Builder sinkFcParameters(SinkFcParameters sinkFcParameters) {
                this.sinkFcParameters = sinkFcParameters;
                return this;
            }

            /**
             * <p>The Sink Fnf parameters.</p>
             */
            public Builder sinkFnfParameters(SinkFnfParameters sinkFnfParameters) {
                this.sinkFnfParameters = sinkFnfParameters;
                return this;
            }

            /**
             * SinkHttpsParameters.
             */
            public Builder sinkHttpsParameters(SinkHttpsParameters sinkHttpsParameters) {
                this.sinkHttpsParameters = sinkHttpsParameters;
                return this;
            }

            /**
             * <p>The Sink Kafka parameters.</p>
             */
            public Builder sinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
                this.sinkKafkaParameters = sinkKafkaParameters;
                return this;
            }

            /**
             * <p>The MNS event target.</p>
             */
            public Builder sinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
                this.sinkMNSParameters = sinkMNSParameters;
                return this;
            }

            /**
             * SinkMQTTParameters.
             */
            public Builder sinkMQTTParameters(SinkMQTTParameters sinkMQTTParameters) {
                this.sinkMQTTParameters = sinkMQTTParameters;
                return this;
            }

            /**
             * SinkOSSParameters.
             */
            public Builder sinkOSSParameters(SinkOSSParameters sinkOSSParameters) {
                this.sinkOSSParameters = sinkOSSParameters;
                return this;
            }

            /**
             * SinkOpenSourceRabbitMQParameters.
             */
            public Builder sinkOpenSourceRabbitMQParameters(SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
                this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
                return this;
            }

            /**
             * <p>The Sink Prometheus parameters.</p>
             */
            public Builder sinkPrometheusParameters(SinkPrometheusParameters sinkPrometheusParameters) {
                this.sinkPrometheusParameters = sinkPrometheusParameters;
                return this;
            }

            /**
             * SinkRabbitMQMetaParameters.
             */
            public Builder sinkRabbitMQMetaParameters(SinkRabbitMQMetaParameters sinkRabbitMQMetaParameters) {
                this.sinkRabbitMQMetaParameters = sinkRabbitMQMetaParameters;
                return this;
            }

            /**
             * SinkRabbitMQMsgSyncParameters.
             */
            public Builder sinkRabbitMQMsgSyncParameters(SinkRabbitMQMsgSyncParameters sinkRabbitMQMsgSyncParameters) {
                this.sinkRabbitMQMsgSyncParameters = sinkRabbitMQMsgSyncParameters;
                return this;
            }

            /**
             * <p>The parameters for the Sink RabbitMQ.</p>
             */
            public Builder sinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
                this.sinkRabbitMQParameters = sinkRabbitMQParameters;
                return this;
            }

            /**
             * <p>The event source type.</p>
             */
            public Builder sinkRocketMQCheckpointParameters(SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
                this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
                return this;
            }

            /**
             * <p>Sink RocketMQ Parameters</p>
             */
            public Builder sinkRocketMQParameters(SinkRocketMQParameters sinkRocketMQParameters) {
                this.sinkRocketMQParameters = sinkRocketMQParameters;
                return this;
            }

            /**
             * <p>Sink SLS Parameters</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceApacheKafkaParametersSslKeystoreKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KmsArn")
        private String kmsArn;

        @com.aliyun.core.annotation.NameInMap("KmsSecretValueKey")
        private String kmsSecretValueKey;

        private SourceApacheKafkaParametersSslKeystoreKey(Builder builder) {
            this.kmsArn = builder.kmsArn;
            this.kmsSecretValueKey = builder.kmsSecretValueKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceApacheKafkaParametersSslKeystoreKey create() {
            return builder().build();
        }

        /**
         * @return kmsArn
         */
        public String getKmsArn() {
            return this.kmsArn;
        }

        /**
         * @return kmsSecretValueKey
         */
        public String getKmsSecretValueKey() {
            return this.kmsSecretValueKey;
        }

        public static final class Builder {
            private String kmsArn; 
            private String kmsSecretValueKey; 

            private Builder() {
            } 

            private Builder(SourceApacheKafkaParametersSslKeystoreKey model) {
                this.kmsArn = model.kmsArn;
                this.kmsSecretValueKey = model.kmsSecretValueKey;
            } 

            /**
             * <p>[Required] The KMS resource ARN that stores the SSL private key. Used to locate the Key Management Service instance that stores the client private key. Format example: \&quot;acs:kms:cn-hangzhou:123456789:secret/ssl-keystore-key-xxxx\&quot;. Obtain this value from the ARN information of the corresponding key in the KMS console.</p>
             */
            public Builder kmsArn(String kmsArn) {
                this.kmsArn = kmsArn;
                return this;
            }

            /**
             * <p>[KMS KV mode] The key name in the KMS credential. When the KMS credential is stored in key-value (KV) format, specify this parameter to indicate the key corresponding to the SSL private key. Example: if the KMS credential is \&quot;{&quot;ssl_keystore_key&quot;:&quot;-----BEGIN PRIVATE KEY-----...&quot;,&quot;ssl_truststore_key&quot;:&quot;...&quot;}\&quot;, enter \&quot;ssl_keystore_key\&quot;. Leave empty if the KMS credential is in plain text mode (directly storing the PEM content of the private key).</p>
             */
            public Builder kmsSecretValueKey(String kmsSecretValueKey) {
                this.kmsSecretValueKey = kmsSecretValueKey;
                return this;
            }

            public SourceApacheKafkaParametersSslKeystoreKey build() {
                return new SourceApacheKafkaParametersSslKeystoreKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceApacheKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bootstraps")
        private String bootstraps;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
        private String consumerGroup;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("OffsetReset")
        private String offsetReset;

        @com.aliyun.core.annotation.NameInMap("SaslMechanism")
        private String saslMechanism;

        @com.aliyun.core.annotation.NameInMap("SaslPassword")
        private String saslPassword;

        @com.aliyun.core.annotation.NameInMap("SaslUser")
        private String saslUser;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityProtocol")
        private String securityProtocol;

        @com.aliyun.core.annotation.NameInMap("SslKeyPassword")
        private String sslKeyPassword;

        @com.aliyun.core.annotation.NameInMap("SslKeystoreCertificateChain")
        private String sslKeystoreCertificateChain;

        @com.aliyun.core.annotation.NameInMap("SslKeystoreKey")
        private SourceApacheKafkaParametersSslKeystoreKey sslKeystoreKey;

        @com.aliyun.core.annotation.NameInMap("SslTruststoreCertificates")
        private String sslTruststoreCertificates;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ValueDataType")
        private String valueDataType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceApacheKafkaParameters(Builder builder) {
            this.bootstraps = builder.bootstraps;
            this.consumerGroup = builder.consumerGroup;
            this.networkType = builder.networkType;
            this.offsetReset = builder.offsetReset;
            this.saslMechanism = builder.saslMechanism;
            this.saslPassword = builder.saslPassword;
            this.saslUser = builder.saslUser;
            this.securityGroupId = builder.securityGroupId;
            this.securityProtocol = builder.securityProtocol;
            this.sslKeyPassword = builder.sslKeyPassword;
            this.sslKeystoreCertificateChain = builder.sslKeystoreCertificateChain;
            this.sslKeystoreKey = builder.sslKeystoreKey;
            this.sslTruststoreCertificates = builder.sslTruststoreCertificates;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.valueDataType = builder.valueDataType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceApacheKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return bootstraps
         */
        public String getBootstraps() {
            return this.bootstraps;
        }

        /**
         * @return consumerGroup
         */
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return offsetReset
         */
        public String getOffsetReset() {
            return this.offsetReset;
        }

        /**
         * @return saslMechanism
         */
        public String getSaslMechanism() {
            return this.saslMechanism;
        }

        /**
         * @return saslPassword
         */
        public String getSaslPassword() {
            return this.saslPassword;
        }

        /**
         * @return saslUser
         */
        public String getSaslUser() {
            return this.saslUser;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityProtocol
         */
        public String getSecurityProtocol() {
            return this.securityProtocol;
        }

        /**
         * @return sslKeyPassword
         */
        public String getSslKeyPassword() {
            return this.sslKeyPassword;
        }

        /**
         * @return sslKeystoreCertificateChain
         */
        public String getSslKeystoreCertificateChain() {
            return this.sslKeystoreCertificateChain;
        }

        /**
         * @return sslKeystoreKey
         */
        public SourceApacheKafkaParametersSslKeystoreKey getSslKeystoreKey() {
            return this.sslKeystoreKey;
        }

        /**
         * @return sslTruststoreCertificates
         */
        public String getSslTruststoreCertificates() {
            return this.sslTruststoreCertificates;
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
            private String bootstraps; 
            private String consumerGroup; 
            private String networkType; 
            private String offsetReset; 
            private String saslMechanism; 
            private String saslPassword; 
            private String saslUser; 
            private String securityGroupId; 
            private String securityProtocol; 
            private String sslKeyPassword; 
            private String sslKeystoreCertificateChain; 
            private SourceApacheKafkaParametersSslKeystoreKey sslKeystoreKey; 
            private String sslTruststoreCertificates; 
            private String topic; 
            private String vSwitchIds; 
            private String valueDataType; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceApacheKafkaParameters model) {
                this.bootstraps = model.bootstraps;
                this.consumerGroup = model.consumerGroup;
                this.networkType = model.networkType;
                this.offsetReset = model.offsetReset;
                this.saslMechanism = model.saslMechanism;
                this.saslPassword = model.saslPassword;
                this.saslUser = model.saslUser;
                this.securityGroupId = model.securityGroupId;
                this.securityProtocol = model.securityProtocol;
                this.sslKeyPassword = model.sslKeyPassword;
                this.sslKeystoreCertificateChain = model.sslKeystoreCertificateChain;
                this.sslKeystoreKey = model.sslKeystoreKey;
                this.sslTruststoreCertificates = model.sslTruststoreCertificates;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.valueDataType = model.valueDataType;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The bootstrap servers endpoint.</p>
             */
            public Builder bootstraps(String bootstraps) {
                this.bootstraps = bootstraps;
                return this;
            }

            /**
             * <p>The consumer group name.</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The Kafka network type.</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The consumer offset.</p>
             */
            public Builder offsetReset(String offsetReset) {
                this.offsetReset = offsetReset;
                return this;
            }

            /**
             * <p>The Kafka SASL authentication mechanism.</p>
             */
            public Builder saslMechanism(String saslMechanism) {
                this.saslMechanism = saslMechanism;
                return this;
            }

            /**
             * <p>The Kafka SASL authentication password.</p>
             */
            public Builder saslPassword(String saslPassword) {
                this.saslPassword = saslPassword;
                return this;
            }

            /**
             * <p>The Kafka SASL authentication username.</p>
             */
            public Builder saslUser(String saslUser) {
                this.saslUser = saslUser;
                return this;
            }

            /**
             * <p>The security group ID of the Kafka source.</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The Kafka security protocol type.</p>
             */
            public Builder securityProtocol(String securityProtocol) {
                this.securityProtocol = securityProtocol;
                return this;
            }

            /**
             * <p>[Required for encrypted private key] The Kafka client private key password. Required when the client private key is encrypted with a password (the PEM file contains \&quot;Proc-Type: 4,ENCRYPTED\&quot; or \&quot;ENCRYPTED\&quot; markers). Leave empty if the private key is not encrypted. Note: This password is only used to decrypt the private key and is unrelated to Kafka authentication.</p>
             */
            public Builder sslKeyPassword(String sslKeyPassword) {
                this.sslKeyPassword = sslKeyPassword;
                return this;
            }

            /**
             * <p>[Required for mutual authentication] The Kafka client certificate chain. Required when the Kafka server enables mutual SSL authentication (ssl.client.auth=required). Format: Base64-encoded PEM format, containing the client certificate and the complete certificate chain (client certificate first, intermediate CA certificate next, root CA certificate optional). Note: Ensure that the beginning and end of each PEM file content are \&quot;-----BEGIN CERTIFICATE-----\&quot; and \&quot;-----END CERTIFICATE-----\&quot; respectively, then Base64-encode the concatenated content.</p>
             */
            public Builder sslKeystoreCertificateChain(String sslKeystoreCertificateChain) {
                this.sslKeystoreCertificateChain = sslKeystoreCertificateChain;
                return this;
            }

            /**
             * <p>[Required for bidirectional authentication] The SSL private key configuration object. Required when the Kafka server enables bidirectional SSL authentication. Only KMS pattern is supported: specify the Key Management Service EPS resource that stores the private key through KmsArn. The system retrieves the private key content from KMS only in memory, providing higher security. Configuration example: {\&quot;KmsArn\&quot;: \&quot;acs:kms:cn-hangzhou:123456789:secret/ssl-key-xxxx\&quot;, \&quot;KmsSecretValueKey\&quot;: \&quot;keystore_private_key\&quot;}.</p>
             */
            public Builder sslKeystoreKey(SourceApacheKafkaParametersSslKeystoreKey sslKeystoreKey) {
                this.sslKeystoreKey = sslKeystoreKey;
                return this;
            }

            /**
             * <p>[Required for SSL] The Kafka server trust certificate. Used to authenticate the legitimacy of the Kafka Broker SSL certificate and prevent man-in-the-middle attacks. Format: Base64 encoding of PEM format, typically containing the Kafka server CA certificate or the server certificate itself. Example: Base64-encode the PEM file content of the CA certificate (ensure the beginning and end are \&quot;-----BEGIN CERTIFICATE-----\&quot; and \&quot;-----END CERTIFICATE-----\&quot;). If Kafka uses a self-signed certificate, provide the CA certificate that issued the certificate.</p>
             */
            public Builder sslTruststoreCertificates(String sslTruststoreCertificates) {
                this.sslTruststoreCertificates = sslTruststoreCertificates;
                return this;
            }

            /**
             * <p>The topic name.</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs of the Kafka source.</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             */
            public Builder valueDataType(String valueDataType) {
                this.valueDataType = valueDataType;
                return this;
            }

            /**
             * <p>The VPC ID of the Kafka source.</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceApacheKafkaParameters build() {
                return new SourceApacheKafkaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceApacheRocketMQCheckpointParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstancePassword")
        private String instancePassword;

        @com.aliyun.core.annotation.NameInMap("InstanceUsername")
        private String instanceUsername;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Topics")
        private java.util.List<String> topics;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceApacheRocketMQCheckpointParameters(Builder builder) {
            this.instanceEndpoint = builder.instanceEndpoint;
            this.instancePassword = builder.instancePassword;
            this.instanceUsername = builder.instanceUsername;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.topics = builder.topics;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceApacheRocketMQCheckpointParameters create() {
            return builder().build();
        }

        /**
         * @return instanceEndpoint
         */
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        /**
         * @return instancePassword
         */
        public String getInstancePassword() {
            return this.instancePassword;
        }

        /**
         * @return instanceUsername
         */
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return topics
         */
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String instanceEndpoint; 
            private String instancePassword; 
            private String instanceUsername; 
            private String networkType; 
            private String regionId; 
            private String securityGroupId; 
            private java.util.List<String> topics; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceApacheRocketMQCheckpointParameters model) {
                this.instanceEndpoint = model.instanceEndpoint;
                this.instancePassword = model.instancePassword;
                this.instanceUsername = model.instanceUsername;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.topics = model.topics;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The instance endpoint.</p>
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The instance password.</p>
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * <p>The instance username.</p>
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * <p>The network type.</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The message topic.</p>
             */
            public Builder topics(java.util.List<String> topics) {
                this.topics = topics;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceApacheRocketMQCheckpointParameters build() {
                return new SourceApacheRocketMQCheckpointParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SourceCustomizedKafkaConnectorParametersConnectorParameters(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCustomizedKafkaConnectorParametersConnectorParameters create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map<String, ?> config; 
            private String name; 

            private Builder() {
            } 

            private Builder(SourceCustomizedKafkaConnectorParametersConnectorParameters model) {
                this.config = model.config;
                this.name = model.name;
            } 

            /**
             * <p>The connector configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *           &quot;connector.class&quot;: &quot;com.mongodb.kafka.connect.MongoSinkConnector&quot;,
             *           &quot;tasks.max&quot;: &quot;1&quot;,
             *           &quot;topics&quot;: &quot;sourceA,sourceB&quot;
             *         }</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The connector name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SourceCustomizedKafkaConnectorParametersConnectorParameters build() {
                return new SourceCustomizedKafkaConnectorParametersConnectorParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceCustomizedKafkaConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorPackageUrl")
        private String connectorPackageUrl;

        @com.aliyun.core.annotation.NameInMap("ConnectorParameters")
        private SourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @com.aliyun.core.annotation.NameInMap("WorkerParameters")
        private java.util.Map<String, ?> workerParameters;

        private SourceCustomizedKafkaConnectorParameters(Builder builder) {
            this.connectorPackageUrl = builder.connectorPackageUrl;
            this.connectorParameters = builder.connectorParameters;
            this.workerParameters = builder.workerParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCustomizedKafkaConnectorParameters create() {
            return builder().build();
        }

        /**
         * @return connectorPackageUrl
         */
        public String getConnectorPackageUrl() {
            return this.connectorPackageUrl;
        }

        /**
         * @return connectorParameters
         */
        public SourceCustomizedKafkaConnectorParametersConnectorParameters getConnectorParameters() {
            return this.connectorParameters;
        }

        /**
         * @return workerParameters
         */
        public java.util.Map<String, ?> getWorkerParameters() {
            return this.workerParameters;
        }

        public static final class Builder {
            private String connectorPackageUrl; 
            private SourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters; 
            private java.util.Map<String, ?> workerParameters; 

            private Builder() {
            } 

            private Builder(SourceCustomizedKafkaConnectorParameters model) {
                this.connectorPackageUrl = model.connectorPackageUrl;
                this.connectorParameters = model.connectorParameters;
                this.workerParameters = model.workerParameters;
            } 

            /**
             * <p>The download URL of the OSS resource ZIP package.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;<a href="https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&Expires=1725539627&Signature=rb8q3OpV2i3gZJ">https://examplebucket.oss-cn-hangzhou.aliyuncs.com/testDoc/Old_Homebrew/2024-06-26%2022%3A34%3A08/opt/homebrew/homebrew/Library/Homebrew/test/support/fixtures/cask/AppWithBinary.zip?OSSAccessKeyId=ri&amp;Expires=1725539627&amp;Signature=rb8q3OpV2i3gZJ</a>&quot;</p>
             */
            public Builder connectorPackageUrl(String connectorPackageUrl) {
                this.connectorPackageUrl = connectorPackageUrl;
                return this;
            }

            /**
             * <p>The connector parameters.</p>
             */
            public Builder connectorParameters(SourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
                this.connectorParameters = connectorParameters;
                return this;
            }

            /**
             * <p>The Kafka instance configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;group.id&quot;: &quot;connect-eb-cluster-KAFKA_CONNECTORC&quot;,
             *         &quot;offset.storage.topic&quot;: &quot;connect-eb-offset-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
             *         &quot;config.storage.topic&quot;: &quot;connect-eb-config-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
             *         &quot;status.storage.topic&quot;: &quot;connect-eb-status-KAFKA_CONNECTOR_yjqC8K5ewC&quot;,
             *         &quot;consumer.group.id&quot;: &quot;connector-eb-cluster-KAFKA_CONNECTOR_yjqC8K5ewC-mongo-sink&quot;,
             *         &quot;bootstrap.servers&quot;: &quot;alikafka-post:9092&quot;
             *       }</p>
             */
            public Builder workerParameters(java.util.Map<String, ?> workerParameters) {
                this.workerParameters = workerParameters;
                return this;
            }

            public SourceCustomizedKafkaConnectorParameters build() {
                return new SourceCustomizedKafkaConnectorParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceCustomizedKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private SourceCustomizedKafkaParameters(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCustomizedKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            private Builder() {
            } 

            private Builder(SourceCustomizedKafkaParameters model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The instance ID of MSMQ for Apache Kafka.</p>
             * 
             * <strong>example:</strong>
             * <p>r-8vb64581862c****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public SourceCustomizedKafkaParameters build() {
                return new SourceCustomizedKafkaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceDTSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrokerUrl")
        private String brokerUrl;

        @com.aliyun.core.annotation.NameInMap("InitCheckPoint")
        private Long initCheckPoint;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Sid")
        private String sid;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("Username")
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

            private Builder() {
            } 

            private Builder(SourceDTSParameters model) {
                this.brokerUrl = model.brokerUrl;
                this.initCheckPoint = model.initCheckPoint;
                this.password = model.password;
                this.sid = model.sid;
                this.taskId = model.taskId;
                this.topic = model.topic;
                this.username = model.username;
            } 

            /**
             * <p>The network address and port number of the data subscription channel.</p>
             */
            public Builder brokerUrl(String brokerUrl) {
                this.brokerUrl = brokerUrl;
                return this;
            }

            /**
             * <p>The consumer offset, which is the timestamp when the SDK client consumes the first data record. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1620962769</p>
             */
            public Builder initCheckPoint(Long initCheckPoint) {
                this.initCheckPoint = initCheckPoint;
                return this;
            }

            /**
             * <p>The password of the consumer group account.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The consumer group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>HD3</p>
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f86e5814-b223-482c-b768-3b873297****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The subscription topic of the data subscription channel.</p>
             * 
             * <strong>example:</strong>
             * <p>LTC_CACHE_PRD</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The account of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceEventBusParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("EventRuleName")
        private String eventRuleName;

        private SourceEventBusParameters(Builder builder) {
            this.eventBusName = builder.eventBusName;
            this.eventRuleName = builder.eventRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEventBusParameters create() {
            return builder().build();
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return eventRuleName
         */
        public String getEventRuleName() {
            return this.eventRuleName;
        }

        public static final class Builder {
            private String eventBusName; 
            private String eventRuleName; 

            private Builder() {
            } 

            private Builder(SourceEventBusParameters model) {
                this.eventBusName = model.eventBusName;
                this.eventRuleName = model.eventRuleName;
            } 

            /**
             * EventBusName.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * EventRuleName.
             */
            public Builder eventRuleName(String eventRuleName) {
                this.eventRuleName = eventRuleName;
                return this;
            }

            public SourceEventBusParameters build() {
                return new SourceEventBusParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
        private String consumerGroup;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("OffsetReset")
        private String offsetReset;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ValueDataType")
        private String valueDataType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(SourceKafkaParameters model) {
                this.consumerGroup = model.consumerGroup;
                this.instanceId = model.instanceId;
                this.network = model.network;
                this.offsetReset = model.offsetReset;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.valueDataType = model.valueDataType;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The group ID of the consumer that subscribes to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-8vb64581862c****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The offset.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder offsetReset(String offsetReset) {
                this.offsetReset = offsetReset;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1iv19sp1msc7zot4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>popvip_center_robot_order</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp179l3llg3jjxwrq72****</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The encoding and decoding format of the message body:</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder valueDataType(String valueDataType) {
                this.valueDataType = valueDataType;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vblalsi0vbhizr77****</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceMNSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsBase64Decode")
        private Boolean isBase64Decode;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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

            private Builder() {
            } 

            private Builder(SourceMNSParameters model) {
                this.isBase64Decode = model.isBase64Decode;
                this.queueName = model.queueName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Specifies whether to enable Base64 encoding. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isBase64Decode(Boolean isBase64Decode) {
                this.isBase64Decode = isBase64Decode;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>queue_api_1642474203601</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceMQTTParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyDataType")
        private String bodyDataType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceMQTTParameters(Builder builder) {
            this.bodyDataType = builder.bodyDataType;
            this.instanceId = builder.instanceId;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMQTTParameters create() {
            return builder().build();
        }

        /**
         * @return bodyDataType
         */
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String bodyDataType; 
            private String instanceId; 
            private String networkType; 
            private String regionId; 
            private String securityGroupId; 
            private String topic; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceMQTTParameters model) {
                this.bodyDataType = model.bodyDataType;
                this.instanceId = model.instanceId;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The message encoding format:</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder bodyDataType(String bodyDataType) {
                this.bodyDataType = bodyDataType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1b5ncun5lqer****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network type.</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1iv19sp1msc7zot4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The topic of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>CANAL_VICUTU_UAT</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp179l3llg3jjxwrq72****</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vblalsi0vbhizr77****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceMQTTParameters build() {
                return new SourceMQTTParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceOSSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Delimiter")
        private String delimiter;

        @com.aliyun.core.annotation.NameInMap("LoadFormat")
        private String loadFormat;

        @com.aliyun.core.annotation.NameInMap("LoadMode")
        private String loadMode;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private SourceOSSParameters(Builder builder) {
            this.bucketName = builder.bucketName;
            this.delimiter = builder.delimiter;
            this.loadFormat = builder.loadFormat;
            this.loadMode = builder.loadMode;
            this.prefix = builder.prefix;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceOSSParameters create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return delimiter
         */
        public String getDelimiter() {
            return this.delimiter;
        }

        /**
         * @return loadFormat
         */
        public String getLoadFormat() {
            return this.loadFormat;
        }

        /**
         * @return loadMode
         */
        public String getLoadMode() {
            return this.loadMode;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String bucketName; 
            private String delimiter; 
            private String loadFormat; 
            private String loadMode; 
            private String prefix; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(SourceOSSParameters model) {
                this.bucketName = model.bucketName;
                this.delimiter = model.delimiter;
                this.loadFormat = model.loadFormat;
                this.loadMode = model.loadMode;
                this.prefix = model.prefix;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The bucket name in Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>bucket_abc</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The delimiter. In chunked loading mode, this delimiter is used as the text chunking identifier. The default delimiter is the newline character 
             * .</p>
             * 
             * <strong>example:</strong>
             * <p>\n</p>
             */
            public Builder delimiter(String delimiter) {
                this.delimiter = delimiter;
                return this;
            }

            /**
             * <p>The document loader.</p>
             * 
             * <strong>example:</strong>
             * <p>TextLoader</p>
             */
            public Builder loadFormat(String loadFormat) {
                this.loadFormat = loadFormat;
                return this;
            }

            /**
             * <p>The data loading mode. &quot;single&quot; indicates single-document loading, and &quot;element&quot; indicates chunked loading.</p>
             * 
             * <strong>example:</strong>
             * <p>single</p>
             */
            public Builder loadMode(String loadMode) {
                this.loadMode = loadMode;
                return this;
            }

            /**
             * <p>The file path prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>fun/document/</p>
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>The role name that provides authorization for the event bus EventBridge to read OSS files. The role must have at least read-only permissions on OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>eventbridge_oss_role</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public SourceOSSParameters build() {
                return new SourceOSSParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceOpenSourceRabbitMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("BodyDataType")
        private String bodyDataType;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
        private String virtualHostName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceOpenSourceRabbitMQParameters(Builder builder) {
            this.authType = builder.authType;
            this.bodyDataType = builder.bodyDataType;
            this.endpoint = builder.endpoint;
            this.networkType = builder.networkType;
            this.password = builder.password;
            this.queueName = builder.queueName;
            this.securityGroupId = builder.securityGroupId;
            this.username = builder.username;
            this.vSwitchIds = builder.vSwitchIds;
            this.virtualHostName = builder.virtualHostName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceOpenSourceRabbitMQParameters create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return bodyDataType
         */
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return virtualHostName
         */
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String authType; 
            private String bodyDataType; 
            private String endpoint; 
            private String networkType; 
            private String password; 
            private String queueName; 
            private String securityGroupId; 
            private String username; 
            private String vSwitchIds; 
            private String virtualHostName; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceOpenSourceRabbitMQParameters model) {
                this.authType = model.authType;
                this.bodyDataType = model.bodyDataType;
                this.endpoint = model.endpoint;
                this.networkType = model.networkType;
                this.password = model.password;
                this.queueName = model.queueName;
                this.securityGroupId = model.securityGroupId;
                this.username = model.username;
                this.vSwitchIds = model.vSwitchIds;
                this.virtualHostName = model.virtualHostName;
                this.vpcId = model.vpcId;
            } 

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The message encoding format:</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder bodyDataType(String bodyDataType) {
                this.bodyDataType = bodyDataType;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The network type.</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The password of the consumer group account.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>queue_api_1642474203601</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1iv19sp1msc7zot4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The account of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp179l3llg3jjxwrq72****</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
             */
            public Builder virtualHostName(String virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vblalsi0vbhizr77****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceOpenSourceRabbitMQParameters build() {
                return new SourceOpenSourceRabbitMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourcePrometheusParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("ExternalLabels")
        private String externalLabels;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private SourcePrometheusParameters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dataType = builder.dataType;
            this.externalLabels = builder.externalLabels;
            this.labels = builder.labels;
            this.regionId = builder.regionId;
            this.roleName = builder.roleName;
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
         * @return externalLabels
         */
        public String getExternalLabels() {
            return this.externalLabels;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String clusterId; 
            private String dataType; 
            private String externalLabels; 
            private String labels; 
            private String regionId; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(SourcePrometheusParameters model) {
                this.clusterId = model.clusterId;
                this.dataType = model.dataType;
                this.externalLabels = model.externalLabels;
                this.labels = model.labels;
                this.regionId = model.regionId;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c83555068b6******ad213f565f209</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The data type.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * ExternalLabels.
             */
            public Builder externalLabels(String externalLabels) {
                this.externalLabels = externalLabels;
                return this;
            }

            /**
             * <p>The labels.</p>
             * 
             * <strong>example:</strong>
             * <p><strong>name</strong>=.*</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The role name that provides authorization for the event bus EventBridge to read OSS files. The role must have at least read-only permissions on OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>eventbridge_oss_role</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public SourcePrometheusParameters build() {
                return new SourcePrometheusParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceRabbitMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
        private String virtualHostName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceRabbitMQParameters(Builder builder) {
            this.instanceId = builder.instanceId;
            this.networkType = builder.networkType;
            this.queueName = builder.queueName;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.virtualHostName = builder.virtualHostName;
            this.vpcId = builder.vpcId;
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
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return virtualHostName
         */
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String instanceId; 
            private String networkType; 
            private String queueName; 
            private String regionId; 
            private String securityGroupId; 
            private String vSwitchIds; 
            private String virtualHostName; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceRabbitMQParameters model) {
                this.instanceId = model.instanceId;
                this.networkType = model.networkType;
                this.queueName = model.queueName;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.virtualHostName = model.virtualHostName;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The instance ID of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gtm-cn-k2c2yfg****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network type.</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The name of the queue of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1iv19sp1msc7zot4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp179l3llg3jjxwrq72****</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The name of the vhost of the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eb-connect</p>
             */
            public Builder virtualHostName(String virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vblalsi0vbhizr77****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceRabbitMQParameters build() {
                return new SourceRabbitMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceRocketMQCheckpointParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Topics")
        private java.util.List<String> topics;

        private SourceRocketMQCheckpointParameters(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.topics = builder.topics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRocketMQCheckpointParameters create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topics
         */
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private java.util.List<String> topics; 

            private Builder() {
            } 

            private Builder(SourceRocketMQCheckpointParameters model) {
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.topics = model.topics;
            } 

            /**
             * <p>The instance ID.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance type.</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The message topic.</p>
             */
            public Builder topics(java.util.List<String> topics) {
                this.topics = topics;
                return this;
            }

            public SourceRocketMQCheckpointParameters build() {
                return new SourceRocketMQCheckpointParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceRocketMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("BodyDataType")
        private String bodyDataType;

        @com.aliyun.core.annotation.NameInMap("FilterSql")
        private String filterSql;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("GroupID")
        private String groupID;

        @com.aliyun.core.annotation.NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetwork")
        private String instanceNetwork;

        @com.aliyun.core.annotation.NameInMap("InstancePassword")
        private String instancePassword;

        @com.aliyun.core.annotation.NameInMap("InstanceSecurityGroupId")
        private String instanceSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceUsername")
        private String instanceUsername;

        @com.aliyun.core.annotation.NameInMap("InstanceVSwitchIds")
        private String instanceVSwitchIds;

        @com.aliyun.core.annotation.NameInMap("InstanceVpcId")
        private String instanceVpcId;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private String offset;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceRocketMQParameters(Builder builder) {
            this.authType = builder.authType;
            this.bodyDataType = builder.bodyDataType;
            this.filterSql = builder.filterSql;
            this.filterType = builder.filterType;
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
            this.network = builder.network;
            this.offset = builder.offset;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.tag = builder.tag;
            this.timestamp = builder.timestamp;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
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
         * @return bodyDataType
         */
        public String getBodyDataType() {
            return this.bodyDataType;
        }

        /**
         * @return filterSql
         */
        public String getFilterSql() {
            return this.filterSql;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
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
         * @return network
         */
        public String getNetwork() {
            return this.network;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String authType; 
            private String bodyDataType; 
            private String filterSql; 
            private String filterType; 
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
            private String network; 
            private String offset; 
            private String regionId; 
            private String securityGroupId; 
            private String tag; 
            private Long timestamp; 
            private String topic; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceRocketMQParameters model) {
                this.authType = model.authType;
                this.bodyDataType = model.bodyDataType;
                this.filterSql = model.filterSql;
                this.filterType = model.filterType;
                this.groupID = model.groupID;
                this.instanceEndpoint = model.instanceEndpoint;
                this.instanceId = model.instanceId;
                this.instanceNetwork = model.instanceNetwork;
                this.instancePassword = model.instancePassword;
                this.instanceSecurityGroupId = model.instanceSecurityGroupId;
                this.instanceType = model.instanceType;
                this.instanceUsername = model.instanceUsername;
                this.instanceVSwitchIds = model.instanceVSwitchIds;
                this.instanceVpcId = model.instanceVpcId;
                this.network = model.network;
                this.offset = model.offset;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.tag = model.tag;
                this.timestamp = model.timestamp;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The authentication type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACL</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The message encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder bodyDataType(String bodyDataType) {
                this.bodyDataType = bodyDataType;
                return this;
            }

            /**
             * <p>The SQL filter statement.</p>
             * 
             * <strong>example:</strong>
             * <p>index &gt; 10</p>
             */
            public Builder filterSql(String filterSql) {
                this.filterSql = filterSql;
                return this;
            }

            /**
             * <p>The message filter type.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The group ID of the ApsaraMQ for RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_group1</p>
             */
            public Builder groupID(String groupID) {
                this.groupID = groupID;
                return this;
            }

            /**
             * <p>The instance endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>reg****-vpc.cn-zhangjiakou.aliyuncs.com</p>
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The region where the ApsaraMQ for RocketMQ instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default_C56C36026****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network information of the instance:</p>
             * 
             * <strong>example:</strong>
             * <p>PublicNetwork</p>
             */
            public Builder instanceNetwork(String instanceNetwork) {
                this.instanceNetwork = instanceNetwork;
                return this;
            }

            /**
             * <p>The instance password.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * <p>The security group information of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-m5edtu24f12345****</p>
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud_4</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The instance username.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * <p>The vSwitch information of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-m5ev8asdc6h123456****</p>
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * <p>The VPC information of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5e3sv4b12345****</p>
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * <p>The network type:</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateNetwork</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The consumption offset of the message. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>CONSUMEFROMLAST_OFFSET</p>
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security group for cross-border tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-m5edtu24f12345****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The filter tag of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The timestamp. This parameter is valid only when the Offset parameter is set to CONSUME_FROM_TIMESTAMP.</p>
             * 
             * <strong>example:</strong>
             * <p>1670656652009</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The topic of the message service.</p>
             * 
             * <strong>example:</strong>
             * <p>Topic_publicRule_api_1667273421288</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The vSwitch IDs for cross-border tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-m5ev8asdc6h12345****</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID for cross-border tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5e3sv4b12345****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceRocketMQParameters build() {
                return new SourceRocketMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class SourceSLSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumePosition")
        private String consumePosition;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private SourceSLSParameters(Builder builder) {
            this.consumePosition = builder.consumePosition;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceSLSParameters create() {
            return builder().build();
        }

        /**
         * @return consumePosition
         */
        public String getConsumePosition() {
            return this.consumePosition;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String consumePosition; 
            private String logStore; 
            private String project; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(SourceSLSParameters model) {
                this.consumePosition = model.consumePosition;
                this.logStore = model.logStore;
                this.project = model.project;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The starting consumer offset. You can select the earliest or latest offset, which corresponds to &quot;begin&quot; or &quot;end&quot; respectively. You can also start consuming from a specified time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>end</p>
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * <p>The Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-log</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The role that provides authorization for the event bus EventBridge to read SLS log content. To meet the requirements, when you create the role used by the service in the Resource Access Management (RAM) console, select &quot;Alibaba Cloud Service&quot; and set &quot;Trusted Service&quot; to &quot;event bus&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>testRole</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceApacheKafkaParameters")
        private SourceApacheKafkaParameters sourceApacheKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceApacheRocketMQCheckpointParameters")
        private SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters;

        @com.aliyun.core.annotation.NameInMap("SourceCustomizedKafkaConnectorParameters")
        private SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        @com.aliyun.core.annotation.NameInMap("SourceCustomizedKafkaParameters")
        private SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceDTSParameters")
        private SourceDTSParameters sourceDTSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceEventBusParameters")
        private SourceEventBusParameters sourceEventBusParameters;

        @com.aliyun.core.annotation.NameInMap("SourceFeiShuDocsParameters")
        private SourceFeiShuDocsParameters sourceFeiShuDocsParameters;

        @com.aliyun.core.annotation.NameInMap("SourceJDBCParameters")
        private SourceJDBCParameters sourceJDBCParameters;

        @com.aliyun.core.annotation.NameInMap("SourceKafkaParameters")
        private SourceKafkaParameters sourceKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceMNSParameters")
        private SourceMNSParameters sourceMNSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceMQTTParameters")
        private SourceMQTTParameters sourceMQTTParameters;

        @com.aliyun.core.annotation.NameInMap("SourceMySQLParameters")
        private SourceMySQLParameters sourceMySQLParameters;

        @com.aliyun.core.annotation.NameInMap("SourceOSSParameters")
        private SourceOSSParameters sourceOSSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceOpenSourceRabbitMQParameters")
        private SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourcePostgreSQLParameters")
        private SourcePostgreSQLParameters sourcePostgreSQLParameters;

        @com.aliyun.core.annotation.NameInMap("SourcePrometheusParameters")
        private SourcePrometheusParameters sourcePrometheusParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRabbitMQMetaParameters")
        private SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRabbitMQMsgSyncParameters")
        private SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRabbitMQParameters")
        private SourceRabbitMQParameters sourceRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRocketMQCheckpointParameters")
        private SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRocketMQParameters")
        private SourceRocketMQParameters sourceRocketMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourceSLSParameters")
        private SourceSLSParameters sourceSLSParameters;

        private Source(Builder builder) {
            this.sourceApacheKafkaParameters = builder.sourceApacheKafkaParameters;
            this.sourceApacheRocketMQCheckpointParameters = builder.sourceApacheRocketMQCheckpointParameters;
            this.sourceCustomizedKafkaConnectorParameters = builder.sourceCustomizedKafkaConnectorParameters;
            this.sourceCustomizedKafkaParameters = builder.sourceCustomizedKafkaParameters;
            this.sourceDTSParameters = builder.sourceDTSParameters;
            this.sourceEventBusParameters = builder.sourceEventBusParameters;
            this.sourceFeiShuDocsParameters = builder.sourceFeiShuDocsParameters;
            this.sourceJDBCParameters = builder.sourceJDBCParameters;
            this.sourceKafkaParameters = builder.sourceKafkaParameters;
            this.sourceMNSParameters = builder.sourceMNSParameters;
            this.sourceMQTTParameters = builder.sourceMQTTParameters;
            this.sourceMySQLParameters = builder.sourceMySQLParameters;
            this.sourceOSSParameters = builder.sourceOSSParameters;
            this.sourceOpenSourceRabbitMQParameters = builder.sourceOpenSourceRabbitMQParameters;
            this.sourcePostgreSQLParameters = builder.sourcePostgreSQLParameters;
            this.sourcePrometheusParameters = builder.sourcePrometheusParameters;
            this.sourceRabbitMQMetaParameters = builder.sourceRabbitMQMetaParameters;
            this.sourceRabbitMQMsgSyncParameters = builder.sourceRabbitMQMsgSyncParameters;
            this.sourceRabbitMQParameters = builder.sourceRabbitMQParameters;
            this.sourceRocketMQCheckpointParameters = builder.sourceRocketMQCheckpointParameters;
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
         * @return sourceApacheKafkaParameters
         */
        public SourceApacheKafkaParameters getSourceApacheKafkaParameters() {
            return this.sourceApacheKafkaParameters;
        }

        /**
         * @return sourceApacheRocketMQCheckpointParameters
         */
        public SourceApacheRocketMQCheckpointParameters getSourceApacheRocketMQCheckpointParameters() {
            return this.sourceApacheRocketMQCheckpointParameters;
        }

        /**
         * @return sourceCustomizedKafkaConnectorParameters
         */
        public SourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
            return this.sourceCustomizedKafkaConnectorParameters;
        }

        /**
         * @return sourceCustomizedKafkaParameters
         */
        public SourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
            return this.sourceCustomizedKafkaParameters;
        }

        /**
         * @return sourceDTSParameters
         */
        public SourceDTSParameters getSourceDTSParameters() {
            return this.sourceDTSParameters;
        }

        /**
         * @return sourceEventBusParameters
         */
        public SourceEventBusParameters getSourceEventBusParameters() {
            return this.sourceEventBusParameters;
        }

        /**
         * @return sourceFeiShuDocsParameters
         */
        public SourceFeiShuDocsParameters getSourceFeiShuDocsParameters() {
            return this.sourceFeiShuDocsParameters;
        }

        /**
         * @return sourceJDBCParameters
         */
        public SourceJDBCParameters getSourceJDBCParameters() {
            return this.sourceJDBCParameters;
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
         * @return sourceMySQLParameters
         */
        public SourceMySQLParameters getSourceMySQLParameters() {
            return this.sourceMySQLParameters;
        }

        /**
         * @return sourceOSSParameters
         */
        public SourceOSSParameters getSourceOSSParameters() {
            return this.sourceOSSParameters;
        }

        /**
         * @return sourceOpenSourceRabbitMQParameters
         */
        public SourceOpenSourceRabbitMQParameters getSourceOpenSourceRabbitMQParameters() {
            return this.sourceOpenSourceRabbitMQParameters;
        }

        /**
         * @return sourcePostgreSQLParameters
         */
        public SourcePostgreSQLParameters getSourcePostgreSQLParameters() {
            return this.sourcePostgreSQLParameters;
        }

        /**
         * @return sourcePrometheusParameters
         */
        public SourcePrometheusParameters getSourcePrometheusParameters() {
            return this.sourcePrometheusParameters;
        }

        /**
         * @return sourceRabbitMQMetaParameters
         */
        public SourceRabbitMQMetaParameters getSourceRabbitMQMetaParameters() {
            return this.sourceRabbitMQMetaParameters;
        }

        /**
         * @return sourceRabbitMQMsgSyncParameters
         */
        public SourceRabbitMQMsgSyncParameters getSourceRabbitMQMsgSyncParameters() {
            return this.sourceRabbitMQMsgSyncParameters;
        }

        /**
         * @return sourceRabbitMQParameters
         */
        public SourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        /**
         * @return sourceRocketMQCheckpointParameters
         */
        public SourceRocketMQCheckpointParameters getSourceRocketMQCheckpointParameters() {
            return this.sourceRocketMQCheckpointParameters;
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
            private SourceApacheKafkaParameters sourceApacheKafkaParameters; 
            private SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters; 
            private SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters; 
            private SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters; 
            private SourceDTSParameters sourceDTSParameters; 
            private SourceEventBusParameters sourceEventBusParameters; 
            private SourceFeiShuDocsParameters sourceFeiShuDocsParameters; 
            private SourceJDBCParameters sourceJDBCParameters; 
            private SourceKafkaParameters sourceKafkaParameters; 
            private SourceMNSParameters sourceMNSParameters; 
            private SourceMQTTParameters sourceMQTTParameters; 
            private SourceMySQLParameters sourceMySQLParameters; 
            private SourceOSSParameters sourceOSSParameters; 
            private SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters; 
            private SourcePostgreSQLParameters sourcePostgreSQLParameters; 
            private SourcePrometheusParameters sourcePrometheusParameters; 
            private SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters; 
            private SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters; 
            private SourceRabbitMQParameters sourceRabbitMQParameters; 
            private SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters; 
            private SourceRocketMQParameters sourceRocketMQParameters; 
            private SourceSLSParameters sourceSLSParameters; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.sourceApacheKafkaParameters = model.sourceApacheKafkaParameters;
                this.sourceApacheRocketMQCheckpointParameters = model.sourceApacheRocketMQCheckpointParameters;
                this.sourceCustomizedKafkaConnectorParameters = model.sourceCustomizedKafkaConnectorParameters;
                this.sourceCustomizedKafkaParameters = model.sourceCustomizedKafkaParameters;
                this.sourceDTSParameters = model.sourceDTSParameters;
                this.sourceEventBusParameters = model.sourceEventBusParameters;
                this.sourceFeiShuDocsParameters = model.sourceFeiShuDocsParameters;
                this.sourceJDBCParameters = model.sourceJDBCParameters;
                this.sourceKafkaParameters = model.sourceKafkaParameters;
                this.sourceMNSParameters = model.sourceMNSParameters;
                this.sourceMQTTParameters = model.sourceMQTTParameters;
                this.sourceMySQLParameters = model.sourceMySQLParameters;
                this.sourceOSSParameters = model.sourceOSSParameters;
                this.sourceOpenSourceRabbitMQParameters = model.sourceOpenSourceRabbitMQParameters;
                this.sourcePostgreSQLParameters = model.sourcePostgreSQLParameters;
                this.sourcePrometheusParameters = model.sourcePrometheusParameters;
                this.sourceRabbitMQMetaParameters = model.sourceRabbitMQMetaParameters;
                this.sourceRabbitMQMsgSyncParameters = model.sourceRabbitMQMsgSyncParameters;
                this.sourceRabbitMQParameters = model.sourceRabbitMQParameters;
                this.sourceRocketMQCheckpointParameters = model.sourceRocketMQCheckpointParameters;
                this.sourceRocketMQParameters = model.sourceRocketMQParameters;
                this.sourceSLSParameters = model.sourceSLSParameters;
            } 

            /**
             * <p>The open-source Kafka parameter settings.</p>
             */
            public Builder sourceApacheKafkaParameters(SourceApacheKafkaParameters sourceApacheKafkaParameters) {
                this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
                return this;
            }

            /**
             * <p>The Source RocketMQ checkpoint parameters.</p>
             */
            public Builder sourceApacheRocketMQCheckpointParameters(SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
                this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
                return this;
            }

            /**
             * <p>The custom connector Apache Kafka event source parameters.</p>
             */
            public Builder sourceCustomizedKafkaConnectorParameters(SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
                this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
                return this;
            }

            /**
             * <p>The custom Kafka event source parameters.</p>
             */
            public Builder sourceCustomizedKafkaParameters(SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
                this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
                return this;
            }

            /**
             * <p>The source DTS parameters.</p>
             */
            public Builder sourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
                this.sourceDTSParameters = sourceDTSParameters;
                return this;
            }

            /**
             * SourceEventBusParameters.
             */
            public Builder sourceEventBusParameters(SourceEventBusParameters sourceEventBusParameters) {
                this.sourceEventBusParameters = sourceEventBusParameters;
                return this;
            }

            /**
             * SourceFeiShuDocsParameters.
             */
            public Builder sourceFeiShuDocsParameters(SourceFeiShuDocsParameters sourceFeiShuDocsParameters) {
                this.sourceFeiShuDocsParameters = sourceFeiShuDocsParameters;
                return this;
            }

            /**
             * SourceJDBCParameters.
             */
            public Builder sourceJDBCParameters(SourceJDBCParameters sourceJDBCParameters) {
                this.sourceJDBCParameters = sourceJDBCParameters;
                return this;
            }

            /**
             * <p>The Source Kafka parameters.</p>
             */
            public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
                this.sourceKafkaParameters = sourceKafkaParameters;
                return this;
            }

            /**
             * <p>The Source MNS parameters.</p>
             */
            public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
                this.sourceMNSParameters = sourceMNSParameters;
                return this;
            }

            /**
             * <p>The Source MQTT parameters.</p>
             */
            public Builder sourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
                this.sourceMQTTParameters = sourceMQTTParameters;
                return this;
            }

            /**
             * SourceMySQLParameters.
             */
            public Builder sourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
                this.sourceMySQLParameters = sourceMySQLParameters;
                return this;
            }

            /**
             * <p>The source OSS event source parameters.</p>
             */
            public Builder sourceOSSParameters(SourceOSSParameters sourceOSSParameters) {
                this.sourceOSSParameters = sourceOSSParameters;
                return this;
            }

            /**
             * SourceOpenSourceRabbitMQParameters.
             */
            public Builder sourceOpenSourceRabbitMQParameters(SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters) {
                this.sourceOpenSourceRabbitMQParameters = sourceOpenSourceRabbitMQParameters;
                return this;
            }

            /**
             * SourcePostgreSQLParameters.
             */
            public Builder sourcePostgreSQLParameters(SourcePostgreSQLParameters sourcePostgreSQLParameters) {
                this.sourcePostgreSQLParameters = sourcePostgreSQLParameters;
                return this;
            }

            /**
             * <p>The source Prometheus event source parameters.</p>
             */
            public Builder sourcePrometheusParameters(SourcePrometheusParameters sourcePrometheusParameters) {
                this.sourcePrometheusParameters = sourcePrometheusParameters;
                return this;
            }

            /**
             * SourceRabbitMQMetaParameters.
             */
            public Builder sourceRabbitMQMetaParameters(SourceRabbitMQMetaParameters sourceRabbitMQMetaParameters) {
                this.sourceRabbitMQMetaParameters = sourceRabbitMQMetaParameters;
                return this;
            }

            /**
             * SourceRabbitMQMsgSyncParameters.
             */
            public Builder sourceRabbitMQMsgSyncParameters(SourceRabbitMQMsgSyncParameters sourceRabbitMQMsgSyncParameters) {
                this.sourceRabbitMQMsgSyncParameters = sourceRabbitMQMsgSyncParameters;
                return this;
            }

            /**
             * <p>The Source RabbitMQ parameters.</p>
             */
            public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
                this.sourceRabbitMQParameters = sourceRabbitMQParameters;
                return this;
            }

            /**
             * <p>The Source RocketMQ checkpoint parameters.</p>
             */
            public Builder sourceRocketMQCheckpointParameters(SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
                this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
                return this;
            }

            /**
             * <p>The Source RocketMQ parameters.</p>
             */
            public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
                this.sourceRocketMQParameters = sourceRocketMQParameters;
                return this;
            }

            /**
             * <p>The source Simple Log Service (SLS) parameters.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
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
    /**
     * 
     * {@link CreateEventStreamingRequest} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingRequest</p>
     */
    public static class Transforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("BaiLianAgentTransformParameters")
        private BaiLianAgentTransformParameters baiLianAgentTransformParameters;

        @com.aliyun.core.annotation.NameInMap("DashScopeTransformParameters")
        private DashScopeTransformParameters dashScopeTransformParameters;

        @com.aliyun.core.annotation.NameInMap("EmbeddingTransformParameters")
        private EmbeddingTransformParameters embeddingTransformParameters;

        private Transforms(Builder builder) {
            this.arn = builder.arn;
            this.baiLianAgentTransformParameters = builder.baiLianAgentTransformParameters;
            this.dashScopeTransformParameters = builder.dashScopeTransformParameters;
            this.embeddingTransformParameters = builder.embeddingTransformParameters;
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

        /**
         * @return baiLianAgentTransformParameters
         */
        public BaiLianAgentTransformParameters getBaiLianAgentTransformParameters() {
            return this.baiLianAgentTransformParameters;
        }

        /**
         * @return dashScopeTransformParameters
         */
        public DashScopeTransformParameters getDashScopeTransformParameters() {
            return this.dashScopeTransformParameters;
        }

        /**
         * @return embeddingTransformParameters
         */
        public EmbeddingTransformParameters getEmbeddingTransformParameters() {
            return this.embeddingTransformParameters;
        }

        public static final class Builder {
            private String arn; 
            private BaiLianAgentTransformParameters baiLianAgentTransformParameters; 
            private DashScopeTransformParameters dashScopeTransformParameters; 
            private EmbeddingTransformParameters embeddingTransformParameters; 

            private Builder() {
            } 

            private Builder(Transforms model) {
                this.arn = model.arn;
                this.baiLianAgentTransformParameters = model.baiLianAgentTransformParameters;
                this.dashScopeTransformParameters = model.dashScopeTransformParameters;
                this.embeddingTransformParameters = model.embeddingTransformParameters;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the cloud service, such as the ARN of a function in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:fc:cn-hangzhou:*****:services/demo-service.LATEST/functions/demo-func</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * BaiLianAgentTransformParameters.
             */
            public Builder baiLianAgentTransformParameters(BaiLianAgentTransformParameters baiLianAgentTransformParameters) {
                this.baiLianAgentTransformParameters = baiLianAgentTransformParameters;
                return this;
            }

            /**
             * DashScopeTransformParameters.
             */
            public Builder dashScopeTransformParameters(DashScopeTransformParameters dashScopeTransformParameters) {
                this.dashScopeTransformParameters = dashScopeTransformParameters;
                return this;
            }

            /**
             * EmbeddingTransformParameters.
             */
            public Builder embeddingTransformParameters(EmbeddingTransformParameters embeddingTransformParameters) {
                this.embeddingTransformParameters = embeddingTransformParameters;
                return this;
            }

            public Transforms build() {
                return new Transforms(this);
            } 

        } 

    }
}
