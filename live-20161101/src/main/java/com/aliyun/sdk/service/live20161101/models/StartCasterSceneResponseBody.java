// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link StartCasterSceneResponseBody} extends {@link TeaModel}
 *
 * <p>StartCasterSceneResponseBody</p>
 */
public class StartCasterSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamUrl")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartCasterSceneResponseBody model) {
            this.requestId = model.requestId;
            this.streamUrl = model.streamUrl;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The streaming URL of the scene. It is used for playback, but not for stream relay.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://live/caster/example.org">http://live/caster/example.org</a></p>
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
