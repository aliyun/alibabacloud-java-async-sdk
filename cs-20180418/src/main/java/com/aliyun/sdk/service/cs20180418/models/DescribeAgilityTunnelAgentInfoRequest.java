// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAgilityTunnelAgentInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeAgilityTunnelAgentInfoRequest</p>
 */
public class DescribeAgilityTunnelAgentInfoRequest extends Request {
    @Path
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private DescribeAgilityTunnelAgentInfoRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgilityTunnelAgentInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAgilityTunnelAgentInfoRequest, Builder> {
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAgilityTunnelAgentInfoRequest response) {
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
        public DescribeAgilityTunnelAgentInfoRequest build() {
            return new DescribeAgilityTunnelAgentInfoRequest(this);
        } 

    } 

}
