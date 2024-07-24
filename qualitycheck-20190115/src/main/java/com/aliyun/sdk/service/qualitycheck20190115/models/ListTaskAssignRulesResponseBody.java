// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskAssignRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskAssignRulesResponseBody</p>
 */
public class ListTaskAssignRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTaskAssignRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskAssignRulesResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTaskAssignRulesResponseBody build() {
            return new ListTaskAssignRulesResponseBody(this);
        } 

    } 

    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        private Agent(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private java.util.List < Agent> agent;

        private Agents(Builder builder) {
            this.agent = builder.agent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public java.util.List < Agent> getAgent() {
            return this.agent;
        }

        public static final class Builder {
            private java.util.List < Agent> agent; 

            /**
             * Agent.
             */
            public Builder agent(java.util.List < Agent> agent) {
                this.agent = agent;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    public static class Reviewer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewerId")
        private String reviewerId;

        @com.aliyun.core.annotation.NameInMap("ReviewerName")
        private String reviewerName;

        private Reviewer(Builder builder) {
            this.reviewerId = builder.reviewerId;
            this.reviewerName = builder.reviewerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reviewer create() {
            return builder().build();
        }

        /**
         * @return reviewerId
         */
        public String getReviewerId() {
            return this.reviewerId;
        }

        /**
         * @return reviewerName
         */
        public String getReviewerName() {
            return this.reviewerName;
        }

        public static final class Builder {
            private String reviewerId; 
            private String reviewerName; 

            /**
             * ReviewerId.
             */
            public Builder reviewerId(String reviewerId) {
                this.reviewerId = reviewerId;
                return this;
            }

            /**
             * ReviewerName.
             */
            public Builder reviewerName(String reviewerName) {
                this.reviewerName = reviewerName;
                return this;
            }

            public Reviewer build() {
                return new Reviewer(this);
            } 

        } 

    }
    public static class Reviewers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reviewer")
        private java.util.List < Reviewer> reviewer;

        private Reviewers(Builder builder) {
            this.reviewer = builder.reviewer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reviewers create() {
            return builder().build();
        }

        /**
         * @return reviewer
         */
        public java.util.List < Reviewer> getReviewer() {
            return this.reviewer;
        }

        public static final class Builder {
            private java.util.List < Reviewer> reviewer; 

            /**
             * Reviewer.
             */
            public Builder reviewer(java.util.List < Reviewer> reviewer) {
                this.reviewer = reviewer;
                return this;
            }

            public Reviewers build() {
                return new Reviewers(this);
            } 

        } 

    }
    public static class RuleBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        private RuleBasicInfo(Builder builder) {
            this.name = builder.name;
            this.rid = builder.rid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleBasicInfo create() {
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
        public String getRid() {
            return this.rid;
        }

        public static final class Builder {
            private String name; 
            private String rid; 

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

            public RuleBasicInfo build() {
                return new RuleBasicInfo(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleBasicInfo")
        private java.util.List < RuleBasicInfo> ruleBasicInfo;

        private Rules(Builder builder) {
            this.ruleBasicInfo = builder.ruleBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return ruleBasicInfo
         */
        public java.util.List < RuleBasicInfo> getRuleBasicInfo() {
            return this.ruleBasicInfo;
        }

        public static final class Builder {
            private java.util.List < RuleBasicInfo> ruleBasicInfo; 

            /**
             * RuleBasicInfo.
             */
            public Builder ruleBasicInfo(java.util.List < RuleBasicInfo> ruleBasicInfo) {
                this.ruleBasicInfo = ruleBasicInfo;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class SamplingModeAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        private SamplingModeAgent(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplingModeAgent create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            public SamplingModeAgent build() {
                return new SamplingModeAgent(this);
            } 

        } 

    }
    public static class SamplingModeAgents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SamplingModeAgent")
        private java.util.List < SamplingModeAgent> samplingModeAgent;

        private SamplingModeAgents(Builder builder) {
            this.samplingModeAgent = builder.samplingModeAgent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplingModeAgents create() {
            return builder().build();
        }

        /**
         * @return samplingModeAgent
         */
        public java.util.List < SamplingModeAgent> getSamplingModeAgent() {
            return this.samplingModeAgent;
        }

        public static final class Builder {
            private java.util.List < SamplingModeAgent> samplingModeAgent; 

            /**
             * SamplingModeAgent.
             */
            public Builder samplingModeAgent(java.util.List < SamplingModeAgent> samplingModeAgent) {
                this.samplingModeAgent = samplingModeAgent;
                return this;
            }

            public SamplingModeAgents build() {
                return new SamplingModeAgents(this);
            } 

        } 

    }
    public static class SamplingMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnyNumberOfDraws")
        private Integer anyNumberOfDraws;

        @com.aliyun.core.annotation.NameInMap("Designated")
        private Boolean designated;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private Integer dimension;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("NumberOfDraws")
        private Integer numberOfDraws;

        @com.aliyun.core.annotation.NameInMap("Proportion")
        private Float proportion;

        @com.aliyun.core.annotation.NameInMap("RandomInspectionNumber")
        private Integer randomInspectionNumber;

        @com.aliyun.core.annotation.NameInMap("SamplingModeAgents")
        private SamplingModeAgents samplingModeAgents;

        private SamplingMode(Builder builder) {
            this.anyNumberOfDraws = builder.anyNumberOfDraws;
            this.designated = builder.designated;
            this.dimension = builder.dimension;
            this.limit = builder.limit;
            this.numberOfDraws = builder.numberOfDraws;
            this.proportion = builder.proportion;
            this.randomInspectionNumber = builder.randomInspectionNumber;
            this.samplingModeAgents = builder.samplingModeAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplingMode create() {
            return builder().build();
        }

        /**
         * @return anyNumberOfDraws
         */
        public Integer getAnyNumberOfDraws() {
            return this.anyNumberOfDraws;
        }

        /**
         * @return designated
         */
        public Boolean getDesignated() {
            return this.designated;
        }

        /**
         * @return dimension
         */
        public Integer getDimension() {
            return this.dimension;
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return numberOfDraws
         */
        public Integer getNumberOfDraws() {
            return this.numberOfDraws;
        }

        /**
         * @return proportion
         */
        public Float getProportion() {
            return this.proportion;
        }

        /**
         * @return randomInspectionNumber
         */
        public Integer getRandomInspectionNumber() {
            return this.randomInspectionNumber;
        }

        /**
         * @return samplingModeAgents
         */
        public SamplingModeAgents getSamplingModeAgents() {
            return this.samplingModeAgents;
        }

        public static final class Builder {
            private Integer anyNumberOfDraws; 
            private Boolean designated; 
            private Integer dimension; 
            private Integer limit; 
            private Integer numberOfDraws; 
            private Float proportion; 
            private Integer randomInspectionNumber; 
            private SamplingModeAgents samplingModeAgents; 

            /**
             * AnyNumberOfDraws.
             */
            public Builder anyNumberOfDraws(Integer anyNumberOfDraws) {
                this.anyNumberOfDraws = anyNumberOfDraws;
                return this;
            }

            /**
             * Designated.
             */
            public Builder designated(Boolean designated) {
                this.designated = designated;
                return this;
            }

            /**
             * Dimension.
             */
            public Builder dimension(Integer dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * NumberOfDraws.
             */
            public Builder numberOfDraws(Integer numberOfDraws) {
                this.numberOfDraws = numberOfDraws;
                return this;
            }

            /**
             * Proportion.
             */
            public Builder proportion(Float proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * RandomInspectionNumber.
             */
            public Builder randomInspectionNumber(Integer randomInspectionNumber) {
                this.randomInspectionNumber = randomInspectionNumber;
                return this;
            }

            /**
             * SamplingModeAgents.
             */
            public Builder samplingModeAgents(SamplingModeAgents samplingModeAgents) {
                this.samplingModeAgents = samplingModeAgents;
                return this;
            }

            public SamplingMode build() {
                return new SamplingMode(this);
            } 

        } 

    }
    public static class SkillGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        private SkillGroup(Builder builder) {
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroup create() {
            return builder().build();
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        public static final class Builder {
            private String skillId; 
            private String skillName; 

            /**
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            public SkillGroup build() {
                return new SkillGroup(this);
            } 

        } 

    }
    public static class SkillGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroup")
        private java.util.List < SkillGroup> skillGroup;

        private SkillGroups(Builder builder) {
            this.skillGroup = builder.skillGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroups create() {
            return builder().build();
        }

        /**
         * @return skillGroup
         */
        public java.util.List < SkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private java.util.List < SkillGroup> skillGroup; 

            /**
             * SkillGroup.
             */
            public Builder skillGroup(java.util.List < SkillGroup> skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public SkillGroups build() {
                return new SkillGroups(this);
            } 

        } 

    }
    public static class TaskAssignRuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agents")
        private Agents agents;

        @com.aliyun.core.annotation.NameInMap("AgentsStr")
        private String agentsStr;

        @com.aliyun.core.annotation.NameInMap("AssignmentType")
        private Integer assignmentType;

        @com.aliyun.core.annotation.NameInMap("CallTimeEnd")
        private Long callTimeEnd;

        @com.aliyun.core.annotation.NameInMap("CallTimeStart")
        private Long callTimeStart;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Integer callType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DurationMax")
        private Integer durationMax;

        @com.aliyun.core.annotation.NameInMap("DurationMin")
        private Integer durationMin;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Reviewers")
        private Reviewers reviewers;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        @com.aliyun.core.annotation.NameInMap("SamplingMode")
        private SamplingMode samplingMode;

        @com.aliyun.core.annotation.NameInMap("SkillGroups")
        private SkillGroups skillGroups;

        @com.aliyun.core.annotation.NameInMap("SkillGroupsStr")
        private String skillGroupsStr;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TaskAssignRuleInfo(Builder builder) {
            this.agents = builder.agents;
            this.agentsStr = builder.agentsStr;
            this.assignmentType = builder.assignmentType;
            this.callTimeEnd = builder.callTimeEnd;
            this.callTimeStart = builder.callTimeStart;
            this.callType = builder.callType;
            this.createTime = builder.createTime;
            this.durationMax = builder.durationMax;
            this.durationMin = builder.durationMin;
            this.enabled = builder.enabled;
            this.priority = builder.priority;
            this.reviewers = builder.reviewers;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.rules = builder.rules;
            this.samplingMode = builder.samplingMode;
            this.skillGroups = builder.skillGroups;
            this.skillGroupsStr = builder.skillGroupsStr;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskAssignRuleInfo create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public Agents getAgents() {
            return this.agents;
        }

        /**
         * @return agentsStr
         */
        public String getAgentsStr() {
            return this.agentsStr;
        }

        /**
         * @return assignmentType
         */
        public Integer getAssignmentType() {
            return this.assignmentType;
        }

        /**
         * @return callTimeEnd
         */
        public Long getCallTimeEnd() {
            return this.callTimeEnd;
        }

        /**
         * @return callTimeStart
         */
        public Long getCallTimeStart() {
            return this.callTimeStart;
        }

        /**
         * @return callType
         */
        public Integer getCallType() {
            return this.callType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return durationMax
         */
        public Integer getDurationMax() {
            return this.durationMax;
        }

        /**
         * @return durationMin
         */
        public Integer getDurationMin() {
            return this.durationMin;
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return reviewers
         */
        public Reviewers getReviewers() {
            return this.reviewers;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        /**
         * @return samplingMode
         */
        public SamplingMode getSamplingMode() {
            return this.samplingMode;
        }

        /**
         * @return skillGroups
         */
        public SkillGroups getSkillGroups() {
            return this.skillGroups;
        }

        /**
         * @return skillGroupsStr
         */
        public String getSkillGroupsStr() {
            return this.skillGroupsStr;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Agents agents; 
            private String agentsStr; 
            private Integer assignmentType; 
            private Long callTimeEnd; 
            private Long callTimeStart; 
            private Integer callType; 
            private String createTime; 
            private Integer durationMax; 
            private Integer durationMin; 
            private Integer enabled; 
            private Integer priority; 
            private Reviewers reviewers; 
            private Long ruleId; 
            private String ruleName; 
            private Rules rules; 
            private SamplingMode samplingMode; 
            private SkillGroups skillGroups; 
            private String skillGroupsStr; 
            private String updateTime; 

            /**
             * Agents.
             */
            public Builder agents(Agents agents) {
                this.agents = agents;
                return this;
            }

            /**
             * AgentsStr.
             */
            public Builder agentsStr(String agentsStr) {
                this.agentsStr = agentsStr;
                return this;
            }

            /**
             * AssignmentType.
             */
            public Builder assignmentType(Integer assignmentType) {
                this.assignmentType = assignmentType;
                return this;
            }

            /**
             * CallTimeEnd.
             */
            public Builder callTimeEnd(Long callTimeEnd) {
                this.callTimeEnd = callTimeEnd;
                return this;
            }

            /**
             * CallTimeStart.
             */
            public Builder callTimeStart(Long callTimeStart) {
                this.callTimeStart = callTimeStart;
                return this;
            }

            /**
             * CallType.
             */
            public Builder callType(Integer callType) {
                this.callType = callType;
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
             * DurationMax.
             */
            public Builder durationMax(Integer durationMax) {
                this.durationMax = durationMax;
                return this;
            }

            /**
             * DurationMin.
             */
            public Builder durationMin(Integer durationMin) {
                this.durationMin = durationMin;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Reviewers.
             */
            public Builder reviewers(Reviewers reviewers) {
                this.reviewers = reviewers;
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
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * SamplingMode.
             */
            public Builder samplingMode(SamplingMode samplingMode) {
                this.samplingMode = samplingMode;
                return this;
            }

            /**
             * SkillGroups.
             */
            public Builder skillGroups(SkillGroups skillGroups) {
                this.skillGroups = skillGroups;
                return this;
            }

            /**
             * SkillGroupsStr.
             */
            public Builder skillGroupsStr(String skillGroupsStr) {
                this.skillGroupsStr = skillGroupsStr;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TaskAssignRuleInfo build() {
                return new TaskAssignRuleInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskAssignRuleInfo")
        private java.util.List < TaskAssignRuleInfo> taskAssignRuleInfo;

        private Data(Builder builder) {
            this.taskAssignRuleInfo = builder.taskAssignRuleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskAssignRuleInfo
         */
        public java.util.List < TaskAssignRuleInfo> getTaskAssignRuleInfo() {
            return this.taskAssignRuleInfo;
        }

        public static final class Builder {
            private java.util.List < TaskAssignRuleInfo> taskAssignRuleInfo; 

            /**
             * TaskAssignRuleInfo.
             */
            public Builder taskAssignRuleInfo(java.util.List < TaskAssignRuleInfo> taskAssignRuleInfo) {
                this.taskAssignRuleInfo = taskAssignRuleInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
