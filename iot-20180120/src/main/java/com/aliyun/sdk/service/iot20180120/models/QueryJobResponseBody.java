// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobResponseBody</p>
 */
public class QueryJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryJobResponseBody build() {
            return new QueryJobResponseBody(this);
        } 

    } 

    public static class JobFile extends TeaModel {
        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("SignMethod")
        private String signMethod;

        private JobFile(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.sign = builder.sign;
            this.signMethod = builder.signMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobFile create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return signMethod
         */
        public String getSignMethod() {
            return this.signMethod;
        }

        public static final class Builder {
            private String fileUrl; 
            private String sign; 
            private String signMethod; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * SignMethod.
             */
            public Builder signMethod(String signMethod) {
                this.signMethod = signMethod;
                return this;
            }

            public JobFile build() {
                return new JobFile(this);
            } 

        } 

    }
    public static class RolloutConfig extends TeaModel {
        @NameInMap("MaximumPerMinute")
        private Integer maximumPerMinute;

        @NameInMap("MessageQoS")
        private String messageQoS;

        private RolloutConfig(Builder builder) {
            this.maximumPerMinute = builder.maximumPerMinute;
            this.messageQoS = builder.messageQoS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RolloutConfig create() {
            return builder().build();
        }

        /**
         * @return maximumPerMinute
         */
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

        /**
         * @return messageQoS
         */
        public String getMessageQoS() {
            return this.messageQoS;
        }

        public static final class Builder {
            private Integer maximumPerMinute; 
            private String messageQoS; 

            /**
             * MaximumPerMinute.
             */
            public Builder maximumPerMinute(Integer maximumPerMinute) {
                this.maximumPerMinute = maximumPerMinute;
                return this;
            }

            /**
             * MessageQoS.
             */
            public Builder messageQoS(String messageQoS) {
                this.messageQoS = messageQoS;
                return this;
            }

            public RolloutConfig build() {
                return new RolloutConfig(this);
            } 

        } 

    }
    public static class TargetDevices extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ProductKey")
        private String productKey;

        private TargetDevices(Builder builder) {
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetDevices create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String productKey; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public TargetDevices build() {
                return new TargetDevices(this);
            } 

        } 

    }
    public static class TargetConfigTargetDevices extends TeaModel {
        @NameInMap("targetDevices")
        private java.util.List < TargetDevices> targetDevices;

        private TargetConfigTargetDevices(Builder builder) {
            this.targetDevices = builder.targetDevices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfigTargetDevices create() {
            return builder().build();
        }

        /**
         * @return targetDevices
         */
        public java.util.List < TargetDevices> getTargetDevices() {
            return this.targetDevices;
        }

        public static final class Builder {
            private java.util.List < TargetDevices> targetDevices; 

            /**
             * targetDevices.
             */
            public Builder targetDevices(java.util.List < TargetDevices> targetDevices) {
                this.targetDevices = targetDevices;
                return this;
            }

            public TargetConfigTargetDevices build() {
                return new TargetConfigTargetDevices(this);
            } 

        } 

    }
    public static class TargetConfig extends TeaModel {
        @NameInMap("TargetDevices")
        private TargetConfigTargetDevices targetDevices;

        @NameInMap("TargetGroup")
        private String targetGroup;

        @NameInMap("TargetProduct")
        private String targetProduct;

        @NameInMap("TargetType")
        private String targetType;

        private TargetConfig(Builder builder) {
            this.targetDevices = builder.targetDevices;
            this.targetGroup = builder.targetGroup;
            this.targetProduct = builder.targetProduct;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfig create() {
            return builder().build();
        }

        /**
         * @return targetDevices
         */
        public TargetConfigTargetDevices getTargetDevices() {
            return this.targetDevices;
        }

        /**
         * @return targetGroup
         */
        public String getTargetGroup() {
            return this.targetGroup;
        }

        /**
         * @return targetProduct
         */
        public String getTargetProduct() {
            return this.targetProduct;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private TargetConfigTargetDevices targetDevices; 
            private String targetGroup; 
            private String targetProduct; 
            private String targetType; 

            /**
             * TargetDevices.
             */
            public Builder targetDevices(TargetConfigTargetDevices targetDevices) {
                this.targetDevices = targetDevices;
                return this;
            }

            /**
             * TargetGroup.
             */
            public Builder targetGroup(String targetGroup) {
                this.targetGroup = targetGroup;
                return this;
            }

            /**
             * TargetProduct.
             */
            public Builder targetProduct(String targetProduct) {
                this.targetProduct = targetProduct;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetConfig build() {
                return new TargetConfig(this);
            } 

        } 

    }
    public static class TimeoutConfig extends TeaModel {
        @NameInMap("InProgressTimeoutInMinutes")
        private Integer inProgressTimeoutInMinutes;

        private TimeoutConfig(Builder builder) {
            this.inProgressTimeoutInMinutes = builder.inProgressTimeoutInMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeoutConfig create() {
            return builder().build();
        }

        /**
         * @return inProgressTimeoutInMinutes
         */
        public Integer getInProgressTimeoutInMinutes() {
            return this.inProgressTimeoutInMinutes;
        }

        public static final class Builder {
            private Integer inProgressTimeoutInMinutes; 

            /**
             * InProgressTimeoutInMinutes.
             */
            public Builder inProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
                this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
                return this;
            }

            public TimeoutConfig build() {
                return new TimeoutConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("JobDocument")
        private String jobDocument;

        @NameInMap("JobFile")
        private JobFile jobFile;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("RolloutConfig")
        private RolloutConfig rolloutConfig;

        @NameInMap("ScheduledTime")
        private Long scheduledTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetConfig")
        private TargetConfig targetConfig;

        @NameInMap("TimeoutConfig")
        private TimeoutConfig timeoutConfig;

        @NameInMap("Type")
        private String type;

        @NameInMap("UtcCreate")
        private String utcCreate;

        @NameInMap("UtcModified")
        private String utcModified;

        private Data(Builder builder) {
            this.description = builder.description;
            this.jobDocument = builder.jobDocument;
            this.jobFile = builder.jobFile;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.rolloutConfig = builder.rolloutConfig;
            this.scheduledTime = builder.scheduledTime;
            this.status = builder.status;
            this.targetConfig = builder.targetConfig;
            this.timeoutConfig = builder.timeoutConfig;
            this.type = builder.type;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
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
         * @return jobDocument
         */
        public String getJobDocument() {
            return this.jobDocument;
        }

        /**
         * @return jobFile
         */
        public JobFile getJobFile() {
            return this.jobFile;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return rolloutConfig
         */
        public RolloutConfig getRolloutConfig() {
            return this.rolloutConfig;
        }

        /**
         * @return scheduledTime
         */
        public Long getScheduledTime() {
            return this.scheduledTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetConfig
         */
        public TargetConfig getTargetConfig() {
            return this.targetConfig;
        }

        /**
         * @return timeoutConfig
         */
        public TimeoutConfig getTimeoutConfig() {
            return this.timeoutConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String description; 
            private String jobDocument; 
            private JobFile jobFile; 
            private String jobId; 
            private String jobName; 
            private RolloutConfig rolloutConfig; 
            private Long scheduledTime; 
            private String status; 
            private TargetConfig targetConfig; 
            private TimeoutConfig timeoutConfig; 
            private String type; 
            private String utcCreate; 
            private String utcModified; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * JobDocument.
             */
            public Builder jobDocument(String jobDocument) {
                this.jobDocument = jobDocument;
                return this;
            }

            /**
             * JobFile.
             */
            public Builder jobFile(JobFile jobFile) {
                this.jobFile = jobFile;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * RolloutConfig.
             */
            public Builder rolloutConfig(RolloutConfig rolloutConfig) {
                this.rolloutConfig = rolloutConfig;
                return this;
            }

            /**
             * ScheduledTime.
             */
            public Builder scheduledTime(Long scheduledTime) {
                this.scheduledTime = scheduledTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetConfig.
             */
            public Builder targetConfig(TargetConfig targetConfig) {
                this.targetConfig = targetConfig;
                return this;
            }

            /**
             * TimeoutConfig.
             */
            public Builder timeoutConfig(TimeoutConfig timeoutConfig) {
                this.timeoutConfig = timeoutConfig;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UtcCreate.
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
