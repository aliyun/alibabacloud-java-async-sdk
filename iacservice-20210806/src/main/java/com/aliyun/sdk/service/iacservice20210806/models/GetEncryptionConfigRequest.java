// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetEncryptionConfigRequest} extends {@link RequestModel}
 *
 * <p>GetEncryptionConfigRequest</p>
 */
public class GetEncryptionConfigRequest extends Request {
    private GetEncryptionConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEncryptionConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetEncryptionConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetEncryptionConfigRequest request) {
            super(request);
        } 

        @Override
        public GetEncryptionConfigRequest build() {
            return new GetEncryptionConfigRequest(this);
        } 

    } 

}
