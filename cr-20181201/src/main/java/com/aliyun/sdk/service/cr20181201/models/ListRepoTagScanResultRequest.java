// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoTagScanResultRequest} extends {@link RequestModel}
 *
 * <p>ListRepoTagScanResultRequest</p>
 */
public class ListRepoTagScanResultRequest extends Request {
    @Query
    @NameInMap("Digest")
    private String digest;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("ScanTaskId")
    private String scanTaskId;

    @Query
    @NameInMap("Severity")
    private String severity;

    @Query
    @NameInMap("Tag")
    private String tag;

    private ListRepoTagScanResultRequest(Builder builder) {
        super(builder);
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
        this.scanTaskId = builder.scanTaskId;
        this.severity = builder.severity;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoTagScanResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return scanTaskId
     */
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListRepoTagScanResultRequest, Builder> {
        private String digest; 
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 
        private String repoId; 
        private String scanTaskId; 
        private String severity; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ListRepoTagScanResultRequest response) {
            super(response);
            this.digest = response.digest;
            this.instanceId = response.instanceId;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
            this.scanTaskId = response.scanTaskId;
            this.severity = response.severity;
            this.tag = response.tag;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
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
        public ListRepoTagScanResultRequest build() {
            return new ListRepoTagScanResultRequest(this);
        } 

    } 

}
