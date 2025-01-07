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
 * {@link GetFileUploadLimitRequest} extends {@link RequestModel}
 *
 * <p>GetFileUploadLimitRequest</p>
 */
public class GetFileUploadLimitRequest extends Request {
    private GetFileUploadLimitRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileUploadLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetFileUploadLimitRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetFileUploadLimitRequest request) {
            super(request);
        } 

        @Override
        public GetFileUploadLimitRequest build() {
            return new GetFileUploadLimitRequest(this);
        } 

    } 

}
