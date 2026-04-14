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

    private OpenClawInstanceQuotaVO(Builder builder) {
        this.aliyunAccountUid = builder.aliyunAccountUid;
        this.deepResearchCallQuota = builder.deepResearchCallQuota;
        this.deepResearchCallUsed = builder.deepResearchCallUsed;
        this.instanceGmtCreate = builder.instanceGmtCreate;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lastMeteringTime = builder.lastMeteringTime;
        this.modelCallQuota = builder.modelCallQuota;
        this.modelCallUsed = builder.modelCallUsed;
        this.refreshDay = builder.refreshDay;
        this.skillPlanCallQuota = builder.skillPlanCallQuota;
        this.skillPlanCallUsed = builder.skillPlanCallUsed;
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

    public static final class Builder {
        private String aliyunAccountUid; 
        private String deepResearchCallQuota; 
        private String deepResearchCallUsed; 
        private String instanceGmtCreate; 
        private String instanceId; 
        private String instanceName; 
        private String lastMeteringTime; 
        private String modelCallQuota; 
        private String modelCallUsed; 
        private String refreshDay; 
        private String skillPlanCallQuota; 
        private String skillPlanCallUsed; 

        private Builder() {
        } 

        private Builder(OpenClawInstanceQuotaVO model) {
            this.aliyunAccountUid = model.aliyunAccountUid;
            this.deepResearchCallQuota = model.deepResearchCallQuota;
            this.deepResearchCallUsed = model.deepResearchCallUsed;
            this.instanceGmtCreate = model.instanceGmtCreate;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.lastMeteringTime = model.lastMeteringTime;
            this.modelCallQuota = model.modelCallQuota;
            this.modelCallUsed = model.modelCallUsed;
            this.refreshDay = model.refreshDay;
            this.skillPlanCallQuota = model.skillPlanCallQuota;
            this.skillPlanCallUsed = model.skillPlanCallUsed;
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

        public OpenClawInstanceQuotaVO build() {
            return new OpenClawInstanceQuotaVO(this);
        } 

    } 

}
