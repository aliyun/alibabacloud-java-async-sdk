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
 * {@link BindK8sSlbRequest} extends {@link RequestModel}
 *
 * <p>BindK8sSlbRequest</p>
 */
public class BindK8sSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

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
    @com.aliyun.core.annotation.NameInMap("SlbId")
    private String slbId;

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

    private BindK8sSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.port = builder.port;
        this.scheduler = builder.scheduler;
        this.servicePortInfos = builder.servicePortInfos;
        this.slbId = builder.slbId;
        this.slbProtocol = builder.slbProtocol;
        this.specification = builder.specification;
        this.targetPort = builder.targetPort;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindK8sSlbRequest create() {
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
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
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

    public static final class Builder extends Request.Builder<BindK8sSlbRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private String port; 
        private String scheduler; 
        private String servicePortInfos; 
        private String slbId; 
        private String slbProtocol; 
        private String specification; 
        private String targetPort; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(BindK8sSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.port = request.port;
            this.scheduler = request.scheduler;
            this.servicePortInfos = request.servicePortInfos;
            this.slbId = request.slbId;
            this.slbProtocol = request.slbProtocol;
            this.specification = request.specification;
            this.targetPort = request.targetPort;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the application.</p>
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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>712082c3-f554-<strong><strong>-</strong></strong>-a947b5cde6ee</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The frontend port. Valid values: 1 to 65535.</p>
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
         * <p>The scheduling algorithm for the SLB instance. If you do not specify this parameter, the default value rr is used. Valid values:</p>
         * <ul>
         * <li>wrr: weighted round-robin scheduling. Backend servers that have higher weights receive more requests than those that have lower weights.</li>
         * <li>rr: round-robin scheduling. Requests are sequentially distributed to backend servers.</li>
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
         * <p>The information about the ports. This parameter is required if you want to configure multi-port mappings or use a protocol other than TCP. You must set this parameter to a JSON array. Example: [{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;1362469756373809_16c185d6fa2_1914500329_-xxxxxxx&quot;,&quot;targetPort&quot;:8181,&quot;lo adBalancerProtocol&quot;:&quot;HTTPS&quot;}]</p>
         * <ul>
         * <li>port: The frontend port. Valid values: 1 to 65535. This parameter is required. Each port must be unique.</li>
         * <li>targetPort: The backend port. Valid values: 1 to 65535. This parameter is required.</li>
         * <li>loadBalancerProtocol: This parameter is required. Valid values: TCP and HTTPS. If the HTTP protocol is used, set this parameter to TCP.</li>
         * <li>certId: the ID of the certificate. This parameter is required if the HTTPS protocol is used. You can purchase an SLB instance in the SLB console.</li>
         * </ul>
         * <blockquote>
         * <p>The ServicePortInfos parameter is specified to support multi-port mappings. If you want this parameter to take effect, make sure that you have set the AppId, ClusterId, Type, and SlbId parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;136246975637380916c185d6fa21914500329_-988as&quot;,&quot;targetPort&quot;:8181,&quot;lo adBalancerProtocol&quot;:&quot;HTTPS&quot;}]</p>
         */
        public Builder servicePortInfos(String servicePortInfos) {
            this.putQueryParameter("ServicePortInfos", servicePortInfos);
            this.servicePortInfos = servicePortInfos;
            return this;
        }

        /**
         * <p>The ID of the SLB instance. If you leave this parameter empty, Enterprise Distributed Application Service (EDAS) automatically purchases an SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2ze1quax9t****iz82bjt</p>
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * <p>The protocol used by the SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
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
         * <p>The instance type of the SLB instance. Valid values:</p>
         * <ul>
         * <li>slb.s1.small</li>
         * <li>slb.s2.small</li>
         * <li>slb.s2.medium</li>
         * <li>slb.s3.small</li>
         * <li>slb.s3.medium</li>
         * <li>slb.s3.large</li>
         * </ul>
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
         * <p>The backend port, which is also the service port of the application. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder targetPort(String targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * <p>The type of the SLB instance. Valid values:</p>
         * <ul>
         * <li>internet: Internet-facing SLB instance</li>
         * <li>intranet: internal-facing SLB instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public BindK8sSlbRequest build() {
            return new BindK8sSlbRequest(this);
        } 

    } 

}
