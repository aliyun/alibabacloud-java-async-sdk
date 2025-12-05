// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListCustomAgentToolsRequest} extends {@link RequestModel}
 *
 * <p>ListCustomAgentToolsRequest</p>
 */
public class ListCustomAgentToolsRequest extends Request {
    private ListCustomAgentToolsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomAgentToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListCustomAgentToolsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListCustomAgentToolsRequest request) {
            super(request);
        } 

        @Override
        public ListCustomAgentToolsRequest build() {
            return new ListCustomAgentToolsRequest(this);
        } 

    } 

}
