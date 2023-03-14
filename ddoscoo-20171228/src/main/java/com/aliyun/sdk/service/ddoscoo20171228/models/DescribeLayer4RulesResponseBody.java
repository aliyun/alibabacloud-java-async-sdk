// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RulesResponseBody</p>
 */
public class DescribeLayer4RulesResponseBody extends TeaModel {
    @NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeLayer4RulesResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Listeners> listeners; 
        private String requestId; 
        private Long total; 

        /**
         * Listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeLayer4RulesResponseBody build() {
            return new DescribeLayer4RulesResponseBody(this);
        } 

    } 

    public static class Listeners extends TeaModel {
        @NameInMap("BackendPort")
        private Integer backendPort;

        @NameInMap("BakMode")
        private Integer bakMode;

        @NameInMap("CurrentIndex")
        private Integer currentIndex;

        @NameInMap("Eip")
        private String eip;

        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IsAutoCreate")
        private Boolean isAutoCreate;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServers")
        private java.util.List < String > realServers;

        @NameInMap("Remark")
        private String remark;

        private Listeners(Builder builder) {
            this.backendPort = builder.backendPort;
            this.bakMode = builder.bakMode;
            this.currentIndex = builder.currentIndex;
            this.eip = builder.eip;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.isAutoCreate = builder.isAutoCreate;
            this.protocol = builder.protocol;
            this.realServers = builder.realServers;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return backendPort
         */
        public Integer getBackendPort() {
            return this.backendPort;
        }

        /**
         * @return bakMode
         */
        public Integer getBakMode() {
            return this.bakMode;
        }

        /**
         * @return currentIndex
         */
        public Integer getCurrentIndex() {
            return this.currentIndex;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return frontendPort
         */
        public Integer getFrontendPort() {
            return this.frontendPort;
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
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return realServers
         */
        public java.util.List < String > getRealServers() {
            return this.realServers;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Integer backendPort; 
            private Integer bakMode; 
            private Integer currentIndex; 
            private String eip; 
            private Integer frontendPort; 
            private String instanceId; 
            private Boolean isAutoCreate; 
            private String protocol; 
            private java.util.List < String > realServers; 
            private String remark; 

            /**
             * BackendPort.
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * BakMode.
             */
            public Builder bakMode(Integer bakMode) {
                this.bakMode = bakMode;
                return this;
            }

            /**
             * CurrentIndex.
             */
            public Builder currentIndex(Integer currentIndex) {
                this.currentIndex = currentIndex;
                return this;
            }

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * FrontendPort.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsAutoCreate.
             */
            public Builder isAutoCreate(Boolean isAutoCreate) {
                this.isAutoCreate = isAutoCreate;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RealServers.
             */
            public Builder realServers(java.util.List < String > realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
