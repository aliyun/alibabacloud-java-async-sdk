// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link VodPackagingConfiguration} extends {@link TeaModel}
 *
 * <p>VodPackagingConfiguration</p>
 */
public class VodPackagingConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigurationName")
    private String configurationName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("PackageConfig")
    private VodPackagingConfig packageConfig;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    private VodPackagingConfiguration(Builder builder) {
        this.configurationName = builder.configurationName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.packageConfig = builder.packageConfig;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VodPackagingConfiguration create() {
        return builder().build();
    }

    /**
     * @return configurationName
     */
    public String getConfigurationName() {
        return this.configurationName;
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return packageConfig
     */
    public VodPackagingConfig getPackageConfig() {
        return this.packageConfig;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String configurationName; 
        private String createTime; 
        private String description; 
        private String groupName; 
        private VodPackagingConfig packageConfig; 
        private String protocol; 

        /**
         * ConfigurationName.
         */
        public Builder configurationName(String configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * PackageConfig.
         */
        public Builder packageConfig(VodPackagingConfig packageConfig) {
            this.packageConfig = packageConfig;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public VodPackagingConfiguration build() {
            return new VodPackagingConfiguration(this);
        } 

    } 

}
