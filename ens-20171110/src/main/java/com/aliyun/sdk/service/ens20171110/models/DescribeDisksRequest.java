// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDisksRequest</p>
 */
public class DescribeDisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskChargeType")
    private String diskChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIds")
    private String diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private String ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByParams")
    private String orderByParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDisksRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.diskChargeType = builder.diskChargeType;
        this.diskId = builder.diskId;
        this.diskIds = builder.diskIds;
        this.diskName = builder.diskName;
        this.diskType = builder.diskType;
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
        this.instanceId = builder.instanceId;
        this.orderByParams = builder.orderByParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.snapshotId = builder.snapshotId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return diskChargeType
     */
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return diskIds
     */
    public String getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ensRegionIds
     */
    public String getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderByParams
     */
    public String getOrderByParams() {
        return this.orderByParams;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDisksRequest, Builder> {
        private String category; 
        private String diskChargeType; 
        private String diskId; 
        private String diskIds; 
        private String diskName; 
        private String diskType; 
        private String ensRegionId; 
        private String ensRegionIds; 
        private String instanceId; 
        private String orderByParams; 
        private String pageNumber; 
        private String pageSize; 
        private String snapshotId; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDisksRequest request) {
            super(request);
            this.category = request.category;
            this.diskChargeType = request.diskChargeType;
            this.diskId = request.diskId;
            this.diskIds = request.diskIds;
            this.diskName = request.diskName;
            this.diskType = request.diskType;
            this.ensRegionId = request.ensRegionId;
            this.ensRegionIds = request.ensRegionIds;
            this.instanceId = request.instanceId;
            this.orderByParams = request.orderByParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.snapshotId = request.snapshotId;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * The category of the disk.
         * <p>
         * 
         * *   cloud_efficiency: ultra disk.
         * *   cloud_ssd: all-flash disk.
         * *   local_hdd: local HDD.
         * *   local_ssd: local SSD.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The billing method.
         * <p>
         * 
         * *   prePay: subscription.
         * *   postpay: pay-as-you-go.
         */
        public Builder diskChargeType(String diskChargeType) {
            this.putQueryParameter("DiskChargeType", diskChargeType);
            this.diskChargeType = diskChargeType;
            return this;
        }

        /**
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the disk.
         */
        public Builder diskIds(String diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * The name of the disk.
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * The purchase method of the disk. Valid values:
         * <p>
         * 
         * *   ServiceDisk: The disk is purchased when ENS is activated.
         * *   ResoureDisk: The disk is purchased when the instance is created.
         * *   PostPayDisk: The disk is separately purchased.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * The ID of the edge node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The node information.
         */
        public Builder ensRegionIds(String ensRegionIds) {
            this.putQueryParameter("EnsRegionIds", ensRegionIds);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * The ID of the instance to which the disk is attached.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The order in which you want to sort the returned data. Example: {"EnsRegionId":"desc"}. By default, the nodes are sorted by IDs in descending order.
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **50**.
         * <p>
         * 
         * Default value: **10**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The status of the disk. Valid values:
         * <p>
         * 
         * *   In-use: The disk is in use.
         * *   Available: The disk can be attached.
         * *   Attaching: The disk is being attached.
         * *   Detaching: The disk is being detached.
         * *   Creating: The disk is being created.
         * *   ReIniting: The disk is being reset.
         * *   Deleting: The disk is being released.
         * *   Deleted: The disk is released.
         * *   Expiring: The disk is about to expire.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the disk. Valid values:
         * <p>
         * 
         * *   system: system disk.
         * *   data: data disk.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDisksRequest build() {
            return new DescribeDisksRequest(this);
        } 

    } 

}
