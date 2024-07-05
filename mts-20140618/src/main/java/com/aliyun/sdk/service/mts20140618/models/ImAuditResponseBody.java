// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImAuditResponseBody} extends {@link TeaModel}
 *
 * <p>ImAuditResponseBody</p>
 */
public class ImAuditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageQuotaExceed")
    private Boolean imageQuotaExceed;

    @com.aliyun.core.annotation.NameInMap("ImageResults")
    private ImageResults imageResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TextQuotaExceed")
    private Boolean textQuotaExceed;

    @com.aliyun.core.annotation.NameInMap("TextResults")
    private TextResults textResults;

    private ImAuditResponseBody(Builder builder) {
        this.imageQuotaExceed = builder.imageQuotaExceed;
        this.imageResults = builder.imageResults;
        this.requestId = builder.requestId;
        this.textQuotaExceed = builder.textQuotaExceed;
        this.textResults = builder.textResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImAuditResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageQuotaExceed
     */
    public Boolean getImageQuotaExceed() {
        return this.imageQuotaExceed;
    }

    /**
     * @return imageResults
     */
    public ImageResults getImageResults() {
        return this.imageResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return textQuotaExceed
     */
    public Boolean getTextQuotaExceed() {
        return this.textQuotaExceed;
    }

    /**
     * @return textResults
     */
    public TextResults getTextResults() {
        return this.textResults;
    }

    public static final class Builder {
        private Boolean imageQuotaExceed; 
        private ImageResults imageResults; 
        private String requestId; 
        private Boolean textQuotaExceed; 
        private TextResults textResults; 

        /**
         * Indicates whether the image moderation QPS exceeds the limit. Valid values: true and false. A value of true indicates that the QPS does not exceed the limit. A value of false indicates that the QPS exceeds the limit.
         */
        public Builder imageQuotaExceed(Boolean imageQuotaExceed) {
            this.imageQuotaExceed = imageQuotaExceed;
            return this;
        }

        /**
         * The image moderation results. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. For more information about the parameters, see [Data returned by the ImAudit operation](~~268644~~).
         */
        public Builder imageResults(ImageResults imageResults) {
            this.imageResults = imageResults;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the text moderation QPS exceeds the limit. Valid values: true and false.
         */
        public Builder textQuotaExceed(Boolean textQuotaExceed) {
            this.textQuotaExceed = textQuotaExceed;
            return this;
        }

        /**
         * The text moderation results. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. For more information about the parameters, see [Data returned by the ImAudit operation](~~268644~~).
         */
        public Builder textResults(TextResults textResults) {
            this.textResults = textResults;
            return this;
        }

        public ImAuditResponseBody build() {
            return new ImAuditResponseBody(this);
        } 

    } 

    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rate")
        private Float rate;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Frames(Builder builder) {
            this.rate = builder.rate;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Frames create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Float rate; 
            private String url; 

            /**
             * The score of the confidence level. Valid values: 0 to 100. A higher confidence level indicates higher reliability of the moderation result. We recommend that you do not use this score in your business.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The temporary access URL of the truncated frame. The URL is valid for 5 minutes.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Frames build() {
                return new Frames(this);
            } 

        } 

    }
    public static class HintWordsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("context")
        private String context;

        private HintWordsInfo(Builder builder) {
            this.context = builder.context;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HintWordsInfo create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        public static final class Builder {
            private String context; 

            /**
             * The term hit by the detected text.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            public HintWordsInfo build() {
                return new HintWordsInfo(this);
            } 

        } 

    }
    public static class LogoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private Float h;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("w")
        private Float w;

        @com.aliyun.core.annotation.NameInMap("x")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Float y;

        private LogoData(Builder builder) {
            this.h = builder.h;
            this.name = builder.name;
            this.type = builder.type;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoData create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Float getH() {
            return this.h;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return w
         */
        public Float getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Float h; 
            private String name; 
            private String type; 
            private Float w; 
            private Float x; 
            private Float y; 

            /**
             * The height of the logo area. Unit: pixel.
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * The name of the detected logo.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the detected logo. For example, a value of TV indicates a controlled media logo.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The width of the logo area. Unit: pixel.
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the logo area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper-left corner of the logo area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public LogoData build() {
                return new LogoData(this);
            } 

        } 

    }
    public static class ProgramCodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private Float h;

        @com.aliyun.core.annotation.NameInMap("w")
        private Float w;

        @com.aliyun.core.annotation.NameInMap("x")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Float y;

        private ProgramCodeData(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgramCodeData create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Float getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Float getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Float h; 
            private Float w; 
            private Float x; 
            private Float y; 

            /**
             * The height of the mini program code area. Unit: pixel.
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * The width of the mini program code area. Unit: pixel.
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the mini program code area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper-left corner of the mini program code area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public ProgramCodeData build() {
                return new ProgramCodeData(this);
            } 

        } 

    }
    public static class QrcodeLocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private Float h;

        @com.aliyun.core.annotation.NameInMap("qrcode")
        private String qrcode;

        @com.aliyun.core.annotation.NameInMap("w")
        private Float w;

        @com.aliyun.core.annotation.NameInMap("x")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Float y;

        private QrcodeLocations(Builder builder) {
            this.h = builder.h;
            this.qrcode = builder.qrcode;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrcodeLocations create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Float getH() {
            return this.h;
        }

        /**
         * @return qrcode
         */
        public String getQrcode() {
            return this.qrcode;
        }

        /**
         * @return w
         */
        public Float getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Float h; 
            private String qrcode; 
            private Float w; 
            private Float x; 
            private Float y; 

            /**
             * The height of the QR code area. Unit: pixel.
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * The URL that the detected QR code points to.
             */
            public Builder qrcode(String qrcode) {
                this.qrcode = qrcode;
                return this;
            }

            /**
             * The width of the QR code area. Unit: pixel.
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the QR code area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper-left corner of the QR code area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public QrcodeLocations build() {
                return new QrcodeLocations(this);
            } 

        } 

    }
    public static class Faces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("idid")
        private String idid;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("re")
        private Float re;

        private Faces(Builder builder) {
            this.idid = builder.idid;
            this.name = builder.name;
            this.re = builder.re;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Faces create() {
            return builder().build();
        }

        /**
         * @return idid
         */
        public String getIdid() {
            return this.idid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return re
         */
        public Float getRe() {
            return this.re;
        }

        public static final class Builder {
            private String idid; 
            private String name; 
            private Float re; 

            /**
             * The ID of the detected face. The value is a string.
             */
            public Builder idid(String idid) {
                this.idid = idid;
                return this;
            }

            /**
             * This value is a string, which indicates the name of a similar person.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The score of the confidence level. The value is a float point number. Valid values: 0 to 100. A greater value indicates a higher confidence level for facial recognition.
             */
            public Builder re(Float re) {
                this.re = re;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
    public static class SfaceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("faces")
        private java.util.List < Faces> faces;

        @com.aliyun.core.annotation.NameInMap("h")
        private Float h;

        @com.aliyun.core.annotation.NameInMap("w")
        private Float w;

        @com.aliyun.core.annotation.NameInMap("x")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Float y;

        private SfaceData(Builder builder) {
            this.faces = builder.faces;
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SfaceData create() {
            return builder().build();
        }

        /**
         * @return faces
         */
        public java.util.List < Faces> getFaces() {
            return this.faces;
        }

        /**
         * @return h
         */
        public Float getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Float getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.List < Faces> faces; 
            private Float h; 
            private Float w; 
            private Float x; 
            private Float y; 

            /**
             * The information about the face detected in the moderated image.
             */
            public Builder faces(java.util.List < Faces> faces) {
                this.faces = faces;
                return this;
            }

            /**
             * The height of the face area. Unit: pixel.
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * The width of the face area. Unit: pixel.
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * The distance between the upper-left corner of the face area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * The distance between the upper-left corner of the face area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public SfaceData build() {
                return new SfaceData(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("frames")
        private java.util.List < Frames> frames;

        @com.aliyun.core.annotation.NameInMap("hintWordsInfo")
        private java.util.List < HintWordsInfo> hintWordsInfo;

        @com.aliyun.core.annotation.NameInMap("logoData")
        private java.util.List < LogoData> logoData;

        @com.aliyun.core.annotation.NameInMap("ocrData")
        private java.util.List < String > ocrData;

        @com.aliyun.core.annotation.NameInMap("programCodeData")
        private java.util.List < ProgramCodeData> programCodeData;

        @com.aliyun.core.annotation.NameInMap("qrcodeData")
        private java.util.List < String > qrcodeData;

        @com.aliyun.core.annotation.NameInMap("qrcodeLocations")
        private java.util.List < QrcodeLocations> qrcodeLocations;

        @com.aliyun.core.annotation.NameInMap("sfaceData")
        private java.util.List < SfaceData> sfaceData;

        private Results(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
            this.frames = builder.frames;
            this.hintWordsInfo = builder.hintWordsInfo;
            this.logoData = builder.logoData;
            this.ocrData = builder.ocrData;
            this.programCodeData = builder.programCodeData;
            this.qrcodeData = builder.qrcodeData;
            this.qrcodeLocations = builder.qrcodeLocations;
            this.sfaceData = builder.sfaceData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return frames
         */
        public java.util.List < Frames> getFrames() {
            return this.frames;
        }

        /**
         * @return hintWordsInfo
         */
        public java.util.List < HintWordsInfo> getHintWordsInfo() {
            return this.hintWordsInfo;
        }

        /**
         * @return logoData
         */
        public java.util.List < LogoData> getLogoData() {
            return this.logoData;
        }

        /**
         * @return ocrData
         */
        public java.util.List < String > getOcrData() {
            return this.ocrData;
        }

        /**
         * @return programCodeData
         */
        public java.util.List < ProgramCodeData> getProgramCodeData() {
            return this.programCodeData;
        }

        /**
         * @return qrcodeData
         */
        public java.util.List < String > getQrcodeData() {
            return this.qrcodeData;
        }

        /**
         * @return qrcodeLocations
         */
        public java.util.List < QrcodeLocations> getQrcodeLocations() {
            return this.qrcodeLocations;
        }

        /**
         * @return sfaceData
         */
        public java.util.List < SfaceData> getSfaceData() {
            return this.sfaceData;
        }

        public static final class Builder {
            private String label; 
            private Double rate; 
            private String scene; 
            private String suggestion; 
            private java.util.List < Frames> frames; 
            private java.util.List < HintWordsInfo> hintWordsInfo; 
            private java.util.List < LogoData> logoData; 
            private java.util.List < String > ocrData; 
            private java.util.List < ProgramCodeData> programCodeData; 
            private java.util.List < String > qrcodeData; 
            private java.util.List < QrcodeLocations> qrcodeLocations; 
            private java.util.List < SfaceData> sfaceData; 

            /**
             * The category of the moderation results. Valid values vary based on the specified moderation scenario.
             * <p>
             * 
             * *   If the Scenes parameter is set to porn, the valid values are:
             * 
             *     *   normal: no pornographic content
             *     *   sexy: sexy content
             *     *   porn: pornographic content
             * 
             * *   If the Scenes parameter is set to terrorism, the valid values are:
             * 
             *     *   normal: no pornographic content
             *     *   bloody: bloody content
             *     *   explosion: explosions and smoke
             *     *   outfit: special costume
             *     *   logo: special logo
             *     *   weapon: weapon
             *     *   politics: political content
             *     *   violence: violence
             *     *   crowd: crowd
             *     *   parade: parade
             *     *   carcrash: car accident
             *     *   flag: flag
             *     *   location: landmark
             *     *   others: other content
             * 
             * *   If the Scenes parameter is set to ad, the valid values are:
             * 
             *     *   normal: no pornographic content
             *     *   ad: ad violation
             *     *   politics: politically sensitive content in text
             *     *   porn: pornographic content in text
             *     *   abuse: abuse in text
             *     *   terrorism: terrorist content in text
             *     *   contraband: prohibited content in text
             *     *   spam: junk content in text
             *     *   npx: illegal ad
             *     *   qrcode: QR code
             *     *   programCode: mini program code
             * 
             * *   If the Scenes parameter is set to qrcode, the valid values are:
             * 
             *     *   normal: no pornographic content
             *     *   qrcode: QR code
             *     *   programCode: mini program code
             * 
             * *   If the Scenes parameter is set to live, the valid values are:
             * 
             *     *   normal: no pornographic content
             *     *   meaningless: no content in the image, such as black or white screen
             *     *   PIP: picture-in-picture
             *     *   smoking: smoking
             *     *   drivelive: live broadcasting in a running vehicle
             * 
             * *   If the Scenes parameter is set to logo, the valid values are:
             * 
             *     *   normal: no pornographic content
             *     *   TV: controlled logo
             *     *   trademark: trademark
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the confidence level. Valid values: 0 to 100. A greater value indicates a higher confidence level. If a value of pass is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content is normal. If a value of review or block is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content contains violations.
             * <p>
             * 
             * >  This score is for reference only. We strongly recommend that you do not use this score in your business. We recommend that you use the values that are returned for the suggestion, label, and sublabel parameters to determine whether the content contains violations. The sublabel parameter is returned by some operations.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The image moderation scenario. Valid values:
             * <p>
             * 
             * *   porn: pornography
             * *   terrorism: terrorist content
             * *   ad: ad violation
             * *   qrcode: QR code
             * *   live: undesirable scene
             * *   logo: special logo
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   pass: The content passes the moderation. No further actions are required.
             * *   review: The moderation object contains suspected violations and requires human review.
             * *   block: The moderation object contains violations. We recommend that you delete or block the object.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * If the temporary access URL of the image is too long, a truncated temporary access URL is returned for each frame.
             */
            public Builder frames(java.util.List < Frames> frames) {
                this.frames = frames;
                return this;
            }

            /**
             * The information about the term hit by the ad or violation text detected in the moderated image.
             */
            public Builder hintWordsInfo(java.util.List < HintWordsInfo> hintWordsInfo) {
                this.hintWordsInfo = hintWordsInfo;
                return this;
            }

            /**
             * The information about the logo detected in the moderated image.
             */
            public Builder logoData(java.util.List < LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * ocrData
             */
            public Builder ocrData(java.util.List < String > ocrData) {
                this.ocrData = ocrData;
                return this;
            }

            /**
             * The location information of the mini program code detected in the moderated image.
             */
            public Builder programCodeData(java.util.List < ProgramCodeData> programCodeData) {
                this.programCodeData = programCodeData;
                return this;
            }

            /**
             * The information about the text that is included in the QR code detected in the moderated image.
             */
            public Builder qrcodeData(java.util.List < String > qrcodeData) {
                this.qrcodeData = qrcodeData;
                return this;
            }

            /**
             * The coordinates of the QR code detected in the image.
             */
            public Builder qrcodeLocations(java.util.List < QrcodeLocations> qrcodeLocations) {
                this.qrcodeLocations = qrcodeLocations;
                return this;
            }

            /**
             * The information about the terrorist content detected in the moderated image.
             */
            public Builder sfaceData(java.util.List < SfaceData> sfaceData) {
                this.sfaceData = sfaceData;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Long code;

        @com.aliyun.core.annotation.NameInMap("dataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("extras")
        private java.util.Map < String, ? > extras;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List < Results> results;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Result(Builder builder) {
            this.code = builder.code;
            this.dataId = builder.dataId;
            this.extras = builder.extras;
            this.msg = builder.msg;
            this.results = builder.results;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return extras
         */
        public java.util.Map < String, ? > getExtras() {
            return this.extras;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long code; 
            private String dataId; 
            private java.util.Map < String, ? > extras; 
            private String msg; 
            private java.util.List < Results> results; 
            private String taskId; 
            private String url; 

            /**
             * The error code. The error code is the same as the HTTP status code. This parameter is not returned if the request is successful.
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the moderated object.
             * <p>
             * 
             * >  If you set the dataId parameter in the moderation request, the dataId parameter is returned in the response.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The additional information about the image. If ad is specified for the Scenes parameter, the following content may be returned for this parameter: hitLibInfo: the information about the custom text library that is hit by the text in the image. The value of this parameter is an array. For more information about the structure, see [hitLibInfo](~~268644~~).
             */
            public Builder extras(java.util.Map < String, ? > extras) {
                this.extras = extras;
                return this;
            }

            /**
             * The message that is returned for the request.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The returned data. If the call is successful, the array in the returned results contains one or more elements. Each element is a struct.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * The ID of the moderation task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The URL of the moderated object.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class ImageResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List < Result> result;

        private ImageResults(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResults create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * The image moderation results.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public ImageResults build() {
                return new ImageResults(this);
            } 

        } 

    }
    public static class Contexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("libCode")
        private String libCode;

        @com.aliyun.core.annotation.NameInMap("libName")
        private String libName;

        @com.aliyun.core.annotation.NameInMap("positions")
        private java.util.List < String > positions;

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

        private Contexts(Builder builder) {
            this.context = builder.context;
            this.libCode = builder.libCode;
            this.libName = builder.libName;
            this.positions = builder.positions;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contexts create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return libCode
         */
        public String getLibCode() {
            return this.libCode;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        /**
         * @return positions
         */
        public java.util.List < String > getPositions() {
            return this.positions;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String context; 
            private String libCode; 
            private String libName; 
            private java.util.List < String > positions; 
            private String ruleType; 

            /**
             * The term that the moderated text hits. If the text hits a term, the term is returned. If the text hits the algorithmic model, this parameter is not returned.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * The code of the custom text library. This parameter is returned if the moderated text hits a term in the custom text library.
             */
            public Builder libCode(String libCode) {
                this.libCode = libCode;
                return this;
            }

            /**
             * The name of the custom text library. This parameter is returned if the moderated text hits a term in the custom text library.
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            /**
             * The position of the term that the moderated text hits in the original text.
             */
            public Builder positions(java.util.List < String > positions) {
                this.positions = positions;
                return this;
            }

            /**
             * The behavior rule. This parameter is returned if the moderated text hits the behavior rule. Valid values:
             * <p>
             * 
             * *   user_id
             * *   ip
             * *   umid
             * *   content
             * *   similar_content
             * *   imei
             * *   imsi
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public Contexts build() {
                return new Contexts(this);
            } 

        } 

    }
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("contexts")
        private java.util.List < Contexts> contexts;

        private Details(Builder builder) {
            this.label = builder.label;
            this.contexts = builder.contexts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return contexts
         */
        public java.util.List < Contexts> getContexts() {
            return this.contexts;
        }

        public static final class Builder {
            private String label; 
            private java.util.List < Contexts> contexts; 

            /**
             * The category of the risky content that the moderated text hits. Valid values:
             * <p>
             * 
             * *   spam: spam
             * *   ad: ad
             * *   politics: political content
             * *   terrorism: terrorist content
             * *   abuse: abuse
             * *   porn: pornographic content
             * *   flood: excessive junk content
             * *   contraband: prohibited content
             * *   meaningless: meaningless content
             * *   customized: custom content, such as a custom keyword
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The context information of the risky content that the moderated text hits.
             */
            public Builder contexts(java.util.List < Contexts> contexts) {
                this.contexts = contexts;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class ResultResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("details")
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("suggestion")
        private String suggestion;

        private ResultResults(Builder builder) {
            this.details = builder.details;
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResults create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private String label; 
            private Double rate; 
            private String scene; 
            private String suggestion; 

            /**
             * The risky content that the moderated text hits. A text entry can hit multiple pieces of risky content.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * The category of the moderation result for the moderated text. Valid values:
             * <p>
             * 
             * *   normal: normal content
             * *   spam: spam
             * *   ad: ad
             * *   politics: political content
             * *   terrorism: terrorist content
             * *   abuse: abuse
             * *   porn: pornographic content
             * *   flood: excessive junk content
             * *   contraband: prohibited content
             * *   meaningless: meaningless content
             * *   customized: custom content, such as a custom keyword
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the confidence level. Valid values: 0 to 100. A greater value indicates a higher confidence level. If a value of pass is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content is normal. If a value of review or block is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content contains violations.
             * <p>
             * 
             * >  This score is for reference only. We strongly recommend that you do not use this score in your business. We recommend that you use the values that are returned for the suggestion, label, and sublabel parameters to determine whether the content contains violations. The sublabel parameter is returned by some operations.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   pass: The content passes the moderation.
             * *   review: The content needs to be manually reviewed again.
             * *   block: The content contains violations. We recommend that you delete or block the content.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public ResultResults build() {
                return new ResultResults(this);
            } 

        } 

    }
    public static class TextResultsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Long code;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("dataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List < ResultResults> results;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private TextResultsResult(Builder builder) {
            this.code = builder.code;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.msg = builder.msg;
            this.results = builder.results;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextResultsResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return results
         */
        public java.util.List < ResultResults> getResults() {
            return this.results;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long code; 
            private String content; 
            private String dataId; 
            private String msg; 
            private java.util.List < ResultResults> results; 
            private String taskId; 

            /**
             * The error code. The error code is the same as the HTTP status code. For more information, see [Error codes](~~29254~~).
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * The text that you specify in the moderation request.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The sequence number of the text.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The message that is returned for the request.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The returned data. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. Each element is a struct.
             */
            public Builder results(java.util.List < ResultResults> results) {
                this.results = results;
                return this;
            }

            /**
             * The ID of the moderation task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TextResultsResult build() {
                return new TextResultsResult(this);
            } 

        } 

    }
    public static class TextResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List < TextResultsResult> result;

        private TextResults(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextResults create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < TextResultsResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < TextResultsResult> result; 

            /**
             * The text moderation results.
             */
            public Builder result(java.util.List < TextResultsResult> result) {
                this.result = result;
                return this;
            }

            public TextResults build() {
                return new TextResults(this);
            } 

        } 

    }
}
