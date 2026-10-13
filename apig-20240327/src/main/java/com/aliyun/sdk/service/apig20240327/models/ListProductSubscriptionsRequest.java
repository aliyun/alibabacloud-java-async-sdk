// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListProductSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ListProductSubscriptionsRequest</p>
 */
public class ListProductSubscriptionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerName")
    private String consumerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListProductSubscriptionsRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.consumerName = builder.consumerName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductSubscriptionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return consumerName
     */
    public String getConsumerName() {
        return this.consumerName;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListProductSubscriptionsRequest, Builder> {
        private String productId; 
        private String consumerName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListProductSubscriptionsRequest request) {
            super(request);
            this.productId = request.productId;
            this.consumerName = request.consumerName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the API product. This is the primary ID of the API product resource and specifies the API product for which you want to query the subscription list. You can obtain this ID from the productId field in the response of the ListProducts operation.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The keyword of the consumer name used to search the subscription records of the API product by consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        public Builder consumerName(String consumerName) {
            this.putQueryParameter("consumerName", consumerName);
            this.consumerName = consumerName;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The subscription status used to filter subscriptions. Valid values: PENDING and APPROVED.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListProductSubscriptionsRequest build() {
            return new ListProductSubscriptionsRequest(this);
        } 

    } 

}
