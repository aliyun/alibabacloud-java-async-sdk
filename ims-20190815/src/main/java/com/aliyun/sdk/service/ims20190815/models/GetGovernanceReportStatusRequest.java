// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetGovernanceReportStatusRequest} extends {@link RequestModel}
 *
 * <p>GetGovernanceReportStatusRequest</p>
 */
public class GetGovernanceReportStatusRequest extends Request {
    private GetGovernanceReportStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceReportStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetGovernanceReportStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetGovernanceReportStatusRequest request) {
            super(request);
        } 

        @Override
        public GetGovernanceReportStatusRequest build() {
            return new GetGovernanceReportStatusRequest(this);
        } 

    } 

}
