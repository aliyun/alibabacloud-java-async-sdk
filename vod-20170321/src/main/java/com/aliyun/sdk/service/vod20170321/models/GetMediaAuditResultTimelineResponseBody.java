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

        /**
         * <p>The collection of review result timelines.</p>
         */
        public Builder mediaAuditResultTimeline(MediaAuditResultTimeline mediaAuditResultTimeline) {
            this.mediaAuditResultTimeline = mediaAuditResultTimeline;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>ad</strong>: other ads.</li>
             * <li><strong>politics</strong>: political content in text.</li>
             * <li><strong>porn</strong>: pornographic content in text.</li>
             * <li><strong>abuse</strong>: abuse in text.</li>
             * <li><strong>terrorism</strong>: terrorist content in text.</li>
             * <li><strong>contraband</strong>: prohibited content in text.</li>
             * <li><strong>spam</strong>: spam content.</li>
             * <li><strong>npx</strong>: illegal ad.</li>
             * <li><strong>qrcode</strong>: QR code.</li>
             * <li><strong>programCode</strong>: mini program code.</li>
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
             * <p>The score of the video snapshot in the ad review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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

            /**
             * <p>The categories of undesired content review results. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture.</li>
             * <li><strong>smoking</strong>: smoking.</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pip</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the undesirable content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>TV</strong>: controlled TV station logo.</li>
             * <li><strong>trademark</strong>: trademark.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logo</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the logo review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong></li>
             * <li><strong>sexy</strong></li>
             * <li><strong>normal</strong></li>
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
             * <p>The score of the video snapshot in the pornographic content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>bloody</strong></li>
             * <li><strong>explosion</strong></li>
             * <li><strong>outfit</strong></li>
             * <li><strong>logo</strong></li>
             * <li><strong>weapon</strong></li>
             * <li><strong>politics</strong></li>
             * <li><strong>violence</strong></li>
             * <li><strong>crowd</strong></li>
             * <li><strong>parade</strong></li>
             * <li><strong>carcrash</strong></li>
             * <li><strong>flag</strong></li>
             * <li><strong>location</strong></li>
             * <li><strong>others</strong></li>
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
             * <p>The score of the video snapshot in the terrorist content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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

            /**
             * <p>The collection of ad timelines.</p>
             */
            public Builder ad(java.util.List<Ad> ad) {
                this.ad = ad;
                return this;
            }

            /**
             * <p>The collection of undesirable content timelines.</p>
             */
            public Builder live(java.util.List<Live> live) {
                this.live = live;
                return this;
            }

            /**
             * <p>The collection of logo timelines.</p>
             */
            public Builder logo(java.util.List<Logo> logo) {
                this.logo = logo;
                return this;
            }

            /**
             * <p>The collection of pornographic content timelines.</p>
             */
            public Builder porn(java.util.List<Porn> porn) {
                this.porn = porn;
                return this;
            }

            /**
             * <p>The collection of terrorist content timelines.</p>
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
