// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVersionsResponseBody</p>
 */
public class ListVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
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
        public Builder data(java.util.List < Data> data) {
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

    public static class Data extends TeaModel {
        @NameInMap("ConcurrentCount")
        private Integer concurrentCount;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("Quota")
        private Integer quota;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("UseQuota")
        private Integer useQuota;

        @NameInMap("VersionDetail")
        private String versionDetail;

        @NameInMap("VersionName")
        private String versionName;

        @NameInMap("VersionStatus")
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
