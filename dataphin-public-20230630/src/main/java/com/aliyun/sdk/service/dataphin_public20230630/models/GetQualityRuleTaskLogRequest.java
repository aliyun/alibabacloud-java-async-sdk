// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQualityRuleTaskLogRequest} extends {@link RequestModel}
 *
 * <p>GetQualityRuleTaskLogRequest</p>
 */
public class GetQualityRuleTaskLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleTaskId;

    private GetQualityRuleTaskLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.ruleTaskId = builder.ruleTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleTaskLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return ruleTaskId
     */
    public Long getRuleTaskId() {
        return this.ruleTaskId;
    }

    public static final class Builder extends Request.Builder<GetQualityRuleTaskLogRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private Long ruleTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityRuleTaskLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.ruleTaskId = request.ruleTaskId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder ruleTaskId(Long ruleTaskId) {
            this.putQueryParameter("RuleTaskId", ruleTaskId);
            this.ruleTaskId = ruleTaskId;
            return this;
        }

        @Override
        public GetQualityRuleTaskLogRequest build() {
            return new GetQualityRuleTaskLogRequest(this);
        } 

    } 

}
