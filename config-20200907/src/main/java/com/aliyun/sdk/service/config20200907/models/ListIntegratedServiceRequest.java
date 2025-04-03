// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListIntegratedServiceRequest} extends {@link RequestModel}
 *
 * <p>ListIntegratedServiceRequest</p>
 */
public class ListIntegratedServiceRequest extends Request {
    private ListIntegratedServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegratedServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListIntegratedServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListIntegratedServiceRequest request) {
            super(request);
        } 

        @Override
        public ListIntegratedServiceRequest build() {
            return new ListIntegratedServiceRequest(this);
        } 

    } 

}
