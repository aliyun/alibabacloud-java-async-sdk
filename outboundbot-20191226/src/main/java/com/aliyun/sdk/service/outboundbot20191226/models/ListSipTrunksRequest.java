// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListSipTrunksRequest} extends {@link RequestModel}
 *
 * <p>ListSipTrunksRequest</p>
 */
public class ListSipTrunksRequest extends Request {
    private ListSipTrunksRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSipTrunksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSipTrunksRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSipTrunksRequest request) {
            super(request);
        } 

        @Override
        public ListSipTrunksRequest build() {
            return new ListSipTrunksRequest(this);
        } 

    } 

}
