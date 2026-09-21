// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListPostpaidRatePlanInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListPostpaidRatePlanInstancesRequest</p>
 */
public class ListPostpaidRatePlanInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckRemainingSiteQuota")
    private String checkRemainingSiteQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    private Long resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnrelatedType")
    private String unrelatedType;

    private ListPostpaidRatePlanInstancesRequest(Builder builder) {
        super(builder);
        this.checkRemainingSiteQuota = builder.checkRemainingSiteQuota;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwner = builder.resourceOwner;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.status = builder.status;
        this.unrelatedType = builder.unrelatedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPostpaidRatePlanInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkRemainingSiteQuota
     */
    public String getCheckRemainingSiteQuota() {
        return this.checkRemainingSiteQuota;
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
     * @return resourceOwner
     */
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return unrelatedType
     */
    public String getUnrelatedType() {
        return this.unrelatedType;
    }

    public static final class Builder extends Request.Builder<ListPostpaidRatePlanInstancesRequest, Builder> {
        private String checkRemainingSiteQuota; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long resourceOwner; 
        private String sortBy; 
        private String sortOrder; 
        private String status; 
        private String unrelatedType; 

        private Builder() {
            super();
        } 

        private Builder(ListPostpaidRatePlanInstancesRequest request) {
            super(request);
            this.checkRemainingSiteQuota = request.checkRemainingSiteQuota;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwner = request.resourceOwner;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.status = request.status;
            this.unrelatedType = request.unrelatedType;
        } 

        /**
         * <p>Specifies whether to check for remaining site quota. Valid values:</p>
         * <ul>
         * <li><p>true: Queries instances that have remaining site quota.</p>
         * </li>
         * <li><p>false: Does not filter by this condition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkRemainingSiteQuota(String checkRemainingSiteQuota) {
            this.putQueryParameter("CheckRemainingSiteQuota", checkRemainingSiteQuota);
            this.checkRemainingSiteQuota = checkRemainingSiteQuota;
            return this;
        }

        /**
         * <p>The instance ID. Use this parameter to query a specific instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-dps-xxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number for paging queries. The value must be greater than or equal to 1.</p>
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
         * <p>The number of entries per page for paging queries. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceOwner.
         */
        public Builder resourceOwner(Long resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>The field by which to sort results. Valid values:</p>
         * <ul>
         * <li>CreateTime: sorted by creation time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>asc: ascending order</p>
         * </li>
         * <li><p>desc: descending order</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p>online: Normal.</p>
         * </li>
         * <li><p>overdue: Overdue payment.</p>
         * </li>
         * <li><p>disable: Released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Specifies whether the instance has purchased additional bot or DDoS protection.</p>
         * 
         * <strong>example:</strong>
         * <p>bot</p>
         */
        public Builder unrelatedType(String unrelatedType) {
            this.putQueryParameter("UnrelatedType", unrelatedType);
            this.unrelatedType = unrelatedType;
            return this;
        }

        @Override
        public ListPostpaidRatePlanInstancesRequest build() {
            return new ListPostpaidRatePlanInstancesRequest(this);
        } 

    } 

}
