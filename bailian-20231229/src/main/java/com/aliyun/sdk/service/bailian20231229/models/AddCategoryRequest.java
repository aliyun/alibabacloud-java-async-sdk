// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddCategoryRequest} extends {@link RequestModel}
 *
 * <p>AddCategoryRequest</p>
 */
public class AddCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    private String parentCategoryId;

    private AddCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.categoryName = builder.categoryName;
        this.categoryType = builder.categoryType;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCategoryRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return parentCategoryId
     */
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder extends Request.Builder<AddCategoryRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String categoryName; 
        private String categoryType; 
        private String parentCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(AddCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.categoryName = request.categoryName;
            this.categoryType = request.categoryType;
            this.parentCategoryId = request.parentCategoryId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3AXoiweeTyTd03IN</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder categoryName(String categoryName) {
            this.putBodyParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSTRUCTURED</p>
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * ParentCategoryId.
         */
        public Builder parentCategoryId(String parentCategoryId) {
            this.putBodyParameter("ParentCategoryId", parentCategoryId);
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        @Override
        public AddCategoryRequest build() {
            return new AddCategoryRequest(this);
        } 

    } 

}
