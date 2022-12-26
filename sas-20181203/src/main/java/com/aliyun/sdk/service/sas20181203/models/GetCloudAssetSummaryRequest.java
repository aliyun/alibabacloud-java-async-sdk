// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetSummaryRequest</p>
 */
public class GetCloudAssetSummaryRequest extends Request {
    private GetCloudAssetSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCloudAssetSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetCloudAssetSummaryRequest build() {
            return new GetCloudAssetSummaryRequest(this);
        } 

    } 

}
