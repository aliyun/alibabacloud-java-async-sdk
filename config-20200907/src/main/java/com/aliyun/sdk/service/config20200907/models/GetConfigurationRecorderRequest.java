// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetConfigurationRecorderRequest} extends {@link RequestModel}
 *
 * <p>GetConfigurationRecorderRequest</p>
 */
public class GetConfigurationRecorderRequest extends Request {
    private GetConfigurationRecorderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigurationRecorderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetConfigurationRecorderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetConfigurationRecorderRequest request) {
            super(request);
        } 

        @Override
        public GetConfigurationRecorderRequest build() {
            return new GetConfigurationRecorderRequest(this);
        } 

    } 

}
