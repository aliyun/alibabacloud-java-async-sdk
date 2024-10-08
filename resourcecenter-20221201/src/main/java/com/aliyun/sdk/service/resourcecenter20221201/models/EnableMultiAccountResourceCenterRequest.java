// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableMultiAccountResourceCenterRequest} extends {@link RequestModel}
 *
 * <p>EnableMultiAccountResourceCenterRequest</p>
 */
public class EnableMultiAccountResourceCenterRequest extends Request {
    private EnableMultiAccountResourceCenterRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMultiAccountResourceCenterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableMultiAccountResourceCenterRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableMultiAccountResourceCenterRequest request) {
            super(request);
        } 

        @Override
        public EnableMultiAccountResourceCenterRequest build() {
            return new EnableMultiAccountResourceCenterRequest(this);
        } 

    } 

}
