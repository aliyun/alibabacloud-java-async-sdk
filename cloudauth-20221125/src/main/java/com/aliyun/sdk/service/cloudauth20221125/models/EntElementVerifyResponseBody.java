// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

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
 * {@link EntElementVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>EntElementVerifyResponseBody</p>
 */
public class EntElementVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private EntElementVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntElementVerifyResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(EntElementVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7***B-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EntElementVerifyResponseBody build() {
            return new EntElementVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EntElementVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>EntElementVerifyResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private String openTime;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonDetail")
        private String reasonDetail;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.bizCode = builder.bizCode;
            this.openTime = builder.openTime;
            this.reasonCode = builder.reasonCode;
            this.reasonDetail = builder.reasonDetail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonDetail
         */
        public String getReasonDetail() {
            return this.reasonDetail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizCode; 
            private String openTime; 
            private String reasonCode; 
            private String reasonDetail; 
            private String status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.bizCode = model.bizCode;
                this.openTime = model.openTime;
                this.reasonCode = model.reasonCode;
                this.reasonDetail = model.reasonDetail;
                this.status = model.status;
            } 

            /**
             * <p>Verification result code.</p>
             * <ul>
             * <li>1: Verification consistent</li>
             * <li>2: Verification inconsistent</li>
             * <li>3: Not found</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>Operating period: start and end time of operations.</p>
             * <ul>
             * <li>Format: yyyy-MM-dd/yyyy-MM-dd.</li>
             * <li>Example: 2018-09-25/9999-09-09.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2018-09-25/9999-09-09</p>
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * <p>ReasonCode explanation:</p>
             * <ul>
             * <li><p>100: Verification consistent</p>
             * </li>
             * <li><p>201: Inconsistent between person and enterprise</p>
             * </li>
             * <li><p>202: Inconsistent in two elements of the enterprise</p>
             * </li>
             * <li><p>301: No enterprise found, unable to verify</p>
             * </li>
             * <li><p>302: Legal representative does not exist in the database</p>
             * <blockquote>
             * <p>Warning: This field will be discontinued on June 15, 2023. Existing customers are not affected.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>Details of inconsistencies, multiple inconsistencies will be separated by commas.</p>
             * <ul>
             * <li>LegalPersonNameFlag: Inconsistent legal representative name</li>
             * <li>LegalPersonCertNoFlag: Inconsistent legal representative ID number</li>
             * <li>EntNameFlag: Inconsistent enterprise name</li>
             * <li>LicenseNoFlag: Inconsistent business license number</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LegalPersonNameFlag,LegalPersonCertNoFlag</p>
             */
            public Builder reasonDetail(String reasonDetail) {
                this.reasonDetail = reasonDetail;
                return this;
            }

            /**
             * <p>Enterprise operating status.</p>
             * <ul>
             * <li>1: In operation (open)</li>
             * <li>2: Relocated</li>
             * <li>3: Deregistered</li>
             * <li>4: Revoked</li>
             * <li>5: Canceled</li>
             * <li>6: Suspended</li>
             * <li>0: Other</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
