// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link QueryCheckInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCheckInfoResponseBody</p>
 */
public class QueryCheckInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCheckInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCheckInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCheckInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public QueryCheckInfoResponseBody build() {
            return new QueryCheckInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCheckInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCheckInfoResponseBody</p>
     */
    public static class ScopeNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LeafLevel")
        private String leafLevel;

        @com.aliyun.core.annotation.NameInMap("Level1")
        private String level1;

        @com.aliyun.core.annotation.NameInMap("Level2")
        private String level2;

        @com.aliyun.core.annotation.NameInMap("Level3")
        private String level3;

        @com.aliyun.core.annotation.NameInMap("Level4")
        private String level4;

        @com.aliyun.core.annotation.NameInMap("Level5")
        private String level5;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ScopeNodeList(Builder builder) {
            this.leafLevel = builder.leafLevel;
            this.level1 = builder.level1;
            this.level2 = builder.level2;
            this.level3 = builder.level3;
            this.level4 = builder.level4;
            this.level5 = builder.level5;
            this.path = builder.path;
            this.ruleId = builder.ruleId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeNodeList create() {
            return builder().build();
        }

        /**
         * @return leafLevel
         */
        public String getLeafLevel() {
            return this.leafLevel;
        }

        /**
         * @return level1
         */
        public String getLevel1() {
            return this.level1;
        }

        /**
         * @return level2
         */
        public String getLevel2() {
            return this.level2;
        }

        /**
         * @return level3
         */
        public String getLevel3() {
            return this.level3;
        }

        /**
         * @return level4
         */
        public String getLevel4() {
            return this.level4;
        }

        /**
         * @return level5
         */
        public String getLevel5() {
            return this.level5;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String leafLevel; 
            private String level1; 
            private String level2; 
            private String level3; 
            private String level4; 
            private String level5; 
            private String path; 
            private Long ruleId; 
            private String type; 

            private Builder() {
            } 

            private Builder(ScopeNodeList model) {
                this.leafLevel = model.leafLevel;
                this.level1 = model.level1;
                this.level2 = model.level2;
                this.level3 = model.level3;
                this.level4 = model.level4;
                this.level5 = model.level5;
                this.path = model.path;
                this.ruleId = model.ruleId;
                this.type = model.type;
            } 

            /**
             * LeafLevel.
             */
            public Builder leafLevel(String leafLevel) {
                this.leafLevel = leafLevel;
                return this;
            }

            /**
             * Level1.
             */
            public Builder level1(String level1) {
                this.level1 = level1;
                return this;
            }

            /**
             * Level2.
             */
            public Builder level2(String level2) {
                this.level2 = level2;
                return this;
            }

            /**
             * Level3.
             */
            public Builder level3(String level3) {
                this.level3 = level3;
                return this;
            }

            /**
             * Level4.
             */
            public Builder level4(String level4) {
                this.level4 = level4;
                return this;
            }

            /**
             * Level5.
             */
            public Builder level5(String level5) {
                this.level5 = level5;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ScopeNodeList build() {
                return new ScopeNodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCheckInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCheckInfoResponseBody</p>
     */
    public static class BlockRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockHarm")
        private String blockHarm;

        @com.aliyun.core.annotation.NameInMap("BlockId")
        private Long blockId;

        @com.aliyun.core.annotation.NameInMap("Express")
        private String express;

        @com.aliyun.core.annotation.NameInMap("ScopeEndTime")
        private Long scopeEndTime;

        @com.aliyun.core.annotation.NameInMap("ScopeNodeList")
        private java.util.List<ScopeNodeList> scopeNodeList;

        @com.aliyun.core.annotation.NameInMap("ScopeRuleId")
        private Long scopeRuleId;

        @com.aliyun.core.annotation.NameInMap("ScopeStartTime")
        private Long scopeStartTime;

        private BlockRule(Builder builder) {
            this.blockHarm = builder.blockHarm;
            this.blockId = builder.blockId;
            this.express = builder.express;
            this.scopeEndTime = builder.scopeEndTime;
            this.scopeNodeList = builder.scopeNodeList;
            this.scopeRuleId = builder.scopeRuleId;
            this.scopeStartTime = builder.scopeStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockRule create() {
            return builder().build();
        }

        /**
         * @return blockHarm
         */
        public String getBlockHarm() {
            return this.blockHarm;
        }

        /**
         * @return blockId
         */
        public Long getBlockId() {
            return this.blockId;
        }

        /**
         * @return express
         */
        public String getExpress() {
            return this.express;
        }

        /**
         * @return scopeEndTime
         */
        public Long getScopeEndTime() {
            return this.scopeEndTime;
        }

        /**
         * @return scopeNodeList
         */
        public java.util.List<ScopeNodeList> getScopeNodeList() {
            return this.scopeNodeList;
        }

        /**
         * @return scopeRuleId
         */
        public Long getScopeRuleId() {
            return this.scopeRuleId;
        }

        /**
         * @return scopeStartTime
         */
        public Long getScopeStartTime() {
            return this.scopeStartTime;
        }

        public static final class Builder {
            private String blockHarm; 
            private Long blockId; 
            private String express; 
            private Long scopeEndTime; 
            private java.util.List<ScopeNodeList> scopeNodeList; 
            private Long scopeRuleId; 
            private Long scopeStartTime; 

            private Builder() {
            } 

            private Builder(BlockRule model) {
                this.blockHarm = model.blockHarm;
                this.blockId = model.blockId;
                this.express = model.express;
                this.scopeEndTime = model.scopeEndTime;
                this.scopeNodeList = model.scopeNodeList;
                this.scopeRuleId = model.scopeRuleId;
                this.scopeStartTime = model.scopeStartTime;
            } 

            /**
             * BlockHarm.
             */
            public Builder blockHarm(String blockHarm) {
                this.blockHarm = blockHarm;
                return this;
            }

            /**
             * BlockId.
             */
            public Builder blockId(Long blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Express.
             */
            public Builder express(String express) {
                this.express = express;
                return this;
            }

            /**
             * ScopeEndTime.
             */
            public Builder scopeEndTime(Long scopeEndTime) {
                this.scopeEndTime = scopeEndTime;
                return this;
            }

            /**
             * ScopeNodeList.
             */
            public Builder scopeNodeList(java.util.List<ScopeNodeList> scopeNodeList) {
                this.scopeNodeList = scopeNodeList;
                return this;
            }

            /**
             * ScopeRuleId.
             */
            public Builder scopeRuleId(Long scopeRuleId) {
                this.scopeRuleId = scopeRuleId;
                return this;
            }

            /**
             * ScopeStartTime.
             */
            public Builder scopeStartTime(Long scopeStartTime) {
                this.scopeStartTime = scopeStartTime;
                return this;
            }

            public BlockRule build() {
                return new BlockRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCheckInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCheckInfoResponseBody</p>
     */
    public static class CheckDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockRule")
        private java.util.List<BlockRule> blockRule;

        @com.aliyun.core.annotation.NameInMap("CheckholdReason")
        private String checkholdReason;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("PicInfo")
        private String picInfo;

        @com.aliyun.core.annotation.NameInMap("RiskExplain")
        private String riskExplain;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CheckDetailList(Builder builder) {
            this.blockRule = builder.blockRule;
            this.checkholdReason = builder.checkholdReason;
            this.desc = builder.desc;
            this.picInfo = builder.picInfo;
            this.riskExplain = builder.riskExplain;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckDetailList create() {
            return builder().build();
        }

        /**
         * @return blockRule
         */
        public java.util.List<BlockRule> getBlockRule() {
            return this.blockRule;
        }

        /**
         * @return checkholdReason
         */
        public String getCheckholdReason() {
            return this.checkholdReason;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return picInfo
         */
        public String getPicInfo() {
            return this.picInfo;
        }

        /**
         * @return riskExplain
         */
        public String getRiskExplain() {
            return this.riskExplain;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<BlockRule> blockRule; 
            private String checkholdReason; 
            private String desc; 
            private String picInfo; 
            private String riskExplain; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(CheckDetailList model) {
                this.blockRule = model.blockRule;
                this.checkholdReason = model.checkholdReason;
                this.desc = model.desc;
                this.picInfo = model.picInfo;
                this.riskExplain = model.riskExplain;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * BlockRule.
             */
            public Builder blockRule(java.util.List<BlockRule> blockRule) {
                this.blockRule = blockRule;
                return this;
            }

            /**
             * CheckholdReason.
             */
            public Builder checkholdReason(String checkholdReason) {
                this.checkholdReason = checkholdReason;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * PicInfo.
             */
            public Builder picInfo(String picInfo) {
                this.picInfo = picInfo;
                return this;
            }

            /**
             * RiskExplain.
             */
            public Builder riskExplain(String riskExplain) {
                this.riskExplain = riskExplain;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CheckDetailList build() {
                return new CheckDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCheckInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCheckInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckDetailList")
        private java.util.List<CheckDetailList> checkDetailList;

        @com.aliyun.core.annotation.NameInMap("CheckResultUrl")
        private String checkResultUrl;

        private Data(Builder builder) {
            this.checkDetailList = builder.checkDetailList;
            this.checkResultUrl = builder.checkResultUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkDetailList
         */
        public java.util.List<CheckDetailList> getCheckDetailList() {
            return this.checkDetailList;
        }

        /**
         * @return checkResultUrl
         */
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public static final class Builder {
            private java.util.List<CheckDetailList> checkDetailList; 
            private String checkResultUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkDetailList = model.checkDetailList;
                this.checkResultUrl = model.checkResultUrl;
            } 

            /**
             * CheckDetailList.
             */
            public Builder checkDetailList(java.util.List<CheckDetailList> checkDetailList) {
                this.checkDetailList = checkDetailList;
                return this;
            }

            /**
             * CheckResultUrl.
             */
            public Builder checkResultUrl(String checkResultUrl) {
                this.checkResultUrl = checkResultUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
