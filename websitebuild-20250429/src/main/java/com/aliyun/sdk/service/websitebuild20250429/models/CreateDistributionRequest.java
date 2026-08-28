// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateDistributionRequest} extends {@link RequestModel}
 *
 * <p>CreateDistributionRequest</p>
 */
public class CreateDistributionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArticleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String articleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> channels;

    private CreateDistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.articleId = builder.articleId;
        this.channels = builder.channels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDistributionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return articleId
     */
    public String getArticleId() {
        return this.articleId;
    }

    /**
     * @return channels
     */
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public static final class Builder extends Request.Builder<CreateDistributionRequest, Builder> {
        private String regionId; 
        private String articleId; 
        private java.util.List<String> channels; 

        private Builder() {
            super();
        } 

        private Builder(CreateDistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.articleId = request.articleId;
            this.channels = request.channels;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>28733</p>
         */
        public Builder articleId(String articleId) {
            this.putQueryParameter("ArticleId", articleId);
            this.articleId = articleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channels(java.util.List<String> channels) {
            String channelsShrink = shrink(channels, "Channels", "json");
            this.putQueryParameter("Channels", channelsShrink);
            this.channels = channels;
            return this;
        }

        @Override
        public CreateDistributionRequest build() {
            return new CreateDistributionRequest(this);
        } 

    } 

}
