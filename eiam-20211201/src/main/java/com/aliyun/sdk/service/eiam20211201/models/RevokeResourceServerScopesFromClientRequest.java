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
 * {@link RevokeResourceServerScopesFromClientRequest} extends {@link RequestModel}
 *
 * <p>RevokeResourceServerScopesFromClientRequest</p>
 */
public class RevokeResourceServerScopesFromClientRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String clientApplicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String resourceServerApplicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceServerScopeIds;

    private RevokeResourceServerScopesFromClientRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientApplicationId = builder.clientApplicationId;
        this.instanceId = builder.instanceId;
        this.resourceServerApplicationId = builder.resourceServerApplicationId;
        this.resourceServerScopeIds = builder.resourceServerScopeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeResourceServerScopesFromClientRequest create() {
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
     * @return clientApplicationId
     */
    public String getClientApplicationId() {
        return this.clientApplicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceServerApplicationId
     */
    public String getResourceServerApplicationId() {
        return this.resourceServerApplicationId;
    }

    /**
     * @return resourceServerScopeIds
     */
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

    public static final class Builder extends Request.Builder<RevokeResourceServerScopesFromClientRequest, Builder> {
        private String regionId; 
        private String clientApplicationId; 
        private String instanceId; 
        private String resourceServerApplicationId; 
        private java.util.List<String> resourceServerScopeIds; 

        private Builder() {
            super();
        } 

        private Builder(RevokeResourceServerScopesFromClientRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientApplicationId = request.clientApplicationId;
            this.instanceId = request.instanceId;
            this.resourceServerApplicationId = request.resourceServerApplicationId;
            this.resourceServerScopeIds = request.resourceServerScopeIds;
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
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder clientApplicationId(String clientApplicationId) {
            this.putQueryParameter("ClientApplicationId", clientApplicationId);
            this.clientApplicationId = clientApplicationId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
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

        /**
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder resourceServerApplicationId(String resourceServerApplicationId) {
            this.putQueryParameter("ResourceServerApplicationId", resourceServerApplicationId);
            this.resourceServerApplicationId = resourceServerApplicationId;
            return this;
        }

        /**
         * <p>ResourceServer权限ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ress_XXXXX&quot;,&quot;ress_XXXXX&quot;]</p>
         */
        public Builder resourceServerScopeIds(java.util.List<String> resourceServerScopeIds) {
            this.putQueryParameter("ResourceServerScopeIds", resourceServerScopeIds);
            this.resourceServerScopeIds = resourceServerScopeIds;
            return this;
        }

        @Override
        public RevokeResourceServerScopesFromClientRequest build() {
            return new RevokeResourceServerScopesFromClientRequest(this);
        } 

    } 

}
