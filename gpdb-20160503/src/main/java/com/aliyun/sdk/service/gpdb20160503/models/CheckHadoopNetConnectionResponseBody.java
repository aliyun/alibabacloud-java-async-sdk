// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckHadoopNetConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckHadoopNetConnectionResponseBody</p>
 */
public class CheckHadoopNetConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionMessage")
    private String connectionMessage;

    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckHadoopNetConnectionResponseBody(Builder builder) {
        this.connectionMessage = builder.connectionMessage;
        this.connectionStatus = builder.connectionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckHadoopNetConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionMessage
     */
    public String getConnectionMessage() {
        return this.connectionMessage;
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connectionMessage; 
        private String connectionStatus; 
        private String requestId; 

        /**
         * <p>Return message: Returns error information if the connection fails, otherwise returns an empty string (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        public Builder connectionMessage(String connectionMessage) {
            this.connectionMessage = connectionMessage;
            return this;
        }

        /**
         * <p>Connection status:</p>
         * <ul>
         * <li><p>Network connected: Success</p>
         * </li>
         * <li><p>Network not connected: Failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckHadoopNetConnectionResponseBody build() {
            return new CheckHadoopNetConnectionResponseBody(this);
        } 

    } 

}
