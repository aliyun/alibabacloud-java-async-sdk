// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditResultDetailResponseBody</p>
 */
public class GetMediaAuditResultDetailResponseBody extends TeaModel {
    @NameInMap("MediaAuditResultDetail")
    private MediaAuditResultDetail mediaAuditResultDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetMediaAuditResultDetailResponseBody(Builder builder) {
        this.mediaAuditResultDetail = builder.mediaAuditResultDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditResultDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaAuditResultDetail
     */
    public MediaAuditResultDetail getMediaAuditResultDetail() {
        return this.mediaAuditResultDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaAuditResultDetail mediaAuditResultDetail; 
        private String requestId; 

        /**
         * MediaAuditResultDetail.
         */
        public Builder mediaAuditResultDetail(MediaAuditResultDetail mediaAuditResultDetail) {
            this.mediaAuditResultDetail = mediaAuditResultDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditResultDetailResponseBody build() {
            return new GetMediaAuditResultDetailResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AdLabel")
        private String adLabel;

        @NameInMap("AdScore")
        private String adScore;

        @NameInMap("LiveLabel")
        private String liveLabel;

        @NameInMap("LiveScore")
        private String liveScore;

        @NameInMap("LogoLabel")
        private String logoLabel;

        @NameInMap("LogoScore")
        private String logoScore;

        @NameInMap("PornLabel")
        private String pornLabel;

        @NameInMap("PornScore")
        private String pornScore;

        @NameInMap("TerrorismLabel")
        private String terrorismLabel;

        @NameInMap("TerrorismScore")
        private String terrorismScore;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Url")
        private String url;

        private List(Builder builder) {
            this.adLabel = builder.adLabel;
            this.adScore = builder.adScore;
            this.liveLabel = builder.liveLabel;
            this.liveScore = builder.liveScore;
            this.logoLabel = builder.logoLabel;
            this.logoScore = builder.logoScore;
            this.pornLabel = builder.pornLabel;
            this.pornScore = builder.pornScore;
            this.terrorismLabel = builder.terrorismLabel;
            this.terrorismScore = builder.terrorismScore;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return adLabel
         */
        public String getAdLabel() {
            return this.adLabel;
        }

        /**
         * @return adScore
         */
        public String getAdScore() {
            return this.adScore;
        }

        /**
         * @return liveLabel
         */
        public String getLiveLabel() {
            return this.liveLabel;
        }

        /**
         * @return liveScore
         */
        public String getLiveScore() {
            return this.liveScore;
        }

        /**
         * @return logoLabel
         */
        public String getLogoLabel() {
            return this.logoLabel;
        }

        /**
         * @return logoScore
         */
        public String getLogoScore() {
            return this.logoScore;
        }

        /**
         * @return pornLabel
         */
        public String getPornLabel() {
            return this.pornLabel;
        }

        /**
         * @return pornScore
         */
        public String getPornScore() {
            return this.pornScore;
        }

        /**
         * @return terrorismLabel
         */
        public String getTerrorismLabel() {
            return this.terrorismLabel;
        }

        /**
         * @return terrorismScore
         */
        public String getTerrorismScore() {
            return this.terrorismScore;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String adLabel; 
            private String adScore; 
            private String liveLabel; 
            private String liveScore; 
            private String logoLabel; 
            private String logoScore; 
            private String pornLabel; 
            private String pornScore; 
            private String terrorismLabel; 
            private String terrorismScore; 
            private String timestamp; 
            private String url; 

            /**
             * AdLabel.
             */
            public Builder adLabel(String adLabel) {
                this.adLabel = adLabel;
                return this;
            }

            /**
             * AdScore.
             */
            public Builder adScore(String adScore) {
                this.adScore = adScore;
                return this;
            }

            /**
             * LiveLabel.
             */
            public Builder liveLabel(String liveLabel) {
                this.liveLabel = liveLabel;
                return this;
            }

            /**
             * LiveScore.
             */
            public Builder liveScore(String liveScore) {
                this.liveScore = liveScore;
                return this;
            }

            /**
             * LogoLabel.
             */
            public Builder logoLabel(String logoLabel) {
                this.logoLabel = logoLabel;
                return this;
            }

            /**
             * LogoScore.
             */
            public Builder logoScore(String logoScore) {
                this.logoScore = logoScore;
                return this;
            }

            /**
             * PornLabel.
             */
            public Builder pornLabel(String pornLabel) {
                this.pornLabel = pornLabel;
                return this;
            }

            /**
             * PornScore.
             */
            public Builder pornScore(String pornScore) {
                this.pornScore = pornScore;
                return this;
            }

            /**
             * TerrorismLabel.
             */
            public Builder terrorismLabel(String terrorismLabel) {
                this.terrorismLabel = terrorismLabel;
                return this;
            }

            /**
             * TerrorismScore.
             */
            public Builder terrorismScore(String terrorismScore) {
                this.terrorismScore = terrorismScore;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class MediaAuditResultDetail extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Total")
        private Integer total;

        private MediaAuditResultDetail(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaAuditResultDetail create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public MediaAuditResultDetail build() {
                return new MediaAuditResultDetail(this);
            } 

        } 

    }
}
