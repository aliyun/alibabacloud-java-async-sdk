// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompanyTwoElementsVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>CompanyTwoElementsVerificationResponseBody</p>
 */
public class CompanyTwoElementsVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CompanyTwoElementsVerificationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompanyTwoElementsVerificationResponseBody create() {
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

        public CompanyTwoElementsVerificationResponseBody build() {
            return new CompanyTwoElementsVerificationResponseBody(this);
        } 

    } 

    public static class DetailInfo extends TeaModel {
        @NameInMap("EnterpriseStatus")
        private String enterpriseStatus;

        @NameInMap("OpenTime")
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
        @NameInMap("DetailInfo")
        private DetailInfo detailInfo;

        @NameInMap("InconsistentData")
        private java.util.List < String > inconsistentData;

        @NameInMap("ReasonCode")
        private String reasonCode;

        @NameInMap("VerifyResult")
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
        public String getReasonCode() {
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
            private String reasonCode; 
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
             * *   0: The two elements belong to the same enterprise.
             * *   1: The two elements belong to the same enterprise, but the business status of the enterprise is abnormal.
             * *   3: The two elements do not belong to the same enterprise.
             * *   4: No information about the enterprise is found.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * The verification result. Valid values:
             * <p>
             * 
             * *   true: The two elements belong to the same enterprise and the business status of the enterprise is Active.
             * *   false: The two elements do not belong to the same enterprise.
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
