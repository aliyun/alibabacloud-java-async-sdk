// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodeInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNodeInfoRequest</p>
 */
public class DescribeClusterNodeInfoRequest extends Request {
    @Path
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private DescribeClusterNodeInfoRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodeInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeClusterNodeInfoRequest, Builder> {
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNodeInfoRequest response) {
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
        public DescribeClusterNodeInfoRequest build() {
            return new DescribeClusterNodeInfoRequest(this);
        } 

    } 

}
