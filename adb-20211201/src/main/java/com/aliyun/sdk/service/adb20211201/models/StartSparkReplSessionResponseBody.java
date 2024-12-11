// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartSparkReplSessionResponseBody} extends {@link TeaModel}
 *
 * <p>StartSparkReplSessionResponseBody</p>
 */
public class StartSparkReplSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartSparkReplSessionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSparkReplSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartSparkReplSessionResponseBody build() {
            return new StartSparkReplSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartSparkReplSessionResponseBody} extends {@link TeaModel}
     *
     * <p>StartSparkReplSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("AttemptId")
        private String attemptId;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private Long sessionId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("WebUiAddress")
        private String webUiAddress;

        private Data(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.attemptId = builder.attemptId;
            this.error = builder.error;
            this.sessionId = builder.sessionId;
            this.state = builder.state;
            this.webUiAddress = builder.webUiAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return attemptId
         */
        public String getAttemptId() {
            return this.attemptId;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return sessionId
         */
        public Long getSessionId() {
            return this.sessionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return webUiAddress
         */
        public String getWebUiAddress() {
            return this.webUiAddress;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String attemptId; 
            private String error; 
            private Long sessionId; 
            private String state; 
            private String webUiAddress; 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * AttemptId.
             */
            public Builder attemptId(String attemptId) {
                this.attemptId = attemptId;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * WebUiAddress.
             */
            public Builder webUiAddress(String webUiAddress) {
                this.webUiAddress = webUiAddress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
