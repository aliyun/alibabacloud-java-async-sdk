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
 * {@link QueryUnionContentInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryUnionContentInfoRequest</p>
 */
public class QueryUnionContentInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyUserId;

    private QueryUnionContentInfoRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.contentId = builder.contentId;
        this.proxyUserId = builder.proxyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnionContentInfoRequest create() {
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
     * @return contentId
     */
    public String getContentId() {
        return this.contentId;
    }

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public static final class Builder extends Request.Builder<QueryUnionContentInfoRequest, Builder> {
        private String channelId; 
        private String contentId; 
        private Long proxyUserId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUnionContentInfoRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.contentId = request.contentId;
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
         * <p>This parameter is required.</p>
         */
        public Builder contentId(String contentId) {
            this.putQueryParameter("ContentId", contentId);
            this.contentId = contentId;
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
        public QueryUnionContentInfoRequest build() {
            return new QueryUnionContentInfoRequest(this);
        } 

    } 

}
