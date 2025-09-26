// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateGatewayInput} extends {@link TeaModel}
 *
 * <p>CreateGatewayInput</p>
 */
public class CreateGatewayInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("identityId")
    private String identityId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private GatewayNetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateGatewayInput(Builder builder) {
        this.identityId = builder.identityId;
        this.name = builder.name;
        this.networkConfiguration = builder.networkConfiguration;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkConfiguration
     */
    public GatewayNetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String identityId; 
        private String name; 
        private GatewayNetworkConfiguration networkConfiguration; 
        private String type; 

        private Builder() {
        } 

        private Builder(CreateGatewayInput model) {
            this.identityId = model.identityId;
            this.name = model.name;
            this.networkConfiguration = model.networkConfiguration;
            this.type = model.type;
        } 

        /**
         * identityId.
         */
        public Builder identityId(String identityId) {
            this.identityId = identityId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(GatewayNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateGatewayInput build() {
            return new CreateGatewayInput(this);
        } 

    } 

}
