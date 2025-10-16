// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeClearAuthInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeClearAuthInfoRequest</p>
 */
public class DescribeClearAuthInfoRequest extends Request {
    private DescribeClearAuthInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClearAuthInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeClearAuthInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeClearAuthInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeClearAuthInfoRequest build() {
            return new DescribeClearAuthInfoRequest(this);
        } 

    } 

}
