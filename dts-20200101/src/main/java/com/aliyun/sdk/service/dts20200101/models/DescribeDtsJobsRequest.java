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
         * <p>The ID of the DTS dedicated cluster on which the task runs.</p>
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
         * <p>The environment tag of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>online</strong></li>
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
         * <p>The ID of the parent task.</p>
         * <blockquote>
         * <p> In most cases, you do not need to specify this parameter.</p>
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
         * <p>The ID of the source or target database instance corresponding to the request parameter <strong>InstanceType</strong>.</p>
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
         * <p>The type of the source or target database instance.</p>
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
         * <p>The type of the DTS task. Valid values:</p>
         * <ul>
         * <li><strong>MIGRATION</strong>: data migration. This is the default value.</li>
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
         * <p>The basis on which the returned DTS tasks are sorted. Valid values:</p>
         * <ul>
         * <li><strong>CreateTime</strong>: sorts the DTS tasks based on the points in time when the DTS tasks are created.</li>
         * <li><strong>FinishTime</strong>: sorts the DTS tasks based on the points in time when the DTS tasks are complete.</li>
         * <li><strong>duLimit</strong> sorts the DTS tasks based on the upper limits on DTS Units (DUs) that the DTS tasks can use. This option applies only to the DTS tasks that are run on a DTS dedicated cluster.</li>
         * </ul>
         * <blockquote>
         * <p> You can also set the <strong>OrderDirection</strong> parameter to specify whether to sort the DTS tasks in ascending or descending order.</p>
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
         * <p>The order in which the returned DTS tasks are sorted. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong>: sorts the DTS tasks in ascending order. This is the default value.</li>
         * <li><strong>DESC</strong>: sorts the DTS tasks in descending order.</li>
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
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. Valid values: <strong>20</strong>, <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The content of the query condition.</p>
         * <blockquote>
         * <p> You must set the <strong>Type</strong> parameter to specify the type of the query condition.</p>
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
         * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
         * <p>This parameter is deprecated.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-hangzhou</li>
         * <li>cn-shanghai</li>
         * <li>cn-beijing</li>
         * <li>cn-guangzhou</li>
         * <li>cn-shenzhen</li>
         * <li>cn-chengdu</li>
         * <li>cn-heyuan</li>
         * <li>cn-hongkong</li>
         * <li>cn-qingdao</li>
         * <li>cn-zhangbei</li>
         * <li>cn-zhangjiakou</li>
         * <li>us-east-1</li>
         * <li>us-west-1</li>
         * <li>cn-hangzhou-finance</li>
         * <li>cn-shanghai-finance</li>
         * <li>cn-shanghai-finance-1</li>
         * <li>cn-shenzhen-finance</li>
         * <li>cn-shenzhen-finance-1</li>
         * <li>cn-beijing-finance-1</li>
         * <li>cn-huhehaote</li>
         * <li>cn-north-2-gov-1</li>
         * <li>eu-central-1</li>
         * <li>eu-west-1</li>
         * <li>me-central-1</li>
         * <li>me-east-1</li>
         * <li>ap-northeast-1</li>
         * <li>ap-northeast-2</li>
         * <li>ap-southeast-1</li>
         * <li>ap-southeast-2</li>
         * <li>ap-southeast-3</li>
         * <li>ap-southeast-5</li>
         * <li>ap-southeast-6</li>
         * <li>ap-southeast-7</li>
         * <li>cn-wulanchabu</li>
         * <li>cn-zhengzhou-jva</li>
         * <li>cn-wuhan-lr</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The state of the DTS task.</p>
         * <p>Valid values for a data migration task:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>Migrating</strong>: The task is in progress.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>MigrationFailed</strong>: The task failed.</li>
         * <li><strong>Finished</strong>: The task is complete.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
         * </ul>
         * <p>Valid values for a data synchronization task:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>Initializing</strong>: The task is being initialized.</li>
         * <li><strong>InitializeFailed</strong>: Initialization failed.</li>
         * <li><strong>Synchronizing</strong>: The task is in progress.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
         * <li><strong>Finished</strong>: The task is complete.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
         * </ul>
         * <p>Valid values for a change tracking task:</p>
         * <ul>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>Starting</strong>: The task is being started.</li>
         * <li><strong>Normal</strong>: The task is running as expected.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Abnormal</strong>: The task is not running as expected.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
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
         * <p>The tags of the DTS task to be queried. Specify tags in the JSON format.</p>
         * <blockquote>
         * <p> You can call the <strong>ListTagResources</strong> operation to query the tag key and tag value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[     {         &quot;key&quot;: &quot;testK&quot;,         &quot;value&quot;: &quot;testV&quot;     }  ]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: queries DTS tasks based on the ID of a DTS instance.</li>
         * <li><strong>name</strong>: queries DTS tasks based on the name of a DTS instance. Fuzzy match is supported.</li>
         * <li><strong>srcRds</strong>: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the source instance of a DTS task.</li>
         * <li><strong>rds</strong>: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the destination instance of a DTS task.</li>
         * </ul>
         * <blockquote>
         * <p> You must set the <strong>Params</strong> parameter to specify the content of the query condition.</p>
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
         * <p>Specifies whether to skip the <strong>DbObject</strong> parameter in the response. The DbObject parameter specifies the objects of the data migration, data synchronization, or change tracking task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: does not return <strong>DbObject</strong>.</li>
         * <li><strong>false</strong>: returns <strong>DbObject</strong>. If you set this parameter to false, the response time is shortened.</li>
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
         * <p>Whether it is a seamless integration (Zero-ETL) task, the value can be:</p>
         * <ul>
         * <li><strong>false</strong>: No. - <strong>true</strong>: Yes.</li>
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
