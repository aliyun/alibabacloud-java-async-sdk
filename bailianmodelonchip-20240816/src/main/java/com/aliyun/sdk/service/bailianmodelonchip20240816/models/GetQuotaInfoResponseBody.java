// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link GetQuotaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaInfoResponseBody</p>
 */
public class GetQuotaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private GetQuotaInfoResponseBody(Builder builder) {
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

    public static GetQuotaInfoResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
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
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetQuotaInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7B0FC4BC-9E4B-5AD7-9D35-6559BDC0788E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetQuotaInfoResponseBody build() {
            return new GetQuotaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeLicenseCount")
        private Long activeLicenseCount;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("durationType")
        private Integer durationType;

        @com.aliyun.core.annotation.NameInMap("licenseCount")
        private Long licenseCount;

        @com.aliyun.core.annotation.NameInMap("maxQps")
        private Integer maxQps;

        @com.aliyun.core.annotation.NameInMap("productKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("purchaseModel")
        private Integer purchaseModel;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("tokenNumber")
        private Long tokenNumber;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.activeLicenseCount = builder.activeLicenseCount;
            this.duration = builder.duration;
            this.durationType = builder.durationType;
            this.licenseCount = builder.licenseCount;
            this.maxQps = builder.maxQps;
            this.productKey = builder.productKey;
            this.purchaseModel = builder.purchaseModel;
            this.tenantId = builder.tenantId;
            this.tokenNumber = builder.tokenNumber;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeLicenseCount
         */
        public Long getActiveLicenseCount() {
            return this.activeLicenseCount;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return durationType
         */
        public Integer getDurationType() {
            return this.durationType;
        }

        /**
         * @return licenseCount
         */
        public Long getLicenseCount() {
            return this.licenseCount;
        }

        /**
         * @return maxQps
         */
        public Integer getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return purchaseModel
         */
        public Integer getPurchaseModel() {
            return this.purchaseModel;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tokenNumber
         */
        public Long getTokenNumber() {
            return this.tokenNumber;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long activeLicenseCount; 
            private Integer duration; 
            private Integer durationType; 
            private Long licenseCount; 
            private Integer maxQps; 
            private String productKey; 
            private Integer purchaseModel; 
            private String tenantId; 
            private Long tokenNumber; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeLicenseCount = model.activeLicenseCount;
                this.duration = model.duration;
                this.durationType = model.durationType;
                this.licenseCount = model.licenseCount;
                this.maxQps = model.maxQps;
                this.productKey = model.productKey;
                this.purchaseModel = model.purchaseModel;
                this.tenantId = model.tenantId;
                this.tokenNumber = model.tokenNumber;
                this.userId = model.userId;
            } 

            /**
             * activeLicenseCount.
             */
            public Builder activeLicenseCount(Long activeLicenseCount) {
                this.activeLicenseCount = activeLicenseCount;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * durationType.
             */
            public Builder durationType(Integer durationType) {
                this.durationType = durationType;
                return this;
            }

            /**
             * licenseCount.
             */
            public Builder licenseCount(Long licenseCount) {
                this.licenseCount = licenseCount;
                return this;
            }

            /**
             * maxQps.
             */
            public Builder maxQps(Integer maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * productKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * purchaseModel.
             */
            public Builder purchaseModel(Integer purchaseModel) {
                this.purchaseModel = purchaseModel;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * tokenNumber.
             */
            public Builder tokenNumber(Long tokenNumber) {
                this.tokenNumber = tokenNumber;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
