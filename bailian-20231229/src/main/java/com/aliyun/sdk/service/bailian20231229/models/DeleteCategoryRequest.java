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
 * {@link DeleteCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteCategoryRequest</p>
 */
public class DeleteCategoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCategoryRequest, Builder> {
        private String categoryId; 
        private String workspaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3510024405</p>
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
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
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteCategoryRequest build() {
            return new DeleteCategoryRequest(this);
        } 

    } 

}
