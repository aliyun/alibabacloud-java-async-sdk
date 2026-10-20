// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    private String connectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    private String parentCategoryId;

    private AddCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.categoryName = builder.categoryName;
        this.categoryType = builder.categoryType;
        this.connectorId = builder.connectorId;
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
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
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
        private String connectorId; 
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
            this.connectorId = request.connectorId;
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
         * <p>The workspace ID. The category is created in this workspace. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>. The bailian 2023-12-29 version does not provide an API for listing workspaces. Obtain the workspace ID from the Model Studio console before calling this operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The category name. The name must be 1 to 20 characters in length and can contain characters in the Unicode letter category, including letters, Chinese characters, and digits. The name can also contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProductList</p>
         */
        public Builder categoryName(String categoryName) {
            this.putBodyParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>The category type. Valid values:</p>
         * <ul>
         * <li>UNSTRUCTURED: category.</li>
         * </ul>
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
         * <p>The instance ID of the data connector (Connector). Obtain this value from the Model Studio console.</p>
         * 
         * <strong>example:</strong>
         * <p>conn_xxxx</p>
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * <p>The ID of the parent category. The new category is created under this parent category. If this parameter is left empty, a first-level category is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
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
