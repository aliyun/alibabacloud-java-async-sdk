// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartSparkReplSessionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1797FEA-B7D6-5ED6-A24B-2C8C5F4D7361</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunUid = model.aliyunUid;
                this.attemptId = model.attemptId;
                this.error = model.error;
                this.sessionId = model.sessionId;
                this.state = model.state;
                this.webUiAddress = model.webUiAddress;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account that owns the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>178157466******</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The attempt ID of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>s202301061000h****</p>
             */
            public Builder attemptId(String attemptId) {
                this.attemptId = attemptId;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>session time out</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The ID of the session that executes the code.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The status of the session. Valid values:</p>
             * <ul>
             * <li>IDLE</li>
             * <li>BUSY</li>
             * <li>DEAD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IDLE</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The URL of the web UI for the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=">https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=</a>****</p>
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
