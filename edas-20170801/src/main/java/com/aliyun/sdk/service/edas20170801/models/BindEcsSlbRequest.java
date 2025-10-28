// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link BindEcsSlbRequest} extends {@link RequestModel}
 *
 * <p>BindEcsSlbRequest</p>
 */
public class BindEcsSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployGroupId")
    private String deployGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerHealthCheckUrl")
    private String listenerHealthCheckUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VForwardingUrlRule")
    private String vForwardingUrlRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupName")
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
         * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93fdd228-*****-ed2ae98de18d</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance group whose application you want to bind. You can call the ListDeployGroup operation to query the group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62077.html">ListDeployGroup</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>577f4c50-16ee-43d8-<strong><strong>-</strong></strong></p>
         */
        public Builder deployGroupId(String deployGroupId) {
            this.putQueryParameter("DeployGroupId", deployGroupId);
            this.deployGroupId = deployGroupId;
            return this;
        }

        /**
         * <p>The health check URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/_ehc.html</p>
         */
        public Builder listenerHealthCheckUrl(String listenerHealthCheckUrl) {
            this.putQueryParameter("ListenerHealthCheckUrl", listenerHealthCheckUrl);
            this.listenerHealthCheckUrl = listenerHealthCheckUrl;
            return this;
        }

        /**
         * <p>The listener port for the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The listener protocol for the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6j54m3a****cj01jx8</p>
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * <p>The forwarding rule of the SLB listener.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/forwarding</p>
         */
        public Builder vForwardingUrlRule(String vForwardingUrlRule) {
            this.putQueryParameter("VForwardingUrlRule", vForwardingUrlRule);
            this.vForwardingUrlRule = vForwardingUrlRule;
            return this;
        }

        /**
         * <p>The ID of the vServer group for the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-2ze<strong><strong>6l</strong></strong>*</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>The name of the vServer group.</p>
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
