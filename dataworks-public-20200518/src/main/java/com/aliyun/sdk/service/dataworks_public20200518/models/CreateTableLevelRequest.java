// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableLevelRequest} extends {@link RequestModel}
 *
 * <p>CreateTableLevelRequest</p>
 */
public class CreateTableLevelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("LevelType")
    @Validation(required = true, maximum = 10, minimum = 1)
    private Integer levelType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(minimum = 1)
    private Long projectId;

    private CreateTableLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.levelType = builder.levelType;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableLevelRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<CreateTableLevelRequest, Builder> {
        private String regionId; 
        private String description; 
        private Integer levelType; 
        private String name; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.levelType = request.levelType;
            this.name = request.name;
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
         * The description of the table level.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The type of the table level. Valid values: 1 and 2. A value of 1 indicates the logical level. A value of 2 indicates the physical level.
         */
        public Builder levelType(Integer levelType) {
            this.putQueryParameter("LevelType", levelType);
            this.levelType = levelType;
            return this;
        }

        /**
         * The name of the table level.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public CreateTableLevelRequest build() {
            return new CreateTableLevelRequest(this);
        } 

    } 

}
