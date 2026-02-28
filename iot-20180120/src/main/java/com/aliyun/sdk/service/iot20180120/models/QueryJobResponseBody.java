// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobResponseBody</p>
 */
public class QueryJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class JobFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Sign")
        private String sign;

        @com.aliyun.core.annotation.NameInMap("SignMethod")
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

            private Builder() {
            } 

            private Builder(JobFile model) {
                this.fileUrl = model.fileUrl;
                this.sign = model.sign;
                this.signMethod = model.signMethod;
            } 

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
    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class RolloutConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaximumPerMinute")
        private Integer maximumPerMinute;

        @com.aliyun.core.annotation.NameInMap("MessageQoS")
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

            private Builder() {
            } 

            private Builder(RolloutConfig model) {
                this.maximumPerMinute = model.maximumPerMinute;
                this.messageQoS = model.messageQoS;
            } 

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
    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class TargetDevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
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

            private Builder() {
            } 

            private Builder(TargetDevices model) {
                this.deviceName = model.deviceName;
                this.productKey = model.productKey;
            } 

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
    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class TargetConfigTargetDevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetDevices")
        private java.util.List<TargetDevices> targetDevices;

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
        public java.util.List<TargetDevices> getTargetDevices() {
            return this.targetDevices;
        }

        public static final class Builder {
            private java.util.List<TargetDevices> targetDevices; 

            private Builder() {
            } 

            private Builder(TargetConfigTargetDevices model) {
                this.targetDevices = model.targetDevices;
            } 

            /**
             * targetDevices.
             */
            public Builder targetDevices(java.util.List<TargetDevices> targetDevices) {
                this.targetDevices = targetDevices;
                return this;
            }

            public TargetConfigTargetDevices build() {
                return new TargetConfigTargetDevices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class TargetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetDevices")
        private TargetConfigTargetDevices targetDevices;

        @com.aliyun.core.annotation.NameInMap("TargetGroup")
        private String targetGroup;

        @com.aliyun.core.annotation.NameInMap("TargetProduct")
        private String targetProduct;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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

            private Builder() {
            } 

            private Builder(TargetConfig model) {
                this.targetDevices = model.targetDevices;
                this.targetGroup = model.targetGroup;
                this.targetProduct = model.targetProduct;
                this.targetType = model.targetType;
            } 

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
    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class TimeoutConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InProgressTimeoutInMinutes")
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

            private Builder() {
            } 

            private Builder(TimeoutConfig model) {
                this.inProgressTimeoutInMinutes = model.inProgressTimeoutInMinutes;
            } 

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
    /**
     * 
     * {@link QueryJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("JobDocument")
        private String jobDocument;

        @com.aliyun.core.annotation.NameInMap("JobFile")
        private JobFile jobFile;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("RolloutConfig")
        private RolloutConfig rolloutConfig;

        @com.aliyun.core.annotation.NameInMap("ScheduledTime")
        private Long scheduledTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetConfig")
        private TargetConfig targetConfig;

        @com.aliyun.core.annotation.NameInMap("TimeoutConfig")
        private TimeoutConfig timeoutConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.jobDocument = model.jobDocument;
                this.jobFile = model.jobFile;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.rolloutConfig = model.rolloutConfig;
                this.scheduledTime = model.scheduledTime;
                this.status = model.status;
                this.targetConfig = model.targetConfig;
                this.timeoutConfig = model.timeoutConfig;
                this.type = model.type;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
            } 

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
