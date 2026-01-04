// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListAddonsRequest} extends {@link RequestModel}
 *
 * <p>ListAddonsRequest</p>
 */
public class ListAddonsRequest extends Request {
    private ListAddonsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAddonsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAddonsRequest request) {
            super(request);
        } 

        @Override
        public ListAddonsRequest build() {
            return new ListAddonsRequest(this);
        } 

    } 

}
