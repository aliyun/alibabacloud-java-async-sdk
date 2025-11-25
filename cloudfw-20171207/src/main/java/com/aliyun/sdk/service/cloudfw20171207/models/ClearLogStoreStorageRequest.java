// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ClearLogStoreStorageRequest} extends {@link RequestModel}
 *
 * <p>ClearLogStoreStorageRequest</p>
 */
public class ClearLogStoreStorageRequest extends Request {
    private ClearLogStoreStorageRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearLogStoreStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ClearLogStoreStorageRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ClearLogStoreStorageRequest request) {
            super(request);
        } 

        @Override
        public ClearLogStoreStorageRequest build() {
            return new ClearLogStoreStorageRequest(this);
        } 

    } 

}
