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
 * {@link DeleteChannelRequest} extends {@link RequestModel}
 *
 * <p>DeleteChannelRequest</p>
 */
public class DeleteChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    private DeleteChannelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    public static final class Builder extends Request.Builder<DeleteChannelRequest, Builder> {
        private String appId; 
        private String channelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChannelRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
        } 

        /**
         * <p>The application ID. You can specify only one application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The channel ID. You can specify only one channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        @Override
        public DeleteChannelRequest build() {
            return new DeleteChannelRequest(this);
        } 

    } 

}
