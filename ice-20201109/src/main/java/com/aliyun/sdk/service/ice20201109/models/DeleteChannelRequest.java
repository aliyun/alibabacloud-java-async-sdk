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
 * {@link DeleteChannelRequest} extends {@link RequestModel}
 *
 * <p>DeleteChannelRequest</p>
 */
public class DeleteChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    private DeleteChannelRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    public static final class Builder extends Request.Builder<DeleteChannelRequest, Builder> {
        private String channelName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChannelRequest request) {
            super(request);
            this.channelName = request.channelName;
        } 

        /**
         * <p>The name of the channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        @Override
        public DeleteChannelRequest build() {
            return new DeleteChannelRequest(this);
        } 

    } 

}
