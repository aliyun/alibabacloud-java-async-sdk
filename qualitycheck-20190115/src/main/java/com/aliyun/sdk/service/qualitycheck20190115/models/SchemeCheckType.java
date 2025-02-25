// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link SchemeCheckType} extends {@link TeaModel}
 *
 * <p>SchemeCheckType</p>
 */
public class SchemeCheckType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckName")
    private String checkName;

    @com.aliyun.core.annotation.NameInMap("CheckType")
    private Long checkType;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Integer enable;

    @com.aliyun.core.annotation.NameInMap("SchemeId")
    private Long schemeId;

    @com.aliyun.core.annotation.NameInMap("SchemeScoreInfoList")
    private java.util.List<SchemeScoreInfoList> schemeScoreInfoList;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Integer score;

    @com.aliyun.core.annotation.NameInMap("SourceScore")
    private Integer sourceScore;

    @com.aliyun.core.annotation.NameInMap("TaskFlowScoreInfoList")
    private java.util.List<TaskFlowScoreInfoList> taskFlowScoreInfoList;

    private SchemeCheckType(Builder builder) {
        this.checkName = builder.checkName;
        this.checkType = builder.checkType;
        this.enable = builder.enable;
        this.schemeId = builder.schemeId;
        this.schemeScoreInfoList = builder.schemeScoreInfoList;
        this.score = builder.score;
        this.sourceScore = builder.sourceScore;
        this.taskFlowScoreInfoList = builder.taskFlowScoreInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchemeCheckType create() {
        return builder().build();
    }

    /**
     * @return checkName
     */
    public String getCheckName() {
        return this.checkName;
    }

    /**
     * @return checkType
     */
    public Long getCheckType() {
        return this.checkType;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return schemeId
     */
    public Long getSchemeId() {
        return this.schemeId;
    }

    /**
     * @return schemeScoreInfoList
     */
    public java.util.List<SchemeScoreInfoList> getSchemeScoreInfoList() {
        return this.schemeScoreInfoList;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return this.score;
    }

    /**
     * @return sourceScore
     */
    public Integer getSourceScore() {
        return this.sourceScore;
    }

    /**
     * @return taskFlowScoreInfoList
     */
    public java.util.List<TaskFlowScoreInfoList> getTaskFlowScoreInfoList() {
        return this.taskFlowScoreInfoList;
    }

    public static final class Builder {
        private String checkName; 
        private Long checkType; 
        private Integer enable; 
        private Long schemeId; 
        private java.util.List<SchemeScoreInfoList> schemeScoreInfoList; 
        private Integer score; 
        private Integer sourceScore; 
        private java.util.List<TaskFlowScoreInfoList> taskFlowScoreInfoList; 

        /**
         * CheckName.
         */
        public Builder checkName(String checkName) {
            this.checkName = checkName;
            return this;
        }

        /**
         * CheckType.
         */
        public Builder checkType(Long checkType) {
            this.checkType = checkType;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Integer enable) {
            this.enable = enable;
            return this;
        }

        /**
         * SchemeId.
         */
        public Builder schemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * SchemeScoreInfoList.
         */
        public Builder schemeScoreInfoList(java.util.List<SchemeScoreInfoList> schemeScoreInfoList) {
            this.schemeScoreInfoList = schemeScoreInfoList;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        /**
         * SourceScore.
         */
        public Builder sourceScore(Integer sourceScore) {
            this.sourceScore = sourceScore;
            return this;
        }

        /**
         * TaskFlowScoreInfoList.
         */
        public Builder taskFlowScoreInfoList(java.util.List<TaskFlowScoreInfoList> taskFlowScoreInfoList) {
            this.taskFlowScoreInfoList = taskFlowScoreInfoList;
            return this;
        }

        public SchemeCheckType build() {
            return new SchemeCheckType(this);
        } 

    } 

    /**
     * 
     * {@link SchemeCheckType} extends {@link TeaModel}
     *
     * <p>SchemeCheckType</p>
     */
    public static class SchemeScoreInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @com.aliyun.core.annotation.NameInMap("ScoreRuleHitType")
        private Integer scoreRuleHitType;

        @com.aliyun.core.annotation.NameInMap("ScoreType")
        private Integer scoreType;

        @com.aliyun.core.annotation.NameInMap("TaskFlowId")
        private Long taskFlowId;

        @com.aliyun.core.annotation.NameInMap("TaskFlowName")
        private String taskFlowName;

        private SchemeScoreInfoList(Builder builder) {
            this.name = builder.name;
            this.rid = builder.rid;
            this.scoreNum = builder.scoreNum;
            this.scoreNumType = builder.scoreNumType;
            this.scoreRuleHitType = builder.scoreRuleHitType;
            this.scoreType = builder.scoreType;
            this.taskFlowId = builder.taskFlowId;
            this.taskFlowName = builder.taskFlowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeScoreInfoList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreNumType
         */
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        /**
         * @return scoreRuleHitType
         */
        public Integer getScoreRuleHitType() {
            return this.scoreRuleHitType;
        }

        /**
         * @return scoreType
         */
        public Integer getScoreType() {
            return this.scoreType;
        }

        /**
         * @return taskFlowId
         */
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        /**
         * @return taskFlowName
         */
        public String getTaskFlowName() {
            return this.taskFlowName;
        }

        public static final class Builder {
            private String name; 
            private Long rid; 
            private Integer scoreNum; 
            private Integer scoreNumType; 
            private Integer scoreRuleHitType; 
            private Integer scoreType; 
            private Long taskFlowId; 
            private String taskFlowName; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * ScoreNum.
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * ScoreNumType.
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * ScoreRuleHitType.
             */
            public Builder scoreRuleHitType(Integer scoreRuleHitType) {
                this.scoreRuleHitType = scoreRuleHitType;
                return this;
            }

            /**
             * ScoreType.
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * TaskFlowId.
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            /**
             * TaskFlowName.
             */
            public Builder taskFlowName(String taskFlowName) {
                this.taskFlowName = taskFlowName;
                return this;
            }

            public SchemeScoreInfoList build() {
                return new SchemeScoreInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SchemeCheckType} extends {@link TeaModel}
     *
     * <p>SchemeCheckType</p>
     */
    public static class TaskFlowScoreInfoListSchemeScoreInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @com.aliyun.core.annotation.NameInMap("ScoreRuleHitType")
        private Integer scoreRuleHitType;

        @com.aliyun.core.annotation.NameInMap("ScoreType")
        private Integer scoreType;

        @com.aliyun.core.annotation.NameInMap("TaskFlowId")
        private Long taskFlowId;

        @com.aliyun.core.annotation.NameInMap("TaskFlowName")
        private String taskFlowName;

        private TaskFlowScoreInfoListSchemeScoreInfoList(Builder builder) {
            this.name = builder.name;
            this.rid = builder.rid;
            this.scoreNum = builder.scoreNum;
            this.scoreNumType = builder.scoreNumType;
            this.scoreRuleHitType = builder.scoreRuleHitType;
            this.scoreType = builder.scoreType;
            this.taskFlowId = builder.taskFlowId;
            this.taskFlowName = builder.taskFlowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlowScoreInfoListSchemeScoreInfoList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreNumType
         */
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        /**
         * @return scoreRuleHitType
         */
        public Integer getScoreRuleHitType() {
            return this.scoreRuleHitType;
        }

        /**
         * @return scoreType
         */
        public Integer getScoreType() {
            return this.scoreType;
        }

        /**
         * @return taskFlowId
         */
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        /**
         * @return taskFlowName
         */
        public String getTaskFlowName() {
            return this.taskFlowName;
        }

        public static final class Builder {
            private String name; 
            private Long rid; 
            private Integer scoreNum; 
            private Integer scoreNumType; 
            private Integer scoreRuleHitType; 
            private Integer scoreType; 
            private Long taskFlowId; 
            private String taskFlowName; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * ScoreNum.
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * ScoreNumType.
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * ScoreRuleHitType.
             */
            public Builder scoreRuleHitType(Integer scoreRuleHitType) {
                this.scoreRuleHitType = scoreRuleHitType;
                return this;
            }

            /**
             * ScoreType.
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * TaskFlowId.
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            /**
             * TaskFlowName.
             */
            public Builder taskFlowName(String taskFlowName) {
                this.taskFlowName = taskFlowName;
                return this;
            }

            public TaskFlowScoreInfoListSchemeScoreInfoList build() {
                return new TaskFlowScoreInfoListSchemeScoreInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SchemeCheckType} extends {@link TeaModel}
     *
     * <p>SchemeCheckType</p>
     */
    public static class TaskFlowScoreInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchemeScoreInfoList")
        private java.util.List<TaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList;

        @com.aliyun.core.annotation.NameInMap("TaskFlowId")
        private Long taskFlowId;

        @com.aliyun.core.annotation.NameInMap("TaskFlowName")
        private String taskFlowName;

        @com.aliyun.core.annotation.NameInMap("TaskFlowType")
        private Integer taskFlowType;

        private TaskFlowScoreInfoList(Builder builder) {
            this.schemeScoreInfoList = builder.schemeScoreInfoList;
            this.taskFlowId = builder.taskFlowId;
            this.taskFlowName = builder.taskFlowName;
            this.taskFlowType = builder.taskFlowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlowScoreInfoList create() {
            return builder().build();
        }

        /**
         * @return schemeScoreInfoList
         */
        public java.util.List<TaskFlowScoreInfoListSchemeScoreInfoList> getSchemeScoreInfoList() {
            return this.schemeScoreInfoList;
        }

        /**
         * @return taskFlowId
         */
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        /**
         * @return taskFlowName
         */
        public String getTaskFlowName() {
            return this.taskFlowName;
        }

        /**
         * @return taskFlowType
         */
        public Integer getTaskFlowType() {
            return this.taskFlowType;
        }

        public static final class Builder {
            private java.util.List<TaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList; 
            private Long taskFlowId; 
            private String taskFlowName; 
            private Integer taskFlowType; 

            /**
             * SchemeScoreInfoList.
             */
            public Builder schemeScoreInfoList(java.util.List<TaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList) {
                this.schemeScoreInfoList = schemeScoreInfoList;
                return this;
            }

            /**
             * TaskFlowId.
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            /**
             * TaskFlowName.
             */
            public Builder taskFlowName(String taskFlowName) {
                this.taskFlowName = taskFlowName;
                return this;
            }

            /**
             * TaskFlowType.
             */
            public Builder taskFlowType(Integer taskFlowType) {
                this.taskFlowType = taskFlowType;
                return this;
            }

            public TaskFlowScoreInfoList build() {
                return new TaskFlowScoreInfoList(this);
            } 

        } 

    }
}
