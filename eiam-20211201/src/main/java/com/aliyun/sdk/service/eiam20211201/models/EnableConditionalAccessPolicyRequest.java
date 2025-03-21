// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link EnableConditionalAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>EnableConditionalAccessPolicyRequest</p>
 */
public class EnableConditionalAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String conditionalAccessPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private EnableConditionalAccessPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.conditionalAccessPolicyId = builder.conditionalAccessPolicyId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableConditionalAccessPolicyRequest create() {
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
     * @return conditionalAccessPolicyId
     */
    public String getConditionalAccessPolicyId() {
        return this.conditionalAccessPolicyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<EnableConditionalAccessPolicyRequest, Builder> {
        private String regionId; 
        private String conditionalAccessPolicyId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(EnableConditionalAccessPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.conditionalAccessPolicyId = request.conditionalAccessPolicyId;
            this.instanceId = request.instanceId;
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
         * <p>Conditional Access Policy ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cap_11111</p>
         */
        public Builder conditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.putQueryParameter("ConditionalAccessPolicyId", conditionalAccessPolicyId);
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public EnableConditionalAccessPolicyRequest build() {
            return new EnableConditionalAccessPolicyRequest(this);
        } 

    } 

}
