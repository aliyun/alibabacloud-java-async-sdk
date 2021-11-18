// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoTagManifestRequest} extends {@link RequestModel}
 *
 * <p>GetRepoTagManifestRequest</p>
 */
public class GetRepoTagManifestRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("SchemaVersion")
    private Integer schemaVersion;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepoId")
    private String repoId;


    private GetRepoTagManifestRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tag = builder.tag;
        this.schemaVersion = builder.schemaVersion;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagManifestRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return schemaVersion
     */
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String tag; 
        private Integer schemaVersion; 
        private String regionId; 
        private String repoId; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Image version</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The Schema version. Valid values: 1 and 2.</p>
         */
        public Builder schemaVersion(Integer schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        public GetRepoTagManifestRequest build() {
            return new GetRepoTagManifestRequest(this);
        } 

    } 

}
