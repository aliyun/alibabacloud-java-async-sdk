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
 * {@link ImageUpscaleResponseBody} extends {@link TeaModel}
 *
 * <p>ImageUpscaleResponseBody</p>
 */
public class ImageUpscaleResponseBody extends TeaModel {
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

    private ImageUpscaleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageUpscaleResponseBody create() {
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

        private Builder(ImageUpscaleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code, such as success.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result struct information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message or error prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImageUpscaleResponseBody build() {
            return new ImageUpscaleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageUpscaleResponseBody} extends {@link TeaModel}
     *
     * <p>ImageUpscaleResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageHeight")
        private Integer imageHeight;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ImageWidth")
        private Integer imageWidth;

        private DataData(Builder builder) {
            this.imageHeight = builder.imageHeight;
            this.imageUrl = builder.imageUrl;
            this.imageWidth = builder.imageWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return imageHeight
         */
        public Integer getImageHeight() {
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
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public static final class Builder {
            private Integer imageHeight; 
            private String imageUrl; 
            private Integer imageWidth; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.imageHeight = model.imageHeight;
                this.imageUrl = model.imageUrl;
                this.imageWidth = model.imageWidth;
            } 

            /**
             * <p>The actual height of the generated image.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder imageHeight(Integer imageHeight) {
                this.imageHeight = imageHeight;
                return this;
            }

            /**
             * <p>The result information of the upscaled single image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/output.png">https://example.com/output.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The actual width of the generated image.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder imageWidth(Integer imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageUpscaleResponseBody} extends {@link TeaModel}
     *
     * <p>ImageUpscaleResponseBody</p>
     */
    public static class UsageMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessedImageCount")
        private Integer processedImageCount;

        private UsageMap(Builder builder) {
            this.processedImageCount = builder.processedImageCount;
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
        public Integer getProcessedImageCount() {
            return this.processedImageCount;
        }

        public static final class Builder {
            private Integer processedImageCount; 

            private Builder() {
            } 

            private Builder(UsageMap model) {
                this.processedImageCount = model.processedImageCount;
            } 

            /**
             * <p>The number of processed images.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processedImageCount(Integer processedImageCount) {
                this.processedImageCount = processedImageCount;
                return this;
            }

            public UsageMap build() {
                return new UsageMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageUpscaleResponseBody} extends {@link TeaModel}
     *
     * <p>ImageUpscaleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private DataData data;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private UsageMap usageMap;

        private Data(Builder builder) {
            this.data = builder.data;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public DataData getData() {
            return this.data;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return usageMap
         */
        public UsageMap getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private DataData data; 
            private String errorCode; 
            private String errorMessage; 
            private Boolean success; 
            private String taskId; 
            private UsageMap usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.success = model.success;
                this.taskId = model.taskId;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The high-definition upscaling result data.</p>
             */
            public Builder data(DataData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The error code returned when the call fails, such as InvalidParameter or DownstreamUnavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The ID of the downstream task. This parameter is left empty for synchronous API calls.</p>
             * 
             * <strong>example:</strong>
             * <p>ed9d8504-6141-9fbb-8345-4fa36433483f</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The usage information.</p>
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
