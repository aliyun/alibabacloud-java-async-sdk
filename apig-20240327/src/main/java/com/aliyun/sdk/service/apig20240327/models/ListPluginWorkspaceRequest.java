// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPluginWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>ListPluginWorkspaceRequest</p>
 */
public class ListPluginWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    private ListPluginWorkspaceRequest(Builder builder) {
        super(builder);
        this.gatewayType = builder.gatewayType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    public static final class Builder extends Request.Builder<ListPluginWorkspaceRequest, Builder> {
        private String gatewayType; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginWorkspaceRequest request) {
            super(request);
            this.gatewayType = request.gatewayType;
        } 

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        @Override
        public ListPluginWorkspaceRequest build() {
            return new ListPluginWorkspaceRequest(this);
        } 

    } 

}
