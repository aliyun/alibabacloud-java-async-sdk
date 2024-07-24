// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityCheckSchemeResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityCheckSchemeResponseBody</p>
 */
public class ListQualityCheckSchemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCountId")
    private String resultCountId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQualityCheckSchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCountId = builder.resultCountId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityCheckSchemeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCountId
     */
    public String getResultCountId() {
        return this.resultCountId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCountId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ResultCountId.
         */
        public Builder resultCountId(String resultCountId) {
            this.resultCountId = resultCountId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityCheckSchemeResponseBody build() {
            return new ListQualityCheckSchemeResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("RuleScoreType")
        private Integer ruleScoreType;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @com.aliyun.core.annotation.NameInMap("ScoreType")
        private Integer scoreType;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private Integer targetType;

        private Rules(Builder builder) {
            this.checkType = builder.checkType;
            this.name = builder.name;
            this.rid = builder.rid;
            this.ruleScoreType = builder.ruleScoreType;
            this.scoreNum = builder.scoreNum;
            this.scoreNumType = builder.scoreNumType;
            this.scoreType = builder.scoreType;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
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
         * @return ruleScoreType
         */
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
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
         * @return scoreType
         */
        public Integer getScoreType() {
            return this.scoreType;
        }

        /**
         * @return targetType
         */
        public Integer getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Integer checkType; 
            private String name; 
            private Long rid; 
            private Integer ruleScoreType; 
            private Integer scoreNum; 
            private Integer scoreNumType; 
            private Integer scoreType; 
            private Integer targetType; 

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
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
            public Builder rid(Long rid) {
                this.rid = rid;
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
             * ScoreType.
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(Integer targetType) {
                this.targetType = targetType;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private RuleList(Builder builder) {
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private java.util.List < Rules> rules; 

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class SchemeCheckTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private Integer targetType;

        private SchemeCheckTypeList(Builder builder) {
            this.checkName = builder.checkName;
            this.checkType = builder.checkType;
            this.enable = builder.enable;
            this.score = builder.score;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeCheckTypeList create() {
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
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return targetType
         */
        public Integer getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String checkName; 
            private Integer checkType; 
            private Integer enable; 
            private Integer score; 
            private Integer targetType; 

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
            public Builder checkType(Integer checkType) {
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
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(Integer targetType) {
                this.targetType = targetType;
                return this;
            }

            public SchemeCheckTypeList build() {
                return new SchemeCheckTypeList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private Integer dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("SchemeCheckTypeList")
        private java.util.List < SchemeCheckTypeList> schemeCheckTypeList;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Integer templateType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUserName")
        private String updateUserName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUserName = builder.createUserName;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.name = builder.name;
            this.ruleList = builder.ruleList;
            this.schemeCheckTypeList = builder.schemeCheckTypeList;
            this.schemeId = builder.schemeId;
            this.status = builder.status;
            this.templateType = builder.templateType;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateUserName = builder.updateUserName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleList
         */
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return schemeCheckTypeList
         */
        public java.util.List < SchemeCheckTypeList> getSchemeCheckTypeList() {
            return this.schemeCheckTypeList;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUserName
         */
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String createUserName; 
            private Integer dataType; 
            private String description; 
            private String name; 
            private java.util.List < RuleList> ruleList; 
            private java.util.List < SchemeCheckTypeList> schemeCheckTypeList; 
            private Long schemeId; 
            private Integer status; 
            private Integer templateType; 
            private Integer type; 
            private String updateTime; 
            private String updateUserName; 
            private Long version; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * RuleList.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * SchemeCheckTypeList.
             */
            public Builder schemeCheckTypeList(java.util.List < SchemeCheckTypeList> schemeCheckTypeList) {
                this.schemeCheckTypeList = schemeCheckTypeList;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUserName.
             */
            public Builder updateUserName(String updateUserName) {
                this.updateUserName = updateUserName;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
