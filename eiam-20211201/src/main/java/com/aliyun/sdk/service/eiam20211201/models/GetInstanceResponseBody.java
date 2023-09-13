// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    private Instance instance;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        /**
         * The details of the instance.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class DefaultEndpoint extends TeaModel {
        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Status")
        private String status;

        private DefaultEndpoint(Builder builder) {
            this.endpoint = builder.endpoint;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultEndpoint create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String endpoint; 
            private String status; 

            /**
             * The endpoint of the instance.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The status of the endpoint. Valid values:
             * <p>
             * 
             * *   resolved
             * *   unresolved
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DefaultEndpoint build() {
                return new DefaultEndpoint(this);
            } 

        } 

    }
    public static class DomainConfig extends TeaModel {
        @NameInMap("DefaultDomain")
        private String defaultDomain;

        @NameInMap("InitDomain")
        private String initDomain;

        @NameInMap("InitDomainAutoRedirectStatus")
        private String initDomainAutoRedirectStatus;

        private DomainConfig(Builder builder) {
            this.defaultDomain = builder.defaultDomain;
            this.initDomain = builder.initDomain;
            this.initDomainAutoRedirectStatus = builder.initDomainAutoRedirectStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfig create() {
            return builder().build();
        }

        /**
         * @return defaultDomain
         */
        public String getDefaultDomain() {
            return this.defaultDomain;
        }

        /**
         * @return initDomain
         */
        public String getInitDomain() {
            return this.initDomain;
        }

        /**
         * @return initDomainAutoRedirectStatus
         */
        public String getInitDomainAutoRedirectStatus() {
            return this.initDomainAutoRedirectStatus;
        }

        public static final class Builder {
            private String defaultDomain; 
            private String initDomain; 
            private String initDomainAutoRedirectStatus; 

            /**
             * The default domain of the instance.
             */
            public Builder defaultDomain(String defaultDomain) {
                this.defaultDomain = defaultDomain;
                return this;
            }

            /**
             * The init domain of the instance.
             */
            public Builder initDomain(String initDomain) {
                this.initDomain = initDomain;
                return this;
            }

            /**
             * Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder initDomainAutoRedirectStatus(String initDomainAutoRedirectStatus) {
                this.initDomainAutoRedirectStatus = initDomainAutoRedirectStatus;
                return this;
            }

            public DomainConfig build() {
                return new DomainConfig(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DefaultEndpoint")
        private DefaultEndpoint defaultEndpoint;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainConfig")
        private DomainConfig domainConfig;

        @NameInMap("EgressAddresses")
        private java.util.List < String > egressAddresses;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private Instance(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultEndpoint = builder.defaultEndpoint;
            this.description = builder.description;
            this.domainConfig = builder.domainConfig;
            this.egressAddresses = builder.egressAddresses;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultEndpoint
         */
        public DefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainConfig
         */
        public DomainConfig getDomainConfig() {
            return this.domainConfig;
        }

        /**
         * @return egressAddresses
         */
        public java.util.List < String > getEgressAddresses() {
            return this.egressAddresses;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private DefaultEndpoint defaultEndpoint; 
            private String description; 
            private DomainConfig domainConfig; 
            private java.util.List < String > egressAddresses; 
            private String instanceId; 
            private String status; 

            /**
             * The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The default endpoint of the instance.
             */
            public Builder defaultEndpoint(DefaultEndpoint defaultEndpoint) {
                this.defaultEndpoint = defaultEndpoint;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The default domain of the instance.
             */
            public Builder domainConfig(DomainConfig domainConfig) {
                this.domainConfig = domainConfig;
                return this;
            }

            /**
             * The outbound public CIDR blocks of the instance. For example, when you synchronize Active Directory (AD) accounts, the IDaaS EIAM instance accesses your AD service by using the outbound public CIDR blocks.
             */
            public Builder egressAddresses(java.util.List < String > egressAddresses) {
                this.egressAddresses = egressAddresses;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   creating
             * *   running
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
