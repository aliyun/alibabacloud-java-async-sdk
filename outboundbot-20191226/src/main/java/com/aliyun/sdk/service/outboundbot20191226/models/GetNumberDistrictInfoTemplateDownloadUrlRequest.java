// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNumberDistrictInfoTemplateDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetNumberDistrictInfoTemplateDownloadUrlRequest</p>
 */
public class GetNumberDistrictInfoTemplateDownloadUrlRequest extends Request {
    private GetNumberDistrictInfoTemplateDownloadUrlRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNumberDistrictInfoTemplateDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetNumberDistrictInfoTemplateDownloadUrlRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetNumberDistrictInfoTemplateDownloadUrlRequest request) {
            super(request);
        } 

        @Override
        public GetNumberDistrictInfoTemplateDownloadUrlRequest build() {
            return new GetNumberDistrictInfoTemplateDownloadUrlRequest(this);
        } 

    } 

}
