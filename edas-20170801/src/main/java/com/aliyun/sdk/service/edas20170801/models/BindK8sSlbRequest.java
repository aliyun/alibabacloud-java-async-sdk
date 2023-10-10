// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindK8sSlbRequest} extends {@link RequestModel}
 *
 * <p>BindK8sSlbRequest</p>
 */
public class BindK8sSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("Scheduler")
    private String scheduler;

    @Query
    @NameInMap("ServicePortInfos")
    private String servicePortInfos;

    @Query
    @NameInMap("SlbId")
    private String slbId;

    @Query
    @NameInMap("SlbProtocol")
    private String slbProtocol;

    @Query
    @NameInMap("Specification")
    private String specification;

    @Query
    @NameInMap("TargetPort")
    private String targetPort;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The frontend port. Valid values: 1 to 65535.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The scheduling algorithm for the SLB instance. If you do not specify this parameter, the default value rr is used. Valid values:
         * <p>
         * 
         * *   wrr: weighted round-robin scheduling. Backend servers that have higher weights receive more requests than those that have lower weights.
         * *   rr: round-robin scheduling. Requests are sequentially distributed to backend servers.
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * The information about the ports. This parameter is required if you want to configure multi-port mappings or use a protocol other than TCP. You must set this parameter to a JSON array. Example: \[{"targetPort":8080,"port":82,"loadBalancerProtocol":"TCP"},{"port":81,"certId":"1362469756373809\_16c185d6fa2\_1914500329\_-xxxxxxx","targetPort":8181,"lo adBalancerProtocol":"HTTPS"}]
         * <p>
         * 
         * *   port: The frontend port. Valid values: 1 to 65535. This parameter is required. Each port must be unique.
         * *   targetPort: The backend port. Valid values: 1 to 65535. This parameter is required.
         * *   loadBalancerProtocol: This parameter is required. Valid values: TCP and HTTPS. If the HTTP protocol is used, set this parameter to TCP.
         * *   certId: the ID of the certificate. This parameter is required if the HTTPS protocol is used. You can purchase an SLB instance in the SLB console.
         * 
         * > The ServicePortInfos parameter is specified to support multi-port mappings. If you want this parameter to take effect, make sure that you have set the AppId, ClusterId, Type, and SlbId parameters.
         */
        public Builder servicePortInfos(String servicePortInfos) {
            this.putQueryParameter("ServicePortInfos", servicePortInfos);
            this.servicePortInfos = servicePortInfos;
            return this;
        }

        /**
         * The ID of the SLB instance. If you leave this parameter empty, Enterprise Distributed Application Service (EDAS) automatically purchases an SLB instance.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * The protocol used by the SLB instance. Valid values: TCP, HTTP, and HTTPS.
         */
        public Builder slbProtocol(String slbProtocol) {
            this.putQueryParameter("SlbProtocol", slbProtocol);
            this.slbProtocol = slbProtocol;
            return this;
        }

        /**
         * The instance type of the SLB instance. Valid values:
         * <p>
         * 
         * *   slb.s1.small
         * *   slb.s2.small
         * *   slb.s2.medium
         * *   slb.s3.small
         * *   slb.s3.medium
         * *   slb.s3.large
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * The backend port, which is also the service port of the application. Valid values: 1 to 65535.
         */
        public Builder targetPort(String targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * The type of the SLB instance. Valid values:
         * <p>
         * 
         * *   internet: Internet-facing SLB instance
         * *   intranet: internal-facing SLB instance
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
