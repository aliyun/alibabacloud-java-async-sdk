// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBackupsRequest} extends {@link RequestModel}
 *
 * <p>ListBackupsRequest</p>
 */
public class ListBackupsRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private java.util.List < String > backupId;

    @Query
    @NameInMap("BackupPlanId")
    private String backupPlanId;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CurrentSize")
    private Integer currentSize;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("MetadataType")
    private String metadataType;

    @Query
    @NameInMap("OrderMode")
    private String orderMode;

    @Query
    @NameInMap("PageCount")
    private Integer pageCount;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("Status")
    private String status;

    private ListBackupsRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.backupPlanId = builder.backupPlanId;
        this.bizId = builder.bizId;
        this.clusterId = builder.clusterId;
        this.currentSize = builder.currentSize;
        this.id = builder.id;
        this.limit = builder.limit;
        this.metadataType = builder.metadataType;
        this.orderMode = builder.orderMode;
        this.pageCount = builder.pageCount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public java.util.List < String > getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return currentSize
     */
    public Integer getCurrentSize() {
        return this.currentSize;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return metadataType
     */
    public String getMetadataType() {
        return this.metadataType;
    }

    /**
     * @return orderMode
     */
    public String getOrderMode() {
        return this.orderMode;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListBackupsRequest, Builder> {
        private java.util.List < String > backupId; 
        private String backupPlanId; 
        private String bizId; 
        private String clusterId; 
        private Integer currentSize; 
        private Long id; 
        private Integer limit; 
        private String metadataType; 
        private String orderMode; 
        private Integer pageCount; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListBackupsRequest response) {
            super(response);
            this.backupId = response.backupId;
            this.backupPlanId = response.backupPlanId;
            this.bizId = response.bizId;
            this.clusterId = response.clusterId;
            this.currentSize = response.currentSize;
            this.id = response.id;
            this.limit = response.limit;
            this.metadataType = response.metadataType;
            this.orderMode = response.orderMode;
            this.pageCount = response.pageCount;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serviceName = response.serviceName;
            this.status = response.status;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(java.util.List < String > backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CurrentSize.
         */
        public Builder currentSize(Integer currentSize) {
            this.putQueryParameter("CurrentSize", currentSize);
            this.currentSize = currentSize;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * MetadataType.
         */
        public Builder metadataType(String metadataType) {
            this.putQueryParameter("MetadataType", metadataType);
            this.metadataType = metadataType;
            return this;
        }

        /**
         * OrderMode.
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.putQueryParameter("PageCount", pageCount);
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListBackupsRequest build() {
            return new ListBackupsRequest(this);
        } 

    } 

}
