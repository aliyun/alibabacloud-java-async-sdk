// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAgilityTunnelCertsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAgilityTunnelCertsRequest</p>
 */
public class DescribeAgilityTunnelCertsRequest extends Request {
    @Path
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private DescribeAgilityTunnelCertsRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgilityTunnelCertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<DescribeAgilityTunnelCertsRequest, Builder> {
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAgilityTunnelCertsRequest response) {
            super(response);
            this.token = response.token;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putPathParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public DescribeAgilityTunnelCertsRequest build() {
            return new DescribeAgilityTunnelCertsRequest(this);
        } 

    } 

}
