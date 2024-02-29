// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableLevelRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableLevelRequest</p>
 */
public class DeleteTableLevelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("LevelId")
    @Validation(required = true, minimum = 1)
    private Long levelId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    private DeleteTableLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.levelId = builder.levelId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableLevelRequest create() {
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
     * @return levelId
     */
    public Long getLevelId() {
        return this.levelId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DeleteTableLevelRequest, Builder> {
        private String regionId; 
        private Long levelId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.levelId = request.levelId;
            this.projectId = request.projectId;
        } 

        /**
         * The ID of the region where the service is activated.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the table level to be deleted. You can call the ListTableLevel operation to obtain the ID.
         */
        public Builder levelId(Long levelId) {
            this.putQueryParameter("LevelId", levelId);
            this.levelId = levelId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DeleteTableLevelRequest build() {
            return new DeleteTableLevelRequest(this);
        } 

    } 

}
