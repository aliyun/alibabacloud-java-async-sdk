// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ApplicationConfigurationFile} extends {@link TeaModel}
 *
 * <p>ApplicationConfigurationFile</p>
 */
public class ApplicationConfigurationFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ConfigFileFormat")
    private String configFileFormat;

    @com.aliyun.core.annotation.NameInMap("ConfigFileGroup")
    private String configFileGroup;

    @com.aliyun.core.annotation.NameInMap("ConfigFileLink")
    private String configFileLink;

    @com.aliyun.core.annotation.NameInMap("ConfigFileMode")
    private String configFileMode;

    @com.aliyun.core.annotation.NameInMap("ConfigFileName")
    private String configFileName;

    @com.aliyun.core.annotation.NameInMap("ConfigFileOwner")
    private String configFileOwner;

    @com.aliyun.core.annotation.NameInMap("ConfigFilePath")
    private String configFilePath;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private ApplicationConfigurationFile(Builder builder) {
        this.applicationName = builder.applicationName;
        this.clusterId = builder.clusterId;
        this.configFileFormat = builder.configFileFormat;
        this.configFileGroup = builder.configFileGroup;
        this.configFileLink = builder.configFileLink;
        this.configFileMode = builder.configFileMode;
        this.configFileName = builder.configFileName;
        this.configFileOwner = builder.configFileOwner;
        this.configFilePath = builder.configFilePath;
        this.description = builder.description;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplicationConfigurationFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configFileFormat
     */
    public String getConfigFileFormat() {
        return this.configFileFormat;
    }

    /**
     * @return configFileGroup
     */
    public String getConfigFileGroup() {
        return this.configFileGroup;
    }

    /**
     * @return configFileLink
     */
    public String getConfigFileLink() {
        return this.configFileLink;
    }

    /**
     * @return configFileMode
     */
    public String getConfigFileMode() {
        return this.configFileMode;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    /**
     * @return configFileOwner
     */
    public String getConfigFileOwner() {
        return this.configFileOwner;
    }

    /**
     * @return configFilePath
     */
    public String getConfigFilePath() {
        return this.configFilePath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder {
        private String applicationName; 
        private String clusterId; 
        private String configFileFormat; 
        private String configFileGroup; 
        private String configFileLink; 
        private String configFileMode; 
        private String configFileName; 
        private String configFileOwner; 
        private String configFilePath; 
        private String description; 
        private String nodeGroupId; 
        private String nodeId; 

        private Builder() {
        } 

        private Builder(ApplicationConfigurationFile model) {
            this.applicationName = model.applicationName;
            this.clusterId = model.clusterId;
            this.configFileFormat = model.configFileFormat;
            this.configFileGroup = model.configFileGroup;
            this.configFileLink = model.configFileLink;
            this.configFileMode = model.configFileMode;
            this.configFileName = model.configFileName;
            this.configFileOwner = model.configFileOwner;
            this.configFilePath = model.configFilePath;
            this.description = model.description;
            this.nodeGroupId = model.nodeGroupId;
            this.nodeId = model.nodeId;
        } 

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ConfigFileFormat.
         */
        public Builder configFileFormat(String configFileFormat) {
            this.configFileFormat = configFileFormat;
            return this;
        }

        /**
         * ConfigFileGroup.
         */
        public Builder configFileGroup(String configFileGroup) {
            this.configFileGroup = configFileGroup;
            return this;
        }

        /**
         * ConfigFileLink.
         */
        public Builder configFileLink(String configFileLink) {
            this.configFileLink = configFileLink;
            return this;
        }

        /**
         * ConfigFileMode.
         */
        public Builder configFileMode(String configFileMode) {
            this.configFileMode = configFileMode;
            return this;
        }

        /**
         * ConfigFileName.
         */
        public Builder configFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }

        /**
         * ConfigFileOwner.
         */
        public Builder configFileOwner(String configFileOwner) {
            this.configFileOwner = configFileOwner;
            return this;
        }

        /**
         * ConfigFilePath.
         */
        public Builder configFilePath(String configFilePath) {
            this.configFilePath = configFilePath;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        public ApplicationConfigurationFile build() {
            return new ApplicationConfigurationFile(this);
        } 

    } 

}
