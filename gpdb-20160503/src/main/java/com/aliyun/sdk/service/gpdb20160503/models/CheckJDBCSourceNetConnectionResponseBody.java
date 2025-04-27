// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CheckJDBCSourceNetConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckJDBCSourceNetConnectionResponseBody</p>
 */
public class CheckJDBCSourceNetConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionMessage")
    private String connectionMessage;

    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckJDBCSourceNetConnectionResponseBody(Builder builder) {
        this.connectionMessage = builder.connectionMessage;
        this.connectionStatus = builder.connectionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckJDBCSourceNetConnectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckJDBCSourceNetConnectionResponseBody model) {
            this.connectionMessage = model.connectionMessage;
            this.connectionStatus = model.connectionStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Return message: Error message returned when the connection fails, otherwise returns an empty string (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        public Builder connectionMessage(String connectionMessage) {
            this.connectionMessage = connectionMessage;
            return this;
        }

        /**
         * <p>Service status:</p>
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

        public CheckJDBCSourceNetConnectionResponseBody build() {
            return new CheckJDBCSourceNetConnectionResponseBody(this);
        } 

    } 

}
