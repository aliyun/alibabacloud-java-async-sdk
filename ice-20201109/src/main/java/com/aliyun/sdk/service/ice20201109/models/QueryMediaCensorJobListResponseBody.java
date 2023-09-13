// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaCensorJobListResponseBody</p>
 */
public class QueryMediaCensorJobListResponseBody extends TeaModel {
    @NameInMap("MediaCensorJobList")
    private MediaCensorJobList mediaCensorJobList;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @NameInMap("RequestId")
    private String requestId;

    private QueryMediaCensorJobListResponseBody(Builder builder) {
        this.mediaCensorJobList = builder.mediaCensorJobList;
        this.nextPageToken = builder.nextPageToken;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaCensorJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaCensorJobList
     */
    public MediaCensorJobList getMediaCensorJobList() {
        return this.mediaCensorJobList;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return nonExistIds
     */
    public NonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaCensorJobList mediaCensorJobList; 
        private String nextPageToken; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * MediaCensorJobList.
         */
        public Builder mediaCensorJobList(MediaCensorJobList mediaCensorJobList) {
            this.mediaCensorJobList = mediaCensorJobList;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * NonExistIds.
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaCensorJobListResponseBody build() {
            return new QueryMediaCensorJobListResponseBody(this);
        } 

    } 

    public static class BarrageCensorResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private String rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private BarrageCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarrageCensorResult create() {
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
        public String getRate() {
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
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public BarrageCensorResult build() {
                return new BarrageCensorResult(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private String rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private Result(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
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
         * @return rate
         */
        public String getRate() {
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
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
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
    public static class Results extends TeaModel {
        @NameInMap("Result")
        private java.util.List < Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class CoverImageCensorResult extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        @NameInMap("Results")
        private Results results;

        private CoverImageCensorResult(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverImageCensorResult create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private Results results; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            public CoverImageCensorResult build() {
                return new CoverImageCensorResult(this);
            } 

        } 

    }
    public static class CoverImageCensorResults extends TeaModel {
        @NameInMap("CoverImageCensorResult")
        private java.util.List < CoverImageCensorResult> coverImageCensorResult;

        private CoverImageCensorResults(Builder builder) {
            this.coverImageCensorResult = builder.coverImageCensorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverImageCensorResults create() {
            return builder().build();
        }

        /**
         * @return coverImageCensorResult
         */
        public java.util.List < CoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

        public static final class Builder {
            private java.util.List < CoverImageCensorResult> coverImageCensorResult; 

            /**
             * CoverImageCensorResult.
             */
            public Builder coverImageCensorResult(java.util.List < CoverImageCensorResult> coverImageCensorResult) {
                this.coverImageCensorResult = coverImageCensorResult;
                return this;
            }

            public CoverImageCensorResults build() {
                return new CoverImageCensorResults(this);
            } 

        } 

    }
    public static class DescCensorResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private String rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private DescCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescCensorResult create() {
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
        public String getRate() {
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
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public DescCensorResult build() {
                return new DescCensorResult(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private Input(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class TitleCensorResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private String rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private TitleCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TitleCensorResult create() {
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
        public String getRate() {
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
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public TitleCensorResult build() {
                return new TitleCensorResult(this);
            } 

        } 

    }
    public static class CensorResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private String rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private CensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorResult create() {
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
        public String getRate() {
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
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public CensorResult build() {
                return new CensorResult(this);
            } 

        } 

    }
    public static class CensorResults extends TeaModel {
        @NameInMap("CensorResult")
        private java.util.List < CensorResult> censorResult;

        private CensorResults(Builder builder) {
            this.censorResult = builder.censorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorResults create() {
            return builder().build();
        }

        /**
         * @return censorResult
         */
        public java.util.List < CensorResult> getCensorResult() {
            return this.censorResult;
        }

        public static final class Builder {
            private java.util.List < CensorResult> censorResult; 

            /**
             * CensorResult.
             */
            public Builder censorResult(java.util.List < CensorResult> censorResult) {
                this.censorResult = censorResult;
                return this;
            }

            public CensorResults build() {
                return new CensorResults(this);
            } 

        } 

    }
    public static class CensorResultsCensorResult extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Rate")
        private String rate;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private CensorResultsCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorResultsCensorResult create() {
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
        public String getRate() {
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
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public CensorResultsCensorResult build() {
                return new CensorResultsCensorResult(this);
            } 

        } 

    }
    public static class VideoTimelineCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        private java.util.List < CensorResultsCensorResult> censorResult;

        private VideoTimelineCensorResults(Builder builder) {
            this.censorResult = builder.censorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTimelineCensorResults create() {
            return builder().build();
        }

        /**
         * @return censorResult
         */
        public java.util.List < CensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

        public static final class Builder {
            private java.util.List < CensorResultsCensorResult> censorResult; 

            /**
             * CensorResult.
             */
            public Builder censorResult(java.util.List < CensorResultsCensorResult> censorResult) {
                this.censorResult = censorResult;
                return this;
            }

            public VideoTimelineCensorResults build() {
                return new VideoTimelineCensorResults(this);
            } 

        } 

    }
    public static class VideoTimeline extends TeaModel {
        @NameInMap("CensorResults")
        private VideoTimelineCensorResults censorResults;

        @NameInMap("Object")
        private String object;

        @NameInMap("Timestamp")
        private String timestamp;

        private VideoTimeline(Builder builder) {
            this.censorResults = builder.censorResults;
            this.object = builder.object;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTimeline create() {
            return builder().build();
        }

        /**
         * @return censorResults
         */
        public VideoTimelineCensorResults getCensorResults() {
            return this.censorResults;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private VideoTimelineCensorResults censorResults; 
            private String object; 
            private String timestamp; 

            /**
             * CensorResults.
             */
            public Builder censorResults(VideoTimelineCensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public VideoTimeline build() {
                return new VideoTimeline(this);
            } 

        } 

    }
    public static class VideoTimelines extends TeaModel {
        @NameInMap("VideoTimeline")
        private java.util.List < VideoTimeline> videoTimeline;

        private VideoTimelines(Builder builder) {
            this.videoTimeline = builder.videoTimeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTimelines create() {
            return builder().build();
        }

        /**
         * @return videoTimeline
         */
        public java.util.List < VideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

        public static final class Builder {
            private java.util.List < VideoTimeline> videoTimeline; 

            /**
             * VideoTimeline.
             */
            public Builder videoTimeline(java.util.List < VideoTimeline> videoTimeline) {
                this.videoTimeline = videoTimeline;
                return this;
            }

            public VideoTimelines build() {
                return new VideoTimelines(this);
            } 

        } 

    }
    public static class VensorCensorResult extends TeaModel {
        @NameInMap("CensorResults")
        private CensorResults censorResults;

        @NameInMap("NextPageToken")
        private String nextPageToken;

        @NameInMap("VideoTimelines")
        private VideoTimelines videoTimelines;

        private VensorCensorResult(Builder builder) {
            this.censorResults = builder.censorResults;
            this.nextPageToken = builder.nextPageToken;
            this.videoTimelines = builder.videoTimelines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VensorCensorResult create() {
            return builder().build();
        }

        /**
         * @return censorResults
         */
        public CensorResults getCensorResults() {
            return this.censorResults;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return videoTimelines
         */
        public VideoTimelines getVideoTimelines() {
            return this.videoTimelines;
        }

        public static final class Builder {
            private CensorResults censorResults; 
            private String nextPageToken; 
            private VideoTimelines videoTimelines; 

            /**
             * CensorResults.
             */
            public Builder censorResults(CensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * NextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * VideoTimelines.
             */
            public Builder videoTimelines(VideoTimelines videoTimelines) {
                this.videoTimelines = videoTimelines;
                return this;
            }

            public VensorCensorResult build() {
                return new VensorCensorResult(this);
            } 

        } 

    }
    public static class OutputFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private OutputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    public static class VideoCensorConfig extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("OutputFile")
        private OutputFile outputFile;

        @NameInMap("VideoCensor")
        private String videoCensor;

        private VideoCensorConfig(Builder builder) {
            this.bizType = builder.bizType;
            this.outputFile = builder.outputFile;
            this.videoCensor = builder.videoCensor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoCensorConfig create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return videoCensor
         */
        public String getVideoCensor() {
            return this.videoCensor;
        }

        public static final class Builder {
            private String bizType; 
            private OutputFile outputFile; 
            private String videoCensor; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * OutputFile.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * VideoCensor.
             */
            public Builder videoCensor(String videoCensor) {
                this.videoCensor = videoCensor;
                return this;
            }

            public VideoCensorConfig build() {
                return new VideoCensorConfig(this);
            } 

        } 

    }
    public static class MediaCensorJob extends TeaModel {
        @NameInMap("BarrageCensorResult")
        private BarrageCensorResult barrageCensorResult;

        @NameInMap("Code")
        private String code;

        @NameInMap("CoverImageCensorResults")
        private CoverImageCensorResults coverImageCensorResults;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DescCensorResult")
        private DescCensorResult descCensorResult;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Input")
        private Input input;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("State")
        private String state;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TitleCensorResult")
        private TitleCensorResult titleCensorResult;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("VensorCensorResult")
        private VensorCensorResult vensorCensorResult;

        @NameInMap("VideoCensorConfig")
        private VideoCensorConfig videoCensorConfig;

        private MediaCensorJob(Builder builder) {
            this.barrageCensorResult = builder.barrageCensorResult;
            this.code = builder.code;
            this.coverImageCensorResults = builder.coverImageCensorResults;
            this.creationTime = builder.creationTime;
            this.descCensorResult = builder.descCensorResult;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.state = builder.state;
            this.suggestion = builder.suggestion;
            this.titleCensorResult = builder.titleCensorResult;
            this.userData = builder.userData;
            this.vensorCensorResult = builder.vensorCensorResult;
            this.videoCensorConfig = builder.videoCensorConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaCensorJob create() {
            return builder().build();
        }

        /**
         * @return barrageCensorResult
         */
        public BarrageCensorResult getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return coverImageCensorResults
         */
        public CoverImageCensorResults getCoverImageCensorResults() {
            return this.coverImageCensorResults;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return descCensorResult
         */
        public DescCensorResult getDescCensorResult() {
            return this.descCensorResult;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return titleCensorResult
         */
        public TitleCensorResult getTitleCensorResult() {
            return this.titleCensorResult;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return vensorCensorResult
         */
        public VensorCensorResult getVensorCensorResult() {
            return this.vensorCensorResult;
        }

        /**
         * @return videoCensorConfig
         */
        public VideoCensorConfig getVideoCensorConfig() {
            return this.videoCensorConfig;
        }

        public static final class Builder {
            private BarrageCensorResult barrageCensorResult; 
            private String code; 
            private CoverImageCensorResults coverImageCensorResults; 
            private String creationTime; 
            private DescCensorResult descCensorResult; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private String message; 
            private String pipelineId; 
            private String state; 
            private String suggestion; 
            private TitleCensorResult titleCensorResult; 
            private String userData; 
            private VensorCensorResult vensorCensorResult; 
            private VideoCensorConfig videoCensorConfig; 

            /**
             * BarrageCensorResult.
             */
            public Builder barrageCensorResult(BarrageCensorResult barrageCensorResult) {
                this.barrageCensorResult = barrageCensorResult;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CoverImageCensorResults.
             */
            public Builder coverImageCensorResults(CoverImageCensorResults coverImageCensorResults) {
                this.coverImageCensorResults = coverImageCensorResults;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DescCensorResult.
             */
            public Builder descCensorResult(DescCensorResult descCensorResult) {
                this.descCensorResult = descCensorResult;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * TitleCensorResult.
             */
            public Builder titleCensorResult(TitleCensorResult titleCensorResult) {
                this.titleCensorResult = titleCensorResult;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * VensorCensorResult.
             */
            public Builder vensorCensorResult(VensorCensorResult vensorCensorResult) {
                this.vensorCensorResult = vensorCensorResult;
                return this;
            }

            /**
             * VideoCensorConfig.
             */
            public Builder videoCensorConfig(VideoCensorConfig videoCensorConfig) {
                this.videoCensorConfig = videoCensorConfig;
                return this;
            }

            public MediaCensorJob build() {
                return new MediaCensorJob(this);
            } 

        } 

    }
    public static class MediaCensorJobList extends TeaModel {
        @NameInMap("MediaCensorJob")
        private java.util.List < MediaCensorJob> mediaCensorJob;

        private MediaCensorJobList(Builder builder) {
            this.mediaCensorJob = builder.mediaCensorJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaCensorJobList create() {
            return builder().build();
        }

        /**
         * @return mediaCensorJob
         */
        public java.util.List < MediaCensorJob> getMediaCensorJob() {
            return this.mediaCensorJob;
        }

        public static final class Builder {
            private java.util.List < MediaCensorJob> mediaCensorJob; 

            /**
             * MediaCensorJob.
             */
            public Builder mediaCensorJob(java.util.List < MediaCensorJob> mediaCensorJob) {
                this.mediaCensorJob = mediaCensorJob;
                return this;
            }

            public MediaCensorJobList build() {
                return new MediaCensorJobList(this);
            } 

        } 

    }
    public static class NonExistIds extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private NonExistIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
}
