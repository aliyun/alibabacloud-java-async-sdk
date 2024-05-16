// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableThemeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableThemeRequest</p>
 */
public class UpdateTableThemeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long themeId;

    private UpdateTableThemeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.projectId = builder.projectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return themeId
     */
    public Long getThemeId() {
        return this.themeId;
    }

    public static final class Builder extends Request.Builder<UpdateTableThemeRequest, Builder> {
        private String regionId; 
        private String name; 
        private Long projectId; 
        private Long themeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableThemeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.projectId = request.projectId;
            this.themeId = request.themeId;
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
         * The name of the table folder.
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

        /**
         * The ID of the table folder.
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
