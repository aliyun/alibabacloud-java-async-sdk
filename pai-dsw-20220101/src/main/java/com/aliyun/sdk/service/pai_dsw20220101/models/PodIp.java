// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link PodIp} extends {@link TeaModel}
 *
 * <p>PodIp</p>
 */
public class PodIp extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InterfaceName")
    private String interfaceName;

    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private PodIp(Builder builder) {
        this.interfaceName = builder.interfaceName;
        this.ip = builder.ip;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PodIp create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String interfaceName; 
        private String ip; 
        private String type; 

        private Builder() {
        } 

        private Builder(PodIp model) {
            this.interfaceName = model.interfaceName;
            this.ip = model.ip;
            this.type = model.type;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PodIp build() {
            return new PodIp(this);
        } 

    } 

}
