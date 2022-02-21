// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeFaceQualityResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeFaceQualityResponseBody</p>
 */
public class RecognizeFaceQualityResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private RecognizeFaceQualityResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeFaceQualityResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public RecognizeFaceQualityResponseBody build() {
            return new RecognizeFaceQualityResponseBody(this);
        } 

    } 

    public static class Attributes extends TeaModel {
        @NameInMap("FaceQuality")
        private String faceQuality;

        @NameInMap("FaceScore")
        private String faceScore;

        @NameInMap("FaceStyle")
        private String faceStyle;

        @NameInMap("LeftTopX")
        private Integer leftTopX;

        @NameInMap("LeftTopY")
        private Integer leftTopY;

        @NameInMap("RightBottomX")
        private Integer rightBottomX;

        @NameInMap("RightBottomY")
        private Integer rightBottomY;

        @NameInMap("TargetImageStoragePath")
        private String targetImageStoragePath;

        private Attributes(Builder builder) {
            this.faceQuality = builder.faceQuality;
            this.faceScore = builder.faceScore;
            this.faceStyle = builder.faceStyle;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.targetImageStoragePath = builder.targetImageStoragePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return faceQuality
         */
        public String getFaceQuality() {
            return this.faceQuality;
        }

        /**
         * @return faceScore
         */
        public String getFaceScore() {
            return this.faceScore;
        }

        /**
         * @return faceStyle
         */
        public String getFaceStyle() {
            return this.faceStyle;
        }

        /**
         * @return leftTopX
         */
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return rightBottomX
         */
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        /**
         * @return targetImageStoragePath
         */
        public String getTargetImageStoragePath() {
            return this.targetImageStoragePath;
        }

        public static final class Builder {
            private String faceQuality; 
            private String faceScore; 
            private String faceStyle; 
            private Integer leftTopX; 
            private Integer leftTopY; 
            private Integer rightBottomX; 
            private Integer rightBottomY; 
            private String targetImageStoragePath; 

            /**
             * FaceQuality.
             */
            public Builder faceQuality(String faceQuality) {
                this.faceQuality = faceQuality;
                return this;
            }

            /**
             * FaceScore.
             */
            public Builder faceScore(String faceScore) {
                this.faceScore = faceScore;
                return this;
            }

            /**
             * FaceStyle.
             */
            public Builder faceStyle(String faceStyle) {
                this.faceStyle = faceStyle;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(Integer leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(Integer leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(Integer rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(Integer rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            /**
             * TargetImageStoragePath.
             */
            public Builder targetImageStoragePath(String targetImageStoragePath) {
                this.targetImageStoragePath = targetImageStoragePath;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Attributes")
        private Attributes attributes;

        @NameInMap("Description")
        private String description;

        @NameInMap("QualityScore")
        private String qualityScore;

        private Data(Builder builder) {
            this.attributes = builder.attributes;
            this.description = builder.description;
            this.qualityScore = builder.qualityScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public Attributes getAttributes() {
            return this.attributes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return qualityScore
         */
        public String getQualityScore() {
            return this.qualityScore;
        }

        public static final class Builder {
            private Attributes attributes; 
            private String description; 
            private String qualityScore; 

            /**
             * Attributes.
             */
            public Builder attributes(Attributes attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * QualityScore.
             */
            public Builder qualityScore(String qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
