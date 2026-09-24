// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link AiTryOnResponseBody} extends {@link TeaModel}
 *
 * <p>AiTryOnResponseBody</p>
 */
public class AiTryOnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AiTryOnResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiTryOnResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AiTryOnResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Used to uniquely identify a request.</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AiTryOnResponseBody build() {
            return new AiTryOnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AiTryOnResponseBody} extends {@link TeaModel}
     *
     * <p>AiTryOnResponseBody</p>
     */
    public static class UsageMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessedImageCount")
        private Long processedImageCount;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        private UsageMap(Builder builder) {
            this.processedImageCount = builder.processedImageCount;
            this.resolution = builder.resolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageMap create() {
            return builder().build();
        }

        /**
         * @return processedImageCount
         */
        public Long getProcessedImageCount() {
            return this.processedImageCount;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        public static final class Builder {
            private Long processedImageCount; 
            private String resolution; 

            private Builder() {
            } 

            private Builder(UsageMap model) {
                this.processedImageCount = model.processedImageCount;
                this.resolution = model.resolution;
            } 

            /**
             * <p>The number of processed images.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processedImageCount(Long processedImageCount) {
                this.processedImageCount = processedImageCount;
                return this;
            }

            /**
             * <p>The resolution of the processed image.</p>
             * 
             * <strong>example:</strong>
             * <p>1K</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            public UsageMap build() {
                return new UsageMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiTryOnResponseBody} extends {@link TeaModel}
     *
     * <p>AiTryOnResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageHeight")
        private String imageHeight;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ImageWidth")
        private String imageWidth;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private UsageMap usageMap;

        private Data(Builder builder) {
            this.imageHeight = builder.imageHeight;
            this.imageUrl = builder.imageUrl;
            this.imageWidth = builder.imageWidth;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageHeight
         */
        public String getImageHeight() {
            return this.imageHeight;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return imageWidth
         */
        public String getImageWidth() {
            return this.imageWidth;
        }

        /**
         * @return usageMap
         */
        public UsageMap getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private String imageHeight; 
            private String imageUrl; 
            private String imageWidth; 
            private UsageMap usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.imageHeight = model.imageHeight;
                this.imageUrl = model.imageUrl;
                this.imageWidth = model.imageWidth;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The height of the result image, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1360</p>
             */
            public Builder imageHeight(String imageHeight) {
                this.imageHeight = imageHeight;
                return this;
            }

            /**
             * <p>The URL of the virtual try-on result image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/virtual-try-on-result.png">https://example.com/virtual-try-on-result.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The width of the result image, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>768</p>
             */
            public Builder imageWidth(String imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            /**
             * <p>The usage details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessedImageCount&quot;:1,&quot;Resolution&quot;:&quot;1K&quot;}</p>
             */
            public Builder usageMap(UsageMap usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
