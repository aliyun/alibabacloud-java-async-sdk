// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateEnvPodMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEnvPodMonitorResponseBody</p>
 */
public class UpdateEnvPodMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateEnvPodMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvPodMonitorResponseBody create() {
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
         * <p>The response code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateEnvPodMonitorResponseBody build() {
            return new UpdateEnvPodMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEnvPodMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateEnvPodMonitorResponseBody</p>
     */
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
             * <p>Indicates whether targets are matched.</p>
             * 
             * <strong>example:</strong>
             * <p>Match successful.</p>
             */
            public Builder matchedMsg(String matchedMsg) {
                this.matchedMsg = matchedMsg;
                return this;
            }

            /**
             * <p>The number of matched targets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
