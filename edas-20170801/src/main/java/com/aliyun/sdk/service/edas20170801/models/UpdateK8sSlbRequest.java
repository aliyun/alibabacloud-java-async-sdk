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
 * {@link UpdateK8sSlbRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sSlbRequest</p>
 */
public class UpdateK8sSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableForceOverride")
    private Boolean disableForceOverride;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePortInfos")
    private String servicePortInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbName")
    private String slbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbProtocol")
    private String slbProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Specification")
    private String specification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private String targetPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdateK8sSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.disableForceOverride = builder.disableForceOverride;
        this.port = builder.port;
        this.scheduler = builder.scheduler;
        this.servicePortInfos = builder.servicePortInfos;
        this.slbName = builder.slbName;
        this.slbProtocol = builder.slbProtocol;
        this.specification = builder.specification;
        this.targetPort = builder.targetPort;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sSlbRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return disableForceOverride
     */
    public Boolean getDisableForceOverride() {
        return this.disableForceOverride;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return servicePortInfos
     */
    public String getServicePortInfos() {
        return this.servicePortInfos;
    }

    /**
     * @return slbName
     */
    public String getSlbName() {
        return this.slbName;
    }

    /**
     * @return slbProtocol
     */
    public String getSlbProtocol() {
        return this.slbProtocol;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * @return targetPort
     */
    public String getTargetPort() {
        return this.targetPort;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateK8sSlbRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private Boolean disableForceOverride; 
        private String port; 
        private String scheduler; 
        private String servicePortInfos; 
        private String slbName; 
        private String slbProtocol; 
        private String specification; 
        private String targetPort; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.disableForceOverride = request.disableForceOverride;
            this.port = request.port;
            this.scheduler = request.scheduler;
            this.servicePortInfos = request.servicePortInfos;
            this.slbName = request.slbName;
            this.slbProtocol = request.slbProtocol;
            this.specification = request.specification;
            this.targetPort = request.targetPort;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the application. Call <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a> to get this ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the cluster. Call <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a> to get this ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>712082c3-<strong><strong>-</strong></strong>-9217-a947b5cde6ee</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to disable overwriting the SLB listener configuration.</p>
         * <ul>
         * <li><p>true: Disables overwriting.</p>
         * </li>
         * <li><p>false: Allows overwriting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableForceOverride(Boolean disableForceOverride) {
            this.putQueryParameter("DisableForceOverride", disableForceOverride);
            this.disableForceOverride = disableForceOverride;
            return this;
        }

        /**
         * <p>The frontend port. The value ranges from 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The scheduling algorithm of the SLB instance. If you do not set this parameter, rr is used. The supported algorithms are round-robin (rr) and weighted round-robin (wrr).</p>
         * <ul>
         * <li><p>Weighted round-robin (wrr): Backend servers with higher weights receive more requests.</p>
         * </li>
         * <li><p>Round-robin (rr): Requests are distributed to backend servers in sequence.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>This parameter is used for scenarios that involve multiple ports or protocols other than TCP. The value must be a JSON array. For example:
         * [{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;1362469756373809_16c185d6fa2_1914500329_-xxxxxxx&quot;,&quot;targetPort&quot;:8181,&quot;loadBalancerProtocol&quot;:&quot;HTTPS&quot;}]</p>
         * <ul>
         * <li><p>port: Required. The frontend port. The value ranges from 1 to 65535. Each port number must be unique.</p>
         * </li>
         * <li><p>targetPort: Required. The backend port. The value ranges from 1 to 65535.</p>
         * </li>
         * <li><p>loadBalancerProtocol: Required. Only TCP and HTTPS are supported. For HTTP listeners, set this parameter to TCP.</p>
         * </li>
         * <li><p>certId: This parameter is required for HTTPS listeners. It specifies the ID of a certificate that you can purchase in the SLB console.</p>
         * </li>
         * <li><p>Note: This parameter is used to support multiple ports and must be used with the appId, clusterId, type, and slbId parameters.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;136246975637380916c185d6fa21914500329_-xxxxxxx&quot;,&quot;targetPort&quot;:8181,&quot;lo adBalancerProtocol&quot;:&quot;HTTPS&quot;}</p>
         */
        public Builder servicePortInfos(String servicePortInfos) {
            this.putQueryParameter("ServicePortInfos", servicePortInfos);
            this.servicePortInfos = servicePortInfos;
            return this;
        }

        /**
         * <p>The name of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>SLB_doctest</p>
         */
        public Builder slbName(String slbName) {
            this.putQueryParameter("SlbName", slbName);
            this.slbName = slbName;
            return this;
        }

        /**
         * <p>The protocol of the SLB instance. Currently, only TCP is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder slbProtocol(String slbProtocol) {
            this.putQueryParameter("SlbProtocol", slbProtocol);
            this.slbProtocol = slbProtocol;
            return this;
        }

        /**
         * <p>The specification of the SLB instance. The following specifications are supported:</p>
         * <ul>
         * <li><p>slb.s1.small</p>
         * </li>
         * <li><p>slb.s2.small</p>
         * </li>
         * <li><p>slb.s2.medium</p>
         * </li>
         * <li><p>slb.s3.small</p>
         * </li>
         * <li><p>slb.s3.medium</p>
         * </li>
         * <li><p>slb.s3.large</p>
         * </li>
         * </ul>
         * <p>If you do not set this parameter, the default value is slb.s1.small.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * <p>The backend port, which is the service port of the application. The value ranges from 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8082</p>
         */
        public Builder targetPort(String targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * <p>The type of the SLB instance.</p>
         * <ul>
         * <li><p>Internet: An Internet-facing instance.</p>
         * </li>
         * <li><p>Intranet: An internal-facing instance.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateK8sSlbRequest build() {
            return new UpdateK8sSlbRequest(this);
        } 

    } 

}
