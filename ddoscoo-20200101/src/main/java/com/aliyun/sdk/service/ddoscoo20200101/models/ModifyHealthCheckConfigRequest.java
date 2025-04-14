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
 * {@link ModifyHealthCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyHealthCheckConfigRequest</p>
 */
public class ModifyHealthCheckConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    @com.aliyun.core.annotation.Validation(required = true)
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyHealthCheckConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.healthCheck = builder.healthCheck;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHealthCheckConfigRequest create() {
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
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyHealthCheckConfigRequest, Builder> {
        private String regionId; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String healthCheck; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHealthCheckConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.forwardProtocol = request.forwardProtocol;
            this.frontendPort = request.frontendPort;
            this.healthCheck = request.healthCheck;
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
         * <p>The details of the health check configuration. This parameter is a JSON string. The string contains the following fields:</p>
         * <ul>
         * <li><p><strong>Type</strong>: the protocol type. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> (Layer 4) and <strong>http</strong> (Layer 7).</p>
         * </li>
         * <li><p><strong>Domain</strong>: the domain name, which must be of the STRING type.</p>
         * <p>**</p>
         * <p><strong>Note</strong>This parameter is returned only when the Layer 7 health check configuration is queried.</p>
         * </li>
         * <li><p><strong>Uri</strong>: the check path, which must be of the STRING type.</p>
         * <p>**</p>
         * <p><strong>Note</strong>This parameter is returned only when the Layer 7 health check configuration is queried.</p>
         * </li>
         * <li><p><strong>Timeout</strong>: the response timeout period, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
         * </li>
         * <li><p><strong>Port</strong>: the port on which you want to perform the health check, which must be of the INTEGER type.</p>
         * </li>
         * <li><p><strong>Interval</strong>: the health check interval, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
         * </li>
         * <li><p><strong>Up</strong>: the number of consecutive successful health checks that must occur before declaring a port healthy, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
         * </li>
         * <li><p><strong>Down</strong>: the number of consecutive failed health checks that must occur before declaring a port unhealthy, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;tcp&quot;,&quot;Timeout&quot;:10,&quot;Port&quot;:8080,&quot;Interval&quot;:10,&quot;Up&quot;:10,&quot;Down&quot;:40}</p>
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
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
        public ModifyHealthCheckConfigRequest build() {
            return new ModifyHealthCheckConfigRequest(this);
        } 

    } 

}
