// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link StartDataAgentAccuracyTestTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StartDataAgentAccuracyTestTaskResponseBody</p>
 */
public class StartDataAgentAccuracyTestTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private StartDataAgentAccuracyTestTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDataAgentAccuracyTestTaskResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(StartDataAgentAccuracyTestTaskResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D94F5232-xxx-EH0H28FGGI5I</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public StartDataAgentAccuracyTestTaskResponseBody build() {
            return new StartDataAgentAccuracyTestTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartDataAgentAccuracyTestTaskResponseBody} extends {@link TeaModel}
     *
     * <p>StartDataAgentAccuracyTestTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccuracyTestTaskId")
        private String accuracyTestTaskId;

        private Data(Builder builder) {
            this.accuracyTestTaskId = builder.accuracyTestTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accuracyTestTaskId
         */
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        public static final class Builder {
            private String accuracyTestTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accuracyTestTaskId = model.accuracyTestTaskId;
            } 

            /**
             * AccuracyTestTaskId.
             */
            public Builder accuracyTestTaskId(String accuracyTestTaskId) {
                this.accuracyTestTaskId = accuracyTestTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
