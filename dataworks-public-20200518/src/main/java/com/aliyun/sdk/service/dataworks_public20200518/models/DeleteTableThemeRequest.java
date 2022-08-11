// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableThemeRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableThemeRequest</p>
 */
public class DeleteTableThemeRequest extends Request {
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

    private DeleteTableThemeRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.themeId = builder.themeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableThemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteTableThemeRequest, Builder> {
        private Long projectId; 
        private String regionId; 
        private Long themeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableThemeRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.themeId = request.themeId;
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
        public DeleteTableThemeRequest build() {
            return new DeleteTableThemeRequest(this);
        } 

    } 

}
