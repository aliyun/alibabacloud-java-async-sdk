// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectQRCodesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectQRCodesResponseBody</p>
 */
public class DetectQRCodesResponseBody extends TeaModel {
    @NameInMap("FailDetails")
    private java.util.List < FailDetails> failDetails;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessDetails")
    private java.util.List < SuccessDetails> successDetails;

    private DetectQRCodesResponseBody(Builder builder) {
        this.failDetails = builder.failDetails;
        this.requestId = builder.requestId;
        this.successDetails = builder.successDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectQRCodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return failDetails
     */
    public java.util.List < FailDetails> getFailDetails() {
        return this.failDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successDetails
     */
    public java.util.List < SuccessDetails> getSuccessDetails() {
        return this.successDetails;
    }

    public static final class Builder {
        private java.util.List < FailDetails> failDetails; 
        private String requestId; 
        private java.util.List < SuccessDetails> successDetails; 

        /**
         * FailDetails.
         */
        public Builder failDetails(java.util.List < FailDetails> failDetails) {
            this.failDetails = failDetails;
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
         * SuccessDetails.
         */
        public Builder successDetails(java.util.List < SuccessDetails> successDetails) {
            this.successDetails = successDetails;
            return this;
        }

        public DetectQRCodesResponseBody build() {
            return new DetectQRCodesResponseBody(this);
        } 

    } 

    public static class FailDetails extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("SrcUri")
        private String srcUri;

        private FailDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.srcUri = builder.srcUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailDetails create() {
            return builder().build();
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
         * @return srcUri
         */
        public String getSrcUri() {
            return this.srcUri;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String srcUri; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * SrcUri.
             */
            public Builder srcUri(String srcUri) {
                this.srcUri = srcUri;
                return this;
            }

            public FailDetails build() {
                return new FailDetails(this);
            } 

        } 

    }
    public static class QRCodesRectangle extends TeaModel {
        @NameInMap("Height")
        private String height;

        @NameInMap("Left")
        private String left;

        @NameInMap("Top")
        private String top;

        @NameInMap("Width")
        private String width;

        private QRCodesRectangle(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QRCodesRectangle create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public String getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public String getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String height; 
            private String left; 
            private String top; 
            private String width; 

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(String top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public QRCodesRectangle build() {
                return new QRCodesRectangle(this);
            } 

        } 

    }
    public static class QRCodes extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("QRCodesRectangle")
        private QRCodesRectangle QRCodesRectangle;

        private QRCodes(Builder builder) {
            this.content = builder.content;
            this.QRCodesRectangle = builder.QRCodesRectangle;
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
         * @return QRCodesRectangle
         */
        public QRCodesRectangle getQRCodesRectangle() {
            return this.QRCodesRectangle;
        }

        public static final class Builder {
            private String content; 
            private QRCodesRectangle QRCodesRectangle; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * QRCodesRectangle.
             */
            public Builder QRCodesRectangle(QRCodesRectangle QRCodesRectangle) {
                this.QRCodesRectangle = QRCodesRectangle;
                return this;
            }

            public QRCodes build() {
                return new QRCodes(this);
            } 

        } 

    }
    public static class SuccessDetails extends TeaModel {
        @NameInMap("QRCodes")
        private java.util.List < QRCodes> QRCodes;

        @NameInMap("SrcUri")
        private String srcUri;

        private SuccessDetails(Builder builder) {
            this.QRCodes = builder.QRCodes;
            this.srcUri = builder.srcUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessDetails create() {
            return builder().build();
        }

        /**
         * @return QRCodes
         */
        public java.util.List < QRCodes> getQRCodes() {
            return this.QRCodes;
        }

        /**
         * @return srcUri
         */
        public String getSrcUri() {
            return this.srcUri;
        }

        public static final class Builder {
            private java.util.List < QRCodes> QRCodes; 
            private String srcUri; 

            /**
             * QRCodes.
             */
            public Builder QRCodes(java.util.List < QRCodes> QRCodes) {
                this.QRCodes = QRCodes;
                return this;
            }

            /**
             * SrcUri.
             */
            public Builder srcUri(String srcUri) {
                this.srcUri = srcUri;
                return this;
            }

            public SuccessDetails build() {
                return new SuccessDetails(this);
            } 

        } 

    }
}
