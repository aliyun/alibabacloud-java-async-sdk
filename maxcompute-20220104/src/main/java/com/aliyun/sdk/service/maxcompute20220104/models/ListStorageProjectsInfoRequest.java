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
         * <p>Specifies whether to sort the results in ascending order.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ascOrder(Boolean ascOrder) {
            this.putQueryParameter("ascOrder", ascOrder);
            this.ascOrder = ascOrder;
            return this;
        }

        /**
         * <p>The statistics collection date. The date is accurate to the day. The date must be in the <code>YYYYMMdd</code> format.</p>
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
         * <p>The column to sort by. Valid values:</p>
         * <ul>
         * <li><p>totalStorage</p>
         * </li>
         * <li><p>longTermStorage</p>
         * </li>
         * <li><p>lowFreqStorage</p>
         * </li>
         * <li><p>standardStorage</p>
         * </li>
         * <li><p>recycleBinStorage</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>totalStorage</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("orderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The prefix of the MaxCompute project name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder projectPrefix(String projectPrefix) {
            this.putQueryParameter("projectPrefix", projectPrefix);
            this.projectPrefix = projectPrefix;
            return this;
        }

        /**
         * <p>The number of days for year-over-year comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recentDays(Integer recentDays) {
            this.putQueryParameter("recentDays", recentDays);
            this.recentDays = recentDays;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The tenant ID. You can log on to the MaxCompute console and choose <strong>Tenant Property</strong> in the navigation pane on the left to view the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28074710977****</p>
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
