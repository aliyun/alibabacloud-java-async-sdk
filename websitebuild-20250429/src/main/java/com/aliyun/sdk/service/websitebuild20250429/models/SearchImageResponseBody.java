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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * ImageResponse.
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
         * Success.
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
             * DescriptiveTones.
             */
            public Builder descriptiveTones(String descriptiveTones) {
                this.descriptiveTones = descriptiveTones;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * ImageCategory.
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * ImageRatio.
             */
            public Builder imageRatio(String imageRatio) {
                this.imageRatio = imageRatio;
                return this;
            }

            /**
             * ImageUuid.
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
             * QuantitativePalette.
             */
            public Builder quantitativePalette(String quantitativePalette) {
                this.quantitativePalette = quantitativePalette;
                return this;
            }

            /**
             * TagsFromImage.
             */
            public Builder tagsFromImage(String tagsFromImage) {
                this.tagsFromImage = tagsFromImage;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
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
             * ImageList.
             */
            public Builder imageList(java.util.List<ImageList> imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
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
