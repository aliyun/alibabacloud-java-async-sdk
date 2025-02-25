// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLiveStreamingResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLiveStreamingResponseBody</p>
 */
public class QueryLiveStreamingResponseBody extends TeaModel {
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

    private QueryLiveStreamingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLiveStreamingResponseBody create() {
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

        public QueryLiveStreamingResponseBody build() {
            return new QueryLiveStreamingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("RelayDecryptKey")
        private String relayDecryptKey;

        @NameInMap("StunInfo")
        private String stunInfo;

        private Data(Builder builder) {
            this.path = builder.path;
            this.relayDecryptKey = builder.relayDecryptKey;
            this.stunInfo = builder.stunInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return relayDecryptKey
         */
        public String getRelayDecryptKey() {
            return this.relayDecryptKey;
        }

        /**
         * @return stunInfo
         */
        public String getStunInfo() {
            return this.stunInfo;
        }

        public static final class Builder {
            private String path; 
            private String relayDecryptKey; 
            private String stunInfo; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * RelayDecryptKey.
             */
            public Builder relayDecryptKey(String relayDecryptKey) {
                this.relayDecryptKey = relayDecryptKey;
                return this;
            }

            /**
             * StunInfo.
             */
            public Builder stunInfo(String stunInfo) {
                this.stunInfo = stunInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
