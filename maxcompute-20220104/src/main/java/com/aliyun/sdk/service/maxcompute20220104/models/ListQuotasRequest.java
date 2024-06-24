// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListQuotasRequest</p>
 */
public class ListQuotasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("billingType")
    private String billingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxItem")
    private Long maxItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("saleTags")
    private String saleTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListQuotasRequest(Builder builder) {
        super(builder);
        this.billingType = builder.billingType;
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.productId = builder.productId;
        this.region = builder.region;
        this.saleTags = builder.saleTags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItem
     */
    public Long getMaxItem() {
        return this.maxItem;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return saleTags
     */
    public String getSaleTags() {
        return this.saleTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListQuotasRequest, Builder> {
        private String billingType; 
        private String marker; 
        private Long maxItem; 
        private String productId; 
        private String region; 
        private String saleTags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasRequest request) {
            super(request);
            this.billingType = request.billingType;
            this.marker = request.marker;
            this.maxItem = request.maxItem;
            this.productId = request.productId;
            this.region = request.region;
            this.saleTags = request.saleTags;
            this.tenantId = request.tenantId;
        } 

        /**
         * The billing method of the quota.
         */
        public Builder billingType(String billingType) {
            this.putQueryParameter("billingType", billingType);
            this.billingType = billingType;
            return this;
        }

        /**
         * Specifies the marker after which the returned list begins.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         */
        public Builder maxItem(Long maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * The service ID.
         */
        public Builder productId(String productId) {
            this.putQueryParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * The cost tag. You can filter out quota objects based on the cost tag. The cost tag is created when you tag a service.
         */
        public Builder saleTags(String saleTags) {
            this.putQueryParameter("saleTags", saleTags);
            this.saleTags = saleTags;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListQuotasRequest build() {
            return new ListQuotasRequest(this);
        } 

    } 

}
