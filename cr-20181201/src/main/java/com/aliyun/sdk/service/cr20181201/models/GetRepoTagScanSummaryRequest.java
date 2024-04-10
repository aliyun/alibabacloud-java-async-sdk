// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagScanSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetRepoTagScanSummaryRequest</p>
 */
public class GetRepoTagScanSummaryRequest extends Request {
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
    private String repoId;

    @Query
    @NameInMap("ScanTaskId")
    private String scanTaskId;

    @Query
    @NameInMap("Tag")
    private String tag;

    private GetRepoTagScanSummaryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.scanTaskId = builder.scanTaskId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanSummaryRequest create() {
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
     * @return scanTaskId
     */
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<GetRepoTagScanSummaryRequest, Builder> {
        private String regionId; 
        private String digest; 
        private String instanceId; 
        private String repoId; 
        private String scanTaskId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoTagScanSummaryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.digest = request.digest;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.scanTaskId = request.scanTaskId;
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
         * The number of unknown-severity vulnerabilities.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * The ID of the image repository.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the image tag.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The digest of the image.
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
            return this;
        }

        /**
         * The ID of the security scan task.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public GetRepoTagScanSummaryRequest build() {
            return new GetRepoTagScanSummaryRequest(this);
        } 

    } 

}
