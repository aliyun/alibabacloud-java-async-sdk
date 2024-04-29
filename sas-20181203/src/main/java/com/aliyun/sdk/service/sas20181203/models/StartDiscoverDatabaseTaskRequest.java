// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiscoverDatabaseTaskRequest} extends {@link RequestModel}
 *
 * <p>StartDiscoverDatabaseTaskRequest</p>
 */
public class StartDiscoverDatabaseTaskRequest extends Request {
    private StartDiscoverDatabaseTaskRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDiscoverDatabaseTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<StartDiscoverDatabaseTaskRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(StartDiscoverDatabaseTaskRequest request) {
            super(request);
        } 

        @Override
        public StartDiscoverDatabaseTaskRequest build() {
            return new StartDiscoverDatabaseTaskRequest(this);
        } 

    } 

}
