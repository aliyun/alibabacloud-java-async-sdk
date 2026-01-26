// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetCustomHostnameRequest} extends {@link RequestModel}
 *
 * <p>GetCustomHostnameRequest</p>
 */
public class GetCustomHostnameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostnameId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long hostnameId;

    private GetCustomHostnameRequest(Builder builder) {
        super(builder);
        this.hostnameId = builder.hostnameId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomHostnameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostnameId
     */
    public Long getHostnameId() {
        return this.hostnameId;
    }

    public static final class Builder extends Request.Builder<GetCustomHostnameRequest, Builder> {
        private Long hostnameId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomHostnameRequest request) {
            super(request);
            this.hostnameId = request.hostnameId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder hostnameId(Long hostnameId) {
            this.putQueryParameter("HostnameId", hostnameId);
            this.hostnameId = hostnameId;
            return this;
        }

        @Override
        public GetCustomHostnameRequest build() {
            return new GetCustomHostnameRequest(this);
        } 

    } 

}
