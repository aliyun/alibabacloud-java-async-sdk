// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowEntitySnapshotRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowEntitySnapshotRequest</p>
 */
public class DescribeFlowEntitySnapshotRequest extends Request {
    @Query
    @NameInMap("CommitterId")
    private String committerId;

    @Query
    @NameInMap("CurrentSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer currentSize;

    @Query
    @NameInMap("EntityGroupId")
    private String entityGroupId;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("EntityType")
    private String entityType;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 100, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("OrderField")
    private String orderField;

    @Query
    @NameInMap("OrderMode")
    private String orderMode;

    @Query
    @NameInMap("PageCount")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageCount;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 100, minimum = 1)
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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Revision")
    private String revision;

    private DescribeFlowEntitySnapshotRequest(Builder builder) {
        super(builder);
        this.committerId = builder.committerId;
        this.currentSize = builder.currentSize;
        this.entityGroupId = builder.entityGroupId;
        this.entityId = builder.entityId;
        this.entityType = builder.entityType;
        this.limit = builder.limit;
        this.orderField = builder.orderField;
        this.orderMode = builder.orderMode;
        this.pageCount = builder.pageCount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.revision = builder.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowEntitySnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return committerId
     */
    public String getCommitterId() {
        return this.committerId;
    }

    /**
     * @return currentSize
     */
    public Integer getCurrentSize() {
        return this.currentSize;
    }

    /**
     * @return entityGroupId
     */
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
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
     * @return revision
     */
    public String getRevision() {
        return this.revision;
    }

    public static final class Builder extends Request.Builder<DescribeFlowEntitySnapshotRequest, Builder> {
        private String committerId; 
        private Integer currentSize; 
        private String entityGroupId; 
        private String entityId; 
        private String entityType; 
        private Integer limit; 
        private String orderField; 
        private String orderMode; 
        private Integer pageCount; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String revision; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowEntitySnapshotRequest response) {
            super(response);
            this.committerId = response.committerId;
            this.currentSize = response.currentSize;
            this.entityGroupId = response.entityGroupId;
            this.entityId = response.entityId;
            this.entityType = response.entityType;
            this.limit = response.limit;
            this.orderField = response.orderField;
            this.orderMode = response.orderMode;
            this.pageCount = response.pageCount;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.revision = response.revision;
        } 

        /**
         * CommitterId.
         */
        public Builder committerId(String committerId) {
            this.putQueryParameter("CommitterId", committerId);
            this.committerId = committerId;
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
         * EntityGroupId.
         */
        public Builder entityGroupId(String entityGroupId) {
            this.putQueryParameter("EntityGroupId", entityGroupId);
            this.entityGroupId = entityGroupId;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
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
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
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
         * Revision.
         */
        public Builder revision(String revision) {
            this.putQueryParameter("Revision", revision);
            this.revision = revision;
            return this;
        }

        @Override
        public DescribeFlowEntitySnapshotRequest build() {
            return new DescribeFlowEntitySnapshotRequest(this);
        } 

    } 

}
