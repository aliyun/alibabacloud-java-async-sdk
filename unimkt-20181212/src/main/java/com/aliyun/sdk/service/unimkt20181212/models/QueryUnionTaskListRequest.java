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
 * {@link QueryUnionTaskListRequest} extends {@link RequestModel}
 *
 * <p>QueryUnionTaskListRequest</p>
 */
public class QueryUnionTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserId")
    private Long brandUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserNick")
    private String brandUserNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 12222222, minimum = 1)
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyUserId;

    private QueryUnionTaskListRequest(Builder builder) {
        super(builder);
        this.brandUserId = builder.brandUserId;
        this.brandUserNick = builder.brandUserNick;
        this.channelId = builder.channelId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.proxyUserId = builder.proxyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnionTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandUserId
     */
    public Long getBrandUserId() {
        return this.brandUserId;
    }

    /**
     * @return brandUserNick
     */
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public static final class Builder extends Request.Builder<QueryUnionTaskListRequest, Builder> {
        private Long brandUserId; 
        private String brandUserNick; 
        private String channelId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long proxyUserId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUnionTaskListRequest request) {
            super(request);
            this.brandUserId = request.brandUserId;
            this.brandUserNick = request.brandUserNick;
            this.channelId = request.channelId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.proxyUserId = request.proxyUserId;
        } 

        /**
         * BrandUserId.
         */
        public Builder brandUserId(Long brandUserId) {
            this.putQueryParameter("BrandUserId", brandUserId);
            this.brandUserId = brandUserId;
            return this;
        }

        /**
         * BrandUserNick.
         */
        public Builder brandUserNick(String brandUserNick) {
            this.putQueryParameter("BrandUserNick", brandUserNick);
            this.brandUserNick = brandUserNick;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder proxyUserId(Long proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        @Override
        public QueryUnionTaskListRequest build() {
            return new QueryUnionTaskListRequest(this);
        } 

    } 

}
