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
 * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaDNAResultResponseBody</p>
 */
public class GetMediaDNAResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DNAResult")
    private DNAResult DNAResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaDNAResultResponseBody(Builder builder) {
        this.DNAResult = builder.DNAResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaDNAResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DNAResult
     */
    public DNAResult getDNAResult() {
        return this.DNAResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DNAResult DNAResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMediaDNAResultResponseBody model) {
            this.DNAResult = model.DNAResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The media fingerprinting results.</p>
         */
        public Builder DNAResult(DNAResult DNAResult) {
            this.DNAResult = DNAResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>63FC4896-E956-4B*****7D-134FF1BC597A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaDNAResultResponseBody build() {
            return new GetMediaDNAResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaDNAResultResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Duplication model) {
                this.duration = model.duration;
                this.start = model.start;
            } 

            /**
             * <p>The duration of the video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12.0</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time of the video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
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
     * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaDNAResultResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.duration = model.duration;
                this.start = model.start;
            } 

            /**
             * <p>The duration of the video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12.0</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time of the video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
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
     * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaDNAResultResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duplication")
        private Duplication duplication;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private Detail(Builder builder) {
            this.duplication = builder.duplication;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
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

        public static final class Builder {
            private Duplication duplication; 
            private Input input; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.duplication = model.duplication;
                this.input = model.input;
            } 

            /**
             * <p>The start time and duration of the matched video.</p>
             */
            public Builder duplication(Duplication duplication) {
                this.duplication = duplication;
                return this;
            }

            /**
             * <p>The start time and duration of the input video.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaDNAResultResponseBody</p>
     */
    public static class VideoDNA extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private VideoDNA(Builder builder) {
            this.detail = builder.detail;
            this.primaryKey = builder.primaryKey;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoDNA create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
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
            private java.util.List<Detail> detail; 
            private String primaryKey; 
            private String similarity; 

            private Builder() {
            } 

            private Builder(VideoDNA model) {
                this.detail = model.detail;
                this.primaryKey = model.primaryKey;
                this.similarity = model.similarity;
            } 

            /**
             * <p>The details of the matched video. Information such as the location and duration of the video is returned.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The ID of the video that has a similar fingerprint.</p>
             * 
             * <strong>example:</strong>
             * <p>6ad8987da46f4b*****490ce2873745</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The similarity between the fingerprints of the input video and the matched video. 1 indicates that the fingerprints of the two videos are the same.</p>
             * 
             * <strong>example:</strong>
             * <p>0.98</p>
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public VideoDNA build() {
                return new VideoDNA(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaDNAResultResponseBody</p>
     */
    public static class DNAResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoDNA")
        private java.util.List<VideoDNA> videoDNA;

        private DNAResult(Builder builder) {
            this.videoDNA = builder.videoDNA;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DNAResult create() {
            return builder().build();
        }

        /**
         * @return videoDNA
         */
        public java.util.List<VideoDNA> getVideoDNA() {
            return this.videoDNA;
        }

        public static final class Builder {
            private java.util.List<VideoDNA> videoDNA; 

            private Builder() {
            } 

            private Builder(DNAResult model) {
                this.videoDNA = model.videoDNA;
            } 

            /**
             * <p>The video fingerprint recognition result.</p>
             */
            public Builder videoDNA(java.util.List<VideoDNA> videoDNA) {
                this.videoDNA = videoDNA;
                return this;
            }

            public DNAResult build() {
                return new DNAResult(this);
            } 

        } 

    }
}
