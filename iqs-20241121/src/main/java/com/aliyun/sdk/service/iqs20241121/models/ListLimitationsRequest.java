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
 * {@link ListLimitationsRequest} extends {@link RequestModel}
 *
 * <p>ListLimitationsRequest</p>
 */
public class ListLimitationsRequest extends Request {
    private ListLimitationsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLimitationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListLimitationsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListLimitationsRequest request) {
            super(request);
        } 

        @Override
        public ListLimitationsRequest build() {
            return new ListLimitationsRequest(this);
        } 

    } 

}
