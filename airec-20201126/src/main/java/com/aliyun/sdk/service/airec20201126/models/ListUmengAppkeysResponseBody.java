// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUmengAppkeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListUmengAppkeysResponseBody</p>
 */
public class ListUmengAppkeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListUmengAppkeysResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUmengAppkeysResponseBody create() {
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListUmengAppkeysResponseBody build() {
            return new ListUmengAppkeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUmengAppkeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListUmengAppkeysResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appkey")
        private String appkey;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("platform")
        private String platform;

        private Result(Builder builder) {
            this.appkey = builder.appkey;
            this.name = builder.name;
            this.platform = builder.platform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appkey
         */
        public String getAppkey() {
            return this.appkey;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        public static final class Builder {
            private String appkey; 
            private String name; 
            private String platform; 

            /**
             * appkey.
             */
            public Builder appkey(String appkey) {
                this.appkey = appkey;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
