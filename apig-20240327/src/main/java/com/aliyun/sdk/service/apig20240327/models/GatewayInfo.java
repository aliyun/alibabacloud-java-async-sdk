// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayInfo} extends {@link TeaModel}
 *
 * <p>GatewayInfo</p>
 */
public class GatewayInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private GatewayInfo(Builder builder) {
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayInfo create() {
        return builder().build();
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

    public static final class Builder {
        private String gatewayId; 
        private String name; 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public GatewayInfo build() {
            return new GatewayInfo(this);
        } 

    } 

}
