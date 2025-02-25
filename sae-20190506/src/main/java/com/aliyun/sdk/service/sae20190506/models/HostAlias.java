// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link HostAlias} extends {@link TeaModel}
 *
 * <p>HostAlias</p>
 */
public class HostAlias extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hostnames")
    private java.util.List<String> hostnames;

    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    private HostAlias(Builder builder) {
        this.hostnames = builder.hostnames;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HostAlias create() {
        return builder().build();
    }

    /**
     * @return hostnames
     */
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder {
        private java.util.List<String> hostnames; 
        private String ip; 

        /**
         * hostnames.
         */
        public Builder hostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        public HostAlias build() {
            return new HostAlias(this);
        } 

    } 

}
