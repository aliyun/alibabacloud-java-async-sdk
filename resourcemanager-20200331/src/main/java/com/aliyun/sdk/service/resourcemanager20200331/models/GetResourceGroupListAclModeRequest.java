// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupListAclModeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupListAclModeRequest</p>
 */
public class GetResourceGroupListAclModeRequest extends Request {
    private GetResourceGroupListAclModeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupListAclModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetResourceGroupListAclModeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupListAclModeRequest request) {
            super(request);
        } 

        @Override
        public GetResourceGroupListAclModeRequest build() {
            return new GetResourceGroupListAclModeRequest(this);
        } 

    } 

}
