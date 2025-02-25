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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Digest")
    private String digest;

    @Query
    @NameInMap("FilterValue")
    private String filterValue;

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

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("ScanTaskId")
    private String scanTaskId;

    @Query
    @NameInMap("ScanType")
    private String scanType;

    @Query
    @NameInMap("Severity")
    private String severity;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("VulQueryKey")
    private String vulQueryKey;

    private ListRepoTagScanResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.digest = builder.digest;
        this.filterValue = builder.filterValue;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.repoId = builder.repoId;
        this.scanTaskId = builder.scanTaskId;
        this.scanType = builder.scanType;
        this.severity = builder.severity;
        this.tag = builder.tag;
        this.vulQueryKey = builder.vulQueryKey;
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
     * @return filterValue
     */
    public String getFilterValue() {
        return this.filterValue;
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

    /**
     * @return vulQueryKey
     */
    public String getVulQueryKey() {
        return this.vulQueryKey;
    }

    public static final class Builder extends Request.Builder<ListRepoTagScanResultRequest, Builder> {
        private String regionId; 
        private String digest; 
        private String filterValue; 
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String repoId; 
        private String scanTaskId; 
        private String scanType; 
        private String severity; 
        private String tag; 
        private String vulQueryKey; 

        private Builder() {
            super();
        } 

        private Builder(ListRepoTagScanResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.digest = request.digest;
            this.filterValue = request.filterValue;
            this.instanceId = request.instanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.repoId = request.repoId;
            this.scanTaskId = request.scanTaskId;
            this.scanType = request.scanType;
            this.severity = request.severity;
            this.tag = request.tag;
            this.vulQueryKey = request.vulQueryKey;
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
         * The parameter whose value that you want to query. Fox example, if the value is `FixCmd`, only the `FixCmd` parameter is returned.
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
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
         * The number of the page to return.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The ID of the security scan task.
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   `cve`: image system vulnerability
         * *   `sca`: image application vulnerability
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * The severity of the vulnerability. Valid values:
         * <p>
         * 
         * *   `High`
         * *   `Medium`
         * *   `Low`
         * *   `Unknown`
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * The name of the image tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The keyword for fuzzy search used in scanning. The value can be a CVE name.
         */
        public Builder vulQueryKey(String vulQueryKey) {
            this.putQueryParameter("VulQueryKey", vulQueryKey);
            this.vulQueryKey = vulQueryKey;
            return this;
        }

        @Override
        public ListRepoTagScanResultRequest build() {
            return new ListRepoTagScanResultRequest(this);
        } 

    } 

}
