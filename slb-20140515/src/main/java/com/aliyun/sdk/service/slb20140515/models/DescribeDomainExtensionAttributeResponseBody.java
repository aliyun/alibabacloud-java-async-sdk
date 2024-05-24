// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainExtensionAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainExtensionAttributeResponseBody</p>
 */
public class DescribeDomainExtensionAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("DomainExtensionId")
    private String domainExtensionId;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
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
         * The domain name.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the additional certificate.
         */
        public Builder domainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }

        /**
         * The frontend port of the HTTPS listener that is configured for the SLB instance. Valid values: **1** to **65535**.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The ID of the SLB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the server certificate that is used by the domain name.
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
