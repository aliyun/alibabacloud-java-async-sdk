// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTableThemeRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableThemeRequest</p>
 */
public class DeleteTableThemeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long themeId;

    private DeleteTableThemeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DeleteTableThemeRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private Long themeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableThemeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.themeId = request.themeId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The ID of the theme.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
