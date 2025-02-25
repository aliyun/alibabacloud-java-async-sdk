// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTagScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagScanTaskRequest</p>
 */
public class CreateRepoTagScanTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Digest")
    private String digest;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("ScanService")
    private String scanService;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    private CreateRepoTagScanTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.scanService = builder.scanService;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTagScanTaskRequest create() {
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
     * @return digest
     */
    public String getDigest() {
        return this.digest;
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
     * @return scanService
     */
    public String getScanService() {
        return this.scanService;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRepoTagScanTaskRequest, Builder> {
        private String regionId; 
        private String digest; 
        private String instanceId; 
        private String repoId; 
        private String scanService; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTagScanTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.digest = request.digest;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.scanService = request.scanService;
            this.tag = request.tag;
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
         * The digest of the image.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
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
         * The ID of the image repository.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The type of the scanning engine.
         * <p>
         * 
         * *   `SAS_SCAN_SERVICE`: Security Center scan engine (paid service)
         * *   `ACR_SCAN_SERVICE`: Container Registry scan engine
         */
        public Builder scanService(String scanService) {
            this.putQueryParameter("ScanService", scanService);
            this.scanService = scanService;
            return this;
        }

        /**
         * The version of the image.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRepoTagScanTaskRequest build() {
            return new CreateRepoTagScanTaskRequest(this);
        } 

    } 

}
