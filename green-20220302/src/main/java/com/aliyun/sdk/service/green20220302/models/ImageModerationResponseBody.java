// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The returned HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The moderation results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned in response to the request.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * The request ID, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImageModerationResponseBody build() {
            return new ImageModerationResponseBody(this);
        } 

    } 

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

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The image library ID.
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * The image library name.
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

            /**
             * The confidence level of the bang recognition result. Valid values: 0 to 100. A higher value indicates a more credible result.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Indicates whether the recognition result of bangs is available.
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

            /**
             * The confidence level of the gender recognition result. Valid values: 0 to 100. A higher value indicates a more credible result.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The gender recognition result. Valid values:
             * <p>
             * 
             * - Male
             * 
             * - FeMale
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

            /**
             * The confidence level of the hairstyle recognition result. Valid values: 0 to 100. A higher value indicates a more credible result.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The hairstyle recognition result. Valid values:
             * <p>
             * 
             * - Bald: bald head.
             * 
             * - Long: Long hair.
             * 
             * - Short: Short hair.
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

            /**
             * The confidence level of the result of wearing the hat. Valid values: 0 to 100. A higher value indicates a more credible result.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The recognition result of whether to wear the hat. Valid values:
             * <p>
             * 
             * - Wear: Wear a hat.
             * 
             * - None: No hat.
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

            /**
             * The height of the face area. Unit: pixels.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * The width of the face area. Unit: pixels.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * The distance from the upper-left corner of the face area to the y-axis with the upper-left corner of the image as the coordinate origin. Unit: pixels.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * The distance from the upper-left corner of the face area to the x-axis with the upper-left corner of the image as the coordinate origin. Unit: pixels.
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

            /**
             * The confidence level of the result of wearing the mask. Valid values: 0 to 100. A higher value indicates a more credible result.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The recognition result of whether to wear a mask. Valid values:
             * <p>
             * 
             * - Wear a mask.
             * 
             *  - None: No mask.
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

            /**
             * The confidence level of the result of the beard. Valid values: 0 to 100. A higher value indicates a more credible result.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The identification result of whether there is a beard.Valid values:
             * <p>
             * 
             * - Has:have a beard.
             * 
             * - None:No beard.
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

            /**
             * The blur of the face image. Valid values: 0 to 100. The higher the score, the more fuzzy it is.
             * <p>
             * Recommended values: 0 to 25.
             */
            public Builder blur(Float blur) {
                this.blur = blur;
                return this;
            }

            /**
             * The integrity of the human face. Recommended values:80 to 100.
             */
            public Builder integrity(Float integrity) {
                this.integrity = integrity;
                return this;
            }

            /**
             * The head-up or head-down angle of the face.
             * <p>
             * Recommended values:-30 to 30.
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * The plane rotation angle of the face.
             * <p>
             * Recommended values:-30 to 30.
             */
            public Builder roll(Float roll) {
                this.roll = roll;
                return this;
            }

            /**
             * The left and right shaking angle of the human face.
             * <p>
             * Recommended values:-30 to 30.
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

            /**
             * The age recognition result.
             */
            public Builder age(Integer age) {
                this.age = age;
                return this;
            }

            /**
             * Indicates whether the recognition result of bangs is available.
             */
            public Builder bang(Bang bang) {
                this.bang = bang;
                return this;
            }

            /**
             * The gender recognition result.
             */
            public Builder gender(Gender gender) {
                this.gender = gender;
                return this;
            }

            /**
             * The recognition result of whether to wear glasses.
             * <p>
             * 
             * - None: No glasses.
             * 
             * - Wear: Wear glasses.
             * 
             * - Sunglass: Wear sunglasses.
             */
            public Builder glasses(String glasses) {
                this.glasses = glasses;
                return this;
            }

            /**
             * The hairstyle recognition result.
             */
            public Builder hairstyle(Hairstyle hairstyle) {
                this.hairstyle = hairstyle;
                return this;
            }

            /**
             * The recognition result of whether to wear a hat.
             */
            public Builder hat(Hat hat) {
                this.hat = hat;
                return this;
            }

            /**
             * The location of the face.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * The recognition result of whether to wear a mask.
             */
            public Builder mask(Mask mask) {
                this.mask = mask;
                return this;
            }

            /**
             * The identification result of whether there is a beard.
             */
            public Builder mustache(Mustache mustache) {
                this.mustache = mustache;
                return this;
            }

            /**
             * The quality information of the face image.
             */
            public Builder quality(Quality quality) {
                this.quality = quality;
                return this;
            }

            /**
             * The smiling degree of the face.
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

            /**
             * The height of the text area, in pixels.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * The width of the text area, in pixels.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the text area and the y-axis, using the upper-left corner of the image as the coordinate origin, in pixels.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper left corner of the text area and the x-axis, with the upper left corner of the image as the coordinate origin, in pixels.
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

            /**
             * The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places. Some labels do not have scores of confidence levels.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Logo category.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Logo name.
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
    public static class LogoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private LogoDataLocation location;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private java.util.List < Logo> logo;

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
        public java.util.List < Logo> getLogo() {
            return this.logo;
        }

        public static final class Builder {
            private LogoDataLocation location; 
            private java.util.List < Logo> logo; 

            /**
             * Location information.
             */
            public Builder location(LogoDataLocation location) {
                this.location = location;
                return this;
            }

            /**
             * Logo information.
             */
            public Builder logo(java.util.List < Logo> logo) {
                this.logo = logo;
                return this;
            }

            public LogoData build() {
                return new LogoData(this);
            } 

        } 

    }
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

            /**
             * The height of the text area, in pixels.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * The width of the text area, in pixels.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the text area and the y-axis, using the upper-left corner of the image as the coordinate origin, in pixels.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper left corner of the text area and the x-axis, with the upper left corner of the image as the coordinate origin, in pixels.
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

            /**
             * Location information.
             */
            public Builder location(OcrResultLocation location) {
                this.location = location;
                return this;
            }

            /**
             * The text information in the recognized image.
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

            /**
             * The height
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * The weight
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X coordinate
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y coordinate
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
    public static class PublicFigure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FigureId")
        private String figureId;

        @com.aliyun.core.annotation.NameInMap("FigureName")
        private String figureName;

        @com.aliyun.core.annotation.NameInMap("Location")
        private java.util.List < PublicFigureLocation> location;

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
        public java.util.List < PublicFigureLocation> getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String figureId; 
            private String figureName; 
            private java.util.List < PublicFigureLocation> location; 

            /**
             * Identified person coding information.
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            /**
             * Identified person name information.
             */
            public Builder figureName(String figureName) {
                this.figureName = figureName;
                return this;
            }

            /**
             * the data array of location info
             */
            public Builder location(java.util.List < PublicFigureLocation> location) {
                this.location = location;
                return this;
            }

            public PublicFigure build() {
                return new PublicFigure(this);
            } 

        } 

    }
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

            /**
             * The category of image recognition.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places. Some labels do not have scores of confidence levels.
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

            /**
             * Custom words, multiple words separated by commas.
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * Custom library ID.
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * Custom library name.
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

            /**
             * The height of the text area, in pixels.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * The width of the text area, in pixels.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the text area and the y-axis, using the upper-left corner of the image as the coordinate origin, in pixels.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper left corner of the text area and the x-axis, with the upper left corner of the image as the coordinate origin, in pixels.
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

            /**
             * Location information.
             */
            public Builder location(TextInImageOcrResultLocation location) {
                this.location = location;
                return this;
            }

            /**
             * The text information in the recognized image.
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
    public static class TextInImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomText")
        private java.util.List < CustomText> customText;

        @com.aliyun.core.annotation.NameInMap("OcrResult")
        private java.util.List < TextInImageOcrResult> ocrResult;

        @com.aliyun.core.annotation.NameInMap("RiskWord")
        private java.util.List < String > riskWord;

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
        public java.util.List < CustomText> getCustomText() {
            return this.customText;
        }

        /**
         * @return ocrResult
         */
        public java.util.List < TextInImageOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        /**
         * @return riskWord
         */
        public java.util.List < String > getRiskWord() {
            return this.riskWord;
        }

        public static final class Builder {
            private java.util.List < CustomText> customText; 
            private java.util.List < TextInImageOcrResult> ocrResult; 
            private java.util.List < String > riskWord; 

            /**
             * When a custom text library is hit, the custom library ID, custom library name, and custom word are returned.
             */
            public Builder customText(java.util.List < CustomText> customText) {
                this.customText = customText;
                return this;
            }

            /**
             * Returns the text information in the recognized image.
             */
            public Builder ocrResult(java.util.List < TextInImageOcrResult> ocrResult) {
                this.ocrResult = ocrResult;
                return this;
            }

            /**
             * The risk words that are hit. Multiple words are separated by commas (,).
             */
            public Builder riskWord(java.util.List < String > riskWord) {
                this.riskWord = riskWord;
                return this;
            }

            public TextInImage build() {
                return new TextInImage(this);
            } 

        } 

    }
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomImage")
        private java.util.List < CustomImage> customImage;

        @com.aliyun.core.annotation.NameInMap("FaceData")
        private java.util.List < FaceData> faceData;

        @com.aliyun.core.annotation.NameInMap("LogoData")
        private java.util.List < LogoData> logoData;

        @com.aliyun.core.annotation.NameInMap("OcrResult")
        private java.util.List < OcrResult> ocrResult;

        @com.aliyun.core.annotation.NameInMap("PublicFigure")
        private java.util.List < PublicFigure> publicFigure;

        @com.aliyun.core.annotation.NameInMap("Recognition")
        private java.util.List < Recognition> recognition;

        @com.aliyun.core.annotation.NameInMap("TextInImage")
        private TextInImage textInImage;

        private Ext(Builder builder) {
            this.customImage = builder.customImage;
            this.faceData = builder.faceData;
            this.logoData = builder.logoData;
            this.ocrResult = builder.ocrResult;
            this.publicFigure = builder.publicFigure;
            this.recognition = builder.recognition;
            this.textInImage = builder.textInImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return customImage
         */
        public java.util.List < CustomImage> getCustomImage() {
            return this.customImage;
        }

        /**
         * @return faceData
         */
        public java.util.List < FaceData> getFaceData() {
            return this.faceData;
        }

        /**
         * @return logoData
         */
        public java.util.List < LogoData> getLogoData() {
            return this.logoData;
        }

        /**
         * @return ocrResult
         */
        public java.util.List < OcrResult> getOcrResult() {
            return this.ocrResult;
        }

        /**
         * @return publicFigure
         */
        public java.util.List < PublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        /**
         * @return recognition
         */
        public java.util.List < Recognition> getRecognition() {
            return this.recognition;
        }

        /**
         * @return textInImage
         */
        public TextInImage getTextInImage() {
            return this.textInImage;
        }

        public static final class Builder {
            private java.util.List < CustomImage> customImage; 
            private java.util.List < FaceData> faceData; 
            private java.util.List < LogoData> logoData; 
            private java.util.List < OcrResult> ocrResult; 
            private java.util.List < PublicFigure> publicFigure; 
            private java.util.List < Recognition> recognition; 
            private TextInImage textInImage; 

            /**
             * If a custom image library is hit, information about the hit custom image library is returned.
             */
            public Builder customImage(java.util.List < CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * The returned face attribute information
             */
            public Builder faceData(java.util.List < FaceData> faceData) {
                this.faceData = faceData;
                return this;
            }

            /**
             * Logo information.
             */
            public Builder logoData(java.util.List < LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * Returns the text information in the recognized image.
             */
            public Builder ocrResult(java.util.List < OcrResult> ocrResult) {
                this.ocrResult = ocrResult;
                return this;
            }

            /**
             * Person information list.
             */
            public Builder publicFigure(java.util.List < PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * The result of image recognition.
             */
            public Builder recognition(java.util.List < Recognition> recognition) {
                this.recognition = recognition;
                return this;
            }

            /**
             * Returns the text information in the hit image.
             */
            public Builder textInImage(TextInImage textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
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

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 

            /**
             * The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places. Some labels do not have scores of confidence levels.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The description of the result.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The labels returned after the image moderation. Multiple risk labels and the corresponding scores of confidence levels may be returned for an image.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.ext = builder.ext;
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
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String dataId; 
            private Ext ext; 
            private java.util.List < Result> result; 
            private String riskLevel; 

            /**
             * The ID of the moderated object.
             * <p>
             * 
             * >  If you specify the dataId parameter in the request, the value of the dataId parameter is returned in the response.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Auxiliary reference information.
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * The results of image moderation parameters such as the label parameter and the confidence parameter, which are an array structure.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Risk Level.
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
