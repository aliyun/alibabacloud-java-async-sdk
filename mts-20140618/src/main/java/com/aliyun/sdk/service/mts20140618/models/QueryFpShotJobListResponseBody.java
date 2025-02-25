// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFpShotJobListResponseBody</p>
 */
public class QueryFpShotJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FpShotJobList")
    private FpShotJobList fpShotJobList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFpShotJobListResponseBody(Builder builder) {
        this.fpShotJobList = builder.fpShotJobList;
        this.nextPageToken = builder.nextPageToken;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFpShotJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return fpShotJobList
     */
    public FpShotJobList getFpShotJobList() {
        return this.fpShotJobList;
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
        private FpShotJobList fpShotJobList; 
        private String nextPageToken; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * <p>The information about media fingerprint analysis jobs.</p>
         */
        public Builder fpShotJobList(FpShotJobList fpShotJobList) {
            this.fpShotJobList = fpShotJobList;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
         * 
         * <strong>example:</strong>
         * <p>b11c171cced04565b1f38f1ecc39****</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The IDs of the jobs that do not exist.</p>
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFpShotJobListResponseBody build() {
            return new QueryFpShotJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("SaveType")
        private String saveType;

        private FpShotConfig(Builder builder) {
            this.fpDBId = builder.fpDBId;
            this.primaryKey = builder.primaryKey;
            this.saveType = builder.saveType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotConfig create() {
            return builder().build();
        }

        /**
         * @return fpDBId
         */
        public String getFpDBId() {
            return this.fpDBId;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return saveType
         */
        public String getSaveType() {
            return this.saveType;
        }

        public static final class Builder {
            private String fpDBId; 
            private String primaryKey; 
            private String saveType; 

            /**
             * <p>The ID of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>2288c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * <p>The unique primary key of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>3ca84a39a9024f19853b21be9cf9****</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li><strong>nosave</strong>: The fingerprints of the job input are not saved to the media fingerprint library.</li>
             * <li><strong>save</strong>: The fingerprints of the job input are saved to the media fingerprint library only if the job input is not duplicated with media content in the media fingerprint library.</li>
             * <li><strong>forcesave</strong>: The fingerprints of the job input are forcibly saved to the media fingerprint library.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>save</p>
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            public FpShotConfig build() {
                return new FpShotConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class Duplication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Duplication(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Duplication create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * <p>The duration of the similar audio clip in the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start point in time of the similar audio clip in the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Duplication build() {
                return new Duplication(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Input(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * <p>The duration of the similar audio clip in the input audio.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start point in time of the similar audio clip in the input audio.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotSlice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duplication")
        private Duplication duplication;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private FpShotSlice(Builder builder) {
            this.duplication = builder.duplication;
            this.input = builder.input;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotSlice create() {
            return builder().build();
        }

        /**
         * @return duplication
         */
        public Duplication getDuplication() {
            return this.duplication;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private Duplication duplication; 
            private Input input; 
            private String similarity; 

            /**
             * <p>The start point in time and duration of the similar audio clip in the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
             */
            public Builder duplication(Duplication duplication) {
                this.duplication = duplication;
                return this;
            }

            /**
             * <p>The start point in time and duration of the similar audio clip in the input audio.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The similarity of the input audio against the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public FpShotSlice build() {
                return new FpShotSlice(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotSlices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotSlice")
        private java.util.List < FpShotSlice> fpShotSlice;

        private FpShotSlices(Builder builder) {
            this.fpShotSlice = builder.fpShotSlice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotSlices create() {
            return builder().build();
        }

        /**
         * @return fpShotSlice
         */
        public java.util.List < FpShotSlice> getFpShotSlice() {
            return this.fpShotSlice;
        }

        public static final class Builder {
            private java.util.List < FpShotSlice> fpShotSlice; 

            /**
             * FpShotSlice.
             */
            public Builder fpShotSlice(java.util.List < FpShotSlice> fpShotSlice) {
                this.fpShotSlice = fpShotSlice;
                return this;
            }

            public FpShotSlices build() {
                return new FpShotSlices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotSlices")
        private FpShotSlices fpShotSlices;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private FpShot(Builder builder) {
            this.fpShotSlices = builder.fpShotSlices;
            this.primaryKey = builder.primaryKey;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShot create() {
            return builder().build();
        }

        /**
         * @return fpShotSlices
         */
        public FpShotSlices getFpShotSlices() {
            return this.fpShotSlices;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private FpShotSlices fpShotSlices; 
            private String primaryKey; 
            private String similarity; 

            /**
             * <p>The audio files that have similar fingerprints to the input audio in the audio fingerprint library.</p>
             */
            public Builder fpShotSlices(FpShotSlices fpShotSlices) {
                this.fpShotSlices = fpShotSlices;
                return this;
            }

            /**
             * <p>The unique primary key of the input audio.</p>
             * 
             * <strong>example:</strong>
             * <p>498ac941373341599c4777c8d884****</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The overall similarity of the input audio against audio files that have similar fingerprints to the input audio in the audio fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public FpShot build() {
                return new FpShot(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class AudioFpShots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShot")
        private java.util.List < FpShot> fpShot;

        private AudioFpShots(Builder builder) {
            this.fpShot = builder.fpShot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioFpShots create() {
            return builder().build();
        }

        /**
         * @return fpShot
         */
        public java.util.List < FpShot> getFpShot() {
            return this.fpShot;
        }

        public static final class Builder {
            private java.util.List < FpShot> fpShot; 

            /**
             * FpShot.
             */
            public Builder fpShot(java.util.List < FpShot> fpShot) {
                this.fpShot = fpShot;
                return this;
            }

            public AudioFpShots build() {
                return new AudioFpShots(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotSliceDuplication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private FpShotSliceDuplication(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotSliceDuplication create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * <p>The duration of the similar video clip in the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start point in time of the similar video clip in the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>1260</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public FpShotSliceDuplication build() {
                return new FpShotSliceDuplication(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotSliceInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private FpShotSliceInput(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotSliceInput create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * <p>The duration of the similar video clip in the input video.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start point in time of the similar video clip in the input video.</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public FpShotSliceInput build() {
                return new FpShotSliceInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotSlicesFpShotSlice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duplication")
        private FpShotSliceDuplication duplication;

        @com.aliyun.core.annotation.NameInMap("Input")
        private FpShotSliceInput input;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private FpShotSlicesFpShotSlice(Builder builder) {
            this.duplication = builder.duplication;
            this.input = builder.input;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotSlicesFpShotSlice create() {
            return builder().build();
        }

        /**
         * @return duplication
         */
        public FpShotSliceDuplication getDuplication() {
            return this.duplication;
        }

        /**
         * @return input
         */
        public FpShotSliceInput getInput() {
            return this.input;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private FpShotSliceDuplication duplication; 
            private FpShotSliceInput input; 
            private String similarity; 

            /**
             * <p>The start point in time and duration of the similar video clip in the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
             */
            public Builder duplication(FpShotSliceDuplication duplication) {
                this.duplication = duplication;
                return this;
            }

            /**
             * <p>The start time and duration of the similar video clip in the input video.</p>
             */
            public Builder input(FpShotSliceInput input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The similarity of the input video clip against the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public FpShotSlicesFpShotSlice build() {
                return new FpShotSlicesFpShotSlice(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotFpShotSlices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotSlice")
        private java.util.List < FpShotSlicesFpShotSlice> fpShotSlice;

        private FpShotFpShotSlices(Builder builder) {
            this.fpShotSlice = builder.fpShotSlice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotFpShotSlices create() {
            return builder().build();
        }

        /**
         * @return fpShotSlice
         */
        public java.util.List < FpShotSlicesFpShotSlice> getFpShotSlice() {
            return this.fpShotSlice;
        }

        public static final class Builder {
            private java.util.List < FpShotSlicesFpShotSlice> fpShotSlice; 

            /**
             * FpShotSlice.
             */
            public Builder fpShotSlice(java.util.List < FpShotSlicesFpShotSlice> fpShotSlice) {
                this.fpShotSlice = fpShotSlice;
                return this;
            }

            public FpShotFpShotSlices build() {
                return new FpShotFpShotSlices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotsFpShot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotSlices")
        private FpShotFpShotSlices fpShotSlices;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private FpShotsFpShot(Builder builder) {
            this.fpShotSlices = builder.fpShotSlices;
            this.primaryKey = builder.primaryKey;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotsFpShot create() {
            return builder().build();
        }

        /**
         * @return fpShotSlices
         */
        public FpShotFpShotSlices getFpShotSlices() {
            return this.fpShotSlices;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private FpShotFpShotSlices fpShotSlices; 
            private String primaryKey; 
            private String similarity; 

            /**
             * <p>The video files that have similar fingerprints to the input video in the video fingerprint library.</p>
             */
            public Builder fpShotSlices(FpShotFpShotSlices fpShotSlices) {
                this.fpShotSlices = fpShotSlices;
                return this;
            }

            /**
             * <p>The unique primary key of the input video.</p>
             * 
             * <strong>example:</strong>
             * <p>498ac941373341599c4777c8d884****</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The overall similarity of the input video against video files that have similar fingerprints to the input video in the video fingerprint library.</p>
             * <blockquote>
             * <p> The overall similarity is the average value of the similarities of the input video clips with the clips of the video that has a similar fingerprint. If multiple video files that have similar fingerprints to the input video exist in the video fingerprint library, the similarities of the input video against multiple similar video clips are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.8914769887924194</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public FpShotsFpShot build() {
                return new FpShotsFpShot(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShot")
        private java.util.List < FpShotsFpShot> fpShot;

        private FpShots(Builder builder) {
            this.fpShot = builder.fpShot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShots create() {
            return builder().build();
        }

        /**
         * @return fpShot
         */
        public java.util.List < FpShotsFpShot> getFpShot() {
            return this.fpShot;
        }

        public static final class Builder {
            private java.util.List < FpShotsFpShot> fpShot; 

            /**
             * FpShot.
             */
            public Builder fpShot(java.util.List < FpShotsFpShot> fpShot) {
                this.fpShot = fpShot;
                return this;
            }

            public FpShots build() {
                return new FpShots(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class InputFragment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private InputFragment(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFragment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * <p>The duration of the similar text snippet in the input text.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time of the similar text snippet in the input text.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public InputFragment build() {
                return new InputFragment(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class TextFpShotSlice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DuplicationText")
        private String duplicationText;

        @com.aliyun.core.annotation.NameInMap("InputFragment")
        private InputFragment inputFragment;

        @com.aliyun.core.annotation.NameInMap("InputText")
        private String inputText;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private TextFpShotSlice(Builder builder) {
            this.duplicationText = builder.duplicationText;
            this.inputFragment = builder.inputFragment;
            this.inputText = builder.inputText;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextFpShotSlice create() {
            return builder().build();
        }

        /**
         * @return duplicationText
         */
        public String getDuplicationText() {
            return this.duplicationText;
        }

        /**
         * @return inputFragment
         */
        public InputFragment getInputFragment() {
            return this.inputFragment;
        }

        /**
         * @return inputText
         */
        public String getInputText() {
            return this.inputText;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private String duplicationText; 
            private InputFragment inputFragment; 
            private String inputText; 
            private String similarity; 

            /**
             * <p>The text snippet that has similar fingerprints to the input text in the text fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>It&quot;s snowy today.</p>
             */
            public Builder duplicationText(String duplicationText) {
                this.duplicationText = duplicationText;
                return this;
            }

            /**
             * <p>The start point in time and duration of the similar text snippet in the input text.</p>
             */
            public Builder inputFragment(InputFragment inputFragment) {
                this.inputFragment = inputFragment;
                return this;
            }

            /**
             * <p>The input text for text fingerprint analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>It&quot;s snowy today.</p>
             */
            public Builder inputText(String inputText) {
                this.inputText = inputText;
                return this;
            }

            /**
             * <p>The similarity of the input text against the text snippet that has similar fingerprints to the input text in the text fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public TextFpShotSlice build() {
                return new TextFpShotSlice(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class TextFpShotSlices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TextFpShotSlice")
        private java.util.List < TextFpShotSlice> textFpShotSlice;

        private TextFpShotSlices(Builder builder) {
            this.textFpShotSlice = builder.textFpShotSlice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextFpShotSlices create() {
            return builder().build();
        }

        /**
         * @return textFpShotSlice
         */
        public java.util.List < TextFpShotSlice> getTextFpShotSlice() {
            return this.textFpShotSlice;
        }

        public static final class Builder {
            private java.util.List < TextFpShotSlice> textFpShotSlice; 

            /**
             * TextFpShotSlice.
             */
            public Builder textFpShotSlice(java.util.List < TextFpShotSlice> textFpShotSlice) {
                this.textFpShotSlice = textFpShotSlice;
                return this;
            }

            public TextFpShotSlices build() {
                return new TextFpShotSlices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class TextFpShot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        @com.aliyun.core.annotation.NameInMap("TextFpShotSlices")
        private TextFpShotSlices textFpShotSlices;

        private TextFpShot(Builder builder) {
            this.primaryKey = builder.primaryKey;
            this.similarity = builder.similarity;
            this.textFpShotSlices = builder.textFpShotSlices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextFpShot create() {
            return builder().build();
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        /**
         * @return textFpShotSlices
         */
        public TextFpShotSlices getTextFpShotSlices() {
            return this.textFpShotSlices;
        }

        public static final class Builder {
            private String primaryKey; 
            private String similarity; 
            private TextFpShotSlices textFpShotSlices; 

            /**
             * <p>The unique primary key of the input text.</p>
             * 
             * <strong>example:</strong>
             * <p>3e34ac649945b53a1b0f863ce030****</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The similarity of the input text against text snippets that have similar fingerprints to the input text in the text fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            /**
             * <p>The text snippets that have similar fingerprints to the input text in the text fingerprint library.</p>
             */
            public Builder textFpShotSlices(TextFpShotSlices textFpShotSlices) {
                this.textFpShotSlices = textFpShotSlices;
                return this;
            }

            public TextFpShot build() {
                return new TextFpShot(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class TextFpShots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TextFpShot")
        private java.util.List < TextFpShot> textFpShot;

        private TextFpShots(Builder builder) {
            this.textFpShot = builder.textFpShot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextFpShots create() {
            return builder().build();
        }

        /**
         * @return textFpShot
         */
        public java.util.List < TextFpShot> getTextFpShot() {
            return this.textFpShot;
        }

        public static final class Builder {
            private java.util.List < TextFpShot> textFpShot; 

            /**
             * TextFpShot.
             */
            public Builder textFpShot(java.util.List < TextFpShot> textFpShot) {
                this.textFpShot = textFpShot;
                return this;
            }

            public TextFpShots build() {
                return new TextFpShots(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFpShots")
        private AudioFpShots audioFpShots;

        @com.aliyun.core.annotation.NameInMap("FpShots")
        private FpShots fpShots;

        @com.aliyun.core.annotation.NameInMap("TextFpShots")
        private TextFpShots textFpShots;

        private FpShotResult(Builder builder) {
            this.audioFpShots = builder.audioFpShots;
            this.fpShots = builder.fpShots;
            this.textFpShots = builder.textFpShots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotResult create() {
            return builder().build();
        }

        /**
         * @return audioFpShots
         */
        public AudioFpShots getAudioFpShots() {
            return this.audioFpShots;
        }

        /**
         * @return fpShots
         */
        public FpShots getFpShots() {
            return this.fpShots;
        }

        /**
         * @return textFpShots
         */
        public TextFpShots getTextFpShots() {
            return this.textFpShots;
        }

        public static final class Builder {
            private AudioFpShots audioFpShots; 
            private FpShots fpShots; 
            private TextFpShots textFpShots; 

            /**
             * <p>The audio fingerprint analysis results.</p>
             */
            public Builder audioFpShots(AudioFpShots audioFpShots) {
                this.audioFpShots = audioFpShots;
                return this;
            }

            /**
             * <p>The video fingerprint analysis results.</p>
             */
            public Builder fpShots(FpShots fpShots) {
                this.fpShots = fpShots;
                return this;
            }

            /**
             * <p>The text fingerprint analysis results.</p>
             */
            public Builder textFpShots(TextFpShots textFpShots) {
                this.textFpShots = textFpShots;
                return this;
            }

            public FpShotResult build() {
                return new FpShotResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class InputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private InputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
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
             * <p>The OSS bucket in which the job input resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-test</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the job input resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-beijing</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) object that is used as the job input.</p>
             * 
             * <strong>example:</strong>
             * <p>test.mp4</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("FpShotConfig")
        private FpShotConfig fpShotConfig;

        @com.aliyun.core.annotation.NameInMap("FpShotResult")
        private FpShotResult fpShotResult;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private FpShotJob(Builder builder) {
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.duration = builder.duration;
            this.fileId = builder.fileId;
            this.finishTime = builder.finishTime;
            this.fpShotConfig = builder.fpShotConfig;
            this.fpShotResult = builder.fpShotResult;
            this.id = builder.id;
            this.input = builder.input;
            this.inputFile = builder.inputFile;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.state = builder.state;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotJob create() {
            return builder().build();
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
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return fpShotConfig
         */
        public FpShotConfig getFpShotConfig() {
            return this.fpShotConfig;
        }

        /**
         * @return fpShotResult
         */
        public FpShotResult getFpShotResult() {
            return this.fpShotResult;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
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
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private String creationTime; 
            private Integer duration; 
            private String fileId; 
            private String finishTime; 
            private FpShotConfig fpShotConfig; 
            private FpShotResult fpShotResult; 
            private String id; 
            private String input; 
            private InputFile inputFile; 
            private String message; 
            private String pipelineId; 
            private String state; 
            private String userData; 

            /**
             * <p>The error code returned if the job fails.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.UUIDFormatInvalid</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-10T12:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The length of the input file.
             * Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the uploaded file.</p>
             * 
             * <strong>example:</strong>
             * <p>ebb51ee30f0b49aba959823fa991****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The time when the job was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The configurations of the job.</p>
             */
            public Builder fpShotConfig(FpShotConfig fpShotConfig) {
                this.fpShotConfig = fpShotConfig;
                return this;
            }

            /**
             * <p>The results of the media fingerprint analysis job.</p>
             */
            public Builder fpShotResult(FpShotResult fpShotResult) {
                this.fpShotResult = fpShotResult;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The information about the job input.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Bucket&quot;:&quot;oss-test&quot;,&quot;Location&quot;:&quot;oss-cn-beijing&quot;,&quot;Object&quot;:&quot;test.mp4&quot;}</p>
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The information about the job input.</p>
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The error message returned if the job fails. This parameter is not returned if the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The parameter &quot;Id&quot; is invalid.A uuid must:1)be comprised of chracters[a-f],numbers[0-9];2)be 32 characters long</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the MPS queue to which the analysis job is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>Queuing</strong>: The job is waiting in the queue.</li>
             * <li><strong>Analysing</strong>: The job is in progress.</li>
             * <li><strong>Success</strong>: The job is successful.</li>
             * <li><strong>Fail</strong>: The job fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The custom data.</p>
             * 
             * <strong>example:</strong>
             * <p>testid-001</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public FpShotJob build() {
                return new FpShotJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class FpShotJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotJob")
        private java.util.List < FpShotJob> fpShotJob;

        private FpShotJobList(Builder builder) {
            this.fpShotJob = builder.fpShotJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotJobList create() {
            return builder().build();
        }

        /**
         * @return fpShotJob
         */
        public java.util.List < FpShotJob> getFpShotJob() {
            return this.fpShotJob;
        }

        public static final class Builder {
            private java.util.List < FpShotJob> fpShotJob; 

            /**
             * FpShotJob.
             */
            public Builder fpShotJob(java.util.List < FpShotJob> fpShotJob) {
                this.fpShotJob = fpShotJob;
                return this;
            }

            public FpShotJobList build() {
                return new FpShotJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFpShotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFpShotJobListResponseBody</p>
     */
    public static class NonExistIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
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
