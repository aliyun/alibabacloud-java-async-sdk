// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link GetIntlDomainDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetIntlDomainDownloadUrlRequest</p>
 */
public class GetIntlDomainDownloadUrlRequest extends Request {
    private GetIntlDomainDownloadUrlRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntlDomainDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetIntlDomainDownloadUrlRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetIntlDomainDownloadUrlRequest request) {
            super(request);
        } 

        @Override
        public GetIntlDomainDownloadUrlRequest build() {
            return new GetIntlDomainDownloadUrlRequest(this);
        } 

    } 

}
