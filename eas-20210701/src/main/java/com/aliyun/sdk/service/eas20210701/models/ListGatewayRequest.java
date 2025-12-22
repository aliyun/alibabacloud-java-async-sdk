// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayName")
    private String gatewayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetEnabled")
    private Boolean internetEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private java.util.Map<String, String> label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListGatewayRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.gatewayId = builder.gatewayId;
        this.gatewayName = builder.gatewayName;
        this.gatewayType = builder.gatewayType;
        this.internetEnabled = builder.internetEnabled;
        this.label = builder.label;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceName = builder.resourceName;
        this.sort = builder.sort;
        this.status = builder.status;
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return internetEnabled
     */
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    /**
     * @return label
     */
    public java.util.Map<String, String> getLabel() {
        return this.label;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListGatewayRequest, Builder> {
        private String chargeType; 
        private String gatewayId; 
        private String gatewayName; 
        private String gatewayType; 
        private Boolean internetEnabled; 
        private java.util.Map<String, String> label; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceName; 
        private String sort; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.gatewayId = request.gatewayId;
            this.gatewayName = request.gatewayName;
            this.gatewayType = request.gatewayType;
            this.internetEnabled = request.internetEnabled;
            this.label = request.label;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceName = request.resourceName;
            this.sort = request.sort;
            this.status = request.status;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The private gateway ID. To obtain the private gateway ID, see the private_gateway_id parameter in the response parameters of the ListResources operation.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The private gateway alias.</p>
         * 
         * <strong>example:</strong>
         * <p>mygateway1</p>
         */
        public Builder gatewayName(String gatewayName) {
            this.putQueryParameter("GatewayName", gatewayName);
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * GatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("GatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * InternetEnabled.
         */
        public Builder internetEnabled(Boolean internetEnabled) {
            this.putQueryParameter("InternetEnabled", internetEnabled);
            this.internetEnabled = internetEnabled;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(java.util.Map<String, String> label) {
            String labelShrink = shrink(label, "Label", "json");
            this.putQueryParameter("Label", labelShrink);
            this.label = label;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group. To obtain a resource group ID, see the ResourceId field in the response of the <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-4gt8twzwllfo******</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListGatewayRequest build() {
            return new ListGatewayRequest(this);
        } 

    } 

}
