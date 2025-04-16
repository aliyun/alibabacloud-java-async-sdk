// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link ListMcpToolsRequest} extends {@link RequestModel}
 *
 * <p>ListMcpToolsRequest</p>
 */
public class ListMcpToolsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    private ListMcpToolsRequest(Builder builder) {
        super(builder);
        this.authorization = builder.authorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    public static final class Builder extends Request.Builder<ListMcpToolsRequest, Builder> {
        private String authorization; 

        private Builder() {
            super();
        } 

        private Builder(ListMcpToolsRequest request) {
            super(request);
            this.authorization = request.authorization;
        } 

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.putBodyParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        @Override
        public ListMcpToolsRequest build() {
            return new ListMcpToolsRequest(this);
        } 

    } 

}
