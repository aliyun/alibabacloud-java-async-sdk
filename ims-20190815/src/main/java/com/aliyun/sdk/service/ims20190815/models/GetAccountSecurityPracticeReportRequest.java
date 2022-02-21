// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSecurityPracticeReportRequest} extends {@link RequestModel}
 *
 * <p>GetAccountSecurityPracticeReportRequest</p>
 */
public class GetAccountSecurityPracticeReportRequest extends Request {
    private GetAccountSecurityPracticeReportRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSecurityPracticeReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAccountSecurityPracticeReportRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAccountSecurityPracticeReportRequest response) {
            super(response);
        } 

        @Override
        public GetAccountSecurityPracticeReportRequest build() {
            return new GetAccountSecurityPracticeReportRequest(this);
        } 

    } 

}
