// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDeviceTimeResponseBody} extends {@link TeaModel}
 *
 * <p>SyncDeviceTimeResponseBody</p>
 */
public class SyncDeviceTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("NTPServer")
    private String NTPServer;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetryInterval")
    private String retryInterval;

    @NameInMap("SyncInterval")
    private String syncInterval;

    @NameInMap("TimeStamp")
    private String timeStamp;

    private SyncDeviceTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.NTPServer = builder.NTPServer;
        this.requestId = builder.requestId;
        this.retryInterval = builder.retryInterval;
        this.syncInterval = builder.syncInterval;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDeviceTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return NTPServer
     */
    public String getNTPServer() {
        return this.NTPServer;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retryInterval
     */
    public String getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return syncInterval
     */
    public String getSyncInterval() {
        return this.syncInterval;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String NTPServer; 
        private String requestId; 
        private String retryInterval; 
        private String syncInterval; 
        private String timeStamp; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NTPServer.
         */
        public Builder NTPServer(String NTPServer) {
            this.NTPServer = NTPServer;
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
         * RetryInterval.
         */
        public Builder retryInterval(String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * SyncInterval.
         */
        public Builder syncInterval(String syncInterval) {
            this.syncInterval = syncInterval;
            return this;
        }

        /**
         * TimeStamp.
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public SyncDeviceTimeResponseBody build() {
            return new SyncDeviceTimeResponseBody(this);
        } 

    } 

}
