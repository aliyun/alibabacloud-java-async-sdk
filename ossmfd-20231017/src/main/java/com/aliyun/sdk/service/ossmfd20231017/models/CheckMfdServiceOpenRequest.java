// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017.models;

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
 * {@link CheckMfdServiceOpenRequest} extends {@link RequestModel}
 *
 * <p>CheckMfdServiceOpenRequest</p>
 */
public class CheckMfdServiceOpenRequest extends Request {
    private CheckMfdServiceOpenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMfdServiceOpenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckMfdServiceOpenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckMfdServiceOpenRequest request) {
            super(request);
        } 

        @Override
        public CheckMfdServiceOpenRequest build() {
            return new CheckMfdServiceOpenRequest(this);
        } 

    } 

}
