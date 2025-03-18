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
 * {@link ListProductAbilitiesRequest} extends {@link RequestModel}
 *
 * <p>ListProductAbilitiesRequest</p>
 */
public class ListProductAbilitiesRequest extends Request {
    private ListProductAbilitiesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductAbilitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListProductAbilitiesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListProductAbilitiesRequest request) {
            super(request);
        } 

        @Override
        public ListProductAbilitiesRequest build() {
            return new ListProductAbilitiesRequest(this);
        } 

    } 

}
