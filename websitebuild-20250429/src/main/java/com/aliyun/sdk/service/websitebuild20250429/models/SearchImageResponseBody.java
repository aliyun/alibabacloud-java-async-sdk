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
 * {@link SearchImageResponseBody} extends {@link TeaModel}
 *
 * <p>SearchImageResponseBody</p>
 */
public class SearchImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("ImageResponse")
    private ImageResponse imageResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private SearchImageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.imageResponse = builder.imageResponse;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return imageResponse
     */
    public ImageResponse getImageResponse() {
        return this.imageResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private ImageResponse imageResponse; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(SearchImageResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.imageResponse = model.imageResponse;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. If the request is successful, this field is not returned. If the request fails, this field is returned. For more information, see the error codes in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The image search results.</p>
         */
        public Builder imageResponse(ImageResponse imageResponse) {
            this.imageResponse = imageResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public SearchImageResponseBody build() {
            return new SearchImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchImageResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageResponseBody</p>
     */
    public static class ImageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DescriptiveTones")
        private String descriptiveTones;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("ImageCategory")
        private String imageCategory;

        @com.aliyun.core.annotation.NameInMap("ImageRatio")
        private String imageRatio;

        @com.aliyun.core.annotation.NameInMap("ImageUuid")
        private String imageUuid;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("QuantitativePalette")
        private String quantitativePalette;

        @com.aliyun.core.annotation.NameInMap("TagsFromImage")
        private String tagsFromImage;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private ImageList(Builder builder) {
            this.descriptiveTones = builder.descriptiveTones;
            this.height = builder.height;
            this.imageCategory = builder.imageCategory;
            this.imageRatio = builder.imageRatio;
            this.imageUuid = builder.imageUuid;
            this.ossKey = builder.ossKey;
            this.quantitativePalette = builder.quantitativePalette;
            this.tagsFromImage = builder.tagsFromImage;
            this.url = builder.url;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageList create() {
            return builder().build();
        }

        /**
         * @return descriptiveTones
         */
        public String getDescriptiveTones() {
            return this.descriptiveTones;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
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
         * @return imageUuid
         */
        public String getImageUuid() {
            return this.imageUuid;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return quantitativePalette
         */
        public String getQuantitativePalette() {
            return this.quantitativePalette;
        }

        /**
         * @return tagsFromImage
         */
        public String getTagsFromImage() {
            return this.tagsFromImage;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String descriptiveTones; 
            private Integer height; 
            private String imageCategory; 
            private String imageRatio; 
            private String imageUuid; 
            private String ossKey; 
            private String quantitativePalette; 
            private String tagsFromImage; 
            private String url; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(ImageList model) {
                this.descriptiveTones = model.descriptiveTones;
                this.height = model.height;
                this.imageCategory = model.imageCategory;
                this.imageRatio = model.imageRatio;
                this.imageUuid = model.imageUuid;
                this.ossKey = model.ossKey;
                this.quantitativePalette = model.quantitativePalette;
                this.tagsFromImage = model.tagsFromImage;
                this.url = model.url;
                this.width = model.width;
            } 

            /**
             * <p>The descriptive tones identified from the image.</p>
             * 
             * <strong>example:</strong>
             * <p>冷色调 蓝色</p>
             */
            public Builder descriptiveTones(String descriptiveTones) {
                this.descriptiveTones = descriptiveTones;
                return this;
            }

            /**
             * <p>The height of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder height(Integer height) {
                this.height = height;
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
             * <p>normal</p>
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * <p>The aspect ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>16:9</p>
             */
            public Builder imageRatio(String imageRatio) {
                this.imageRatio = imageRatio;
                return this;
            }

            /**
             * <p>The unique identifier of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>70687446-821c-4ebd-9be6-b57dc0a3500a</p>
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * <p>oss key</p>
             * 
             * <strong>example:</strong>
             * <p>1ad5/c728/cb40/2410/e01d/b24c/9acd/7d51/1ad5c728cb402410e01db24c9acd7d51</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * <p>The quantitative palette extracted by the algorithm (HEX, LAB).</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;hex&quot;: &quot;#3a3f58&quot;, &quot;rgb&quot;: {&quot;r&quot;: 58, &quot;g&quot;: 63, &quot;b&quot;: 88 }, &quot;lab&quot;: {&quot;l&quot;: 27.81, &quot;a&quot;: 2.95, &quot;b&quot;: -16.52 }, &quot;percentage&quot;: 0.4521 }, {&quot;hex&quot;: &quot;#c8a16a&quot;, &quot;rgb&quot;: {&quot;r&quot;: 200, &quot;g&quot;: 161, &quot;b&quot;: 106 }, &quot;lab&quot;: {&quot;l&quot;: 69.35, &quot;a&quot;: 11.23, &quot;b&quot;: 35.18 }, &quot;percentage&quot;: 0.2355 }, {&quot;hex&quot;: &quot;#f1e8da&quot;, &quot;rgb&quot;: {&quot;r&quot;: 241, &quot;g&quot;: 232, &quot;b&quot;: 218 }, &quot;lab&quot;: {&quot;l&quot;: 93.17, &quot;a&quot;: 1.76, &quot;b&quot;: 7.91 }, &quot;percentage&quot;: 0.1873 } ]</p>
             */
            public Builder quantitativePalette(String quantitativePalette) {
                this.quantitativePalette = quantitativePalette;
                return this;
            }

            /**
             * <p>The image tags.</p>
             * 
             * <strong>example:</strong>
             * <p>日出、奔跑</p>
             */
            public Builder tagsFromImage(String tagsFromImage) {
                this.tagsFromImage = tagsFromImage;
                return this;
            }

            /**
             * <p>The temporary access URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/RollTicket_01.jpeg">https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/RollTicket_01.jpeg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>154</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public ImageList build() {
                return new ImageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchImageResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageResponseBody</p>
     */
    public static class ImageResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List<ImageList> imageList;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private ImageResponse(Builder builder) {
            this.imageList = builder.imageList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResponse create() {
            return builder().build();
        }

        /**
         * @return imageList
         */
        public java.util.List<ImageList> getImageList() {
            return this.imageList;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<ImageList> imageList; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(ImageResponse model) {
                this.imageList = model.imageList;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The image list.</p>
             */
            public Builder imageList(java.util.List<ImageList> imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * <p>The number of entries returned per query.</p>
             * <p>Valid values: 10 to 100. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next query. This value is empty if there are no more results.</p>
             * 
             * <strong>example:</strong>
             * <p>2c6b65b6f9d625d4e2514a628bde8eb2e0b5e8707e68181f</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public ImageResponse build() {
                return new ImageResponse(this);
            } 

        } 

    }
}
