// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetChannelResponseBody} extends {@link TeaModel}
 *
 * <p>GetChannelResponseBody</p>
 */
public class GetChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channel")
    private ChannelAssemblyChannel channel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChannelResponseBody(Builder builder) {
        this.channel = builder.channel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return channel
     */
    public ChannelAssemblyChannel getChannel() {
        return this.channel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ChannelAssemblyChannel channel; 
        private String requestId; 

        /**
         * Channel.
         */
        public Builder channel(ChannelAssemblyChannel channel) {
            this.channel = channel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChannelResponseBody build() {
            return new GetChannelResponseBody(this);
        } 

    } 

}
