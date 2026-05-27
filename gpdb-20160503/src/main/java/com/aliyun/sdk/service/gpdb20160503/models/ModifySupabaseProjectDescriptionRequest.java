// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifySupabaseProjectDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifySupabaseProjectDescriptionRequest</p>
 */
public class ModifySupabaseProjectDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectDescription")
    private String projectDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifySupabaseProjectDescriptionRequest(Builder builder) {
        super(builder);
        this.projectDescription = builder.projectDescription;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupabaseProjectDescriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectDescription
     */
    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifySupabaseProjectDescriptionRequest, Builder> {
        private String projectDescription; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupabaseProjectDescriptionRequest request) {
            super(request);
            this.projectDescription = request.projectDescription;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * ProjectDescription.
         */
        public Builder projectDescription(String projectDescription) {
            this.putQueryParameter("ProjectDescription", projectDescription);
            this.projectDescription = projectDescription;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public ModifySupabaseProjectDescriptionRequest build() {
            return new ModifySupabaseProjectDescriptionRequest(this);
        } 

    } 

}
