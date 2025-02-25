// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpRoute} extends {@link TeaModel}
 *
 * <p>HttpRoute</p>
 */
public class HttpRoute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backend")
    private Backend backend;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("deployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domainInfos")
    private java.util.List<DomainInfos> domainInfos;

    @com.aliyun.core.annotation.NameInMap("environmentInfo")
    private EnvironmentInfo environmentInfo;

    @com.aliyun.core.annotation.NameInMap("match")
    private HttpRouteMatch match;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private HttpRoute(Builder builder) {
        this.backend = builder.backend;
        this.createTimestamp = builder.createTimestamp;
        this.deployStatus = builder.deployStatus;
        this.description = builder.description;
        this.domainInfos = builder.domainInfos;
        this.environmentInfo = builder.environmentInfo;
        this.match = builder.match;
        this.name = builder.name;
        this.routeId = builder.routeId;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpRoute create() {
        return builder().build();
    }

    /**
     * @return backend
     */
    public Backend getBackend() {
        return this.backend;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainInfos
     */
    public java.util.List<DomainInfos> getDomainInfos() {
        return this.domainInfos;
    }

    /**
     * @return environmentInfo
     */
    public EnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    /**
     * @return match
     */
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private Backend backend; 
        private Long createTimestamp; 
        private String deployStatus; 
        private String description; 
        private java.util.List<DomainInfos> domainInfos; 
        private EnvironmentInfo environmentInfo; 
        private HttpRouteMatch match; 
        private String name; 
        private String routeId; 
        private Long updateTimestamp; 

        /**
         * backend.
         */
        public Builder backend(Backend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * deployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domainInfos.
         */
        public Builder domainInfos(java.util.List<DomainInfos> domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }

        /**
         * environmentInfo.
         */
        public Builder environmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }

        /**
         * match.
         */
        public Builder match(HttpRouteMatch match) {
            this.match = match;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * routeId.
         */
        public Builder routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public HttpRoute build() {
            return new HttpRoute(this);
        } 

    } 

    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class DomainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private DomainInfos(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfos create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String protocol; 

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public DomainInfos build() {
                return new DomainInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class GatewayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private GatewayInfo(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfo create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String gatewayId; 
            private String name; 

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GatewayInfo build() {
                return new GatewayInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class SubDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private SubDomains(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDomains create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String networkType; 
            private String protocol; 

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public SubDomains build() {
                return new SubDomains(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class EnvironmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("subDomains")
        private java.util.List<SubDomains> subDomains;

        private EnvironmentInfo(Builder builder) {
            this.alias = builder.alias;
            this.environmentId = builder.environmentId;
            this.gatewayInfo = builder.gatewayInfo;
            this.name = builder.name;
            this.subDomains = builder.subDomains;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentInfo create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subDomains
         */
        public java.util.List<SubDomains> getSubDomains() {
            return this.subDomains;
        }

        public static final class Builder {
            private String alias; 
            private String environmentId; 
            private GatewayInfo gatewayInfo; 
            private String name; 
            private java.util.List<SubDomains> subDomains; 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * gatewayInfo.
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * subDomains.
             */
            public Builder subDomains(java.util.List<SubDomains> subDomains) {
                this.subDomains = subDomains;
                return this;
            }

            public EnvironmentInfo build() {
                return new EnvironmentInfo(this);
            } 

        } 

    }
}
