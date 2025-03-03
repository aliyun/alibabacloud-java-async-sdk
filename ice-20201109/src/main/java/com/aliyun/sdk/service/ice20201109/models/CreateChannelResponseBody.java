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
 * {@link CreateChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChannelResponseBody</p>
 */
public class CreateChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channel")
    private ChannelAssemblyChannel channel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateChannelResponseBody(Builder builder) {
        this.channel = builder.channel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChannelResponseBody create() {
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
         * <p>The channel information.</p>
         */
        public Builder channel(ChannelAssemblyChannel channel) {
            this.channel = channel;
            return this;
        }

        /**
         * <p><strong>Request ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxxx-xxxxx-xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateChannelResponseBody build() {
            return new CreateChannelResponseBody(this);
        } 

    } 

}
