// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableLevelRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableLevelRequest</p>
 */
public class UpdateTableLevelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long levelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelType")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer levelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    private UpdateTableLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.levelId = builder.levelId;
        this.levelType = builder.levelType;
        this.name = builder.name;
        this.projectId = builder.projectId;
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

    public static final class Builder extends Request.Builder<UpdateTableLevelRequest, Builder> {
        private String regionId; 
        private String description; 
        private Long levelId; 
        private Integer levelType; 
        private String name; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.levelId = request.levelId;
            this.levelType = request.levelType;
            this.name = request.name;
            this.projectId = request.projectId;
        } 

        /**
         * RegionId.
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
         * The ID of the table level. You can call the ListTableLevel operation to query the ID.
         */
        public Builder levelId(Long levelId) {
            this.putQueryParameter("LevelId", levelId);
            this.levelId = levelId;
            return this;
        }

        /**
         * The table level type. Valid values: 1 and 2. The value 1 indicates the logical level. The value 2 indicates the physical level.
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
        public UpdateTableLevelRequest build() {
            return new UpdateTableLevelRequest(this);
        } 

    } 

}
