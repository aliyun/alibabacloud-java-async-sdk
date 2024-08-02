// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * DescSort.
         */
        public Builder descSort(Boolean descSort) {
            this.putQueryParameter("DescSort", descSort);
            this.descSort = descSort;
            return this;
        }

        /**
         * parse from filterParams
         */
        public Builder filterParams(FilterParams filterParams) {
            String filterParamsShrink = shrink(filterParams, "FilterParams", "json");
            this.putQueryParameter("FilterParams", filterParamsShrink);
            this.filterParams = filterParams;
            return this;
        }

        /**
         * OrderItem.
         */
        public Builder orderItem(String orderItem) {
            this.putQueryParameter("OrderItem", orderItem);
            this.orderItem = orderItem;
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

        @Override
        public GatewayBlackWhiteListRequest build() {
            return new GatewayBlackWhiteListRequest(this);
        } 

    } 

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
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * IsWhite.
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SearchContent.
             */
            public Builder searchContent(String searchContent) {
                this.searchContent = searchContent;
                return this;
            }

            /**
             * SearchType.
             */
            public Builder searchType(String searchType) {
                this.searchType = searchType;
                return this;
            }

            /**
             * Type.
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
