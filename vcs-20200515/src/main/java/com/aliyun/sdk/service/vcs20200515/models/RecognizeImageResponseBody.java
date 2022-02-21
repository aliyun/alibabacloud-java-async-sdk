// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeImageResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeImageResponseBody</p>
 */
public class RecognizeImageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private RecognizeImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeImageResponseBody create() {
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

        public RecognizeImageResponseBody build() {
            return new RecognizeImageResponseBody(this);
        } 

    } 

    public static class BodyList extends TeaModel {
        @NameInMap("Feature")
        private String feature;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("ImageBaseSixFour")
        private String imageBaseSixFour;

        @NameInMap("LeftTopX")
        private String leftTopX;

        @NameInMap("LeftTopY")
        private String leftTopY;

        @NameInMap("LocalFeature")
        private String localFeature;

        @NameInMap("RespiratorColor")
        private String respiratorColor;

        @NameInMap("RightBottomX")
        private String rightBottomX;

        @NameInMap("RightBottomY")
        private String rightBottomY;

        private BodyList(Builder builder) {
            this.feature = builder.feature;
            this.fileName = builder.fileName;
            this.imageBaseSixFour = builder.imageBaseSixFour;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.localFeature = builder.localFeature;
            this.respiratorColor = builder.respiratorColor;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyList create() {
            return builder().build();
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return imageBaseSixFour
         */
        public String getImageBaseSixFour() {
            return this.imageBaseSixFour;
        }

        /**
         * @return leftTopX
         */
        public String getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public String getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return localFeature
         */
        public String getLocalFeature() {
            return this.localFeature;
        }

        /**
         * @return respiratorColor
         */
        public String getRespiratorColor() {
            return this.respiratorColor;
        }

        /**
         * @return rightBottomX
         */
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public static final class Builder {
            private String feature; 
            private String fileName; 
            private String imageBaseSixFour; 
            private String leftTopX; 
            private String leftTopY; 
            private String localFeature; 
            private String respiratorColor; 
            private String rightBottomX; 
            private String rightBottomY; 

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * ImageBaseSixFour.
             */
            public Builder imageBaseSixFour(String imageBaseSixFour) {
                this.imageBaseSixFour = imageBaseSixFour;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(String leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(String leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * LocalFeature.
             */
            public Builder localFeature(String localFeature) {
                this.localFeature = localFeature;
                return this;
            }

            /**
             * RespiratorColor.
             */
            public Builder respiratorColor(String respiratorColor) {
                this.respiratorColor = respiratorColor;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(String rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(String rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            public BodyList build() {
                return new BodyList(this);
            } 

        } 

    }
    public static class FaceList extends TeaModel {
        @NameInMap("Feature")
        private String feature;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("ImageBaseSixFour")
        private String imageBaseSixFour;

        @NameInMap("KeyPointQuality")
        private Float keyPointQuality;

        @NameInMap("LeftTopX")
        private String leftTopX;

        @NameInMap("LeftTopY")
        private String leftTopY;

        @NameInMap("LocalFeature")
        private String localFeature;

        @NameInMap("Quality")
        private Float quality;

        @NameInMap("RespiratorColor")
        private String respiratorColor;

        @NameInMap("RightBottomX")
        private String rightBottomX;

        @NameInMap("RightBottomY")
        private String rightBottomY;

        private FaceList(Builder builder) {
            this.feature = builder.feature;
            this.fileName = builder.fileName;
            this.imageBaseSixFour = builder.imageBaseSixFour;
            this.keyPointQuality = builder.keyPointQuality;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.localFeature = builder.localFeature;
            this.quality = builder.quality;
            this.respiratorColor = builder.respiratorColor;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceList create() {
            return builder().build();
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return imageBaseSixFour
         */
        public String getImageBaseSixFour() {
            return this.imageBaseSixFour;
        }

        /**
         * @return keyPointQuality
         */
        public Float getKeyPointQuality() {
            return this.keyPointQuality;
        }

        /**
         * @return leftTopX
         */
        public String getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public String getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return localFeature
         */
        public String getLocalFeature() {
            return this.localFeature;
        }

        /**
         * @return quality
         */
        public Float getQuality() {
            return this.quality;
        }

        /**
         * @return respiratorColor
         */
        public String getRespiratorColor() {
            return this.respiratorColor;
        }

        /**
         * @return rightBottomX
         */
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public static final class Builder {
            private String feature; 
            private String fileName; 
            private String imageBaseSixFour; 
            private Float keyPointQuality; 
            private String leftTopX; 
            private String leftTopY; 
            private String localFeature; 
            private Float quality; 
            private String respiratorColor; 
            private String rightBottomX; 
            private String rightBottomY; 

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * ImageBaseSixFour.
             */
            public Builder imageBaseSixFour(String imageBaseSixFour) {
                this.imageBaseSixFour = imageBaseSixFour;
                return this;
            }

            /**
             * KeyPointQuality.
             */
            public Builder keyPointQuality(Float keyPointQuality) {
                this.keyPointQuality = keyPointQuality;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(String leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(String leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * LocalFeature.
             */
            public Builder localFeature(String localFeature) {
                this.localFeature = localFeature;
                return this;
            }

            /**
             * Quality.
             */
            public Builder quality(Float quality) {
                this.quality = quality;
                return this;
            }

            /**
             * RespiratorColor.
             */
            public Builder respiratorColor(String respiratorColor) {
                this.respiratorColor = respiratorColor;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(String rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(String rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            public FaceList build() {
                return new FaceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BodyList")
        private java.util.List < BodyList> bodyList;

        @NameInMap("FaceList")
        private java.util.List < FaceList> faceList;

        private Data(Builder builder) {
            this.bodyList = builder.bodyList;
            this.faceList = builder.faceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bodyList
         */
        public java.util.List < BodyList> getBodyList() {
            return this.bodyList;
        }

        /**
         * @return faceList
         */
        public java.util.List < FaceList> getFaceList() {
            return this.faceList;
        }

        public static final class Builder {
            private java.util.List < BodyList> bodyList; 
            private java.util.List < FaceList> faceList; 

            /**
             * BodyList.
             */
            public Builder bodyList(java.util.List < BodyList> bodyList) {
                this.bodyList = bodyList;
                return this;
            }

            /**
             * FaceList.
             */
            public Builder faceList(java.util.List < FaceList> faceList) {
                this.faceList = faceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
