// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link MarketingEndedPlan} extends {@link TeaModel}
 *
 * <p>MarketingEndedPlan</p>
 */
public class MarketingEndedPlan extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    private MarketingEndedPlan(Builder builder) {
        this.endDate = builder.endDate;
        this.planId = builder.planId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketingEndedPlan create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder {
        private String endDate; 
        private String planId; 
        private String projectId; 

        private Builder() {
        } 

        private Builder(MarketingEndedPlan model) {
            this.endDate = model.endDate;
            this.planId = model.planId;
            this.projectId = model.projectId;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public MarketingEndedPlan build() {
            return new MarketingEndedPlan(this);
        } 

    } 

}
