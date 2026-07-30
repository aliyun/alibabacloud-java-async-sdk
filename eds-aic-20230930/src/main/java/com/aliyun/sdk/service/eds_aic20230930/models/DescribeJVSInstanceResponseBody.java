// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeJVSInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJVSInstanceResponseBody</p>
 */
public class DescribeJVSInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PendingUpgradeCount")
    private Integer pendingUpgradeCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeJVSInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pendingUpgradeCount = builder.pendingUpgradeCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJVSInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pendingUpgradeCount
     */
    public Integer getPendingUpgradeCount() {
        return this.pendingUpgradeCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pendingUpgradeCount; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeJVSInstanceResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pendingUpgradeCount = model.pendingUpgradeCount;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>当前页实际返回条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>下一页游标，末页不返回</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PendingUpgradeCount.
         */
        public Builder pendingUpgradeCount(Integer pendingUpgradeCount) {
            this.pendingUpgradeCount = pendingUpgradeCount;
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
         * <p>符合条件的总记录数</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeJVSInstanceResponseBody build() {
            return new DescribeJVSInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJVSInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJVSInstanceResponseBody</p>
     */
    public static class AgentVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AgentVersion(Builder builder) {
            this.upgradeStatus = builder.upgradeStatus;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentVersion create() {
            return builder().build();
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String upgradeStatus; 
            private String version; 

            private Builder() {
            } 

            private Builder(AgentVersion model) {
                this.upgradeStatus = model.upgradeStatus;
                this.version = model.version;
            } 

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AgentVersion build() {
                return new AgentVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJVSInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJVSInstanceResponseBody</p>
     */
    public static class CreditConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreditLimit")
        private Long creditLimit;

        @com.aliyun.core.annotation.NameInMap("LimitPeriod")
        private String limitPeriod;

        private CreditConfig(Builder builder) {
            this.creditLimit = builder.creditLimit;
            this.limitPeriod = builder.limitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditConfig create() {
            return builder().build();
        }

        /**
         * @return creditLimit
         */
        public Long getCreditLimit() {
            return this.creditLimit;
        }

        /**
         * @return limitPeriod
         */
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

        public static final class Builder {
            private Long creditLimit; 
            private String limitPeriod; 

            private Builder() {
            } 

            private Builder(CreditConfig model) {
                this.creditLimit = model.creditLimit;
                this.limitPeriod = model.limitPeriod;
            } 

            /**
             * CreditLimit.
             */
            public Builder creditLimit(Long creditLimit) {
                this.creditLimit = creditLimit;
                return this;
            }

            /**
             * LimitPeriod.
             */
            public Builder limitPeriod(String limitPeriod) {
                this.limitPeriod = limitPeriod;
                return this;
            }

            public CreditConfig build() {
                return new CreditConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJVSInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJVSInstanceResponseBody</p>
     */
    public static class InstalledSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("InstalledAt")
        private String installedAt;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillType")
        private String skillType;

        private InstalledSkills(Builder builder) {
            this.description = builder.description;
            this.iconUrl = builder.iconUrl;
            this.installedAt = builder.installedAt;
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
            this.skillType = builder.skillType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstalledSkills create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return installedAt
         */
        public String getInstalledAt() {
            return this.installedAt;
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

        /**
         * @return skillType
         */
        public String getSkillType() {
            return this.skillType;
        }

        public static final class Builder {
            private String description; 
            private String iconUrl; 
            private String installedAt; 
            private String skillId; 
            private String skillName; 
            private String skillType; 

            private Builder() {
            } 

            private Builder(InstalledSkills model) {
                this.description = model.description;
                this.iconUrl = model.iconUrl;
                this.installedAt = model.installedAt;
                this.skillId = model.skillId;
                this.skillName = model.skillName;
                this.skillType = model.skillType;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * InstalledAt.
             */
            public Builder installedAt(String installedAt) {
                this.installedAt = installedAt;
                return this;
            }

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

            /**
             * SkillType.
             */
            public Builder skillType(String skillType) {
                this.skillType = skillType;
                return this;
            }

            public InstalledSkills build() {
                return new InstalledSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJVSInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJVSInstanceResponseBody</p>
     */
    public static class UsedCredit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credit")
        private Long credit;

        @com.aliyun.core.annotation.NameInMap("LimitPeriod")
        private String limitPeriod;

        private UsedCredit(Builder builder) {
            this.credit = builder.credit;
            this.limitPeriod = builder.limitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsedCredit create() {
            return builder().build();
        }

        /**
         * @return credit
         */
        public Long getCredit() {
            return this.credit;
        }

        /**
         * @return limitPeriod
         */
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

        public static final class Builder {
            private Long credit; 
            private String limitPeriod; 

            private Builder() {
            } 

            private Builder(UsedCredit model) {
                this.credit = model.credit;
                this.limitPeriod = model.limitPeriod;
            } 

            /**
             * Credit.
             */
            public Builder credit(Long credit) {
                this.credit = credit;
                return this;
            }

            /**
             * LimitPeriod.
             */
            public Builder limitPeriod(String limitPeriod) {
                this.limitPeriod = limitPeriod;
                return this;
            }

            public UsedCredit build() {
                return new UsedCredit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJVSInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJVSInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private AgentVersion agentVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreditConfig")
        private java.util.List<CreditConfig> creditConfig;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstalledSkills")
        private java.util.List<InstalledSkills> installedSkills;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JvsPackageId")
        private String jvsPackageId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UsedCredit")
        private java.util.List<UsedCredit> usedCredit;

        private Data(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.createTime = builder.createTime;
            this.creditConfig = builder.creditConfig;
            this.expireTime = builder.expireTime;
            this.installedSkills = builder.installedSkills;
            this.instanceId = builder.instanceId;
            this.jvsPackageId = builder.jvsPackageId;
            this.modifyTime = builder.modifyTime;
            this.status = builder.status;
            this.usedCredit = builder.usedCredit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public AgentVersion getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creditConfig
         */
        public java.util.List<CreditConfig> getCreditConfig() {
            return this.creditConfig;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return installedSkills
         */
        public java.util.List<InstalledSkills> getInstalledSkills() {
            return this.installedSkills;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jvsPackageId
         */
        public String getJvsPackageId() {
            return this.jvsPackageId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usedCredit
         */
        public java.util.List<UsedCredit> getUsedCredit() {
            return this.usedCredit;
        }

        public static final class Builder {
            private AgentVersion agentVersion; 
            private String createTime; 
            private java.util.List<CreditConfig> creditConfig; 
            private String expireTime; 
            private java.util.List<InstalledSkills> installedSkills; 
            private String instanceId; 
            private String jvsPackageId; 
            private String modifyTime; 
            private String status; 
            private java.util.List<UsedCredit> usedCredit; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentVersion = model.agentVersion;
                this.createTime = model.createTime;
                this.creditConfig = model.creditConfig;
                this.expireTime = model.expireTime;
                this.installedSkills = model.installedSkills;
                this.instanceId = model.instanceId;
                this.jvsPackageId = model.jvsPackageId;
                this.modifyTime = model.modifyTime;
                this.status = model.status;
                this.usedCredit = model.usedCredit;
            } 

            /**
             * AgentVersion.
             */
            public Builder agentVersion(AgentVersion agentVersion) {
                this.agentVersion = agentVersion;
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
             * CreditConfig.
             */
            public Builder creditConfig(java.util.List<CreditConfig> creditConfig) {
                this.creditConfig = creditConfig;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstalledSkills.
             */
            public Builder installedSkills(java.util.List<InstalledSkills> installedSkills) {
                this.installedSkills = installedSkills;
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
             * JvsPackageId.
             */
            public Builder jvsPackageId(String jvsPackageId) {
                this.jvsPackageId = jvsPackageId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
             * UsedCredit.
             */
            public Builder usedCredit(java.util.List<UsedCredit> usedCredit) {
                this.usedCredit = usedCredit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
