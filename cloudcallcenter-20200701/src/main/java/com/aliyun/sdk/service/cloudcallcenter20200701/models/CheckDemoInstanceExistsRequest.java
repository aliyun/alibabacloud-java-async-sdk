// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDemoInstanceExistsRequest} extends {@link RequestModel}
 *
 * <p>CheckDemoInstanceExistsRequest</p>
 */
public class CheckDemoInstanceExistsRequest extends Request {
    private CheckDemoInstanceExistsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDemoInstanceExistsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckDemoInstanceExistsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckDemoInstanceExistsRequest request) {
            super(request);
        } 

        @Override
        public CheckDemoInstanceExistsRequest build() {
            return new CheckDemoInstanceExistsRequest(this);
        } 

    } 

}
