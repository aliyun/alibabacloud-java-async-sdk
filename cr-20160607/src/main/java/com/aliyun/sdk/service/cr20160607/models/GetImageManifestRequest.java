// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageManifestRequest} extends {@link RequestModel}
 *
 * <p>GetImageManifestRequest</p>
 */
public class GetImageManifestRequest extends Request {
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SchemaVersion")
    private Integer schemaVersion;

    private GetImageManifestRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.schemaVersion = builder.schemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageManifestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schemaVersion
     */
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    public static final class Builder extends Request.Builder<GetImageManifestRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private String tag; 
        private String regionId; 
        private Integer schemaVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetImageManifestRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.schemaVersion = response.schemaVersion;
        } 

        /**
         * RepoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putPathParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putPathParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putPathParameter("Tag", tag);
            this.tag = tag;
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
         * SchemaVersion.
         */
        public Builder schemaVersion(Integer schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        @Override
        public GetImageManifestRequest build() {
            return new GetImageManifestRequest(this);
        } 

    } 

}
