// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteCloudResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudResourceRequest</p>
 */
public class DeleteCloudResourceRequest extends Request {
    private DeleteCloudResourceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DeleteCloudResourceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudResourceRequest request) {
            super(request);
        } 

        @Override
        public DeleteCloudResourceRequest build() {
            return new DeleteCloudResourceRequest(this);
        } 

    } 

}
