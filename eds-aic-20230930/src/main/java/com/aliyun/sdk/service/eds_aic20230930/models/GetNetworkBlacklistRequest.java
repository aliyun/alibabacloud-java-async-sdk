// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link GetNetworkBlacklistRequest} extends {@link RequestModel}
 *
 * <p>GetNetworkBlacklistRequest</p>
 */
public class GetNetworkBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetNetworkBlacklistRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkBlacklistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetNetworkBlacklistRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetNetworkBlacklistRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetNetworkBlacklistRequest build() {
            return new GetNetworkBlacklistRequest(this);
        } 

    } 

}
