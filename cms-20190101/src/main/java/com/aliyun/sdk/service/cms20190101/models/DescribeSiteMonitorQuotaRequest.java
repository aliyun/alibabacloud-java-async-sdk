// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorQuotaRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorQuotaRequest</p>
 */
public class DescribeSiteMonitorQuotaRequest extends Request {
    private DescribeSiteMonitorQuotaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorQuotaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorQuotaRequest request) {
            super(request);
        } 

        @Override
        public DescribeSiteMonitorQuotaRequest build() {
            return new DescribeSiteMonitorQuotaRequest(this);
        } 

    } 

}
