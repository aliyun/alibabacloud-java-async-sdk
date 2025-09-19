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
 * {@link StartIdcProbeScanRequest} extends {@link RequestModel}
 *
 * <p>StartIdcProbeScanRequest</p>
 */
public class StartIdcProbeScanRequest extends Request {
    private StartIdcProbeScanRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartIdcProbeScanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<StartIdcProbeScanRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(StartIdcProbeScanRequest request) {
            super(request);
        } 

        @Override
        public StartIdcProbeScanRequest build() {
            return new StartIdcProbeScanRequest(this);
        } 

    } 

}
