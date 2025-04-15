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
 * {@link CreateRepoTagScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagScanTaskRequest</p>
 */
public class CreateRepoTagScanTaskRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanService")
    private String scanService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    private CreateRepoTagScanTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.scanService = builder.scanService;
        this.scanType = builder.scanType;
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

    public static final class Builder extends Request.Builder<CreateRepoTagScanTaskRequest, Builder> {
        private String regionId; 
        private String digest; 
        private String instanceId; 
        private String repoId; 
        private String scanService; 
        private String scanType; 
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
         * <p>The digest of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:815386ebbe9a3490f38785ab11bda34ec8dacf4634af77b8912832d4f85dca04</p>
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-xwvi3osiy4ff****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The type of the scanning engine.</p>
         * <ul>
         * <li><code>SAS_SCAN_SERVICE</code>: Security Center scan engine (paid service)</li>
         * <li><code>ACR_SCAN_SERVICE</code>: Container Registry scan engine</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACR_SCAN_SERVICE</p>
         */
        public Builder scanService(String scanService) {
            this.putQueryParameter("ScanService", scanService);
            this.scanService = scanService;
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
         * <p>The version of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.24</p>
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
