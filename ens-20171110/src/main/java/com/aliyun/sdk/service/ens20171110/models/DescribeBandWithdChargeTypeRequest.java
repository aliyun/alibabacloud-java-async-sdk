// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeBandWithdChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeBandWithdChargeTypeRequest</p>
 */
public class DescribeBandWithdChargeTypeRequest extends Request {
    private DescribeBandWithdChargeTypeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandWithdChargeTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeBandWithdChargeTypeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeBandWithdChargeTypeRequest request) {
            super(request);
        } 

        @Override
        public DescribeBandWithdChargeTypeRequest build() {
            return new DescribeBandWithdChargeTypeRequest(this);
        } 

    } 

}
