// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableLevelRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableLevelRequest</p>
 */
public class UpdateTableLevelRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("LevelId")
    @Validation(required = true, minimum = 1)
    private Long levelId;

    @Query
    @NameInMap("LevelType")
    @Validation(maximum = 10)
    private Integer levelType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateTableLevelRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.levelId = builder.levelId;
        this.levelType = builder.levelType;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableLevelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return levelId
     */
    public Long getLevelId() {
        return this.levelId;
    }

    /**
     * @return levelType
     */
    public Integer getLevelType() {
        return this.levelType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateTableLevelRequest, Builder> {
        private String description; 
        private Long levelId; 
        private Integer levelType; 
        private String name; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableLevelRequest request) {
            super(request);
            this.description = request.description;
            this.levelId = request.levelId;
            this.levelType = request.levelType;
            this.name = request.name;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * LevelId.
         */
        public Builder levelId(Long levelId) {
            this.putQueryParameter("LevelId", levelId);
            this.levelId = levelId;
            return this;
        }

        /**
         * LevelType.
         */
        public Builder levelType(Integer levelType) {
            this.putQueryParameter("LevelType", levelType);
            this.levelType = levelType;
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
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateTableLevelRequest build() {
            return new UpdateTableLevelRequest(this);
        } 

    } 

}
