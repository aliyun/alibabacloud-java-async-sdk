// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditResultTimelineResponseBody</p>
 */
public class GetMediaAuditResultTimelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaAuditResultTimeline")
    private MediaAuditResultTimeline mediaAuditResultTimeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaAuditResultTimelineResponseBody(Builder builder) {
        this.mediaAuditResultTimeline = builder.mediaAuditResultTimeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditResultTimelineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaAuditResultTimeline
     */
    public MediaAuditResultTimeline getMediaAuditResultTimeline() {
        return this.mediaAuditResultTimeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaAuditResultTimeline mediaAuditResultTimeline; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMediaAuditResultTimelineResponseBody model) {
            this.mediaAuditResultTimeline = model.mediaAuditResultTimeline;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection of automated review result timelines.</p>
         */
        public Builder mediaAuditResultTimeline(MediaAuditResultTimeline mediaAuditResultTimeline) {
            this.mediaAuditResultTimeline = mediaAuditResultTimeline;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6438BD76-D523-46FC-956F-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditResultTimelineResponseBody build() {
            return new GetMediaAuditResultTimelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultTimelineResponseBody</p>
     */
    public static class Ad extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Ad(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ad create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Ad model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The classification of the advertisement detection result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal.</li>
             * <li><strong>ad</strong>: other advertisements.</li>
             * <li><strong>politics</strong>: text contains political content.</li>
             * <li><strong>porn</strong>: text contains pornographic content.</li>
             * <li><strong>abuse</strong>: text contains abusive content.</li>
             * <li><strong>terrorism</strong>: text contains terrorism-related content.</li>
             * <li><strong>contraband</strong>: text contains prohibited content.</li>
             * <li><strong>spam</strong>: text contains other spam content.</li>
             * <li><strong>npx</strong>: psoriasis advertisements.</li>
             * <li><strong>qrcode</strong>: contains a QR code.</li>
             * <li><strong>programCode</strong>: contains a mini program code.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ad</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The hit score of the video screenshot for the advertisement detection result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position of the video screenshot in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultTimelineResponseBody</p>
     */
    public static class Live extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Live(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Live create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Live model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The classification of the undesirable content detection result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal.</li>
             * <li><strong>meaningless</strong>: no content in the image (such as a black screen or white screen).</li>
             * <li><strong>PIP</strong>: Picture-in-Picture (PiP).</li>
             * <li><strong>smoking</strong>: smoking.</li>
             * <li><strong>drivelive</strong>: in-car live streaming.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>smoking</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The hit score of the video screenshot for the undesirable content detection result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position of the video screenshot in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Live build() {
                return new Live(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultTimelineResponseBody</p>
     */
    public static class Logo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Logo(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logo create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Logo model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The classification of the logo detection result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal.</li>
             * <li><strong>TV</strong>: contains a regulated logo.</li>
             * <li><strong>trademark</strong>: contains a trademark.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The hit score of the video screenshot for the logo detection result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position of the video screenshot in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Logo build() {
                return new Logo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultTimelineResponseBody</p>
     */
    public static class Porn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Porn(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Porn create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Porn model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The classification of the pornography detection result. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content.</li>
             * <li><strong>sexy</strong>: sexually suggestive content.</li>
             * <li><strong>normal</strong>: normal content.</li>
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
             * <p>The hit score of the video screenshot for the pornography detection result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position of the video screenshot in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3005</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Porn build() {
                return new Porn(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultTimelineResponseBody</p>
     */
    public static class Terrorism extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Terrorism(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terrorism create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Terrorism model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The terrorism and political content detection result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal.</li>
             * <li><strong>bloody</strong>: bloody content.</li>
             * <li><strong>explosion</strong>: explosions and smoke.</li>
             * <li><strong>outfit</strong>: special attire.</li>
             * <li><strong>logo</strong>: special logos.</li>
             * <li><strong>weapon</strong>: weapons.</li>
             * <li><strong>politics</strong>: political content.</li>
             * <li><strong>violence</strong>: fighting.</li>
             * <li><strong>crowd</strong>: crowd gathering.</li>
             * <li><strong>parade</strong>: parades.</li>
             * <li><strong>carcrash</strong>: car accident scenes.</li>
             * <li><strong>flag</strong>: flags.</li>
             * <li><strong>location</strong>: landmarks.</li>
             * <li><strong>others</strong>: others.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The hit score of the video screenshot for the terrorism and political content detection result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3005</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Terrorism build() {
                return new Terrorism(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAuditResultTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultTimelineResponseBody</p>
     */
    public static class MediaAuditResultTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ad")
        private java.util.List<Ad> ad;

        @com.aliyun.core.annotation.NameInMap("Live")
        private java.util.List<Live> live;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private java.util.List<Logo> logo;

        @com.aliyun.core.annotation.NameInMap("Porn")
        private java.util.List<Porn> porn;

        @com.aliyun.core.annotation.NameInMap("Terrorism")
        private java.util.List<Terrorism> terrorism;

        private MediaAuditResultTimeline(Builder builder) {
            this.ad = builder.ad;
            this.live = builder.live;
            this.logo = builder.logo;
            this.porn = builder.porn;
            this.terrorism = builder.terrorism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaAuditResultTimeline create() {
            return builder().build();
        }

        /**
         * @return ad
         */
        public java.util.List<Ad> getAd() {
            return this.ad;
        }

        /**
         * @return live
         */
        public java.util.List<Live> getLive() {
            return this.live;
        }

        /**
         * @return logo
         */
        public java.util.List<Logo> getLogo() {
            return this.logo;
        }

        /**
         * @return porn
         */
        public java.util.List<Porn> getPorn() {
            return this.porn;
        }

        /**
         * @return terrorism
         */
        public java.util.List<Terrorism> getTerrorism() {
            return this.terrorism;
        }

        public static final class Builder {
            private java.util.List<Ad> ad; 
            private java.util.List<Live> live; 
            private java.util.List<Logo> logo; 
            private java.util.List<Porn> porn; 
            private java.util.List<Terrorism> terrorism; 

            private Builder() {
            } 

            private Builder(MediaAuditResultTimeline model) {
                this.ad = model.ad;
                this.live = model.live;
                this.logo = model.logo;
                this.porn = model.porn;
                this.terrorism = model.terrorism;
            } 

            /**
             * <p>The collection of advertisement detection timelines.</p>
             */
            public Builder ad(java.util.List<Ad> ad) {
                this.ad = ad;
                return this;
            }

            /**
             * <p>The collection of undesirable scene timelines.</p>
             */
            public Builder live(java.util.List<Live> live) {
                this.live = live;
                return this;
            }

            /**
             * <p>The collection of logo detection timelines.</p>
             */
            public Builder logo(java.util.List<Logo> logo) {
                this.logo = logo;
                return this;
            }

            /**
             * <p>The collection of pornography detection timelines.</p>
             */
            public Builder porn(java.util.List<Porn> porn) {
                this.porn = porn;
                return this;
            }

            /**
             * <p>The collection of terrorism detection timelines.</p>
             */
            public Builder terrorism(java.util.List<Terrorism> terrorism) {
                this.terrorism = terrorism;
                return this;
            }

            public MediaAuditResultTimeline build() {
                return new MediaAuditResultTimeline(this);
            } 

        } 

    }
}
