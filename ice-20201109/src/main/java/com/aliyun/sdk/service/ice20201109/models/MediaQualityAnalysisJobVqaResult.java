// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
 *
 * <p>MediaQualityAnalysisJobVqaResult</p>
 */
public class MediaQualityAnalysisJobVqaResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Block")
    private MediaQualityAnalysisJobVqaScoreDetail block;

    @com.aliyun.core.annotation.NameInMap("Color")
    private MediaQualityAnalysisJobVqaScoreDetail color;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private MediaQualityAnalysisJobVqaScoreDetail detail;

    @com.aliyun.core.annotation.NameInMap("Noise")
    private MediaQualityAnalysisJobVqaScoreDetail noise;

    @com.aliyun.core.annotation.NameInMap("ScoreResult")
    private ScoreResult scoreResult;

    @com.aliyun.core.annotation.NameInMap("Sharp")
    private MediaQualityAnalysisJobVqaScoreDetail sharp;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private MediaQualityAnalysisJobVqaResult(Builder builder) {
        this.block = builder.block;
        this.color = builder.color;
        this.detail = builder.detail;
        this.noise = builder.noise;
        this.scoreResult = builder.scoreResult;
        this.sharp = builder.sharp;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaQualityAnalysisJobVqaResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return block
     */
    public MediaQualityAnalysisJobVqaScoreDetail getBlock() {
        return this.block;
    }

    /**
     * @return color
     */
    public MediaQualityAnalysisJobVqaScoreDetail getColor() {
        return this.color;
    }

    /**
     * @return detail
     */
    public MediaQualityAnalysisJobVqaScoreDetail getDetail() {
        return this.detail;
    }

    /**
     * @return noise
     */
    public MediaQualityAnalysisJobVqaScoreDetail getNoise() {
        return this.noise;
    }

    /**
     * @return scoreResult
     */
    public ScoreResult getScoreResult() {
        return this.scoreResult;
    }

    /**
     * @return sharp
     */
    public MediaQualityAnalysisJobVqaScoreDetail getSharp() {
        return this.sharp;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private MediaQualityAnalysisJobVqaScoreDetail block; 
        private MediaQualityAnalysisJobVqaScoreDetail color; 
        private MediaQualityAnalysisJobVqaScoreDetail detail; 
        private MediaQualityAnalysisJobVqaScoreDetail noise; 
        private ScoreResult scoreResult; 
        private MediaQualityAnalysisJobVqaScoreDetail sharp; 
        private String state; 

        private Builder() {
        } 

        private Builder(MediaQualityAnalysisJobVqaResult model) {
            this.block = model.block;
            this.color = model.color;
            this.detail = model.detail;
            this.noise = model.noise;
            this.scoreResult = model.scoreResult;
            this.sharp = model.sharp;
            this.state = model.state;
        } 

        /**
         * Block.
         */
        public Builder block(MediaQualityAnalysisJobVqaScoreDetail block) {
            this.block = block;
            return this;
        }

        /**
         * Color.
         */
        public Builder color(MediaQualityAnalysisJobVqaScoreDetail color) {
            this.color = color;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(MediaQualityAnalysisJobVqaScoreDetail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Noise.
         */
        public Builder noise(MediaQualityAnalysisJobVqaScoreDetail noise) {
            this.noise = noise;
            return this;
        }

        /**
         * ScoreResult.
         */
        public Builder scoreResult(ScoreResult scoreResult) {
            this.scoreResult = scoreResult;
            return this;
        }

        /**
         * Sharp.
         */
        public Builder sharp(MediaQualityAnalysisJobVqaScoreDetail sharp) {
            this.sharp = sharp;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public MediaQualityAnalysisJobVqaResult build() {
            return new MediaQualityAnalysisJobVqaResult(this);
        } 

    } 

    /**
     * 
     * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJobVqaResult</p>
     */
    public static class Block extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntensityValue")
        private Double intensityValue;

        @com.aliyun.core.annotation.NameInMap("PerceptualScore")
        private Double perceptualScore;

        private Block(Builder builder) {
            this.intensityValue = builder.intensityValue;
            this.perceptualScore = builder.perceptualScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Block create() {
            return builder().build();
        }

        /**
         * @return intensityValue
         */
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        /**
         * @return perceptualScore
         */
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

        public static final class Builder {
            private Double intensityValue; 
            private Double perceptualScore; 

            private Builder() {
            } 

            private Builder(Block model) {
                this.intensityValue = model.intensityValue;
                this.perceptualScore = model.perceptualScore;
            } 

            /**
             * IntensityValue.
             */
            public Builder intensityValue(Double intensityValue) {
                this.intensityValue = intensityValue;
                return this;
            }

            /**
             * PerceptualScore.
             */
            public Builder perceptualScore(Double perceptualScore) {
                this.perceptualScore = perceptualScore;
                return this;
            }

            public Block build() {
                return new Block(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJobVqaResult</p>
     */
    public static class Color extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntensityValue")
        private Double intensityValue;

        @com.aliyun.core.annotation.NameInMap("PerceptualScore")
        private Double perceptualScore;

        private Color(Builder builder) {
            this.intensityValue = builder.intensityValue;
            this.perceptualScore = builder.perceptualScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Color create() {
            return builder().build();
        }

        /**
         * @return intensityValue
         */
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        /**
         * @return perceptualScore
         */
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

        public static final class Builder {
            private Double intensityValue; 
            private Double perceptualScore; 

            private Builder() {
            } 

            private Builder(Color model) {
                this.intensityValue = model.intensityValue;
                this.perceptualScore = model.perceptualScore;
            } 

            /**
             * IntensityValue.
             */
            public Builder intensityValue(Double intensityValue) {
                this.intensityValue = intensityValue;
                return this;
            }

            /**
             * PerceptualScore.
             */
            public Builder perceptualScore(Double perceptualScore) {
                this.perceptualScore = perceptualScore;
                return this;
            }

            public Color build() {
                return new Color(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJobVqaResult</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntensityValue")
        private Double intensityValue;

        @com.aliyun.core.annotation.NameInMap("PerceptualScore")
        private Double perceptualScore;

        private Detail(Builder builder) {
            this.intensityValue = builder.intensityValue;
            this.perceptualScore = builder.perceptualScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return intensityValue
         */
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        /**
         * @return perceptualScore
         */
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

        public static final class Builder {
            private Double intensityValue; 
            private Double perceptualScore; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.intensityValue = model.intensityValue;
                this.perceptualScore = model.perceptualScore;
            } 

            /**
             * IntensityValue.
             */
            public Builder intensityValue(Double intensityValue) {
                this.intensityValue = intensityValue;
                return this;
            }

            /**
             * PerceptualScore.
             */
            public Builder perceptualScore(Double perceptualScore) {
                this.perceptualScore = perceptualScore;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJobVqaResult</p>
     */
    public static class Noise extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntensityValue")
        private Double intensityValue;

        @com.aliyun.core.annotation.NameInMap("PerceptualScore")
        private Double perceptualScore;

        private Noise(Builder builder) {
            this.intensityValue = builder.intensityValue;
            this.perceptualScore = builder.perceptualScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Noise create() {
            return builder().build();
        }

        /**
         * @return intensityValue
         */
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        /**
         * @return perceptualScore
         */
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

        public static final class Builder {
            private Double intensityValue; 
            private Double perceptualScore; 

            private Builder() {
            } 

            private Builder(Noise model) {
                this.intensityValue = model.intensityValue;
                this.perceptualScore = model.perceptualScore;
            } 

            /**
             * IntensityValue.
             */
            public Builder intensityValue(Double intensityValue) {
                this.intensityValue = intensityValue;
                return this;
            }

            /**
             * PerceptualScore.
             */
            public Builder perceptualScore(Double perceptualScore) {
                this.perceptualScore = perceptualScore;
                return this;
            }

            public Noise build() {
                return new Noise(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJobVqaResult</p>
     */
    public static class Sharp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntensityValue")
        private Double intensityValue;

        @com.aliyun.core.annotation.NameInMap("PerceptualScore")
        private Double perceptualScore;

        private Sharp(Builder builder) {
            this.intensityValue = builder.intensityValue;
            this.perceptualScore = builder.perceptualScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sharp create() {
            return builder().build();
        }

        /**
         * @return intensityValue
         */
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        /**
         * @return perceptualScore
         */
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

        public static final class Builder {
            private Double intensityValue; 
            private Double perceptualScore; 

            private Builder() {
            } 

            private Builder(Sharp model) {
                this.intensityValue = model.intensityValue;
                this.perceptualScore = model.perceptualScore;
            } 

            /**
             * IntensityValue.
             */
            public Builder intensityValue(Double intensityValue) {
                this.intensityValue = intensityValue;
                return this;
            }

            /**
             * PerceptualScore.
             */
            public Builder perceptualScore(Double perceptualScore) {
                this.perceptualScore = perceptualScore;
                return this;
            }

            public Sharp build() {
                return new Sharp(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaQualityAnalysisJobVqaResult} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJobVqaResult</p>
     */
    public static class ScoreResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Block block;

        @com.aliyun.core.annotation.NameInMap("Color")
        private Color color;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("Noise")
        private Noise noise;

        @com.aliyun.core.annotation.NameInMap("Sharp")
        private Sharp sharp;

        private ScoreResult(Builder builder) {
            this.block = builder.block;
            this.color = builder.color;
            this.detail = builder.detail;
            this.noise = builder.noise;
            this.sharp = builder.sharp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreResult create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Block getBlock() {
            return this.block;
        }

        /**
         * @return color
         */
        public Color getColor() {
            return this.color;
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return noise
         */
        public Noise getNoise() {
            return this.noise;
        }

        /**
         * @return sharp
         */
        public Sharp getSharp() {
            return this.sharp;
        }

        public static final class Builder {
            private Block block; 
            private Color color; 
            private Detail detail; 
            private Noise noise; 
            private Sharp sharp; 

            private Builder() {
            } 

            private Builder(ScoreResult model) {
                this.block = model.block;
                this.color = model.color;
                this.detail = model.detail;
                this.noise = model.noise;
                this.sharp = model.sharp;
            } 

            /**
             * Block.
             */
            public Builder block(Block block) {
                this.block = block;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(Color color) {
                this.color = color;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Noise.
             */
            public Builder noise(Noise noise) {
                this.noise = noise;
                return this;
            }

            /**
             * Sharp.
             */
            public Builder sharp(Sharp sharp) {
                this.sharp = sharp;
                return this;
            }

            public ScoreResult build() {
                return new ScoreResult(this);
            } 

        } 

    }
}
