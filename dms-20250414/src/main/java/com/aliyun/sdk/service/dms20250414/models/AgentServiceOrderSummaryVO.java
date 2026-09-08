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
 * {@link AgentServiceOrderSummaryVO} extends {@link TeaModel}
 *
 * <p>AgentServiceOrderSummaryVO</p>
 */
public class AgentServiceOrderSummaryVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentService")
    private String agentService;

    @com.aliyun.core.annotation.NameInMap("DeepResearchQuota")
    private Long deepResearchQuota;

    @com.aliyun.core.annotation.NameInMap("ModelCallQuota")
    private Long modelCallQuota;

    @com.aliyun.core.annotation.NameInMap("OrderCount")
    private Integer orderCount;

    @com.aliyun.core.annotation.NameInMap("ServiceNumTotal")
    private Integer serviceNumTotal;

    @com.aliyun.core.annotation.NameInMap("SkillPlanCallQuota")
    private Long skillPlanCallQuota;

    private AgentServiceOrderSummaryVO(Builder builder) {
        this.agentService = builder.agentService;
        this.deepResearchQuota = builder.deepResearchQuota;
        this.modelCallQuota = builder.modelCallQuota;
        this.orderCount = builder.orderCount;
        this.serviceNumTotal = builder.serviceNumTotal;
        this.skillPlanCallQuota = builder.skillPlanCallQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentServiceOrderSummaryVO create() {
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
    public Long getDeepResearchQuota() {
        return this.deepResearchQuota;
    }

    /**
     * @return modelCallQuota
     */
    public Long getModelCallQuota() {
        return this.modelCallQuota;
    }

    /**
     * @return orderCount
     */
    public Integer getOrderCount() {
        return this.orderCount;
    }

    /**
     * @return serviceNumTotal
     */
    public Integer getServiceNumTotal() {
        return this.serviceNumTotal;
    }

    /**
     * @return skillPlanCallQuota
     */
    public Long getSkillPlanCallQuota() {
        return this.skillPlanCallQuota;
    }

    public static final class Builder {
        private String agentService; 
        private Long deepResearchQuota; 
        private Long modelCallQuota; 
        private Integer orderCount; 
        private Integer serviceNumTotal; 
        private Long skillPlanCallQuota; 

        private Builder() {
        } 

        private Builder(AgentServiceOrderSummaryVO model) {
            this.agentService = model.agentService;
            this.deepResearchQuota = model.deepResearchQuota;
            this.modelCallQuota = model.modelCallQuota;
            this.orderCount = model.orderCount;
            this.serviceNumTotal = model.serviceNumTotal;
            this.skillPlanCallQuota = model.skillPlanCallQuota;
        } 

        /**
         * <p>The name of the agent service.</p>
         */
        public Builder agentService(String agentService) {
            this.agentService = agentService;
            return this;
        }

        /**
         * <p>The deep research quota for the service.</p>
         */
        public Builder deepResearchQuota(Long deepResearchQuota) {
            this.deepResearchQuota = deepResearchQuota;
            return this;
        }

        /**
         * <p>The model call quota for the service.</p>
         */
        public Builder modelCallQuota(Long modelCallQuota) {
            this.modelCallQuota = modelCallQuota;
            return this;
        }

        /**
         * <p>The order count for the agent service.</p>
         */
        public Builder orderCount(Integer orderCount) {
            this.orderCount = orderCount;
            return this;
        }

        /**
         * <p>The total number of services.</p>
         */
        public Builder serviceNumTotal(Integer serviceNumTotal) {
            this.serviceNumTotal = serviceNumTotal;
            return this;
        }

        /**
         * <p>The skill plan call quota for the service.</p>
         */
        public Builder skillPlanCallQuota(Long skillPlanCallQuota) {
            this.skillPlanCallQuota = skillPlanCallQuota;
            return this;
        }

        public AgentServiceOrderSummaryVO build() {
            return new AgentServiceOrderSummaryVO(this);
        } 

    } 

}
