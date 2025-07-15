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
 * {@link RemoveTerminalsRequest} extends {@link RequestModel}
 *
 * <p>RemoveTerminalsRequest</p>
 */
public class RemoveTerminalsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> terminalIds;

    private RemoveTerminalsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.terminalIds = builder.terminalIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTerminalsRequest create() {
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

    /**
     * @return terminalIds
     */
    public java.util.List<String> getTerminalIds() {
        return this.terminalIds;
    }

    public static final class Builder extends Request.Builder<RemoveTerminalsRequest, Builder> {
        private String appId; 
        private String channelId; 
        private java.util.List<String> terminalIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveTerminalsRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.terminalIds = request.terminalIds;
        } 

        /**
         * <p>The ID of the application. You can specify only one application ID in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aec****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the channel. You can specify only one channel ID in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The IDs of the users that you want to remove.</p>
         * <p>This parameter is required.</p>
         */
        public Builder terminalIds(java.util.List<String> terminalIds) {
            this.putQueryParameter("TerminalIds", terminalIds);
            this.terminalIds = terminalIds;
            return this;
        }

        @Override
        public RemoveTerminalsRequest build() {
            return new RemoveTerminalsRequest(this);
        } 

    } 

}
