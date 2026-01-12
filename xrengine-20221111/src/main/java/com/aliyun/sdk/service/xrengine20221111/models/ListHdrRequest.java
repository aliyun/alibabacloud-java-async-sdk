// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link ListHdrRequest} extends {@link RequestModel}
 *
 * <p>ListHdrRequest</p>
 */
public class ListHdrRequest extends Request {
    private ListHdrRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHdrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListHdrRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListHdrRequest request) {
            super(request);
        } 

        @Override
        public ListHdrRequest build() {
            return new ListHdrRequest(this);
        } 

    } 

}
