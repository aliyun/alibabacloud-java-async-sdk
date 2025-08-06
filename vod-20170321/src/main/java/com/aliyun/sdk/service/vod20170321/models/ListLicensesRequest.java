// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListLicensesRequest} extends {@link RequestModel}
 *
 * <p>ListLicensesRequest</p>
 */
public class ListLicensesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private Integer appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Orders")
    private java.util.List<Orders> orders;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PkgName")
    private String pkgName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformType")
    private Long platformType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private ListLicensesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.businessType = builder.businessType;
        this.needTotalCount = builder.needTotalCount;
        this.offset = builder.offset;
        this.orders = builder.orders;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.pkgName = builder.pkgName;
        this.platformType = builder.platformType;
        this.product = builder.product;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLicensesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return orders
     */
    public java.util.List<Orders> getOrders() {
        return this.orders;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pkgName
     */
    public String getPkgName() {
        return this.pkgName;
    }

    /**
     * @return platformType
     */
    public Long getPlatformType() {
        return this.platformType;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListLicensesRequest, Builder> {
        private String appId; 
        private String appName; 
        private Integer appType; 
        private String businessType; 
        private Boolean needTotalCount; 
        private Long offset; 
        private java.util.List<Orders> orders; 
        private Long pageNo; 
        private Long pageSize; 
        private String pkgName; 
        private Long platformType; 
        private String product; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(ListLicensesRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.appType = request.appType;
            this.businessType = request.businessType;
            this.needTotalCount = request.needTotalCount;
            this.offset = request.offset;
            this.orders = request.orders;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.pkgName = request.pkgName;
            this.platformType = request.platformType;
            this.product = request.product;
            this.userId = request.userId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Integer appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * NeedTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putBodyParameter("NeedTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Orders.
         */
        public Builder orders(java.util.List<Orders> orders) {
            this.putBodyParameter("Orders", orders);
            this.orders = orders;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PkgName.
         */
        public Builder pkgName(String pkgName) {
            this.putBodyParameter("PkgName", pkgName);
            this.pkgName = pkgName;
            return this;
        }

        /**
         * PlatformType.
         */
        public Builder platformType(Long platformType) {
            this.putBodyParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListLicensesRequest build() {
            return new ListLicensesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListLicensesRequest} extends {@link TeaModel}
     *
     * <p>ListLicensesRequest</p>
     */
    public static class Orders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

        @com.aliyun.core.annotation.NameInMap("OrderDirection")
        private String orderDirection;

        private Orders(Builder builder) {
            this.orderBy = builder.orderBy;
            this.orderDirection = builder.orderDirection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orders create() {
            return builder().build();
        }

        /**
         * @return orderBy
         */
        public String getOrderBy() {
            return this.orderBy;
        }

        /**
         * @return orderDirection
         */
        public String getOrderDirection() {
            return this.orderDirection;
        }

        public static final class Builder {
            private String orderBy; 
            private String orderDirection; 

            private Builder() {
            } 

            private Builder(Orders model) {
                this.orderBy = model.orderBy;
                this.orderDirection = model.orderDirection;
            } 

            /**
             * OrderBy.
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            /**
             * OrderDirection.
             */
            public Builder orderDirection(String orderDirection) {
                this.orderDirection = orderDirection;
                return this;
            }

            public Orders build() {
                return new Orders(this);
            } 

        } 

    }
}
