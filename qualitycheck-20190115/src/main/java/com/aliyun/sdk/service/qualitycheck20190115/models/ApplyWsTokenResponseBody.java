// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ApplyWsTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyWsTokenResponseBody</p>
 */
public class ApplyWsTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ApplyWsTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyWsTokenResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ApplyWsTokenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6987D326-83D9-4A42-B9A5-0B27F9B40539</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApplyWsTokenResponseBody build() {
            return new ApplyWsTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyWsTokenResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyWsTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("WsEndpoint")
        private String wsEndpoint;

        private Data(Builder builder) {
            this.sessionId = builder.sessionId;
            this.token = builder.token;
            this.wsEndpoint = builder.wsEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return wsEndpoint
         */
        public String getWsEndpoint() {
            return this.wsEndpoint;
        }

        public static final class Builder {
            private String sessionId; 
            private String token; 
            private String wsEndpoint; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sessionId = model.sessionId;
                this.token = model.token;
                this.wsEndpoint = model.wsEndpoint;
            } 

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * WsEndpoint.
             */
            public Builder wsEndpoint(String wsEndpoint) {
                this.wsEndpoint = wsEndpoint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
