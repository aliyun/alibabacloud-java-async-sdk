// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplicationConfig} extends {@link TeaModel}
 *
 * <p>ApplicationConfig</p>
 */
public class ApplicationConfig extends TeaModel {
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @NameInMap("ConfigFileName")
    @Validation(required = true)
    private String configFileName;

    @NameInMap("ConfigItemKey")
    @Validation(required = true)
    private String configItemKey;

    @NameInMap("ConfigItemValue")
    private String configItemValue;

    @NameInMap("ConfigScope")
    private String configScope;

    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @NameInMap("NodeGroupName")
    private String nodeGroupName;

    private ApplicationConfig(Builder builder) {
        this.applicationName = builder.applicationName;
        this.configFileName = builder.configFileName;
        this.configItemKey = builder.configItemKey;
        this.configItemValue = builder.configItemValue;
        this.configScope = builder.configScope;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplicationConfig create() {
        return builder().build();
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    /**
     * @return configItemKey
     */
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    /**
     * @return configItemValue
     */
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    /**
     * @return configScope
     */
    public String getConfigScope() {
        return this.configScope;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public static final class Builder {
        private String applicationName; 
        private String configFileName; 
        private String configItemKey; 
        private String configItemValue; 
        private String configScope; 
        private String nodeGroupId; 
        private String nodeGroupName; 

        /**
         * 应用名称。从EMR控制台集群创建页面可查看到指定发行版的应用名称列表。
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * 应用配置文件名。
         */
        public Builder configFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }

        /**
         * 配置项键。
         */
        public Builder configItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * 配置项值。
         */
        public Builder configItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }

        /**
         * 配置范围。取值范围：
         * <p>
         * - CLUSTER：集群级别。
         * - NODE_GROUP：节点组级别。
         * 
         * 默认值：CLUSTER。
         */
        public Builder configScope(String configScope) {
            this.configScope = configScope;
            return this;
        }

        /**
         * 节点组ID。ConfigScope取值NODE_GROUP时，该参数生效。NodeGroupId参数优先级高于NodeGroupName。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点组名称。ConfigScope取值NODE_GROUP时，且参数NodeGroupId为空时生效，该参数生效。
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        public ApplicationConfig build() {
            return new ApplicationConfig(this);
        } 

    } 

}
