// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsBlackWhiteVersionsRequest} extends {@link RequestModel}
 *
 * <p>UpdateOsBlackWhiteVersionsRequest</p>
 */
public class UpdateOsBlackWhiteVersionsRequest extends Request {
    @Query
    @NameInMap("BlackVersions")
    private String blackVersions;

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
    @NameInMap("WhiteVersions")
    private String whiteVersions;

    private UpdateOsBlackWhiteVersionsRequest(Builder builder) {
        super(builder);
        this.blackVersions = builder.blackVersions;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionId = builder.versionId;
        this.whiteVersions = builder.whiteVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOsBlackWhiteVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackVersions
     */
    public String getBlackVersions() {
        return this.blackVersions;
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
     * @return whiteVersions
     */
    public String getWhiteVersions() {
        return this.whiteVersions;
    }

    public static final class Builder extends Request.Builder<UpdateOsBlackWhiteVersionsRequest, Builder> {
        private String blackVersions; 
        private String projectId; 
        private String regionId; 
        private String versionId; 
        private String whiteVersions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOsBlackWhiteVersionsRequest response) {
            super(response);
            this.blackVersions = response.blackVersions;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionId = response.versionId;
            this.whiteVersions = response.whiteVersions;
        } 

        /**
         * BlackVersions.
         */
        public Builder blackVersions(String blackVersions) {
            this.putQueryParameter("BlackVersions", blackVersions);
            this.blackVersions = blackVersions;
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
         * WhiteVersions.
         */
        public Builder whiteVersions(String whiteVersions) {
            this.putQueryParameter("WhiteVersions", whiteVersions);
            this.whiteVersions = whiteVersions;
            return this;
        }

        @Override
        public UpdateOsBlackWhiteVersionsRequest build() {
            return new UpdateOsBlackWhiteVersionsRequest(this);
        } 

    } 

}
