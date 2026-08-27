// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetModelOperatorOrderRequest} extends {@link RequestModel}
 *
 * <p>GetModelOperatorOrderRequest</p>
 */
public class GetModelOperatorOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private GetModelOperatorOrderRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelOperatorOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetModelOperatorOrderRequest, Builder> {
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetModelOperatorOrderRequest request) {
            super(request);
            this.region = request.region;
        } 

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetModelOperatorOrderRequest build() {
            return new GetModelOperatorOrderRequest(this);
        } 

    } 

}
