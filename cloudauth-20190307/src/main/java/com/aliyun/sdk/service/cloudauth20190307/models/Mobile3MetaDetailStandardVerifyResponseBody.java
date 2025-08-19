// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link Mobile3MetaDetailStandardVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>Mobile3MetaDetailStandardVerifyResponseBody</p>
 */
public class Mobile3MetaDetailStandardVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private Mobile3MetaDetailStandardVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Mobile3MetaDetailStandardVerifyResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(Mobile3MetaDetailStandardVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code, <strong>200</strong> indicates a successful API response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public Mobile3MetaDetailStandardVerifyResponseBody build() {
            return new Mobile3MetaDetailStandardVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link Mobile3MetaDetailStandardVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>Mobile3MetaDetailStandardVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
            this.ispName = builder.ispName;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String bizCode; 
            private String ispName; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizCode = model.bizCode;
                this.ispName = model.ispName;
                this.subCode = model.subCode;
            } 

            /**
             * <p>Verification result code:</p>
             * <ul>
             * <li><strong>1</strong>: Verification matches.</li>
             * <li><strong>2</strong>: Verification does not match.</li>
             * <li><strong>3</strong>: No record found.</li>
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
             * <p>ISP name:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile.</li>
             * <li><strong>CUCC</strong>: China Unicom.</li>
             * <li><strong>CTCC</strong>: China Telecom.</li>
             * <li><strong>CBCC</strong>: China Broadcasting Network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>Detailed verification results:</p>
             * <ul>
             * <li>101: Passed, three elements are consistent.</li>
             * <li>201: The phone number does not match the name and ID number.</li>
             * <li>202: The phone number matches the name but does not match the ID number.</li>
             * <li>203: The phone number does not match the name but matches the ID number.</li>
             * <li>204: Other inconsistencies.</li>
             * <li>301: No record found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
