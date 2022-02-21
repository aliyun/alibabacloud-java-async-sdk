// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainExtensionAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainExtensionAttributeResponseBody</p>
 */
public class DescribeDomainExtensionAttributeResponseBody extends TeaModel {
    @NameInMap("Domain")
    private String domain;

    @NameInMap("DomainExtensionId")
    private String domainExtensionId;

    @NameInMap("ListenerPort")
    private Integer listenerPort;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerCertificateId")
    private String serverCertificateId;

    private DescribeDomainExtensionAttributeResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.domainExtensionId = builder.domainExtensionId;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.requestId = builder.requestId;
        this.serverCertificateId = builder.serverCertificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainExtensionAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainExtensionId
     */
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public static final class Builder {
        private String domain; 
        private String domainExtensionId; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String requestId; 
        private String serverCertificateId; 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * DomainExtensionId.
         */
        public Builder domainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServerCertificateId.
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        public DescribeDomainExtensionAttributeResponseBody build() {
            return new DescribeDomainExtensionAttributeResponseBody(this);
        } 

    } 

}
