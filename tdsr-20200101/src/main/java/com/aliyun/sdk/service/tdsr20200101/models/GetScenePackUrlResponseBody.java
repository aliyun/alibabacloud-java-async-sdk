// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePackUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetScenePackUrlResponseBody</p>
 */
public class GetScenePackUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetScenePackUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePackUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
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
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScenePackUrlResponseBody build() {
            return new GetScenePackUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Expire")
        private String expire;

        @NameInMap("Url")
        private String url;

        @NameInMap("Valid")
        private Boolean valid;

        private Data(Builder builder) {
            this.expire = builder.expire;
            this.url = builder.url;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expire
         */
        public String getExpire() {
            return this.expire;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private String expire; 
            private String url; 
            private Boolean valid; 

            /**
             * 失效日期
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * 打包文件地址
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * 是否有效
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
