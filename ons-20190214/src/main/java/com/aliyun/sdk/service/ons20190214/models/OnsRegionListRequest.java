// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsRegionListRequest} extends {@link RequestModel}
 *
 * <p>OnsRegionListRequest</p>
 */
public class OnsRegionListRequest extends Request {
    private OnsRegionListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsRegionListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OnsRegionListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OnsRegionListRequest request) {
            super(request);
        } 

        @Override
        public OnsRegionListRequest build() {
            return new OnsRegionListRequest(this);
        } 

    } 

}
