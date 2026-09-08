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
 * {@link StartListMcpServerToolsResponseBody} extends {@link TeaModel}
 *
 * <p>StartListMcpServerToolsResponseBody</p>
 */
public class StartListMcpServerToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StartListMcpServerToolsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartListMcpServerToolsResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StartListMcpServerToolsResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result of the asynchronous detection startup. Only StartTimestamp may be returned if the resources are still being provisioned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The return code. The value success is returned if the request was successful. An error code is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if a system-level request failure occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>agent status=wait_resource_running</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate this call.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StartListMcpServerToolsResponseBody build() {
            return new StartListMcpServerToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartListMcpServerToolsResponseBody} extends {@link TeaModel}
     *
     * <p>StartListMcpServerToolsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StartTimestamp")
        private String startTimestamp;

        private Data(Builder builder) {
            this.sessionId = builder.sessionId;
            this.startTimestamp = builder.startTimestamp;
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
         * @return startTimestamp
         */
        public String getStartTimestamp() {
            return this.startTimestamp;
        }

        public static final class Builder {
            private String sessionId; 
            private String startTimestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sessionId = model.sessionId;
                this.startTimestamp = model.startTimestamp;
            } 

            /**
             * <p>The temporary session ID for this detection. After the startup succeeds, use this value to call GetListMcpServerToolsResult to poll for the result.</p>
             * 
             * <strong>example:</strong>
             * <p>1vw***6wr</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The UNIX timestamp at which the server started the detection, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1785819600000</p>
             */
            public Builder startTimestamp(String startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
