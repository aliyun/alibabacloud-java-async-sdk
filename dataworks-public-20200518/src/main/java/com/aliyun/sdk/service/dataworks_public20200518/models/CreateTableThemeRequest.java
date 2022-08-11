// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableThemeRequest} extends {@link RequestModel}
 *
 * <p>CreateTableThemeRequest</p>
 */
public class CreateTableThemeRequest extends Request {
    @Query
    @NameInMap("Level")
    @Validation(required = true, maximum = 10, minimum = 1)
    private Integer level;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParentId")
    @Validation(minimum = 1)
    private Long parentId;

    @Query
    @NameInMap("ProjectId")
    @Validation(minimum = 1)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateTableThemeRequest(Builder builder) {
        super(builder);
        this.level = builder.level;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableThemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
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
    public Long getParentId() {
        return this.parentId;
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

    public static final class Builder extends Request.Builder<CreateTableThemeRequest, Builder> {
        private Integer level; 
        private String name; 
        private Long parentId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableThemeRequest request) {
            super(request);
            this.level = request.level;
            this.name = request.name;
            this.parentId = request.parentId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.putQueryParameter("Level", level);
            this.level = level;
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
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
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
        public CreateTableThemeRequest build() {
            return new CreateTableThemeRequest(this);
        } 

    } 

}
