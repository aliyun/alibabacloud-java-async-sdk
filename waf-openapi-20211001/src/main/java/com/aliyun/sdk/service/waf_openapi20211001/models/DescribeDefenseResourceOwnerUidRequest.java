// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseResourceOwnerUidRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseResourceOwnerUidRequest</p>
 */
public class DescribeDefenseResourceOwnerUidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceNames;

    private DescribeDefenseResourceOwnerUidRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceNames = builder.resourceNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceOwnerUidRequest create() {
        return builder().build();
    }

@Override
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resourceNames
     */
    public String getResourceNames() {
        return this.resourceNames;
    }

    public static final class Builder extends Request.Builder<DescribeDefenseResourceOwnerUidRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String resourceNames; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseResourceOwnerUidRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceNames = request.resourceNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn********60f</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a.com-waf,b.com-waf</p>
         */
        public Builder resourceNames(String resourceNames) {
            this.putQueryParameter("ResourceNames", resourceNames);
            this.resourceNames = resourceNames;
            return this;
        }

        @Override
        public DescribeDefenseResourceOwnerUidRequest build() {
            return new DescribeDefenseResourceOwnerUidRequest(this);
        } 

    } 

}
