// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link ListFoCreatedAppsRequest} extends {@link RequestModel}
 *
 * <p>ListFoCreatedAppsRequest</p>
 */
public class ListFoCreatedAppsRequest extends Request {
    private ListFoCreatedAppsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFoCreatedAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListFoCreatedAppsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListFoCreatedAppsRequest request) {
            super(request);
        } 

        @Override
        public ListFoCreatedAppsRequest build() {
            return new ListFoCreatedAppsRequest(this);
        } 

    } 

}
