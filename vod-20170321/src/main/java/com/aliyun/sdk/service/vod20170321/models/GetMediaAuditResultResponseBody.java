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
 * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditResultResponseBody</p>
 */
public class GetMediaAuditResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaAuditResult")
    private MediaAuditResult mediaAuditResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaAuditResultResponseBody(Builder builder) {
        this.mediaAuditResult = builder.mediaAuditResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaAuditResult
     */
    public MediaAuditResult getMediaAuditResult() {
        return this.mediaAuditResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaAuditResult mediaAuditResult; 
        private String requestId; 

        /**
         * <p>The review results.</p>
         */
        public Builder mediaAuditResult(MediaAuditResult mediaAuditResult) {
            this.mediaAuditResult = mediaAuditResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB7D7232-1AB2-40FE-B8D5-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditResultResponseBody build() {
            return new GetMediaAuditResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The category of the review result.</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>spam</strong></li>
             * <li><strong>ad</strong></li>
             * <li><strong>politics</strong></li>
             * <li><strong>terrorism</strong></li>
             * <li><strong>abuse</strong></li>
             * <li><strong>porn</strong></li>
             * <li><strong>flood</strong></li>
             * <li><strong>contraband</strong></li>
             * <li><strong>meaningless</strong></li>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <li><strong>terrorism</strong></li>
             * <li><strong>porn</strong></li>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00000</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The category of the review result. Separate multiple values with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>porn</strong></li>
             * <li><strong>terrorism</strong></li>
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
             * <p>The type of the image. The value is <strong>cover</strong>.</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The text content for review.</p>
             * 
             * <strong>example:</strong>
             * <p>hot line 123****</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>spam</strong></li>
             * <li><strong>ad</strong></li>
             * <li><strong>abuse</strong></li>
             * <li><strong>flood</strong></li>
             * <li><strong>contraband</strong></li>
             * <li><strong>meaningless</strong></li>
             * <li><strong>normal</strong></li>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00000</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>ad</strong></li>
             * <li><strong>normal</strong></li>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The category of the review result. </p>
             * <ul>
             * <li><strong>ad</strong></li>
             * <li><strong>normal</strong></li>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The statistics about tag frames.</p>
             */
            public Builder counterList(java.util.List<CounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>ad</strong></li>
             * <li><strong>normal</strong></li>
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
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
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
             * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The number of frames.</p>
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
             * <li><strong>live</strong>: The content contains undesirable scenes.</li>
             * <li><strong>normal</strong>: normal content.</li>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>live</strong>: The content contains undesirable scenes.</li>
             * <li><strong>normal</strong>: normal content.</li>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The statistics about tag frames.</p>
             */
            public Builder counterList(java.util.List<LiveResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>live</strong>: The content contains undesirable scenes.</li>
             * <li><strong>normal</strong>: normal content.</li>
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
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
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
             * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>logo</strong></li>
             * <li><strong>normal</strong></li>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The category of the review result.</p>
             * <ul>
             * <li><strong>logo</strong></li>
             * <li><strong>normal</strong></li>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The position in the video. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The statistics about tag frames.</p>
             */
            public Builder counterList(java.util.List<LogoResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * <p>The category of the review result. Valid values:</p>
             * <ul>
             * <li><strong>logo</strong></li>
             * <li><strong>normal</strong></li>
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
             * <li><strong>block</strong></li>
             * <li><strong>review</strong></li>
             * <li><strong>pass</strong></li>
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
             * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
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

            public PornResultCounterList build() {
                return new PornResultCounterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0000</p>
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

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The statistics about tag frames.</p>
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
             * <p>The recommendation for review results.</p>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
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
             * <p>outfit</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The score of the image of the category that is indicated by Label.</p>
             * 
             * <strong>example:</strong>
             * <p>100.000</p>
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

            /**
             * <p>The URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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
             * <p>The statistics about tag frames.</p>
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
             * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
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

            /**
             * <p>The results of ad review.</p>
             */
            public Builder adResult(AdResult adResult) {
                this.adResult = adResult;
                return this;
            }

            /**
             * <p>The category of the review result. Separate multiple values with commas (,). Valid values: </p>
             * <ul>
             * <li><strong>porn</strong></li>
             * <li><strong>terrorism</strong></li>
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
     * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditResultResponseBody</p>
     */
    public static class MediaAuditResult extends TeaModel {
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

        private MediaAuditResult(Builder builder) {
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

        public static MediaAuditResult create() {
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

            /**
             * <p>The content that violates the regulations. Separate multiple values with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>video</strong></li>
             * <li><strong>image-cover</strong></li>
             * <li><strong>text-title</strong></li>
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
             * <p>The category of the review result. Separate multiple values with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>porn</strong></li>
             * <li><strong>terrorism</strong></li>
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
             * <p>The results of text review.</p>
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

            public MediaAuditResult build() {
                return new MediaAuditResult(this);
            } 

        } 

    }
}
