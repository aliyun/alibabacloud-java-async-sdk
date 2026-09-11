// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDtsJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsJobsRequest</p>
 */
public class DescribeDtsJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestProductType")
    private String destProductType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsBisLabel")
    private String dtsBisLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcProductType")
    private String srcProductType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithoutDbList")
    private Boolean withoutDbList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private DescribeDtsJobsRequest(Builder builder) {
        super(builder);
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.destProductType = builder.destProductType;
        this.dtsBisLabel = builder.dtsBisLabel;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.jobType = builder.jobType;
        this.orderColumn = builder.orderColumn;
        this.orderDirection = builder.orderDirection;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.srcProductType = builder.srcProductType;
        this.status = builder.status;
        this.tags = builder.tags;
        this.type = builder.type;
        this.withoutDbList = builder.withoutDbList;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return destProductType
     */
    public String getDestProductType() {
        return this.destProductType;
    }

    /**
     * @return dtsBisLabel
     */
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return srcProductType
     */
    public String getSrcProductType() {
        return this.srcProductType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return withoutDbList
     */
    public Boolean getWithoutDbList() {
        return this.withoutDbList;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<DescribeDtsJobsRequest, Builder> {
        private String dedicatedClusterId; 
        private String destProductType; 
        private String dtsBisLabel; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String groupId; 
        private String instanceId; 
        private String instanceType; 
        private String jobType; 
        private String orderColumn; 
        private String orderDirection; 
        private String ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String params; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String srcProductType; 
        private String status; 
        private String tags; 
        private String type; 
        private Boolean withoutDbList; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsJobsRequest request) {
            super(request);
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.destProductType = request.destProductType;
            this.dtsBisLabel = request.dtsBisLabel;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.jobType = request.jobType;
            this.orderColumn = request.orderColumn;
            this.orderDirection = request.orderDirection;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.params = request.params;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.srcProductType = request.srcProductType;
            this.status = request.status;
            this.tags = request.tags;
            this.type = request.type;
            this.withoutDbList = request.withoutDbList;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the DTS dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtscluster_atyl3b5214uk***</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The type of the source database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder destProductType(String destProductType) {
            this.putQueryParameter("DestProductType", destProductType);
            this.destProductType = destProductType;
            return this;
        }

        /**
         * <p>The environment label of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>online</strong>: online</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder dtsBisLabel(String dtsBisLabel) {
            this.putQueryParameter("DtsBisLabel", dtsBisLabel);
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
         * <blockquote>
         * <p>Separate multiple instance IDs with commas (,). Make sure that the <strong>JobType</strong> parameter is set as expected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtsi03e3zty16i****</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * <blockquote>
         * <p>Separate multiple task IDs with commas (,). Make sure that the <strong>JobType</strong> parameter is set as expected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>qa110wq5r93hb49</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The DTS task ID.</p>
         * <blockquote>
         * <p>In most cases, you do not need to set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pk13r731m****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the source or destination database instance that corresponds to the <strong>InstanceType</strong> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1966yuut4w3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the source or destination database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The task type of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>MIGRATION</strong>: data migration (default).</li>
         * <li><strong>SYNC</strong>: data synchronization.</li>
         * <li><strong>SUBSCRIBE</strong>: change tracking.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MIGRATION</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The sort criterion when the response contains multiple DTS instances. Valid values:</p>
         * <ul>
         * <li><strong>CreateTime</strong>: sorts by task creation time.</li>
         * <li><strong>FinishTime</strong>: sorts by task completion time.</li>
         * <li><strong>duLimit</strong> (dedicated cluster tasks): sorts by the upper limit of DU usage for DTS tasks. This value is supported only for dedicated clusters.</li>
         * </ul>
         * <blockquote>
         * <p>You can also specify <strong>OrderDirection</strong> to set the sort order to ascending or descending.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The sort order of instances. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong>: ascending order. This is the default value.</li>
         * <li><strong>DESC</strong>: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page. Valid values: <strong>10</strong>, <strong>20</strong>, and <strong>30</strong>. Default value: <strong>20</strong>. Maximum value: <strong>30</strong>.</p>
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
         * <p>The specific content of the query condition.</p>
         * <blockquote>
         * <p>Specify <strong>Type</strong> in advance to define the query condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtspk3f13r731m****</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>Deprecated parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the destination database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder srcProductType(String srcProductType) {
            this.putQueryParameter("SrcProductType", srcProductType);
            this.srcProductType = srcProductType;
            return this;
        }

        /**
         * <p>The instance status of the DTS instance. Valid values:</p>
         * <p>Data migration task statuses:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running a precheck.</li>
         * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
         * <li><strong>PreCheckPass</strong>: precheck passed.</li>
         * <li><strong>NotConfigured</strong>: not configured.</li>
         * <li><strong>Migrating</strong>: migrating.</li>
         * <li><strong>Suspending</strong>: paused.</li>
         * <li><strong>MigrationFailed</strong>: migration failed.</li>
         * <li><strong>Finished</strong>: completed.</li>
         * <li><strong>Retrying</strong>: retrying.</li>
         * <li><strong>Upgrade</strong>: upgrading.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Downgrade</strong>: downgrading.</li>
         * </ul>
         * <p>Data synchronization task statuses:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running a precheck.</li>
         * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
         * <li><strong>PreCheckPass</strong>: precheck passed.</li>
         * <li><strong>NotConfigured</strong>: not configured.</li>
         * <li><strong>Initializing</strong>: performing initial synchronization.</li>
         * <li><strong>InitializeFailed</strong>: initial synchronization failed.</li>
         * <li><strong>Synchronizing</strong>: synchronizing.</li>
         * <li><strong>Failed</strong>: synchronization failed.</li>
         * <li><strong>Suspending</strong>: paused.</li>
         * <li><strong>Modifying</strong>: modifying synchronization objects.</li>
         * <li><strong>Finished</strong>: completed.</li>
         * <li><strong>Retrying</strong>: retrying.</li>
         * <li><strong>Upgrade</strong>: upgrading.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Downgrade</strong>: downgrading.</li>
         * </ul>
         * <p>Change tracking task statuses:</p>
         * <ul>
         * <li><strong>NotConfigured</strong>: not configured.</li>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running a precheck.</li>
         * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
         * <li><strong>PreCheckPass</strong>: precheck passed.</li>
         * <li><strong>Starting</strong>: starting.</li>
         * <li><strong>Normal</strong>: normal.</li>
         * <li><strong>Retrying</strong>: retrying.</li>
         * <li><strong>Abnormal</strong>: abnormal.</li>
         * <li><strong>Upgrade</strong>: upgrading.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Downgrade</strong>: downgrading.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Migrating</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tag-based search condition in JSON format.</p>
         * <blockquote>
         * <p>You can call the <strong>ListTagResources</strong> operation to query tag keys and values.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[     {         \&quot;key\&quot;: \&quot;testK\&quot;,         \&quot;value\&quot;: \&quot;testV\&quot;     }  ]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The conditional query parameter. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: queries by DTS instance ID.</li>
         * <li><strong>name</strong>: queries by DTS instance name. Fuzzy match is supported.</li>
         * <li><strong>srcRds</strong>: queries by the ID of the source instance (ApsaraDB RDS).</li>
         * <li><strong>rds</strong>: queries by the ID of the destination instance (ApsaraDB RDS).</li>
         * </ul>
         * <blockquote>
         * <p>Specify the <strong>Params</strong> parameter to provide the specific content of the query condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Specifies whether to exclude task objects from the response (not return the <strong>DbObject</strong> parameter). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: excludes <strong>DbObject</strong> from the response.</li>
         * <li><strong>false</strong>: includes <strong>DbObject</strong> in the response, which can improve the response speed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withoutDbList(Boolean withoutDbList) {
            this.putQueryParameter("WithoutDbList", withoutDbList);
            this.withoutDbList = withoutDbList;
            return this;
        }

        /**
         * <p>Specifies whether the node is a seamless integration (Zero-ETL) node. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: No.</li>
         * <li><strong>true</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public DescribeDtsJobsRequest build() {
            return new DescribeDtsJobsRequest(this);
        } 

    } 

}
