// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceComponentHealthInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterServiceComponentHealthInfoResponseBody</p>
 */
public class ListClusterServiceComponentHealthInfoResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("HealthInfoList")
    private HealthInfoList healthInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterServiceComponentHealthInfoResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.healthInfoList = builder.healthInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceComponentHealthInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return healthInfoList
     */
    public HealthInfoList getHealthInfoList() {
        return this.healthInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private HealthInfoList healthInfoList; 
        private String requestId; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * HealthInfoList.
         */
        public Builder healthInfoList(HealthInfoList healthInfoList) {
            this.healthInfoList = healthInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterServiceComponentHealthInfoResponseBody build() {
            return new ListClusterServiceComponentHealthInfoResponseBody(this);
        } 

    } 

    public static class HealthRuleParam extends TeaModel {
        @NameInMap("Component")
        private String component;

        @NameInMap("HostNames")
        private String hostNames;

        @NameInMap("Pass")
        private String pass;

        @NameInMap("RuleDescription")
        private String ruleDescription;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleTitle")
        private String ruleTitle;

        @NameInMap("Service")
        private String service;

        private HealthRuleParam(Builder builder) {
            this.component = builder.component;
            this.hostNames = builder.hostNames;
            this.pass = builder.pass;
            this.ruleDescription = builder.ruleDescription;
            this.ruleId = builder.ruleId;
            this.ruleTitle = builder.ruleTitle;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthRuleParam create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public String getComponent() {
            return this.component;
        }

        /**
         * @return hostNames
         */
        public String getHostNames() {
            return this.hostNames;
        }

        /**
         * @return pass
         */
        public String getPass() {
            return this.pass;
        }

        /**
         * @return ruleDescription
         */
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleTitle
         */
        public String getRuleTitle() {
            return this.ruleTitle;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String component; 
            private String hostNames; 
            private String pass; 
            private String ruleDescription; 
            private String ruleId; 
            private String ruleTitle; 
            private String service; 

            /**
             * Component.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * HostNames.
             */
            public Builder hostNames(String hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * Pass.
             */
            public Builder pass(String pass) {
                this.pass = pass;
                return this;
            }

            /**
             * RuleDescription.
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleTitle.
             */
            public Builder ruleTitle(String ruleTitle) {
                this.ruleTitle = ruleTitle;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public HealthRuleParam build() {
                return new HealthRuleParam(this);
            } 

        } 

    }
    public static class HealthDetail extends TeaModel {
        @NameInMap("HealthRuleParam")
        private HealthRuleParam healthRuleParam;

        @NameInMap("code")
        private String code;

        private HealthDetail(Builder builder) {
            this.healthRuleParam = builder.healthRuleParam;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthDetail create() {
            return builder().build();
        }

        /**
         * @return healthRuleParam
         */
        public HealthRuleParam getHealthRuleParam() {
            return this.healthRuleParam;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        public static final class Builder {
            private HealthRuleParam healthRuleParam; 
            private String code; 

            /**
             * HealthRuleParam.
             */
            public Builder healthRuleParam(HealthRuleParam healthRuleParam) {
                this.healthRuleParam = healthRuleParam;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            public HealthDetail build() {
                return new HealthDetail(this);
            } 

        } 

    }
    public static class HealthDetailList extends TeaModel {
        @NameInMap("HealthDetail")
        private java.util.List < HealthDetail> healthDetail;

        private HealthDetailList(Builder builder) {
            this.healthDetail = builder.healthDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthDetailList create() {
            return builder().build();
        }

        /**
         * @return healthDetail
         */
        public java.util.List < HealthDetail> getHealthDetail() {
            return this.healthDetail;
        }

        public static final class Builder {
            private java.util.List < HealthDetail> healthDetail; 

            /**
             * HealthDetail.
             */
            public Builder healthDetail(java.util.List < HealthDetail> healthDetail) {
                this.healthDetail = healthDetail;
                return this;
            }

            public HealthDetailList build() {
                return new HealthDetailList(this);
            } 

        } 

    }
    public static class HealthInfo extends TeaModel {
        @NameInMap("AgentHeartBeatLostNum")
        private Integer agentHeartBeatLostNum;

        @NameInMap("BadHealthNum")
        private Integer badHealthNum;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DisabledHealthNum")
        private Integer disabledHealthNum;

        @NameInMap("GoodHealthNum")
        private Integer goodHealthNum;

        @NameInMap("HealthDetailList")
        private HealthDetailList healthDetailList;

        @NameInMap("HealthLevel")
        private String healthLevel;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("ManualStoppedNum")
        private Integer manualStoppedNum;

        @NameInMap("NoneHealthNum")
        private Integer noneHealthNum;

        @NameInMap("NormalNum")
        private Integer normalNum;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("StoppedHealthNum")
        private Integer stoppedHealthNum;

        @NameInMap("StoppedNum")
        private Integer stoppedNum;

        @NameInMap("TotalNum")
        private Integer totalNum;

        @NameInMap("UnknownHealthNum")
        private Integer unknownHealthNum;

        @NameInMap("WarningHealthNum")
        private Integer warningHealthNum;

        private HealthInfo(Builder builder) {
            this.agentHeartBeatLostNum = builder.agentHeartBeatLostNum;
            this.badHealthNum = builder.badHealthNum;
            this.componentName = builder.componentName;
            this.createdTime = builder.createdTime;
            this.disabledHealthNum = builder.disabledHealthNum;
            this.goodHealthNum = builder.goodHealthNum;
            this.healthDetailList = builder.healthDetailList;
            this.healthLevel = builder.healthLevel;
            this.healthStatus = builder.healthStatus;
            this.manualStoppedNum = builder.manualStoppedNum;
            this.noneHealthNum = builder.noneHealthNum;
            this.normalNum = builder.normalNum;
            this.serviceName = builder.serviceName;
            this.stoppedHealthNum = builder.stoppedHealthNum;
            this.stoppedNum = builder.stoppedNum;
            this.totalNum = builder.totalNum;
            this.unknownHealthNum = builder.unknownHealthNum;
            this.warningHealthNum = builder.warningHealthNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthInfo create() {
            return builder().build();
        }

        /**
         * @return agentHeartBeatLostNum
         */
        public Integer getAgentHeartBeatLostNum() {
            return this.agentHeartBeatLostNum;
        }

        /**
         * @return badHealthNum
         */
        public Integer getBadHealthNum() {
            return this.badHealthNum;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return disabledHealthNum
         */
        public Integer getDisabledHealthNum() {
            return this.disabledHealthNum;
        }

        /**
         * @return goodHealthNum
         */
        public Integer getGoodHealthNum() {
            return this.goodHealthNum;
        }

        /**
         * @return healthDetailList
         */
        public HealthDetailList getHealthDetailList() {
            return this.healthDetailList;
        }

        /**
         * @return healthLevel
         */
        public String getHealthLevel() {
            return this.healthLevel;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return manualStoppedNum
         */
        public Integer getManualStoppedNum() {
            return this.manualStoppedNum;
        }

        /**
         * @return noneHealthNum
         */
        public Integer getNoneHealthNum() {
            return this.noneHealthNum;
        }

        /**
         * @return normalNum
         */
        public Integer getNormalNum() {
            return this.normalNum;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return stoppedHealthNum
         */
        public Integer getStoppedHealthNum() {
            return this.stoppedHealthNum;
        }

        /**
         * @return stoppedNum
         */
        public Integer getStoppedNum() {
            return this.stoppedNum;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return unknownHealthNum
         */
        public Integer getUnknownHealthNum() {
            return this.unknownHealthNum;
        }

        /**
         * @return warningHealthNum
         */
        public Integer getWarningHealthNum() {
            return this.warningHealthNum;
        }

        public static final class Builder {
            private Integer agentHeartBeatLostNum; 
            private Integer badHealthNum; 
            private String componentName; 
            private Long createdTime; 
            private Integer disabledHealthNum; 
            private Integer goodHealthNum; 
            private HealthDetailList healthDetailList; 
            private String healthLevel; 
            private String healthStatus; 
            private Integer manualStoppedNum; 
            private Integer noneHealthNum; 
            private Integer normalNum; 
            private String serviceName; 
            private Integer stoppedHealthNum; 
            private Integer stoppedNum; 
            private Integer totalNum; 
            private Integer unknownHealthNum; 
            private Integer warningHealthNum; 

            /**
             * AgentHeartBeatLostNum.
             */
            public Builder agentHeartBeatLostNum(Integer agentHeartBeatLostNum) {
                this.agentHeartBeatLostNum = agentHeartBeatLostNum;
                return this;
            }

            /**
             * BadHealthNum.
             */
            public Builder badHealthNum(Integer badHealthNum) {
                this.badHealthNum = badHealthNum;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DisabledHealthNum.
             */
            public Builder disabledHealthNum(Integer disabledHealthNum) {
                this.disabledHealthNum = disabledHealthNum;
                return this;
            }

            /**
             * GoodHealthNum.
             */
            public Builder goodHealthNum(Integer goodHealthNum) {
                this.goodHealthNum = goodHealthNum;
                return this;
            }

            /**
             * HealthDetailList.
             */
            public Builder healthDetailList(HealthDetailList healthDetailList) {
                this.healthDetailList = healthDetailList;
                return this;
            }

            /**
             * HealthLevel.
             */
            public Builder healthLevel(String healthLevel) {
                this.healthLevel = healthLevel;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * ManualStoppedNum.
             */
            public Builder manualStoppedNum(Integer manualStoppedNum) {
                this.manualStoppedNum = manualStoppedNum;
                return this;
            }

            /**
             * NoneHealthNum.
             */
            public Builder noneHealthNum(Integer noneHealthNum) {
                this.noneHealthNum = noneHealthNum;
                return this;
            }

            /**
             * NormalNum.
             */
            public Builder normalNum(Integer normalNum) {
                this.normalNum = normalNum;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * StoppedHealthNum.
             */
            public Builder stoppedHealthNum(Integer stoppedHealthNum) {
                this.stoppedHealthNum = stoppedHealthNum;
                return this;
            }

            /**
             * StoppedNum.
             */
            public Builder stoppedNum(Integer stoppedNum) {
                this.stoppedNum = stoppedNum;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * UnknownHealthNum.
             */
            public Builder unknownHealthNum(Integer unknownHealthNum) {
                this.unknownHealthNum = unknownHealthNum;
                return this;
            }

            /**
             * WarningHealthNum.
             */
            public Builder warningHealthNum(Integer warningHealthNum) {
                this.warningHealthNum = warningHealthNum;
                return this;
            }

            public HealthInfo build() {
                return new HealthInfo(this);
            } 

        } 

    }
    public static class HealthInfoList extends TeaModel {
        @NameInMap("HealthInfo")
        private java.util.List < HealthInfo> healthInfo;

        private HealthInfoList(Builder builder) {
            this.healthInfo = builder.healthInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthInfoList create() {
            return builder().build();
        }

        /**
         * @return healthInfo
         */
        public java.util.List < HealthInfo> getHealthInfo() {
            return this.healthInfo;
        }

        public static final class Builder {
            private java.util.List < HealthInfo> healthInfo; 

            /**
             * HealthInfo.
             */
            public Builder healthInfo(java.util.List < HealthInfo> healthInfo) {
                this.healthInfo = healthInfo;
                return this;
            }

            public HealthInfoList build() {
                return new HealthInfoList(this);
            } 

        } 

    }
}
