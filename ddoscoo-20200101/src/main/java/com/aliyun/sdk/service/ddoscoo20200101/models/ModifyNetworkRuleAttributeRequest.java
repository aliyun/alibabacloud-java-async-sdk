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
 * {@link ModifyNetworkRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkRuleAttributeRequest</p>
 */
public class ModifyNetworkRuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyNetworkRuleAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkRuleAttributeRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return forwardProtocol
     */
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    /**
     * @return frontendPort
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkRuleAttributeRequest, Builder> {
        private String regionId; 
        private String config; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkRuleAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.forwardProtocol = request.forwardProtocol;
            this.frontendPort = request.frontendPort;
            this.instanceId = request.instanceId;
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
         * <p>The detailed settings of the port forwarding rule. This parameter is a JSON string and contains the following fields. The detailed settings of a TCP port forwarding rule contain the following fields.</p>
         * <ul>
         * <li><strong>PersistenceTimeout</strong>: the timeout period of session persistence. This field is required and of the integer type. Valid values: <strong>30</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>0</strong>, which indicates that session persistence is disabled.</li>
         * <li><strong>Synproxy</strong>: specifies whether to enable the false source feature in the DDoS mitigation policy. This field is required and of the string type. Valid values: off and on.</li>
         * <li><strong>NodataConn</strong>: specifies whether to enable the empty connection feature in the DDoS mitigation policy. This field is required and of the string type. Valid values: off and on.</li>
         * <li><strong>Sla</strong>: the settings of the speed limit for destination feature. This field is required and of the struct type. For more information, see the following description about Sla.</li>
         * <li><strong>Slimit</strong>: the settings of the rate limit for source feature. This field is required and of the struct type. For more information, see the following description about Slimit.</li>
         * <li><strong>PayloadLen</strong>: the settings of the packet length limit feature. This field is required and of the struct type. For more information, see the following description about PayloadLen.</li>
         * </ul>
         * <p>Sla contains the following fields:</p>
         * <ul>
         * <li><strong>Cps</strong>: the destination rate limit on new connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 100 to 100000.</li>
         * <li><strong>Maxconn</strong>: the destination rate limit on concurrent connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 1000 to 1000000.</li>
         * <li><strong>CpsEnable</strong>: specifies whether to enable Cps. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Cps is disabled, and the value 1 indicates that Cps is enabled.</li>
         * <li><strong>MaxconnEnable</strong>: specifies whether to enable Maxconn. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Maxconn is disabled, and the value 1 indicates that Maxconn is enabled.</li>
         * </ul>
         * <p>Slimit contains the following fields:</p>
         * <ul>
         * <li><strong>Cps</strong>: the source rate limit on new connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 1 to 50000.</li>
         * <li><strong>Maxconn</strong>: the source rate limit on concurrent connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 1 to 50000.</li>
         * <li><strong>CpsEnable</strong>: specifies whether to enable Cps. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Cps is disabled, and the value 1 indicates that Cps is enabled.</li>
         * <li><strong>MaxconnEnable</strong>: specifies whether to enable Maxconn. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Maxconn is disabled, and the value 1 indicates that Maxconn is enabled.</li>
         * <li><strong>CpsMode</strong>: specifies whether to enable the source rate limit on new connections. This field is required and of the integer type. Valid values: 1 and 2. The value 1 indicates that the source rate limit is disabled. The value 2 indicates that the system determines whether to enable the source rate limit.</li>
         * </ul>
         * <p>PayloadLen contains the following fields:</p>
         * <ul>
         * <li><strong>Min</strong>: the minimum packet length in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 0 to 1500.</li>
         * <li><strong>Max</strong>: the maximum packet length in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 0 to 1500.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PersistenceTimeout&quot;:900}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.putQueryParameter("ForwardProtocol", forwardProtocol);
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * <p>The forwarding port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder frontendPort(Integer frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyNetworkRuleAttributeRequest build() {
            return new ModifyNetworkRuleAttributeRequest(this);
        } 

    } 

}
