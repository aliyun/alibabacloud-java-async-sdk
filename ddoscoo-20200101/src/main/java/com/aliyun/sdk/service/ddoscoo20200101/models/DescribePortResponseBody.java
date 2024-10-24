// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePortResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortResponseBody</p>
 */
public class DescribePortResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    private java.util.List < NetworkRules> networkRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePortResponseBody(Builder builder) {
        this.networkRules = builder.networkRules;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkRules
     */
    public java.util.List < NetworkRules> getNetworkRules() {
        return this.networkRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < NetworkRules> networkRules; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>An array that consists of port forwarding rules.</p>
         */
        public Builder networkRules(java.util.List < NetworkRules> networkRules) {
            this.networkRules = networkRules;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of port forwarding rules returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePortResponseBody build() {
            return new DescribePortResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortResponseBody</p>
     */
    public static class NetworkRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendPort")
        private Integer backendPort;

        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("FrontendProtocol")
        private String frontendProtocol;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsAutoCreate")
        private Boolean isAutoCreate;

        @com.aliyun.core.annotation.NameInMap("RealServers")
        private java.util.List < String > realServers;

        private NetworkRules(Builder builder) {
            this.backendPort = builder.backendPort;
            this.frontendPort = builder.frontendPort;
            this.frontendProtocol = builder.frontendProtocol;
            this.instanceId = builder.instanceId;
            this.isAutoCreate = builder.isAutoCreate;
            this.realServers = builder.realServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkRules create() {
            return builder().build();
        }

        /**
         * @return backendPort
         */
        public Integer getBackendPort() {
            return this.backendPort;
        }

        /**
         * @return frontendPort
         */
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        /**
         * @return frontendProtocol
         */
        public String getFrontendProtocol() {
            return this.frontendProtocol;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isAutoCreate
         */
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        /**
         * @return realServers
         */
        public java.util.List < String > getRealServers() {
            return this.realServers;
        }

        public static final class Builder {
            private Integer backendPort; 
            private Integer frontendPort; 
            private String frontendProtocol; 
            private String instanceId; 
            private Boolean isAutoCreate; 
            private java.util.List < String > realServers; 

            /**
             * <p>The port of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * <p>The forwarding port.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder frontendProtocol(String frontendProtocol) {
                this.frontendProtocol = frontendProtocol;
                return this;
            }

            /**
             * <p>The ID of the instance to which the port forwarding rule is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-7e225i41****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the port forwarding rule is automatically created by the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAutoCreate(Boolean isAutoCreate) {
                this.isAutoCreate = isAutoCreate;
                return this;
            }

            /**
             * <p>An array that consists of IP addresses of origin servers.</p>
             */
            public Builder realServers(java.util.List < String > realServers) {
                this.realServers = realServers;
                return this;
            }

            public NetworkRules build() {
                return new NetworkRules(this);
            } 

        } 

    }
}
