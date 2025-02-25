// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_verify_agent20240131.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResponseBody</p>
 */
public class CreateResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private CreateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 
        private Boolean success; 

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
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateResponseBody build() {
            return new CreateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("schemeCode")
        private String schemeCode;

        private Data(Builder builder) {
            this.schemeCode = builder.schemeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return schemeCode
         */
        public String getSchemeCode() {
            return this.schemeCode;
        }

        public static final class Builder {
            private String schemeCode; 

            /**
             * schemeCode.
             */
            public Builder schemeCode(String schemeCode) {
                this.schemeCode = schemeCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
