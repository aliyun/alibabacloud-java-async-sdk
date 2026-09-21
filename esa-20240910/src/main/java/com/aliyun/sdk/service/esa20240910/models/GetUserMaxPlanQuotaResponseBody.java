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
         * <p>The plan instance ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-b09z4sk9pbls</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The plan name.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Free Edition: entranceplan</li>
         * <li>Basic: basic</li>
         * <li>Standard: medium</li>
         * <li>Premium Edition: high</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Entrance: entranceplan_intl</li>
         * <li>Pro: basicplan_intl</li>
         * <li>Premium: vipplan_intl</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>entranceplan</p>
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>44640</p>
         */
        public Builder quotaValue(String quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C6599BB6-525D-5CFF-86BC-24068E6FB3EE</p>
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
