// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDemoGraphSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListDemoGraphSchemasRequest</p>
 */
public class ListDemoGraphSchemasRequest extends Request {
    private ListDemoGraphSchemasRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDemoGraphSchemasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDemoGraphSchemasRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDemoGraphSchemasRequest request) {
            super(request);
        } 

        @Override
        public ListDemoGraphSchemasRequest build() {
            return new ListDemoGraphSchemasRequest(this);
        } 

    } 

}
