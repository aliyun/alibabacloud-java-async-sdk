// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link NodeInfo} extends {@link TeaModel}
 *
 * <p>NodeInfo</p>
 */
public class NodeInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("hostName")
    private String hostName;

    @com.aliyun.core.annotation.NameInMap("port")
    private Long port;

    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private NodeInfo(Builder builder) {
        this.host = builder.host;
        this.hostName = builder.hostName;
        this.port = builder.port;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String host; 
        private String hostName; 
        private Long port; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(NodeInfo model) {
            this.host = model.host;
            this.hostName = model.hostName;
            this.port = model.port;
            this.zoneId = model.zoneId;
        } 

        /**
         * host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * hostName.
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public NodeInfo build() {
            return new NodeInfo(this);
        } 

    } 

}
