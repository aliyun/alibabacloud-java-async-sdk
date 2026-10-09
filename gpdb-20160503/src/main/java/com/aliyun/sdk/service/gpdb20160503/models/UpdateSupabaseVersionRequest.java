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
 * {@link UpdateSupabaseVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSupabaseVersionRequest</p>
 */
public class UpdateSupabaseVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateSupabaseVersionRequest(Builder builder) {
        super(builder);
        this.minorVersion = builder.minorVersion;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSupabaseVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
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

    public static final class Builder extends Request.Builder<UpdateSupabaseVersionRequest, Builder> {
        private String minorVersion; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSupabaseVersionRequest request) {
            super(request);
            this.minorVersion = request.minorVersion;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The target minor version. You can query the supported upgrade versions for the current project by calling GetSupabaseUpdateVersion.</p>
         * 
         * <strong>example:</strong>
         * <p>20240731</p>
         */
        public Builder minorVersion(String minorVersion) {
            this.putQueryParameter("MinorVersion", minorVersion);
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * <p>The ID of the Supabase project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxx</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateSupabaseVersionRequest build() {
            return new UpdateSupabaseVersionRequest(this);
        } 

    } 

}
