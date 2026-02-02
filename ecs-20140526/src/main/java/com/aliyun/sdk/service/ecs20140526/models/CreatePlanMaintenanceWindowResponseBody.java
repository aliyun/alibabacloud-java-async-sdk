// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreatePlanMaintenanceWindowResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePlanMaintenanceWindowResponseBody</p>
 */
public class CreatePlanMaintenanceWindowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlanWindowId")
    private String planWindowId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePlanMaintenanceWindowResponseBody(Builder builder) {
        this.planWindowId = builder.planWindowId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlanMaintenanceWindowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planWindowId
     */
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String planWindowId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePlanMaintenanceWindowResponseBody model) {
            this.planWindowId = model.planWindowId;
            this.requestId = model.requestId;
        } 

        /**
         * PlanWindowId.
         */
        public Builder planWindowId(String planWindowId) {
            this.planWindowId = planWindowId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePlanMaintenanceWindowResponseBody build() {
            return new CreatePlanMaintenanceWindowResponseBody(this);
        } 

    } 

}
