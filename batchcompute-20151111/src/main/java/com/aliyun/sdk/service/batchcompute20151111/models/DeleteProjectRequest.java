// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectRequest</p>
 */
public class DeleteProjectRequest extends Request {
    @Path
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteProjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteProjectRequest, Builder> {
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectRequest response) {
            super(response);
            this.projectName = response.projectName;
            this.regionId = response.regionId;
        } 

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("ProjectName", projectName);
            this.projectName = projectName;
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
        public DeleteProjectRequest build() {
            return new DeleteProjectRequest(this);
        } 

    } 

}
