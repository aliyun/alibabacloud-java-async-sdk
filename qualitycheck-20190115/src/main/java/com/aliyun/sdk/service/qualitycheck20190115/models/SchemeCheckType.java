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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SchemeCheckType model) {
            this.checkName = model.checkName;
            this.checkType = model.checkType;
            this.enable = model.enable;
            this.schemeId = model.schemeId;
            this.schemeScoreInfoList = model.schemeScoreInfoList;
            this.score = model.score;
            this.sourceScore = model.sourceScore;
            this.taskFlowScoreInfoList = model.taskFlowScoreInfoList;
        } 

        /**
         * <p>Check item name</p>
         * 
         * <strong>example:</strong>
         * <p>流程规则</p>
         */
        public Builder checkName(String checkName) {
            this.checkName = checkName;
            return this;
        }

        /**
         * <p>Quality inspection dimension ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkType(Long checkType) {
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>Is enabled</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enable(Integer enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Quality inspection scheme ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder schemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * <p>List of scoring items under the check item. See SchemeScoreInfo.</p>
         */
        public Builder schemeScoreInfoList(java.util.List<SchemeScoreInfoList> schemeScoreInfoList) {
            this.schemeScoreInfoList = schemeScoreInfoList;
            return this;
        }

        /**
         * <p>Final score</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        /**
         * <p>Original score</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sourceScore(Integer sourceScore) {
            this.sourceScore = sourceScore;
            return this;
        }

        /**
         * <p>List of scoring items under the check item. See TaskFlowScoreInfo.</p>
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

            private Builder() {
            } 

            private Builder(SchemeScoreInfoList model) {
                this.name = model.name;
                this.rid = model.rid;
                this.scoreNum = model.scoreNum;
                this.scoreNumType = model.scoreNumType;
                this.scoreRuleHitType = model.scoreRuleHitType;
                this.scoreType = model.scoreType;
                this.taskFlowId = model.taskFlowId;
                this.taskFlowName = model.taskFlowName;
            } 

            /**
             * <p>Rule Name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Rule ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * <p>Agent rating: default 0, [0, 100]</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * <p>0 – Add or subtract points after triggering a rule</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * <p>0 – Score when hitting an edge zone</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scoreRuleHitType(Integer scoreRuleHitType) {
                this.scoreRuleHitType = scoreRuleHitType;
                return this;
            }

            /**
             * <p>1 for adding points, 3 for deducting points; default is 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * <p>Flow ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            /**
             * <p>Flow name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
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

            private Builder() {
            } 

            private Builder(TaskFlowScoreInfoListSchemeScoreInfoList model) {
                this.name = model.name;
                this.rid = model.rid;
                this.scoreNum = model.scoreNum;
                this.scoreNumType = model.scoreNumType;
                this.scoreRuleHitType = model.scoreRuleHitType;
                this.scoreType = model.scoreType;
                this.taskFlowId = model.taskFlowId;
                this.taskFlowName = model.taskFlowName;
            } 

            /**
             * <p>Rule Name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Rule ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * <p>Agent score: default is 0, range [0, 100]</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * <p>0 – Points added or deducted after a rule is triggered</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * <p>0—score when a hit occurs at an edge zone</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scoreRuleHitType(Integer scoreRuleHitType) {
                this.scoreRuleHitType = scoreRuleHitType;
                return this;
            }

            /**
             * <p>1 for adding points, 3 for deducting points; default is 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * <p>Flow ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            /**
             * <p>flow name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
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

            private Builder() {
            } 

            private Builder(TaskFlowScoreInfoList model) {
                this.schemeScoreInfoList = model.schemeScoreInfoList;
                this.taskFlowId = model.taskFlowId;
                this.taskFlowName = model.taskFlowName;
                this.taskFlowType = model.taskFlowType;
            } 

            /**
             * <p>list of scoring items</p>
             */
            public Builder schemeScoreInfoList(java.util.List<TaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList) {
                this.schemeScoreInfoList = schemeScoreInfoList;
                return this;
            }

            /**
             * <p>Flow ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            /**
             * <p>flow name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder taskFlowName(String taskFlowName) {
                this.taskFlowName = taskFlowName;
                return this;
            }

            /**
             * <p>\&quot;Flow version: 0: tree, 1: graph\&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
