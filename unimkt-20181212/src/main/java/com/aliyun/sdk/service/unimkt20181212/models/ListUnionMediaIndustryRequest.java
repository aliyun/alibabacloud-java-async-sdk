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
 * {@link ListUnionMediaIndustryRequest} extends {@link RequestModel}
 *
 * <p>ListUnionMediaIndustryRequest</p>
 */
public class ListUnionMediaIndustryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private Long proxyUserId;

    private ListUnionMediaIndustryRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.proxyUserId = builder.proxyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnionMediaIndustryRequest create() {
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

    public static final class Builder extends Request.Builder<ListUnionMediaIndustryRequest, Builder> {
        private String channelId; 
        private Long proxyUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListUnionMediaIndustryRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.proxyUserId = request.proxyUserId;
        } 

        /**
         * ChannelId.
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
        public ListUnionMediaIndustryRequest build() {
            return new ListUnionMediaIndustryRequest(this);
        } 

    } 

}
