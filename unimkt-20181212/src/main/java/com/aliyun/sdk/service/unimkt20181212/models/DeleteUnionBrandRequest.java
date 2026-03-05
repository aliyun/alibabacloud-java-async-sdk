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
 * {@link DeleteUnionBrandRequest} extends {@link RequestModel}
 *
 * <p>DeleteUnionBrandRequest</p>
 */
public class DeleteUnionBrandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandMainId")
    private Long brandMainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private Long proxyUserId;

    private DeleteUnionBrandRequest(Builder builder) {
        super(builder);
        this.brandMainId = builder.brandMainId;
        this.channelId = builder.channelId;
        this.proxyUserId = builder.proxyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUnionBrandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandMainId
     */
    public Long getBrandMainId() {
        return this.brandMainId;
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

    public static final class Builder extends Request.Builder<DeleteUnionBrandRequest, Builder> {
        private Long brandMainId; 
        private String channelId; 
        private Long proxyUserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUnionBrandRequest request) {
            super(request);
            this.brandMainId = request.brandMainId;
            this.channelId = request.channelId;
            this.proxyUserId = request.proxyUserId;
        } 

        /**
         * BrandMainId.
         */
        public Builder brandMainId(Long brandMainId) {
            this.putQueryParameter("BrandMainId", brandMainId);
            this.brandMainId = brandMainId;
            return this;
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
        public DeleteUnionBrandRequest build() {
            return new DeleteUnionBrandRequest(this);
        } 

    } 

}
