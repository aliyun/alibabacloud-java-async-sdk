// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecContainerCommandResponseBody} extends {@link TeaModel}
 *
 * <p>ExecContainerCommandResponseBody</p>
 */
public class ExecContainerCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HttpUrl")
    private String httpUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncResponse")
    private String syncResponse;

    @com.aliyun.core.annotation.NameInMap("WebSocketUri")
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
         * <p>The HTTP URL. You can use this URL to enter the container within 30 seconds after this operation is called. For more information, see <a href="~~202846~~">Use and integrate the Elastic Container Instance terminal</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eci.console.aliyun.com/terminal?param=X32a">https://eci.console.aliyun.com/terminal?param=X32a</a>****</p>
         */
        public Builder httpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28B583A8-313D-4383-7817-B5A9F7E0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The output of the command. This parameter is returned only if Sync is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        public Builder syncResponse(String syncResponse) {
            this.syncResponse = syncResponse;
            return this;
        }

        /**
         * <p>The WebSocket URL. You can use this URL to establish a WebSocket connection with the container.</p>
         * 
         * <strong>example:</strong>
         * <p>wss://eci-cn-shanghai.aliyun.com/exec/?s=ktHPx****</p>
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
