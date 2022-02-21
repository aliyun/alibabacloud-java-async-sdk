// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceVncUrlResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceVncUrlResponseBody</p>
 */
public class ListInstanceVncUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VncUrl")
    private String vncUrl;

    @NameInMap("WebRtcToken")
    private String webRtcToken;

    private ListInstanceVncUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vncUrl = builder.vncUrl;
        this.webRtcToken = builder.webRtcToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceVncUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vncUrl
     */
    public String getVncUrl() {
        return this.vncUrl;
    }

    /**
     * @return webRtcToken
     */
    public String getWebRtcToken() {
        return this.webRtcToken;
    }

    public static final class Builder {
        private String requestId; 
        private String vncUrl; 
        private String webRtcToken; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VncUrl.
         */
        public Builder vncUrl(String vncUrl) {
            this.vncUrl = vncUrl;
            return this;
        }

        /**
         * WebRtcToken.
         */
        public Builder webRtcToken(String webRtcToken) {
            this.webRtcToken = webRtcToken;
            return this;
        }

        public ListInstanceVncUrlResponseBody build() {
            return new ListInstanceVncUrlResponseBody(this);
        } 

    } 

}
