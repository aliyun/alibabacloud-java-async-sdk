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
 * {@link RevokeResourceServerScopesFromOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>RevokeResourceServerScopesFromOrganizationalUnitRequest</p>
 */
public class RevokeResourceServerScopesFromOrganizationalUnitRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String organizationalUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceServerScopeIds;

    private RevokeResourceServerScopesFromOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.resourceServerScopeIds = builder.resourceServerScopeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeResourceServerScopesFromOrganizationalUnitRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * @return resourceServerScopeIds
     */
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

    public static final class Builder extends Request.Builder<RevokeResourceServerScopesFromOrganizationalUnitRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String instanceId; 
        private String organizationalUnitId; 
        private java.util.List<String> resourceServerScopeIds; 

        private Builder() {
            super();
        } 

        private Builder(RevokeResourceServerScopesFromOrganizationalUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.organizationalUnitId = request.organizationalUnitId;
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
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
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
         * <p>组织ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putQueryParameter("OrganizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
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
        public RevokeResourceServerScopesFromOrganizationalUnitRequest build() {
            return new RevokeResourceServerScopesFromOrganizationalUnitRequest(this);
        } 

    } 

}
