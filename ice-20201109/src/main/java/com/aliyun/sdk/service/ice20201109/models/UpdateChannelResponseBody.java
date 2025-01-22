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
 * {@link UpdateChannelResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateChannelResponseBody</p>
 */
public class UpdateChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channel")
    private ChannelAssemblyChannel channel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateChannelResponseBody(Builder builder) {
        this.channel = builder.channel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChannelResponseBody create() {
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

        public UpdateChannelResponseBody build() {
            return new UpdateChannelResponseBody(this);
        } 

    } 

}
