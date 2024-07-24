// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupConfigResponseBody</p>
 */
public class ListSkillGroupConfigResponseBody extends TeaModel {
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

    private ListSkillGroupConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupConfigResponseBody create() {
        return builder().build();
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

        public ListSkillGroupConfigResponseBody build() {
            return new ListSkillGroupConfigResponseBody(this);
        } 

    } 

    public static class RuleNameInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private RuleNameInfo(Builder builder) {
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleNameInfo create() {
            return builder().build();
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long rid; 
            private String ruleName; 

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleNameInfo build() {
                return new RuleNameInfo(this);
            } 

        } 

    }
    public static class AllRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleNameInfo")
        private java.util.List < RuleNameInfo> ruleNameInfo;

        private AllRuleList(Builder builder) {
            this.ruleNameInfo = builder.ruleNameInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllRuleList create() {
            return builder().build();
        }

        /**
         * @return ruleNameInfo
         */
        public java.util.List < RuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

        public static final class Builder {
            private java.util.List < RuleNameInfo> ruleNameInfo; 

            /**
             * RuleNameInfo.
             */
            public Builder ruleNameInfo(java.util.List < RuleNameInfo> ruleNameInfo) {
                this.ruleNameInfo = ruleNameInfo;
                return this;
            }

            public AllRuleList build() {
                return new AllRuleList(this);
            } 

        } 

    }
    public static class RuleListRuleNameInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private RuleListRuleNameInfo(Builder builder) {
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleListRuleNameInfo create() {
            return builder().build();
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long rid; 
            private String ruleName; 

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleListRuleNameInfo build() {
                return new RuleListRuleNameInfo(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleNameInfo")
        private java.util.List < RuleListRuleNameInfo> ruleNameInfo;

        private RuleList(Builder builder) {
            this.ruleNameInfo = builder.ruleNameInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return ruleNameInfo
         */
        public java.util.List < RuleListRuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

        public static final class Builder {
            private java.util.List < RuleListRuleNameInfo> ruleNameInfo; 

            /**
             * RuleNameInfo.
             */
            public Builder ruleNameInfo(java.util.List < RuleListRuleNameInfo> ruleNameInfo) {
                this.ruleNameInfo = ruleNameInfo;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class SkillGroupScreen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private Integer dataType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Symbol")
        private Integer symbol;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SkillGroupScreen(Builder builder) {
            this.dataType = builder.dataType;
            this.name = builder.name;
            this.symbol = builder.symbol;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroupScreen create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return symbol
         */
        public Integer getSymbol() {
            return this.symbol;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer dataType; 
            private String name; 
            private Integer symbol; 
            private String value; 

            /**
             * DataType.
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
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
             * Symbol.
             */
            public Builder symbol(Integer symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SkillGroupScreen build() {
                return new SkillGroupScreen(this);
            } 

        } 

    }
    public static class SkillGroupScreens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroupScreen")
        private java.util.List < SkillGroupScreen> skillGroupScreen;

        private SkillGroupScreens(Builder builder) {
            this.skillGroupScreen = builder.skillGroupScreen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroupScreens create() {
            return builder().build();
        }

        /**
         * @return skillGroupScreen
         */
        public java.util.List < SkillGroupScreen> getSkillGroupScreen() {
            return this.skillGroupScreen;
        }

        public static final class Builder {
            private java.util.List < SkillGroupScreen> skillGroupScreen; 

            /**
             * SkillGroupScreen.
             */
            public Builder skillGroupScreen(java.util.List < SkillGroupScreen> skillGroupScreen) {
                this.skillGroupScreen = skillGroupScreen;
                return this;
            }

            public SkillGroupScreens build() {
                return new SkillGroupScreens(this);
            } 

        } 

    }
    public static class SkillGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllContentQualityCheck")
        private Integer allContentQualityCheck;

        @com.aliyun.core.annotation.NameInMap("AllRids")
        private String allRids;

        @com.aliyun.core.annotation.NameInMap("AllRuleList")
        private AllRuleList allRuleList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private Long modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QualityCheckType")
        private Integer qualityCheckType;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private RuleList ruleList;

        @com.aliyun.core.annotation.NameInMap("ScreenSwitch")
        private Boolean screenSwitch;

        @com.aliyun.core.annotation.NameInMap("SkillGroupFrom")
        private Integer skillGroupFrom;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        @com.aliyun.core.annotation.NameInMap("SkillGroupScreens")
        private SkillGroupScreens skillGroupScreens;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VocabId")
        private Long vocabId;

        @com.aliyun.core.annotation.NameInMap("VocabName")
        private String vocabName;

        private SkillGroupConfig(Builder builder) {
            this.allContentQualityCheck = builder.allContentQualityCheck;
            this.allRids = builder.allRids;
            this.allRuleList = builder.allRuleList;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.name = builder.name;
            this.qualityCheckType = builder.qualityCheckType;
            this.rid = builder.rid;
            this.ruleList = builder.ruleList;
            this.screenSwitch = builder.screenSwitch;
            this.skillGroupFrom = builder.skillGroupFrom;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.skillGroupScreens = builder.skillGroupScreens;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.vocabId = builder.vocabId;
            this.vocabName = builder.vocabName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroupConfig create() {
            return builder().build();
        }

        /**
         * @return allContentQualityCheck
         */
        public Integer getAllContentQualityCheck() {
            return this.allContentQualityCheck;
        }

        /**
         * @return allRids
         */
        public String getAllRids() {
            return this.allRids;
        }

        /**
         * @return allRuleList
         */
        public AllRuleList getAllRuleList() {
            return this.allRuleList;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modelId
         */
        public Long getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qualityCheckType
         */
        public Integer getQualityCheckType() {
            return this.qualityCheckType;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return ruleList
         */
        public RuleList getRuleList() {
            return this.ruleList;
        }

        /**
         * @return screenSwitch
         */
        public Boolean getScreenSwitch() {
            return this.screenSwitch;
        }

        /**
         * @return skillGroupFrom
         */
        public Integer getSkillGroupFrom() {
            return this.skillGroupFrom;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        /**
         * @return skillGroupScreens
         */
        public SkillGroupScreens getSkillGroupScreens() {
            return this.skillGroupScreens;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vocabId
         */
        public Long getVocabId() {
            return this.vocabId;
        }

        /**
         * @return vocabName
         */
        public String getVocabName() {
            return this.vocabName;
        }

        public static final class Builder {
            private Integer allContentQualityCheck; 
            private String allRids; 
            private AllRuleList allRuleList; 
            private String createTime; 
            private Long id; 
            private String instanceId; 
            private Long modelId; 
            private String modelName; 
            private String name; 
            private Integer qualityCheckType; 
            private String rid; 
            private RuleList ruleList; 
            private Boolean screenSwitch; 
            private Integer skillGroupFrom; 
            private String skillGroupId; 
            private String skillGroupName; 
            private SkillGroupScreens skillGroupScreens; 
            private Integer status; 
            private Integer type; 
            private String updateTime; 
            private Long vocabId; 
            private String vocabName; 

            /**
             * AllContentQualityCheck.
             */
            public Builder allContentQualityCheck(Integer allContentQualityCheck) {
                this.allContentQualityCheck = allContentQualityCheck;
                return this;
            }

            /**
             * AllRids.
             */
            public Builder allRids(String allRids) {
                this.allRids = allRids;
                return this;
            }

            /**
             * AllRuleList.
             */
            public Builder allRuleList(AllRuleList allRuleList) {
                this.allRuleList = allRuleList;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(Long modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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
             * QualityCheckType.
             */
            public Builder qualityCheckType(Integer qualityCheckType) {
                this.qualityCheckType = qualityCheckType;
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
             * RuleList.
             */
            public Builder ruleList(RuleList ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * ScreenSwitch.
             */
            public Builder screenSwitch(Boolean screenSwitch) {
                this.screenSwitch = screenSwitch;
                return this;
            }

            /**
             * SkillGroupFrom.
             */
            public Builder skillGroupFrom(Integer skillGroupFrom) {
                this.skillGroupFrom = skillGroupFrom;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            /**
             * SkillGroupScreens.
             */
            public Builder skillGroupScreens(SkillGroupScreens skillGroupScreens) {
                this.skillGroupScreens = skillGroupScreens;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VocabId.
             */
            public Builder vocabId(Long vocabId) {
                this.vocabId = vocabId;
                return this;
            }

            /**
             * VocabName.
             */
            public Builder vocabName(String vocabName) {
                this.vocabName = vocabName;
                return this;
            }

            public SkillGroupConfig build() {
                return new SkillGroupConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroupConfig")
        private java.util.List < SkillGroupConfig> skillGroupConfig;

        private Data(Builder builder) {
            this.skillGroupConfig = builder.skillGroupConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return skillGroupConfig
         */
        public java.util.List < SkillGroupConfig> getSkillGroupConfig() {
            return this.skillGroupConfig;
        }

        public static final class Builder {
            private java.util.List < SkillGroupConfig> skillGroupConfig; 

            /**
             * SkillGroupConfig.
             */
            public Builder skillGroupConfig(java.util.List < SkillGroupConfig> skillGroupConfig) {
                this.skillGroupConfig = skillGroupConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
