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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemainingExpireDays")
    private Integer remainingExpireDays;

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
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remainingExpireDays = builder.remainingExpireDays;
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
     * @return remainingExpireDays
     */
    public Integer getRemainingExpireDays() {
        return this.remainingExpireDays;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer remainingExpireDays; 
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
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remainingExpireDays = request.remainingExpireDays;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.status = request.status;
            this.subscribeType = request.subscribeType;
        } 

        /**
         * <p>Specifies whether to query only the plans that have remaining quota for associating websites. Valid values:</p>
         * <ul>
         * <li>true: queries only the plans that have remaining quota for associating websites.</li>
         * <li>false: queries all plans in your account.</li>
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
         * <p>The plan ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page.</p>
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
         * RemainingExpireDays.
         */
        public Builder remainingExpireDays(Integer remainingExpireDays) {
            this.putQueryParameter("RemainingExpireDays", remainingExpireDays);
            this.remainingExpireDays = remainingExpireDays;
            return this;
        }

        /**
         * <p>The sorting field. By default, the queried plans are sorted by purchase time. Valid values:</p>
         * <ul>
         * <li>CreateTime: the time when the plans were purchased.</li>
         * <li>ExpireTime: the time when the plans expire.</li>
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
         * <p>The order in which you want to sort the query results. Default value: desc. Valid values:</p>
         * <ul>
         * <li>asc: in ascending order.</li>
         * <li>desc: in descending order.</li>
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
         * <p>The plan status. Valid values:</p>
         * <ul>
         * <li>online: The plan is in service.</li>
         * <li>offline: The plan has expired within an allowable period. In this state, the plan is unavailable.</li>
         * <li>disable: The plan is released.</li>
         * <li>overdue: The plan is stopped due to overdue payments.</li>
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
         * SubscribeType.
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
