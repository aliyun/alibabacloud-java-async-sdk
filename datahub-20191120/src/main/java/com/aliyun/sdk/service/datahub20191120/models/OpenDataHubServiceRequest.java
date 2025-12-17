// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20191120.models;

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
 * {@link OpenDataHubServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenDataHubServiceRequest</p>
 */
public class OpenDataHubServiceRequest extends Request {
    private OpenDataHubServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenDataHubServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenDataHubServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenDataHubServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenDataHubServiceRequest build() {
            return new OpenDataHubServiceRequest(this);
        } 

    } 

}
