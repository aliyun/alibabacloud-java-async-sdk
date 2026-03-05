// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link QueryAvailableBalanceRequest} extends {@link RequestModel}
 *
 * <p>QueryAvailableBalanceRequest</p>
 */
public class QueryAvailableBalanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private Long proxyUserId;

    private QueryAvailableBalanceRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.proxyUserId = builder.proxyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvailableBalanceRequest create() {
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

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public static final class Builder extends Request.Builder<QueryAvailableBalanceRequest, Builder> {
        private String channelId; 
        private Long proxyUserId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvailableBalanceRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.proxyUserId = request.proxyUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ProxyUserId.
         */
        public Builder proxyUserId(Long proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        @Override
        public QueryAvailableBalanceRequest build() {
            return new QueryAvailableBalanceRequest(this);
        } 

    } 

}
