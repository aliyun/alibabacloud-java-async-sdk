// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CompanyFourElementsVerificationResponseBody build() {
            return new CompanyFourElementsVerificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CompanyFourElementsVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>CompanyFourElementsVerificationResponseBody</p>
     */
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
             * <p>The business status of the enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder enterpriseStatus(String enterpriseStatus) {
                this.enterpriseStatus = enterpriseStatus;
                return this;
            }

            /**
             * <p>The business term of the enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-25/2053-05-24</p>
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
    /**
     * 
     * {@link CompanyFourElementsVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>CompanyFourElementsVerificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailInfo")
        private DetailInfo detailInfo;

        @com.aliyun.core.annotation.NameInMap("InconsistentData")
        private java.util.List<String> inconsistentData;

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
        public java.util.List<String> getInconsistentData() {
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
            private java.util.List<String> inconsistentData; 
            private Long reasonCode; 
            private String verifyResult; 

            /**
             * <p>The information about the enterprise.</p>
             */
            public Builder detailInfo(DetailInfo detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            /**
             * <p>The fields to be verified.</p>
             */
            public Builder inconsistentData(java.util.List<String> inconsistentData) {
                this.inconsistentData = inconsistentData;
                return this;
            }

            /**
             * <p>The code of the verification result. Valid values:</p>
             * <ul>
             * <li>0: The four elements belong to the same enterprise.</li>
             * <li>1: The four elements belong to the same enterprise, but the business status of the enterprise is abnormal.</li>
             * <li>2: The legal representative information cannot match the enterprise information.</li>
             * <li>3: The four elements do not belong to the same enterprise.</li>
             * <li>4: No information about the enterprise is found.</li>
             * <li>5: No information about the legal representative is found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reasonCode(Long reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The verification result. Valid values:</p>
             * <ul>
             * <li>true: The four elements belong to the same enterprise and the business status of the enterprise is Active.</li>
             * <li>false: The four elements do not belong to the same enterprise.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
