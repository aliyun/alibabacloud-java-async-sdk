// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspiciousSecurityEventyStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspiciousSecurityEventyStatisticsRequest</p>
 */
public class DescribeSuspiciousSecurityEventyStatisticsRequest extends Request {
    private DescribeSuspiciousSecurityEventyStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousSecurityEventyStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSuspiciousSecurityEventyStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspiciousSecurityEventyStatisticsRequest request) {
            super(request);
        } 

        @Override
        public DescribeSuspiciousSecurityEventyStatisticsRequest build() {
            return new DescribeSuspiciousSecurityEventyStatisticsRequest(this);
        } 

    } 

}
