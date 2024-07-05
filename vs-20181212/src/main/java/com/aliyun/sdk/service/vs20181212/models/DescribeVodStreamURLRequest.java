// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodStreamURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodStreamURLRequest</p>
 */
public class DescribeVodStreamURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private DescribeVodStreamURLRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodStreamURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<DescribeVodStreamURLRequest, Builder> {
        private Long ownerId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodStreamURLRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.url = request.url;
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
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DescribeVodStreamURLRequest build() {
            return new DescribeVodStreamURLRequest(this);
        } 

    } 

}
