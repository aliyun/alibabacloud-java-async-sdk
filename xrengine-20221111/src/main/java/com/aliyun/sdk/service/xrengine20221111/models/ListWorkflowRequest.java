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
 * {@link ListWorkflowRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowRequest</p>
 */
public class ListWorkflowRequest extends Request {
    private ListWorkflowRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListWorkflowRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowRequest request) {
            super(request);
        } 

        @Override
        public ListWorkflowRequest build() {
            return new ListWorkflowRequest(this);
        } 

    } 

}
