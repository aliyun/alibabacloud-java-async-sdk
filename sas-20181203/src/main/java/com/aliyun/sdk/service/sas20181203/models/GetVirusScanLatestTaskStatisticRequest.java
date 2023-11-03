// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVirusScanLatestTaskStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetVirusScanLatestTaskStatisticRequest</p>
 */
public class GetVirusScanLatestTaskStatisticRequest extends Request {
    private GetVirusScanLatestTaskStatisticRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirusScanLatestTaskStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetVirusScanLatestTaskStatisticRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetVirusScanLatestTaskStatisticRequest request) {
            super(request);
        } 

        @Override
        public GetVirusScanLatestTaskStatisticRequest build() {
            return new GetVirusScanLatestTaskStatisticRequest(this);
        } 

    } 

}
