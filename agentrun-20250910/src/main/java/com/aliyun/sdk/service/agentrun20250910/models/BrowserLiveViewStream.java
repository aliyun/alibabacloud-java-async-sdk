// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BrowserLiveViewStream} extends {@link TeaModel}
 *
 * <p>BrowserLiveViewStream</p>
 */
public class BrowserLiveViewStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("streamEndpoint")
    private String streamEndpoint;

    private BrowserLiveViewStream(Builder builder) {
        this.streamEndpoint = builder.streamEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserLiveViewStream create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return streamEndpoint
     */
    public String getStreamEndpoint() {
        return this.streamEndpoint;
    }

    public static final class Builder {
        private String streamEndpoint; 

        private Builder() {
        } 

        private Builder(BrowserLiveViewStream model) {
            this.streamEndpoint = model.streamEndpoint;
        } 

        /**
         * streamEndpoint.
         */
        public Builder streamEndpoint(String streamEndpoint) {
            this.streamEndpoint = streamEndpoint;
            return this;
        }

        public BrowserLiveViewStream build() {
            return new BrowserLiveViewStream(this);
        } 

    } 

}
