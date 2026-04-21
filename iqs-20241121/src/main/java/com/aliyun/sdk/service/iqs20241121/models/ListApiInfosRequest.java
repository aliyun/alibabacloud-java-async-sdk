// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ListApiInfosRequest} extends {@link RequestModel}
 *
 * <p>ListApiInfosRequest</p>
 */
public class ListApiInfosRequest extends Request {
    private ListApiInfosRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListApiInfosRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListApiInfosRequest request) {
            super(request);
        } 

        @Override
        public ListApiInfosRequest build() {
            return new ListApiInfosRequest(this);
        } 

    } 

}
