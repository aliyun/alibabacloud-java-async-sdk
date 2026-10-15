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
    @com.aliyun.core.annotation.Validation(maxLength = 500, minLength = 1)
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
         * <p>The color.</p>
         * 
         * <strong>example:</strong>
         * <p>#B0B0B0</p>
         */
        public Builder colorHex(String colorHex) {
            this.putQueryParameter("ColorHex", colorHex);
            this.colorHex = colorHex;
            return this;
        }

        /**
         * <p>Specifies whether the image contains a person.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasPerson(Boolean hasPerson) {
            this.putQueryParameter("HasPerson", hasPerson);
            this.hasPerson = hasPerson;
            return this;
        }

        /**
         * <p>The image category. Valid values:</p>
         * <ul>
         * <li>normal: illustrations or article images.</li>
         * <li>banner: background images or carousel images.</li>
         * <li>goods: product or service images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WindowsWithMssqlStdLicense</p>
         */
        public Builder imageCategory(String imageCategory) {
            this.putQueryParameter("ImageCategory", imageCategory);
            this.imageCategory = imageCategory;
            return this;
        }

        /**
         * <p>The aspect ratio of the image. Valid values:
         * &quot;16:9&quot;
         * &quot;4:3&quot;
         * &quot;2:1&quot;
         * &quot;1:1&quot;
         * &quot;3:4&quot;
         * &quot;9:16&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        public Builder imageRatio(String imageRatio) {
            this.putQueryParameter("ImageRatio", imageRatio);
            this.imageRatio = imageRatio;
            return this;
        }

        /**
         * <p>The maximum height of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        public Builder maxHeight(Integer maxHeight) {
            this.putQueryParameter("MaxHeight", maxHeight);
            this.maxHeight = maxHeight;
            return this;
        }

        /**
         * <p>The number of entries per page for paging queries. Maximum value: 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The maximum width of the image, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        public Builder maxWidth(Integer maxWidth) {
            this.putQueryParameter("MaxWidth", maxWidth);
            this.maxWidth = maxWidth;
            return this;
        }

        /**
         * <p>The minimum height of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder minHeight(Integer minHeight) {
            this.putQueryParameter("MinHeight", minHeight);
            this.minHeight = minHeight;
            return this;
        }

        /**
         * <p>The minimum width of the image, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder minWidth(Integer minWidth) {
            this.putQueryParameter("MinWidth", minWidth);
            this.minWidth = minWidth;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request. If NextToken is specified, the PageSize and PageNumber request parameters do not take effect, and the TotalCount value in the response is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The OSS key.</p>
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
         * <p>The number of returned results. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The start position of the returned results. Valid values: 0 to 499. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder start(Integer start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "simple");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The description text used to search for images.</p>
         * <blockquote>
         * <p>Maximum length: 512 characters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>卫浴五金产品，表面采用拉丝不锈钢材质，整体色调为现代银灰色，呈现简约且富有质感的风格。产品包括淋浴花洒、水龙头及毛巾架等配件，均具备防锈、耐腐蚀性能，适用于潮湿环境。各部件连接处设计精密，配有隐藏式螺丝结构，提升整体美观度。水龙头和花洒喷头支持多模式出水，把手操作顺滑，符合人体工学设计。所有五金件通过国家节水认证，支持冷热水接入，安装方式为壁挂式。</p>
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
