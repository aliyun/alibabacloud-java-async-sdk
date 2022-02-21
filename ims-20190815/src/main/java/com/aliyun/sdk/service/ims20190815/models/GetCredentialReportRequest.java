// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialReportRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialReportRequest</p>
 */
public class GetCredentialReportRequest extends Request {
    private GetCredentialReportRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCredentialReportRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCredentialReportRequest response) {
            super(response);
        } 

        @Override
        public GetCredentialReportRequest build() {
            return new GetCredentialReportRequest(this);
        } 

    } 

}
