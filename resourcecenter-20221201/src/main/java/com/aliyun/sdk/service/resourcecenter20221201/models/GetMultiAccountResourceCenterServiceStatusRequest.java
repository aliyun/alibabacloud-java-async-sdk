// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMultiAccountResourceCenterServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMultiAccountResourceCenterServiceStatusRequest</p>
 */
public class GetMultiAccountResourceCenterServiceStatusRequest extends Request {
    private GetMultiAccountResourceCenterServiceStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiAccountResourceCenterServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMultiAccountResourceCenterServiceStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMultiAccountResourceCenterServiceStatusRequest request) {
            super(request);
        } 

        @Override
        public GetMultiAccountResourceCenterServiceStatusRequest build() {
            return new GetMultiAccountResourceCenterServiceStatusRequest(this);
        } 

    } 

}
