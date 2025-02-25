// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScanMaliciousFileByTaskRequest} extends {@link RequestModel}
 *
 * <p>ListScanMaliciousFileByTaskRequest</p>
 */
public class ListScanMaliciousFileByTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Digest")
    private String digest;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("ScanTaskId")
    private String scanTaskId;

    @Query
    @NameInMap("Tag")
    private String tag;

    private ListScanMaliciousFileByTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.level = builder.level;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.repoId = builder.repoId;
        this.scanTaskId = builder.scanTaskId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScanMaliciousFileByTaskRequest create() {
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
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListScanMaliciousFileByTaskRequest, Builder> {
        private String regionId; 
        private String digest; 
        private String instanceId; 
        private String level; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String repoId; 
        private String scanTaskId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ListScanMaliciousFileByTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.digest = request.digest;
            this.instanceId = request.instanceId;
            this.level = request.level;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * Digest.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * ScanTaskId.
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListScanMaliciousFileByTaskRequest build() {
            return new ListScanMaliciousFileByTaskRequest(this);
        } 

    } 

}
