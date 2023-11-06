// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdvancedSearchFileRequest} extends {@link RequestModel}
 *
 * <p>GetAdvancedSearchFileRequest</p>
 */
public class GetAdvancedSearchFileRequest extends Request {
    private GetAdvancedSearchFileRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvancedSearchFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAdvancedSearchFileRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAdvancedSearchFileRequest request) {
            super(request);
        } 

        @Override
        public GetAdvancedSearchFileRequest build() {
            return new GetAdvancedSearchFileRequest(this);
        } 

    } 

}
