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
 * {@link SearchImageRequest} extends {@link RequestModel}
 *
 * <p>SearchImageRequest</p>
 */
public class SearchImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColorHex")
    private String colorHex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasPerson")
    private Boolean hasPerson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCategory")
    private String imageCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRatio")
    private String imageRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxHeight")
    private Integer maxHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxWidth")
    private Integer maxWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinHeight")
    private Integer minHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinWidth")
    private Integer minWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    private Integer start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    private SearchImageRequest(Builder builder) {
        super(builder);
        this.colorHex = builder.colorHex;
        this.hasPerson = builder.hasPerson;
        this.imageCategory = builder.imageCategory;
        this.imageRatio = builder.imageRatio;
        this.maxHeight = builder.maxHeight;
        this.maxResults = builder.maxResults;
        this.maxWidth = builder.maxWidth;
        this.minHeight = builder.minHeight;
        this.minWidth = builder.minWidth;
        this.nextToken = builder.nextToken;
        this.ossKey = builder.ossKey;
        this.size = builder.size;
        this.start = builder.start;
        this.tags = builder.tags;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return colorHex
     */
    public String getColorHex() {
        return this.colorHex;
    }

    /**
     * @return hasPerson
     */
    public Boolean getHasPerson() {
        return this.hasPerson;
    }

    /**
     * @return imageCategory
     */
    public String getImageCategory() {
        return this.imageCategory;
    }

    /**
     * @return imageRatio
     */
    public String getImageRatio() {
        return this.imageRatio;
    }

    /**
     * @return maxHeight
     */
    public Integer getMaxHeight() {
        return this.maxHeight;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return maxWidth
     */
    public Integer getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * @return minHeight
     */
    public Integer getMinHeight() {
        return this.minHeight;
    }

    /**
     * @return minWidth
     */
    public Integer getMinWidth() {
        return this.minWidth;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<SearchImageRequest, Builder> {
        private String colorHex; 
        private Boolean hasPerson; 
        private String imageCategory; 
        private String imageRatio; 
        private Integer maxHeight; 
        private Integer maxResults; 
        private Integer maxWidth; 
        private Integer minHeight; 
        private Integer minWidth; 
        private String nextToken; 
        private String ossKey; 
        private Integer size; 
        private Integer start; 
        private java.util.List<String> tags; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(SearchImageRequest request) {
            super(request);
            this.colorHex = request.colorHex;
            this.hasPerson = request.hasPerson;
            this.imageCategory = request.imageCategory;
            this.imageRatio = request.imageRatio;
            this.maxHeight = request.maxHeight;
            this.maxResults = request.maxResults;
            this.maxWidth = request.maxWidth;
            this.minHeight = request.minHeight;
            this.minWidth = request.minWidth;
            this.nextToken = request.nextToken;
            this.ossKey = request.ossKey;
            this.size = request.size;
            this.start = request.start;
            this.tags = request.tags;
            this.text = request.text;
        } 

        /**
         * ColorHex.
         */
        public Builder colorHex(String colorHex) {
            this.putQueryParameter("ColorHex", colorHex);
            this.colorHex = colorHex;
            return this;
        }

        /**
         * HasPerson.
         */
        public Builder hasPerson(Boolean hasPerson) {
            this.putQueryParameter("HasPerson", hasPerson);
            this.hasPerson = hasPerson;
            return this;
        }

        /**
         * ImageCategory.
         */
        public Builder imageCategory(String imageCategory) {
            this.putQueryParameter("ImageCategory", imageCategory);
            this.imageCategory = imageCategory;
            return this;
        }

        /**
         * ImageRatio.
         */
        public Builder imageRatio(String imageRatio) {
            this.putQueryParameter("ImageRatio", imageRatio);
            this.imageRatio = imageRatio;
            return this;
        }

        /**
         * MaxHeight.
         */
        public Builder maxHeight(Integer maxHeight) {
            this.putQueryParameter("MaxHeight", maxHeight);
            this.maxHeight = maxHeight;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MaxWidth.
         */
        public Builder maxWidth(Integer maxWidth) {
            this.putQueryParameter("MaxWidth", maxWidth);
            this.maxWidth = maxWidth;
            return this;
        }

        /**
         * MinHeight.
         */
        public Builder minHeight(Integer minHeight) {
            this.putQueryParameter("MinHeight", minHeight);
            this.minHeight = minHeight;
            return this;
        }

        /**
         * MinWidth.
         */
        public Builder minWidth(Integer minWidth) {
            this.putQueryParameter("MinWidth", minWidth);
            this.minWidth = minWidth;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Osskey。</p>
         * 
         * <strong>example:</strong>
         * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Integer start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "simple");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public SearchImageRequest build() {
            return new SearchImageRequest(this);
        } 

    } 

}
