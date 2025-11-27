// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListIntegrationPolicyCollectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationPolicyCollectorsResponseBody</p>
 */
public class ListIntegrationPolicyCollectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("collectors")
    private java.util.List<Collectors> collectors;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListIntegrationPolicyCollectorsResponseBody(Builder builder) {
        this.collectors = builder.collectors;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyCollectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectors
     */
    public java.util.List<Collectors> getCollectors() {
        return this.collectors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Collectors> collectors; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListIntegrationPolicyCollectorsResponseBody model) {
            this.collectors = model.collectors;
            this.requestId = model.requestId;
        } 

        /**
         * collectors.
         */
        public Builder collectors(java.util.List<Collectors> collectors) {
            this.collectors = collectors;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegrationPolicyCollectorsResponseBody build() {
            return new ListIntegrationPolicyCollectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPolicyCollectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyCollectorsResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("firstTransitionTime")
        private String firstTransitionTime;

        @com.aliyun.core.annotation.NameInMap("lastTransitionTime")
        private String lastTransitionTime;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Conditions(Builder builder) {
            this.firstTransitionTime = builder.firstTransitionTime;
            this.lastTransitionTime = builder.lastTransitionTime;
            this.message = builder.message;
            this.reason = builder.reason;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return firstTransitionTime
         */
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        /**
         * @return lastTransitionTime
         */
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String firstTransitionTime; 
            private String lastTransitionTime; 
            private String message; 
            private String reason; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.firstTransitionTime = model.firstTransitionTime;
                this.lastTransitionTime = model.lastTransitionTime;
                this.message = model.message;
                this.reason = model.reason;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * firstTransitionTime.
             */
            public Builder firstTransitionTime(String firstTransitionTime) {
                this.firstTransitionTime = firstTransitionTime;
                return this;
            }

            /**
             * lastTransitionTime.
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyCollectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyCollectorsResponseBody</p>
     */
    public static class ManagedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        private ManagedInfo(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedInfo create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(ManagedInfo model) {
                this.securityGroupId = model.securityGroupId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public ManagedInfo build() {
                return new ManagedInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyCollectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyCollectorsResponseBody</p>
     */
    public static class Workloads extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("managed")
        private Boolean managed;

        @com.aliyun.core.annotation.NameInMap("managedInfo")
        private ManagedInfo managedInfo;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ownerReferenceKind")
        private String ownerReferenceKind;

        @com.aliyun.core.annotation.NameInMap("ownerReferenceName")
        private String ownerReferenceName;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Workloads(Builder builder) {
            this.hostIp = builder.hostIp;
            this.ip = builder.ip;
            this.managed = builder.managed;
            this.managedInfo = builder.managedInfo;
            this.message = builder.message;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.ownerReferenceKind = builder.ownerReferenceKind;
            this.ownerReferenceName = builder.ownerReferenceName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workloads create() {
            return builder().build();
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return managed
         */
        public Boolean getManaged() {
            return this.managed;
        }

        /**
         * @return managedInfo
         */
        public ManagedInfo getManagedInfo() {
            return this.managedInfo;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ownerReferenceKind
         */
        public String getOwnerReferenceKind() {
            return this.ownerReferenceKind;
        }

        /**
         * @return ownerReferenceName
         */
        public String getOwnerReferenceName() {
            return this.ownerReferenceName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String hostIp; 
            private String ip; 
            private Boolean managed; 
            private ManagedInfo managedInfo; 
            private String message; 
            private String name; 
            private String namespace; 
            private String ownerReferenceKind; 
            private String ownerReferenceName; 
            private String startTime; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Workloads model) {
                this.hostIp = model.hostIp;
                this.ip = model.ip;
                this.managed = model.managed;
                this.managedInfo = model.managedInfo;
                this.message = model.message;
                this.name = model.name;
                this.namespace = model.namespace;
                this.ownerReferenceKind = model.ownerReferenceKind;
                this.ownerReferenceName = model.ownerReferenceName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * hostIp.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * managed.
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * managedInfo.
             */
            public Builder managedInfo(ManagedInfo managedInfo) {
                this.managedInfo = managedInfo;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ownerReferenceKind.
             */
            public Builder ownerReferenceKind(String ownerReferenceKind) {
                this.ownerReferenceKind = ownerReferenceKind;
                return this;
            }

            /**
             * ownerReferenceName.
             */
            public Builder ownerReferenceName(String ownerReferenceName) {
                this.ownerReferenceName = ownerReferenceName;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Workloads build() {
                return new Workloads(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyCollectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyCollectorsResponseBody</p>
     */
    public static class Collectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addonMeta")
        private AddonMeta addonMeta;

        @com.aliyun.core.annotation.NameInMap("collectorName")
        private String collectorName;

        @com.aliyun.core.annotation.NameInMap("collectorType")
        private String collectorType;

        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("managed")
        private Boolean managed;

        @com.aliyun.core.annotation.NameInMap("releaseName")
        private String releaseName;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workloads")
        private java.util.List<Workloads> workloads;

        private Collectors(Builder builder) {
            this.addonMeta = builder.addonMeta;
            this.collectorName = builder.collectorName;
            this.collectorType = builder.collectorType;
            this.conditions = builder.conditions;
            this.managed = builder.managed;
            this.releaseName = builder.releaseName;
            this.state = builder.state;
            this.version = builder.version;
            this.workloads = builder.workloads;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Collectors create() {
            return builder().build();
        }

        /**
         * @return addonMeta
         */
        public AddonMeta getAddonMeta() {
            return this.addonMeta;
        }

        /**
         * @return collectorName
         */
        public String getCollectorName() {
            return this.collectorName;
        }

        /**
         * @return collectorType
         */
        public String getCollectorType() {
            return this.collectorType;
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return managed
         */
        public Boolean getManaged() {
            return this.managed;
        }

        /**
         * @return releaseName
         */
        public String getReleaseName() {
            return this.releaseName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workloads
         */
        public java.util.List<Workloads> getWorkloads() {
            return this.workloads;
        }

        public static final class Builder {
            private AddonMeta addonMeta; 
            private String collectorName; 
            private String collectorType; 
            private java.util.List<Conditions> conditions; 
            private Boolean managed; 
            private String releaseName; 
            private String state; 
            private String version; 
            private java.util.List<Workloads> workloads; 

            private Builder() {
            } 

            private Builder(Collectors model) {
                this.addonMeta = model.addonMeta;
                this.collectorName = model.collectorName;
                this.collectorType = model.collectorType;
                this.conditions = model.conditions;
                this.managed = model.managed;
                this.releaseName = model.releaseName;
                this.state = model.state;
                this.version = model.version;
                this.workloads = model.workloads;
            } 

            /**
             * addonMeta.
             */
            public Builder addonMeta(AddonMeta addonMeta) {
                this.addonMeta = addonMeta;
                return this;
            }

            /**
             * collectorName.
             */
            public Builder collectorName(String collectorName) {
                this.collectorName = collectorName;
                return this;
            }

            /**
             * collectorType.
             */
            public Builder collectorType(String collectorType) {
                this.collectorType = collectorType;
                return this;
            }

            /**
             * conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * managed.
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * releaseName.
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * workloads.
             */
            public Builder workloads(java.util.List<Workloads> workloads) {
                this.workloads = workloads;
                return this;
            }

            public Collectors build() {
                return new Collectors(this);
            } 

        } 

    }
}
