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
         * <li>normal: Illustrations and article images.</li>
         * <li>banner: Background images and carousel images.</li>
         * <li>goods: Product or service images.</li>
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
         * <p>The aspect ratio of the image. Valid values:</p>
         * <ul>
         * <li>&quot;16:9&quot;</li>
         * <li>&quot;4:3&quot;</li>
         * <li>&quot;2:1&quot;</li>
         * <li>&quot;1:1&quot;</li>
         * <li>&quot;3:4&quot;</li>
         * <li>&quot;9:16&quot;</li>
         * </ul>
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
         * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: 20.</p>
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
         * <p>The query token. Set the value to the NextToken value returned from the previous call to this operation. You do not need to set this parameter for the first call. If NextToken is set, the PageSize and PageNumber request parameters become invalid, and the TotalCount value in the response is invalid.</p>
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
         * <p>The number of results to return. Default value: 10.</p>
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
         * <p>The starting position of the returned results. Valid values: 0 to 499. Default value: 0.</p>
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
         * <p>The descriptive text used to search for images. A maximum of 512 characters are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Bathroom hardware products, featuring a brushed stainless steel surface with an overall modern silver-gray tone, presenting a minimalist and textured style. The products include accessories such as showerheads, faucets, and towel racks, all of which are rust-proof and corrosion-resistant, making them suitable for humid environments. The joints between components are precisely designed with hidden screw structures to enhance overall aesthetics. The faucets and showerheads support multiple water flow modes, and the handles operate smoothly, conforming to ergonomic design. All hardware fittings have passed the national water-saving certification, support both cold and hot water connections, and are wall-mounted</p>
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
