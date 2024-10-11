// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMediaAuditResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditResultDetailResponseBody</p>
 */
public class GetMediaAuditResultDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaAuditResultDetail")
    private MediaAuditResultDetail mediaAuditResultDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details about review results.</p>
         */
        public Builder mediaAuditResultDetail(MediaAuditResultDetail mediaAuditResultDetail) {
            this.mediaAuditResultDetail = mediaAuditResultDetail;
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

        public GetMediaAuditResultDetailResponseBody build() {
            return new GetMediaAuditResultDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaAuditResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultDetailResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdLabel")
        private String adLabel;

        @com.aliyun.core.annotation.NameInMap("AdScore")
        private String adScore;

        @com.aliyun.core.annotation.NameInMap("LiveLabel")
        private String liveLabel;

        @com.aliyun.core.annotation.NameInMap("LiveScore")
        private String liveScore;

        @com.aliyun.core.annotation.NameInMap("LogoLabel")
        private String logoLabel;

        @com.aliyun.core.annotation.NameInMap("LogoScore")
        private String logoScore;

        @com.aliyun.core.annotation.NameInMap("PornLabel")
        private String pornLabel;

        @com.aliyun.core.annotation.NameInMap("PornScore")
        private String pornScore;

        @com.aliyun.core.annotation.NameInMap("TerrorismLabel")
        private String terrorismLabel;

        @com.aliyun.core.annotation.NameInMap("TerrorismScore")
        private String terrorismScore;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>ad</strong>: other ads.</li>
             * <li><strong>politics</strong>: political content in text.</li>
             * <li><strong>porn</strong>: pornographic content in text.</li>
             * <li><strong>abuse</strong>: verbal abuse in text.</li>
             * <li><strong>terrorism</strong>: terrorist content in text.</li>
             * <li><strong>contraband</strong>: prohibited content in text.</li>
             * <li><strong>spam</strong>: spam content in text.</li>
             * <li><strong>npx</strong>: illegal ad</li>
             * <li><strong>qrcode</strong>: QR code.</li>
             * <li><strong>programCode</strong>: mini program code.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder adLabel(String adLabel) {
                this.adLabel = adLabel;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the ad review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder adScore(String adScore) {
                this.adScore = adScore;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture.</li>
             * <li><strong>smoking</strong>: smoking.</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder liveLabel(String liveLabel) {
                this.liveLabel = liveLabel;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the undesirable content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder liveScore(String liveScore) {
                this.liveScore = liveScore;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>TV</strong>: controlled TV station logo.</li>
             * <li><strong>trademark</strong>: trademark.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder logoLabel(String logoLabel) {
                this.logoLabel = logoLabel;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the logo review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder logoScore(String logoScore) {
                this.logoScore = logoScore;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>porn</strong></li>
             * <li><strong>sexy</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder pornLabel(String pornLabel) {
                this.pornLabel = pornLabel;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the pornographic content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder pornScore(String pornScore) {
                this.pornScore = pornScore;
                return this;
            }

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
            public Builder terrorismLabel(String terrorismLabel) {
                this.terrorismLabel = terrorismLabel;
                return this;
            }

            /**
             * <p>The score of the video snapshot in the terrorist content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder terrorismScore(String terrorismScore) {
                this.terrorismScore = terrorismScore;
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

            /**
             * <p>The URL of the video snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
    /**
     * 
     * {@link GetMediaAuditResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultDetailResponseBody</p>
     */
    public static class MediaAuditResultDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>The review results returned.</p>
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of snapshots returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
