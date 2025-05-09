// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DestroyResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>DestroyResourceDirectoryRequest</p>
 */
public class DestroyResourceDirectoryRequest extends Request {
    private DestroyResourceDirectoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DestroyResourceDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DestroyResourceDirectoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DestroyResourceDirectoryRequest request) {
            super(request);
        } 

        @Override
        public DestroyResourceDirectoryRequest build() {
            return new DestroyResourceDirectoryRequest(this);
        } 

    } 

}
