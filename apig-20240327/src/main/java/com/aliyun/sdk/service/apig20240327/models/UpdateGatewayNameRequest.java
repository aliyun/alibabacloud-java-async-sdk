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
 * {@link UpdateGatewayNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayNameRequest</p>
 */
public class UpdateGatewayNameRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdateGatewayNameRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayNameRequest, Builder> {
        private String gatewayId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayNameRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.name = request.name;
        } 

        /**
         * <p>Gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpv4sqdl****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Gateway name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-itemcenter-router</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateGatewayNameRequest build() {
            return new UpdateGatewayNameRequest(this);
        } 

    } 

}
