// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RankingModelVersion} extends {@link TeaModel}
 *
 * <p>RankingModelVersion</p>
 */
public class RankingModelVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RunLog")
    private String runLog;

    @com.aliyun.core.annotation.NameInMap("RunResult")
    private RunResult runResult;

    @com.aliyun.core.annotation.NameInMap("RunTime")
    private String runTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private RankingModelVersion(Builder builder) {
        this.name = builder.name;
        this.runLog = builder.runLog;
        this.runResult = builder.runResult;
        this.runTime = builder.runTime;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RankingModelVersion create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return runLog
     */
    public String getRunLog() {
        return this.runLog;
    }

    /**
     * @return runResult
     */
    public RunResult getRunResult() {
        return this.runResult;
    }

    /**
     * @return runTime
     */
    public String getRunTime() {
        return this.runTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder {
        private String name; 
        private String runLog; 
        private RunResult runResult; 
        private String runTime; 
        private String status; 
        private String templateId; 
        private String templateName; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RunLog.
         */
        public Builder runLog(String runLog) {
            this.runLog = runLog;
            return this;
        }

        /**
         * RunResult.
         */
        public Builder runResult(RunResult runResult) {
            this.runResult = runResult;
            return this;
        }

        /**
         * RunTime.
         */
        public Builder runTime(String runTime) {
            this.runTime = runTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public RankingModelVersion build() {
            return new RankingModelVersion(this);
        } 

    } 

    /**
     * 
     * {@link RankingModelVersion} extends {@link TeaModel}
     *
     * <p>RankingModelVersion</p>
     */
    public static class RunResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssessAuc")
        private String assessAuc;

        @com.aliyun.core.annotation.NameInMap("AssessGauc")
        private String assessGauc;

        @com.aliyun.core.annotation.NameInMap("AssessLoss")
        private String assessLoss;

        @com.aliyun.core.annotation.NameInMap("TrainAuc")
        private String trainAuc;

        @com.aliyun.core.annotation.NameInMap("TrainGauc")
        private String trainGauc;

        @com.aliyun.core.annotation.NameInMap("TrainLoss")
        private String trainLoss;

        private RunResult(Builder builder) {
            this.assessAuc = builder.assessAuc;
            this.assessGauc = builder.assessGauc;
            this.assessLoss = builder.assessLoss;
            this.trainAuc = builder.trainAuc;
            this.trainGauc = builder.trainGauc;
            this.trainLoss = builder.trainLoss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunResult create() {
            return builder().build();
        }

        /**
         * @return assessAuc
         */
        public String getAssessAuc() {
            return this.assessAuc;
        }

        /**
         * @return assessGauc
         */
        public String getAssessGauc() {
            return this.assessGauc;
        }

        /**
         * @return assessLoss
         */
        public String getAssessLoss() {
            return this.assessLoss;
        }

        /**
         * @return trainAuc
         */
        public String getTrainAuc() {
            return this.trainAuc;
        }

        /**
         * @return trainGauc
         */
        public String getTrainGauc() {
            return this.trainGauc;
        }

        /**
         * @return trainLoss
         */
        public String getTrainLoss() {
            return this.trainLoss;
        }

        public static final class Builder {
            private String assessAuc; 
            private String assessGauc; 
            private String assessLoss; 
            private String trainAuc; 
            private String trainGauc; 
            private String trainLoss; 

            /**
             * AssessAuc.
             */
            public Builder assessAuc(String assessAuc) {
                this.assessAuc = assessAuc;
                return this;
            }

            /**
             * AssessGauc.
             */
            public Builder assessGauc(String assessGauc) {
                this.assessGauc = assessGauc;
                return this;
            }

            /**
             * AssessLoss.
             */
            public Builder assessLoss(String assessLoss) {
                this.assessLoss = assessLoss;
                return this;
            }

            /**
             * TrainAuc.
             */
            public Builder trainAuc(String trainAuc) {
                this.trainAuc = trainAuc;
                return this;
            }

            /**
             * TrainGauc.
             */
            public Builder trainGauc(String trainGauc) {
                this.trainGauc = trainGauc;
                return this;
            }

            /**
             * TrainLoss.
             */
            public Builder trainLoss(String trainLoss) {
                this.trainLoss = trainLoss;
                return this;
            }

            public RunResult build() {
                return new RunResult(this);
            } 

        } 

    }
}
