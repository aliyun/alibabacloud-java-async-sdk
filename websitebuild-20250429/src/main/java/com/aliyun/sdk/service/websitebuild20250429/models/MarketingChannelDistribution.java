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
 * {@link MarketingChannelDistribution} extends {@link TeaModel}
 *
 * <p>MarketingChannelDistribution</p>
 */
public class MarketingChannelDistribution extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArticleCount")
    private Long articleCount;

    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    private MarketingChannelDistribution(Builder builder) {
        this.articleCount = builder.articleCount;
        this.channel = builder.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketingChannelDistribution create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleCount
     */
    public Long getArticleCount() {
        return this.articleCount;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    public static final class Builder {
        private Long articleCount; 
        private String channel; 

        private Builder() {
        } 

        private Builder(MarketingChannelDistribution model) {
            this.articleCount = model.articleCount;
            this.channel = model.channel;
        } 

        /**
         * <p>The number of articles in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder articleCount(Long articleCount) {
            this.articleCount = articleCount;
            return this;
        }

        /**
         * <p>The content distribution channel.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSITE</p>
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public MarketingChannelDistribution build() {
            return new MarketingChannelDistribution(this);
        } 

    } 

}
