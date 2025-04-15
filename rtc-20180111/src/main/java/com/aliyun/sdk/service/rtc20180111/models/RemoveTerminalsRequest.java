// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> terminalIds;

    private RemoveTerminalsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private java.util.List<String> terminalIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveTerminalsRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.ownerId = request.ownerId;
            this.terminalIds = request.terminalIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1811xxxx</p>
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
