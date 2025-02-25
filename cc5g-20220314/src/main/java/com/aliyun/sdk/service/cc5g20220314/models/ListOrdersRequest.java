// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListOrdersRequest</p>
 */
public class ListOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderAction")
    private String orderAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private java.util.List < String > orderIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < String > statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private ListOrdersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderAction = builder.orderAction;
        this.orderIds = builder.orderIds;
        this.statuses = builder.statuses;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderAction
     */
    public String getOrderAction() {
        return this.orderAction;
    }

    /**
     * @return orderIds
     */
    public java.util.List < String > getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ListOrdersRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private String orderAction; 
        private java.util.List < String > orderIds; 
        private java.util.List < String > statuses; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ListOrdersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderAction = request.orderAction;
            this.orderIds = request.orderIds;
            this.statuses = request.statuses;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderAction.
         */
        public Builder orderAction(String orderAction) {
            this.putQueryParameter("OrderAction", orderAction);
            this.orderAction = orderAction;
            return this;
        }

        /**
         * OrderIds.
         */
        public Builder orderIds(java.util.List < String > orderIds) {
            this.putQueryParameter("OrderIds", orderIds);
            this.orderIds = orderIds;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public ListOrdersRequest build() {
            return new ListOrdersRequest(this);
        } 

    } 

}
