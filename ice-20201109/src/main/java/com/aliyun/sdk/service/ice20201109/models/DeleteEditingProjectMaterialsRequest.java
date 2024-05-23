// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEditingProjectMaterialsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEditingProjectMaterialsRequest</p>
 */
public class DeleteEditingProjectMaterialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String materialIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String materialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private DeleteEditingProjectMaterialsRequest(Builder builder) {
        super(builder);
        this.materialIds = builder.materialIds;
        this.materialType = builder.materialType;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEditingProjectMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return materialIds
     */
    public String getMaterialIds() {
        return this.materialIds;
    }

    /**
     * @return materialType
     */
    public String getMaterialType() {
        return this.materialType;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DeleteEditingProjectMaterialsRequest, Builder> {
        private String materialIds; 
        private String materialType; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEditingProjectMaterialsRequest request) {
            super(request);
            this.materialIds = request.materialIds;
            this.materialType = request.materialType;
            this.projectId = request.projectId;
        } 

        /**
         * MaterialIds.
         */
        public Builder materialIds(String materialIds) {
            this.putQueryParameter("MaterialIds", materialIds);
            this.materialIds = materialIds;
            return this;
        }

        /**
         * MaterialType.
         */
        public Builder materialType(String materialType) {
            this.putQueryParameter("MaterialType", materialType);
            this.materialType = materialType;
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
        public DeleteEditingProjectMaterialsRequest build() {
            return new DeleteEditingProjectMaterialsRequest(this);
        } 

    } 

}
