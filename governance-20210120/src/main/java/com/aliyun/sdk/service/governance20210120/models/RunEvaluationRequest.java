// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link RunEvaluationRequest} extends {@link RequestModel}
 *
 * <p>RunEvaluationRequest</p>
 */
public class RunEvaluationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricIds")
    private java.util.List<String> metricIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private RunEvaluationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.metricIds = builder.metricIds;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunEvaluationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return metricIds
     */
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<RunEvaluationRequest, Builder> {
        private Long accountId; 
        private java.util.List<String> metricIds; 
        private String regionId; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(RunEvaluationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.metricIds = request.metricIds;
            this.regionId = request.regionId;
            this.scope = request.scope;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The IDs of the check items to be checked.</p>
         */
        public Builder metricIds(java.util.List<String> metricIds) {
            String metricIdsShrink = shrink(metricIds, "MetricIds", "json");
            this.putQueryParameter("MetricIds", metricIdsShrink);
            this.metricIds = metricIds;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The check range of the governance maturity check. Valid values:</p>
         * <ul>
         * <li>Account (default): A single-account governance maturity check is performed to check only the Alibaba Cloud account that you use to access Cloud Governance Center.</li>
         * <li>ResourceDirectory: A multi-account governance maturity check is performed to check all members within a resource directory. Before you perform a multi-account governance maturity check, you must enable the multi-account governance maturity check feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceDirectory</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public RunEvaluationRequest build() {
            return new RunEvaluationRequest(this);
        } 

    } 

}
