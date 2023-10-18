// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditResultResponseBody</p>
 */
public class GetMediaAuditResultResponseBody extends TeaModel {
    @NameInMap("MediaAuditResult")
    private MediaAuditResult mediaAuditResult;

    @NameInMap("RequestId")
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
         * The review results.
         */
        public Builder mediaAuditResult(MediaAuditResult mediaAuditResult) {
            this.mediaAuditResult = mediaAuditResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditResultResponseBody build() {
            return new GetMediaAuditResultResponseBody(this);
        } 

    } 

    public static class AudioResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Score")
        private String score;

        @NameInMap("Suggestion")
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
             * The category of the review result.
             * <p>
             * 
             * *   **normal**
             * *   **spam**
             * *   **ad**
             * *   **politics**
             * *   **terrorism**
             * *   **abuse**
             * *   **porn**
             * *   **flood**
             * *   **contraband**
             * *   **meaningless**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The review scenario. The value is **antispam**.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**
             * *   **review**
             * *   **pass**
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
    public static class Result extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Score")
        private String score;

        @NameInMap("Suggestion")
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
             * The category of the review result.
             * <p>
             * 
             * Valid values if scene is **porn**:
             * 
             * *   **porn**
             * *   **sexy**
             * *   **normal**
             * 
             * Valid values if scene is **terrorism**:
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
             * The review scenario. Valid values:
             * <p>
             * 
             * *   **terrorism**
             * *   **porn**
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**
             * *   **review**
             * *   **pass**
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
    public static class ImageResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
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
        public java.util.List < Result> getResult() {
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
            private java.util.List < Result> result; 
            private String suggestion; 
            private String type; 
            private String url; 

            /**
             * The category of the review result. Separate multiple values with commas (,). Valid values:
             * <p>
             * 
             * *   **porn**
             * *   **terrorism**
             * *   **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Details of image review results.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**
             * *   **review**
             * *   **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The type of the image. The value is **cover**.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL of the image.
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
    public static class TextResult extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Label")
        private String label;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Score")
        private String score;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("Type")
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
             * The text content for review.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **spam**
             * - **ad**
             * - **abuse**
             * - **flood**
             * - **contraband**
             * - **meaningless**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The review scenario. The value is **antispam**.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * - **block**
             * - **review**
             * - **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The type of the text. The value is **title**.
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
    public static class CounterList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
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
             * The number of frames.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **ad**
             * - **normal**
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
    public static class TopList extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Url")
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
             * The category of the review result. 
             * <p>
             * 
             * - **ad**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The position in the video. Unit: milliseconds.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The URL of the image.
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
    public static class AdResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("CounterList")
        private java.util.List < CounterList> counterList;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TopList")
        private java.util.List < TopList> topList;

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
        public java.util.List < CounterList> getCounterList() {
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
        public java.util.List < TopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List < CounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List < TopList> topList; 

            /**
             * The average score of the review results.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The statistics about tag frames.
             */
            public Builder counterList(java.util.List < CounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **ad**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The highest review score.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * - **block**
             * - **review**
             * - **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The information about the image with the highest score of the category that is indicated by Label.
             */
            public Builder topList(java.util.List < TopList> topList) {
                this.topList = topList;
                return this;
            }

            public AdResult build() {
                return new AdResult(this);
            } 

        } 

    }
    public static class LiveResultCounterList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
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
             * The number of frames.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **live**: The content contains undesirable scenes.
             * - **normal**: normal content.
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
    public static class LiveResultTopList extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Url")
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **live**: The content contains undesirable scenes.
             * - **normal**: normal content.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The position in the video. Unit: milliseconds.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The URL of the image.
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
    public static class LiveResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("CounterList")
        private java.util.List < LiveResultCounterList> counterList;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TopList")
        private java.util.List < LiveResultTopList> topList;

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
        public java.util.List < LiveResultCounterList> getCounterList() {
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
        public java.util.List < LiveResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List < LiveResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List < LiveResultTopList> topList; 

            /**
             * The average score of the review results.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The statistics about tag frames.
             */
            public Builder counterList(java.util.List < LiveResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **live**: The content contains undesirable scenes.
             * - **normal**: normal content.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The highest review score.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * - **block**
             * - **review**
             * - **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The information about the image with the highest score of the category that is indicated by Label.
             */
            public Builder topList(java.util.List < LiveResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public LiveResult build() {
                return new LiveResult(this);
            } 

        } 

    }
    public static class LogoResultCounterList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
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
             * The number of frames.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **logo**
             * - **normal**
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
    public static class LogoResultTopList extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Url")
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
             * The category of the review result.
             * <p>
             * 
             * - **logo**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The position in the video. Unit: milliseconds.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The URL of the image.
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
    public static class LogoResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("CounterList")
        private java.util.List < LogoResultCounterList> counterList;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TopList")
        private java.util.List < LogoResultTopList> topList;

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
        public java.util.List < LogoResultCounterList> getCounterList() {
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
        public java.util.List < LogoResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List < LogoResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List < LogoResultTopList> topList; 

            /**
             * The average score of the review results.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The statistics about tag frames.
             */
            public Builder counterList(java.util.List < LogoResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **logo**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The highest review score.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * - **block**
             * - **review**
             * - **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The information about the image with the highest score of the category that is indicated by Label.
             */
            public Builder topList(java.util.List < LogoResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public LogoResult build() {
                return new LogoResult(this);
            } 

        } 

    }
    public static class PornResultCounterList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
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
             * The number of frames.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **porn**
             * - **sexy**
             * - **normal**
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
    public static class PornResultTopList extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Url")
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **porn**
             * - **sexy**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The position in the video. Unit: milliseconds.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The URL of the image.
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
    public static class PornResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("CounterList")
        private java.util.List < PornResultCounterList> counterList;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TopList")
        private java.util.List < PornResultTopList> topList;

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
        public java.util.List < PornResultCounterList> getCounterList() {
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
        public java.util.List < PornResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List < PornResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List < PornResultTopList> topList; 

            /**
             * The average score of the review results.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The statistics about tag frames.
             */
            public Builder counterList(java.util.List < PornResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **porn**
             * - **sexy**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The highest review score.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The information about the image with the highest score of the category that is indicated by Label.
             */
            public Builder topList(java.util.List < PornResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public PornResult build() {
                return new PornResult(this);
            } 

        } 

    }
    public static class TerrorismResultCounterList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
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
             * The number of frames.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **normal**
             * - **bloody**
             * - **explosion**
             * - **outfit**
             * - **logo**
             * - **weapon**
             * - **politics**
             * - **violence**
             * - **crowd**
             * - **parade**
             * - **carcrash**
             * - **flag**
             * - **location**
             * - **others**
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
    public static class TerrorismResultTopList extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Url")
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **normal**
             * - **bloody**
             * - **explosion**
             * - **outfit**
             * - **logo**
             * - **weapon**
             * - **politics**
             * - **violence**
             * - **crowd**
             * - **parade**
             * - **carcrash**
             * - **flag**
             * - **location**
             * - **others**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The position in the video. Unit: milliseconds.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The URL of the image.
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
    public static class TerrorismResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("CounterList")
        private java.util.List < TerrorismResultCounterList> counterList;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TopList")
        private java.util.List < TerrorismResultTopList> topList;

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
        public java.util.List < TerrorismResultCounterList> getCounterList() {
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
        public java.util.List < TerrorismResultTopList> getTopList() {
            return this.topList;
        }

        public static final class Builder {
            private String averageScore; 
            private java.util.List < TerrorismResultCounterList> counterList; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private java.util.List < TerrorismResultTopList> topList; 

            /**
             * The average score of the review results.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The statistics about tag frames.
             */
            public Builder counterList(java.util.List < TerrorismResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * - **normal**
             * - **bloody**
             * - **explosion**
             * - **outfit**
             * - **logo**
             * - **weapon**
             * - **politics**
             * - **violence**
             * - **crowd**
             * - **parade**
             * - **carcrash**
             * - **flag**
             * - **location**
             * - **others**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The highest review score.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * - **block**
             * - **review**
             * - **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The information about the image with the highest score of the category that is indicated by Label.
             */
            public Builder topList(java.util.List < TerrorismResultTopList> topList) {
                this.topList = topList;
                return this;
            }

            public TerrorismResult build() {
                return new TerrorismResult(this);
            } 

        } 

    }
    public static class VideoResult extends TeaModel {
        @NameInMap("AdResult")
        private AdResult adResult;

        @NameInMap("Label")
        private String label;

        @NameInMap("LiveResult")
        private LiveResult liveResult;

        @NameInMap("LogoResult")
        private LogoResult logoResult;

        @NameInMap("PornResult")
        private PornResult pornResult;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TerrorismResult")
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
             * The results of ad review.
             */
            public Builder adResult(AdResult adResult) {
                this.adResult = adResult;
                return this;
            }

            /**
             * The category of the review result. Separate multiple values with commas (,). Valid values: 
             * <p>
             * 
             * - **porn**
             * - **terrorism**
             * - **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The results of undesired content review.
             */
            public Builder liveResult(LiveResult liveResult) {
                this.liveResult = liveResult;
                return this;
            }

            /**
             * The results of logo review.
             */
            public Builder logoResult(LogoResult logoResult) {
                this.logoResult = logoResult;
                return this;
            }

            /**
             * The results of pornographic content review.
             */
            public Builder pornResult(PornResult pornResult) {
                this.pornResult = pornResult;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * - **block**
             * - **review**
             * - **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The results of terrorist content review.
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
    public static class MediaAuditResult extends TeaModel {
        @NameInMap("AbnormalModules")
        private String abnormalModules;

        @NameInMap("AudioResult")
        private java.util.List < AudioResult> audioResult;

        @NameInMap("ImageResult")
        private java.util.List < ImageResult> imageResult;

        @NameInMap("Label")
        private String label;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TextResult")
        private java.util.List < TextResult> textResult;

        @NameInMap("VideoResult")
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
        public java.util.List < AudioResult> getAudioResult() {
            return this.audioResult;
        }

        /**
         * @return imageResult
         */
        public java.util.List < ImageResult> getImageResult() {
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
        public java.util.List < TextResult> getTextResult() {
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
            private java.util.List < AudioResult> audioResult; 
            private java.util.List < ImageResult> imageResult; 
            private String label; 
            private String suggestion; 
            private java.util.List < TextResult> textResult; 
            private VideoResult videoResult; 

            /**
             * The content that violates the regulations. Separate multiple values with commas (,). Valid values:
             * <p>
             * 
             * *   **video**
             * *   **image-cover**
             * *   **text-title**
             */
            public Builder abnormalModules(String abnormalModules) {
                this.abnormalModules = abnormalModules;
                return this;
            }

            /**
             * The results of audio review.
             */
            public Builder audioResult(java.util.List < AudioResult> audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * The results of image review.
             */
            public Builder imageResult(java.util.List < ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * The category of the review result. Separate multiple values with commas (,). Valid values:
             * <p>
             * 
             * *   **porn**
             * *   **terrorism**
             * *   **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**
             * *   **review**
             * *   **pass**
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The results of text review.
             */
            public Builder textResult(java.util.List < TextResult> textResult) {
                this.textResult = textResult;
                return this;
            }

            /**
             * The results of video review.
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
