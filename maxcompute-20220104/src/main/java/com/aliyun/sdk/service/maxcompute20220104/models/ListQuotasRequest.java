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
    @com.aliyun.core.annotation.NameInMap("saleTags")
    private String saleTags;

    private ListQuotasRequest(Builder builder) {
        super(builder);
        this.billingType = builder.billingType;
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.saleTags = builder.saleTags;
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
     * @return saleTags
     */
    public String getSaleTags() {
        return this.saleTags;
    }

    public static final class Builder extends Request.Builder<ListQuotasRequest, Builder> {
        private String billingType; 
        private String marker; 
        private Long maxItem; 
        private String saleTags; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasRequest request) {
            super(request);
            this.billingType = request.billingType;
            this.marker = request.marker;
            this.maxItem = request.maxItem;
            this.saleTags = request.saleTags;
        } 

        /**
         * <p>The billing method of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        public Builder billingType(String billingType) {
            this.putQueryParameter("billingType", billingType);
            this.billingType = billingType;
            return this;
        }

        /**
         * <p>Specifies the marker after which the returned list begins.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxItem(Long maxItem) {
            this.putQueryParameter("maxItem", maxItem);
            this.maxItem = maxItem;
            return this;
        }

        /**
         * <p>The cost tag. You can filter out quota objects based on the cost tag. The cost tag is created when you tag a service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag&quot;:&quot;this_is_tag_demo&quot;}</p>
         */
        public Builder saleTags(String saleTags) {
            this.putQueryParameter("saleTags", saleTags);
            this.saleTags = saleTags;
            return this;
        }

        @Override
        public ListQuotasRequest build() {
            return new ListQuotasRequest(this);
        } 

    } 

}
