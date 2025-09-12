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
 * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
 *
 * <p>GetEventStreamingResponseBody</p>
 */
public class GetEventStreamingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetEventStreamingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventStreamingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEventStreamingResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The event streaming [xxxx] not existed!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7892F480-58C9-5067-AB35-8A7BEF0F726A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEventStreamingResponseBody build() {
            return new GetEventStreamingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class DetailedStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Long delayTime;

        @com.aliyun.core.annotation.NameInMap("DiffOffset")
        private Long diffOffset;

        @com.aliyun.core.annotation.NameInMap("Extensions")
        private java.util.Map<String, ?> extensions;

        @com.aliyun.core.annotation.NameInMap("TPS")
        private Double TPS;

        private DetailedStatus(Builder builder) {
            this.delayTime = builder.delayTime;
            this.diffOffset = builder.diffOffset;
            this.extensions = builder.extensions;
            this.TPS = builder.TPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailedStatus create() {
            return builder().build();
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return diffOffset
         */
        public Long getDiffOffset() {
            return this.diffOffset;
        }

        /**
         * @return extensions
         */
        public java.util.Map<String, ?> getExtensions() {
            return this.extensions;
        }

        /**
         * @return TPS
         */
        public Double getTPS() {
            return this.TPS;
        }

        public static final class Builder {
            private Long delayTime; 
            private Long diffOffset; 
            private java.util.Map<String, ?> extensions; 
            private Double TPS; 

            private Builder() {
            } 

            private Builder(DetailedStatus model) {
                this.delayTime = model.delayTime;
                this.diffOffset = model.diffOffset;
                this.extensions = model.extensions;
                this.TPS = model.TPS;
            } 

            /**
             * DelayTime.
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * DiffOffset.
             */
            public Builder diffOffset(Long diffOffset) {
                this.diffOffset = diffOffset;
                return this;
            }

            /**
             * Extensions.
             */
            public Builder extensions(java.util.Map<String, ?> extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * TPS.
             */
            public Builder TPS(Double TPS) {
                this.TPS = TPS;
                return this;
            }

            public DetailedStatus build() {
                return new DetailedStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The maximum number of events that are allowed in the batch window. If this threshold is reached, data in the window is pushed downstream. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder countBasedWindow(Integer countBasedWindow) {
                this.countBasedWindow = countBasedWindow;
                return this;
            }

            /**
             * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. If this threshold is reached, data in the window is pushed downstream. When multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1550203943326350:role/edskmstoecs</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class RetryStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaximumEventAgeInSeconds")
        private Float maximumEventAgeInSeconds;

        @com.aliyun.core.annotation.NameInMap("MaximumRetryAttempts")
        private Float maximumRetryAttempts;

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
        public Float getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        /**
         * @return maximumRetryAttempts
         */
        public Float getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        /**
         * @return pushRetryStrategy
         */
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        public static final class Builder {
            private Float maximumEventAgeInSeconds; 
            private Float maximumRetryAttempts; 
            private String pushRetryStrategy; 

            private Builder() {
            } 

            private Builder(RetryStrategy model) {
                this.maximumEventAgeInSeconds = model.maximumEventAgeInSeconds;
                this.maximumRetryAttempts = model.maximumRetryAttempts;
                this.pushRetryStrategy = model.pushRetryStrategy;
            } 

            /**
             * <p>The maximum period of time during which retries are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maximumEventAgeInSeconds(Float maximumEventAgeInSeconds) {
                this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
                return this;
            }

            /**
             * <p>The maximum number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumRetryAttempts(Float maximumRetryAttempts) {
                this.maximumRetryAttempts = maximumRetryAttempts;
                return this;
            }

            /**
             * <p>The retry policy. Valid values: BACKOFFRETRY and EXPONENTIALDECAY_RETRY.</p>
             * 
             * <strong>example:</strong>
             * <p>BACKOFFRETRY</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
        private Integer maximumTasks;

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
        public Integer getMaximumTasks() {
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
            private Integer maximumTasks; 
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
             * <p>Indicates whether dead-letter queues are enabled. By default, dead-letter queues are disabled. Messages that fail to be pushed after allowed retries as specified by the retry policy are discarded.</p>
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * <p>The fault tolerance policy. The value NONE specifies that faults are not tolerated, and the value All specifies that all faults are tolerated.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * <p>The concurrency level.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumTasks(Integer maximumTasks) {
                this.maximumTasks = maximumTasks;
                return this;
            }

            /**
             * <p>The information about the retry policy that is used if the event fails to be pushed.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SinkApacheKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acks")
        private String acks;

        @com.aliyun.core.annotation.NameInMap("Bootstraps")
        private String bootstraps;

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
            this.headers = builder.headers;
            this.key = builder.key;
            this.networkType = builder.networkType;
            this.saslMechanism = builder.saslMechanism;
            this.saslPassword = builder.saslPassword;
            this.saslUser = builder.saslUser;
            this.securityGroupId = builder.securityGroupId;
            this.securityProtocol = builder.securityProtocol;
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
            private Headers headers; 
            private Key key; 
            private NetworkType networkType; 
            private String saslMechanism; 
            private String saslPassword; 
            private String saslUser; 
            private SecurityGroupId securityGroupId; 
            private String securityProtocol; 
            private String topic; 
            private VSwitchIds vSwitchIds; 
            private Value value; 
            private VpcId vpcId; 

            private Builder() {
            } 

            private Builder(SinkApacheKafkaParameters model) {
                this.acks = model.acks;
                this.bootstraps = model.bootstraps;
                this.headers = model.headers;
                this.key = model.key;
                this.networkType = model.networkType;
                this.saslMechanism = model.saslMechanism;
                this.saslPassword = model.saslPassword;
                this.saslUser = model.saslUser;
                this.securityGroupId = model.securityGroupId;
                this.securityProtocol = model.securityProtocol;
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
             * Bootstraps.
             */
            public Builder bootstraps(String bootstraps) {
                this.bootstraps = bootstraps;
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
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Config.
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * Name.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * ConnectorPackageUrl.
             */
            public Builder connectorPackageUrl(String connectorPackageUrl) {
                this.connectorPackageUrl = connectorPackageUrl;
                return this;
            }

            /**
             * ConnectorParameters.
             */
            public Builder connectorParameters(ConnectorParameters connectorParameters) {
                this.connectorParameters = connectorParameters;
                return this;
            }

            /**
             * WorkerParameters.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * InstanceId.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class DashVectorSchemaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DashVectorSchemaParameters(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashVectorSchemaParameters create() {
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

            private Builder(DashVectorSchemaParameters model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
             */
            public Builder value(String value) {
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SinkDashVectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("Collection")
        private String collection;

        @com.aliyun.core.annotation.NameInMap("DashVectorSchemaParameters")
        private DashVectorSchemaParameters dashVectorSchemaParameters;

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
        public DashVectorSchemaParameters getDashVectorSchemaParameters() {
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
            private DashVectorSchemaParameters dashVectorSchemaParameters; 
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
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * Collection.
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * DashVectorSchemaParameters.
             */
            public Builder dashVectorSchemaParameters(DashVectorSchemaParameters dashVectorSchemaParameters) {
                this.dashVectorSchemaParameters = dashVectorSchemaParameters;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Partition partition) {
                this.partition = partition;
                return this;
            }

            /**
             * PrimaryKeyId.
             */
            public Builder primaryKeyId(PrimaryKeyId primaryKeyId) {
                this.primaryKeyId = primaryKeyId;
                return this;
            }

            /**
             * Vector.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Body.
             */
            public Builder body(SinkDataHubParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(RoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(SinkDataHubParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * TopicSchema.
             */
            public Builder topicSchema(TopicSchema topicSchema) {
                this.topicSchema = topicSchema;
                return this;
            }

            /**
             * TopicType.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Body.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>None</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The delivery concurrency. Minimum value: 1.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>None</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The delivery concurrency. Minimum value: 1.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>mFunction</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The invocation type.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The alias of the service to which the function belongs.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the service.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The message body that is sent to the function.</p>
             */
            public Builder body(SinkFcParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The delivery concurrency. Minimum value: 1.</p>
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
             * <p>The invocation type. Valid values: Sync: synchronous Async: asynchronous</p>
             */
            public Builder invocationType(InvocationType invocationType) {
                this.invocationType = invocationType;
                return this;
            }

            /**
             * <p>The alias of the service to which the function belongs.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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
             * <p>None</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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
             * <p>None</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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
             * <p>None</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform events. Default value: CONSTANT.</p>
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
             * <p>None</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The role name.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The acknowledgment information.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The acknowledgment information.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>Defaut_1283278472_sadkj</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic-test</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SinkKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acks")
        private Acks acks;

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
            private SinkKafkaParametersHeaders headers; 
            private InstanceId instanceId; 
            private SinkKafkaParametersKey key; 
            private SinkKafkaParametersTopic topic; 
            private SinkKafkaParametersValue value; 

            private Builder() {
            } 

            private Builder(SinkKafkaParameters model) {
                this.acks = model.acks;
                this.headers = model.headers;
                this.instanceId = model.instanceId;
                this.key = model.key;
                this.topic = model.topic;
                this.value = model.value;
            } 

            /**
             * <p>The acknowledgment information.</p>
             */
            public Builder acks(Acks acks) {
                this.acks = acks;
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
             * <p>The target service type is Message Queue for Apache Kafka.</p>
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
             * <p>The message content.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkMNSParametersBody build() {
                return new SinkMNSParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>Specifies that Base64 encoding is enabled.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The message content.</p>
             */
            public Builder body(SinkMNSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>Indicates whether Base64 encoding is enabled.</p>
             */
            public Builder isBase64Encode(IsBase64Encode isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * <p>The target service type is MNS.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The message content.</p>
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
             * <p>The target service type is MNS.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkRabbitMQParametersBody build() {
                return new SinkRabbitMQParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the exchange in the Message Queue for RabbitMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The ID of the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>e5c9b727-e06c-4d7e-84d5-f8ce644e00bf</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkRabbitMQParametersMessageId build() {
                return new SinkRabbitMQParametersMessageId(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkRabbitMQParametersProperties build() {
                return new SinkRabbitMQParametersProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the queue in the Message Queue for RabbitMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The routing rule for the message.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The type of the resource to which the event is delivered. Valid values: Exchange: exchanges. Queue: queues.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The vhost name of the Message Queue for RabbitMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Properties")
        private SinkRabbitMQParametersProperties properties;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private SinkRabbitMQParametersQueueName queueName;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private SinkRabbitMQParametersRoutingKey routingKey;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private TargetType targetType;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
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
        public SinkRabbitMQParametersMessageId getMessageId() {
            return this.messageId;
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
            private SinkRabbitMQParametersMessageId messageId; 
            private SinkRabbitMQParametersProperties properties; 
            private SinkRabbitMQParametersQueueName queueName; 
            private SinkRabbitMQParametersRoutingKey routingKey; 
            private TargetType targetType; 
            private VirtualHostName virtualHostName; 

            private Builder() {
            } 

            private Builder(SinkRabbitMQParameters model) {
                this.body = model.body;
                this.exchange = model.exchange;
                this.instanceId = model.instanceId;
                this.messageId = model.messageId;
                this.properties = model.properties;
                this.queueName = model.queueName;
                this.routingKey = model.routingKey;
                this.targetType = model.targetType;
                this.virtualHostName = model.virtualHostName;
            } 

            /**
             * <p>The message content.</p>
             */
            public Builder body(SinkRabbitMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The exchange mode. This parameter is available only if TargetType is set to Exchange.</p>
             */
            public Builder exchange(Exchange exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * <p>The target service type is Message Queue for RabbitMQ instance.</p>
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
             * <p>The tags that are used to filter messages.</p>
             */
            public Builder properties(SinkRabbitMQParametersProperties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The queue mode. This parameter is available only if TargetType is set to Queue.</p>
             */
            public Builder queueName(SinkRabbitMQParametersQueueName queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The routing rule for the message. This parameter is available only if TargetType is set to Exchange.</p>
             */
            public Builder routingKey(SinkRabbitMQParametersRoutingKey routingKey) {
                this.routingKey = routingKey;
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
             * <p>The name of the vhost of the Message Queue for RabbitMQ instance.</p>
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
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The vhost name of the Message Queue for RabbitMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_EVENTBRIDGE_1736234******</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The target service type is Message Queue for RabbitMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkRocketMQParametersBody build() {
                return new SinkRocketMQParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public DeliveryOrderType build() {
                return new DeliveryOrderType(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public InstanceEndpoint build() {
                return new InstanceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkRocketMQParametersProperties build() {
                return new SinkRocketMQParametersProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public SinkRocketMQParametersSecurityGroupId build() {
                return new SinkRocketMQParametersSecurityGroupId(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public ShardingKey build() {
                return new ShardingKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Mytopic</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Mytopic</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
        private Tags tags;

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
        public Tags getTags() {
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
            private Tags tags; 
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
             * <p>The message content.</p>
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
             * InstanceEndpoint.
             */
            public Builder instanceEndpoint(InstanceEndpoint instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The target service type is Message Queue for Apache RocketMQ.</p>
             */
            public Builder instanceId(SinkRocketMQParametersInstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstancePassword.
             */
            public Builder instancePassword(InstancePassword instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(InstanceType instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceUsername.
             */
            public Builder instanceUsername(InstanceUsername instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * <p>The tags that are used to filter messages.</p>
             */
            public Builder keys(Keys keys) {
                this.keys = keys;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The tags that are used to filter messages.</p>
             */
            public Builder properties(SinkRocketMQParametersProperties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * SecurityGroupId.
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
             * <p>The tags that are used to filter messages.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The name of the topic in the Message Queue for Apache RocketMQ instance.</p>
             */
            public Builder topic(SinkRocketMQParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(SinkRocketMQParametersVSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public ContentSchema build() {
                return new ContentSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template based on which the event is transformed.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value before the transformation.</p>
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

            public ContentType build() {
                return new ContentType(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The method that is used to transform the event. Default value: CONSTANT.</p>
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
             * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Log Service.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The message content.</p>
             */
            public Builder body(SinkSLSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * ContentSchema.
             */
            public Builder contentSchema(ContentSchema contentSchema) {
                this.contentSchema = contentSchema;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(ContentType contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore.</p>
             */
            public Builder logStore(LogStore logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The Simple Log Service project.</p>
             */
            public Builder project(SinkSLSParametersProject project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
             */
            public Builder roleName(SinkSLSParametersRoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Simple Log Service.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SinkApacheKafkaParameters")
        private SinkApacheKafkaParameters sinkApacheKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkApacheRocketMQCheckpointParameters")
        private SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

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

        @com.aliyun.core.annotation.NameInMap("SinkFcParameters")
        private SinkFcParameters sinkFcParameters;

        @com.aliyun.core.annotation.NameInMap("SinkFnfParameters")
        private SinkFnfParameters sinkFnfParameters;

        @com.aliyun.core.annotation.NameInMap("SinkKafkaParameters")
        private SinkKafkaParameters sinkKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkMNSParameters")
        private SinkMNSParameters sinkMNSParameters;

        @com.aliyun.core.annotation.NameInMap("SinkOpenSourceRabbitMQParameters")
        private SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRabbitMQParameters")
        private SinkRabbitMQParameters sinkRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRocketMQCheckpointParameters")
        private SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRocketMQParameters")
        private SinkRocketMQParameters sinkRocketMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkSLSParameters")
        private SinkSLSParameters sinkSLSParameters;

        private Sink(Builder builder) {
            this.sinkApacheKafkaParameters = builder.sinkApacheKafkaParameters;
            this.sinkApacheRocketMQCheckpointParameters = builder.sinkApacheRocketMQCheckpointParameters;
            this.sinkBaiLianParameters = builder.sinkBaiLianParameters;
            this.sinkCustomizedKafkaConnectorParameters = builder.sinkCustomizedKafkaConnectorParameters;
            this.sinkCustomizedKafkaParameters = builder.sinkCustomizedKafkaParameters;
            this.sinkDashVectorParameters = builder.sinkDashVectorParameters;
            this.sinkDataHubParameters = builder.sinkDataHubParameters;
            this.sinkDataWorksTriggerParameters = builder.sinkDataWorksTriggerParameters;
            this.sinkDorisParameters = builder.sinkDorisParameters;
            this.sinkFcParameters = builder.sinkFcParameters;
            this.sinkFnfParameters = builder.sinkFnfParameters;
            this.sinkKafkaParameters = builder.sinkKafkaParameters;
            this.sinkMNSParameters = builder.sinkMNSParameters;
            this.sinkOpenSourceRabbitMQParameters = builder.sinkOpenSourceRabbitMQParameters;
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
         * @return sinkOpenSourceRabbitMQParameters
         */
        public SinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
            return this.sinkOpenSourceRabbitMQParameters;
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
            private SinkApacheKafkaParameters sinkApacheKafkaParameters; 
            private SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters; 
            private SinkBaiLianParameters sinkBaiLianParameters; 
            private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters; 
            private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters; 
            private SinkDashVectorParameters sinkDashVectorParameters; 
            private SinkDataHubParameters sinkDataHubParameters; 
            private SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters; 
            private SinkDorisParameters sinkDorisParameters; 
            private SinkFcParameters sinkFcParameters; 
            private SinkFnfParameters sinkFnfParameters; 
            private SinkKafkaParameters sinkKafkaParameters; 
            private SinkMNSParameters sinkMNSParameters; 
            private SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters; 
            private SinkRabbitMQParameters sinkRabbitMQParameters; 
            private SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters; 
            private SinkRocketMQParameters sinkRocketMQParameters; 
            private SinkSLSParameters sinkSLSParameters; 

            private Builder() {
            } 

            private Builder(Sink model) {
                this.sinkApacheKafkaParameters = model.sinkApacheKafkaParameters;
                this.sinkApacheRocketMQCheckpointParameters = model.sinkApacheRocketMQCheckpointParameters;
                this.sinkBaiLianParameters = model.sinkBaiLianParameters;
                this.sinkCustomizedKafkaConnectorParameters = model.sinkCustomizedKafkaConnectorParameters;
                this.sinkCustomizedKafkaParameters = model.sinkCustomizedKafkaParameters;
                this.sinkDashVectorParameters = model.sinkDashVectorParameters;
                this.sinkDataHubParameters = model.sinkDataHubParameters;
                this.sinkDataWorksTriggerParameters = model.sinkDataWorksTriggerParameters;
                this.sinkDorisParameters = model.sinkDorisParameters;
                this.sinkFcParameters = model.sinkFcParameters;
                this.sinkFnfParameters = model.sinkFnfParameters;
                this.sinkKafkaParameters = model.sinkKafkaParameters;
                this.sinkMNSParameters = model.sinkMNSParameters;
                this.sinkOpenSourceRabbitMQParameters = model.sinkOpenSourceRabbitMQParameters;
                this.sinkRabbitMQParameters = model.sinkRabbitMQParameters;
                this.sinkRocketMQCheckpointParameters = model.sinkRocketMQCheckpointParameters;
                this.sinkRocketMQParameters = model.sinkRocketMQParameters;
                this.sinkSLSParameters = model.sinkSLSParameters;
            } 

            /**
             * SinkApacheKafkaParameters.
             */
            public Builder sinkApacheKafkaParameters(SinkApacheKafkaParameters sinkApacheKafkaParameters) {
                this.sinkApacheKafkaParameters = sinkApacheKafkaParameters;
                return this;
            }

            /**
             * <p>Sink Apache RocketMQ Checkpoint Parameters</p>
             */
            public Builder sinkApacheRocketMQCheckpointParameters(SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
                this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
                return this;
            }

            /**
             * <p>Sink BaiLian Parameters</p>
             */
            public Builder sinkBaiLianParameters(SinkBaiLianParameters sinkBaiLianParameters) {
                this.sinkBaiLianParameters = sinkBaiLianParameters;
                return this;
            }

            /**
             * SinkCustomizedKafkaConnectorParameters.
             */
            public Builder sinkCustomizedKafkaConnectorParameters(SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
                this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
                return this;
            }

            /**
             * SinkCustomizedKafkaParameters.
             */
            public Builder sinkCustomizedKafkaParameters(SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
                this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
                return this;
            }

            /**
             * SinkDashVectorParameters.
             */
            public Builder sinkDashVectorParameters(SinkDashVectorParameters sinkDashVectorParameters) {
                this.sinkDashVectorParameters = sinkDashVectorParameters;
                return this;
            }

            /**
             * SinkDataHubParameters.
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
             * SinkDorisParameters.
             */
            public Builder sinkDorisParameters(SinkDorisParameters sinkDorisParameters) {
                this.sinkDorisParameters = sinkDorisParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if the event target is Function Compute.</p>
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
             * <p>The parameters that are returned if the event target is Message Queue for Apache Kafka.</p>
             */
            public Builder sinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
                this.sinkKafkaParameters = sinkKafkaParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if the event target is Message Service (MNS).</p>
             */
            public Builder sinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
                this.sinkMNSParameters = sinkMNSParameters;
                return this;
            }

            /**
             * <p>Sink Open Source RabbitMQ Parameters</p>
             */
            public Builder sinkOpenSourceRabbitMQParameters(SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
                this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if the event target is Message Queue for RabbitMQ.</p>
             */
            public Builder sinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
                this.sinkRabbitMQParameters = sinkRabbitMQParameters;
                return this;
            }

            /**
             * <p>Sink RocketMQ Checkpoint Parameters</p>
             */
            public Builder sinkRocketMQCheckpointParameters(SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
                this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if ApsaraMQ for RocketMQ is specified as the event target.</p>
             */
            public Builder sinkRocketMQParameters(SinkRocketMQParameters sinkRocketMQParameters) {
                this.sinkRocketMQParameters = sinkRocketMQParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Simple Log Service is specified as the event target.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.valueDataType = model.valueDataType;
                this.vpcId = model.vpcId;
            } 

            /**
             * Bootstraps.
             */
            public Builder bootstraps(String bootstraps) {
                this.bootstraps = bootstraps;
                return this;
            }

            /**
             * ConsumerGroup.
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
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
             * OffsetReset.
             */
            public Builder offsetReset(String offsetReset) {
                this.offsetReset = offsetReset;
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
            public Builder securityGroupId(String securityGroupId) {
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
             * <p>The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Simple Log Service.</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
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
             * ValueDataType.
             */
            public Builder valueDataType(String valueDataType) {
                this.valueDataType = valueDataType;
                return this;
            }

            /**
             * VpcId.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SourceApacheRocketMQCheckpointParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

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
            this.instanceId = builder.instanceId;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String instanceId; 
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
                this.instanceId = model.instanceId;
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
             * InstanceEndpoint.
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The ID of the Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * Topics.
             */
            public Builder topics(java.util.List<String> topics) {
                this.topics = topics;
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
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-adw1awdw*****</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * Config.
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * Name.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * ConnectorPackageUrl.
             */
            public Builder connectorPackageUrl(String connectorPackageUrl) {
                this.connectorPackageUrl = connectorPackageUrl;
                return this;
            }

            /**
             * ConnectorParameters.
             */
            public Builder connectorParameters(SourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters) {
                this.connectorParameters = connectorParameters;
                return this;
            }

            /**
             * WorkerParameters.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The ID of the Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SourceDTSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrokerUrl")
        private String brokerUrl;

        @com.aliyun.core.annotation.NameInMap("InitCheckPoint")
        private String initCheckPoint;

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
        public String getInitCheckPoint() {
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
            private String initCheckPoint; 
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
             * <p>The URL and port number of the data subscription channel.</p>
             */
            public Builder brokerUrl(String brokerUrl) {
                this.brokerUrl = brokerUrl;
                return this;
            }

            /**
             * <p>The consumer offset. A consumer offset is a timestamp that indicates when the SDK client consumes the first data record. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1620962769</p>
             */
            public Builder initCheckPoint(String initCheckPoint) {
                this.initCheckPoint = initCheckPoint;
                return this;
            }

            /**
             * <p>The password of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>HD1</p>
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f86e5814-b223-482c-b768-3b873297dade</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The topic to which you want to subscribe by using the data subscription channel.</p>
             * 
             * <strong>example:</strong>
             * <p>TP_TEST_UNDERWRITE_ISSUE</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The ID of the consumer group that subscribes to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_TEST</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1fbtrnqmjvgq66ajdw</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The network. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).</p>
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
             * <p>The region ID of the Message Queue for Apache Kafka instance.</p>
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
             * <p>sg-2vcgdxz7o1n9zappuimt</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_empower_1642473600414</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9qqeovkwjxlu9uc8rst</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The encoding or decoding format. Valid values: Json, Text, and Binary. The value Json indicates that bytes are decoded into UTF-8 strings and then parsed into JSON format. The value Text indicates that bytes are decoded into UTF-8 strings and then put into the payload. The value Binary indicates that bytes are encoded into Base64 strings and put into the payload.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder valueDataType(String valueDataType) {
                this.valueDataType = valueDataType;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zehizpoendb3nwwu9w5o</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>Indicates whether Base64 encoding is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isBase64Decode(Boolean isBase64Decode) {
                this.isBase64Decode = isBase64Decode;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The region ID of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SourceMQTTParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyDataType")
        private String bodyDataType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private SourceMQTTParameters(Builder builder) {
            this.bodyDataType = builder.bodyDataType;
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
            private String bodyDataType; 
            private String instanceId; 
            private String regionId; 
            private String topic; 

            private Builder() {
            } 

            private Builder(SourceMQTTParameters model) {
                this.bodyDataType = model.bodyDataType;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.topic = model.topic;
            } 

            /**
             * BodyDataType.
             */
            public Builder bodyDataType(String bodyDataType) {
                this.bodyDataType = bodyDataType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze06wqdwk0uq14krrzv</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the Message Queue for MQTT instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the topic in the Message Queue for MQTT instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TOPIC-cainiao-pcs-wms-instock-noPrealertPrintLabel</p>
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
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Delimiter.
             */
            public Builder delimiter(String delimiter) {
                this.delimiter = delimiter;
                return this;
            }

            /**
             * LoadFormat.
             */
            public Builder loadFormat(String loadFormat) {
                this.loadFormat = loadFormat;
                return this;
            }

            /**
             * LoadMode.
             */
            public Builder loadMode(String loadMode) {
                this.loadMode = loadMode;
                return this;
            }

            /**
             * Prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * BodyDataType.
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
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The password of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2vcgdxz7o1n9zappuimt</p>
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
             * <p>vsw-wz9qqeovkwjxlu9uc8rst</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The name of the vhost of the Message Queue for RabbitMQ instance.</p>
             */
            public Builder virtualHostName(String virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zehizpoendb3nwwu9w5o</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * ExternalLabels.
             */
            public Builder externalLabels(String externalLabels) {
                this.externalLabels = externalLabels;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The region ID of the Message Queue for MQTT instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SourceRabbitMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
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

            private Builder() {
            } 

            private Builder(SourceRabbitMQParameters model) {
                this.instanceId = model.instanceId;
                this.queueName = model.queueName;
                this.regionId = model.regionId;
                this.virtualHostName = model.virtualHostName;
            } 

            /**
             * <p>The ID of the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-f8z9a9mcgwri1c1idd0z</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the queue in the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>comp</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The region ID of the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The vhost name of the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eb-connect</p>
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
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * <p>The ID of the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-f8z9a9mcgwri1c1idd0z</p>
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
             * <p>The region ID of the Message Queue for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Topics.
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * BodyDataType.
             */
            public Builder bodyDataType(String bodyDataType) {
                this.bodyDataType = bodyDataType;
                return this;
            }

            /**
             * FilterSql.
             */
            public Builder filterSql(String filterSql) {
                this.filterSql = filterSql;
                return this;
            }

            /**
             * FilterType.
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The ID of the consumer group in the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_group1</p>
             */
            public Builder groupID(String groupID) {
                this.groupID = groupID;
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
             * <p>The ID of the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-f8zbher64dlm58plyfte</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceNetwork.
             */
            public Builder instanceNetwork(String instanceNetwork) {
                this.instanceNetwork = instanceNetwork;
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
             * InstanceSecurityGroupId.
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
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
             * InstanceUsername.
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * InstanceVSwitchIds.
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * InstanceVpcId.
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * <p>The network. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The consumer offset of messages. Valid values: CONSUME_FROM_LAST_OFFSET: Start consumption from the latest offset. CONSUME_FROM_FIRST_OFFSET: Start consumption from the earliest offset. CONSUME_FROM_TIMESTAMP: Start consumption from the offset at the specified point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSUMEFROMLASTOFFSET</p>
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The region ID of the Message Queue for Apache RocketMQ instance.</p>
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
             * <p>sg-2vcgdxz7o1n9zappuimt</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The tags that are used to filter messages.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The timestamp of the offset from which consumption starts. This parameter is valid only if you set the Offset parameter to CONSUME_FROM_TIMESTAMP.</p>
             * 
             * <strong>example:</strong>
             * <p>1636597951964</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The topic to which the message belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_add_anima</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9qqeovkwjxlu9uc8rst</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zehizpoendb3nwwu9w5o</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class SourceSLSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumePosition")
        private String consumePosition;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
        private String consumerGroup;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private SourceSLSParameters(Builder builder) {
            this.consumePosition = builder.consumePosition;
            this.consumerGroup = builder.consumerGroup;
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
         * @return consumerGroup
         */
        public String getConsumerGroup() {
            return this.consumerGroup;
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
            private String consumerGroup; 
            private String logStore; 
            private String project; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(SourceSLSParameters model) {
                this.consumePosition = model.consumePosition;
                this.consumerGroup = model.consumerGroup;
                this.logStore = model.logStore;
                this.project = model.project;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The starting consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>begin</p>
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * <p>The consumer group.</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>waf-logstore</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>dmmzk</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("SourcePrometheusParameters")
        private SourcePrometheusParameters sourcePrometheusParameters;

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
            this.sourceKafkaParameters = builder.sourceKafkaParameters;
            this.sourceMNSParameters = builder.sourceMNSParameters;
            this.sourceMQTTParameters = builder.sourceMQTTParameters;
            this.sourceMySQLParameters = builder.sourceMySQLParameters;
            this.sourceOSSParameters = builder.sourceOSSParameters;
            this.sourceOpenSourceRabbitMQParameters = builder.sourceOpenSourceRabbitMQParameters;
            this.sourcePrometheusParameters = builder.sourcePrometheusParameters;
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
            private SourceKafkaParameters sourceKafkaParameters; 
            private SourceMNSParameters sourceMNSParameters; 
            private SourceMQTTParameters sourceMQTTParameters; 
            private SourceMySQLParameters sourceMySQLParameters; 
            private SourceOSSParameters sourceOSSParameters; 
            private SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters; 
            private SourcePrometheusParameters sourcePrometheusParameters; 
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
                this.sourceKafkaParameters = model.sourceKafkaParameters;
                this.sourceMNSParameters = model.sourceMNSParameters;
                this.sourceMQTTParameters = model.sourceMQTTParameters;
                this.sourceMySQLParameters = model.sourceMySQLParameters;
                this.sourceOSSParameters = model.sourceOSSParameters;
                this.sourceOpenSourceRabbitMQParameters = model.sourceOpenSourceRabbitMQParameters;
                this.sourcePrometheusParameters = model.sourcePrometheusParameters;
                this.sourceRabbitMQParameters = model.sourceRabbitMQParameters;
                this.sourceRocketMQCheckpointParameters = model.sourceRocketMQCheckpointParameters;
                this.sourceRocketMQParameters = model.sourceRocketMQParameters;
                this.sourceSLSParameters = model.sourceSLSParameters;
            } 

            /**
             * SourceApacheKafkaParameters.
             */
            public Builder sourceApacheKafkaParameters(SourceApacheKafkaParameters sourceApacheKafkaParameters) {
                this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Apache RocketMQ (Offset Data) is specified as the event source.</p>
             */
            public Builder sourceApacheRocketMQCheckpointParameters(SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
                this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
                return this;
            }

            /**
             * SourceCustomizedKafkaConnectorParameters.
             */
            public Builder sourceCustomizedKafkaConnectorParameters(SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
                this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
                return this;
            }

            /**
             * SourceCustomizedKafkaParameters.
             */
            public Builder sourceCustomizedKafkaParameters(SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
                this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if the event source is Data Transmission Service (DTS).</p>
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
             * <p>The parameters that are returned if ApsaraMQ for Kafka is specified as the event source.</p>
             */
            public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
                this.sourceKafkaParameters = sourceKafkaParameters;
                return this;
            }

            /**
             * <p>Source MNS Parameters</p>
             */
            public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
                this.sourceMNSParameters = sourceMNSParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if ApsaraMQ for MQTT is specified as the event source.</p>
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
             * SourceOSSParameters.
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
             * SourcePrometheusParameters.
             */
            public Builder sourcePrometheusParameters(SourcePrometheusParameters sourcePrometheusParameters) {
                this.sourcePrometheusParameters = sourcePrometheusParameters;
                return this;
            }

            /**
             * <p>Source RabbitMQ Parameters</p>
             */
            public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
                this.sourceRabbitMQParameters = sourceRabbitMQParameters;
                return this;
            }

            /**
             * SourceRocketMQCheckpointParameters.
             */
            public Builder sourceRocketMQCheckpointParameters(SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
                this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if ApsaraMQ for RocketMQ is specified as the event source.</p>
             */
            public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
                this.sourceRocketMQParameters = sourceRocketMQParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if the event provider is Simple Log Service.</p>
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
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class Transforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
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

            private Builder() {
            } 

            private Builder(Transforms model) {
                this.arn = model.arn;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the cloud service, such as the ARN of a Function Compute function.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:fc:cn-hangzhou:*****:services/demo-service.LATEST/functions/demo-func</p>
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
    /**
     * 
     * {@link GetEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventStreamingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetailedStatus")
        private DetailedStatus detailedStatus;

        @com.aliyun.core.annotation.NameInMap("EventStreamingName")
        private String eventStreamingName;

        @com.aliyun.core.annotation.NameInMap("FilterPattern")
        private String filterPattern;

        @com.aliyun.core.annotation.NameInMap("RunOptions")
        private RunOptions runOptions;

        @com.aliyun.core.annotation.NameInMap("Sink")
        private Sink sink;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Transforms")
        private java.util.List<Transforms> transforms;

        private Data(Builder builder) {
            this.description = builder.description;
            this.detailedStatus = builder.detailedStatus;
            this.eventStreamingName = builder.eventStreamingName;
            this.filterPattern = builder.filterPattern;
            this.runOptions = builder.runOptions;
            this.sink = builder.sink;
            this.source = builder.source;
            this.status = builder.status;
            this.transforms = builder.transforms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detailedStatus
         */
        public DetailedStatus getDetailedStatus() {
            return this.detailedStatus;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transforms
         */
        public java.util.List<Transforms> getTransforms() {
            return this.transforms;
        }

        public static final class Builder {
            private String description; 
            private DetailedStatus detailedStatus; 
            private String eventStreamingName; 
            private String filterPattern; 
            private RunOptions runOptions; 
            private Sink sink; 
            private Source source; 
            private String status; 
            private java.util.List<Transforms> transforms; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.detailedStatus = model.detailedStatus;
                this.eventStreamingName = model.eventStreamingName;
                this.filterPattern = model.filterPattern;
                this.runOptions = model.runOptions;
                this.sink = model.sink;
                this.source = model.source;
                this.status = model.status;
                this.transforms = model.transforms;
            } 

            /**
             * <p>The description of the event stream that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>RocketMQ-to-RocketMQ</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DetailedStatus.
             */
            public Builder detailedStatus(DetailedStatus detailedStatus) {
                this.detailedStatus = detailedStatus;
                return this;
            }

            /**
             * <p>The name of the event stream that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>rocketmq-sync</p>
             */
            public Builder eventStreamingName(String eventStreamingName) {
                this.eventStreamingName = eventStreamingName;
                return this;
            }

            /**
             * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
             */
            public Builder filterPattern(String filterPattern) {
                this.filterPattern = filterPattern;
                return this;
            }

            /**
             * <p>The runtime environment-related configurations.</p>
             */
            public Builder runOptions(RunOptions runOptions) {
                this.runOptions = runOptions;
                return this;
            }

            /**
             * <p>The event target.</p>
             */
            public Builder sink(Sink sink) {
                this.sink = sink;
                return this;
            }

            /**
             * <p>The event source.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the event stream that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Transforms.
             */
            public Builder transforms(java.util.List<Transforms> transforms) {
                this.transforms = transforms;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
