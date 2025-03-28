// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link ActivateLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>ActivateLicenseResponseBody</p>
 */
public class ActivateLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ActivateLicenseResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateLicenseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ActivateLicenseResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>65308A66-8764-53EE-8D4A-201E86CA88C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ActivateLicenseResponseBody build() {
            return new ActivateLicenseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ActivateLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>ActivateLicenseResponseBody</p>
     */
    public static class ActivateRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivateTime")
        private String activateTime;

        @com.aliyun.core.annotation.NameInMap("BuyTime")
        private String buyTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ActivateRecord(Builder builder) {
            this.activateTime = builder.activateTime;
            this.buyTime = builder.buyTime;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.licenseCode = builder.licenseCode;
            this.orderId = builder.orderId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivateRecord create() {
            return builder().build();
        }

        /**
         * @return activateTime
         */
        public String getActivateTime() {
            return this.activateTime;
        }

        /**
         * @return buyTime
         */
        public String getBuyTime() {
            return this.buyTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String activateTime; 
            private String buyTime; 
            private String duration; 
            private String expireTime; 
            private String licenseCode; 
            private String orderId; 
            private String status; 

            private Builder() {
            } 

            private Builder(ActivateRecord model) {
                this.activateTime = model.activateTime;
                this.buyTime = model.buyTime;
                this.duration = model.duration;
                this.expireTime = model.expireTime;
                this.licenseCode = model.licenseCode;
                this.orderId = model.orderId;
                this.status = model.status;
            } 

            /**
             * ActivateTime.
             */
            public Builder activateTime(String activateTime) {
                this.activateTime = activateTime;
                return this;
            }

            /**
             * BuyTime.
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * LicenseCode.
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ActivateRecord build() {
                return new ActivateRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ActivateLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>ActivateLicenseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivateRecord")
        private java.util.List<ActivateRecord> activateRecord;

        @com.aliyun.core.annotation.NameInMap("ActivateTime")
        private String activateTime;

        @com.aliyun.core.annotation.NameInMap("AllDuration")
        private String allDuration;

        @com.aliyun.core.annotation.NameInMap("ApplicableSpecs")
        private String applicableSpecs;

        @com.aliyun.core.annotation.NameInMap("BuyTime")
        private String buyTime;

        @com.aliyun.core.annotation.NameInMap("CpuLimit")
        private Integer cpuLimit;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EffectTime")
        private String effectTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("LicenseSpecName")
        private String licenseSpecName;

        @com.aliyun.core.annotation.NameInMap("MemoryLimit")
        private Integer memoryLimit;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnActivateAllDuration")
        private String unActivateAllDuration;

        private Data(Builder builder) {
            this.activateRecord = builder.activateRecord;
            this.activateTime = builder.activateTime;
            this.allDuration = builder.allDuration;
            this.applicableSpecs = builder.applicableSpecs;
            this.buyTime = builder.buyTime;
            this.cpuLimit = builder.cpuLimit;
            this.description = builder.description;
            this.duration = builder.duration;
            this.effectTime = builder.effectTime;
            this.expireTime = builder.expireTime;
            this.fingerprint = builder.fingerprint;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.licenseCode = builder.licenseCode;
            this.licenseSpecName = builder.licenseSpecName;
            this.memoryLimit = builder.memoryLimit;
            this.status = builder.status;
            this.unActivateAllDuration = builder.unActivateAllDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activateRecord
         */
        public java.util.List<ActivateRecord> getActivateRecord() {
            return this.activateRecord;
        }

        /**
         * @return activateTime
         */
        public String getActivateTime() {
            return this.activateTime;
        }

        /**
         * @return allDuration
         */
        public String getAllDuration() {
            return this.allDuration;
        }

        /**
         * @return applicableSpecs
         */
        public String getApplicableSpecs() {
            return this.applicableSpecs;
        }

        /**
         * @return buyTime
         */
        public String getBuyTime() {
            return this.buyTime;
        }

        /**
         * @return cpuLimit
         */
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return effectTime
         */
        public String getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
        }

        /**
         * @return licenseSpecName
         */
        public String getLicenseSpecName() {
            return this.licenseSpecName;
        }

        /**
         * @return memoryLimit
         */
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unActivateAllDuration
         */
        public String getUnActivateAllDuration() {
            return this.unActivateAllDuration;
        }

        public static final class Builder {
            private java.util.List<ActivateRecord> activateRecord; 
            private String activateTime; 
            private String allDuration; 
            private String applicableSpecs; 
            private String buyTime; 
            private Integer cpuLimit; 
            private String description; 
            private String duration; 
            private String effectTime; 
            private String expireTime; 
            private String fingerprint; 
            private String id; 
            private String instanceId; 
            private String licenseCode; 
            private String licenseSpecName; 
            private Integer memoryLimit; 
            private String status; 
            private String unActivateAllDuration; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activateRecord = model.activateRecord;
                this.activateTime = model.activateTime;
                this.allDuration = model.allDuration;
                this.applicableSpecs = model.applicableSpecs;
                this.buyTime = model.buyTime;
                this.cpuLimit = model.cpuLimit;
                this.description = model.description;
                this.duration = model.duration;
                this.effectTime = model.effectTime;
                this.expireTime = model.expireTime;
                this.fingerprint = model.fingerprint;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.licenseCode = model.licenseCode;
                this.licenseSpecName = model.licenseSpecName;
                this.memoryLimit = model.memoryLimit;
                this.status = model.status;
                this.unActivateAllDuration = model.unActivateAllDuration;
            } 

            /**
             * ActivateRecord.
             */
            public Builder activateRecord(java.util.List<ActivateRecord> activateRecord) {
                this.activateRecord = activateRecord;
                return this;
            }

            /**
             * ActivateTime.
             */
            public Builder activateTime(String activateTime) {
                this.activateTime = activateTime;
                return this;
            }

            /**
             * AllDuration.
             */
            public Builder allDuration(String allDuration) {
                this.allDuration = allDuration;
                return this;
            }

            /**
             * ApplicableSpecs.
             */
            public Builder applicableSpecs(String applicableSpecs) {
                this.applicableSpecs = applicableSpecs;
                return this;
            }

            /**
             * BuyTime.
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * CpuLimit.
             */
            public Builder cpuLimit(Integer cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EffectTime.
             */
            public Builder effectTime(String effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Fingerprint.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
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
             * LicenseCode.
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * LicenseSpecName.
             */
            public Builder licenseSpecName(String licenseSpecName) {
                this.licenseSpecName = licenseSpecName;
                return this;
            }

            /**
             * MemoryLimit.
             */
            public Builder memoryLimit(Integer memoryLimit) {
                this.memoryLimit = memoryLimit;
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
             * UnActivateAllDuration.
             */
            public Builder unActivateAllDuration(String unActivateAllDuration) {
                this.unActivateAllDuration = unActivateAllDuration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
