// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageQRCodesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageQRCodesResponseBody</p>
 */
public class DetectImageQRCodesResponseBody extends TeaModel {
    @NameInMap("ImageUri")
    private String imageUri;

    @NameInMap("QRCodes")
    private java.util.List < QRCodes> QRCodes;

    @NameInMap("RequestId")
    private String requestId;

    private DetectImageQRCodesResponseBody(Builder builder) {
        this.imageUri = builder.imageUri;
        this.QRCodes = builder.QRCodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageQRCodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return QRCodes
     */
    public java.util.List < QRCodes> getQRCodes() {
        return this.QRCodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageUri; 
        private java.util.List < QRCodes> QRCodes; 
        private String requestId; 

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        /**
         * QRCodes.
         */
        public Builder QRCodes(java.util.List < QRCodes> QRCodes) {
            this.QRCodes = QRCodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageQRCodesResponseBody build() {
            return new DetectImageQRCodesResponseBody(this);
        } 

    } 

    public static class QRCodeBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private QRCodeBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QRCodeBoundary create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public QRCodeBoundary build() {
                return new QRCodeBoundary(this);
            } 

        } 

    }
    public static class QRCodes extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("QRCodeBoundary")
        private QRCodeBoundary QRCodeBoundary;

        private QRCodes(Builder builder) {
            this.content = builder.content;
            this.QRCodeBoundary = builder.QRCodeBoundary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QRCodes create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return QRCodeBoundary
         */
        public QRCodeBoundary getQRCodeBoundary() {
            return this.QRCodeBoundary;
        }

        public static final class Builder {
            private String content; 
            private QRCodeBoundary QRCodeBoundary; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * QRCodeBoundary.
             */
            public Builder QRCodeBoundary(QRCodeBoundary QRCodeBoundary) {
                this.QRCodeBoundary = QRCodeBoundary;
                return this;
            }

            public QRCodes build() {
                return new QRCodes(this);
            } 

        } 

    }
}
