// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDGEnabledRequest} extends {@link RequestModel}
 *
 * <p>CheckDGEnabledRequest</p>
 */
public class CheckDGEnabledRequest extends Request {
    private CheckDGEnabledRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDGEnabledRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckDGEnabledRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckDGEnabledRequest request) {
            super(request);
        } 

        @Override
        public CheckDGEnabledRequest build() {
            return new CheckDGEnabledRequest(this);
        } 

    } 

}
