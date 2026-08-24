// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetAntiVirusRealTimeDefenceStrategyRequest} extends {@link RequestModel}
 *
 * <p>GetAntiVirusRealTimeDefenceStrategyRequest</p>
 */
public class GetAntiVirusRealTimeDefenceStrategyRequest extends Request {
    private GetAntiVirusRealTimeDefenceStrategyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAntiVirusRealTimeDefenceStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAntiVirusRealTimeDefenceStrategyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAntiVirusRealTimeDefenceStrategyRequest request) {
            super(request);
        } 

        @Override
        public GetAntiVirusRealTimeDefenceStrategyRequest build() {
            return new GetAntiVirusRealTimeDefenceStrategyRequest(this);
        } 

    } 

}
