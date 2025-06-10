// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetRepoTagScanStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRepoTagScanStatusRequest</p>
 */
public class GetRepoTagScanStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Digest")
    private String digest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanTaskId")
    private String scanTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private GetRepoTagScanStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.scanTaskId = builder.scanTaskId;
        this.scanType = builder.scanType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanStatusRequest create() {
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
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<GetRepoTagScanStatusRequest, Builder> {
        private String regionId; 
        private String digest; 
        private String instanceId; 
        private String repoId; 
        private String scanTaskId; 
        private String scanType; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoTagScanStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.digest = request.digest;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.scanTaskId = request.scanTaskId;
            this.scanType = request.scanType;
            this.tag = request.tag;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>67bfbcc12b67936ec7f867927817cbb071832b873dbcaed312a1930ba5f1d529</p>
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-2j88dtld8yel****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-uf082u9dg8do****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The ID of the image scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>838152F9-F725-5A52-A344-8972D65AC045</p>
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
            return this;
        }

        /**
         * ScanType.
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public GetRepoTagScanStatusRequest build() {
            return new GetRepoTagScanStatusRequest(this);
        } 

    } 

}
