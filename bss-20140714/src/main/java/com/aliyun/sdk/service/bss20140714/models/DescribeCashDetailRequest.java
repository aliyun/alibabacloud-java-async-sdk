// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714.models;

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
 * {@link DescribeCashDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCashDetailRequest</p>
 */
public class DescribeCashDetailRequest extends Request {
    private DescribeCashDetailRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCashDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCashDetailRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCashDetailRequest request) {
            super(request);
        } 

        @Override
        public DescribeCashDetailRequest build() {
            return new DescribeCashDetailRequest(this);
        } 

    } 

}
