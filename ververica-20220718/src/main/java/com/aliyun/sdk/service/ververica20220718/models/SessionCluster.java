// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link SessionCluster} extends {@link TeaModel}
 *
 * <p>SessionCluster</p>
 */
public class SessionCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("basicResourceSetting")
    private BasicResourceSetting basicResourceSetting;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("deploymentTargetName")
    private String deploymentTargetName;

    @com.aliyun.core.annotation.NameInMap("engineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("flinkConf")
    private java.util.Map<String, ?> flinkConf;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.NameInMap("logging")
    private Logging logging;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private Long modifiedAt;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    @com.aliyun.core.annotation.NameInMap("status")
    private SessionClusterStatus status;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private SessionCluster(Builder builder) {
        this.basicResourceSetting = builder.basicResourceSetting;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.deploymentTargetName = builder.deploymentTargetName;
        this.engineVersion = builder.engineVersion;
        this.flinkConf = builder.flinkConf;
        this.labels = builder.labels;
        this.logging = builder.logging;
        this.modifiedAt = builder.modifiedAt;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.sessionClusterId = builder.sessionClusterId;
        this.status = builder.status;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SessionCluster create() {
        return builder().build();
    }

    /**
     * @return basicResourceSetting
     */
    public BasicResourceSetting getBasicResourceSetting() {
        return this.basicResourceSetting;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return deploymentTargetName
     */
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return flinkConf
     */
    public java.util.Map<String, ?> getFlinkConf() {
        return this.flinkConf;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return logging
     */
    public Logging getLogging() {
        return this.logging;
    }

    /**
     * @return modifiedAt
     */
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return modifierName
     */
    public String getModifierName() {
        return this.modifierName;
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
     * @return sessionClusterId
     */
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    /**
     * @return status
     */
    public SessionClusterStatus getStatus() {
        return this.status;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private BasicResourceSetting basicResourceSetting; 
        private Long createdAt; 
        private String creator; 
        private String creatorName; 
        private String deploymentTargetName; 
        private String engineVersion; 
        private java.util.Map<String, ?> flinkConf; 
        private java.util.Map<String, ?> labels; 
        private Logging logging; 
        private Long modifiedAt; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String namespace; 
        private String sessionClusterId; 
        private SessionClusterStatus status; 
        private String workspace; 

        /**
         * basicResourceSetting.
         */
        public Builder basicResourceSetting(BasicResourceSetting basicResourceSetting) {
            this.basicResourceSetting = basicResourceSetting;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * deploymentTargetName.
         */
        public Builder deploymentTargetName(String deploymentTargetName) {
            this.deploymentTargetName = deploymentTargetName;
            return this;
        }

        /**
         * engineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * flinkConf.
         */
        public Builder flinkConf(java.util.Map<String, ?> flinkConf) {
            this.flinkConf = flinkConf;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * logging.
         */
        public Builder logging(Logging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * modifiedAt.
         */
        public Builder modifiedAt(Long modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * modifierName.
         */
        public Builder modifierName(String modifierName) {
            this.modifierName = modifierName;
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
         * sessionClusterId.
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.sessionClusterId = sessionClusterId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(SessionClusterStatus status) {
            this.status = status;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public SessionCluster build() {
            return new SessionCluster(this);
        } 

    } 

}
