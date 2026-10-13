// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link LogoutDeveloperRequest} extends {@link RequestModel}
 *
 * <p>LogoutDeveloperRequest</p>
 */
public class LogoutDeveloperRequest extends Request {
    private LogoutDeveloperRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogoutDeveloperRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<LogoutDeveloperRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(LogoutDeveloperRequest request) {
            super(request);
        } 

        @Override
        public LogoutDeveloperRequest build() {
            return new LogoutDeveloperRequest(this);
        } 

    } 

}
