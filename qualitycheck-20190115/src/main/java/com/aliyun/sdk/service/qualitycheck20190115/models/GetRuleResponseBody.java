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
 * {@link GetRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleResponseBody</p>
 */
public class GetRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleResponseBody build() {
            return new GetRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class BusinessCategoryNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessCategoryNameList")
        private java.util.List<String> businessCategoryNameList;

        private BusinessCategoryNameList(Builder builder) {
            this.businessCategoryNameList = builder.businessCategoryNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessCategoryNameList create() {
            return builder().build();
        }

        /**
         * @return businessCategoryNameList
         */
        public java.util.List<String> getBusinessCategoryNameList() {
            return this.businessCategoryNameList;
        }

        public static final class Builder {
            private java.util.List<String> businessCategoryNameList; 

            private Builder() {
            } 

            private Builder(BusinessCategoryNameList model) {
                this.businessCategoryNameList = model.businessCategoryNameList;
            } 

            /**
             * BusinessCategoryNameList.
             */
            public Builder businessCategoryNameList(java.util.List<String> businessCategoryNameList) {
                this.businessCategoryNameList = businessCategoryNameList;
                return this;
            }

            public BusinessCategoryNameList build() {
                return new BusinessCategoryNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class RuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReview")
        private Integer autoReview;

        @com.aliyun.core.annotation.NameInMap("BusinessCategoryNameList")
        private BusinessCategoryNameList businessCategoryNameList;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateEmpid")
        private String createEmpid;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsDelete")
        private Integer isDelete;

        @com.aliyun.core.annotation.NameInMap("IsOnline")
        private Integer isOnline;

        @com.aliyun.core.annotation.NameInMap("LastUpdateEmpid")
        private String lastUpdateEmpid;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private String lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("RuleLambda")
        private String ruleLambda;

        @com.aliyun.core.annotation.NameInMap("RuleScoreType")
        private Integer ruleScoreType;

        @com.aliyun.core.annotation.NameInMap("ScoreId")
        private Integer scoreId;

        @com.aliyun.core.annotation.NameInMap("ScoreName")
        private String scoreName;

        @com.aliyun.core.annotation.NameInMap("ScoreSubId")
        private Integer scoreSubId;

        @com.aliyun.core.annotation.NameInMap("ScoreSubName")
        private String scoreSubName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private RuleInfo(Builder builder) {
            this.autoReview = builder.autoReview;
            this.businessCategoryNameList = builder.businessCategoryNameList;
            this.comments = builder.comments;
            this.createEmpid = builder.createEmpid;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.isDelete = builder.isDelete;
            this.isOnline = builder.isOnline;
            this.lastUpdateEmpid = builder.lastUpdateEmpid;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.name = builder.name;
            this.rid = builder.rid;
            this.ruleLambda = builder.ruleLambda;
            this.ruleScoreType = builder.ruleScoreType;
            this.scoreId = builder.scoreId;
            this.scoreName = builder.scoreName;
            this.scoreSubId = builder.scoreSubId;
            this.scoreSubName = builder.scoreSubName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfo create() {
            return builder().build();
        }

        /**
         * @return autoReview
         */
        public Integer getAutoReview() {
            return this.autoReview;
        }

        /**
         * @return businessCategoryNameList
         */
        public BusinessCategoryNameList getBusinessCategoryNameList() {
            return this.businessCategoryNameList;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createEmpid
         */
        public String getCreateEmpid() {
            return this.createEmpid;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isDelete
         */
        public Integer getIsDelete() {
            return this.isDelete;
        }

        /**
         * @return isOnline
         */
        public Integer getIsOnline() {
            return this.isOnline;
        }

        /**
         * @return lastUpdateEmpid
         */
        public String getLastUpdateEmpid() {
            return this.lastUpdateEmpid;
        }

        /**
         * @return lastUpdateTime
         */
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
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
        public String getRid() {
            return this.rid;
        }

        /**
         * @return ruleLambda
         */
        public String getRuleLambda() {
            return this.ruleLambda;
        }

        /**
         * @return ruleScoreType
         */
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        /**
         * @return scoreId
         */
        public Integer getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreName
         */
        public String getScoreName() {
            return this.scoreName;
        }

        /**
         * @return scoreSubId
         */
        public Integer getScoreSubId() {
            return this.scoreSubId;
        }

        /**
         * @return scoreSubName
         */
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer autoReview; 
            private BusinessCategoryNameList businessCategoryNameList; 
            private String comments; 
            private String createEmpid; 
            private String createTime; 
            private String endTime; 
            private Integer isDelete; 
            private Integer isOnline; 
            private String lastUpdateEmpid; 
            private String lastUpdateTime; 
            private String name; 
            private String rid; 
            private String ruleLambda; 
            private Integer ruleScoreType; 
            private Integer scoreId; 
            private String scoreName; 
            private Integer scoreSubId; 
            private String scoreSubName; 
            private String startTime; 
            private Integer status; 
            private Integer type; 
            private String weight; 

            private Builder() {
            } 

            private Builder(RuleInfo model) {
                this.autoReview = model.autoReview;
                this.businessCategoryNameList = model.businessCategoryNameList;
                this.comments = model.comments;
                this.createEmpid = model.createEmpid;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.isDelete = model.isDelete;
                this.isOnline = model.isOnline;
                this.lastUpdateEmpid = model.lastUpdateEmpid;
                this.lastUpdateTime = model.lastUpdateTime;
                this.name = model.name;
                this.rid = model.rid;
                this.ruleLambda = model.ruleLambda;
                this.ruleScoreType = model.ruleScoreType;
                this.scoreId = model.scoreId;
                this.scoreName = model.scoreName;
                this.scoreSubId = model.scoreSubId;
                this.scoreSubName = model.scoreSubName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * AutoReview.
             */
            public Builder autoReview(Integer autoReview) {
                this.autoReview = autoReview;
                return this;
            }

            /**
             * BusinessCategoryNameList.
             */
            public Builder businessCategoryNameList(BusinessCategoryNameList businessCategoryNameList) {
                this.businessCategoryNameList = businessCategoryNameList;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * CreateEmpid.
             */
            public Builder createEmpid(String createEmpid) {
                this.createEmpid = createEmpid;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsDelete.
             */
            public Builder isDelete(Integer isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * IsOnline.
             */
            public Builder isOnline(Integer isOnline) {
                this.isOnline = isOnline;
                return this;
            }

            /**
             * LastUpdateEmpid.
             */
            public Builder lastUpdateEmpid(String lastUpdateEmpid) {
                this.lastUpdateEmpid = lastUpdateEmpid;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

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
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * RuleLambda.
             */
            public Builder ruleLambda(String ruleLambda) {
                this.ruleLambda = ruleLambda;
                return this;
            }

            /**
             * RuleScoreType.
             */
            public Builder ruleScoreType(Integer ruleScoreType) {
                this.ruleScoreType = ruleScoreType;
                return this;
            }

            /**
             * ScoreId.
             */
            public Builder scoreId(Integer scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreName.
             */
            public Builder scoreName(String scoreName) {
                this.scoreName = scoreName;
                return this;
            }

            /**
             * ScoreSubId.
             */
            public Builder scoreSubId(Integer scoreSubId) {
                this.scoreSubId = scoreSubId;
                return this;
            }

            /**
             * ScoreSubName.
             */
            public Builder scoreSubName(String scoreSubName) {
                this.scoreSubName = scoreSubName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public RuleInfo build() {
                return new RuleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleInfo")
        private java.util.List<RuleInfo> ruleInfo;

        private Rules(Builder builder) {
            this.ruleInfo = builder.ruleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return ruleInfo
         */
        public java.util.List<RuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        public static final class Builder {
            private java.util.List<RuleInfo> ruleInfo; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.ruleInfo = model.ruleInfo;
            } 

            /**
             * RuleInfo.
             */
            public Builder ruleInfo(java.util.List<RuleInfo> ruleInfo) {
                this.ruleInfo = ruleInfo;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        private Data(Builder builder) {
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Rules rules; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.rules = model.rules;
            } 

            /**
             * Rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
