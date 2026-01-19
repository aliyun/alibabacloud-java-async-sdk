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
 * {@link AuthorizeResourceServerScopesToGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeResourceServerScopesToGroupRequest</p>
 */
public class AuthorizeResourceServerScopesToGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceServerScopeIds;

    private AuthorizeResourceServerScopesToGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.clientToken = builder.clientToken;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.resourceServerScopeIds = builder.resourceServerScopeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeResourceServerScopesToGroupRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceServerScopeIds
     */
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

    public static final class Builder extends Request.Builder<AuthorizeResourceServerScopesToGroupRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String clientToken; 
        private String groupId; 
        private String instanceId; 
        private java.util.List<String> resourceServerScopeIds; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeResourceServerScopesToGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.clientToken = request.clientToken;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>组ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public AuthorizeResourceServerScopesToGroupRequest build() {
            return new AuthorizeResourceServerScopesToGroupRequest(this);
        } 

    } 

}
