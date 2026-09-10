// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link ImageModerationResponseBody} extends {@link TeaModel}
 *
 * <p>ImageModerationResponseBody</p>
 */
public class ImageModerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImageModerationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageModerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ImageModerationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The return code. A value of 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The results of the image content moderation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImageModerationResponseBody build() {
            return new ImageModerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class AIGC extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentProducer")
        private String contentProducer;

        @com.aliyun.core.annotation.NameInMap("ContentPropagator")
        private String contentPropagator;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("ProduceID")
        private String produceID;

        @com.aliyun.core.annotation.NameInMap("PropagateID")
        private String propagateID;

        @com.aliyun.core.annotation.NameInMap("ReservedCode1")
        private String reservedCode1;

        @com.aliyun.core.annotation.NameInMap("ReservedCode2")
        private String reservedCode2;

        private AIGC(Builder builder) {
            this.contentProducer = builder.contentProducer;
            this.contentPropagator = builder.contentPropagator;
            this.label = builder.label;
            this.produceID = builder.produceID;
            this.propagateID = builder.propagateID;
            this.reservedCode1 = builder.reservedCode1;
            this.reservedCode2 = builder.reservedCode2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIGC create() {
            return builder().build();
        }

        /**
         * @return contentProducer
         */
        public String getContentProducer() {
            return this.contentProducer;
        }

        /**
         * @return contentPropagator
         */
        public String getContentPropagator() {
            return this.contentPropagator;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return produceID
         */
        public String getProduceID() {
            return this.produceID;
        }

        /**
         * @return propagateID
         */
        public String getPropagateID() {
            return this.propagateID;
        }

        /**
         * @return reservedCode1
         */
        public String getReservedCode1() {
            return this.reservedCode1;
        }

        /**
         * @return reservedCode2
         */
        public String getReservedCode2() {
            return this.reservedCode2;
        }

        public static final class Builder {
            private String contentProducer; 
            private String contentPropagator; 
            private String label; 
            private String produceID; 
            private String propagateID; 
            private String reservedCode1; 
            private String reservedCode2; 

            private Builder() {
            } 

            private Builder(AIGC model) {
                this.contentProducer = model.contentProducer;
                this.contentPropagator = model.contentPropagator;
                this.label = model.label;
                this.produceID = model.produceID;
                this.propagateID = model.propagateID;
                this.reservedCode1 = model.reservedCode1;
                this.reservedCode2 = model.reservedCode2;
            } 

            /**
             * <p>The code or name of the service provider, which identifies the content producer.</p>
             * 
             * <strong>example:</strong>
             * <p>001191******M000100Y43</p>
             */
            public Builder contentProducer(String contentProducer) {
                this.contentProducer = contentProducer;
                return this;
            }

            /**
             * <p>The name, ID, or code of the propagation platform. For services that provide AI-generated content, this can be the same as the value of ContentProducer.</p>
             * 
             * <strong>example:</strong>
             * <p>001191******M000100Y43</p>
             */
            public Builder contentPropagator(String contentPropagator) {
                this.contentPropagator = contentPropagator;
                return this;
            }

            /**
             * <p>Indicates whether the content is generated by artificial intelligence (AI). Valid values:</p>
             * <ul>
             * <li><p>1: The content is generated by AI.</p>
             * </li>
             * <li><p>2: (For distribution platforms only) The content may be generated by AI.</p>
             * </li>
             * <li><p>3: (For distribution platforms only) The content is suspected to be generated by AI.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The content production ID. This is a unique ID used on the production platform to trace the source of synthesized content.</p>
             * 
             * <strong>example:</strong>
             * <p>123******456</p>
             */
            public Builder produceID(String produceID) {
                this.produceID = produceID;
                return this;
            }

            /**
             * <p>The content propagation ID. This is a unique ID that the propagation platform assigns to the distributed synthetic content.</p>
             * 
             * <strong>example:</strong>
             * <p>123******456</p>
             */
            public Builder propagateID(String propagateID) {
                this.propagateID = propagateID;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * <p>This field can store information that the generative service provider uses for security protection to ensure the integrity of content and identities. A hashing mechanism based on ContentProducer and ProduceID can be used to securely store and verify key information.</p>
             * 
             * <strong>example:</strong>
             * <p>d41d**********427e</p>
             */
            public Builder reservedCode1(String reservedCode1) {
                this.reservedCode1 = reservedCode1;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * <p>This field can be used by content distribution service providers for security protection to ensure the integrity of content and identities. A hashing mechanism based on ContentProducer and ProduceID can be used to securely store and verify key information.</p>
             * 
             * <strong>example:</strong>
             * <p>d41d**********427e</p>
             */
            public Builder reservedCode2(String reservedCode2) {
                this.reservedCode2 = reservedCode2;
                return this;
            }

            public AIGC build() {
                return new AIGC(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class AigcData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIGC")
        private AIGC AIGC;

        private AigcData(Builder builder) {
            this.AIGC = builder.AIGC;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AigcData create() {
            return builder().build();
        }

        /**
         * @return AIGC
         */
        public AIGC getAIGC() {
            return this.AIGC;
        }

        public static final class Builder {
            private AIGC AIGC; 

            private Builder() {
            } 

            private Builder(AigcData model) {
                this.AIGC = model.AIGC;
            } 

            /**
             * <p>The detection information for the implicit AIGC identity.</p>
             */
            public Builder AIGC(AIGC AIGC) {
                this.AIGC = AIGC;
                return this;
            }

            public AigcData build() {
                return new AigcData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class CustomImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private CustomImage(Builder builder) {
            this.imageId = builder.imageId;
            this.libId = builder.libId;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomImage create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String imageId; 
            private String libId; 
            private String libName; 

            private Builder() {
            } 

            private Builder(CustomImage model) {
                this.imageId = model.imageId;
                this.libId = model.libId;
                this.libName = model.libName;
            } 

            /**
             * <p>The ID of the hit custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the hit custom image library.</p>
             * 
             * <strong>example:</strong>
             * <p>图库123</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The name of the hit custom image library.</p>
             * 
             * <strong>example:</strong>
             * <p>图库123</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomImage build() {
                return new CustomImage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Bang extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Bang(Builder builder) {
            this.confidence = builder.confidence;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bang create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float confidence; 
            private String value; 

            private Builder() {
            } 

            private Builder(Bang model) {
                this.confidence = model.confidence;
                this.value = model.value;
            } 

            /**
             * <p>The confidence level of the bangs detection. The value ranges from 0 to 100. A higher value indicates a more reliable result.</p>
             * 
             * <strong>example:</strong>
             * <p>81.88</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The detection result for bangs. Valid values:</p>
             * <ul>
             * <li><p>Has: The person has bangs.</p>
             * </li>
             * <li><p>None: The person does not have bangs.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Has</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Bang build() {
                return new Bang(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Gender extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Gender(Builder builder) {
            this.confidence = builder.confidence;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gender create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float confidence; 
            private String value; 

            private Builder() {
            } 

            private Builder(Gender model) {
                this.confidence = model.confidence;
                this.value = model.value;
            } 

            /**
             * <p>The confidence level of the gender detection. The value ranges from 0 to 100. A higher value indicates a more reliable result.</p>
             * 
             * <strong>example:</strong>
             * <p>81.88</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The detected gender. Valid values:</p>
             * <ul>
             * <li><p>Male: male</p>
             * </li>
             * <li><p>FeMale: female</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FeMale</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Gender build() {
                return new Gender(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Hairstyle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Hairstyle(Builder builder) {
            this.confidence = builder.confidence;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hairstyle create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float confidence; 
            private String value; 

            private Builder() {
            } 

            private Builder(Hairstyle model) {
                this.confidence = model.confidence;
                this.value = model.value;
            } 

            /**
             * <p>The confidence level of the hairstyle detection. The value ranges from 0 to 100. A higher value indicates a more reliable result.</p>
             * 
             * <strong>example:</strong>
             * <p>81.88</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The detected hairstyle. Valid values:</p>
             * <ul>
             * <li><p>Bald: bald</p>
             * </li>
             * <li><p>Long: long hair</p>
             * </li>
             * <li><p>Short: short hair</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Short</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Hairstyle build() {
                return new Hairstyle(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Hat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Hat(Builder builder) {
            this.confidence = builder.confidence;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hat create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float confidence; 
            private String value; 

            private Builder() {
            } 

            private Builder(Hat model) {
                this.confidence = model.confidence;
                this.value = model.value;
            } 

            /**
             * <p>The confidence level of the hat detection. The value ranges from 0 to 100. A higher value indicates a more reliable result.</p>
             * 
             * <strong>example:</strong>
             * <p>88.88</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Indicates whether a hat is detected. Valid values:</p>
             * <ul>
             * <li><p>Wear: A hat is worn.</p>
             * </li>
             * <li><p>None: No hat is worn.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Wear</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Hat build() {
                return new Hat(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private Location(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(Location model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the face area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the face area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the face area to the y-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the face area to the x-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>84</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Mask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Mask(Builder builder) {
            this.confidence = builder.confidence;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mask create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float confidence; 
            private String value; 

            private Builder() {
            } 

            private Builder(Mask model) {
                this.confidence = model.confidence;
                this.value = model.value;
            } 

            /**
             * <p>The confidence level of the mask detection. The value ranges from 0 to 100. A higher value indicates a more reliable result.</p>
             * 
             * <strong>example:</strong>
             * <p>99.99</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Indicates whether a mask is worn. Valid values:</p>
             * <ul>
             * <li><p>Wear: A mask is worn.</p>
             * </li>
             * <li><p>None: No mask is worn.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Wear</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Mask build() {
                return new Mask(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Mustache extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Mustache(Builder builder) {
            this.confidence = builder.confidence;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mustache create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float confidence; 
            private String value; 

            private Builder() {
            } 

            private Builder(Mustache model) {
                this.confidence = model.confidence;
                this.value = model.value;
            } 

            /**
             * <p>The confidence level of the mustache detection. The value ranges from 0 to 100. A higher value indicates a more reliable result.</p>
             * 
             * <strong>example:</strong>
             * <p>99.99</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Indicates whether a mustache is present. Valid values:</p>
             * <ul>
             * <li><p>Has: A mustache is present.</p>
             * </li>
             * <li><p>None: No mustache is present.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Has</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Mustache build() {
                return new Mustache(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Quality extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Blur")
        private Float blur;

        @com.aliyun.core.annotation.NameInMap("Integrity")
        private Float integrity;

        @com.aliyun.core.annotation.NameInMap("Pitch")
        private Float pitch;

        @com.aliyun.core.annotation.NameInMap("Roll")
        private Float roll;

        @com.aliyun.core.annotation.NameInMap("Yaw")
        private Float yaw;

        private Quality(Builder builder) {
            this.blur = builder.blur;
            this.integrity = builder.integrity;
            this.pitch = builder.pitch;
            this.roll = builder.roll;
            this.yaw = builder.yaw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quality create() {
            return builder().build();
        }

        /**
         * @return blur
         */
        public Float getBlur() {
            return this.blur;
        }

        /**
         * @return integrity
         */
        public Float getIntegrity() {
            return this.integrity;
        }

        /**
         * @return pitch
         */
        public Float getPitch() {
            return this.pitch;
        }

        /**
         * @return roll
         */
        public Float getRoll() {
            return this.roll;
        }

        /**
         * @return yaw
         */
        public Float getYaw() {
            return this.yaw;
        }

        public static final class Builder {
            private Float blur; 
            private Float integrity; 
            private Float pitch; 
            private Float roll; 
            private Float yaw; 

            private Builder() {
            } 

            private Builder(Quality model) {
                this.blur = model.blur;
                this.integrity = model.integrity;
                this.pitch = model.pitch;
                this.roll = model.roll;
                this.yaw = model.yaw;
            } 

            /**
             * <p>The blurriness of the face image. The value ranges from 0 to 100. A higher score indicates a blurrier image.</p>
             * <p>A value from 0 to 25 is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>5.88</p>
             */
            public Builder blur(Float blur) {
                this.blur = blur;
                return this;
            }

            /**
             * <p>The integrity of the face. The value ranges from 0 to 100. A higher score indicates a more complete face.</p>
             * <p>A value from 80 to 100 is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder integrity(Float integrity) {
                this.integrity = integrity;
                return this;
            }

            /**
             * <p>The pitch angle of the face.</p>
             * <p>A value from -30 to 30 is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>5.88</p>
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * <p>The roll angle of the face.</p>
             * <p>A value from -30 to 30 is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>5.18</p>
             */
            public Builder roll(Float roll) {
                this.roll = roll;
                return this;
            }

            /**
             * <p>The yaw angle of the face.</p>
             * <p>A value from -30 to 30 is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>5.18</p>
             */
            public Builder yaw(Float yaw) {
                this.yaw = yaw;
                return this;
            }

            public Quality build() {
                return new Quality(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class FaceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Age")
        private Integer age;

        @com.aliyun.core.annotation.NameInMap("Bang")
        private Bang bang;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private Gender gender;

        @com.aliyun.core.annotation.NameInMap("Glasses")
        private String glasses;

        @com.aliyun.core.annotation.NameInMap("Hairstyle")
        private Hairstyle hairstyle;

        @com.aliyun.core.annotation.NameInMap("Hat")
        private Hat hat;

        @com.aliyun.core.annotation.NameInMap("Location")
        private Location location;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private Mask mask;

        @com.aliyun.core.annotation.NameInMap("Mustache")
        private Mustache mustache;

        @com.aliyun.core.annotation.NameInMap("Quality")
        private Quality quality;

        @com.aliyun.core.annotation.NameInMap("Smile")
        private Float smile;

        private FaceData(Builder builder) {
            this.age = builder.age;
            this.bang = builder.bang;
            this.gender = builder.gender;
            this.glasses = builder.glasses;
            this.hairstyle = builder.hairstyle;
            this.hat = builder.hat;
            this.location = builder.location;
            this.mask = builder.mask;
            this.mustache = builder.mustache;
            this.quality = builder.quality;
            this.smile = builder.smile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceData create() {
            return builder().build();
        }

        /**
         * @return age
         */
        public Integer getAge() {
            return this.age;
        }

        /**
         * @return bang
         */
        public Bang getBang() {
            return this.bang;
        }

        /**
         * @return gender
         */
        public Gender getGender() {
            return this.gender;
        }

        /**
         * @return glasses
         */
        public String getGlasses() {
            return this.glasses;
        }

        /**
         * @return hairstyle
         */
        public Hairstyle getHairstyle() {
            return this.hairstyle;
        }

        /**
         * @return hat
         */
        public Hat getHat() {
            return this.hat;
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        /**
         * @return mask
         */
        public Mask getMask() {
            return this.mask;
        }

        /**
         * @return mustache
         */
        public Mustache getMustache() {
            return this.mustache;
        }

        /**
         * @return quality
         */
        public Quality getQuality() {
            return this.quality;
        }

        /**
         * @return smile
         */
        public Float getSmile() {
            return this.smile;
        }

        public static final class Builder {
            private Integer age; 
            private Bang bang; 
            private Gender gender; 
            private String glasses; 
            private Hairstyle hairstyle; 
            private Hat hat; 
            private Location location; 
            private Mask mask; 
            private Mustache mustache; 
            private Quality quality; 
            private Float smile; 

            private Builder() {
            } 

            private Builder(FaceData model) {
                this.age = model.age;
                this.bang = model.bang;
                this.gender = model.gender;
                this.glasses = model.glasses;
                this.hairstyle = model.hairstyle;
                this.hat = model.hat;
                this.location = model.location;
                this.mask = model.mask;
                this.mustache = model.mustache;
                this.quality = model.quality;
                this.smile = model.smile;
            } 

            /**
             * <p>The detected age.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder age(Integer age) {
                this.age = age;
                return this;
            }

            /**
             * <p>The detection result for bangs.</p>
             */
            public Builder bang(Bang bang) {
                this.bang = bang;
                return this;
            }

            /**
             * <p>The gender detection result.</p>
             */
            public Builder gender(Gender gender) {
                this.gender = gender;
                return this;
            }

            /**
             * <p>Indicates whether the person is wearing glasses. Valid values:</p>
             * <ul>
             * <li><p>None: The person is not wearing glasses.</p>
             * </li>
             * <li><p>Common: The person is wearing regular glasses.</p>
             * </li>
             * <li><p>Sunglass: The person is wearing sunglasses.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder glasses(String glasses) {
                this.glasses = glasses;
                return this;
            }

            /**
             * <p>The hairstyle detection result.</p>
             */
            public Builder hairstyle(Hairstyle hairstyle) {
                this.hairstyle = hairstyle;
                return this;
            }

            /**
             * <p>The result of hat detection.</p>
             */
            public Builder hat(Hat hat) {
                this.hat = hat;
                return this;
            }

            /**
             * <p>The location of the face.</p>
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The result of mask detection.</p>
             */
            public Builder mask(Mask mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The result of mustache detection.</p>
             */
            public Builder mustache(Mustache mustache) {
                this.mustache = mustache;
                return this;
            }

            /**
             * <p>The quality of the face image.</p>
             */
            public Builder quality(Quality quality) {
                this.quality = quality;
                return this;
            }

            /**
             * <p>The degree of the smile. The value ranges from 0 to 100. A higher score indicates a wider smile.</p>
             * 
             * <strong>example:</strong>
             * <p>85.88</p>
             */
            public Builder smile(Float smile) {
                this.smile = smile;
                return this;
            }

            public FaceData build() {
                return new FaceData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class LogoDataLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private LogoDataLocation(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoDataLocation create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(LogoDataLocation model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the detected area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>440</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the detected area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>330</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the detected area to the y-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the detected area to the x-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public LogoDataLocation build() {
                return new LogoDataLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Logo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Logo(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logo create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Float confidence; 
            private String label; 
            private String name; 

            private Builder() {
            } 

            private Builder(Logo model) {
                this.confidence = model.confidence;
                this.label = model.label;
                this.name = model.name;
            } 

            /**
             * <p>The confidence score. The value ranges from 0 to 100, with two decimal places retained.</p>
             * 
             * <strong>example:</strong>
             * <p>99.1</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The identity category.</p>
             * 
             * <strong>example:</strong>
             * <p>logo_sns</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The identity name.</p>
             * 
             * <strong>example:</strong>
             * <p>钉钉</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Logo build() {
                return new Logo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class LogoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private LogoDataLocation location;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private java.util.List<Logo> logo;

        private LogoData(Builder builder) {
            this.location = builder.location;
            this.logo = builder.logo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoData create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public LogoDataLocation getLocation() {
            return this.location;
        }

        /**
         * @return logo
         */
        public java.util.List<Logo> getLogo() {
            return this.logo;
        }

        public static final class Builder {
            private LogoDataLocation location; 
            private java.util.List<Logo> logo; 

            private Builder() {
            } 

            private Builder(LogoData model) {
                this.location = model.location;
                this.logo = model.logo;
            } 

            /**
             * <p>The location of the logo.</p>
             */
            public Builder location(LogoDataLocation location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The identity information.</p>
             */
            public Builder logo(java.util.List<Logo> logo) {
                this.logo = logo;
                return this;
            }

            public LogoData build() {
                return new LogoData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class OcrResultLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private OcrResultLocation(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OcrResultLocation create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(OcrResultLocation model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the text area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the text area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the text area to the y-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the text area to the x-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public OcrResultLocation build() {
                return new OcrResultLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class OcrResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private OcrResultLocation location;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private OcrResult(Builder builder) {
            this.location = builder.location;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OcrResult create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public OcrResultLocation getLocation() {
            return this.location;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private OcrResultLocation location; 
            private String text; 

            private Builder() {
            } 

            private Builder(OcrResult model) {
                this.location = model.location;
                this.text = model.text;
            } 

            /**
             * <p>The coordinates of the text line.</p>
             */
            public Builder location(OcrResultLocation location) {
                this.location = location;
                return this;
            }

            /**
             * <p>A single line of recognized text.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public OcrResult build() {
                return new OcrResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class PublicFigureLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private PublicFigureLocation(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicFigureLocation create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(PublicFigureLocation model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the detected area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>440</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the detected area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>330</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the detected area to the y-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the detected area to the x-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public PublicFigureLocation build() {
                return new PublicFigureLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class PublicFigure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FigureId")
        private String figureId;

        @com.aliyun.core.annotation.NameInMap("FigureName")
        private String figureName;

        @com.aliyun.core.annotation.NameInMap("Location")
        private java.util.List<PublicFigureLocation> location;

        private PublicFigure(Builder builder) {
            this.figureId = builder.figureId;
            this.figureName = builder.figureName;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicFigure create() {
            return builder().build();
        }

        /**
         * @return figureId
         */
        public String getFigureId() {
            return this.figureId;
        }

        /**
         * @return figureName
         */
        public String getFigureName() {
            return this.figureName;
        }

        /**
         * @return location
         */
        public java.util.List<PublicFigureLocation> getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String figureId; 
            private String figureName; 
            private java.util.List<PublicFigureLocation> location; 

            private Builder() {
            } 

            private Builder(PublicFigure model) {
                this.figureId = model.figureId;
                this.figureName = model.figureName;
                this.location = model.location;
            } 

            /**
             * <p>The ID of the detected public figure.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx001</p>
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            /**
             * <p>The name of the detected public figure.</p>
             * 
             * <strong>example:</strong>
             * <p>yzazhzou</p>
             */
            public Builder figureName(String figureName) {
                this.figureName = figureName;
                return this;
            }

            /**
             * <p>The location of the identity.</p>
             */
            public Builder location(java.util.List<PublicFigureLocation> location) {
                this.location = location;
                return this;
            }

            public PublicFigure build() {
                return new PublicFigure(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Recognition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classification")
        private String classification;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        private Recognition(Builder builder) {
            this.classification = builder.classification;
            this.confidence = builder.confidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recognition create() {
            return builder().build();
        }

        /**
         * @return classification
         */
        public String getClassification() {
            return this.classification;
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        public static final class Builder {
            private String classification; 
            private Float confidence; 

            private Builder() {
            } 

            private Builder(Recognition model) {
                this.classification = model.classification;
                this.confidence = model.confidence;
            } 

            /**
             * <p>The category of the recognized object in the image.</p>
             * 
             * <strong>example:</strong>
             * <p>办公大楼</p>
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * <p>The confidence level. The value ranges from 0 to 100, with two decimal places retained. No confidence level is returned when the value is nonLabel.</p>
             * 
             * <strong>example:</strong>
             * <p>81.22</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            public Recognition build() {
                return new Recognition(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class CustomText extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private String keyWords;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private CustomText(Builder builder) {
            this.keyWords = builder.keyWords;
            this.libId = builder.libId;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomText create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public String getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String keyWords; 
            private String libId; 
            private String libName; 

            private Builder() {
            } 

            private Builder(CustomText model) {
                this.keyWords = model.keyWords;
                this.libId = model.libId;
                this.libName = model.libName;
            } 

            /**
             * <p>The custom words. Separate multiple words with commas.</p>
             * 
             * <strong>example:</strong>
             * <p>自定义词1,自定义词2</p>
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>The custom library ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The name of the custom library.</p>
             * 
             * <strong>example:</strong>
             * <p>自定义库1</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomText build() {
                return new CustomText(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class TextInImageOcrResultLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private TextInImageOcrResultLocation(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextInImageOcrResultLocation create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(TextInImageOcrResultLocation model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the text area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the text area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the text area to the y-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the text area to the x-axis. The origin is the upper-left corner of the image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public TextInImageOcrResultLocation build() {
                return new TextInImageOcrResultLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class TextInImageOcrResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private TextInImageOcrResultLocation location;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private TextInImageOcrResult(Builder builder) {
            this.location = builder.location;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextInImageOcrResult create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public TextInImageOcrResultLocation getLocation() {
            return this.location;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private TextInImageOcrResultLocation location; 
            private String text; 

            private Builder() {
            } 

            private Builder(TextInImageOcrResult model) {
                this.location = model.location;
                this.text = model.text;
            } 

            /**
             * <p>The coordinates of the text line.</p>
             */
            public Builder location(TextInImageOcrResultLocation location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The text.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public TextInImageOcrResult build() {
                return new TextInImageOcrResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class TextInImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomText")
        private java.util.List<CustomText> customText;

        @com.aliyun.core.annotation.NameInMap("OcrResult")
        private java.util.List<TextInImageOcrResult> ocrResult;

        @com.aliyun.core.annotation.NameInMap("RiskWord")
        private java.util.List<String> riskWord;

        private TextInImage(Builder builder) {
            this.customText = builder.customText;
            this.ocrResult = builder.ocrResult;
            this.riskWord = builder.riskWord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextInImage create() {
            return builder().build();
        }

        /**
         * @return customText
         */
        public java.util.List<CustomText> getCustomText() {
            return this.customText;
        }

        /**
         * @return ocrResult
         */
        public java.util.List<TextInImageOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        /**
         * @return riskWord
         */
        public java.util.List<String> getRiskWord() {
            return this.riskWord;
        }

        public static final class Builder {
            private java.util.List<CustomText> customText; 
            private java.util.List<TextInImageOcrResult> ocrResult; 
            private java.util.List<String> riskWord; 

            private Builder() {
            } 

            private Builder(TextInImage model) {
                this.customText = model.customText;
                this.ocrResult = model.ocrResult;
                this.riskWord = model.riskWord;
            } 

            /**
             * <p>If a custom text library is hit, the custom library ID, custom library name, and custom word are returned.</p>
             */
            public Builder customText(java.util.List<CustomText> customText) {
                this.customText = customText;
                return this;
            }

            /**
             * <p>Each line of text recognized in the image.</p>
             */
            public Builder ocrResult(java.util.List<TextInImageOcrResult> ocrResult) {
                this.ocrResult = ocrResult;
                return this;
            }

            /**
             * <p>The hit threat keywords.</p>
             */
            public Builder riskWord(java.util.List<String> riskWord) {
                this.riskWord = riskWord;
                return this;
            }

            public TextInImage build() {
                return new TextInImage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class VlContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputText")
        private String outputText;

        private VlContent(Builder builder) {
            this.outputText = builder.outputText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VlContent create() {
            return builder().build();
        }

        /**
         * @return outputText
         */
        public String getOutputText() {
            return this.outputText;
        }

        public static final class Builder {
            private String outputText; 

            private Builder() {
            } 

            private Builder(VlContent model) {
                this.outputText = model.outputText;
            } 

            /**
             * <p>The output content.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一段描述</p>
             */
            public Builder outputText(String outputText) {
                this.outputText = outputText;
                return this;
            }

            public VlContent build() {
                return new VlContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AigcData")
        private AigcData aigcData;

        @com.aliyun.core.annotation.NameInMap("CustomImage")
        private java.util.List<CustomImage> customImage;

        @com.aliyun.core.annotation.NameInMap("FaceData")
        private java.util.List<FaceData> faceData;

        @com.aliyun.core.annotation.NameInMap("LogoData")
        private java.util.List<LogoData> logoData;

        @com.aliyun.core.annotation.NameInMap("OcrResult")
        private java.util.List<OcrResult> ocrResult;

        @com.aliyun.core.annotation.NameInMap("PublicFigure")
        private java.util.List<PublicFigure> publicFigure;

        @com.aliyun.core.annotation.NameInMap("Recognition")
        private java.util.List<Recognition> recognition;

        @com.aliyun.core.annotation.NameInMap("TextInImage")
        private TextInImage textInImage;

        @com.aliyun.core.annotation.NameInMap("VlContent")
        private VlContent vlContent;

        private Ext(Builder builder) {
            this.aigcData = builder.aigcData;
            this.customImage = builder.customImage;
            this.faceData = builder.faceData;
            this.logoData = builder.logoData;
            this.ocrResult = builder.ocrResult;
            this.publicFigure = builder.publicFigure;
            this.recognition = builder.recognition;
            this.textInImage = builder.textInImage;
            this.vlContent = builder.vlContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return aigcData
         */
        public AigcData getAigcData() {
            return this.aigcData;
        }

        /**
         * @return customImage
         */
        public java.util.List<CustomImage> getCustomImage() {
            return this.customImage;
        }

        /**
         * @return faceData
         */
        public java.util.List<FaceData> getFaceData() {
            return this.faceData;
        }

        /**
         * @return logoData
         */
        public java.util.List<LogoData> getLogoData() {
            return this.logoData;
        }

        /**
         * @return ocrResult
         */
        public java.util.List<OcrResult> getOcrResult() {
            return this.ocrResult;
        }

        /**
         * @return publicFigure
         */
        public java.util.List<PublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        /**
         * @return recognition
         */
        public java.util.List<Recognition> getRecognition() {
            return this.recognition;
        }

        /**
         * @return textInImage
         */
        public TextInImage getTextInImage() {
            return this.textInImage;
        }

        /**
         * @return vlContent
         */
        public VlContent getVlContent() {
            return this.vlContent;
        }

        public static final class Builder {
            private AigcData aigcData; 
            private java.util.List<CustomImage> customImage; 
            private java.util.List<FaceData> faceData; 
            private java.util.List<LogoData> logoData; 
            private java.util.List<OcrResult> ocrResult; 
            private java.util.List<PublicFigure> publicFigure; 
            private java.util.List<Recognition> recognition; 
            private TextInImage textInImage; 
            private VlContent vlContent; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.aigcData = model.aigcData;
                this.customImage = model.customImage;
                this.faceData = model.faceData;
                this.logoData = model.logoData;
                this.ocrResult = model.ocrResult;
                this.publicFigure = model.publicFigure;
                this.recognition = model.recognition;
                this.textInImage = model.textInImage;
                this.vlContent = model.vlContent;
            } 

            /**
             * <p>The detection information for the implicit AIGC identity in the image.</p>
             */
            public Builder aigcData(AigcData aigcData) {
                this.aigcData = aigcData;
                return this;
            }

            /**
             * <p>A list of hits from the custom image library.</p>
             */
            public Builder customImage(java.util.List<CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * <p>The facial attribute detection results.</p>
             */
            public Builder faceData(java.util.List<FaceData> faceData) {
                this.faceData = faceData;
                return this;
            }

            /**
             * <p>The identity information.</p>
             */
            public Builder logoData(java.util.List<LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * <p>The results of optical character recognition (OCR).</p>
             */
            public Builder ocrResult(java.util.List<OcrResult> ocrResult) {
                this.ocrResult = ocrResult;
                return this;
            }

            /**
             * <p>A list of public figures.</p>
             */
            public Builder publicFigure(java.util.List<PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * <p>The results of image object recognition.</p>
             */
            public Builder recognition(java.util.List<Recognition> recognition) {
                this.recognition = recognition;
                return this;
            }

            /**
             * <p>The text information that is hit in the image.</p>
             */
            public Builder textInImage(TextInImage textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            /**
             * <p>The output content.</p>
             */
            public Builder vlContent(VlContent vlContent) {
                this.vlContent = vlContent;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The confidence level. The value ranges from 0 to 100, with two decimal places retained. Some labels do not have a confidence level.</p>
             * 
             * <strong>example:</strong>
             * <p>81.22</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>未检测出风险</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label returned after the image content is moderated. Multiple labels and scores may be returned for a single image.</p>
             * 
             * <strong>example:</strong>
             * <p>violent_explosion</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The threat level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageModerationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("ManualTaskId")
        private String manualTaskId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.dataId = builder.dataId;
            this.ext = builder.ext;
            this.manualTaskId = builder.manualTaskId;
            this.result = builder.result;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return manualTaskId
         */
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String accountId; 
            private String dataId; 
            private Ext ext; 
            private String manualTaskId; 
            private java.util.List<Result> result; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.dataId = model.dataId;
                this.ext = model.ext;
                this.manualTaskId = model.manualTaskId;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The AccountId specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>testaccountid123</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The data ID of the detected object.</p>
             * <blockquote>
             * <p>If you specify the dataId parameter in the request, the corresponding dataId is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fb5ffab1-993b-449f-b8d6-b97d5e3331f2</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>Auxiliary reference information for the image.</p>
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The ID of the manual review task.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx-xxxxx</p>
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
                return this;
            }

            /**
             * <p>The results of the image moderation, including the threat labels and confidence levels. The value is an array.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The threat level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
