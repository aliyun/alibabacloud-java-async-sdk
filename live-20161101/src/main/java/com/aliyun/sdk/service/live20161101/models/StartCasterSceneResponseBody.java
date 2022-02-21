// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCasterSceneResponseBody} extends {@link TeaModel}
 *
 * <p>StartCasterSceneResponseBody</p>
 */
public class StartCasterSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamUrl")
    private String streamUrl;

    private StartCasterSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamUrl = builder.streamUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCasterSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamUrl
     */
    public String getStreamUrl() {
        return this.streamUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String streamUrl; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamUrl.
         */
        public Builder streamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }

        public StartCasterSceneResponseBody build() {
            return new StartCasterSceneResponseBody(this);
        } 

    } 

}
