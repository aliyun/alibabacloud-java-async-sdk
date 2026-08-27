// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPluginRepositoriesRequest} extends {@link RequestModel}
 *
 * <p>ListPluginRepositoriesRequest</p>
 */
public class ListPluginRepositoriesRequest extends Request {
    private ListPluginRepositoriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginRepositoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListPluginRepositoriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListPluginRepositoriesRequest request) {
            super(request);
        } 

        @Override
        public ListPluginRepositoriesRequest build() {
            return new ListPluginRepositoriesRequest(this);
        } 

    } 

}
