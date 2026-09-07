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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of risk events.</p>
         */
        public Builder riskItems(java.util.List<RiskItems> riskItems) {
            this.riskItems = riskItems;
            return this;
        }

        /**
         * <p>The total number of risk events that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The name of the Agent that generated the risk event. An empty string is returned for non-Agent risk scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>qoder****</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The AI risk analysis conclusion.</p>
             * 
             * <strong>example:</strong>
             * <p>The account logged on from an unusual device, and the behavior is inconsistent with the historical baseline</p>
             */
            public Builder aiConclusion(String aiConclusion) {
                this.aiConclusion = aiConclusion;
                return this;
            }

            /**
             * <p>The risk judgment provided by AI. An empty string is returned if no AI analysis results exist. Valid values:</p>
             * <ul>
             * <li><code>Risk</code>: determined as risky.</li>
             * <li><code>Ignore</code>: determined as not risky.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Risk</p>
             */
            public Builder aiRiskConfirm(String aiRiskConfirm) {
                this.aiRiskConfirm = aiRiskConfirm;
                return this;
            }

            /**
             * <p>The name of the risk detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual device logon check</p>
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * <p>The department to which the user associated with the risk event belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Department****</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>The original organizational structure information of the user associated with the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>CN=zhang***,OU=Department****</p>
             */
            public Builder groupInfo(String groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * <p>The name of the endpoint device associated with the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>U-2GW2L4M7-****</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The internal IP address of the endpoint associated with the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * <p>The risk detection report or risk evidence.</p>
             * 
             * <strong>example:</strong>
             * <p>The account logged on from a new device, and the logon location is inconsistent with the usual location</p>
             */
            public Builder report(String report) {
                this.report = report;
                return this;
            }

            /**
             * <p>The list of risk analysis policy names that were hit.</p>
             */
            public Builder riskAnalysisPolicyNames(java.util.List<String> riskAnalysisPolicyNames) {
                this.riskAnalysisPolicyNames = riskAnalysisPolicyNames;
                return this;
            }

            /**
             * <p>The risk category. Valid values:</p>
             * <ul>
             * <li><code>data_safe</code>: data security.</li>
             * <li><code>identify_safe</code>: identity security.</li>
             * <li><code>device_safe</code>: device security.</li>
             * <li><code>access_safe</code>: access security.</li>
             * <li><code>ai_agent_safe</code>: Agent security.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>identify_safe</p>
             */
            public Builder riskCategory(String riskCategory) {
                this.riskCategory = riskCategory;
                return this;
            }

            /**
             * <p>The manually confirmed risk conclusion. An empty string is returned if not confirmed. Valid values:</p>
             * <ul>
             * <li><code>Risk</code>: confirmed as risky.</li>
             * <li><code>Ignore</code>: confirmed as not risky.</li>
             * <li><code>Invalid</code>: confirmed as a false positive.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Risk</p>
             */
            public Builder riskConfirm(String riskConfirm) {
                this.riskConfirm = riskConfirm;
                return this;
            }

            /**
             * <p>The description of the risk event disposition.</p>
             * 
             * <strong>example:</strong>
             * <p>After verification, the logon was not authorized by the user</p>
             */
            public Builder riskConfirmDesc(String riskConfirmDesc) {
                this.riskConfirmDesc = riskConfirmDesc;
                return this;
            }

            /**
             * <p>The risk description.</p>
             * 
             * <strong>example:</strong>
             * <p>The account logged on from an unusual device</p>
             */
            public Builder riskDesc(String riskDesc) {
                this.riskDesc = riskDesc;
                return this;
            }

            /**
             * <p>The end time of the risky behavior, in the format of <code>yyyy-MM-dd HH:mm:ss</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-21 05:21:00</p>
             */
            public Builder riskEndTime(String riskEndTime) {
                this.riskEndTime = riskEndTime;
                return this;
            }

            /**
             * <p>The list of detection feature or detection item identifiers that triggered the risk event. A risk event may hit multiple identifiers. The specific values vary based on the risk scenario and detection rules.</p>
             */
            public Builder riskFeatureIds(java.util.List<String> riskFeatureIds) {
                this.riskFeatureIds = riskFeatureIds;
                return this;
            }

            /**
             * <p>The time when the risk was detected, in the format of <code>yyyy-MM-dd HH:mm:ss</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-20 10:30:00</p>
             */
            public Builder riskFoundTime(String riskFoundTime) {
                this.riskFoundTime = riskFoundTime;
                return this;
            }

            /**
             * <p>The risk event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>69ef648034cf53d7bac7a9c9c912****</p>
             */
            public Builder riskId(String riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><code>High</code>: high risk.</li>
             * <li><code>Medium</code>: medium risk.</li>
             * <li><code>Low</code>: low risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The risk scenario. Valid values:</p>
             * <ul>
             * <li><code>account_share</code>: account sharing.</li>
             * <li><code>account_stolen</code>: account theft.</li>
             * <li><code>device_share</code>: device sharing.</li>
             * <li><code>remote_logon</code>: remote logon from an unusual location.</li>
             * <li><code>sensitive_data_leakage</code>: sensitive data exfiltration.</li>
             * <li><code>lateral_scanning</code>: lateral scanning.</li>
             * <li><code>ai_skill_malware</code>: malicious Skill.</li>
             * <li><code>ai_config_check</code>: AI configuration check.</li>
             * <li><code>openclaw_vulnerability</code>: OpenClaw vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>account_stolen</p>
             */
            public Builder riskScene(String riskScene) {
                this.riskScene = riskScene;
                return this;
            }

            /**
             * <p>The start time of the risky behavior, in the format of <code>yyyy-MM-dd HH:mm:ss</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-20 05:20:00</p>
             */
            public Builder riskStartTime(String riskStartTime) {
                this.riskStartTime = riskStartTime;
                return this;
            }

            /**
             * <p>The SASE user ID associated with the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>The name of the Agent Skill that generated the risk event. An empty string is returned for non-Agent risk scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>frontend-design</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The recommended remediation action for the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>Verify the account user and freeze the account or reset credentials based on the verification result</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The disposition status of the risk event. Valid values:</p>
             * <ul>
             * <li><code>Unprocess</code>: unprocessed.</li>
             * <li><code>Processing</code>: being processed.</li>
             * <li><code>Processed</code>: processed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unprocess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether AI risk analysis results exist. Valid values:</p>
             * <ul>
             * <li><code>true</code>: AI risk analysis results exist.</li>
             * <li><code>false</code>: AI risk analysis results do not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportAnalysis(Boolean supportAnalysis) {
                this.supportAnalysis = supportAnalysis;
                return this;
            }

            /**
             * <p>The username associated with the risk event.</p>
             * 
             * <strong>example:</strong>
             * <p>zhang***</p>
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
