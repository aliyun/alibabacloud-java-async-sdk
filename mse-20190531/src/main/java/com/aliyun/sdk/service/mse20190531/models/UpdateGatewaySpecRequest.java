// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewaySpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewaySpecRequest</p>
 */
public class UpdateGatewaySpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replica")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer replica;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private UpdateGatewaySpecRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.replica = builder.replica;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewaySpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return replica
     */
    public Integer getReplica() {
        return this.replica;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<UpdateGatewaySpecRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Integer replica; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewaySpecRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.replica = request.replica;
            this.spec = request.spec;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c70622ff52fe49beb29bea9a6f52****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replica(Integer replica) {
            this.putQueryParameter("Replica", replica);
            this.replica = replica;
            return this;
        }

        /**
         * <p>The node specifications of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_GTW_4_8_200_c</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public UpdateGatewaySpecRequest build() {
            return new UpdateGatewaySpecRequest(this);
        } 

    } 

}
