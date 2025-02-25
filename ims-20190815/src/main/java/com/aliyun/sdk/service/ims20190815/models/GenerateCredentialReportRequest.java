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
 * {@link GenerateCredentialReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateCredentialReportRequest</p>
 */
public class GenerateCredentialReportRequest extends Request {
    private GenerateCredentialReportRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCredentialReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GenerateCredentialReportRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GenerateCredentialReportRequest request) {
            super(request);
        } 

        @Override
        public GenerateCredentialReportRequest build() {
            return new GenerateCredentialReportRequest(this);
        } 

    } 

}
