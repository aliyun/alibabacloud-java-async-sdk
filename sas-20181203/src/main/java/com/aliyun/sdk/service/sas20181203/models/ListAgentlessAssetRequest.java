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
 * {@link ListAgentlessAssetRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessAssetRequest</p>
 */
public class ListAgentlessAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRegionId")
    private String scanRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    private ListAgentlessAssetRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.diskType = builder.diskType;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.scanRegionId = builder.scanRegionId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return scanRegionId
     */
    public String getScanRegionId() {
        return this.scanRegionId;
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListAgentlessAssetRequest, Builder> {
        private Integer currentPage; 
        private String diskType; 
        private String instanceId; 
        private String instanceName; 
        private Integer pageSize; 
        private String platform; 
        private String scanRegionId; 
        private Integer targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessAssetRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.diskType = request.diskType;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
            this.scanRegionId = request.scanRegionId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The page number in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The type of the cloud disk. Values:</p>
         * <ul>
         * <li><p><strong>system</strong>: System disk</p>
         * </li>
         * <li><p><strong>data</strong>: Data disk</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The ID of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1g6wxdwps7s9dz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_cpm_******</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The maximum number of items to return per page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder scanRegionId(String scanRegionId) {
            this.putQueryParameter("ScanRegionId", scanRegionId);
            this.scanRegionId = scanRegionId;
            return this;
        }

        /**
         * <p>The type of the detection target. Values:</p>
         * <ul>
         * <li><p><strong>3</strong>: User snapshot</p>
         * </li>
         * <li><p><strong>4</strong>: User-defined image</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListAgentlessAssetRequest build() {
            return new ListAgentlessAssetRequest(this);
        } 

    } 

}
