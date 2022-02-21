// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDataInformationRequest} extends {@link RequestModel}
 *
 * <p>GetClusterDataInformationRequest</p>
 */
public class GetClusterDataInformationRequest extends Request {
    private GetClusterDataInformationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDataInformationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetClusterDataInformationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetClusterDataInformationRequest response) {
            super(response);
        } 

        @Override
        public GetClusterDataInformationRequest build() {
            return new GetClusterDataInformationRequest(this);
        } 

    } 

}
