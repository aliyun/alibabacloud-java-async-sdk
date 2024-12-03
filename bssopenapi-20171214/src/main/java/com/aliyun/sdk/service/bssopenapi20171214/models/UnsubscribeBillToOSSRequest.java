// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnsubscribeBillToOSSRequest} extends {@link RequestModel}
 *
 * <p>UnsubscribeBillToOSSRequest</p>
 */
public class UnsubscribeBillToOSSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultAccountRelSubscribe")
    private String multAccountRelSubscribe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribeType;

    private UnsubscribeBillToOSSRequest(Builder builder) {
        super(builder);
        this.multAccountRelSubscribe = builder.multAccountRelSubscribe;
        this.subscribeType = builder.subscribeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsubscribeBillToOSSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multAccountRelSubscribe
     */
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    /**
     * @return subscribeType
     */
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public static final class Builder extends Request.Builder<UnsubscribeBillToOSSRequest, Builder> {
        private String multAccountRelSubscribe; 
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(UnsubscribeBillToOSSRequest request) {
            super(request);
            this.multAccountRelSubscribe = request.multAccountRelSubscribe;
            this.subscribeType = request.subscribeType;
        } 

        /**
         * <p>The type of accounts whose bills are to be pushed if multi-tier accounts are involved. Valid values:</p>
         * <ul>
         * <li>MA: management account.</li>
         * <li>ACP1: member account of a virtual network operator (VNO).</li>
         * </ul>
         * <p>Default value: MA.</p>
         * 
         * <strong>example:</strong>
         * <p>MA</p>
         */
        public Builder multAccountRelSubscribe(String multAccountRelSubscribe) {
            this.putQueryParameter("MultAccountRelSubscribe", multAccountRelSubscribe);
            this.multAccountRelSubscribe = multAccountRelSubscribe;
            return this;
        }

        /**
         * <p>The type of the bill to which you want to subscribe. Valid values:</p>
         * <ul>
         * <li>BillingItemDetailForBillingPeriod: bills of billable items</li>
         * <li>InstanceDetailForBillingPeriod: bills of instances</li>
         * <li>BillingItemDetailMonthly: billable item-based bills summarized by billing cycle</li>
         * <li>InstanceDetailMonthly: instance-based bills summarized by billing cycle</li>
         * <li>SplitItemDetailDaily: split bills summarized by day</li>
         * <li>MonthBill: monthly bills in the PDF format You can subscribe to the monthly PDF bills only of the master account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BillingItemDetailForBillingPeriod</p>
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        @Override
        public UnsubscribeBillToOSSRequest build() {
            return new UnsubscribeBillToOSSRequest(this);
        } 

    } 

}
