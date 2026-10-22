// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyProjectAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ModifyProjectAuthorizationRequest</p>
 */
public class ModifyProjectAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private Integer scopeType;

    private ModifyProjectAuthorizationRequest(Builder builder) {
        super(builder);
        this.authorizationId = builder.authorizationId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProjectAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationId
     */
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scopeType
     */
    public Integer getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<ModifyProjectAuthorizationRequest, Builder> {
        private Long authorizationId; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String regionId; 
        private Integer scopeType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProjectAuthorizationRequest request) {
            super(request);
            this.authorizationId = request.authorizationId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>The ID of the project authorization to be modified.</p>
         * <blockquote>
         * <p>You can call the ListProjectAuthorizations operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authorizationId(Long authorizationId) {
            this.putQueryParameter("AuthorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * <p>The new description of the project authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new name of the project authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
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
         * <p>The scope of assets that can be managed by the authorization after modification. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: all projects</p>
         * </li>
         * <li><p><strong>2</strong>: specified projects</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scopeType(Integer scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public ModifyProjectAuthorizationRequest build() {
            return new ModifyProjectAuthorizationRequest(this);
        } 

    } 

}
