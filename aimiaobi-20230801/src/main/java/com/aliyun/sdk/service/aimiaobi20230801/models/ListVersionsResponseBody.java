// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVersionsResponseBody</p>
 */
public class ListVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListVersionsResponseBody(Builder builder) {
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

    public static ListVersionsResponseBody create() {
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
    public java.util.List<Data> getData() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListVersionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
        public Builder data(java.util.List<Data> data) {
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

        public ListVersionsResponseBody build() {
            return new ListVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVersionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentCount")
        private Integer concurrentCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Integer quota;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UseQuota")
        private Integer useQuota;

        @com.aliyun.core.annotation.NameInMap("VersionDetail")
        private String versionDetail;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VersionStatus")
        private Integer versionStatus;

        private Data(Builder builder) {
            this.concurrentCount = builder.concurrentCount;
            this.endTime = builder.endTime;
            this.instanceCount = builder.instanceCount;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.productType = builder.productType;
            this.quota = builder.quota;
            this.startTime = builder.startTime;
            this.useQuota = builder.useQuota;
            this.versionDetail = builder.versionDetail;
            this.versionName = builder.versionName;
            this.versionStatus = builder.versionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return concurrentCount
         */
        public Integer getConcurrentCount() {
            return this.concurrentCount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return useQuota
         */
        public Integer getUseQuota() {
            return this.useQuota;
        }

        /**
         * @return versionDetail
         */
        public String getVersionDetail() {
            return this.versionDetail;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return versionStatus
         */
        public Integer getVersionStatus() {
            return this.versionStatus;
        }

        public static final class Builder {
            private Integer concurrentCount; 
            private String endTime; 
            private Integer instanceCount; 
            private String instanceId; 
            private Long orderId; 
            private String productType; 
            private Integer quota; 
            private String startTime; 
            private Integer useQuota; 
            private String versionDetail; 
            private String versionName; 
            private Integer versionStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.concurrentCount = model.concurrentCount;
                this.endTime = model.endTime;
                this.instanceCount = model.instanceCount;
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
                this.productType = model.productType;
                this.quota = model.quota;
                this.startTime = model.startTime;
                this.useQuota = model.useQuota;
                this.versionDetail = model.versionDetail;
                this.versionName = model.versionName;
                this.versionStatus = model.versionStatus;
            } 

            /**
             * ConcurrentCount.
             */
            public Builder concurrentCount(Integer concurrentCount) {
                this.concurrentCount = concurrentCount;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
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
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UseQuota.
             */
            public Builder useQuota(Integer useQuota) {
                this.useQuota = useQuota;
                return this;
            }

            /**
             * VersionDetail.
             */
            public Builder versionDetail(String versionDetail) {
                this.versionDetail = versionDetail;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * VersionStatus.
             */
            public Builder versionStatus(Integer versionStatus) {
                this.versionStatus = versionStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
