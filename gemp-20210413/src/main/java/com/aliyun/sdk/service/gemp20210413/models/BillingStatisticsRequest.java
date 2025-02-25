// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BillingStatisticsRequest} extends {@link RequestModel}
 *
 * <p>BillingStatisticsRequest</p>
 */
public class BillingStatisticsRequest extends Request {
    private BillingStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<BillingStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(BillingStatisticsRequest request) {
            super(request);
        } 

        @Override
        public BillingStatisticsRequest build() {
            return new BillingStatisticsRequest(this);
        } 

    } 

}
