// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link StartQuotaUtilizationReportRequest} extends {@link RequestModel}
 *
 * <p>StartQuotaUtilizationReportRequest</p>
 */
public class StartQuotaUtilizationReportRequest extends Request {
    private StartQuotaUtilizationReportRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartQuotaUtilizationReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<StartQuotaUtilizationReportRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(StartQuotaUtilizationReportRequest request) {
            super(request);
        } 

        @Override
        public StartQuotaUtilizationReportRequest build() {
            return new StartQuotaUtilizationReportRequest(this);
        } 

    } 

}
