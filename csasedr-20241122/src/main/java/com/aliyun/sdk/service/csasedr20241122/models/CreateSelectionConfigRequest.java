// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link CreateSelectionConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateSelectionConfigRequest</p>
 */
public class CreateSelectionConfigRequest extends Request {
    private CreateSelectionConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSelectionConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateSelectionConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateSelectionConfigRequest request) {
            super(request);
        } 

        @Override
        public CreateSelectionConfigRequest build() {
            return new CreateSelectionConfigRequest(this);
        } 

    } 

}
