// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEcsSlbRequest} extends {@link RequestModel}
 *
 * <p>BindEcsSlbRequest</p>
 */
public class BindEcsSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DeployGroupId")
    private String deployGroupId;

    @Query
    @NameInMap("ListenerHealthCheckUrl")
    private String listenerHealthCheckUrl;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true)
    private Integer listenerPort;

    @Query
    @NameInMap("ListenerProtocol")
    @Validation(required = true)
    private String listenerProtocol;

    @Query
    @NameInMap("SlbId")
    @Validation(required = true)
    private String slbId;

    @Query
    @NameInMap("VForwardingUrlRule")
    private String vForwardingUrlRule;

    @Query
    @NameInMap("VServerGroupId")
    private String vServerGroupId;

    @Query
    @NameInMap("VServerGroupName")
    private String vServerGroupName;

    private BindEcsSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deployGroupId = builder.deployGroupId;
        this.listenerHealthCheckUrl = builder.listenerHealthCheckUrl;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.slbId = builder.slbId;
        this.vForwardingUrlRule = builder.vForwardingUrlRule;
        this.vServerGroupId = builder.vServerGroupId;
        this.vServerGroupName = builder.vServerGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindEcsSlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deployGroupId
     */
    public String getDeployGroupId() {
        return this.deployGroupId;
    }

    /**
     * @return listenerHealthCheckUrl
     */
    public String getListenerHealthCheckUrl() {
        return this.listenerHealthCheckUrl;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return vForwardingUrlRule
     */
    public String getVForwardingUrlRule() {
        return this.vForwardingUrlRule;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    /**
     * @return vServerGroupName
     */
    public String getVServerGroupName() {
        return this.vServerGroupName;
    }

    public static final class Builder extends Request.Builder<BindEcsSlbRequest, Builder> {
        private String appId; 
        private String deployGroupId; 
        private String listenerHealthCheckUrl; 
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String slbId; 
        private String vForwardingUrlRule; 
        private String vServerGroupId; 
        private String vServerGroupName; 

        private Builder() {
            super();
        } 

        private Builder(BindEcsSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.deployGroupId = request.deployGroupId;
            this.listenerHealthCheckUrl = request.listenerHealthCheckUrl;
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.slbId = request.slbId;
            this.vForwardingUrlRule = request.vForwardingUrlRule;
            this.vServerGroupId = request.vServerGroupId;
            this.vServerGroupName = request.vServerGroupName;
        } 

        /**
         * The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the instance group whose application you want to bind. You can call the ListDeployGroup operation to query the group ID. For more information, see [ListDeployGroup](~~62077~~).
         */
        public Builder deployGroupId(String deployGroupId) {
            this.putQueryParameter("DeployGroupId", deployGroupId);
            this.deployGroupId = deployGroupId;
            return this;
        }

        /**
         * The health check URL.
         */
        public Builder listenerHealthCheckUrl(String listenerHealthCheckUrl) {
            this.putQueryParameter("ListenerHealthCheckUrl", listenerHealthCheckUrl);
            this.listenerHealthCheckUrl = listenerHealthCheckUrl;
            return this;
        }

        /**
         * The listener port for the SLB instance.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The listener protocol for the SLB instance.
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * The ID of the SLB instance.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * The forwarding rule of the SLB listener.
         */
        public Builder vForwardingUrlRule(String vForwardingUrlRule) {
            this.putQueryParameter("VForwardingUrlRule", vForwardingUrlRule);
            this.vForwardingUrlRule = vForwardingUrlRule;
            return this;
        }

        /**
         * The ID of the vServer group for the SLB instance.
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * The name of the vServer group.
         */
        public Builder vServerGroupName(String vServerGroupName) {
            this.putQueryParameter("VServerGroupName", vServerGroupName);
            this.vServerGroupName = vServerGroupName;
            return this;
        }

        @Override
        public BindEcsSlbRequest build() {
            return new BindEcsSlbRequest(this);
        } 

    } 

}
