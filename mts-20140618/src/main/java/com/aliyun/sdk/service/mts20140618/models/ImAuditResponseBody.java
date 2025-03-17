// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ImAuditResponseBody model) {
            this.imageQuotaExceed = model.imageQuotaExceed;
            this.imageResults = model.imageResults;
            this.requestId = model.requestId;
            this.textQuotaExceed = model.textQuotaExceed;
            this.textResults = model.textResults;
        } 

        /**
         * <p>Indicates whether the image moderation QPS exceeds the limit. Valid values: true and false. A value of true indicates that the QPS does not exceed the limit. A value of false indicates that the QPS exceeds the limit.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder imageQuotaExceed(Boolean imageQuotaExceed) {
            this.imageQuotaExceed = imageQuotaExceed;
            return this;
        }

        /**
         * <p>The image moderation results. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/268644.html">Data returned by the ImAudit operation</a>.</p>
         */
        public Builder imageResults(ImageResults imageResults) {
            this.imageResults = imageResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5210DBB0-E327-4D45-ADBC-0B83C8793421</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the text moderation QPS exceeds the limit. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder textQuotaExceed(Boolean textQuotaExceed) {
            this.textQuotaExceed = textQuotaExceed;
            return this;
        }

        /**
         * <p>The text moderation results. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/268644.html">Data returned by the ImAudit operation</a>.</p>
         */
        public Builder textResults(TextResults textResults) {
            this.textResults = textResults;
            return this;
        }

        public ImAuditResponseBody build() {
            return new ImAuditResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Frames model) {
                this.rate = model.rate;
                this.url = model.url;
            } 

            /**
             * <p>The score of the confidence level. Valid values: 0 to 100. A higher confidence level indicates higher reliability of the moderation result. We recommend that you do not use this score in your business.</p>
             * 
             * <strong>example:</strong>
             * <p>89.85</p>
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The temporary access URL of the truncated frame. The URL is valid for 5 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/test-01.jpg">http://example.com/test-01.jpg</a></p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HintWordsInfo model) {
                this.context = model.context;
            } 

            /**
             * <p>The term hit by the detected text.</p>
             * 
             * <strong>example:</strong>
             * <p>Sensitive words</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LogoData model) {
                this.h = model.h;
                this.name = model.name;
                this.type = model.type;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the logo area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>106</p>
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The name of the detected logo.</p>
             * 
             * <strong>example:</strong>
             * <p>Hunan TV</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the detected logo. For example, a value of TV indicates a controlled media logo.</p>
             * 
             * <strong>example:</strong>
             * <p>TV</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The width of the logo area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>106</p>
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the logo area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>140</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the logo area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ProgramCodeData model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the mini program code area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>413.0</p>
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the mini program code area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>402.0</p>
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the mini program code area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>11.0</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the mini program code area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(QrcodeLocations model) {
                this.h = model.h;
                this.qrcode = model.qrcode;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the QR code area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>413.0</p>
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The URL that the detected QR code points to.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
             */
            public Builder qrcode(String qrcode) {
                this.qrcode = qrcode;
                return this;
            }

            /**
             * <p>The width of the QR code area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>402.0</p>
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the QR code area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the QR code area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Faces model) {
                this.idid = model.idid;
                this.name = model.name;
                this.re = model.re;
            } 

            /**
             * <p>The ID of the detected face. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>AliFace_0001234</p>
             */
            public Builder idid(String idid) {
                this.idid = idid;
                return this;
            }

            /**
             * <p>This value is a string, which indicates the name of a similar person.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The score of the confidence level. The value is a float point number. Valid values: 0 to 100. A greater value indicates a higher confidence level for facial recognition.</p>
             * 
             * <strong>example:</strong>
             * <p>91.54</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class SfaceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("faces")
        private java.util.List<Faces> faces;

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
        public java.util.List<Faces> getFaces() {
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
            private java.util.List<Faces> faces; 
            private Float h; 
            private Float w; 
            private Float x; 
            private Float y; 

            private Builder() {
            } 

            private Builder(SfaceData model) {
                this.faces = model.faces;
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The information about the face detected in the moderated image.</p>
             */
            public Builder faces(java.util.List<Faces> faces) {
                this.faces = faces;
                return this;
            }

            /**
             * <p>The height of the face area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>121</p>
             */
            public Builder h(Float h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the face area. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder w(Float w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the face area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance between the upper-left corner of the face area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>39</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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
        private java.util.List<Frames> frames;

        @com.aliyun.core.annotation.NameInMap("hintWordsInfo")
        private java.util.List<HintWordsInfo> hintWordsInfo;

        @com.aliyun.core.annotation.NameInMap("logoData")
        private java.util.List<LogoData> logoData;

        @com.aliyun.core.annotation.NameInMap("ocrData")
        private java.util.List<String> ocrData;

        @com.aliyun.core.annotation.NameInMap("programCodeData")
        private java.util.List<ProgramCodeData> programCodeData;

        @com.aliyun.core.annotation.NameInMap("qrcodeData")
        private java.util.List<String> qrcodeData;

        @com.aliyun.core.annotation.NameInMap("qrcodeLocations")
        private java.util.List<QrcodeLocations> qrcodeLocations;

        @com.aliyun.core.annotation.NameInMap("sfaceData")
        private java.util.List<SfaceData> sfaceData;

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
        public java.util.List<Frames> getFrames() {
            return this.frames;
        }

        /**
         * @return hintWordsInfo
         */
        public java.util.List<HintWordsInfo> getHintWordsInfo() {
            return this.hintWordsInfo;
        }

        /**
         * @return logoData
         */
        public java.util.List<LogoData> getLogoData() {
            return this.logoData;
        }

        /**
         * @return ocrData
         */
        public java.util.List<String> getOcrData() {
            return this.ocrData;
        }

        /**
         * @return programCodeData
         */
        public java.util.List<ProgramCodeData> getProgramCodeData() {
            return this.programCodeData;
        }

        /**
         * @return qrcodeData
         */
        public java.util.List<String> getQrcodeData() {
            return this.qrcodeData;
        }

        /**
         * @return qrcodeLocations
         */
        public java.util.List<QrcodeLocations> getQrcodeLocations() {
            return this.qrcodeLocations;
        }

        /**
         * @return sfaceData
         */
        public java.util.List<SfaceData> getSfaceData() {
            return this.sfaceData;
        }

        public static final class Builder {
            private String label; 
            private Double rate; 
            private String scene; 
            private String suggestion; 
            private java.util.List<Frames> frames; 
            private java.util.List<HintWordsInfo> hintWordsInfo; 
            private java.util.List<LogoData> logoData; 
            private java.util.List<String> ocrData; 
            private java.util.List<ProgramCodeData> programCodeData; 
            private java.util.List<String> qrcodeData; 
            private java.util.List<QrcodeLocations> qrcodeLocations; 
            private java.util.List<SfaceData> sfaceData; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
                this.frames = model.frames;
                this.hintWordsInfo = model.hintWordsInfo;
                this.logoData = model.logoData;
                this.ocrData = model.ocrData;
                this.programCodeData = model.programCodeData;
                this.qrcodeData = model.qrcodeData;
                this.qrcodeLocations = model.qrcodeLocations;
                this.sfaceData = model.sfaceData;
            } 

            /**
             * <p>The category of the moderation results. Valid values vary based on the specified moderation scenario.</p>
             * <ul>
             * <li><p>If the Scenes parameter is set to porn, the valid values are:</p>
             * <ul>
             * <li>normal: no pornographic content</li>
             * <li>sexy: sexy content</li>
             * <li>porn: pornographic content</li>
             * </ul>
             * </li>
             * <li><p>If the Scenes parameter is set to terrorism, the valid values are:</p>
             * <ul>
             * <li>normal: no pornographic content</li>
             * <li>bloody: bloody content</li>
             * <li>explosion: explosions and smoke</li>
             * <li>outfit: special costume</li>
             * <li>logo: special logo</li>
             * <li>weapon: weapon</li>
             * <li>politics: political content</li>
             * <li>violence: violence</li>
             * <li>crowd: crowd</li>
             * <li>parade: parade</li>
             * <li>carcrash: car accident</li>
             * <li>flag: flag</li>
             * <li>location: landmark</li>
             * <li>others: other content</li>
             * </ul>
             * </li>
             * <li><p>If the Scenes parameter is set to ad, the valid values are:</p>
             * <ul>
             * <li>normal: no pornographic content</li>
             * <li>ad: ad violation</li>
             * <li>politics: politically sensitive content in text</li>
             * <li>porn: pornographic content in text</li>
             * <li>abuse: abuse in text</li>
             * <li>terrorism: terrorist content in text</li>
             * <li>contraband: prohibited content in text</li>
             * <li>spam: junk content in text</li>
             * <li>npx: illegal ad</li>
             * <li>qrcode: QR code</li>
             * <li>programCode: mini program code</li>
             * </ul>
             * </li>
             * <li><p>If the Scenes parameter is set to qrcode, the valid values are:</p>
             * <ul>
             * <li>normal: no pornographic content</li>
             * <li>qrcode: QR code</li>
             * <li>programCode: mini program code</li>
             * </ul>
             * </li>
             * <li><p>If the Scenes parameter is set to live, the valid values are:</p>
             * <ul>
             * <li>normal: no pornographic content</li>
             * <li>meaningless: no content in the image, such as black or white screen</li>
             * <li>PIP: picture-in-picture</li>
             * <li>smoking: smoking</li>
             * <li>drivelive: live broadcasting in a running vehicle</li>
             * </ul>
             * </li>
             * <li><p>If the Scenes parameter is set to logo, the valid values are:</p>
             * <ul>
             * <li>normal: no pornographic content</li>
             * <li>TV: controlled logo</li>
             * <li>trademark: trademark</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sexy</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score of the confidence level. Valid values: 0 to 100. A greater value indicates a higher confidence level. If a value of pass is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content is normal. If a value of review or block is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content contains violations.</p>
             * <blockquote>
             * <p> This score is for reference only. We strongly recommend that you do not use this score in your business. We recommend that you use the values that are returned for the suggestion, label, and sublabel parameters to determine whether the content contains violations. The sublabel parameter is returned by some operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>91.54</p>
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The image moderation scenario. Valid values:</p>
             * <ul>
             * <li>porn: pornography</li>
             * <li>terrorism: terrorist content</li>
             * <li>ad: ad violation</li>
             * <li>qrcode: QR code</li>
             * <li>live: undesirable scene</li>
             * <li>logo: special logo</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li>pass: The content passes the moderation. No further actions are required.</li>
             * <li>review: The moderation object contains suspected violations and requires human review.</li>
             * <li>block: The moderation object contains violations. We recommend that you delete or block the object.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>If the temporary access URL of the image is too long, a truncated temporary access URL is returned for each frame.</p>
             */
            public Builder frames(java.util.List<Frames> frames) {
                this.frames = frames;
                return this;
            }

            /**
             * <p>The information about the term hit by the ad or violation text detected in the moderated image.</p>
             */
            public Builder hintWordsInfo(java.util.List<HintWordsInfo> hintWordsInfo) {
                this.hintWordsInfo = hintWordsInfo;
                return this;
            }

            /**
             * <p>The information about the logo detected in the moderated image.</p>
             */
            public Builder logoData(java.util.List<LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * <p>ocrData</p>
             */
            public Builder ocrData(java.util.List<String> ocrData) {
                this.ocrData = ocrData;
                return this;
            }

            /**
             * <p>The location information of the mini program code detected in the moderated image.</p>
             */
            public Builder programCodeData(java.util.List<ProgramCodeData> programCodeData) {
                this.programCodeData = programCodeData;
                return this;
            }

            /**
             * <p>The information about the text that is included in the QR code detected in the moderated image.</p>
             */
            public Builder qrcodeData(java.util.List<String> qrcodeData) {
                this.qrcodeData = qrcodeData;
                return this;
            }

            /**
             * <p>The coordinates of the QR code detected in the image.</p>
             */
            public Builder qrcodeLocations(java.util.List<QrcodeLocations> qrcodeLocations) {
                this.qrcodeLocations = qrcodeLocations;
                return this;
            }

            /**
             * <p>The information about the terrorist content detected in the moderated image.</p>
             */
            public Builder sfaceData(java.util.List<SfaceData> sfaceData) {
                this.sfaceData = sfaceData;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Long code;

        @com.aliyun.core.annotation.NameInMap("dataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("extras")
        private java.util.Map<String, ?> extras;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<Results> results;

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
        public java.util.Map<String, ?> getExtras() {
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
        public java.util.List<Results> getResults() {
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
            private java.util.Map<String, ?> extras; 
            private String msg; 
            private java.util.List<Results> results; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.code = model.code;
                this.dataId = model.dataId;
                this.extras = model.extras;
                this.msg = model.msg;
                this.results = model.results;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * <p>The error code. The error code is the same as the HTTP status code. This parameter is not returned if the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the moderated object.</p>
             * <blockquote>
             * <p> If you set the dataId parameter in the moderation request, the dataId parameter is returned in the response.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>uuid-1234-1234-1234</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The additional information about the image. If ad is specified for the Scenes parameter, the following content may be returned for this parameter: hitLibInfo: the information about the custom text library that is hit by the text in the image. The value of this parameter is an array. For more information about the structure, see <a href="https://help.aliyun.com/document_detail/268644.html">hitLibInfo</a>.</p>
             */
            public Builder extras(java.util.Map<String, ?> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The message that is returned for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The returned data. If the call is successful, the array in the returned results contains one or more elements. Each element is a struct.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The ID of the moderation task.</p>
             * 
             * <strong>example:</strong>
             * <p>img4wlJcb7p4wH4lAP3111111-12****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The URL of the moderated object.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/example-****.jpg">http://example.com/example-****.jpg</a></p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class ImageResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

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
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(ImageResults model) {
                this.result = model.result;
            } 

            /**
             * <p>The image moderation results.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public ImageResults build() {
                return new ImageResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class Contexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("libCode")
        private String libCode;

        @com.aliyun.core.annotation.NameInMap("libName")
        private String libName;

        @com.aliyun.core.annotation.NameInMap("positions")
        private java.util.List<String> positions;

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
        public java.util.List<String> getPositions() {
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
            private java.util.List<String> positions; 
            private String ruleType; 

            private Builder() {
            } 

            private Builder(Contexts model) {
                this.context = model.context;
                this.libCode = model.libCode;
                this.libName = model.libName;
                this.positions = model.positions;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The term that the moderated text hits. If the text hits a term, the term is returned. If the text hits the algorithmic model, this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Door-to-door service</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The code of the custom text library. This parameter is returned if the moderated text hits a term in the custom text library.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder libCode(String libCode) {
                this.libCode = libCode;
                return this;
            }

            /**
             * <p>The name of the custom text library. This parameter is returned if the moderated text hits a term in the custom text library.</p>
             * 
             * <strong>example:</strong>
             * <p>Name of your custom text library</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            /**
             * <p>The position of the term that the moderated text hits in the original text.</p>
             */
            public Builder positions(java.util.List<String> positions) {
                this.positions = positions;
                return this;
            }

            /**
             * <p>The behavior rule. This parameter is returned if the moderated text hits the behavior rule. Valid values:</p>
             * <ul>
             * <li>user_id</li>
             * <li>ip</li>
             * <li>umid</li>
             * <li>content</li>
             * <li>similar_content</li>
             * <li>imei</li>
             * <li>imsi</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("contexts")
        private java.util.List<Contexts> contexts;

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
        public java.util.List<Contexts> getContexts() {
            return this.contexts;
        }

        public static final class Builder {
            private String label; 
            private java.util.List<Contexts> contexts; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.label = model.label;
                this.contexts = model.contexts;
            } 

            /**
             * <p>The category of the risky content that the moderated text hits. Valid values:</p>
             * <ul>
             * <li>spam: spam</li>
             * <li>ad: ad</li>
             * <li>politics: political content</li>
             * <li>terrorism: terrorist content</li>
             * <li>abuse: abuse</li>
             * <li>porn: pornographic content</li>
             * <li>flood: excessive junk content</li>
             * <li>contraband: prohibited content</li>
             * <li>meaningless: meaningless content</li>
             * <li>customized: custom content, such as a custom keyword</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The context information of the risky content that the moderated text hits.</p>
             */
            public Builder contexts(java.util.List<Contexts> contexts) {
                this.contexts = contexts;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class ResultResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("details")
        private java.util.List<Details> details;

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
        public java.util.List<Details> getDetails() {
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
            private java.util.List<Details> details; 
            private String label; 
            private Double rate; 
            private String scene; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(ResultResults model) {
                this.details = model.details;
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The risky content that the moderated text hits. A text entry can hit multiple pieces of risky content.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The category of the moderation result for the moderated text. Valid values:</p>
             * <ul>
             * <li>normal: normal content</li>
             * <li>spam: spam</li>
             * <li>ad: ad</li>
             * <li>politics: political content</li>
             * <li>terrorism: terrorist content</li>
             * <li>abuse: abuse</li>
             * <li>porn: pornographic content</li>
             * <li>flood: excessive junk content</li>
             * <li>contraband: prohibited content</li>
             * <li>meaningless: meaningless content</li>
             * <li>customized: custom content, such as a custom keyword</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score of the confidence level. Valid values: 0 to 100. A greater value indicates a higher confidence level. If a value of pass is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content is normal. If a value of review or block is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content contains violations.</p>
             * <blockquote>
             * <p> This score is for reference only. We strongly recommend that you do not use this score in your business. We recommend that you use the values that are returned for the suggestion, label, and sublabel parameters to determine whether the content contains violations. The sublabel parameter is returned by some operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>99.90</p>
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li>pass: The content passes the moderation.</li>
             * <li>review: The content needs to be manually reviewed again.</li>
             * <li>block: The content contains violations. We recommend that you delete or block the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
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
        private java.util.List<ResultResults> results;

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
        public java.util.List<ResultResults> getResults() {
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
            private java.util.List<ResultResults> results; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TextResultsResult model) {
                this.code = model.code;
                this.content = model.content;
                this.dataId = model.dataId;
                this.msg = model.msg;
                this.results = model.results;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The error code. The error code is the same as the HTTP status code. For more information, see <a href="https://help.aliyun.com/document_detail/29254.html">Error codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The text that you specify in the moderation request.</p>
             * 
             * <strong>example:</strong>
             * <p>This is test text.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The sequence number of the text.</p>
             * 
             * <strong>example:</strong>
             * <p>cfd33235-71a4-468b-8137-a5ffe323****</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The message that is returned for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The returned data. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. Each element is a struct.</p>
             */
            public Builder results(java.util.List<ResultResults> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The ID of the moderation task.</p>
             * 
             * <strong>example:</strong>
             * <p>txt6HB8NQoEbU@5fosnj2xVEM-1t****</p>
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
    /**
     * 
     * {@link ImAuditResponseBody} extends {@link TeaModel}
     *
     * <p>ImAuditResponseBody</p>
     */
    public static class TextResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<TextResultsResult> result;

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
        public java.util.List<TextResultsResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<TextResultsResult> result; 

            private Builder() {
            } 

            private Builder(TextResults model) {
                this.result = model.result;
            } 

            /**
             * <p>The text moderation results.</p>
             */
            public Builder result(java.util.List<TextResultsResult> result) {
                this.result = result;
                return this;
            }

            public TextResults build() {
                return new TextResults(this);
            } 

        } 

    }
}
