// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetVpdGrantRuleRequest} extends {@link RequestModel}
 *
 * <p>GetVpdGrantRuleRequest</p>
 */
public class GetVpdGrantRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantTenantId")
    private String grantTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetVpdGrantRuleRequest(Builder builder) {
        super(builder);
        this.erId = builder.erId;
        this.grantRuleId = builder.grantRuleId;
        this.grantTenantId = builder.grantTenantId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdGrantRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return grantRuleId
     */
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    /**
     * @return grantTenantId
     */
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetVpdGrantRuleRequest, Builder> {
        private String erId; 
        private String grantRuleId; 
        private String grantTenantId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpdGrantRuleRequest request) {
            super(request);
            this.erId = request.erId;
            this.grantRuleId = request.grantRuleId;
            this.grantTenantId = request.grantTenantId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Lingjun HUB Instance Id</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>Authorized Resource Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-xrgvqazb</p>
         */
        public Builder grantRuleId(String grantRuleId) {
            this.putBodyParameter("GrantRuleId", grantRuleId);
            this.grantRuleId = grantRuleId;
            return this;
        }

        /**
         * <p>Authorized Tenant ID</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        public Builder grantTenantId(String grantTenantId) {
            this.putBodyParameter("GrantTenantId", grantTenantId);
            this.grantTenantId = grantTenantId;
            return this;
        }

        /**
         * <p>Authorized Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the region. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetVpdGrantRuleRequest build() {
            return new GetVpdGrantRuleRequest(this);
        } 

    } 

}
