// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GatewayBlackWhiteListRequest} extends {@link RequestModel}
 *
 * <p>GatewayBlackWhiteListRequest</p>
 */
public class GatewayBlackWhiteListRequest extends Request {
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

    private GatewayBlackWhiteListRequest(Builder builder) {
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

    public static GatewayBlackWhiteListRequest create() {
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

    public static final class Builder extends Request.Builder<GatewayBlackWhiteListRequest, Builder> {
        private String acceptLanguage; 
        private Boolean descSort; 
        private FilterParams filterParams; 
        private String orderItem; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GatewayBlackWhiteListRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.descSort = request.descSort;
            this.filterParams = request.filterParams;
            this.orderItem = request.orderItem;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
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
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder descSort(Boolean descSort) {
            this.putQueryParameter("DescSort", descSort);
            this.descSort = descSort;
            return this;
        }

        /**
         * <p>The filter parameters.</p>
         */
        public Builder filterParams(FilterParams filterParams) {
            String filterParamsShrink = shrink(filterParams, "FilterParams", "json");
            this.putQueryParameter("FilterParams", filterParamsShrink);
            this.filterParams = filterParams;
            return this;
        }

        /**
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder orderItem(String orderItem) {
            this.putQueryParameter("OrderItem", orderItem);
            this.orderItem = orderItem;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GatewayBlackWhiteListRequest build() {
            return new GatewayBlackWhiteListRequest(this);
        } 

    } 

    /**
     * 
     * {@link GatewayBlackWhiteListRequest} extends {@link TeaModel}
     *
     * <p>GatewayBlackWhiteListRequest</p>
     */
    public static class FilterParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("IsWhite")
        private Boolean isWhite;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SearchContent")
        private String searchContent;

        @com.aliyun.core.annotation.NameInMap("SearchType")
        private String searchType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FilterParams(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.isWhite = builder.isWhite;
            this.resourceType = builder.resourceType;
            this.searchContent = builder.searchContent;
            this.searchType = builder.searchType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterParams create() {
            return builder().build();
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
         * @return isWhite
         */
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return searchContent
         */
        public String getSearchContent() {
            return this.searchContent;
        }

        /**
         * @return searchType
         */
        public String getSearchType() {
            return this.searchType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Boolean isWhite; 
            private String resourceType; 
            private String searchContent; 
            private String searchType; 
            private String type; 

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway. If this parameter is used together with the GatewayId parameter, the value of the GatewayId parameter is used.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-5017305290e14centbrveca****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>This parameter is unavailable for public use.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
                return this;
            }

            /**
             * <p>This parameter is unavailable for public use.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The content that you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder searchContent(String searchContent) {
                this.searchContent = searchContent;
                return this;
            }

            /**
             * <p>The query type. Valid values:</p>
             * <ul>
             * <li>ROUTE: The list is queried by route. If the value of this parameter is ROUTE, set the SearchContent parameter to the route name.</li>
             * <li>DOMAIN: The list is queried by domain name. If the value of this parameter is DOMAIN, set the SearchContent parameter to the domain name.</li>
             * <li>IP: The list is queried by specified IP address. If the value of this parameter is IP, set the SearchContent parameter to the IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IP</p>
             */
            public Builder searchType(String searchType) {
                this.searchType = searchType;
                return this;
            }

            /**
             * <p>This parameter is unavailable for public use.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FilterParams build() {
                return new FilterParams(this);
            } 

        } 

    }
}
