// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayRouteRequest</p>
 */
public class ListGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescSort")
    private Boolean descSort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterParams")
    private FilterParams filterParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderItem")
    private String orderItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListGatewayRouteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.descSort = builder.descSort;
        this.filterParams = builder.filterParams;
        this.orderItem = builder.orderItem;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return descSort
     */
    public Boolean getDescSort() {
        return this.descSort;
    }

    /**
     * @return filterParams
     */
    public FilterParams getFilterParams() {
        return this.filterParams;
    }

    /**
     * @return orderItem
     */
    public String getOrderItem() {
        return this.orderItem;
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

    public static final class Builder extends Request.Builder<ListGatewayRouteRequest, Builder> {
        private String acceptLanguage; 
        private Boolean descSort; 
        private FilterParams filterParams; 
        private String orderItem; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayRouteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.descSort = request.descSort;
            this.filterParams = request.filterParams;
            this.orderItem = request.orderItem;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to enable sorting. This parameter is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder descSort(Boolean descSort) {
            this.putQueryParameter("DescSort", descSort);
            this.descSort = descSort;
            return this;
        }

        /**
         * <p>The parameters that specify filter conditions. The parameters are in the format of {&quot;key1&quot;:&quot;value1&quot;}.</p>
         */
        public Builder filterParams(FilterParams filterParams) {
            String filterParamsShrink = shrink(filterParams, "FilterParams", "json");
            this.putQueryParameter("FilterParams", filterParamsShrink);
            this.filterParams = filterParams;
            return this;
        }

        /**
         * <p>The item based on which entries are sorted.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreate</p>
         */
        public Builder orderItem(String orderItem) {
            this.putQueryParameter("OrderItem", orderItem);
            this.orderItem = orderItem;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListGatewayRouteRequest build() {
            return new ListGatewayRouteRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteRequest</p>
     */
    public static class FilterParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultServiceId")
        @Deprecated
        private Long defaultServiceId;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private Long domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RouteOrder")
        private Integer routeOrder;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private FilterParams(Builder builder) {
            this.defaultServiceId = builder.defaultServiceId;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.name = builder.name;
            this.path = builder.path;
            this.routeOrder = builder.routeOrder;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterParams create() {
            return builder().build();
        }

        /**
         * @return defaultServiceId
         */
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        /**
         * @return domainId
         */
        public Long getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return routeOrder
         */
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long defaultServiceId; 
            private Long domainId; 
            private String domainName; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String name; 
            private String path; 
            private Integer routeOrder; 
            private Integer status; 

            /**
             * <p>The default service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultServiceId(Long defaultServiceId) {
                this.defaultServiceId = defaultServiceId;
                return this;
            }

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>284</p>
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The associated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.alites.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-30a0106924c94bca8712ec4e79fc5acc</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The name of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder routeOrder(Integer routeOrder) {
                this.routeOrder = routeOrder;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public FilterParams build() {
                return new FilterParams(this);
            } 

        } 

    }
}
