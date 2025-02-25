// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link GetSceneListRequest} extends {@link RequestModel}
 *
 * <p>GetSceneListRequest</p>
 */
public class GetSceneListRequest extends Request {
    private GetSceneListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSceneListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSceneListRequest request) {
            super(request);
        } 

        @Override
        public GetSceneListRequest build() {
            return new GetSceneListRequest(this);
        } 

    } 

}
