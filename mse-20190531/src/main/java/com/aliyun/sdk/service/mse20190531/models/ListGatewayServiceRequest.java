// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayServiceRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayServiceRequest</p>
 */
public class ListGatewayServiceRequest extends Request {
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

    private ListGatewayServiceRequest(Builder builder) {
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

    public static ListGatewayServiceRequest create() {
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

    public static final class Builder extends Request.Builder<ListGatewayServiceRequest, Builder> {
        private String acceptLanguage; 
        private Boolean descSort; 
        private FilterParams filterParams; 
        private String orderItem; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayServiceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.descSort = request.descSort;
            this.filterParams = request.filterParams;
            this.orderItem = request.orderItem;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to enable sorting.
         */
        public Builder descSort(Boolean descSort) {
            this.putQueryParameter("DescSort", descSort);
            this.descSort = descSort;
            return this;
        }

        /**
         * The parameters that are used to specify filter conditions. The values of the parameters are in the format of {"key1":"value1"}.
         */
        public Builder filterParams(FilterParams filterParams) {
            String filterParamsShrink = shrink(filterParams, "FilterParams", "json");
            this.putQueryParameter("FilterParams", filterParamsShrink);
            this.filterParams = filterParams;
            return this;
        }

        /**
         * The item based on which entries are sorted.
         */
        public Builder orderItem(String orderItem) {
            this.putQueryParameter("OrderItem", orderItem);
            this.orderItem = orderItem;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListGatewayServiceRequest build() {
            return new ListGatewayServiceRequest(this);
        } 

    } 

    public static class FilterParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private FilterParams(Builder builder) {
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.serviceProtocol = builder.serviceProtocol;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterParams create() {
            return builder().build();
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String gatewayUniqueId; 
            private String groupName; 
            private String name; 
            private String namespace; 
            private String serviceProtocol; 
            private String sourceType; 

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace to which the service belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The protocol of the service.
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             * *   HTTP2
             * *   GRPC
             * *   DUBBO
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * The type of the source.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public FilterParams build() {
                return new FilterParams(this);
            } 

        } 

    }
}
