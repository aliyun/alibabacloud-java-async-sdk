// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link DescribeSupportedRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupportedRegionsRequest</p>
 */
public class DescribeSupportedRegionsRequest extends Request {
    private DescribeSupportedRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportedRegionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSupportedRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSupportedRegionsRequest request) {
            super(request);
        } 

        @Override
        public DescribeSupportedRegionsRequest build() {
            return new DescribeSupportedRegionsRequest(this);
        } 

    } 

}
