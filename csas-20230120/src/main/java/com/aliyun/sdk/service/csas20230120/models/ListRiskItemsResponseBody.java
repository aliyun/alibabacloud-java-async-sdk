// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListRiskItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRiskItemsResponseBody</p>
 */
public class ListRiskItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskItems")
    private java.util.List<RiskItems> riskItems;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListRiskItemsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskItems = builder.riskItems;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRiskItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskItems
     */
    public java.util.List<RiskItems> getRiskItems() {
        return this.riskItems;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RiskItems> riskItems; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListRiskItemsResponseBody model) {
            this.requestId = model.requestId;
            this.riskItems = model.riskItems;
            this.totalNum = model.totalNum;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskItems.
         */
        public Builder riskItems(java.util.List<RiskItems> riskItems) {
            this.riskItems = riskItems;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListRiskItemsResponseBody build() {
            return new ListRiskItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRiskItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRiskItemsResponseBody</p>
     */
    public static class RiskItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AiConclusion")
        private String aiConclusion;

        @com.aliyun.core.annotation.NameInMap("AiRiskConfirm")
        private String aiRiskConfirm;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("GroupInfo")
        private String groupInfo;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("InnerIp")
        private String innerIp;

        @com.aliyun.core.annotation.NameInMap("Report")
        private String report;

        @com.aliyun.core.annotation.NameInMap("RiskAnalysisPolicyNames")
        private java.util.List<String> riskAnalysisPolicyNames;

        @com.aliyun.core.annotation.NameInMap("RiskCategory")
        private String riskCategory;

        @com.aliyun.core.annotation.NameInMap("RiskConfirm")
        private String riskConfirm;

        @com.aliyun.core.annotation.NameInMap("RiskConfirmDesc")
        private String riskConfirmDesc;

        @com.aliyun.core.annotation.NameInMap("RiskDesc")
        private String riskDesc;

        @com.aliyun.core.annotation.NameInMap("RiskEndTime")
        private String riskEndTime;

        @com.aliyun.core.annotation.NameInMap("RiskFeatureIds")
        private java.util.List<String> riskFeatureIds;

        @com.aliyun.core.annotation.NameInMap("RiskFoundTime")
        private String riskFoundTime;

        @com.aliyun.core.annotation.NameInMap("RiskId")
        private String riskId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskScene")
        private String riskScene;

        @com.aliyun.core.annotation.NameInMap("RiskStartTime")
        private String riskStartTime;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportAnalysis")
        private Boolean supportAnalysis;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private RiskItems(Builder builder) {
            this.agentName = builder.agentName;
            this.aiConclusion = builder.aiConclusion;
            this.aiRiskConfirm = builder.aiRiskConfirm;
            this.checkName = builder.checkName;
            this.department = builder.department;
            this.groupInfo = builder.groupInfo;
            this.hostname = builder.hostname;
            this.innerIp = builder.innerIp;
            this.report = builder.report;
            this.riskAnalysisPolicyNames = builder.riskAnalysisPolicyNames;
            this.riskCategory = builder.riskCategory;
            this.riskConfirm = builder.riskConfirm;
            this.riskConfirmDesc = builder.riskConfirmDesc;
            this.riskDesc = builder.riskDesc;
            this.riskEndTime = builder.riskEndTime;
            this.riskFeatureIds = builder.riskFeatureIds;
            this.riskFoundTime = builder.riskFoundTime;
            this.riskId = builder.riskId;
            this.riskLevel = builder.riskLevel;
            this.riskScene = builder.riskScene;
            this.riskStartTime = builder.riskStartTime;
            this.saseUserId = builder.saseUserId;
            this.skillName = builder.skillName;
            this.solution = builder.solution;
            this.status = builder.status;
            this.supportAnalysis = builder.supportAnalysis;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskItems create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return aiConclusion
         */
        public String getAiConclusion() {
            return this.aiConclusion;
        }

        /**
         * @return aiRiskConfirm
         */
        public String getAiRiskConfirm() {
            return this.aiRiskConfirm;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return groupInfo
         */
        public String getGroupInfo() {
            return this.groupInfo;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return innerIp
         */
        public String getInnerIp() {
            return this.innerIp;
        }

        /**
         * @return report
         */
        public String getReport() {
            return this.report;
        }

        /**
         * @return riskAnalysisPolicyNames
         */
        public java.util.List<String> getRiskAnalysisPolicyNames() {
            return this.riskAnalysisPolicyNames;
        }

        /**
         * @return riskCategory
         */
        public String getRiskCategory() {
            return this.riskCategory;
        }

        /**
         * @return riskConfirm
         */
        public String getRiskConfirm() {
            return this.riskConfirm;
        }

        /**
         * @return riskConfirmDesc
         */
        public String getRiskConfirmDesc() {
            return this.riskConfirmDesc;
        }

        /**
         * @return riskDesc
         */
        public String getRiskDesc() {
            return this.riskDesc;
        }

        /**
         * @return riskEndTime
         */
        public String getRiskEndTime() {
            return this.riskEndTime;
        }

        /**
         * @return riskFeatureIds
         */
        public java.util.List<String> getRiskFeatureIds() {
            return this.riskFeatureIds;
        }

        /**
         * @return riskFoundTime
         */
        public String getRiskFoundTime() {
            return this.riskFoundTime;
        }

        /**
         * @return riskId
         */
        public String getRiskId() {
            return this.riskId;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskScene
         */
        public String getRiskScene() {
            return this.riskScene;
        }

        /**
         * @return riskStartTime
         */
        public String getRiskStartTime() {
            return this.riskStartTime;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportAnalysis
         */
        public Boolean getSupportAnalysis() {
            return this.supportAnalysis;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String agentName; 
            private String aiConclusion; 
            private String aiRiskConfirm; 
            private String checkName; 
            private String department; 
            private String groupInfo; 
            private String hostname; 
            private String innerIp; 
            private String report; 
            private java.util.List<String> riskAnalysisPolicyNames; 
            private String riskCategory; 
            private String riskConfirm; 
            private String riskConfirmDesc; 
            private String riskDesc; 
            private String riskEndTime; 
            private java.util.List<String> riskFeatureIds; 
            private String riskFoundTime; 
            private String riskId; 
            private String riskLevel; 
            private String riskScene; 
            private String riskStartTime; 
            private String saseUserId; 
            private String skillName; 
            private String solution; 
            private String status; 
            private Boolean supportAnalysis; 
            private String username; 

            private Builder() {
            } 

            private Builder(RiskItems model) {
                this.agentName = model.agentName;
                this.aiConclusion = model.aiConclusion;
                this.aiRiskConfirm = model.aiRiskConfirm;
                this.checkName = model.checkName;
                this.department = model.department;
                this.groupInfo = model.groupInfo;
                this.hostname = model.hostname;
                this.innerIp = model.innerIp;
                this.report = model.report;
                this.riskAnalysisPolicyNames = model.riskAnalysisPolicyNames;
                this.riskCategory = model.riskCategory;
                this.riskConfirm = model.riskConfirm;
                this.riskConfirmDesc = model.riskConfirmDesc;
                this.riskDesc = model.riskDesc;
                this.riskEndTime = model.riskEndTime;
                this.riskFeatureIds = model.riskFeatureIds;
                this.riskFoundTime = model.riskFoundTime;
                this.riskId = model.riskId;
                this.riskLevel = model.riskLevel;
                this.riskScene = model.riskScene;
                this.riskStartTime = model.riskStartTime;
                this.saseUserId = model.saseUserId;
                this.skillName = model.skillName;
                this.solution = model.solution;
                this.status = model.status;
                this.supportAnalysis = model.supportAnalysis;
                this.username = model.username;
            } 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * AiConclusion.
             */
            public Builder aiConclusion(String aiConclusion) {
                this.aiConclusion = aiConclusion;
                return this;
            }

            /**
             * AiRiskConfirm.
             */
            public Builder aiRiskConfirm(String aiRiskConfirm) {
                this.aiRiskConfirm = aiRiskConfirm;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * GroupInfo.
             */
            public Builder groupInfo(String groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * InnerIp.
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * Report.
             */
            public Builder report(String report) {
                this.report = report;
                return this;
            }

            /**
             * RiskAnalysisPolicyNames.
             */
            public Builder riskAnalysisPolicyNames(java.util.List<String> riskAnalysisPolicyNames) {
                this.riskAnalysisPolicyNames = riskAnalysisPolicyNames;
                return this;
            }

            /**
             * RiskCategory.
             */
            public Builder riskCategory(String riskCategory) {
                this.riskCategory = riskCategory;
                return this;
            }

            /**
             * RiskConfirm.
             */
            public Builder riskConfirm(String riskConfirm) {
                this.riskConfirm = riskConfirm;
                return this;
            }

            /**
             * RiskConfirmDesc.
             */
            public Builder riskConfirmDesc(String riskConfirmDesc) {
                this.riskConfirmDesc = riskConfirmDesc;
                return this;
            }

            /**
             * RiskDesc.
             */
            public Builder riskDesc(String riskDesc) {
                this.riskDesc = riskDesc;
                return this;
            }

            /**
             * RiskEndTime.
             */
            public Builder riskEndTime(String riskEndTime) {
                this.riskEndTime = riskEndTime;
                return this;
            }

            /**
             * RiskFeatureIds.
             */
            public Builder riskFeatureIds(java.util.List<String> riskFeatureIds) {
                this.riskFeatureIds = riskFeatureIds;
                return this;
            }

            /**
             * RiskFoundTime.
             */
            public Builder riskFoundTime(String riskFoundTime) {
                this.riskFoundTime = riskFoundTime;
                return this;
            }

            /**
             * RiskId.
             */
            public Builder riskId(String riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RiskScene.
             */
            public Builder riskScene(String riskScene) {
                this.riskScene = riskScene;
                return this;
            }

            /**
             * RiskStartTime.
             */
            public Builder riskStartTime(String riskStartTime) {
                this.riskStartTime = riskStartTime;
                return this;
            }

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
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
             * SupportAnalysis.
             */
            public Builder supportAnalysis(Boolean supportAnalysis) {
                this.supportAnalysis = supportAnalysis;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public RiskItems build() {
                return new RiskItems(this);
            } 

        } 

    }
}
