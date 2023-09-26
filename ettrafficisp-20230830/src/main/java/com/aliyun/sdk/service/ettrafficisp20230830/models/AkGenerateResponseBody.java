// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AkGenerateResponseBody} extends {@link TeaModel}
 *
 * <p>AkGenerateResponseBody</p>
 */
public class AkGenerateResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    private AkGenerateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AkGenerateResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public AkGenerateResponseBody build() {
            return new AkGenerateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("accessKeyId")
        private String accessKeyId;

        @NameInMap("accessKeyName")
        private String accessKeyName;

        @NameInMap("accessKeySecret")
        private String accessKeySecret;

        @NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeyName = builder.accessKeyName;
            this.accessKeySecret = builder.accessKeySecret;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeyName
         */
        public String getAccessKeyName() {
            return this.accessKeyName;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeyName; 
            private String accessKeySecret; 
            private String userId; 

            /**
             * Access Key ID
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * accessKeyName.
             */
            public Builder accessKeyName(String accessKeyName) {
                this.accessKeyName = accessKeyName;
                return this;
            }

            /**
             * accessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
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
