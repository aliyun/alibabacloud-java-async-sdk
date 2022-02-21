// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppVersionRequest</p>
 */
public class DescribeAppVersionRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private DescribeAppVersionRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DescribeAppVersionRequest, Builder> {
        private String projectId; 
        private String regionId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppVersionRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionId = response.versionId;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DescribeAppVersionRequest build() {
            return new DescribeAppVersionRequest(this);
        } 

    } 

}
