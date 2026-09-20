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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * ProcessedImageCount.
             */
            public Builder processedImageCount(Long processedImageCount) {
                this.processedImageCount = processedImageCount;
                return this;
            }

            /**
             * Resolution.
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
             * ImageHeight.
             */
            public Builder imageHeight(String imageHeight) {
                this.imageHeight = imageHeight;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * ImageWidth.
             */
            public Builder imageWidth(String imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            /**
             * UsageMap.
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
