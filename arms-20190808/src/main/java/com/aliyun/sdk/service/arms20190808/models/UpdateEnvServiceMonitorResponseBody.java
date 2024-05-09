// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvServiceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEnvServiceMonitorResponseBody</p>
 */
public class UpdateEnvServiceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateEnvServiceMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvServiceMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateEnvServiceMonitorResponseBody build() {
            return new UpdateEnvServiceMonitorResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchedMsg")
        private String matchedMsg;

        @com.aliyun.core.annotation.NameInMap("MatchedTargetCount")
        private String matchedTargetCount;

        private Data(Builder builder) {
            this.matchedMsg = builder.matchedMsg;
            this.matchedTargetCount = builder.matchedTargetCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return matchedMsg
         */
        public String getMatchedMsg() {
            return this.matchedMsg;
        }

        /**
         * @return matchedTargetCount
         */
        public String getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public static final class Builder {
            private String matchedMsg; 
            private String matchedTargetCount; 

            /**
             * Indicates whether targets are matched.
             */
            public Builder matchedMsg(String matchedMsg) {
                this.matchedMsg = matchedMsg;
                return this;
            }

            /**
             * The number of matched targets.
             */
            public Builder matchedTargetCount(String matchedTargetCount) {
                this.matchedTargetCount = matchedTargetCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
