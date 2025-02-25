// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectFaceAttributesResponseBody</p>
 */
public class DetectFaceAttributesResponseBody extends TeaModel {
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

    private DetectFaceAttributesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectFaceAttributesResponseBody create() {
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

        public DetectFaceAttributesResponseBody build() {
            return new DetectFaceAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class Headpose extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PitchAngle")
        private Float pitchAngle;

        @com.aliyun.core.annotation.NameInMap("RollAngle")
        private Float rollAngle;

        @com.aliyun.core.annotation.NameInMap("YawAngle")
        private Float yawAngle;

        private Headpose(Builder builder) {
            this.pitchAngle = builder.pitchAngle;
            this.rollAngle = builder.rollAngle;
            this.yawAngle = builder.yawAngle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headpose create() {
            return builder().build();
        }

        /**
         * @return pitchAngle
         */
        public Float getPitchAngle() {
            return this.pitchAngle;
        }

        /**
         * @return rollAngle
         */
        public Float getRollAngle() {
            return this.rollAngle;
        }

        /**
         * @return yawAngle
         */
        public Float getYawAngle() {
            return this.yawAngle;
        }

        public static final class Builder {
            private Float pitchAngle; 
            private Float rollAngle; 
            private Float yawAngle; 

            /**
             * PitchAngle.
             */
            public Builder pitchAngle(Float pitchAngle) {
                this.pitchAngle = pitchAngle;
                return this;
            }

            /**
             * RollAngle.
             */
            public Builder rollAngle(Float rollAngle) {
                this.rollAngle = rollAngle;
                return this;
            }

            /**
             * YawAngle.
             */
            public Builder yawAngle(Float yawAngle) {
                this.yawAngle = yawAngle;
                return this;
            }

            public Headpose build() {
                return new Headpose(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class Smiling extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private Smiling(Builder builder) {
            this.threshold = builder.threshold;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Smiling create() {
            return builder().build();
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float threshold; 
            private Float value; 

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Smiling build() {
                return new Smiling(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class FaceAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Blur")
        private Float blur;

        @com.aliyun.core.annotation.NameInMap("Facequal")
        private Float facequal;

        @com.aliyun.core.annotation.NameInMap("Facetype")
        private String facetype;

        @com.aliyun.core.annotation.NameInMap("Glasses")
        private String glasses;

        @com.aliyun.core.annotation.NameInMap("Headpose")
        private Headpose headpose;

        @com.aliyun.core.annotation.NameInMap("Integrity")
        private Integer integrity;

        @com.aliyun.core.annotation.NameInMap("Respirator")
        private String respirator;

        @com.aliyun.core.annotation.NameInMap("Smiling")
        private Smiling smiling;

        private FaceAttributes(Builder builder) {
            this.blur = builder.blur;
            this.facequal = builder.facequal;
            this.facetype = builder.facetype;
            this.glasses = builder.glasses;
            this.headpose = builder.headpose;
            this.integrity = builder.integrity;
            this.respirator = builder.respirator;
            this.smiling = builder.smiling;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceAttributes create() {
            return builder().build();
        }

        /**
         * @return blur
         */
        public Float getBlur() {
            return this.blur;
        }

        /**
         * @return facequal
         */
        public Float getFacequal() {
            return this.facequal;
        }

        /**
         * @return facetype
         */
        public String getFacetype() {
            return this.facetype;
        }

        /**
         * @return glasses
         */
        public String getGlasses() {
            return this.glasses;
        }

        /**
         * @return headpose
         */
        public Headpose getHeadpose() {
            return this.headpose;
        }

        /**
         * @return integrity
         */
        public Integer getIntegrity() {
            return this.integrity;
        }

        /**
         * @return respirator
         */
        public String getRespirator() {
            return this.respirator;
        }

        /**
         * @return smiling
         */
        public Smiling getSmiling() {
            return this.smiling;
        }

        public static final class Builder {
            private Float blur; 
            private Float facequal; 
            private String facetype; 
            private String glasses; 
            private Headpose headpose; 
            private Integer integrity; 
            private String respirator; 
            private Smiling smiling; 

            /**
             * Blur.
             */
            public Builder blur(Float blur) {
                this.blur = blur;
                return this;
            }

            /**
             * Facequal.
             */
            public Builder facequal(Float facequal) {
                this.facequal = facequal;
                return this;
            }

            /**
             * Facetype.
             */
            public Builder facetype(String facetype) {
                this.facetype = facetype;
                return this;
            }

            /**
             * Glasses.
             */
            public Builder glasses(String glasses) {
                this.glasses = glasses;
                return this;
            }

            /**
             * Headpose.
             */
            public Builder headpose(Headpose headpose) {
                this.headpose = headpose;
                return this;
            }

            /**
             * Integrity.
             */
            public Builder integrity(Integer integrity) {
                this.integrity = integrity;
                return this;
            }

            /**
             * Respirator.
             */
            public Builder respirator(String respirator) {
                this.respirator = respirator;
                return this;
            }

            /**
             * Smiling.
             */
            public Builder smiling(Smiling smiling) {
                this.smiling = smiling;
                return this;
            }

            public FaceAttributes build() {
                return new FaceAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class FaceRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Integer top;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private FaceRect(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceRect create() {
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

            public FaceRect build() {
                return new FaceRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class FaceAttributesDetectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceAttributes")
        private FaceAttributes faceAttributes;

        @com.aliyun.core.annotation.NameInMap("FaceRect")
        private FaceRect faceRect;

        private FaceAttributesDetectInfo(Builder builder) {
            this.faceAttributes = builder.faceAttributes;
            this.faceRect = builder.faceRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceAttributesDetectInfo create() {
            return builder().build();
        }

        /**
         * @return faceAttributes
         */
        public FaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        /**
         * @return faceRect
         */
        public FaceRect getFaceRect() {
            return this.faceRect;
        }

        public static final class Builder {
            private FaceAttributes faceAttributes; 
            private FaceRect faceRect; 

            /**
             * FaceAttributes.
             */
            public Builder faceAttributes(FaceAttributes faceAttributes) {
                this.faceAttributes = faceAttributes;
                return this;
            }

            /**
             * FaceRect.
             */
            public Builder faceRect(FaceRect faceRect) {
                this.faceRect = faceRect;
                return this;
            }

            public FaceAttributesDetectInfo build() {
                return new FaceAttributesDetectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class FaceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceAttributesDetectInfo")
        private java.util.List<FaceAttributesDetectInfo> faceAttributesDetectInfo;

        private FaceInfos(Builder builder) {
            this.faceAttributesDetectInfo = builder.faceAttributesDetectInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceInfos create() {
            return builder().build();
        }

        /**
         * @return faceAttributesDetectInfo
         */
        public java.util.List<FaceAttributesDetectInfo> getFaceAttributesDetectInfo() {
            return this.faceAttributesDetectInfo;
        }

        public static final class Builder {
            private java.util.List<FaceAttributesDetectInfo> faceAttributesDetectInfo; 

            /**
             * FaceAttributesDetectInfo.
             */
            public Builder faceAttributesDetectInfo(java.util.List<FaceAttributesDetectInfo> faceAttributesDetectInfo) {
                this.faceAttributesDetectInfo = faceAttributesDetectInfo;
                return this;
            }

            public FaceInfos build() {
                return new FaceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetectFaceAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DetectFaceAttributesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceInfos")
        private FaceInfos faceInfos;

        @com.aliyun.core.annotation.NameInMap("ImgHeight")
        private Integer imgHeight;

        @com.aliyun.core.annotation.NameInMap("ImgWidth")
        private Integer imgWidth;

        private Data(Builder builder) {
            this.faceInfos = builder.faceInfos;
            this.imgHeight = builder.imgHeight;
            this.imgWidth = builder.imgWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return faceInfos
         */
        public FaceInfos getFaceInfos() {
            return this.faceInfos;
        }

        /**
         * @return imgHeight
         */
        public Integer getImgHeight() {
            return this.imgHeight;
        }

        /**
         * @return imgWidth
         */
        public Integer getImgWidth() {
            return this.imgWidth;
        }

        public static final class Builder {
            private FaceInfos faceInfos; 
            private Integer imgHeight; 
            private Integer imgWidth; 

            /**
             * FaceInfos.
             */
            public Builder faceInfos(FaceInfos faceInfos) {
                this.faceInfos = faceInfos;
                return this;
            }

            /**
             * ImgHeight.
             */
            public Builder imgHeight(Integer imgHeight) {
                this.imgHeight = imgHeight;
                return this;
            }

            /**
             * ImgWidth.
             */
            public Builder imgWidth(Integer imgWidth) {
                this.imgWidth = imgWidth;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
