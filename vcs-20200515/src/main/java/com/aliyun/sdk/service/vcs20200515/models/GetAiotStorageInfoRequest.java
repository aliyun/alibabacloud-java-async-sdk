// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiotStorageInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAiotStorageInfoRequest</p>
 */
public class GetAiotStorageInfoRequest extends Request {
    private GetAiotStorageInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiotStorageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAiotStorageInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAiotStorageInfoRequest response) {
            super(response);
        } 

        @Override
        public GetAiotStorageInfoRequest build() {
            return new GetAiotStorageInfoRequest(this);
        } 

    } 

}
