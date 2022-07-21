// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceTunnelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceTunnelResponseBody</p>
 */
public class CreateDeviceTunnelResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateDeviceTunnelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceTunnelResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDeviceTunnelResponseBody build() {
            return new CreateDeviceTunnelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("SourceAccessToken")
        private String sourceAccessToken;

        @NameInMap("SourceURI")
        private String sourceURI;

        @NameInMap("TunnelId")
        private String tunnelId;

        private Data(Builder builder) {
            this.sourceAccessToken = builder.sourceAccessToken;
            this.sourceURI = builder.sourceURI;
            this.tunnelId = builder.tunnelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sourceAccessToken
         */
        public String getSourceAccessToken() {
            return this.sourceAccessToken;
        }

        /**
         * @return sourceURI
         */
        public String getSourceURI() {
            return this.sourceURI;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        public static final class Builder {
            private String sourceAccessToken; 
            private String sourceURI; 
            private String tunnelId; 

            /**
             * SourceAccessToken.
             */
            public Builder sourceAccessToken(String sourceAccessToken) {
                this.sourceAccessToken = sourceAccessToken;
                return this;
            }

            /**
             * SourceURI.
             */
            public Builder sourceURI(String sourceURI) {
                this.sourceURI = sourceURI;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
