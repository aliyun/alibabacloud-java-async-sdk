// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageSecurityScanCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageSecurityScanCountRequest</p>
 */
public class DescribeImageSecurityScanCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDigest")
    private String imageDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTag")
    private String imageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoRegionId")
    private String repoRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

    private DescribeImageSecurityScanCountRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dealed = builder.dealed;
        this.imageDigest = builder.imageDigest;
        this.imageTag = builder.imageTag;
        this.imageUuid = builder.imageUuid;
        this.repoId = builder.repoId;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoRegionId = builder.repoRegionId;
        this.scanRange = builder.scanRange;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSecurityScanCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return repoInstanceId
     */
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    /**
     * @return repoRegionId
     */
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    /**
     * @return scanRange
     */
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeImageSecurityScanCountRequest, Builder> {
        private String clusterId; 
        private String dealed; 
        private String imageDigest; 
        private String imageTag; 
        private String imageUuid; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoRegionId; 
        private java.util.List<String> scanRange; 
        private java.util.List<String> uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageSecurityScanCountRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dealed = request.dealed;
            this.imageDigest = request.imageDigest;
            this.imageTag = request.imageTag;
            this.imageUuid = request.imageUuid;
            this.repoId = request.repoId;
            this.repoInstanceId = request.repoInstanceId;
            this.repoRegionId = request.repoRegionId;
            this.scanRange = request.scanRange;
            this.uuids = request.uuids;
        } 

        /**
         * <p>Cluster ID for image security scanning.</p>
         * 
         * <strong>example:</strong>
         * <p>cdbbe7aa56cbf4b8f830f83718d26****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Whether it has been processed. Values:</p>
         * <ul>
         * <li><strong>Y</strong>: Processed </li>
         * <li><strong>N</strong>: Not processed </li>
         * <li><strong>A</strong>: All</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>SHA256 value of the image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>a7978d51f5eddf7612ab15ae46bd4b4257bf59da77c2aafc9d9d8ab41bb3****</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>Image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>c958b80f-prd_default-9bb0****</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>Image UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>325bfa067ae6c678e59e8a1b34cc****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>Container image repository ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3df5b5a1f2339eb7ebc7d474b8d4****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Specifies the container image instance ID.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> API to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cri-p2jahwuuwuk7****</p>
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the container image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        /**
         * <p>Scanning scope.</p>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>Instance IDs for image security scanning.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeImageSecurityScanCountRequest build() {
            return new DescribeImageSecurityScanCountRequest(this);
        } 

    } 

}
