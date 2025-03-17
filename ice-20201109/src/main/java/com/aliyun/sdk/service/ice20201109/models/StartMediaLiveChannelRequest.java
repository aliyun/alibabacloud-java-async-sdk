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
 * {@link StartMediaLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>StartMediaLiveChannelRequest</p>
 */
public class StartMediaLiveChannelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    private StartMediaLiveChannelRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartMediaLiveChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    public static final class Builder extends Request.Builder<StartMediaLiveChannelRequest, Builder> {
        private String channelId; 

        private Builder() {
            super();
        } 

        private Builder(StartMediaLiveChannelRequest request) {
            super(request);
            this.channelId = request.channelId;
        } 

        /**
         * <p>The ID of the channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        @Override
        public StartMediaLiveChannelRequest build() {
            return new StartMediaLiveChannelRequest(this);
        } 

    } 

}
