// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetUserMaxPlanQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserMaxPlanQuotaResponseBody</p>
 */
public class GetUserMaxPlanQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("PlanName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("QuotaValue")
    private String quotaValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserMaxPlanQuotaResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.planName = builder.planName;
        this.quotaValue = builder.quotaValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserMaxPlanQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return quotaValue
     */
    public String getQuotaValue() {
        return this.quotaValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String planName; 
        private String quotaValue; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUserMaxPlanQuotaResponseBody model) {
            this.instanceId = model.instanceId;
            this.planName = model.planName;
            this.quotaValue = model.quotaValue;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PlanName.
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * QuotaValue.
         */
        public Builder quotaValue(String quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserMaxPlanQuotaResponseBody build() {
            return new GetUserMaxPlanQuotaResponseBody(this);
        } 

    } 

}
