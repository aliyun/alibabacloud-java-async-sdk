// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagManifestRequest} extends {@link RequestModel}
 *
 * <p>GetRepoTagManifestRequest</p>
 */
public class GetRepoTagManifestRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("SchemaVersion")
    @Validation(required = true)
    private Integer schemaVersion;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    private GetRepoTagManifestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.schemaVersion = builder.schemaVersion;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagManifestRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return schemaVersion
     */
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<GetRepoTagManifestRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String repoId; 
        private Integer schemaVersion; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoTagManifestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.schemaVersion = request.schemaVersion;
            this.tag = request.tag;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the repository.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The schema version of the manifest. Valid values: 1 and 2.
         */
        public Builder schemaVersion(Integer schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * The tag of the image.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public GetRepoTagManifestRequest build() {
            return new GetRepoTagManifestRequest(this);
        } 

    } 

}
