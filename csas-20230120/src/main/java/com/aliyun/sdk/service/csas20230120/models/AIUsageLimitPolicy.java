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
 * {@link AIUsageLimitPolicy} extends {@link TeaModel}
 *
 * <p>AIUsageLimitPolicy</p>
 */
public class AIUsageLimitPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("LimitPolicyId")
    private String limitPolicyId;

    @com.aliyun.core.annotation.NameInMap("LimitValue")
    private Long limitValue;

    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("ResetPeriod")
    private String resetPeriod;

    @com.aliyun.core.annotation.NameInMap("ServiceIds")
    private java.util.List<String> serviceIds;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    private AIUsageLimitPolicy(Builder builder) {
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.limitPolicyId = builder.limitPolicyId;
        this.limitValue = builder.limitValue;
        this.metricType = builder.metricType;
        this.name = builder.name;
        this.priority = builder.priority;
        this.resetPeriod = builder.resetPeriod;
        this.serviceIds = builder.serviceIds;
        this.status = builder.status;
        this.userGroupIds = builder.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIUsageLimitPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return limitPolicyId
     */
    public String getLimitPolicyId() {
        return this.limitPolicyId;
    }

    /**
     * @return limitValue
     */
    public Long getLimitValue() {
        return this.limitValue;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return resetPeriod
     */
    public String getResetPeriod() {
        return this.resetPeriod;
    }

    /**
     * @return serviceIds
     */
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public static final class Builder {
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private String limitPolicyId; 
        private Long limitValue; 
        private String metricType; 
        private String name; 
        private Integer priority; 
        private String resetPeriod; 
        private java.util.List<String> serviceIds; 
        private String status; 
        private java.util.List<String> userGroupIds; 

        private Builder() {
        } 

        private Builder(AIUsageLimitPolicy model) {
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.limitPolicyId = model.limitPolicyId;
            this.limitValue = model.limitValue;
            this.metricType = model.metricType;
            this.name = model.name;
            this.priority = model.priority;
            this.resetPeriod = model.resetPeriod;
            this.serviceIds = model.serviceIds;
            this.status = model.status;
            this.userGroupIds = model.userGroupIds;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * LimitPolicyId.
         */
        public Builder limitPolicyId(String limitPolicyId) {
            this.limitPolicyId = limitPolicyId;
            return this;
        }

        /**
         * LimitValue.
         */
        public Builder limitValue(Long limitValue) {
            this.limitValue = limitValue;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * ResetPeriod.
         */
        public Builder resetPeriod(String resetPeriod) {
            this.resetPeriod = resetPeriod;
            return this;
        }

        /**
         * ServiceIds.
         */
        public Builder serviceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
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
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }

        public AIUsageLimitPolicy build() {
            return new AIUsageLimitPolicy(this);
        } 

    } 

}
