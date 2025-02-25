// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListGatewayRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayRequest</p>
 */
public class ListGatewayRequest extends Request {
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

    private ListGatewayRequest(Builder builder) {
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

    public static ListGatewayRequest create() {
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

    public static final class Builder extends Request.Builder<ListGatewayRequest, Builder> {
        private String acceptLanguage; 
        private Boolean descSort; 
        private FilterParams filterParams; 
        private String orderItem; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayRequest request) {
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
         * <p>Specifies whether to enable the sorting feature. This feature is not available.</p>
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
         * <p>The details of parameters.</p>
         */
        public Builder filterParams(FilterParams filterParams) {
            String filterParamsShrink = shrink(filterParams, "FilterParams", "json");
            this.putQueryParameter("FilterParams", filterParamsShrink);
            this.filterParams = filterParams;
            return this;
        }

        /**
         * <p>The order information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
        public ListGatewayRequest build() {
            return new ListGatewayRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayRequest} extends {@link TeaModel}
     *
     * <p>ListGatewayRequest</p>
     */
    public static class FilterParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayType")
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MseTag")
        private String mseTag;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Vpc")
        private String vpc;

        private FilterParams(Builder builder) {
            this.gatewayType = builder.gatewayType;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.instanceId = builder.instanceId;
            this.mseTag = builder.mseTag;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterParams create() {
            return builder().build();
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mseTag
         */
        public String getMseTag() {
            return this.mseTag;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return vpc
         */
        public String getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private String gatewayType; 
            private String gatewayUniqueId; 
            private String instanceId; 
            private String mseTag; 
            private String name; 
            private String resourceGroupId; 
            private String vpc; 

            /**
             * <p>The type of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>Ingress</p>
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-5017305290e14centbrveca****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_ingresspre-cn-****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The tag of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key&quot;:&quot;tagkey&quot;,&quot;value&quot;:&quot;tagvalue&quot;}]</p>
             */
            public Builder mseTag(String mseTag) {
                this.mseTag = mseTag;
                return this;
            }

            /**
             * <p>The name of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>rutain-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-7y2uye*****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp13hhyjntbab7w****</p>
             */
            public Builder vpc(String vpc) {
                this.vpc = vpc;
                return this;
            }

            public FilterParams build() {
                return new FilterParams(this);
            } 

        } 

    }
}
