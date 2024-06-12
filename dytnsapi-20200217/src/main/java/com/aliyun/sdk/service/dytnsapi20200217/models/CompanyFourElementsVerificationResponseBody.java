// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompanyFourElementsVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>CompanyFourElementsVerificationResponseBody</p>
 */
public class CompanyFourElementsVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CompanyFourElementsVerificationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompanyFourElementsVerificationResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The details about the access denial.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The unique request ID. It is a common parameter and can be used to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CompanyFourElementsVerificationResponseBody build() {
            return new CompanyFourElementsVerificationResponseBody(this);
        } 

    } 

    public static class DetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnterpriseStatus")
        private String enterpriseStatus;

        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private String openTime;

        private DetailInfo(Builder builder) {
            this.enterpriseStatus = builder.enterpriseStatus;
            this.openTime = builder.openTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfo create() {
            return builder().build();
        }

        /**
         * @return enterpriseStatus
         */
        public String getEnterpriseStatus() {
            return this.enterpriseStatus;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        public static final class Builder {
            private String enterpriseStatus; 
            private String openTime; 

            /**
             * The business status of the enterprise.
             */
            public Builder enterpriseStatus(String enterpriseStatus) {
                this.enterpriseStatus = enterpriseStatus;
                return this;
            }

            /**
             * The business term of the enterprise.
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            public DetailInfo build() {
                return new DetailInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailInfo")
        private DetailInfo detailInfo;

        @com.aliyun.core.annotation.NameInMap("InconsistentData")
        private java.util.List < String > inconsistentData;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private Long reasonCode;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        private Data(Builder builder) {
            this.detailInfo = builder.detailInfo;
            this.inconsistentData = builder.inconsistentData;
            this.reasonCode = builder.reasonCode;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detailInfo
         */
        public DetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        /**
         * @return inconsistentData
         */
        public java.util.List < String > getInconsistentData() {
            return this.inconsistentData;
        }

        /**
         * @return reasonCode
         */
        public Long getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private DetailInfo detailInfo; 
            private java.util.List < String > inconsistentData; 
            private Long reasonCode; 
            private String verifyResult; 

            /**
             * The information about the enterprise.
             */
            public Builder detailInfo(DetailInfo detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            /**
             * The fields to be verified.
             */
            public Builder inconsistentData(java.util.List < String > inconsistentData) {
                this.inconsistentData = inconsistentData;
                return this;
            }

            /**
             * The code of the verification result. Valid values:
             * <p>
             * 
             * *   0: The four elements belong to the same enterprise.
             * *   1: The four elements belong to the same enterprise, but the business status of the enterprise is abnormal.
             * *   2: The legal representative information cannot match the enterprise information.
             * *   3: The four elements do not belong to the same enterprise.
             * *   4: No information about the enterprise is found.
             * *   5: No information about the legal representative is found.
             */
            public Builder reasonCode(Long reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * The verification result. Valid values:
             * <p>
             * 
             * *   true: The four elements belong to the same enterprise and the business status of the enterprise is Active.
             * *   false: The four elements do not belong to the same enterprise.
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
