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
 * {@link CreateResourceServerScopeRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceServerScopeRequest</p>
 */
public class CreateResourceServerScopeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationType")
    private String authorizationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String resourceServerScopeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceServerScopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeValue")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String resourceServerScopeValue;

    private CreateResourceServerScopeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.authorizationType = builder.authorizationType;
        this.instanceId = builder.instanceId;
        this.resourceServerScopeName = builder.resourceServerScopeName;
        this.resourceServerScopeType = builder.resourceServerScopeType;
        this.resourceServerScopeValue = builder.resourceServerScopeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceServerScopeRequest create() {
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
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceServerScopeName
     */
    public String getResourceServerScopeName() {
        return this.resourceServerScopeName;
    }

    /**
     * @return resourceServerScopeType
     */
    public String getResourceServerScopeType() {
        return this.resourceServerScopeType;
    }

    /**
     * @return resourceServerScopeValue
     */
    public String getResourceServerScopeValue() {
        return this.resourceServerScopeValue;
    }

    public static final class Builder extends Request.Builder<CreateResourceServerScopeRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String authorizationType; 
        private String instanceId; 
        private String resourceServerScopeName; 
        private String resourceServerScopeType; 
        private String resourceServerScopeValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceServerScopeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.authorizationType = request.authorizationType;
            this.instanceId = request.instanceId;
            this.resourceServerScopeName = request.resourceServerScopeName;
            this.resourceServerScopeType = request.resourceServerScopeType;
            this.resourceServerScopeValue = request.resourceServerScopeValue;
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
         * AuthorizationType.
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
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
         * <p>权限名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>读取全部用户</p>
         */
        public Builder resourceServerScopeName(String resourceServerScopeName) {
            this.putQueryParameter("ResourceServerScopeName", resourceServerScopeName);
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }

        /**
         * <p>权限类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
         */
        public Builder resourceServerScopeType(String resourceServerScopeType) {
            this.putQueryParameter("ResourceServerScopeType", resourceServerScopeType);
            this.resourceServerScopeType = resourceServerScopeType;
            return this;
        }

        /**
         * <p>权限值，大小写不敏感，格式(${ResourceType}:${ResourceOption}:${ResourceRestrict})</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>User:Read:ALL</p>
         */
        public Builder resourceServerScopeValue(String resourceServerScopeValue) {
            this.putQueryParameter("ResourceServerScopeValue", resourceServerScopeValue);
            this.resourceServerScopeValue = resourceServerScopeValue;
            return this;
        }

        @Override
        public CreateResourceServerScopeRequest build() {
            return new CreateResourceServerScopeRequest(this);
        } 

    } 

}
