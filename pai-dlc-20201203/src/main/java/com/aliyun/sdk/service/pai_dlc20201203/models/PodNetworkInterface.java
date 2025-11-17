// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link PodNetworkInterface} extends {@link TeaModel}
 *
 * <p>PodNetworkInterface</p>
 */
public class PodNetworkInterface extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InterfaceName")
    private String interfaceName;

    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    private PodNetworkInterface(Builder builder) {
        this.interfaceName = builder.interfaceName;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PodNetworkInterface create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return interfaceName
     */
    public String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder {
        private String interfaceName; 
        private String ip; 

        private Builder() {
        } 

        private Builder(PodNetworkInterface model) {
            this.interfaceName = model.interfaceName;
            this.ip = model.ip;
        } 

        /**
         * InterfaceName.
         */
        public Builder interfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        public PodNetworkInterface build() {
            return new PodNetworkInterface(this);
        } 

    } 

}
