// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The information about the intelligent review job.
         */
        public Builder mediaAuditJob(MediaAuditJob mediaAuditJob) {
            this.mediaAuditJob = mediaAuditJob;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIMediaAuditJobResponseBody build() {
            return new GetAIMediaAuditJobResponseBody(this);
        } 

    } 

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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **normal**
             * *   **spam**
             * *   **ad**
             * *   **politics**
             * *   **terrorism**
             * *   **abuse**
             * *   **porn**
             * *   **flood**: spam posts
             * *   **contraband**
             * *   **meaningless**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The review scenario. Valid value: **antispam**.
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
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * 
             * Valid values if scene is **ad**:
             * 
             * *   **normal**
             * *   **ad**
             * *   **politics**
             * *   **porn**
             * *   **abuse**
             * *   **terrorism**
             * *   **contraband**
             * *   **spam**
             * *   **npx**: illegal ad
             * *   **qrcode**: QR code
             * *   **programCode**
             * 
             * Valid values if scene is **live**:
             * 
             * *   **normal**
             * *   **meaningless**
             * *   **PIP**
             * *   **smoking**
             * *   **drivelive**
             * 
             * Valid values if scene is **logo**:
             * 
             * *   **normal**
             * *   **TV**
             * *   **trademark**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The review scenario. Valid values:
             * <p>
             * 
             * *   **porn**
             * *   **terrorism**
             * *   **ad**
             * *   **live**: undesirable scenes
             * *   **logo**
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

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
             * *   **ad**
             * *   **live**: undesirable scenes
             * *   **logo**
             * *   **audio**: audio anti-spam
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
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The type of the image. Valid value: **cover**.
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
             * The text.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **spam**
             * *   **ad**
             * *   **abuse**
             * *   **flood**: spam posts
             * *   **contraband**
             * *   **meaningless**
             * *   **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The review scenario. Valid value: **antispam**.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The score is representative of the confidence.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * The number of images.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **ad**
             * *   **normal**
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **ad**
             * *   **normal**
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
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List < CounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
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
             * *   **ad**
             * *   **normal**
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
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * The number of images.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **live**: The content contains undesirable scenes.
             * *   **normal**
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **live**: The content contains undesirable scenes.
             * *   **normal**
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
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List < LiveResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
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
             * The categories of the review results and the number of images.
             */
            public Builder counterList(java.util.List < LiveResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **live**: The content contains undesirable scenes.
             * *   **normal**
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
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * The number of images.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **logo**
             * *   **normal**
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
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **logo**
             * *   **normal**
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
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List < LogoResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
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
             * The average score of the images of the category that is indicated by Label.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The categories of the review results and the number of images.
             */
            public Builder counterList(java.util.List < LogoResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **logo**
             * *   **normal**
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The highest score of the image of the category that is indicated by Label.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * The number of images.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

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

            public PornResultCounterList build() {
                return new PornResultCounterList(this);
            } 

        } 

    }
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
             * The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.
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
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List < PornResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
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
             * The average score of the images of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The categories of the review results and the number of images.
             */
            public Builder counterList(java.util.List < PornResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

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
             * The highest score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * The number of images.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **terrorism**
             * *   **outfit**
             * *   **logo**
             * *   **weapon**
             * *   **politics**
             * *   **others**
             * *   **normal**
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
             * The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.
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
        @com.aliyun.core.annotation.NameInMap("AverageScore")
        private String averageScore;

        @com.aliyun.core.annotation.NameInMap("CounterList")
        private java.util.List < TerrorismResultCounterList> counterList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MaxScore")
        private String maxScore;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TopList")
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
             * The average score of the images of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * The categories of the review results and the number of images.
             */
            public Builder counterList(java.util.List < TerrorismResultCounterList> counterList) {
                this.counterList = counterList;
                return this;
            }

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
             * The highest score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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
             * The results of ad review.
             */
            public Builder adResult(AdResult adResult) {
                this.adResult = adResult;
                return this;
            }

            /**
             * The category of the review result. Valid values:
             * <p>
             * 
             * *   **ad**
             * *   **normal**
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
             * The results of pornography content review.
             */
            public Builder pornResult(PornResult pornResult) {
                this.pornResult = pornResult;
                return this;
            }

            /**
             * The recommendation for review results. Valid values:
             * <p>
             * 
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The results of terrorism content review.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalModules")
        private String abnormalModules;

        @com.aliyun.core.annotation.NameInMap("AudioResult")
        private java.util.List < AudioResult> audioResult;

        @com.aliyun.core.annotation.NameInMap("ImageResult")
        private java.util.List < ImageResult> imageResult;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TextResult")
        private java.util.List < TextResult> textResult;

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
             * *   **video**: the video.
             * *   **image-cover**: the cover.
             * *   **text-title**: the title.
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
             * *   **ad**
             * *   **live**: undesirable scenes
             * *   **logo**
             * *   **audio**: audio anti-spam
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
             * *   **block**: The content violates the regulations.
             * *   **review**: The content may violate the regulations.
             * *   **pass**: The content passes the review.
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
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

            /**
             * The error code. This parameter is returned if the value of Status is fail.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The time when the job is complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The time when the job started to run. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The job result data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The ID of the job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The ID of the video.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The error message. This parameter is returned if the value of Status is fail.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   **success**: The job is successful.
             * *   **fail**: The job failed.
             * *   **init**: The job is being initialized.
             * *   **Processing**: The job is in progress.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Only the job type is supported.
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
