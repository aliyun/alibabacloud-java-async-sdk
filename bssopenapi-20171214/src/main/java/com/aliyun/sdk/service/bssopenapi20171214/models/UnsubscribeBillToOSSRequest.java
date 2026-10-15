// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
         * <p>For multi-level accounts, specifies the type of bill to push. Valid values:</p>
         * <ul>
         * <li>MA: Pushes the bill of the main account.</li>
         * <li>ACP1: Pushes the bill of the Partner Platform V2.0 sub-account.</li>
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
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>BillingItemDetailForBillingPeriod: billable item-level consumption details.</li>
         * <li>InstanceDetailForBillingPeriod: instance-level consumption details.</li>
         * <li>BillingItemDetailMonthly: billable item-level consumption summary by billing cycle.</li>
         * <li>InstanceDetailMonthly: instance-level consumption summary by billing cycle.</li>
         * <li>SplitItemDetailDaily: split bill summarized by day.</li>
         * <li>MonthBill: monthly bill in PDF format. Only MA subscriptions are supported.</li>
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
