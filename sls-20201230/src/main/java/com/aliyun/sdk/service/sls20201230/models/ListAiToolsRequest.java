// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListAiToolsRequest} extends {@link RequestModel}
 *
 * <p>ListAiToolsRequest</p>
 */
public class ListAiToolsRequest extends Request {
    private ListAiToolsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAiToolsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAiToolsRequest request) {
            super(request);
        } 

        @Override
        public ListAiToolsRequest build() {
            return new ListAiToolsRequest(this);
        } 

    } 

}
