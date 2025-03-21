// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>GetCheckConfigRequest</p>
 */
public class GetCheckConfigRequest extends Request {
    private GetCheckConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCheckConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCheckConfigRequest request) {
            super(request);
        } 

        @Override
        public GetCheckConfigRequest build() {
            return new GetCheckConfigRequest(this);
        } 

    } 

}
