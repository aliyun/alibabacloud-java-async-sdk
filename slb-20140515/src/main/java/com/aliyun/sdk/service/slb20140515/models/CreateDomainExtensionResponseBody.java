// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainExtensionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDomainExtensionResponseBody</p>
 */
public class CreateDomainExtensionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainExtensionId")
    private String domainExtensionId;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDomainExtensionResponseBody(Builder builder) {
        this.domainExtensionId = builder.domainExtensionId;
        this.listenerPort = builder.listenerPort;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainExtensionResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainExtensionId; 
        private Integer listenerPort; 
        private String requestId; 

        /**
         * The ID of the created domain name extension.
         */
        public Builder domainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }

        /**
         * The frontend port used by the SLB instance.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDomainExtensionResponseBody build() {
            return new CreateDomainExtensionResponseBody(this);
        } 

    } 

}
