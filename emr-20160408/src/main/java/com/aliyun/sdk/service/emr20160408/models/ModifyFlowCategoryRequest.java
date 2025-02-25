// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowCategoryRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowCategoryRequest</p>
 */
public class ModifyFlowCategoryRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyFlowCategoryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyFlowCategoryRequest, Builder> {
        private String id; 
        private String name; 
        private String parentId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowCategoryRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.parentId = request.parentId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public ModifyFlowCategoryRequest build() {
            return new ModifyFlowCategoryRequest(this);
        } 

    } 

}
