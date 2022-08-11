// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableThemeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableThemeRequest</p>
 */
public class UpdateTableThemeRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(minimum = 1)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ThemeId")
    @Validation(required = true, minimum = 1)
    private Long themeId;

    private UpdateTableThemeRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.themeId = builder.themeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableThemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return themeId
     */
    public Long getThemeId() {
        return this.themeId;
    }

    public static final class Builder extends Request.Builder<UpdateTableThemeRequest, Builder> {
        private String name; 
        private Long projectId; 
        private String regionId; 
        private Long themeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableThemeRequest request) {
            super(request);
            this.name = request.name;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.themeId = request.themeId;
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

        /**
         * ThemeId.
         */
        public Builder themeId(Long themeId) {
            this.putQueryParameter("ThemeId", themeId);
            this.themeId = themeId;
            return this;
        }

        @Override
        public UpdateTableThemeRequest build() {
            return new UpdateTableThemeRequest(this);
        } 

    } 

}
