// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrunkProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListTrunkProvidersRequest</p>
 */
public class ListTrunkProvidersRequest extends Request {
    private ListTrunkProvidersRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrunkProvidersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListTrunkProvidersRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListTrunkProvidersRequest response) {
            super(response);
        } 

        @Override
        public ListTrunkProvidersRequest build() {
            return new ListTrunkProvidersRequest(this);
        } 

    } 

}
