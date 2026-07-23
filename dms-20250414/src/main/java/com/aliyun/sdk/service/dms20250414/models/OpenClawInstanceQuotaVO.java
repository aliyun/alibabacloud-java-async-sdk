// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OpenClawInstanceQuotaVO} extends {@link TeaModel}
 *
 * <p>OpenClawInstanceQuotaVO</p>
 */
public class OpenClawInstanceQuotaVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunAccountUid")
    private String aliyunAccountUid;

    @com.aliyun.core.annotation.NameInMap("DeepResearchCallQuota")
    private String deepResearchCallQuota;

    @com.aliyun.core.annotation.NameInMap("DeepResearchCallUsed")
    private String deepResearchCallUsed;

    @com.aliyun.core.annotation.NameInMap("InstanceDesc")
    private String instanceDesc;

    @com.aliyun.core.annotation.NameInMap("InstanceGmtCreate")
    private String instanceGmtCreate;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("LastMeteringTime")
    private String lastMeteringTime;

    @com.aliyun.core.annotation.NameInMap("ModelCallQuota")
    private String modelCallQuota;

    @com.aliyun.core.annotation.NameInMap("ModelCallUsed")
    private String modelCallUsed;

    @com.aliyun.core.annotation.NameInMap("RefreshDay")
    private String refreshDay;

    @com.aliyun.core.annotation.NameInMap("SkillPlanCallQuota")
    private String skillPlanCallQuota;

    @com.aliyun.core.annotation.NameInMap("SkillPlanCallUsed")
    private String skillPlanCallUsed;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private OpenClawInstanceQuotaVO(Builder builder) {
        this.aliyunAccountUid = builder.aliyunAccountUid;
        this.deepResearchCallQuota = builder.deepResearchCallQuota;
        this.deepResearchCallUsed = builder.deepResearchCallUsed;
        this.instanceDesc = builder.instanceDesc;
        this.instanceGmtCreate = builder.instanceGmtCreate;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lastMeteringTime = builder.lastMeteringTime;
        this.modelCallQuota = builder.modelCallQuota;
        this.modelCallUsed = builder.modelCallUsed;
        this.refreshDay = builder.refreshDay;
        this.skillPlanCallQuota = builder.skillPlanCallQuota;
        this.skillPlanCallUsed = builder.skillPlanCallUsed;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenClawInstanceQuotaVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunAccountUid
     */
    public String getAliyunAccountUid() {
        return this.aliyunAccountUid;
    }

    /**
     * @return deepResearchCallQuota
     */
    public String getDeepResearchCallQuota() {
        return this.deepResearchCallQuota;
    }

    /**
     * @return deepResearchCallUsed
     */
    public String getDeepResearchCallUsed() {
        return this.deepResearchCallUsed;
    }

    /**
     * @return instanceDesc
     */
    public String getInstanceDesc() {
        return this.instanceDesc;
    }

    /**
     * @return instanceGmtCreate
     */
    public String getInstanceGmtCreate() {
        return this.instanceGmtCreate;
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
     * @return lastMeteringTime
     */
    public String getLastMeteringTime() {
        return this.lastMeteringTime;
    }

    /**
     * @return modelCallQuota
     */
    public String getModelCallQuota() {
        return this.modelCallQuota;
    }

    /**
     * @return modelCallUsed
     */
    public String getModelCallUsed() {
        return this.modelCallUsed;
    }

    /**
     * @return refreshDay
     */
    public String getRefreshDay() {
        return this.refreshDay;
    }

    /**
     * @return skillPlanCallQuota
     */
    public String getSkillPlanCallQuota() {
        return this.skillPlanCallQuota;
    }

    /**
     * @return skillPlanCallUsed
     */
    public String getSkillPlanCallUsed() {
        return this.skillPlanCallUsed;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String aliyunAccountUid; 
        private String deepResearchCallQuota; 
        private String deepResearchCallUsed; 
        private String instanceDesc; 
        private String instanceGmtCreate; 
        private String instanceId; 
        private String instanceName; 
        private String lastMeteringTime; 
        private String modelCallQuota; 
        private String modelCallUsed; 
        private String refreshDay; 
        private String skillPlanCallQuota; 
        private String skillPlanCallUsed; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(OpenClawInstanceQuotaVO model) {
            this.aliyunAccountUid = model.aliyunAccountUid;
            this.deepResearchCallQuota = model.deepResearchCallQuota;
            this.deepResearchCallUsed = model.deepResearchCallUsed;
            this.instanceDesc = model.instanceDesc;
            this.instanceGmtCreate = model.instanceGmtCreate;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.lastMeteringTime = model.lastMeteringTime;
            this.modelCallQuota = model.modelCallQuota;
            this.modelCallUsed = model.modelCallUsed;
            this.refreshDay = model.refreshDay;
            this.skillPlanCallQuota = model.skillPlanCallQuota;
            this.skillPlanCallUsed = model.skillPlanCallUsed;
            this.status = model.status;
        } 

        /**
         * AliyunAccountUid.
         */
        public Builder aliyunAccountUid(String aliyunAccountUid) {
            this.aliyunAccountUid = aliyunAccountUid;
            return this;
        }

        /**
         * DeepResearchCallQuota.
         */
        public Builder deepResearchCallQuota(String deepResearchCallQuota) {
            this.deepResearchCallQuota = deepResearchCallQuota;
            return this;
        }

        /**
         * DeepResearchCallUsed.
         */
        public Builder deepResearchCallUsed(String deepResearchCallUsed) {
            this.deepResearchCallUsed = deepResearchCallUsed;
            return this;
        }

        /**
         * InstanceDesc.
         */
        public Builder instanceDesc(String instanceDesc) {
            this.instanceDesc = instanceDesc;
            return this;
        }

        /**
         * InstanceGmtCreate.
         */
        public Builder instanceGmtCreate(String instanceGmtCreate) {
            this.instanceGmtCreate = instanceGmtCreate;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * LastMeteringTime.
         */
        public Builder lastMeteringTime(String lastMeteringTime) {
            this.lastMeteringTime = lastMeteringTime;
            return this;
        }

        /**
         * ModelCallQuota.
         */
        public Builder modelCallQuota(String modelCallQuota) {
            this.modelCallQuota = modelCallQuota;
            return this;
        }

        /**
         * ModelCallUsed.
         */
        public Builder modelCallUsed(String modelCallUsed) {
            this.modelCallUsed = modelCallUsed;
            return this;
        }

        /**
         * RefreshDay.
         */
        public Builder refreshDay(String refreshDay) {
            this.refreshDay = refreshDay;
            return this;
        }

        /**
         * SkillPlanCallQuota.
         */
        public Builder skillPlanCallQuota(String skillPlanCallQuota) {
            this.skillPlanCallQuota = skillPlanCallQuota;
            return this;
        }

        /**
         * SkillPlanCallUsed.
         */
        public Builder skillPlanCallUsed(String skillPlanCallUsed) {
            this.skillPlanCallUsed = skillPlanCallUsed;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public OpenClawInstanceQuotaVO build() {
            return new OpenClawInstanceQuotaVO(this);
        } 

    } 

}
