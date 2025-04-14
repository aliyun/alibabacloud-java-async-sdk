// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ModifyPortRequest} extends {@link RequestModel}
 *
 * <p>ModifyPortRequest</p>
 */
public class ModifyPortRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String frontendProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyEnable")
    private Long proxyEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> realServers;

    private ModifyPortRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backendPort = builder.backendPort;
        this.frontendPort = builder.frontendPort;
        this.frontendProtocol = builder.frontendProtocol;
        this.instanceId = builder.instanceId;
        this.proxyEnable = builder.proxyEnable;
        this.realServers = builder.realServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPortRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backendPort
     */
    public String getBackendPort() {
        return this.backendPort;
    }

    /**
     * @return frontendPort
     */
    public String getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return frontendProtocol
     */
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return proxyEnable
     */
    public Long getProxyEnable() {
        return this.proxyEnable;
    }

    /**
     * @return realServers
     */
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public static final class Builder extends Request.Builder<ModifyPortRequest, Builder> {
        private String regionId; 
        private String backendPort; 
        private String frontendPort; 
        private String frontendProtocol; 
        private String instanceId; 
        private Long proxyEnable; 
        private java.util.List<String> realServers; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPortRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backendPort = request.backendPort;
            this.frontendPort = request.frontendPort;
            this.frontendProtocol = request.frontendProtocol;
            this.instanceId = request.instanceId;
            this.proxyEnable = request.proxyEnable;
            this.realServers = request.realServers;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The port of the origin server. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder backendPort(String backendPort) {
            this.putQueryParameter("BackendPort", backendPort);
            this.backendPort = backendPort;
            return this;
        }

        /**
         * <p>The forwarding port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder frontendPort(String frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * <p>The type of the forwarding protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder frontendProtocol(String frontendProtocol) {
            this.putQueryParameter("FrontendProtocol", frontendProtocol);
            this.frontendProtocol = frontendProtocol;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to which the port forwarding rule belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-st21zbyq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProxyEnable.
         */
        public Builder proxyEnable(Long proxyEnable) {
            this.putQueryParameter("ProxyEnable", proxyEnable);
            this.proxyEnable = proxyEnable;
            return this;
        }

        /**
         * <p>An array that consists of the IP addresses of origin servers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder realServers(java.util.List<String> realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        @Override
        public ModifyPortRequest build() {
            return new ModifyPortRequest(this);
        } 

    } 

}
