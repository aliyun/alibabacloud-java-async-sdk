// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppBlackWhiteVersionsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppBlackWhiteVersionsRequest</p>
 */
public class UpdateAppBlackWhiteVersionsRequest extends Request {
    @Query
    @NameInMap("BlackAppVersions")
    private String blackAppVersions;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("WhiteAppVersions")
    private String whiteAppVersions;

    private UpdateAppBlackWhiteVersionsRequest(Builder builder) {
        super(builder);
        this.blackAppVersions = builder.blackAppVersions;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionId = builder.versionId;
        this.whiteAppVersions = builder.whiteAppVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppBlackWhiteVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackAppVersions
     */
    public String getBlackAppVersions() {
        return this.blackAppVersions;
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

    /**
     * @return whiteAppVersions
     */
    public String getWhiteAppVersions() {
        return this.whiteAppVersions;
    }

    public static final class Builder extends Request.Builder<UpdateAppBlackWhiteVersionsRequest, Builder> {
        private String blackAppVersions; 
        private String projectId; 
        private String regionId; 
        private String versionId; 
        private String whiteAppVersions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppBlackWhiteVersionsRequest response) {
            super(response);
            this.blackAppVersions = response.blackAppVersions;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionId = response.versionId;
            this.whiteAppVersions = response.whiteAppVersions;
        } 

        /**
         * BlackAppVersions.
         */
        public Builder blackAppVersions(String blackAppVersions) {
            this.putQueryParameter("BlackAppVersions", blackAppVersions);
            this.blackAppVersions = blackAppVersions;
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

        /**
         * WhiteAppVersions.
         */
        public Builder whiteAppVersions(String whiteAppVersions) {
            this.putQueryParameter("WhiteAppVersions", whiteAppVersions);
            this.whiteAppVersions = whiteAppVersions;
            return this;
        }

        @Override
        public UpdateAppBlackWhiteVersionsRequest build() {
            return new UpdateAppBlackWhiteVersionsRequest(this);
        } 

    } 

}
