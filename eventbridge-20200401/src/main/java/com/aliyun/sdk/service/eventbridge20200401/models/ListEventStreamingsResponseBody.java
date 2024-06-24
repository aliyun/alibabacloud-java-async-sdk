// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListEventStreamingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventStreamingsResponseBody</p>
 */
public class ListEventStreamingsResponseBody extends TeaModel {
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

    private ListEventStreamingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventStreamingsResponseBody create() {
        return builder().build();
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

        /**
         * The response code. Valid values:
         * <p>
         * 
         * Success: The request is successful.
         * 
         * Other codes: The request failed. For more information about error codes, see Error codes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the event streams.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. The value true indicates that the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEventStreamingsResponseBody build() {
            return new ListEventStreamingsResponseBody(this);
        } 

    } 

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

            /**
             * The maximum number of events that are allowed in the batch window. When this threshold is reached, data in the window is pushed to the downstream service. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.
             */
            public Builder countBasedWindow(Integer countBasedWindow) {
                this.countBasedWindow = countBasedWindow;
                return this;
            }

            /**
             * The maximum period of time during which events are allowed in the batch window. Unit: seconds. When this threshold is reached, data in the window is pushed to the downstream service. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.
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
        @com.aliyun.core.annotation.NameInMap("Arn")
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
    public static class KafkaLogParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private KafkaLogParameters(Builder builder) {
            this.endpoint = builder.endpoint;
            this.instanceId = builder.instanceId;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaLogParameters create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String endpoint; 
            private String instanceId; 
            private String topic; 

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
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
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public KafkaLogParameters build() {
                return new KafkaLogParameters(this);
            } 

        } 

    }
    public static class SLSLogParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogstoreName")
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private SLSLogParameters(Builder builder) {
            this.logstoreName = builder.logstoreName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLSLogParameters create() {
            return builder().build();
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String logstoreName; 
            private String projectName; 

            /**
             * LogstoreName.
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public SLSLogParameters build() {
                return new SLSLogParameters(this);
            } 

        } 

    }
    public static class LogDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KafkaLogParameters")
        private java.util.List < KafkaLogParameters> kafkaLogParameters;

        @com.aliyun.core.annotation.NameInMap("SLSLogParameters")
        private java.util.List < SLSLogParameters> SLSLogParameters;

        private LogDelivery(Builder builder) {
            this.kafkaLogParameters = builder.kafkaLogParameters;
            this.SLSLogParameters = builder.SLSLogParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDelivery create() {
            return builder().build();
        }

        /**
         * @return kafkaLogParameters
         */
        public java.util.List < KafkaLogParameters> getKafkaLogParameters() {
            return this.kafkaLogParameters;
        }

        /**
         * @return SLSLogParameters
         */
        public java.util.List < SLSLogParameters> getSLSLogParameters() {
            return this.SLSLogParameters;
        }

        public static final class Builder {
            private java.util.List < KafkaLogParameters> kafkaLogParameters; 
            private java.util.List < SLSLogParameters> SLSLogParameters; 

            /**
             * KafkaLogParameters.
             */
            public Builder kafkaLogParameters(java.util.List < KafkaLogParameters> kafkaLogParameters) {
                this.kafkaLogParameters = kafkaLogParameters;
                return this;
            }

            /**
             * SLSLogParameters.
             */
            public Builder SLSLogParameters(java.util.List < SLSLogParameters> SLSLogParameters) {
                this.SLSLogParameters = SLSLogParameters;
                return this;
            }

            public LogDelivery build() {
                return new LogDelivery(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Network(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
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
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 

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
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
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

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private Resources(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private Integer value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List < Resources> resources;

        private ResourceSpec(Builder builder) {
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return resources
         */
        public java.util.List < Resources> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private java.util.List < Resources> resources; 

            /**
             * Resources.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
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

            /**
             * The maximum timeout period for a retry.
             */
            public Builder maximumEventAgeInSeconds(Float maximumEventAgeInSeconds) {
                this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
                return this;
            }

            /**
             * The maximum number of retries.
             */
            public Builder maximumRetryAttempts(Float maximumRetryAttempts) {
                this.maximumRetryAttempts = maximumRetryAttempts;
                return this;
            }

            /**
             * Valid values: BACKOFFRETRY and EXPONENTIALDECAY_RETRY.
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
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private Metadata(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private Integer value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    public static class Triggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Triggers(Builder builder) {
            this.metadata = builder.metadata;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Metadata metadata; 
            private String type; 

            /**
             * Metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
    public static class ScaledObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxReplicaCount")
        private Integer maxReplicaCount;

        @com.aliyun.core.annotation.NameInMap("MinReplicaCount")
        private Integer minReplicaCount;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List < Triggers> triggers;

        private ScaledObject(Builder builder) {
            this.maxReplicaCount = builder.maxReplicaCount;
            this.minReplicaCount = builder.minReplicaCount;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaledObject create() {
            return builder().build();
        }

        /**
         * @return maxReplicaCount
         */
        public Integer getMaxReplicaCount() {
            return this.maxReplicaCount;
        }

        /**
         * @return minReplicaCount
         */
        public Integer getMinReplicaCount() {
            return this.minReplicaCount;
        }

        /**
         * @return triggers
         */
        public java.util.List < Triggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer maxReplicaCount; 
            private Integer minReplicaCount; 
            private java.util.List < Triggers> triggers; 

            /**
             * MaxReplicaCount.
             */
            public Builder maxReplicaCount(Integer maxReplicaCount) {
                this.maxReplicaCount = maxReplicaCount;
                return this;
            }

            /**
             * MinReplicaCount.
             */
            public Builder minReplicaCount(Integer minReplicaCount) {
                this.minReplicaCount = minReplicaCount;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(java.util.List < Triggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public ScaledObject build() {
                return new ScaledObject(this);
            } 

        } 

    }
    public static class RunOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchWindow")
        private BatchWindow batchWindow;

        @com.aliyun.core.annotation.NameInMap("DeadLetterQueue")
        private DeadLetterQueue deadLetterQueue;

        @com.aliyun.core.annotation.NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @com.aliyun.core.annotation.NameInMap("LogDelivery")
        private LogDelivery logDelivery;

        @com.aliyun.core.annotation.NameInMap("MaximumTasks")
        private Integer maximumTasks;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @com.aliyun.core.annotation.NameInMap("RetryStrategy")
        private RetryStrategy retryStrategy;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("ScaledObject")
        private ScaledObject scaledObject;

        private RunOptions(Builder builder) {
            this.batchWindow = builder.batchWindow;
            this.deadLetterQueue = builder.deadLetterQueue;
            this.errorsTolerance = builder.errorsTolerance;
            this.logDelivery = builder.logDelivery;
            this.maximumTasks = builder.maximumTasks;
            this.network = builder.network;
            this.resourceSpec = builder.resourceSpec;
            this.retryStrategy = builder.retryStrategy;
            this.roleName = builder.roleName;
            this.scaledObject = builder.scaledObject;
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
         * @return logDelivery
         */
        public LogDelivery getLogDelivery() {
            return this.logDelivery;
        }

        /**
         * @return maximumTasks
         */
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return retryStrategy
         */
        public RetryStrategy getRetryStrategy() {
            return this.retryStrategy;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return scaledObject
         */
        public ScaledObject getScaledObject() {
            return this.scaledObject;
        }

        public static final class Builder {
            private BatchWindow batchWindow; 
            private DeadLetterQueue deadLetterQueue; 
            private String errorsTolerance; 
            private LogDelivery logDelivery; 
            private Integer maximumTasks; 
            private Network network; 
            private ResourceSpec resourceSpec; 
            private RetryStrategy retryStrategy; 
            private String roleName; 
            private ScaledObject scaledObject; 

            /**
             * The batch window.
             */
            public Builder batchWindow(BatchWindow batchWindow) {
                this.batchWindow = batchWindow;
                return this;
            }

            /**
             * Indicates whether dead-letter queues are enabled. By default, dead-letter queues are disabled. Messages that fail to be pushed are discarded after the maximum number of retries that is specified by the retry policy is reached.
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * The exception tolerance policy. Valid values: NONE and ALL.
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * LogDelivery.
             */
            public Builder logDelivery(LogDelivery logDelivery) {
                this.logDelivery = logDelivery;
                return this;
            }

            /**
             * The number of concurrent threads.
             */
            public Builder maximumTasks(Integer maximumTasks) {
                this.maximumTasks = maximumTasks;
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
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * The retry policy that is used if events fail to be pushed.
             */
            public Builder retryStrategy(RetryStrategy retryStrategy) {
                this.retryStrategy = retryStrategy;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * ScaledObject.
             */
            public Builder scaledObject(ScaledObject scaledObject) {
                this.scaledObject = scaledObject;
                return this;
            }

            public RunOptions build() {
                return new RunOptions(this);
            } 

        } 

    }
    public static class ConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map < String, ? > config;

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
        public java.util.Map < String, ? > getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map < String, ? > config; 
            private String name; 

            /**
             * Config.
             */
            public Builder config(java.util.Map < String, ? > config) {
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
    public static class SinkCustomizedKafkaConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorPackageUrl")
        private String connectorPackageUrl;

        @com.aliyun.core.annotation.NameInMap("ConnectorParameters")
        private ConnectorParameters connectorParameters;

        @com.aliyun.core.annotation.NameInMap("WorkerParameters")
        private java.util.Map < String, ? > workerParameters;

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
        public java.util.Map < String, ? > getWorkerParameters() {
            return this.workerParameters;
        }

        public static final class Builder {
            private String connectorPackageUrl; 
            private ConnectorParameters connectorParameters; 
            private java.util.Map < String, ? > workerParameters; 

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
            public Builder workerParameters(java.util.Map < String, ? > workerParameters) {
                this.workerParameters = workerParameters;
                return this;
            }

            public SinkCustomizedKafkaConnectorParameters build() {
                return new SinkCustomizedKafkaConnectorParameters(this);
            } 

        } 

    }
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

            public SinkDataHubParametersBody build() {
                return new SinkDataHubParametersBody(this);
            } 

        } 

    }
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

            public Project build() {
                return new Project(this);
            } 

        } 

    }
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

            public RoleName build() {
                return new RoleName(this);
            } 

        } 

    }
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

            public Topic build() {
                return new Topic(this);
            } 

        } 

    }
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

            public TopicSchema build() {
                return new TopicSchema(this);
            } 

        } 

    }
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

            public TopicType build() {
                return new TopicType(this);
            } 

        } 

    }
    public static class SinkDataHubParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkDataHubParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Project")
        private Project project;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private RoleName roleName;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private Topic topic;

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
        public Topic getTopic() {
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
            private Topic topic; 
            private TopicSchema topicSchema; 
            private TopicType topicType; 

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
            public Builder topic(Topic topic) {
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The function name.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The invocation mode. Valid values:
             * <p>
             * 
             * *   Sync: the synchronous mode
             * *   Async: the asynchronous mode
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The service name.
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
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkFcParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Concurrency concurrency;

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
             * The message body that is delivered to Function Compute.
             */
            public Builder body(SinkFcParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The delivery concurrency. Minimum value: 1.
             */
            public Builder concurrency(Concurrency concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * The function name.
             */
            public Builder functionName(FunctionName functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The invocation mode. Valid values:
             * <p>
             * 
             * *   Sync: the synchronous mode
             * *   Async: the asynchronous mode
             */
            public Builder invocationType(InvocationType invocationType) {
                this.invocationType = invocationType;
                return this;
            }

            /**
             * The alias of the service to which the function belongs.
             */
            public Builder qualifier(Qualifier qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The service name.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
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
             * The execution name.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
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
             * The flow name.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
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
             * The input information of the execution.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
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
             * The role name.
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

            /**
             * The execution name.
             */
            public Builder executionName(ExecutionName executionName) {
                this.executionName = executionName;
                return this;
            }

            /**
             * The flow name.
             */
            public Builder flowName(FlowName flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * The input information of the execution.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The role name.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The ACK mode.
             * <p>
             * 
             * *   If this parameter is set to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.
             * *   If this parameter is set to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.
             * *   If this parameter is set to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The topic name.
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
             * The value before transformation.
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
        @com.aliyun.core.annotation.NameInMap("Acks")
        private Acks acks;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private InstanceId instanceId;

        @com.aliyun.core.annotation.NameInMap("Key")
        private Key key;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private SinkKafkaParametersTopic topic;

        @com.aliyun.core.annotation.NameInMap("Value")
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
        public SinkKafkaParametersTopic getTopic() {
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
            private SinkKafkaParametersTopic topic; 
            private Value value; 

            /**
             * The acknowledgment (ACK) mode.
             * <p>
             * 
             * *   If this parameter is set to 0, no response is returned from the broker. In this mode, the performance is high, but the risk of data loss is also high.
             * *   If this parameter is set to 1, a response is returned when data is written to the leader. In this mode, the performance and the risk of data loss are moderate. Data loss may occur if a failure occurs on the leader.
             * *   If this parameter is set to all, a response is returned when data is written to the leader and synchronized to the followers. In this mode, the performance is low, but the risk of data loss is also low. Data loss occurs if the leader and the followers fail at the same time.
             */
            public Builder acks(Acks acks) {
                this.acks = acks;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache Kafka instance.
             */
            public Builder instanceId(InstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The message key.
             */
            public Builder key(Key key) {
                this.key = key;
                return this;
            }

            /**
             * The topic name.
             */
            public Builder topic(SinkKafkaParametersTopic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The message body.
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Indicates that Base64 encoding is enabled.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the MNS queue.
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

            /**
             * The message body.
             */
            public Builder body(SinkMNSParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * Indicates whether Base64 encoding is enabled.
             */
            public Builder isBase64Encode(IsBase64Encode isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * The name of the MNS queue.
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the exchange on the Message Queue for RabbitMQ instance.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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
             * The value before transformation.
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the queue on the Message Queue for RabbitMQ instance.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The rule that is used to route messages.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The type of the resource to which events are delivered. Valid values: Exchange and Queue.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the vhost of the Message Queue for RabbitMQ instance.
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
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkRabbitMQParametersBody body;

        @com.aliyun.core.annotation.NameInMap("Exchange")
        private Exchange exchange;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private SinkRabbitMQParametersInstanceId instanceId;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private MessageId messageId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private SinkRabbitMQParametersQueueName queueName;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private RoutingKey routingKey;

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
             * The message body.
             */
            public Builder body(SinkRabbitMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The exchange to which events are delivered. This parameter is returned only if TargetType is set to Exchange.
             */
            public Builder exchange(Exchange exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * The ID of the Message Queue for RabbitMQ instance.
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
             * The attributes that are used to filter messages.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The queue to which events are delivered. This parameter is returned only if TargetType is set to Queue.
             */
            public Builder queueName(SinkRabbitMQParametersQueueName queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The rule that is used to route messages. This parameter is returned only if TargetType is set to Exchange.
             */
            public Builder routingKey(RoutingKey routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * The type of the resource to which events are delivered.
             */
            public Builder targetType(TargetType targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The name of the vhost of the Message Queue for RabbitMQ instance.
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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
             * The value before transformation.
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
             * The value before transformation.
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The name of the topic on the Message Queue for Apache RocketMQ instance.
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
        @com.aliyun.core.annotation.NameInMap("Body")
        private SinkRocketMQParametersBody body;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private SinkRocketMQParametersInstanceId instanceId;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private Keys keys;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private SinkRocketMQParametersProperties properties;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * The message body.
             */
            public Builder body(SinkRocketMQParametersBody body) {
                this.body = body;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for Apache RocketMQ is specified as the event target.
             */
            public Builder instanceId(SinkRocketMQParametersInstanceId instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The keys that are used to filter messages.
             */
            public Builder keys(Keys keys) {
                this.keys = keys;
                return this;
            }

            /**
             * The attributes that are used to filter messages.
             */
            public Builder properties(SinkRocketMQParametersProperties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The tags that are used to filter messages.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The name of the topic on the Message Queue for Apache RocketMQ instance.
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
             * The value before transformation.
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
             * The value before transformation.
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
             * The value before transformation.
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            public SinkSLSParametersProject build() {
                return new SinkSLSParametersProject(this);
            } 

        } 

    }
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The method that is used to transform events. Default value: CONSTANT.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * None
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

            /**
             * The message body that is delivered to Log Service.
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
             * The Log Service Logstore.
             */
            public Builder logStore(LogStore logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The Log Service project.
             */
            public Builder project(SinkSLSParametersProject project) {
                this.project = project;
                return this;
            }

            /**
             * The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console.
             */
            public Builder roleName(SinkSLSParametersRoleName roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Log Service.
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
        @com.aliyun.core.annotation.NameInMap("SinkCustomizedKafkaConnectorParameters")
        private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

        @com.aliyun.core.annotation.NameInMap("SinkCustomizedKafkaParameters")
        private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkDataHubParameters")
        private SinkDataHubParameters sinkDataHubParameters;

        @com.aliyun.core.annotation.NameInMap("SinkFcParameters")
        private SinkFcParameters sinkFcParameters;

        @com.aliyun.core.annotation.NameInMap("SinkFnfParameters")
        private SinkFnfParameters sinkFnfParameters;

        @com.aliyun.core.annotation.NameInMap("SinkKafkaParameters")
        private SinkKafkaParameters sinkKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SinkMNSParameters")
        private SinkMNSParameters sinkMNSParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRabbitMQParameters")
        private SinkRabbitMQParameters sinkRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkRocketMQParameters")
        private SinkRocketMQParameters sinkRocketMQParameters;

        @com.aliyun.core.annotation.NameInMap("SinkSLSParameters")
        private SinkSLSParameters sinkSLSParameters;

        private Sink(Builder builder) {
            this.sinkCustomizedKafkaConnectorParameters = builder.sinkCustomizedKafkaConnectorParameters;
            this.sinkCustomizedKafkaParameters = builder.sinkCustomizedKafkaParameters;
            this.sinkDataHubParameters = builder.sinkDataHubParameters;
            this.sinkFcParameters = builder.sinkFcParameters;
            this.sinkFnfParameters = builder.sinkFnfParameters;
            this.sinkKafkaParameters = builder.sinkKafkaParameters;
            this.sinkMNSParameters = builder.sinkMNSParameters;
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
         * @return sinkDataHubParameters
         */
        public SinkDataHubParameters getSinkDataHubParameters() {
            return this.sinkDataHubParameters;
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
            private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters; 
            private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters; 
            private SinkDataHubParameters sinkDataHubParameters; 
            private SinkFcParameters sinkFcParameters; 
            private SinkFnfParameters sinkFnfParameters; 
            private SinkKafkaParameters sinkKafkaParameters; 
            private SinkMNSParameters sinkMNSParameters; 
            private SinkRabbitMQParameters sinkRabbitMQParameters; 
            private SinkRocketMQParameters sinkRocketMQParameters; 
            private SinkSLSParameters sinkSLSParameters; 

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
             * SinkDataHubParameters.
             */
            public Builder sinkDataHubParameters(SinkDataHubParameters sinkDataHubParameters) {
                this.sinkDataHubParameters = sinkDataHubParameters;
                return this;
            }

            /**
             * The parameters that are returned if Function Compute is specified as the event target.
             */
            public Builder sinkFcParameters(SinkFcParameters sinkFcParameters) {
                this.sinkFcParameters = sinkFcParameters;
                return this;
            }

            /**
             * The parameters that are returned if Serverless Workflow is specified as the event target.
             */
            public Builder sinkFnfParameters(SinkFnfParameters sinkFnfParameters) {
                this.sinkFnfParameters = sinkFnfParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for Apache Kafka is specified as the event target.
             */
            public Builder sinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
                this.sinkKafkaParameters = sinkKafkaParameters;
                return this;
            }

            /**
             * The parameters that are returned if MNS is specified as the event target.
             */
            public Builder sinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
                this.sinkMNSParameters = sinkMNSParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for RabbitMQ is specified as the event target.
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
             * The name of the topic in which logs are stored. The topic corresponds to the topic reserved field in Log Service.
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
    public static class SourceCustomizedKafkaConnectorParametersConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map < String, ? > config;

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
        public java.util.Map < String, ? > getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map < String, ? > config; 
            private String name; 

            /**
             * Config.
             */
            public Builder config(java.util.Map < String, ? > config) {
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
    public static class SourceCustomizedKafkaConnectorParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorPackageUrl")
        private String connectorPackageUrl;

        @com.aliyun.core.annotation.NameInMap("ConnectorParameters")
        private SourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters;

        @com.aliyun.core.annotation.NameInMap("WorkerParameters")
        private java.util.Map < String, ? > workerParameters;

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
        public java.util.Map < String, ? > getWorkerParameters() {
            return this.workerParameters;
        }

        public static final class Builder {
            private String connectorPackageUrl; 
            private SourceCustomizedKafkaConnectorParametersConnectorParameters connectorParameters; 
            private java.util.Map < String, ? > workerParameters; 

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
            public Builder workerParameters(java.util.Map < String, ? > workerParameters) {
                this.workerParameters = workerParameters;
                return this;
            }

            public SourceCustomizedKafkaConnectorParameters build() {
                return new SourceCustomizedKafkaConnectorParameters(this);
            } 

        } 

    }
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

            /**
             * The parameters that are returned if Message Queue for Apache RocketMQ is specified as the event target.
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

            /**
             * The URL and port number of the change tracking instance.
             */
            public Builder brokerUrl(String brokerUrl) {
                this.brokerUrl = brokerUrl;
                return this;
            }

            /**
             * The consumer offset. It is the timestamp that indicates when the SDK client consumes the first data record.
             */
            public Builder initCheckPoint(String initCheckPoint) {
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
             * The name of the tracked topic on the change tracking instance.
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

            /**
             * The ID of the consumer group that subscribes to the topic.
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
             * The network type. Valid values: Default and PublicNetwork. Default value: Default. The value PublicNetwork indicates a VPC.
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
             * The name of the topic on the Message Queue for Apache Kafka instance.
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

            /**
             * Indicates whether Base64 encoding is enabled.
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

            /**
             * BodyDataType.
             */
            public Builder bodyDataType(String bodyDataType) {
                this.bodyDataType = bodyDataType;
                return this;
            }

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
             * The name of the topic on the Message Queue for MQTT instance.
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
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private SourcePrometheusParameters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dataType = builder.dataType;
            this.labels = builder.labels;
            this.regionId = builder.regionId;
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

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String clusterId; 
            private String dataType; 
            private String labels; 
            private String regionId; 

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

            /**
             * The ID of the region where the Message Queue for MQTT instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SourcePrometheusParameters build() {
                return new SourcePrometheusParameters(this);
            } 

        } 

    }
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

            /**
             * The authentication method.
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
             * The ID of the group on the Message Queue for Apache RocketMQ instance.
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
             * *   PublicNetwork
             * *   PrivateNetwork
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
             * The virtual private cloud (VPC) ID.
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * The network type. Valid values: Default and PublicNetwork. Default value: Default. The value PublicNetwork indicates a VPC.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * The consumer offset of the message. Valid values: CONSUMEFROMLASTOFFSET: Messages are consumed from the latest offset. CONSUMEFROMFIRSTOFFSET: Messages are consumed from the earliest offset. CONSUMEFROMTIMESTAMP: Messages are consumed from the offset at the specified point in time.
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
             * The security group ID.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The tag that is used to filter messages.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The timestamp that indicates the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUMEFROMTIMESTAMP.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The topic in which messages are stored.
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
             * The VPC ID.
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

            /**
             * The consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start message consumption.
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * The ID of the consumer group that subscribes to the topic.
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * The Log Service Logstore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The Log Service project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

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
        @com.aliyun.core.annotation.NameInMap("SourceApacheKafkaParameters")
        private SourceApacheKafkaParameters sourceApacheKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceCustomizedKafkaConnectorParameters")
        private SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

        @com.aliyun.core.annotation.NameInMap("SourceCustomizedKafkaParameters")
        private SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceDTSParameters")
        private SourceDTSParameters sourceDTSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceKafkaParameters")
        private SourceKafkaParameters sourceKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceMNSParameters")
        private SourceMNSParameters sourceMNSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceMQTTParameters")
        private SourceMQTTParameters sourceMQTTParameters;

        @com.aliyun.core.annotation.NameInMap("SourcePrometheusParameters")
        private SourcePrometheusParameters sourcePrometheusParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRabbitMQParameters")
        private SourceRabbitMQParameters sourceRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRocketMQParameters")
        private SourceRocketMQParameters sourceRocketMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourceSLSParameters")
        private SourceSLSParameters sourceSLSParameters;

        private Source(Builder builder) {
            this.sourceApacheKafkaParameters = builder.sourceApacheKafkaParameters;
            this.sourceCustomizedKafkaConnectorParameters = builder.sourceCustomizedKafkaConnectorParameters;
            this.sourceCustomizedKafkaParameters = builder.sourceCustomizedKafkaParameters;
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
         * @return sourceApacheKafkaParameters
         */
        public SourceApacheKafkaParameters getSourceApacheKafkaParameters() {
            return this.sourceApacheKafkaParameters;
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
            private SourceApacheKafkaParameters sourceApacheKafkaParameters; 
            private SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters; 
            private SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters; 
            private SourceDTSParameters sourceDTSParameters; 
            private SourceKafkaParameters sourceKafkaParameters; 
            private SourceMNSParameters sourceMNSParameters; 
            private SourceMQTTParameters sourceMQTTParameters; 
            private SourcePrometheusParameters sourcePrometheusParameters; 
            private SourceRabbitMQParameters sourceRabbitMQParameters; 
            private SourceRocketMQParameters sourceRocketMQParameters; 
            private SourceSLSParameters sourceSLSParameters; 

            /**
             * SourceApacheKafkaParameters.
             */
            public Builder sourceApacheKafkaParameters(SourceApacheKafkaParameters sourceApacheKafkaParameters) {
                this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
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
             * The parameters that are returned if Data Transmission Service (DTS) is specified as the event source.
             */
            public Builder sourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
                this.sourceDTSParameters = sourceDTSParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for Apache Kafka is specified as the event source.
             */
            public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
                this.sourceKafkaParameters = sourceKafkaParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Service (MNS) is specified as the event source.
             */
            public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
                this.sourceMNSParameters = sourceMNSParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for MQTT is specified as the event source.
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
             * The parameters that are returned if Message Queue for RabbitMQ is specified as the event source.
             */
            public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
                this.sourceRabbitMQParameters = sourceRabbitMQParameters;
                return this;
            }

            /**
             * Source RocketMQ Parameters
             */
            public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
                this.sourceRocketMQParameters = sourceRocketMQParameters;
                return this;
            }

            /**
             * The parameters that are returned if Log Service is specified as the event source.
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
    public static class EventStreamings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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
        private java.util.List < Transforms> transforms;

        private EventStreamings(Builder builder) {
            this.description = builder.description;
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

        public static EventStreamings create() {
            return builder().build();
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transforms
         */
        public java.util.List < Transforms> getTransforms() {
            return this.transforms;
        }

        public static final class Builder {
            private String description; 
            private String eventStreamingName; 
            private String filterPattern; 
            private RunOptions runOptions; 
            private Sink sink; 
            private Source source; 
            private String status; 
            private java.util.List < Transforms> transforms; 

            /**
             * The description of the event stream.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the event stream.
             */
            public Builder eventStreamingName(String eventStreamingName) {
                this.eventStreamingName = eventStreamingName;
                return this;
            }

            /**
             * The rule that is used to filter events. If you leave this parameter empty, all events are matched.
             */
            public Builder filterPattern(String filterPattern) {
                this.filterPattern = filterPattern;
                return this;
            }

            /**
             * The parameters that are returned for the runtime environment.
             */
            public Builder runOptions(RunOptions runOptions) {
                this.runOptions = runOptions;
                return this;
            }

            /**
             * The event target.
             */
            public Builder sink(Sink sink) {
                this.sink = sink;
                return this;
            }

            /**
             * The event provider, which is also known as the event source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * The status of the event stream that is returned.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Transforms.
             */
            public Builder transforms(java.util.List < Transforms> transforms) {
                this.transforms = transforms;
                return this;
            }

            public EventStreamings build() {
                return new EventStreamings(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventStreamings")
        private java.util.List < EventStreamings> eventStreamings;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.eventStreamings = builder.eventStreamings;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventStreamings
         */
        public java.util.List < EventStreamings> getEventStreamings() {
            return this.eventStreamings;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < EventStreamings> eventStreamings; 
            private String nextToken; 
            private Integer total; 

            /**
             * The event streams.
             */
            public Builder eventStreamings(java.util.List < EventStreamings> eventStreamings) {
                this.eventStreamings = eventStreamings;
                return this;
            }

            /**
             * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. You must specify the pagination token in the next request.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of records.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
