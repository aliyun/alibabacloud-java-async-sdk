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
 * {@link CreateMediaLiveChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMediaLiveChannelResponseBody</p>
 */
public class CreateMediaLiveChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMediaLiveChannelResponseBody(Builder builder) {
        this.channelId = builder.channelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaLiveChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String channelId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMediaLiveChannelResponseBody model) {
            this.channelId = model.channelId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMediaLiveChannelResponseBody build() {
            return new CreateMediaLiveChannelResponseBody(this);
        } 

    } 

}
