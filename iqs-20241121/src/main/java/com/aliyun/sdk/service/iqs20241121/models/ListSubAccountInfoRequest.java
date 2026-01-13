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
 * {@link ListSubAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>ListSubAccountInfoRequest</p>
 */
public class ListSubAccountInfoRequest extends Request {
    private ListSubAccountInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubAccountInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSubAccountInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSubAccountInfoRequest request) {
            super(request);
        } 

        @Override
        public ListSubAccountInfoRequest build() {
            return new ListSubAccountInfoRequest(this);
        } 

    } 

}
