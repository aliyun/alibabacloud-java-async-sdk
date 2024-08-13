// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The collection of review result timelines.
         */
        public Builder mediaAuditResultTimeline(MediaAuditResultTimeline mediaAuditResultTimeline) {
            this.mediaAuditResultTimeline = mediaAuditResultTimeline;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditResultTimelineResponseBody build() {
            return new GetMediaAuditResultTimelineResponseBody(this);
        } 

    } 

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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **normal**: normal content.
             * *   **ad**: other ads.
             * *   **politics**: political content in text.
             * *   **porn**: pornographic content in text.
             * *   **abuse**: abuse in text.
             * *   **terrorism**: terrorist content in text.
             * *   **contraband**: prohibited content in text.
             * *   **spam**: spam content.
             * *   **npx**: illegal ad.
             * *   **qrcode**: QR code.
             * *   **programCode**: mini program code.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the video snapshot in the ad review result. Valid values: `[0,100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The timestamp of the snapshot in the video. Unit: milliseconds.
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
             * The categories of undesired content review results. Valid values:
             * <p>
             * 
             * *   **normal**: normal content.
             * *   **meaningless**: meaningless content, such as a black or white screen.
             * *   **PIP**: picture-in-picture.
             * *   **smoking**: smoking.
             * *   **drivelive**: live broadcasting in a running vehicle.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the video snapshot in the undesirable content review result. Valid values: `[0,100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The timestamp of the snapshot in the video. Unit: milliseconds.
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **normal**: normal content.
             * *   **TV**: controlled TV station logo.
             * *   **trademark**: trademark.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the video snapshot in the logo review result. Valid values: `[0,100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The timestamp of the snapshot in the video. Unit: milliseconds.
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **porn**
             * *   **sexy**
             * *   **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the video snapshot in the pornographic content review result. Valid values: `[0,100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The timestamp of the snapshot in the video. Unit: milliseconds.
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **normal**
             * *   **bloody**
             * *   **explosion**
             * *   **outfit**
             * *   **logo**
             * *   **weapon**
             * *   **politics**
             * *   **violence**
             * *   **crowd**
             * *   **parade**
             * *   **carcrash**
             * *   **flag**
             * *   **location**
             * *   **others**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the video snapshot in the terrorist content review result. Valid values: `[0,100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The timestamp of the snapshot in the video. Unit: milliseconds.
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
    public static class MediaAuditResultTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ad")
        private java.util.List < Ad> ad;

        @com.aliyun.core.annotation.NameInMap("Live")
        private java.util.List < Live> live;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private java.util.List < Logo> logo;

        @com.aliyun.core.annotation.NameInMap("Porn")
        private java.util.List < Porn> porn;

        @com.aliyun.core.annotation.NameInMap("Terrorism")
        private java.util.List < Terrorism> terrorism;

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
        public java.util.List < Ad> getAd() {
            return this.ad;
        }

        /**
         * @return live
         */
        public java.util.List < Live> getLive() {
            return this.live;
        }

        /**
         * @return logo
         */
        public java.util.List < Logo> getLogo() {
            return this.logo;
        }

        /**
         * @return porn
         */
        public java.util.List < Porn> getPorn() {
            return this.porn;
        }

        /**
         * @return terrorism
         */
        public java.util.List < Terrorism> getTerrorism() {
            return this.terrorism;
        }

        public static final class Builder {
            private java.util.List < Ad> ad; 
            private java.util.List < Live> live; 
            private java.util.List < Logo> logo; 
            private java.util.List < Porn> porn; 
            private java.util.List < Terrorism> terrorism; 

            /**
             * The collection of ad timelines.
             */
            public Builder ad(java.util.List < Ad> ad) {
                this.ad = ad;
                return this;
            }

            /**
             * The collection of undesirable content timelines.
             */
            public Builder live(java.util.List < Live> live) {
                this.live = live;
                return this;
            }

            /**
             * The collection of logo timelines.
             */
            public Builder logo(java.util.List < Logo> logo) {
                this.logo = logo;
                return this;
            }

            /**
             * The collection of pornographic content timelines.
             */
            public Builder porn(java.util.List < Porn> porn) {
                this.porn = porn;
                return this;
            }

            /**
             * The collection of terrorist content timelines.
             */
            public Builder terrorism(java.util.List < Terrorism> terrorism) {
                this.terrorism = terrorism;
                return this;
            }

            public MediaAuditResultTimeline build() {
                return new MediaAuditResultTimeline(this);
            } 

        } 

    }
}
