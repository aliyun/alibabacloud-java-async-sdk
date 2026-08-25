// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListPredefinedModelProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListPredefinedModelProvidersRequest</p>
 */
public class ListPredefinedModelProvidersRequest extends Request {
    private ListPredefinedModelProvidersRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPredefinedModelProvidersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListPredefinedModelProvidersRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListPredefinedModelProvidersRequest request) {
            super(request);
        } 

        @Override
        public ListPredefinedModelProvidersRequest build() {
            return new ListPredefinedModelProvidersRequest(this);
        } 

    } 

}
