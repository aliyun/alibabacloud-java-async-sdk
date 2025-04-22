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
 * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIMediaAuditJobResponseBody</p>
 */
public class GetAIMediaAuditJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaAuditJob")
    private MediaAuditJob mediaAuditJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAIMediaAuditJobResponseBody(Builder builder) {
        this.mediaAuditJob = builder.mediaAuditJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIMediaAuditJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaAuditJob
     */
    public MediaAuditJob getMediaAuditJob() {
        return this.mediaAuditJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaAuditJob mediaAuditJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAIMediaAuditJobResponseBody model) {
            this.mediaAuditJob = model.mediaAuditJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the intelligent review job.</p>
         */
        public Builder mediaAuditJob(MediaAuditJob mediaAuditJob) {
            this.mediaAuditJob = mediaAuditJob;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EAA3E96A-02E2-41*****85-08E1D568ED3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIMediaAuditJobResponseBody build() {
            return new GetAIMediaAuditJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class AudioResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private AudioResult(Builder builder) {
            this.label = builder.label;
            this.scene = builder.scene;
            this.score = builder.score;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String scene; 
            private String score; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(AudioResult model) {
                this.label = model.label;
                this.scene = model.scene;
                this.score = model.score;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The category of the review result.</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>spam</strong>: spam</li>
             * <li><strong>ad</strong>: ads</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>terrorism</strong>: terrorist content</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>porn</strong>: pornographic content.</li>
             * <li><strong>flood</strong>: excessive junk content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>meaningless</strong>: meaningless content</li>
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
             * <p>The review scenario. The value is <strong>antispam</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>99.91</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public AudioResult build() {
                return new AudioResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Result(Builder builder) {
            this.label = builder.label;
            this.scene = builder.scene;
            this.score = builder.score;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String scene; 
            private String score; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.label = model.label;
                this.scene = model.scene;
                this.score = model.score;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The category of the review result.</p>
             * <p>Valid values if scene is <strong>porn</strong>:</p>
             * <ul>
             * <li><strong>porn</strong></li>
             * <li><strong>sexy</strong></li>
             * <li><strong>normal</strong></li>
             * </ul>
             * <p>Valid values if scene is <strong>terrorism</strong>:</p>
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
             * <p>Valid values if scene is <strong>ad</strong>:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: ads</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>abuse</strong>: verbal abuse</li>
             * <li><strong>terrorism</strong>: terrorist content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>spam</strong>: spam content</li>
             * <li><strong>npx</strong>: illegal ad</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
             * </ul>
             * <p>Valid values if scene is <strong>live</strong>:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * <p>Valid values if scene is <strong>logo</strong>:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
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
             * <p>The review scenario. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>terrorism</strong>: terrorist or politically sensitive content</li>
             * <li><strong>ad</strong>: ad violation</li>
             * <li><strong>live</strong>: undesirable scene</li>
             * <li><strong>logo</strong>: logo</li>
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
             * <p>The score of the image of the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class ImageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ImageResult(Builder builder) {
            this.label = builder.label;
            this.result = builder.result;
            this.suggestion = builder.suggestion;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private java.util.List<Result> result; 
            private String suggestion; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(ImageResult model) {
                this.label = model.label;
                this.result = model.result;
                this.suggestion = model.suggestion;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The categories of the image review results. Multiple values are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>terrorism</strong>: terrorist or politically sensitive content</li>
             * <li><strong>ad</strong>: ad violation</li>
             * <li><strong>live</strong>: undesirable scene</li>
             * <li><strong>logo</strong>: logo</li>
             * <li><strong>normal</strong>: normal content</li>
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
             * <p>Details of image review results.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The type of the image. Valid value: <strong>cover</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>cover</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.test.com/****.jpg">http://www.test.com/****.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageResult build() {
                return new ImageResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class TextResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TextResult(Builder builder) {
            this.content = builder.content;
            this.label = builder.label;
            this.scene = builder.scene;
            this.score = builder.score;
            this.suggestion = builder.suggestion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextResult create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String label; 
            private String scene; 
            private String score; 
            private String suggestion; 
            private String type; 

            private Builder() {
            } 

            private Builder(TextResult model) {
                this.content = model.content;
                this.label = model.label;
                this.scene = model.scene;
                this.score = model.score;
                this.suggestion = model.suggestion;
                this.type = model.type;
            } 

            /**
             * <p>The text content.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>spam</strong>: spam content</li>
             * <li><strong>ad</strong>: ads</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>flood</strong>: excessive junk content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>meaningless</strong>: meaningless content</li>
             * <li><strong>normal</strong>: normal content</li>
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
             * <p>The review scenario. The value is <strong>antispam</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The score of the image of the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The type of the text. The value is <strong>title</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TextResult build() {
                return new TextResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class CounterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private CounterList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CounterList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Integer count; 
            private String label; 

            private Builder() {
            } 

            private Builder(CounterList model) {
                this.count = model.count;
                this.label = model.label;
            } 

            /**
             * <p>The number of video snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The categories of the ad review results. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: other ads</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>terrorism</strong>: terrorist content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>spam</strong>: spam content</li>
             * <li><strong>npx</strong>: illegal ad</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ad</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public CounterList build() {
                return new CounterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class TopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TopList(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopList create() {
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(TopList model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>The categories of the ad review results. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: other ads</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>terrorism</strong>: terrorist content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>spam</strong>: spam content</li>
             * <li><strong>npx</strong>: illegal ad</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
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
             * <p>The score of the snapshot in the category that is indicated by Label.</p>
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
             * <p>500</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the video snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TopList build() {
                return new TopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class AdResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List<CounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
        private java.util.List<TopList> topList;

        private AdResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.counterList = builder.counterList;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.suggestion = builder.suggestion;
            this.topList = builder.topList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
        }

        /**
         * @return counterList
         */
        public java.util.List<CounterList> getCounterList() {
            return this.counterList;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return maxScore
         */
        public String getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return topList
         */
        public java.util.List<TopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List<CounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List<TopList> topList; 

            private Builder() {
            } 

            private Builder(AdResult model) {
                this.averageScore = model.averageScore;
                this.counterList = model.counterList;
                this.label = model.label;
                this.maxScore = model.maxScore;
                this.suggestion = model.suggestion;
                this.topList = model.topList;
            } 

            /**
             * <p>The average score of the review results.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * <p>The number of snapshots of each category in the review result.</p>
             */
            public Builder counterList(java.util.List<CounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * <p>The categories of the ad review results. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: other ads</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>terrorism</strong>: terrorist content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>spam</strong>: spam content</li>
             * <li><strong>npx</strong>: illegal ad</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
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
             * <p>The highest review score.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: The content violates the regulations.</li>
             * <li><strong>review</strong>: The content may violate the regulations.</li>
             * <li><strong>pass</strong>: The content passes the review.</li>
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
             * <p>The information about the snapshot that has the highest score in the category.</p>
             */
            public Builder topList(java.util.List<TopList> topList) {
                this.topList = topList;
                return this;
            }

            public AdResult build() {
                return new AdResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class LiveResultCounterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private LiveResultCounterList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveResultCounterList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Integer count; 
            private String label; 

            private Builder() {
            } 

            private Builder(LiveResultCounterList model) {
                this.count = model.count;
                this.label = model.label;
            } 

            /**
             * <p>The number of video snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public LiveResultCounterList build() {
                return new LiveResultCounterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class LiveResultTopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private LiveResultTopList(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveResultTopList create() {
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(LiveResultTopList model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score of the snapshot in the category that is indicated by Label.</p>
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
             * <p>500</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the video snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public LiveResultTopList build() {
                return new LiveResultTopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class LiveResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List<LiveResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
        private java.util.List<LiveResultTopList> topList;

        private LiveResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.counterList = builder.counterList;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.suggestion = builder.suggestion;
            this.topList = builder.topList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
        }

        /**
         * @return counterList
         */
        public java.util.List<LiveResultCounterList> getCounterList() {
            return this.counterList;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return maxScore
         */
        public String getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return topList
         */
        public java.util.List<LiveResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List<LiveResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List<LiveResultTopList> topList; 

            private Builder() {
            } 

            private Builder(LiveResult model) {
                this.averageScore = model.averageScore;
                this.counterList = model.counterList;
                this.label = model.label;
                this.maxScore = model.maxScore;
                this.suggestion = model.suggestion;
                this.topList = model.topList;
            } 

            /**
             * <p>The average score of the review results.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * <p>The categories of the review results and the number of video snapshots in each category.</p>
             */
            public Builder counterList(java.util.List<LiveResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The highest review score.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: The content violates the regulations.</li>
             * <li><strong>review</strong>: The content may violate the regulations.</li>
             * <li><strong>pass</strong>: The content passes the review.</li>
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
             * <p>The information about the snapshot that has the highest score in the category.</p>
             */
            public Builder topList(java.util.List<LiveResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public LiveResult build() {
                return new LiveResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class LogoResultCounterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private LogoResultCounterList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoResultCounterList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Integer count; 
            private String label; 

            private Builder() {
            } 

            private Builder(LogoResultCounterList model) {
                this.count = model.count;
                this.label = model.label;
            } 

            /**
             * <p>The number of video snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logo</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public LogoResultCounterList build() {
                return new LogoResultCounterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class LogoResultTopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private LogoResultTopList(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoResultTopList create() {
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(LogoResultTopList model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
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
             * <p>The score of the snapshot in the category that is indicated by Label.</p>
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
             * <p>5000</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the video snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public LogoResultTopList build() {
                return new LogoResultTopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class LogoResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List<LogoResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
        private java.util.List<LogoResultTopList> topList;

        private LogoResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.counterList = builder.counterList;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.suggestion = builder.suggestion;
            this.topList = builder.topList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
        }

        /**
         * @return counterList
         */
        public java.util.List<LogoResultCounterList> getCounterList() {
            return this.counterList;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return maxScore
         */
        public String getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return topList
         */
        public java.util.List<LogoResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List<LogoResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List<LogoResultTopList> topList; 

            private Builder() {
            } 

            private Builder(LogoResult model) {
                this.averageScore = model.averageScore;
                this.counterList = model.counterList;
                this.label = model.label;
                this.maxScore = model.maxScore;
                this.suggestion = model.suggestion;
                this.topList = model.topList;
            } 

            /**
             * <p>The average score of the snapshots in the category indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * <p>The categories of the review results and the number of video snapshots in each category.</p>
             */
            public Builder counterList(java.util.List<LogoResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
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
             * <p>The highest score of the snapshot of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: The content violates the regulations.</li>
             * <li><strong>review</strong>: The content may violate the regulations.</li>
             * <li><strong>pass</strong>: The content passes the review.</li>
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
             * <p>The information about the snapshot that has the highest score in the category.</p>
             */
            public Builder topList(java.util.List<LogoResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public LogoResult build() {
                return new LogoResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class PornResultCounterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private PornResultCounterList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PornResultCounterList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Integer count; 
            private String label; 

            private Builder() {
            } 

            private Builder(PornResultCounterList model) {
                this.count = model.count;
                this.label = model.label;
            } 

            /**
             * <p>The number of video snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The results of pornographic content review. Valid values:</p>
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

            public PornResultCounterList build() {
                return new PornResultCounterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class PornResultTopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private PornResultTopList(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PornResultTopList create() {
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(PornResultTopList model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>The results of pornographic content review. Valid values:</p>
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
             * <p>The score of the snapshot in the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
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
             * <p><a href="http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-****bucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PornResultTopList build() {
                return new PornResultTopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class PornResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List<PornResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
        private java.util.List<PornResultTopList> topList;

        private PornResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.counterList = builder.counterList;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.suggestion = builder.suggestion;
            this.topList = builder.topList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PornResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
        }

        /**
         * @return counterList
         */
        public java.util.List<PornResultCounterList> getCounterList() {
            return this.counterList;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return maxScore
         */
        public String getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return topList
         */
        public java.util.List<PornResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List<PornResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List<PornResultTopList> topList; 

            private Builder() {
            } 

            private Builder(PornResult model) {
                this.averageScore = model.averageScore;
                this.counterList = model.counterList;
                this.label = model.label;
                this.maxScore = model.maxScore;
                this.suggestion = model.suggestion;
                this.topList = model.topList;
            } 

            /**
             * <p>The average score of the snapshots of the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * <p>The number of snapshots of each category in the review result.</p>
             */
            public Builder counterList(java.util.List<PornResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

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
             * <p>The highest score of the snapshot of the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: The content violates the regulations.</li>
             * <li><strong>review</strong>: The content may violate the regulations.</li>
             * <li><strong>pass</strong>: The content passes the review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The information about the snapshot that has the highest score in the category.</p>
             */
            public Builder topList(java.util.List<PornResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public PornResult build() {
                return new PornResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class TerrorismResultCounterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private TerrorismResultCounterList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismResultCounterList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Integer count; 
            private String label; 

            private Builder() {
            } 

            private Builder(TerrorismResultCounterList model) {
                this.count = model.count;
                this.label = model.label;
            } 

            /**
             * <p>The number of video snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The results of terrorist content review. Valid values:</p>
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
             * <p>terrorism</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public TerrorismResultCounterList build() {
                return new TerrorismResultCounterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class TerrorismResultTopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TerrorismResultTopList(Builder builder) {
            this.label = builder.label;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismResultTopList create() {
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private String score; 
            private String timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(TerrorismResultTopList model) {
                this.label = model.label;
                this.score = model.score;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>The results of terrorist content review. Valid values:</p>
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
             * <p>The score of the snapshot in the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
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
             * <p>5</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the video snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ali*****.com/aivideocensor/yytysursrutyrxuq/****.jpg">http://ali*****.com/aivideocensor/yytysursrutyrxuq/****.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TerrorismResultTopList build() {
                return new TerrorismResultTopList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class TerrorismResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List<TerrorismResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
        private java.util.List<TerrorismResultTopList> topList;

        private TerrorismResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.counterList = builder.counterList;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.suggestion = builder.suggestion;
            this.topList = builder.topList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
        }

        /**
         * @return counterList
         */
        public java.util.List<TerrorismResultCounterList> getCounterList() {
            return this.counterList;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return maxScore
         */
        public String getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return topList
         */
        public java.util.List<TerrorismResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List<TerrorismResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List<TerrorismResultTopList> topList; 

            private Builder() {
            } 

            private Builder(TerrorismResult model) {
                this.averageScore = model.averageScore;
                this.counterList = model.counterList;
                this.label = model.label;
                this.maxScore = model.maxScore;
                this.suggestion = model.suggestion;
                this.topList = model.topList;
            } 

            /**
             * <p>The average score of the snapshots of the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * <p>The categories of terrorist content review results and the number of video snapshots in each category.</p>
             */
            public Builder counterList(java.util.List<TerrorismResultCounterList> counterList) {
                this.counterList = counterList;
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
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The highest score of the snapshot of the category that is indicated by Label. Valid values: <code>[0, 100]</code>. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * <p>The recommendation for terrorist content review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The information about the snapshot that has the highest score in the category.</p>
             */
            public Builder topList(java.util.List<TerrorismResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public TerrorismResult build() {
                return new TerrorismResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class VideoResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdResult")
        private AdResult adResult;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LiveResult")
        private LiveResult liveResult;

        @com.aliyun.core.annotation.NameInMap("LogoResult")
        private LogoResult logoResult;

        @com.aliyun.core.annotation.NameInMap("PornResult")
        private PornResult pornResult;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TerrorismResult")
        private TerrorismResult terrorismResult;

        private VideoResult(Builder builder) {
            this.adResult = builder.adResult;
            this.label = builder.label;
            this.liveResult = builder.liveResult;
            this.logoResult = builder.logoResult;
            this.pornResult = builder.pornResult;
            this.suggestion = builder.suggestion;
            this.terrorismResult = builder.terrorismResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoResult create() {
            return builder().build();
        }

        /**
         * @return adResult
         */
        public AdResult getAdResult() {
            return this.adResult;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return liveResult
         */
        public LiveResult getLiveResult() {
            return this.liveResult;
        }

        /**
         * @return logoResult
         */
        public LogoResult getLogoResult() {
            return this.logoResult;
        }

        /**
         * @return pornResult
         */
        public PornResult getPornResult() {
            return this.pornResult;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return terrorismResult
         */
        public TerrorismResult getTerrorismResult() {
            return this.terrorismResult;
        }

        public static final class Builder {
            private AdResult adResult; 
            private String label; 
            private LiveResult liveResult; 
            private LogoResult logoResult; 
            private PornResult pornResult; 
            private String suggestion; 
            private TerrorismResult terrorismResult; 

            private Builder() {
            } 

            private Builder(VideoResult model) {
                this.adResult = model.adResult;
                this.label = model.label;
                this.liveResult = model.liveResult;
                this.logoResult = model.logoResult;
                this.pornResult = model.pornResult;
                this.suggestion = model.suggestion;
                this.terrorismResult = model.terrorismResult;
            } 

            /**
             * <p>The results of ad review.</p>
             */
            public Builder adResult(AdResult adResult) {
                this.adResult = adResult;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>terrorism</strong>: terrorist or politically sensitive content</li>
             * <li><strong>ad</strong>: ad violation</li>
             * <li><strong>live</strong>: undesirable scene</li>
             * <li><strong>logo</strong>: logo</li>
             * <li><strong>normal</strong></li>
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
             * <p>The results of undesired content review.</p>
             */
            public Builder liveResult(LiveResult liveResult) {
                this.liveResult = liveResult;
                return this;
            }

            /**
             * <p>The results of logo review.</p>
             */
            public Builder logoResult(LogoResult logoResult) {
                this.logoResult = logoResult;
                return this;
            }

            /**
             * <p>The results of pornographic content review.</p>
             */
            public Builder pornResult(PornResult pornResult) {
                this.pornResult = pornResult;
                return this;
            }

            /**
             * <p>The recommendation for video review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The results of terrorist content review.</p>
             */
            public Builder terrorismResult(TerrorismResult terrorismResult) {
                this.terrorismResult = terrorismResult;
                return this;
            }

            public VideoResult build() {
                return new VideoResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalModules")
        private String abnormalModules;

        @com.aliyun.core.annotation.NameInMap("AudioResult")
        private java.util.List<AudioResult> audioResult;

        @com.aliyun.core.annotation.NameInMap("ImageResult")
        private java.util.List<ImageResult> imageResult;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TextResult")
        private java.util.List<TextResult> textResult;

        @com.aliyun.core.annotation.NameInMap("VideoResult")
        private VideoResult videoResult;

        private Data(Builder builder) {
            this.abnormalModules = builder.abnormalModules;
            this.audioResult = builder.audioResult;
            this.imageResult = builder.imageResult;
            this.label = builder.label;
            this.suggestion = builder.suggestion;
            this.textResult = builder.textResult;
            this.videoResult = builder.videoResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return abnormalModules
         */
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        /**
         * @return audioResult
         */
        public java.util.List<AudioResult> getAudioResult() {
            return this.audioResult;
        }

        /**
         * @return imageResult
         */
        public java.util.List<ImageResult> getImageResult() {
            return this.imageResult;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return textResult
         */
        public java.util.List<TextResult> getTextResult() {
            return this.textResult;
        }

        /**
         * @return videoResult
         */
        public VideoResult getVideoResult() {
            return this.videoResult;
        }

        public static final class Builder {
            private String abnormalModules; 
            private java.util.List<AudioResult> audioResult; 
            private java.util.List<ImageResult> imageResult; 
            private String label; 
            private String suggestion; 
            private java.util.List<TextResult> textResult; 
            private VideoResult videoResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.abnormalModules = model.abnormalModules;
                this.audioResult = model.audioResult;
                this.imageResult = model.imageResult;
                this.label = model.label;
                this.suggestion = model.suggestion;
                this.textResult = model.textResult;
                this.videoResult = model.videoResult;
            } 

            /**
             * <p>The content that violates the regulations. Separate multiple values with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>video</strong>: the video.</li>
             * <li><strong>image-cover</strong>: the cover.</li>
             * <li><strong>text-title</strong>: the title.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder abnormalModules(String abnormalModules) {
                this.abnormalModules = abnormalModules;
                return this;
            }

            /**
             * <p>The results of audio review.</p>
             */
            public Builder audioResult(java.util.List<AudioResult> audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * <p>The results of image review.</p>
             */
            public Builder imageResult(java.util.List<ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * <p>The category of the review result. Multiple values are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>terrorism</strong>: terrorist or politically sensitive content</li>
             * <li><strong>ad</strong>: ad violation</li>
             * <li><strong>live</strong>: undesirable scene</li>
             * <li><strong>logo</strong>: logo</li>
             * <li><strong>audio</strong>: audio anti-spam</li>
             * <li><strong>normal</strong>: normal content</li>
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
             * <p>The recommendation for review results. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: The content violates the regulations.</li>
             * <li><strong>review</strong>: The content may violate the regulations.</li>
             * <li><strong>pass</strong>: The content passes the review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The text moderation results.</p>
             */
            public Builder textResult(java.util.List<TextResult> textResult) {
                this.textResult = textResult;
                return this;
            }

            /**
             * <p>The results of video review.</p>
             */
            public Builder videoResult(VideoResult videoResult) {
                this.videoResult = videoResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIMediaAuditJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIMediaAuditJobResponseBody</p>
     */
    public static class MediaAuditJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MediaAuditJob(Builder builder) {
            this.code = builder.code;
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.data = builder.data;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.message = builder.message;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaAuditJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String completeTime; 
            private String creationTime; 
            private Data data; 
            private String jobId; 
            private String mediaId; 
            private String message; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(MediaAuditJob model) {
                this.code = model.code;
                this.completeTime = model.completeTime;
                this.creationTime = model.creationTime;
                this.data = model.data;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.message = model.message;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The error code. This parameter is returned if the value of Status is fail.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job is complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T13:00:00Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the job started to run. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The job result.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>bdbc266af6894*****943a70176d92e9</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>fe028d09441d*****d1afffb138cd7e</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The error message. This parameter is returned if the value of Status is fail.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: The job is successful.</li>
             * <li><strong>fail</strong>: The job failed.</li>
             * <li><strong>init</strong>: The job is being initialized.</li>
             * <li><strong>Processing</strong>: The job is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the job. The value is AIMediaAudit.</p>
             * 
             * <strong>example:</strong>
             * <p>AIMediaAudit</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MediaAuditJob build() {
                return new MediaAuditJob(this);
            } 

        } 

    }
}
