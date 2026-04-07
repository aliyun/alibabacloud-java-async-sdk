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
 * {@link AgentServiceOrderVO} extends {@link TeaModel}
 *
 * <p>AgentServiceOrderVO</p>
 */
public class AgentServiceOrderVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentService")
    private String agentService;

    @com.aliyun.core.annotation.NameInMap("DeepResearchQuota")
    private Integer deepResearchQuota;

    @com.aliyun.core.annotation.NameInMap("DeepResearchUsed")
    private Integer deepResearchUsed;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("ModelCallQuota")
    private Integer modelCallQuota;

    @com.aliyun.core.annotation.NameInMap("ModelCallUsed")
    private Integer modelCallUsed;

    @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
    private String orderInstanceId;

    @com.aliyun.core.annotation.NameInMap("ServiceNum")
    private Integer serviceNum;

    @com.aliyun.core.annotation.NameInMap("SkillPlanCallQuota")
    private Integer skillPlanCallQuota;

    @com.aliyun.core.annotation.NameInMap("SkillPlanCallUsed")
    private Integer skillPlanCallUsed;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AgentServiceOrderVO(Builder builder) {
        this.agentService = builder.agentService;
        this.deepResearchQuota = builder.deepResearchQuota;
        this.deepResearchUsed = builder.deepResearchUsed;
        this.expireTime = builder.expireTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.modelCallQuota = builder.modelCallQuota;
        this.modelCallUsed = builder.modelCallUsed;
        this.orderInstanceId = builder.orderInstanceId;
        this.serviceNum = builder.serviceNum;
        this.skillPlanCallQuota = builder.skillPlanCallQuota;
        this.skillPlanCallUsed = builder.skillPlanCallUsed;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentServiceOrderVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentService
     */
    public String getAgentService() {
        return this.agentService;
    }

    /**
     * @return deepResearchQuota
     */
    public Integer getDeepResearchQuota() {
        return this.deepResearchQuota;
    }

    /**
     * @return deepResearchUsed
     */
    public Integer getDeepResearchUsed() {
        return this.deepResearchUsed;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return modelCallQuota
     */
    public Integer getModelCallQuota() {
        return this.modelCallQuota;
    }

    /**
     * @return modelCallUsed
     */
    public Integer getModelCallUsed() {
        return this.modelCallUsed;
    }

    /**
     * @return orderInstanceId
     */
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    /**
     * @return serviceNum
     */
    public Integer getServiceNum() {
        return this.serviceNum;
    }

    /**
     * @return skillPlanCallQuota
     */
    public Integer getSkillPlanCallQuota() {
        return this.skillPlanCallQuota;
    }

    /**
     * @return skillPlanCallUsed
     */
    public Integer getSkillPlanCallUsed() {
        return this.skillPlanCallUsed;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String agentService; 
        private Integer deepResearchQuota; 
        private Integer deepResearchUsed; 
        private String expireTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private Integer modelCallQuota; 
        private Integer modelCallUsed; 
        private String orderInstanceId; 
        private Integer serviceNum; 
        private Integer skillPlanCallQuota; 
        private Integer skillPlanCallUsed; 
        private String status; 

        private Builder() {
        } 

        private Builder(AgentServiceOrderVO model) {
            this.agentService = model.agentService;
            this.deepResearchQuota = model.deepResearchQuota;
            this.deepResearchUsed = model.deepResearchUsed;
            this.expireTime = model.expireTime;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.modelCallQuota = model.modelCallQuota;
            this.modelCallUsed = model.modelCallUsed;
            this.orderInstanceId = model.orderInstanceId;
            this.serviceNum = model.serviceNum;
            this.skillPlanCallQuota = model.skillPlanCallQuota;
            this.skillPlanCallUsed = model.skillPlanCallUsed;
            this.status = model.status;
        } 

        /**
         * AgentService.
         */
        public Builder agentService(String agentService) {
            this.agentService = agentService;
            return this;
        }

        /**
         * DeepResearchQuota.
         */
        public Builder deepResearchQuota(Integer deepResearchQuota) {
            this.deepResearchQuota = deepResearchQuota;
            return this;
        }

        /**
         * DeepResearchUsed.
         */
        public Builder deepResearchUsed(Integer deepResearchUsed) {
            this.deepResearchUsed = deepResearchUsed;
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
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * ModelCallQuota.
         */
        public Builder modelCallQuota(Integer modelCallQuota) {
            this.modelCallQuota = modelCallQuota;
            return this;
        }

        /**
         * ModelCallUsed.
         */
        public Builder modelCallUsed(Integer modelCallUsed) {
            this.modelCallUsed = modelCallUsed;
            return this;
        }

        /**
         * OrderInstanceId.
         */
        public Builder orderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }

        /**
         * ServiceNum.
         */
        public Builder serviceNum(Integer serviceNum) {
            this.serviceNum = serviceNum;
            return this;
        }

        /**
         * SkillPlanCallQuota.
         */
        public Builder skillPlanCallQuota(Integer skillPlanCallQuota) {
            this.skillPlanCallQuota = skillPlanCallQuota;
            return this;
        }

        /**
         * SkillPlanCallUsed.
         */
        public Builder skillPlanCallUsed(Integer skillPlanCallUsed) {
            this.skillPlanCallUsed = skillPlanCallUsed;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AgentServiceOrderVO build() {
            return new AgentServiceOrderVO(this);
        } 

    } 

}
