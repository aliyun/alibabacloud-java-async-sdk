// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeRiskSecurityGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskSecurityGroupDetailResponseBody</p>
 */
public class DescribeRiskSecurityGroupDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskSgDetail")
    private java.util.List<RiskSgDetail> riskSgDetail;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRiskSecurityGroupDetailResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.riskSgDetail = builder.riskSgDetail;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskSecurityGroupDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return riskSgDetail
     */
    public java.util.List<RiskSgDetail> getRiskSgDetail() {
        return this.riskSgDetail;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<RiskSgDetail> riskSgDetail; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRiskSecurityGroupDetailResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.riskSgDetail = model.riskSgDetail;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33C94306-2064-5A06-9645-01419967****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the risk security group.</p>
         */
        public Builder riskSgDetail(java.util.List<RiskSgDetail> riskSgDetail) {
            this.riskSgDetail = riskSgDetail;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRiskSecurityGroupDetailResponseBody build() {
            return new DescribeRiskSecurityGroupDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskSecurityGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskSecurityGroupDetailResponseBody</p>
     */
    public static class EcsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceName")
        private String ecsInstanceName;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        private EcsInfo(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsInstanceName = builder.ecsInstanceName;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsInfo create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsInstanceName
         */
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String ecsInstanceName; 
            private String privateIp; 
            private String publicIp; 

            private Builder() {
            } 

            private Builder(EcsInfo model) {
                this.ecsInstanceId = model.ecsInstanceId;
                this.ecsInstanceName = model.ecsInstanceName;
                this.privateIp = model.privateIp;
                this.publicIp = model.publicIp;
            } 

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1gra23yai47d8e****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>tyf_test</p>
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * <p>The private IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.121.XXX</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The public IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.107.141.XXX</p>
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            public EcsInfo build() {
                return new EcsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRiskSecurityGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskSecurityGroupDetailResponseBody</p>
     */
    public static class RuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("RuleUuid")
        private String ruleUuid;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private RuleInfo(Builder builder) {
            this.description = builder.description;
            this.riskLevel = builder.riskLevel;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleUuid = builder.ruleUuid;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return ruleUuid
         */
        public String getRuleUuid() {
            return this.ruleUuid;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String description; 
            private String riskLevel; 
            private String ruleName; 
            private String ruleStatus; 
            private String ruleUuid; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(RuleInfo model) {
                this.description = model.description;
                this.riskLevel = model.riskLevel;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.ruleUuid = model.ruleUuid;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The risk level of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The UUID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>4c1e72c9-6690-408b-9048-065f0f10****</p>
             */
            public Builder ruleUuid(String ruleUuid) {
                this.ruleUuid = ruleUuid;
                return this;
            }

            /**
             * <p>The optimization suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public RuleInfo build() {
                return new RuleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRiskSecurityGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskSecurityGroupDetailResponseBody</p>
     */
    public static class RiskSgDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("EcsInfo")
        private java.util.List<EcsInfo> ecsInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RuleInfo")
        private java.util.List<RuleInfo> ruleInfo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private RiskSgDetail(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.ecsInfo = builder.ecsInfo;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionNo = builder.regionNo;
            this.riskLevel = builder.riskLevel;
            this.ruleInfo = builder.ruleInfo;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskSgDetail create() {
            return builder().build();
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return ecsInfo
         */
        public java.util.List<EcsInfo> getEcsInfo() {
            return this.ecsInfo;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleInfo
         */
        public java.util.List<RuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer ecsCount; 
            private java.util.List<EcsInfo> ecsInfo; 
            private String instanceId; 
            private String instanceName; 
            private String regionNo; 
            private String riskLevel; 
            private java.util.List<RuleInfo> ruleInfo; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(RiskSgDetail model) {
                this.ecsCount = model.ecsCount;
                this.ecsInfo = model.ecsInfo;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionNo = model.regionNo;
                this.riskLevel = model.riskLevel;
                this.ruleInfo = model.ruleInfo;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The number of associated ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>The ECS information.</p>
             */
            public Builder ecsInfo(java.util.List<EcsInfo> ecsInfo) {
                this.ecsInfo = ecsInfo;
                return this;
            }

            /**
             * <p>The ID of the security group instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2vc0p803vgxumn6r****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-instance-name</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The risk level of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The information about the risk security group rule.</p>
             */
            public Builder ruleInfo(java.util.List<RuleInfo> ruleInfo) {
                this.ruleInfo = ruleInfo;
                return this;
            }

            /**
             * <p>The ID of the VPC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbuzirdl3w1r7exw****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public RiskSgDetail build() {
                return new RiskSgDetail(this);
            } 

        } 

    }
}
