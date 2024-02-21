// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteImagesResponseBody</p>
 */
public class DeleteImagesResponseBody extends TeaModel {
    @NameInMap("ImageResponses")
    private ImageResponses imageResponses;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteImagesResponseBody(Builder builder) {
        this.imageResponses = builder.imageResponses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageResponses
     */
    public ImageResponses getImageResponses() {
        return this.imageResponses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageResponses imageResponses; 
        private String requestId; 

        /**
         * Details about images that are deleted.
         */
        public Builder imageResponses(ImageResponses imageResponses) {
            this.imageResponses = imageResponses;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteImagesResponseBody build() {
            return new DeleteImagesResponseBody(this);
        } 

    } 

    public static class ImageResponse extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("Message")
        private String message;

        private ImageResponse(Builder builder) {
            this.code = builder.code;
            this.imageId = builder.imageId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResponse create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String imageId; 
            private String message; 

            /**
             * The HTTP status code that is returned when the image is deleted.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the image that is requested for deletion.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The message that is returned when the image is deleted.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ImageResponse build() {
                return new ImageResponse(this);
            } 

        } 

    }
    public static class ImageResponses extends TeaModel {
        @NameInMap("ImageResponse")
        private java.util.List < ImageResponse> imageResponse;

        private ImageResponses(Builder builder) {
            this.imageResponse = builder.imageResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResponses create() {
            return builder().build();
        }

        /**
         * @return imageResponse
         */
        public java.util.List < ImageResponse> getImageResponse() {
            return this.imageResponse;
        }

        public static final class Builder {
            private java.util.List < ImageResponse> imageResponse; 

            /**
             * ImageResponse.
             */
            public Builder imageResponse(java.util.List < ImageResponse> imageResponse) {
                this.imageResponse = imageResponse;
                return this;
            }

            public ImageResponses build() {
                return new ImageResponses(this);
            } 

        } 

    }
}
