// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeReplicationJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeReplicationJobsRequest</p>
 */
public class DescribeReplicationJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private java.util.List < String > jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private Integer jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private java.util.List < String > sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeReplicationJobsRequest(Builder builder) {
        super(builder);
        this.businessStatus = builder.businessStatus;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.sourceId = builder.sourceId;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicationJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public java.util.List < String > getJobId() {
        return this.jobId;
    }

    /**
     * @return jobType
     */
    public Integer getJobType() {
        return this.jobType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return sourceId
     */
    public java.util.List < String > getSourceId() {
        return this.sourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeReplicationJobsRequest, Builder> {
        private String businessStatus; 
        private java.util.List < String > instanceId; 
        private java.util.List < String > jobId; 
        private Integer jobType; 
        private String name; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private java.util.List < String > sourceId; 
        private String status; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReplicationJobsRequest request) {
            super(request);
            this.businessStatus = request.businessStatus;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.jobType = request.jobType;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.sourceId = request.sourceId;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * <p>The business status of the migration job. Valid values:</p>
         * <ul>
         * <li>Preparing: The migration is being prepared.</li>
         * <li>Syncing: Data is being synchronized.</li>
         * <li>Processing: The migration is in progress.</li>
         * <li>Cleaning: Intermediate resources are being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Preparing</p>
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * <p>The IDs of the destination Elastic Compute Service (ECS) instances.</p>
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IDs of the migration jobs. You can specify a maximum of 50 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp19vlwm0tyigbmj****</p>
         */
        public Builder jobId(java.util.List < String > jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The type of the migration job. Valid values:</p>
         * <ul>
         * <li>0: server migration.</li>
         * <li>1: operating system migration.</li>
         * <li>2: cross-zone migration.</li>
         * <li>3: agentless migration for a VMware VM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder jobType(Integer jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The name of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>testMigrationTaskName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
         * <p>Default value: 10.</p>
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
         * <p>The ID of the Alibaba Cloud region to which you want to migrate the source server.</p>
         * <p>For example, if you want to migrate a source server to the China (Hangzhou) region, set this parameter to <code>cn-hangzhou</code>. You can call the <a href="~~25609~~">DescribeRegions</a> operation to query the latest regions.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw3ty5y7****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The IDs of the source servers. You can specify a maximum of 50 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1e2fsl57knvuug****</p>
         */
        public Builder sourceId(java.util.List < String > sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The status of the migration job. Valid values:</p>
         * <ul>
         * <li>Ready: The migration job is not started.</li>
         * <li>Running: The migration job is running.</li>
         * <li>Stopped: The migration job is paused.</li>
         * <li>InError: An error occurs in the migration job.</li>
         * <li>Finished: The migration job is complete.</li>
         * <li>Waiting: The migration job is waiting to run.</li>
         * <li>Expired: The migration job has expired.</li>
         * <li>Deleting: The migration job is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The information about tags that are attached to the SMC resource.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeReplicationJobsRequest build() {
            return new DescribeReplicationJobsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReplicationJobsRequest} extends {@link TeaModel}
     *
     * <p>DescribeReplicationJobsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>The tag key can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>The tag value can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.<a href="http://https://%E3%80%82"></a></p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
