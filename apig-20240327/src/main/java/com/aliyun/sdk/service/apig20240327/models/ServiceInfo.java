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
 * {@link ServiceInfo} extends {@link TeaModel}
 *
 * <p>ServiceInfo</p>
 */
public class ServiceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expressType")
    private String expressType;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("paiWorkspaceId")
    private String paiWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("paiWorkspaceName")
    private String paiWorkspaceName;

    @com.aliyun.core.annotation.NameInMap("ports")
    private java.util.List<Ports> ports;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("versions")
    private java.util.List<Versions> versions;

    private ServiceInfo(Builder builder) {
        this.expressType = builder.expressType;
        this.groupName = builder.groupName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.paiWorkspaceId = builder.paiWorkspaceId;
        this.paiWorkspaceName = builder.paiWorkspaceName;
        this.ports = builder.ports;
        this.qualifier = builder.qualifier;
        this.serviceId = builder.serviceId;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressType
     */
    public String getExpressType() {
        return this.expressType;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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
     * @return paiWorkspaceId
     */
    public String getPaiWorkspaceId() {
        return this.paiWorkspaceId;
    }

    /**
     * @return paiWorkspaceName
     */
    public String getPaiWorkspaceName() {
        return this.paiWorkspaceName;
    }

    /**
     * @return ports
     */
    public java.util.List<Ports> getPorts() {
        return this.ports;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String expressType; 
        private String groupName; 
        private String name; 
        private String namespace; 
        private String paiWorkspaceId; 
        private String paiWorkspaceName; 
        private java.util.List<Ports> ports; 
        private String qualifier; 
        private String serviceId; 
        private String sourceType; 
        private String status; 
        private java.util.List<Versions> versions; 

        private Builder() {
        } 

        private Builder(ServiceInfo model) {
            this.expressType = model.expressType;
            this.groupName = model.groupName;
            this.name = model.name;
            this.namespace = model.namespace;
            this.paiWorkspaceId = model.paiWorkspaceId;
            this.paiWorkspaceName = model.paiWorkspaceName;
            this.ports = model.ports;
            this.qualifier = model.qualifier;
            this.serviceId = model.serviceId;
            this.sourceType = model.sourceType;
            this.status = model.status;
            this.versions = model.versions;
        } 

        /**
         * expressType.
         */
        public Builder expressType(String expressType) {
            this.expressType = expressType;
            return this;
        }

        /**
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
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
         * paiWorkspaceId.
         */
        public Builder paiWorkspaceId(String paiWorkspaceId) {
            this.paiWorkspaceId = paiWorkspaceId;
            return this;
        }

        /**
         * paiWorkspaceName.
         */
        public Builder paiWorkspaceName(String paiWorkspaceName) {
            this.paiWorkspaceName = paiWorkspaceName;
            return this;
        }

        /**
         * ports.
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
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
         * versions.
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ServiceInfo build() {
            return new ServiceInfo(this);
        } 

    } 

    /**
     * 
     * {@link ServiceInfo} extends {@link TeaModel}
     *
     * <p>ServiceInfo</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String name; 
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.name = model.name;
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ServiceInfo} extends {@link TeaModel}
     *
     * <p>ServiceInfo</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ServiceInfo} extends {@link TeaModel}
     *
     * <p>ServiceInfo</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Versions(Builder builder) {
            this.labels = builder.labels;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Labels> labels; 
            private String name; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.labels = model.labels;
                this.name = model.name;
            } 

            /**
             * labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
