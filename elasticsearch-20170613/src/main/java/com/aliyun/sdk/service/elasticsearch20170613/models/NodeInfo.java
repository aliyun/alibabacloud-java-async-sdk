// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeInfo} extends {@link TeaModel}
 *
 * <p>NodeInfo</p>
 */
public class NodeInfo extends TeaModel {
    @NameInMap("host")
    private String host;

    @NameInMap("hostName")
    private String hostName;

    @NameInMap("port")
    private Long port;

    @NameInMap("zoneId")
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

        /**
         * 节点IP
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * 节点名称
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * 节点端口号
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * 节点所在可用区标识
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
