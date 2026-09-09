// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link ConnectorInfo} extends {@link TeaModel}
 *
 * <p>ConnectorInfo</p>
 */
public class ConnectorInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authentication")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConnectorAuthentication authentication;

    @com.aliyun.core.annotation.NameInMap("capabilityGrants")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> capabilityGrants;

    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> configuration;

    @com.aliyun.core.annotation.NameInMap("connectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("etag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String etag;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> policy;

    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.NameInMap("revision")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long revision;

    @com.aliyun.core.annotation.NameInMap("runtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConnectorRuntime runtime;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> status;

    @com.aliyun.core.annotation.NameInMap("target")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> target;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateTime;

    private ConnectorInfo(Builder builder) {
        this.authentication = builder.authentication;
        this.capabilityGrants = builder.capabilityGrants;
        this.configuration = builder.configuration;
        this.connectorName = builder.connectorName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.etag = builder.etag;
        this.name = builder.name;
        this.policy = builder.policy;
        this.provider = builder.provider;
        this.revision = builder.revision;
        this.runtime = builder.runtime;
        this.status = builder.status;
        this.target = builder.target;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authentication
     */
    public ConnectorAuthentication getAuthentication() {
        return this.authentication;
    }

    /**
     * @return capabilityGrants
     */
    public java.util.List<java.util.Map<String, ?>> getCapabilityGrants() {
        return this.capabilityGrants;
    }

    /**
     * @return configuration
     */
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return etag
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return revision
     */
    public Long getRevision() {
        return this.revision;
    }

    /**
     * @return runtime
     */
    public ConnectorRuntime getRuntime() {
        return this.runtime;
    }

    /**
     * @return status
     */
    public java.util.Map<String, ?> getStatus() {
        return this.status;
    }

    /**
     * @return target
     */
    public java.util.Map<String, ?> getTarget() {
        return this.target;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private ConnectorAuthentication authentication; 
        private java.util.List<java.util.Map<String, ?>> capabilityGrants; 
        private java.util.Map<String, ?> configuration; 
        private String connectorName; 
        private String createTime; 
        private String description; 
        private String displayName; 
        private Boolean enabled; 
        private String etag; 
        private String name; 
        private java.util.Map<String, ?> policy; 
        private String provider; 
        private Long revision; 
        private ConnectorRuntime runtime; 
        private java.util.Map<String, ?> status; 
        private java.util.Map<String, ?> target; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(ConnectorInfo model) {
            this.authentication = model.authentication;
            this.capabilityGrants = model.capabilityGrants;
            this.configuration = model.configuration;
            this.connectorName = model.connectorName;
            this.createTime = model.createTime;
            this.description = model.description;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.etag = model.etag;
            this.name = model.name;
            this.policy = model.policy;
            this.provider = model.provider;
            this.revision = model.revision;
            this.runtime = model.runtime;
            this.status = model.status;
            this.target = model.target;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Safe authentication identity</p>
         * <p>This parameter is required.</p>
         */
        public Builder authentication(ConnectorAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * <p>The list of capabilities granted to the Connector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capabilityGrants(java.util.List<java.util.Map<String, ?>> capabilityGrants) {
            this.capabilityGrants = capabilityGrants;
            return this;
        }

        /**
         * <p>Provider configuration</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>Connector name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cms2-prod</p>
         */
        public Builder connectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        /**
         * <p>Creation time</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25T12:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>Production observability data</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Display name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CMS 2.0 production workspace</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Indicates whether the Connector is enabled.</p>
         * <p>This parameter is required.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>ETag</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;connector-rev-1&quot;</p>
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * <p>Digital employee name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>production-ops</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The execution policy of the Connector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder policy(java.util.Map<String, ?> policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Provider</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloudCms</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>Revision</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder revision(Long revision) {
            this.revision = revision;
            return this;
        }

        /**
         * <p>The runtime configuration of the Connector.</p>
         * <p>This parameter is required.</p>
         */
        public Builder runtime(ConnectorRuntime runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>Resource status</p>
         * <p>This parameter is required.</p>
         */
        public Builder status(java.util.Map<String, ?> status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Provider target</p>
         * <p>This parameter is required.</p>
         */
        public Builder target(java.util.Map<String, ?> target) {
            this.target = target;
            return this;
        }

        /**
         * <p>Update time</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25T12:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ConnectorInfo build() {
            return new ConnectorInfo(this);
        } 

    } 

}
