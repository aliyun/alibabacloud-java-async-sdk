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
 * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
 *
 * <p>ImageQueueModerationResponseBody</p>
 */
public class ImageQueueModerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImageQueueModerationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageQueueModerationResponseBody create() {
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

        private Builder(ImageQueueModerationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImageQueueModerationResponseBody build() {
            return new ImageQueueModerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * LibId.
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * LibName.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Value.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Value.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Value.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Value.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Value.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Value.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Blur.
             */
            public Builder blur(Float blur) {
                this.blur = blur;
                return this;
            }

            /**
             * Integrity.
             */
            public Builder integrity(Float integrity) {
                this.integrity = integrity;
                return this;
            }

            /**
             * Pitch.
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * Roll.
             */
            public Builder roll(Float roll) {
                this.roll = roll;
                return this;
            }

            /**
             * Yaw.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Age.
             */
            public Builder age(Integer age) {
                this.age = age;
                return this;
            }

            /**
             * Bang.
             */
            public Builder bang(Bang bang) {
                this.bang = bang;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(Gender gender) {
                this.gender = gender;
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
             * Hairstyle.
             */
            public Builder hairstyle(Hairstyle hairstyle) {
                this.hairstyle = hairstyle;
                return this;
            }

            /**
             * Hat.
             */
            public Builder hat(Hat hat) {
                this.hat = hat;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * Mask.
             */
            public Builder mask(Mask mask) {
                this.mask = mask;
                return this;
            }

            /**
             * Mustache.
             */
            public Builder mustache(Mustache mustache) {
                this.mustache = mustache;
                return this;
            }

            /**
             * Quality.
             */
            public Builder quality(Quality quality) {
                this.quality = quality;
                return this;
            }

            /**
             * Smile.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Location.
             */
            public Builder location(LogoDataLocation location) {
                this.location = location;
                return this;
            }

            /**
             * Logo.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Location.
             */
            public Builder location(OcrResultLocation location) {
                this.location = location;
                return this;
            }

            /**
             * Text.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * FigureId.
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            /**
             * FigureName.
             */
            public Builder figureName(String figureName) {
                this.figureName = figureName;
                return this;
            }

            /**
             * Location.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Classification.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * Confidence.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * KeyWords.
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * LibId.
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * LibName.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Location.
             */
            public Builder location(TextInImageOcrResultLocation location) {
                this.location = location;
                return this;
            }

            /**
             * Text.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * CustomText.
             */
            public Builder customText(java.util.List<CustomText> customText) {
                this.customText = customText;
                return this;
            }

            /**
             * OcrResult.
             */
            public Builder ocrResult(java.util.List<TextInImageOcrResult> ocrResult) {
                this.ocrResult = ocrResult;
                return this;
            }

            /**
             * RiskWord.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * OutputText.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
     */
    public static class Ext extends TeaModel {
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
             * CustomImage.
             */
            public Builder customImage(java.util.List<CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * FaceData.
             */
            public Builder faceData(java.util.List<FaceData> faceData) {
                this.faceData = faceData;
                return this;
            }

            /**
             * LogoData.
             */
            public Builder logoData(java.util.List<LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * OcrResult.
             */
            public Builder ocrResult(java.util.List<OcrResult> ocrResult) {
                this.ocrResult = ocrResult;
                return this;
            }

            /**
             * PublicFigure.
             */
            public Builder publicFigure(java.util.List<PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * Recognition.
             */
            public Builder recognition(java.util.List<Recognition> recognition) {
                this.recognition = recognition;
                return this;
            }

            /**
             * TextInImage.
             */
            public Builder textInImage(TextInImage textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            /**
             * VlContent.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
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
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * RiskLevel.
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
     * {@link ImageQueueModerationResponseBody} extends {@link TeaModel}
     *
     * <p>ImageQueueModerationResponseBody</p>
     */
    public static class Data extends TeaModel {
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
            private String dataId; 
            private Ext ext; 
            private String manualTaskId; 
            private java.util.List<Result> result; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataId = model.dataId;
                this.ext = model.ext;
                this.manualTaskId = model.manualTaskId;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * ManualTaskId.
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * RiskLevel.
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
