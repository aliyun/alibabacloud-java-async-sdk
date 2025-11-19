// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ModifySecurityIPGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIPGroupRelationRequest</p>
 */
public class ModifySecurityIPGroupRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalSecurityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionName;

    private ModifySecurityIPGroupRelationRequest(Builder builder) {
        super(builder);
        this.globalSecurityGroupId = builder.globalSecurityGroupId;
        this.instanceId = builder.instanceId;
        this.regionName = builder.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIPGroupRelationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalSecurityGroupId
     */
    public String getGlobalSecurityGroupId() {
        return this.globalSecurityGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIPGroupRelationRequest, Builder> {
        private String globalSecurityGroupId; 
        private String instanceId; 
        private String regionName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIPGroupRelationRequest request) {
            super(request);
            this.globalSecurityGroupId = request.globalSecurityGroupId;
            this.instanceId = request.instanceId;
            this.regionName = request.regionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>g-ggh7qvrrwikyxe****</p>
         */
        public Builder globalSecurityGroupId(String globalSecurityGroupId) {
            this.putQueryParameter("GlobalSecurityGroupId", globalSecurityGroupId);
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1u5mas9exx7****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        @Override
        public ModifySecurityIPGroupRelationRequest build() {
            return new ModifySecurityIPGroupRelationRequest(this);
        } 

    } 

}
