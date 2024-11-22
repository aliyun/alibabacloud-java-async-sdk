// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEdgeContainerTerminalResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerTerminalResponseBody</p>
 */
public class GetEdgeContainerTerminalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private String cluster;

    @com.aliyun.core.annotation.NameInMap("Container")
    private String container;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("Pod")
    private String pod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetEdgeContainerTerminalResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.container = builder.container;
        this.namespace = builder.namespace;
        this.pod = builder.pod;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerTerminalResponseBody create() {
        return builder().build();
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return this.cluster;
    }

    /**
     * @return container
     */
    public String getContainer() {
        return this.container;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pod
     */
    public String getPod() {
        return this.pod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String cluster; 
        private String container; 
        private String namespace; 
        private String pod; 
        private String requestId; 
        private String sessionId; 
        private String token; 

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>c497b44c2a59f4ae0bd2826edc40a2c6e</p>
         */
        public Builder cluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker0</p>
         */
        public Builder container(String container) {
            this.container = container;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>1775b9e0-8463-457e-89e8-fb7b6d125b2e</p>
         */
        public Builder pod(String pod) {
            this.pod = pod;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af22f4xxxxxxxxxxxxxxxxxx</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The information about the shared token.</p>
         * 
         * <strong>example:</strong>
         * <p>af22f4-xxxxx-xxxx-xxxx-xxxx</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public GetEdgeContainerTerminalResponseBody build() {
            return new GetEdgeContainerTerminalResponseBody(this);
        } 

    } 

}
