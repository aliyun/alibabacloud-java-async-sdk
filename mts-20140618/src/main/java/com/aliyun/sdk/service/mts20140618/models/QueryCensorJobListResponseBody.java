// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCensorJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCensorJobListResponseBody</p>
 */
public class QueryCensorJobListResponseBody extends TeaModel {
    @NameInMap("CensorJobList")
    private CensorJobList censorJobList;

    @NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCensorJobListResponseBody(Builder builder) {
        this.censorJobList = builder.censorJobList;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCensorJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return censorJobList
     */
    public CensorJobList getCensorJobList() {
        return this.censorJobList;
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
        private CensorJobList censorJobList; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * CensorJobList.
         */
        public Builder censorJobList(CensorJobList censorJobList) {
            this.censorJobList = censorJobList;
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

        public QueryCensorJobListResponseBody build() {
            return new QueryCensorJobListResponseBody(this);
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
    public static class CensorConfig extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Interval")
        private String interval;

        @NameInMap("OutputFile")
        private OutputFile outputFile;

        @NameInMap("SaveType")
        private String saveType;

        @NameInMap("Scenes")
        private String scenes;

        private CensorConfig(Builder builder) {
            this.bizType = builder.bizType;
            this.interval = builder.interval;
            this.outputFile = builder.outputFile;
            this.saveType = builder.saveType;
            this.scenes = builder.scenes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorConfig create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return saveType
         */
        public String getSaveType() {
            return this.saveType;
        }

        /**
         * @return scenes
         */
        public String getScenes() {
            return this.scenes;
        }

        public static final class Builder {
            private String bizType; 
            private String interval; 
            private OutputFile outputFile; 
            private String saveType; 
            private String scenes; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
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
             * SaveType.
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * Scenes.
             */
            public Builder scenes(String scenes) {
                this.scenes = scenes;
                return this;
            }

            public CensorConfig build() {
                return new CensorConfig(this);
            } 

        } 

    }
    public static class Counter extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
        private String label;

        private Counter(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Counter create() {
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Counter build() {
                return new Counter(this);
            } 

        } 

    }
    public static class PornCounterList extends TeaModel {
        @NameInMap("Counter")
        private java.util.List < Counter> counter;

        private PornCounterList(Builder builder) {
            this.counter = builder.counter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PornCounterList create() {
            return builder().build();
        }

        /**
         * @return counter
         */
        public java.util.List < Counter> getCounter() {
            return this.counter;
        }

        public static final class Builder {
            private java.util.List < Counter> counter; 

            /**
             * Counter.
             */
            public Builder counter(java.util.List < Counter> counter) {
                this.counter = counter;
                return this;
            }

            public PornCounterList build() {
                return new PornCounterList(this);
            } 

        } 

    }
    public static class Top extends TeaModel {
        @NameInMap("Index")
        private String index;

        @NameInMap("Label")
        private String label;

        @NameInMap("Object")
        private String object;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        private Top(Builder builder) {
            this.index = builder.index;
            this.label = builder.label;
            this.object = builder.object;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Top create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
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
            private String index; 
            private String label; 
            private String object; 
            private String score; 
            private String timestamp; 

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Top build() {
                return new Top(this);
            } 

        } 

    }
    public static class PornTopList extends TeaModel {
        @NameInMap("Top")
        private java.util.List < Top> top;

        private PornTopList(Builder builder) {
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PornTopList create() {
            return builder().build();
        }

        /**
         * @return top
         */
        public java.util.List < Top> getTop() {
            return this.top;
        }

        public static final class Builder {
            private java.util.List < Top> top; 

            /**
             * Top.
             */
            public Builder top(java.util.List < Top> top) {
                this.top = top;
                return this;
            }

            public PornTopList build() {
                return new PornTopList(this);
            } 

        } 

    }
    public static class CensorPornResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("PornCounterList")
        private PornCounterList pornCounterList;

        @NameInMap("PornTopList")
        private PornTopList pornTopList;

        @NameInMap("Suggestion")
        private String suggestion;

        private CensorPornResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.pornCounterList = builder.pornCounterList;
            this.pornTopList = builder.pornTopList;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorPornResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
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
         * @return pornCounterList
         */
        public PornCounterList getPornCounterList() {
            return this.pornCounterList;
        }

        /**
         * @return pornTopList
         */
        public PornTopList getPornTopList() {
            return this.pornTopList;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String averageScore; 
            private String label; 
            private String maxScore; 
            private PornCounterList pornCounterList; 
            private PornTopList pornTopList; 
            private String suggestion; 

            /**
             * AverageScore.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * MaxScore.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * PornCounterList.
             */
            public Builder pornCounterList(PornCounterList pornCounterList) {
                this.pornCounterList = pornCounterList;
                return this;
            }

            /**
             * PornTopList.
             */
            public Builder pornTopList(PornTopList pornTopList) {
                this.pornTopList = pornTopList;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public CensorPornResult build() {
                return new CensorPornResult(this);
            } 

        } 

    }
    public static class TerrorismCounterListCounter extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Label")
        private String label;

        private TerrorismCounterListCounter(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismCounterListCounter create() {
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public TerrorismCounterListCounter build() {
                return new TerrorismCounterListCounter(this);
            } 

        } 

    }
    public static class TerrorismCounterList extends TeaModel {
        @NameInMap("Counter")
        private java.util.List < TerrorismCounterListCounter> counter;

        private TerrorismCounterList(Builder builder) {
            this.counter = builder.counter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismCounterList create() {
            return builder().build();
        }

        /**
         * @return counter
         */
        public java.util.List < TerrorismCounterListCounter> getCounter() {
            return this.counter;
        }

        public static final class Builder {
            private java.util.List < TerrorismCounterListCounter> counter; 

            /**
             * Counter.
             */
            public Builder counter(java.util.List < TerrorismCounterListCounter> counter) {
                this.counter = counter;
                return this;
            }

            public TerrorismCounterList build() {
                return new TerrorismCounterList(this);
            } 

        } 

    }
    public static class TerrorismTopListTop extends TeaModel {
        @NameInMap("Index")
        private String index;

        @NameInMap("Label")
        private String label;

        @NameInMap("Object")
        private String object;

        @NameInMap("Score")
        private String score;

        @NameInMap("Timestamp")
        private String timestamp;

        private TerrorismTopListTop(Builder builder) {
            this.index = builder.index;
            this.label = builder.label;
            this.object = builder.object;
            this.score = builder.score;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismTopListTop create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
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
            private String index; 
            private String label; 
            private String object; 
            private String score; 
            private String timestamp; 

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TerrorismTopListTop build() {
                return new TerrorismTopListTop(this);
            } 

        } 

    }
    public static class TerrorismTopList extends TeaModel {
        @NameInMap("Top")
        private java.util.List < TerrorismTopListTop> top;

        private TerrorismTopList(Builder builder) {
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerrorismTopList create() {
            return builder().build();
        }

        /**
         * @return top
         */
        public java.util.List < TerrorismTopListTop> getTop() {
            return this.top;
        }

        public static final class Builder {
            private java.util.List < TerrorismTopListTop> top; 

            /**
             * Top.
             */
            public Builder top(java.util.List < TerrorismTopListTop> top) {
                this.top = top;
                return this;
            }

            public TerrorismTopList build() {
                return new TerrorismTopList(this);
            } 

        } 

    }
    public static class CensorTerrorismResult extends TeaModel {
        @NameInMap("AverageScore")
        private String averageScore;

        @NameInMap("Label")
        private String label;

        @NameInMap("MaxScore")
        private String maxScore;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TerrorismCounterList")
        private TerrorismCounterList terrorismCounterList;

        @NameInMap("TerrorismTopList")
        private TerrorismTopList terrorismTopList;

        private CensorTerrorismResult(Builder builder) {
            this.averageScore = builder.averageScore;
            this.label = builder.label;
            this.maxScore = builder.maxScore;
            this.suggestion = builder.suggestion;
            this.terrorismCounterList = builder.terrorismCounterList;
            this.terrorismTopList = builder.terrorismTopList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorTerrorismResult create() {
            return builder().build();
        }

        /**
         * @return averageScore
         */
        public String getAverageScore() {
            return this.averageScore;
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
         * @return terrorismCounterList
         */
        public TerrorismCounterList getTerrorismCounterList() {
            return this.terrorismCounterList;
        }

        /**
         * @return terrorismTopList
         */
        public TerrorismTopList getTerrorismTopList() {
            return this.terrorismTopList;
        }

        public static final class Builder {
            private String averageScore; 
            private String label; 
            private String maxScore; 
            private String suggestion; 
            private TerrorismCounterList terrorismCounterList; 
            private TerrorismTopList terrorismTopList; 

            /**
             * AverageScore.
             */
            public Builder averageScore(String averageScore) {
                this.averageScore = averageScore;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * MaxScore.
             */
            public Builder maxScore(String maxScore) {
                this.maxScore = maxScore;
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
             * TerrorismCounterList.
             */
            public Builder terrorismCounterList(TerrorismCounterList terrorismCounterList) {
                this.terrorismCounterList = terrorismCounterList;
                return this;
            }

            /**
             * TerrorismTopList.
             */
            public Builder terrorismTopList(TerrorismTopList terrorismTopList) {
                this.terrorismTopList = terrorismTopList;
                return this;
            }

            public CensorTerrorismResult build() {
                return new CensorTerrorismResult(this);
            } 

        } 

    }
    public static class ImageCensorResult extends TeaModel {
        @NameInMap("ImageBucket")
        private String imageBucket;

        @NameInMap("ImageLocation")
        private String imageLocation;

        @NameInMap("ImageObject")
        private String imageObject;

        @NameInMap("Result")
        private String result;

        private ImageCensorResult(Builder builder) {
            this.imageBucket = builder.imageBucket;
            this.imageLocation = builder.imageLocation;
            this.imageObject = builder.imageObject;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCensorResult create() {
            return builder().build();
        }

        /**
         * @return imageBucket
         */
        public String getImageBucket() {
            return this.imageBucket;
        }

        /**
         * @return imageLocation
         */
        public String getImageLocation() {
            return this.imageLocation;
        }

        /**
         * @return imageObject
         */
        public String getImageObject() {
            return this.imageObject;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String imageBucket; 
            private String imageLocation; 
            private String imageObject; 
            private String result; 

            /**
             * ImageBucket.
             */
            public Builder imageBucket(String imageBucket) {
                this.imageBucket = imageBucket;
                return this;
            }

            /**
             * ImageLocation.
             */
            public Builder imageLocation(String imageLocation) {
                this.imageLocation = imageLocation;
                return this;
            }

            /**
             * ImageObject.
             */
            public Builder imageObject(String imageObject) {
                this.imageObject = imageObject;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public ImageCensorResult build() {
                return new ImageCensorResult(this);
            } 

        } 

    }
    public static class ImageCensorResults extends TeaModel {
        @NameInMap("ImageCensorResult")
        private java.util.List < ImageCensorResult> imageCensorResult;

        private ImageCensorResults(Builder builder) {
            this.imageCensorResult = builder.imageCensorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCensorResults create() {
            return builder().build();
        }

        /**
         * @return imageCensorResult
         */
        public java.util.List < ImageCensorResult> getImageCensorResult() {
            return this.imageCensorResult;
        }

        public static final class Builder {
            private java.util.List < ImageCensorResult> imageCensorResult; 

            /**
             * ImageCensorResult.
             */
            public Builder imageCensorResult(java.util.List < ImageCensorResult> imageCensorResult) {
                this.imageCensorResult = imageCensorResult;
                return this;
            }

            public ImageCensorResults build() {
                return new ImageCensorResults(this);
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
    public static class CensorJob extends TeaModel {
        @NameInMap("BarrageCensorResult")
        private String barrageCensorResult;

        @NameInMap("CensorConfig")
        private CensorConfig censorConfig;

        @NameInMap("CensorPornResult")
        private CensorPornResult censorPornResult;

        @NameInMap("CensorTerrorismResult")
        private CensorTerrorismResult censorTerrorismResult;

        @NameInMap("Code")
        private String code;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DescCensorResult")
        private String descCensorResult;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageCensorResults")
        private ImageCensorResults imageCensorResults;

        @NameInMap("Input")
        private Input input;

        @NameInMap("Message")
        private String message;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("ResultSaveObject")
        private String resultSaveObject;

        @NameInMap("State")
        private String state;

        @NameInMap("TitleCensorResult")
        private String titleCensorResult;

        @NameInMap("UserData")
        private String userData;

        private CensorJob(Builder builder) {
            this.barrageCensorResult = builder.barrageCensorResult;
            this.censorConfig = builder.censorConfig;
            this.censorPornResult = builder.censorPornResult;
            this.censorTerrorismResult = builder.censorTerrorismResult;
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.descCensorResult = builder.descCensorResult;
            this.id = builder.id;
            this.imageCensorResults = builder.imageCensorResults;
            this.input = builder.input;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.resultSaveObject = builder.resultSaveObject;
            this.state = builder.state;
            this.titleCensorResult = builder.titleCensorResult;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorJob create() {
            return builder().build();
        }

        /**
         * @return barrageCensorResult
         */
        public String getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        /**
         * @return censorConfig
         */
        public CensorConfig getCensorConfig() {
            return this.censorConfig;
        }

        /**
         * @return censorPornResult
         */
        public CensorPornResult getCensorPornResult() {
            return this.censorPornResult;
        }

        /**
         * @return censorTerrorismResult
         */
        public CensorTerrorismResult getCensorTerrorismResult() {
            return this.censorTerrorismResult;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
        public String getDescCensorResult() {
            return this.descCensorResult;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageCensorResults
         */
        public ImageCensorResults getImageCensorResults() {
            return this.imageCensorResults;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
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
         * @return resultSaveObject
         */
        public String getResultSaveObject() {
            return this.resultSaveObject;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return titleCensorResult
         */
        public String getTitleCensorResult() {
            return this.titleCensorResult;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String barrageCensorResult; 
            private CensorConfig censorConfig; 
            private CensorPornResult censorPornResult; 
            private CensorTerrorismResult censorTerrorismResult; 
            private String code; 
            private String creationTime; 
            private String descCensorResult; 
            private String id; 
            private ImageCensorResults imageCensorResults; 
            private Input input; 
            private String message; 
            private String pipelineId; 
            private String resultSaveObject; 
            private String state; 
            private String titleCensorResult; 
            private String userData; 

            /**
             * BarrageCensorResult.
             */
            public Builder barrageCensorResult(String barrageCensorResult) {
                this.barrageCensorResult = barrageCensorResult;
                return this;
            }

            /**
             * CensorConfig.
             */
            public Builder censorConfig(CensorConfig censorConfig) {
                this.censorConfig = censorConfig;
                return this;
            }

            /**
             * CensorPornResult.
             */
            public Builder censorPornResult(CensorPornResult censorPornResult) {
                this.censorPornResult = censorPornResult;
                return this;
            }

            /**
             * CensorTerrorismResult.
             */
            public Builder censorTerrorismResult(CensorTerrorismResult censorTerrorismResult) {
                this.censorTerrorismResult = censorTerrorismResult;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DescCensorResult.
             */
            public Builder descCensorResult(String descCensorResult) {
                this.descCensorResult = descCensorResult;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageCensorResults.
             */
            public Builder imageCensorResults(ImageCensorResults imageCensorResults) {
                this.imageCensorResults = imageCensorResults;
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
             * ResultSaveObject.
             */
            public Builder resultSaveObject(String resultSaveObject) {
                this.resultSaveObject = resultSaveObject;
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
             * TitleCensorResult.
             */
            public Builder titleCensorResult(String titleCensorResult) {
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

            public CensorJob build() {
                return new CensorJob(this);
            } 

        } 

    }
    public static class CensorJobList extends TeaModel {
        @NameInMap("CensorJob")
        private java.util.List < CensorJob> censorJob;

        private CensorJobList(Builder builder) {
            this.censorJob = builder.censorJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorJobList create() {
            return builder().build();
        }

        /**
         * @return censorJob
         */
        public java.util.List < CensorJob> getCensorJob() {
            return this.censorJob;
        }

        public static final class Builder {
            private java.util.List < CensorJob> censorJob; 

            /**
             * CensorJob.
             */
            public Builder censorJob(java.util.List < CensorJob> censorJob) {
                this.censorJob = censorJob;
                return this;
            }

            public CensorJobList build() {
                return new CensorJobList(this);
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
