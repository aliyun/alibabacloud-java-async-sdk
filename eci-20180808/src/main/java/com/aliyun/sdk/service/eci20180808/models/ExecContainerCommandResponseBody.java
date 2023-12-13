// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecContainerCommandResponseBody} extends {@link TeaModel}
 *
 * <p>ExecContainerCommandResponseBody</p>
 */
public class ExecContainerCommandResponseBody extends TeaModel {
    @NameInMap("HttpUrl")
    private String httpUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncResponse")
    private String syncResponse;

    @NameInMap("WebSocketUri")
    private String webSocketUri;

    private ExecContainerCommandResponseBody(Builder builder) {
        this.httpUrl = builder.httpUrl;
        this.requestId = builder.requestId;
        this.syncResponse = builder.syncResponse;
        this.webSocketUri = builder.webSocketUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecContainerCommandResponseBody create() {
        return builder().build();
    }

    /**
     * @return httpUrl
     */
    public String getHttpUrl() {
        return this.httpUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncResponse
     */
    public String getSyncResponse() {
        return this.syncResponse;
    }

    /**
     * @return webSocketUri
     */
    public String getWebSocketUri() {
        return this.webSocketUri;
    }

    public static final class Builder {
        private String httpUrl; 
        private String requestId; 
        private String syncResponse; 
        private String webSocketUri; 

        /**
         * The HTTP URL. You can use this URL to enter the container within 30 seconds after this operation is called. For more information, see [Use and integrate the Elastic Container Instance terminal](~~202846~~).
         */
        public Builder httpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The output of the command. This parameter is returned only if Sync is set to true.
         */
        public Builder syncResponse(String syncResponse) {
            this.syncResponse = syncResponse;
            return this;
        }

        /**
         * The WebSocket URL. You can use this URL to establish a WebSocket connection with the container.
         */
        public Builder webSocketUri(String webSocketUri) {
            this.webSocketUri = webSocketUri;
            return this;
        }

        public ExecContainerCommandResponseBody build() {
            return new ExecContainerCommandResponseBody(this);
        } 

    } 

}
