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
 * {@link Id2MetaStandardVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>Id2MetaStandardVerifyResponseBody</p>
 */
public class Id2MetaStandardVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private Id2MetaStandardVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Id2MetaStandardVerifyResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public Id2MetaStandardVerifyResponseBody build() {
            return new Id2MetaStandardVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link Id2MetaStandardVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>Id2MetaStandardVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
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

        public static final class Builder {
            private String bizCode; 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
