// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConfigurationRecorderRequest} extends {@link RequestModel}
 *
 * <p>StartConfigurationRecorderRequest</p>
 */
public class StartConfigurationRecorderRequest extends Request {
    private StartConfigurationRecorderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConfigurationRecorderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<StartConfigurationRecorderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(StartConfigurationRecorderRequest request) {
            super(request);
        } 

        @Override
        public StartConfigurationRecorderRequest build() {
            return new StartConfigurationRecorderRequest(this);
        } 

    } 

}
