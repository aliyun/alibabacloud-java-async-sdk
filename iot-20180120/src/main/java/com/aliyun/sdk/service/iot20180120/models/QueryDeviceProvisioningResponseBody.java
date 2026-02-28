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
 * {@link QueryDeviceProvisioningResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceProvisioningResponseBody</p>
 */
public class QueryDeviceProvisioningResponseBody extends TeaModel {
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

    private QueryDeviceProvisioningResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceProvisioningResponseBody create() {
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

        private Builder(QueryDeviceProvisioningResponseBody model) {
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

        public QueryDeviceProvisioningResponseBody build() {
            return new QueryDeviceProvisioningResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceProvisioningResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceProvisioningResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SourceIotInstanceId")
        private String sourceIotInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("TargetIotInstanceId")
        private String targetIotInstanceId;

        @com.aliyun.core.annotation.NameInMap("TargetRegion")
        private String targetRegion;

        private Data(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.deviceName = builder.deviceName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.productKey = builder.productKey;
            this.sourceIotInstanceId = builder.sourceIotInstanceId;
            this.sourceRegion = builder.sourceRegion;
            this.targetIotInstanceId = builder.targetIotInstanceId;
            this.targetRegion = builder.targetRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return sourceIotInstanceId
         */
        public String getSourceIotInstanceId() {
            return this.sourceIotInstanceId;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return targetIotInstanceId
         */
        public String getTargetIotInstanceId() {
            return this.targetIotInstanceId;
        }

        /**
         * @return targetRegion
         */
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String deviceName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String productKey; 
            private String sourceIotInstanceId; 
            private String sourceRegion; 
            private String targetIotInstanceId; 
            private String targetRegion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunUid = model.aliyunUid;
                this.deviceName = model.deviceName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.productKey = model.productKey;
                this.sourceIotInstanceId = model.sourceIotInstanceId;
                this.sourceRegion = model.sourceRegion;
                this.targetIotInstanceId = model.targetIotInstanceId;
                this.targetRegion = model.targetRegion;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * SourceIotInstanceId.
             */
            public Builder sourceIotInstanceId(String sourceIotInstanceId) {
                this.sourceIotInstanceId = sourceIotInstanceId;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * TargetIotInstanceId.
             */
            public Builder targetIotInstanceId(String targetIotInstanceId) {
                this.targetIotInstanceId = targetIotInstanceId;
                return this;
            }

            /**
             * TargetRegion.
             */
            public Builder targetRegion(String targetRegion) {
                this.targetRegion = targetRegion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
