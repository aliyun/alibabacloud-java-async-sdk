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
 * {@link UpdateGatewayFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayFeatureRequest</p>
 */
public class UpdateGatewayFeatureRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UpdateGatewayFeatureRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayFeatureRequest create() {
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

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayFeatureRequest, Builder> {
        private String gatewayId; 
        private String name; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayFeatureRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.name = request.name;
            this.value = request.value;
        } 

        /**
         * <p>Gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2avtllh****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Feature parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>enable-gzip</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;true&quot;</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateGatewayFeatureRequest build() {
            return new UpdateGatewayFeatureRequest(this);
        } 

    } 

}
