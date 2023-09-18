// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotsRequest</p>
 */
public class ListSnapshotsRequest extends Request {
    @Query
    @NameInMap("AcsProduct")
    private String acsProduct;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotIds")
    private String snapshotIds;

    @Query
    @NameInMap("SourceDiskType")
    private String sourceDiskType;

    private ListSnapshotsRequest(Builder builder) {
        super(builder);
        this.acsProduct = builder.acsProduct;
        this.diskId = builder.diskId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.snapshotIds = builder.snapshotIds;
        this.sourceDiskType = builder.sourceDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acsProduct
     */
    public String getAcsProduct() {
        return this.acsProduct;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public static final class Builder extends Request.Builder<ListSnapshotsRequest, Builder> {
        private String acsProduct; 
        private String diskId; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String snapshotIds; 
        private String sourceDiskType; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotsRequest request) {
            super(request);
            this.acsProduct = request.acsProduct;
            this.diskId = request.diskId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.snapshotIds = request.snapshotIds;
            this.sourceDiskType = request.sourceDiskType;
        } 

        /**
         * AcsProduct.
         */
        public Builder acsProduct(String acsProduct) {
            this.putQueryParameter("AcsProduct", acsProduct);
            this.acsProduct = acsProduct;
            return this;
        }

        /**
         * The disk ID.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the simple application server that corresponds to the snapshots.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The snapshot IDs. The value can be a JSON array that consists of up to 100 snapshot IDs. Separate multiple snapshot IDs with commas (,).
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * The type of the source disk. Valid values:
         * <p>
         * 
         * *   system: system disk.
         * *   data: data disk.
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        @Override
        public ListSnapshotsRequest build() {
            return new ListSnapshotsRequest(this);
        } 

    } 

}
