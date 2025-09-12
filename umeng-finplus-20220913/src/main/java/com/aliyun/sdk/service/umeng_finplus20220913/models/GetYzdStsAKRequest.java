// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link GetYzdStsAKRequest} extends {@link RequestModel}
 *
 * <p>GetYzdStsAKRequest</p>
 */
public class GetYzdStsAKRequest extends Request {
    private GetYzdStsAKRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYzdStsAKRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetYzdStsAKRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetYzdStsAKRequest request) {
            super(request);
        } 

        @Override
        public GetYzdStsAKRequest build() {
            return new GetYzdStsAKRequest(this);
        } 

    } 

}
