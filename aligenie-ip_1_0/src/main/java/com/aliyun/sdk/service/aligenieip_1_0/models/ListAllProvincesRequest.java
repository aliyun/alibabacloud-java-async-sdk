// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListAllProvincesRequest} extends {@link RequestModel}
 *
 * <p>ListAllProvincesRequest</p>
 */
public class ListAllProvincesRequest extends Request {
    private ListAllProvincesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllProvincesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAllProvincesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAllProvincesRequest request) {
            super(request);
        } 

        @Override
        public ListAllProvincesRequest build() {
            return new ListAllProvincesRequest(this);
        } 

    } 

}
