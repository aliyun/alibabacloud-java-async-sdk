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
 * {@link ListApiNamesRequest} extends {@link RequestModel}
 *
 * <p>ListApiNamesRequest</p>
 */
public class ListApiNamesRequest extends Request {
    private ListApiNamesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiNamesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListApiNamesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListApiNamesRequest request) {
            super(request);
        } 

        @Override
        public ListApiNamesRequest build() {
            return new ListApiNamesRequest(this);
        } 

    } 

}
