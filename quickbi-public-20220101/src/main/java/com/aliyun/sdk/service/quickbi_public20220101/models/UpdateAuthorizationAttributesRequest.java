// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link UpdateAuthorizationAttributesRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationAttributesRequest</p>
 */
public class UpdateAuthorizationAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditPermissionType")
    private Integer editPermissionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsePermissionType")
    private Integer usePermissionType;

    private UpdateAuthorizationAttributesRequest(Builder builder) {
        super(builder);
        this.editPermissionType = builder.editPermissionType;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.usePermissionType = builder.usePermissionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return editPermissionType
     */
    public Integer getEditPermissionType() {
        return this.editPermissionType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return usePermissionType
     */
    public Integer getUsePermissionType() {
        return this.usePermissionType;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationAttributesRequest, Builder> {
        private Integer editPermissionType; 
        private String resourceId; 
        private String resourceType; 
        private Integer usePermissionType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationAttributesRequest request) {
            super(request);
            this.editPermissionType = request.editPermissionType;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.usePermissionType = request.usePermissionType;
        } 

        /**
         * <p>The edit permission type. Valid values:</p>
         * <ul>
         * <li>0: Private.</li>
         * <li>11: All workspace members except guests. For data forms, datasets, and data sources, this value indicates all workspace developers.</li>
         * <li>12: Specified members. For data forms, datasets, and data sources, this value indicates specified developers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder editPermissionType(Integer editPermissionType) {
            this.putQueryParameter("EditPermissionType", editPermissionType);
            this.editPermissionType = editPermissionType;
            return this;
        }

        /**
         * <p>The ID of the resource to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>al*************7ufv</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>dashboard: dashboard.</li>
         * <li>screen: data visualization.</li>
         * <li>report: workbook.</li>
         * <li>ANALYSIS: ad hoc analysis.</li>
         * <li>dashboardOfflineQuery: self-service data retrieval.</li>
         * <li>dataForm: data form.</li>
         * <li>cube: dataset.</li>
         * <li>datasource: data source.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cube</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The usage permission type for datasets and data sources. Valid values:</p>
         * <ul>
         * <li>1: All workspace members except guests.</li>
         * <li>2: Specified members.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usePermissionType(Integer usePermissionType) {
            this.putQueryParameter("UsePermissionType", usePermissionType);
            this.usePermissionType = usePermissionType;
            return this;
        }

        @Override
        public UpdateAuthorizationAttributesRequest build() {
            return new UpdateAuthorizationAttributesRequest(this);
        } 

    } 

}
