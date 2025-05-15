// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListServiceInstanceBillRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstanceBillRequest</p>
 */
public class ListServiceInstanceBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingDate")
    private String billingDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    private ListServiceInstanceBillRequest(Builder builder) {
        super(builder);
        this.billingCycle = builder.billingCycle;
        this.billingDate = builder.billingDate;
        this.granularity = builder.granularity;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceBillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return billingDate
     */
    public String getBillingDate() {
        return this.billingDate;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<ListServiceInstanceBillRequest, Builder> {
        private String billingCycle; 
        private String billingDate; 
        private String granularity; 
        private Integer maxResults; 
        private String nextToken; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceInstanceBillRequest request) {
            super(request);
            this.billingCycle = request.billingCycle;
            this.billingDate = request.billingDate;
            this.granularity = request.granularity;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>The billing cycle. Format: YYYY-MM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>The billing date. This parameter is required only if the <strong>Granularity</strong> parameter is set to DAILY. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01</p>
         */
        public Builder billingDate(String billingDate) {
            this.putQueryParameter("BillingDate", billingDate);
            this.billingDate = billingDate;
            return this;
        }

        /**
         * <p>The granularity at which bills are queried. Valid values:</p>
         * <ul>
         * <li>MONTHLY: queries bills by month. The data queried is consistent with the data that is displayed for the specified billing cycle on the Billing Details tab of the Bill Details page in User Center.</li>
         * <li>DAILY: queries bills by day. The data queried is consistent with the data that is displayed for the specified day on the Billing Details tab of the Bill Details page in User Center.</li>
         * </ul>
         * <p>You must set the <strong>BillingDate</strong> parameter before you can set the Granularity parameter to DAILY.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The number of entries page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAVz7BQqj2xtiNSC3d3RAD38=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-49793f3bfa034ec6a990</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public ListServiceInstanceBillRequest build() {
            return new ListServiceInstanceBillRequest(this);
        } 

    } 

}
