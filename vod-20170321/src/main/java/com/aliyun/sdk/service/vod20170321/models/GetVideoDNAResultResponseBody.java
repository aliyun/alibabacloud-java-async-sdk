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
 * {@link GetVideoDNAResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoDNAResultResponseBody</p>
 */
public class GetVideoDNAResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoDNAResult")
    private AIVideoDNAResult AIVideoDNAResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVideoDNAResultResponseBody(Builder builder) {
        this.AIVideoDNAResult = builder.AIVideoDNAResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoDNAResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoDNAResult
     */
    public AIVideoDNAResult getAIVideoDNAResult() {
        return this.AIVideoDNAResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoDNAResult AIVideoDNAResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVideoDNAResultResponseBody model) {
            this.AIVideoDNAResult = model.AIVideoDNAResult;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoDNAResult.
         */
        public Builder AIVideoDNAResult(AIVideoDNAResult AIVideoDNAResult) {
            this.AIVideoDNAResult = AIVideoDNAResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVideoDNAResultResponseBody build() {
            return new GetVideoDNAResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoDNAResultResponseBody</p>
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Start.
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
     * {@link GetVideoDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoDNAResultResponseBody</p>
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Start.
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
     * {@link GetVideoDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoDNAResultResponseBody</p>
     */
    public static class FpShotSlices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duplication")
        private Duplication duplication;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private FpShotSlices(Builder builder) {
            this.duplication = builder.duplication;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotSlices create() {
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

            private Builder(FpShotSlices model) {
                this.duplication = model.duplication;
                this.input = model.input;
            } 

            /**
             * Duplication.
             */
            public Builder duplication(Duplication duplication) {
                this.duplication = duplication;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public FpShotSlices build() {
                return new FpShotSlices(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoDNAResultResponseBody</p>
     */
    public static class FpShots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotSlices")
        private java.util.List<FpShotSlices> fpShotSlices;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private String similarity;

        private FpShots(Builder builder) {
            this.fpShotSlices = builder.fpShotSlices;
            this.primaryKey = builder.primaryKey;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShots create() {
            return builder().build();
        }

        /**
         * @return fpShotSlices
         */
        public java.util.List<FpShotSlices> getFpShotSlices() {
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
            private java.util.List<FpShotSlices> fpShotSlices; 
            private String primaryKey; 
            private String similarity; 

            private Builder() {
            } 

            private Builder(FpShots model) {
                this.fpShotSlices = model.fpShotSlices;
                this.primaryKey = model.primaryKey;
                this.similarity = model.similarity;
            } 

            /**
             * FpShotSlices.
             */
            public Builder fpShotSlices(java.util.List<FpShotSlices> fpShotSlices) {
                this.fpShotSlices = fpShotSlices;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * Similarity.
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public FpShots build() {
                return new FpShots(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoDNAResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoDNAResultResponseBody</p>
     */
    public static class AIVideoDNAResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShots")
        private java.util.List<FpShots> fpShots;

        private AIVideoDNAResult(Builder builder) {
            this.fpShots = builder.fpShots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoDNAResult create() {
            return builder().build();
        }

        /**
         * @return fpShots
         */
        public java.util.List<FpShots> getFpShots() {
            return this.fpShots;
        }

        public static final class Builder {
            private java.util.List<FpShots> fpShots; 

            private Builder() {
            } 

            private Builder(AIVideoDNAResult model) {
                this.fpShots = model.fpShots;
            } 

            /**
             * FpShots.
             */
            public Builder fpShots(java.util.List<FpShots> fpShots) {
                this.fpShots = fpShots;
                return this;
            }

            public AIVideoDNAResult build() {
                return new AIVideoDNAResult(this);
            } 

        } 

    }
}
