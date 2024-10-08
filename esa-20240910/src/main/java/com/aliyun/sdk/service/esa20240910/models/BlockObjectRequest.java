// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BlockObjectRequest} extends {@link RequestModel}
 *
 * <p>BlockObjectRequest</p>
 */
public class BlockObjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extension")
    private String extension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Maxage")
    @com.aliyun.core.annotation.Validation(maximum = 864000, minimum = 600)
    private Integer maxage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private BlockObjectRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.extension = builder.extension;
        this.maxage = builder.maxage;
        this.siteId = builder.siteId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BlockObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List < String > getContent() {
        return this.content;
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return maxage
     */
    public Integer getMaxage() {
        return this.maxage;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<BlockObjectRequest, Builder> {
        private java.util.List < String > content; 
        private String extension; 
        private Integer maxage; 
        private Long siteId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(BlockObjectRequest request) {
            super(request);
            this.content = request.content;
            this.extension = request.extension;
            this.maxage = request.maxage;
            this.siteId = request.siteId;
            this.type = request.type;
        } 

        /**
         * Content.
         */
        public Builder content(java.util.List < String > content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * Extension.
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * Maxage.
         */
        public Builder maxage(Integer maxage) {
            this.putQueryParameter("Maxage", maxage);
            this.maxage = maxage;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public BlockObjectRequest build() {
            return new BlockObjectRequest(this);
        } 

    } 

}
