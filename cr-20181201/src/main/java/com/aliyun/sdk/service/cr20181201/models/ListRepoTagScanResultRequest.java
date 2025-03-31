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
 * {@link ListRepoTagScanResultRequest} extends {@link RequestModel}
 *
 * <p>ListRepoTagScanResultRequest</p>
 */
public class ListRepoTagScanResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Digest")
    private String digest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterValue")
    private String filterValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulQueryKey")
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
         * <p>sha256:6b0b094f8a904f8fb6602427aed0d1fa</p>
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>The parameter whose value that you want to query. Fox example, if the value is <code>FixCmd</code>, only the <code>FixCmd</code> parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>FixCmd</p>
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
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
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>The ID of the security scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>6b0b094f-8a90-4f8f-b660-2427aed0****</p>
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><code>cve</code>: image system vulnerability</li>
         * <li><code>sca</code>: image application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * <p>The severity of the vulnerability. Valid values:</p>
         * <ul>
         * <li><code>High</code></li>
         * <li><code>Medium</code></li>
         * <li><code>Low</code></li>
         * <li><code>Unknown</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>The name of the image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The keyword for fuzzy search used in scanning. The value can be a CVE name.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2021</p>
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
