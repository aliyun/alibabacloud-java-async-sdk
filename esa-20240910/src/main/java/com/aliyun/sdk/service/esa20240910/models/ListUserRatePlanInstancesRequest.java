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
 * {@link ListUserRatePlanInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListUserRatePlanInstancesRequest</p>
 */
public class ListUserRatePlanInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckRemainingSiteQuota")
    private String checkRemainingSiteQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsShared")
    private Boolean isShared;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanNameEn")
    private String planNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanType")
    private String planType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemainingExpireDays")
    private Integer remainingExpireDays;

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
    @com.aliyun.core.annotation.NameInMap("SubscribeType")
    private String subscribeType;

    private ListUserRatePlanInstancesRequest(Builder builder) {
        super(builder);
        this.checkRemainingSiteQuota = builder.checkRemainingSiteQuota;
        this.instanceId = builder.instanceId;
        this.isShared = builder.isShared;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.planNameEn = builder.planNameEn;
        this.planType = builder.planType;
        this.remainingExpireDays = builder.remainingExpireDays;
        this.resourceOwner = builder.resourceOwner;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.status = builder.status;
        this.subscribeType = builder.subscribeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserRatePlanInstancesRequest create() {
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
     * @return isShared
     */
    public Boolean getIsShared() {
        return this.isShared;
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
     * @return planNameEn
     */
    public String getPlanNameEn() {
        return this.planNameEn;
    }

    /**
     * @return planType
     */
    public String getPlanType() {
        return this.planType;
    }

    /**
     * @return remainingExpireDays
     */
    public Integer getRemainingExpireDays() {
        return this.remainingExpireDays;
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
     * @return subscribeType
     */
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public static final class Builder extends Request.Builder<ListUserRatePlanInstancesRequest, Builder> {
        private String checkRemainingSiteQuota; 
        private String instanceId; 
        private Boolean isShared; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String planNameEn; 
        private String planType; 
        private Integer remainingExpireDays; 
        private Long resourceOwner; 
        private String sortBy; 
        private String sortOrder; 
        private String status; 
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(ListUserRatePlanInstancesRequest request) {
            super(request);
            this.checkRemainingSiteQuota = request.checkRemainingSiteQuota;
            this.instanceId = request.instanceId;
            this.isShared = request.isShared;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.planNameEn = request.planNameEn;
            this.planType = request.planType;
            this.remainingExpireDays = request.remainingExpireDays;
            this.resourceOwner = request.resourceOwner;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.status = request.status;
            this.subscribeType = request.subscribeType;
        } 

        /**
         * <p>Specifies whether to filter plan instances that have remaining site quota. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Filters plan instances that have remaining site quota.</li>
         * <li><strong>false</strong>: Queries all plan instances under the user.</li>
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
         * <p>The plan instance ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsShared.
         */
        public Builder isShared(Boolean isShared) {
            this.putQueryParameter("IsShared", isShared);
            this.isShared = isShared;
            return this;
        }

        /**
         * <p>The page number settings for paging. Default value: <strong>1</strong>. Valid values: <strong>1 to 100000</strong>.</p>
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
         * <p>The number of entries per page for paging. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The plan name (English).</p>
         * 
         * <strong>example:</strong>
         * <p>entranceplan</p>
         */
        public Builder planNameEn(String planNameEn) {
            this.putQueryParameter("PlanNameEn", planNameEn);
            this.planNameEn = planNameEn;
            return this;
        }

        /**
         * <p>The plan type. Valid values:</p>
         * <ul>
         * <li>normal: fixed edition plan</li>
         * <li>enterprise: enterprise edition plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder planType(String planType) {
            this.putQueryParameter("PlanType", planType);
            this.planType = planType;
            return this;
        }

        /**
         * <p>Queries plan instances whose remaining validity period is within the specified number of days. The value must be a positive integer. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder remainingExpireDays(Integer remainingExpireDays) {
            this.putQueryParameter("RemainingExpireDays", remainingExpireDays);
            this.remainingExpireDays = remainingExpireDays;
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
         * <p>The sort field. By default, results are sorted by purchase time. Valid values:</p>
         * <ul>
         * <li><strong>CreateTime</strong>: Purchase time.</li>
         * <li><strong>ExpireTime</strong>: Expiration time.</li>
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
         * <p>The sort order. Default value: desc. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: Ascending order.</li>
         * <li><strong>desc</strong>: Descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: Normal service status.</li>
         * <li><strong>offline</strong>: Expired but not overdue, in an inactive state.</li>
         * <li><strong>disable</strong>: Released.</li>
         * <li><strong>overdue</strong>: Overdue payment.</li>
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
         * <p>The plan subscription type. Valid values:</p>
         * <ul>
         * <li>Free Edition (Chinese mainland): entranceplan</li>
         * <li>Free Edition (International): entranceplan_intl</li>
         * <li>Basic Edition: basicplan</li>
         * <li>Standard Edition: standardplan</li>
         * <li>Premium Edition: advancedplan</li>
         * <li>Enterprise Edition: enterpriseplan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basicplan</p>
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        @Override
        public ListUserRatePlanInstancesRequest build() {
            return new ListUserRatePlanInstancesRequest(this);
        } 

    } 

}
