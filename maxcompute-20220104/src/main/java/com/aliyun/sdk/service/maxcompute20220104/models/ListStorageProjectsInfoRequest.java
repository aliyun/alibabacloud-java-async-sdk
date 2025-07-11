// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListStorageProjectsInfoRequest} extends {@link RequestModel}
 *
 * <p>ListStorageProjectsInfoRequest</p>
 */
public class ListStorageProjectsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ascOrder")
    private Boolean ascOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectPrefix")
    private String projectPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("recentDays")
    private Integer recentDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListStorageProjectsInfoRequest(Builder builder) {
        super(builder);
        this.ascOrder = builder.ascOrder;
        this.date = builder.date;
        this.orderColumn = builder.orderColumn;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectPrefix = builder.projectPrefix;
        this.recentDays = builder.recentDays;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStorageProjectsInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ascOrder
     */
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectPrefix
     */
    public String getProjectPrefix() {
        return this.projectPrefix;
    }

    /**
     * @return recentDays
     */
    public Integer getRecentDays() {
        return this.recentDays;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListStorageProjectsInfoRequest, Builder> {
        private Boolean ascOrder; 
        private String date; 
        private String orderColumn; 
        private Long pageNumber; 
        private Long pageSize; 
        private String projectPrefix; 
        private Integer recentDays; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListStorageProjectsInfoRequest request) {
            super(request);
            this.ascOrder = request.ascOrder;
            this.date = request.date;
            this.orderColumn = request.orderColumn;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectPrefix = request.projectPrefix;
            this.recentDays = request.recentDays;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * ascOrder.
         */
        public Builder ascOrder(Boolean ascOrder) {
            this.putQueryParameter("ascOrder", ascOrder);
            this.ascOrder = ascOrder;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * orderColumn.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("orderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * projectPrefix.
         */
        public Builder projectPrefix(String projectPrefix) {
            this.putQueryParameter("projectPrefix", projectPrefix);
            this.projectPrefix = projectPrefix;
            return this;
        }

        /**
         * recentDays.
         */
        public Builder recentDays(Integer recentDays) {
            this.putQueryParameter("recentDays", recentDays);
            this.recentDays = recentDays;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListStorageProjectsInfoRequest build() {
            return new ListStorageProjectsInfoRequest(this);
        } 

    } 

}
