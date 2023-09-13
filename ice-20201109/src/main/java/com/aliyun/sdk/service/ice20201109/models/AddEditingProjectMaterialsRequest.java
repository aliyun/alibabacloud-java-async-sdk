// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEditingProjectMaterialsRequest} extends {@link RequestModel}
 *
 * <p>AddEditingProjectMaterialsRequest</p>
 */
public class AddEditingProjectMaterialsRequest extends Request {
    @Query
    @NameInMap("MaterialMaps")
    @Validation(required = true)
    private String materialMaps;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private AddEditingProjectMaterialsRequest(Builder builder) {
        super(builder);
        this.materialMaps = builder.materialMaps;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEditingProjectMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return materialMaps
     */
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<AddEditingProjectMaterialsRequest, Builder> {
        private String materialMaps; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(AddEditingProjectMaterialsRequest request) {
            super(request);
            this.materialMaps = request.materialMaps;
            this.projectId = request.projectId;
        } 

        /**
         * MaterialMaps.
         */
        public Builder materialMaps(String materialMaps) {
            this.putQueryParameter("MaterialMaps", materialMaps);
            this.materialMaps = materialMaps;
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

        @Override
        public AddEditingProjectMaterialsRequest build() {
            return new AddEditingProjectMaterialsRequest(this);
        } 

    } 

}
