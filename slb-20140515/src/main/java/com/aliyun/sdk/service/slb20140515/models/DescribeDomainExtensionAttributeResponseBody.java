// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the additional certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>de-bp1rp7ta1****</p>
         */
        public Builder domainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }

        /**
         * <p>The frontend port of the HTTPS listener that is configured for the SLB instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1o94dp5i6*****earr9g6d1l</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48C1B671-C6DB-4DDE-9B30-10557E36CDE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the server certificate used by the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>231579085529123_166f82******_1714763408_709981430</p>
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
