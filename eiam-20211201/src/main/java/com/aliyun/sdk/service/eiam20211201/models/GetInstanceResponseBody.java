// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.instance = model.instance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the instance.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class DefaultEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(DefaultEndpoint model) {
                this.endpoint = model.endpoint;
                this.status = model.status;
            } 

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>example-xxx.aliyunidaas.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The status of the endpoint. Valid values:</p>
             * <ul>
             * <li>resolved</li>
             * <li>unresolved</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>resolved</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class DomainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultDomain")
        private String defaultDomain;

        @com.aliyun.core.annotation.NameInMap("InitDomain")
        private String initDomain;

        @com.aliyun.core.annotation.NameInMap("InitDomainAutoRedirectStatus")
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

            private Builder() {
            } 

            private Builder(DomainConfig model) {
                this.defaultDomain = model.defaultDomain;
                this.initDomain = model.initDomain;
                this.initDomainAutoRedirectStatus = model.initDomainAutoRedirectStatus;
            } 

            /**
             * <p>The default domain of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>example-xxx.example.com</p>
             */
            public Builder defaultDomain(String defaultDomain) {
                this.defaultDomain = defaultDomain;
                return this;
            }

            /**
             * <p>The init domain of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>example-xxx.aliyunidaas.com</p>
             */
            public Builder initDomain(String initDomain) {
                this.initDomain = initDomain;
                return this;
            }

            /**
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class ReplicationConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupInstanceId")
        private String backupInstanceId;

        @com.aliyun.core.annotation.NameInMap("BackupInstanceRegionId")
        private String backupInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("PrimaryInstanceId")
        private String primaryInstanceId;

        @com.aliyun.core.annotation.NameInMap("PrimaryInstanceRegionId")
        private String primaryInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationCreateTime")
        private Long replicationCreateTime;

        private ReplicationConfiguration(Builder builder) {
            this.backupInstanceId = builder.backupInstanceId;
            this.backupInstanceRegionId = builder.backupInstanceRegionId;
            this.primaryInstanceId = builder.primaryInstanceId;
            this.primaryInstanceRegionId = builder.primaryInstanceRegionId;
            this.replicationCreateTime = builder.replicationCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationConfiguration create() {
            return builder().build();
        }

        /**
         * @return backupInstanceId
         */
        public String getBackupInstanceId() {
            return this.backupInstanceId;
        }

        /**
         * @return backupInstanceRegionId
         */
        public String getBackupInstanceRegionId() {
            return this.backupInstanceRegionId;
        }

        /**
         * @return primaryInstanceId
         */
        public String getPrimaryInstanceId() {
            return this.primaryInstanceId;
        }

        /**
         * @return primaryInstanceRegionId
         */
        public String getPrimaryInstanceRegionId() {
            return this.primaryInstanceRegionId;
        }

        /**
         * @return replicationCreateTime
         */
        public Long getReplicationCreateTime() {
            return this.replicationCreateTime;
        }

        public static final class Builder {
            private String backupInstanceId; 
            private String backupInstanceRegionId; 
            private String primaryInstanceId; 
            private String primaryInstanceRegionId; 
            private Long replicationCreateTime; 

            private Builder() {
            } 

            private Builder(ReplicationConfiguration model) {
                this.backupInstanceId = model.backupInstanceId;
                this.backupInstanceRegionId = model.backupInstanceRegionId;
                this.primaryInstanceId = model.primaryInstanceId;
                this.primaryInstanceRegionId = model.primaryInstanceRegionId;
                this.replicationCreateTime = model.replicationCreateTime;
            } 

            /**
             * BackupInstanceId.
             */
            public Builder backupInstanceId(String backupInstanceId) {
                this.backupInstanceId = backupInstanceId;
                return this;
            }

            /**
             * BackupInstanceRegionId.
             */
            public Builder backupInstanceRegionId(String backupInstanceRegionId) {
                this.backupInstanceRegionId = backupInstanceRegionId;
                return this;
            }

            /**
             * PrimaryInstanceId.
             */
            public Builder primaryInstanceId(String primaryInstanceId) {
                this.primaryInstanceId = primaryInstanceId;
                return this;
            }

            /**
             * PrimaryInstanceRegionId.
             */
            public Builder primaryInstanceRegionId(String primaryInstanceRegionId) {
                this.primaryInstanceRegionId = primaryInstanceRegionId;
                return this;
            }

            /**
             * ReplicationCreateTime.
             */
            public Builder replicationCreateTime(Long replicationCreateTime) {
                this.replicationCreateTime = replicationCreateTime;
                return this;
            }

            public ReplicationConfiguration build() {
                return new ReplicationConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossRegionReplication")
        private String crossRegionReplication;

        @com.aliyun.core.annotation.NameInMap("CrossRegionReplicationRole")
        private String crossRegionReplicationRole;

        @com.aliyun.core.annotation.NameInMap("DefaultEndpoint")
        private DefaultEndpoint defaultEndpoint;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainConfig")
        private DomainConfig domainConfig;

        @com.aliyun.core.annotation.NameInMap("EgressAddresses")
        private java.util.List<String> egressAddresses;

        @com.aliyun.core.annotation.NameInMap("InstanceFailoverStatus")
        private String instanceFailoverStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ManagedServiceCode")
        private String managedServiceCode;

        @com.aliyun.core.annotation.NameInMap("ReplicationConfiguration")
        private ReplicationConfiguration replicationConfiguration;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Instance(Builder builder) {
            this.createTime = builder.createTime;
            this.crossRegionReplication = builder.crossRegionReplication;
            this.crossRegionReplicationRole = builder.crossRegionReplicationRole;
            this.defaultEndpoint = builder.defaultEndpoint;
            this.description = builder.description;
            this.domainConfig = builder.domainConfig;
            this.egressAddresses = builder.egressAddresses;
            this.instanceFailoverStatus = builder.instanceFailoverStatus;
            this.instanceId = builder.instanceId;
            this.managedServiceCode = builder.managedServiceCode;
            this.replicationConfiguration = builder.replicationConfiguration;
            this.serviceManaged = builder.serviceManaged;
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
         * @return crossRegionReplication
         */
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        /**
         * @return crossRegionReplicationRole
         */
        public String getCrossRegionReplicationRole() {
            return this.crossRegionReplicationRole;
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
        public java.util.List<String> getEgressAddresses() {
            return this.egressAddresses;
        }

        /**
         * @return instanceFailoverStatus
         */
        public String getInstanceFailoverStatus() {
            return this.instanceFailoverStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return managedServiceCode
         */
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        /**
         * @return replicationConfiguration
         */
        public ReplicationConfiguration getReplicationConfiguration() {
            return this.replicationConfiguration;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private String crossRegionReplication; 
            private String crossRegionReplicationRole; 
            private DefaultEndpoint defaultEndpoint; 
            private String description; 
            private DomainConfig domainConfig; 
            private java.util.List<String> egressAddresses; 
            private String instanceFailoverStatus; 
            private String instanceId; 
            private String managedServiceCode; 
            private ReplicationConfiguration replicationConfiguration; 
            private Boolean serviceManaged; 
            private String status; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.createTime = model.createTime;
                this.crossRegionReplication = model.crossRegionReplication;
                this.crossRegionReplicationRole = model.crossRegionReplicationRole;
                this.defaultEndpoint = model.defaultEndpoint;
                this.description = model.description;
                this.domainConfig = model.domainConfig;
                this.egressAddresses = model.egressAddresses;
                this.instanceFailoverStatus = model.instanceFailoverStatus;
                this.instanceId = model.instanceId;
                this.managedServiceCode = model.managedServiceCode;
                this.replicationConfiguration = model.replicationConfiguration;
                this.serviceManaged = model.serviceManaged;
                this.status = model.status;
            } 

            /**
             * <p>The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1550115455000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CrossRegionReplication.
             */
            public Builder crossRegionReplication(String crossRegionReplication) {
                this.crossRegionReplication = crossRegionReplication;
                return this;
            }

            /**
             * CrossRegionReplicationRole.
             */
            public Builder crossRegionReplicationRole(String crossRegionReplicationRole) {
                this.crossRegionReplicationRole = crossRegionReplicationRole;
                return this;
            }

            /**
             * <p>The default endpoint of the instance.</p>
             */
            public Builder defaultEndpoint(DefaultEndpoint defaultEndpoint) {
                this.defaultEndpoint = defaultEndpoint;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The default domain of the instance.</p>
             */
            public Builder domainConfig(DomainConfig domainConfig) {
                this.domainConfig = domainConfig;
                return this;
            }

            /**
             * <p>The outbound public CIDR blocks of the instance. For example, when you synchronize Active Directory (AD) accounts, the IDaaS EIAM instance accesses your AD service by using the outbound public CIDR blocks.</p>
             */
            public Builder egressAddresses(java.util.List<String> egressAddresses) {
                this.egressAddresses = egressAddresses;
                return this;
            }

            /**
             * InstanceFailoverStatus.
             */
            public Builder instanceFailoverStatus(String instanceFailoverStatus) {
                this.instanceFailoverStatus = instanceFailoverStatus;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_abt3pfwojojcq323si6g5xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ManagedServiceCode.
             */
            public Builder managedServiceCode(String managedServiceCode) {
                this.managedServiceCode = managedServiceCode;
                return this;
            }

            /**
             * ReplicationConfiguration.
             */
            public Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration) {
                this.replicationConfiguration = replicationConfiguration;
                return this;
            }

            /**
             * ServiceManaged.
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>creating</li>
             * <li>running</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
