// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplicationConfig} extends {@link TeaModel}
 *
 * <p>ApplicationConfig</p>
 */
public class ApplicationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("ConfigFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configFileName;

    @com.aliyun.core.annotation.NameInMap("ConfigItemKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configItemKey;

    @com.aliyun.core.annotation.NameInMap("ConfigItemValue")
    private String configItemValue;

    @com.aliyun.core.annotation.NameInMap("ConfigScope")
    private String configScope;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
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
         * <p>应用名称。从EMR控制台集群创建页面可查看到指定发行版的应用名称列表。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>应用配置文件名。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs-site.xml</p>
         */
        public Builder configFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }

        /**
         * <p>配置项键。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dfs.namenode.checkpoint.period</p>
         */
        public Builder configItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * <p>配置项值。</p>
         * 
         * <strong>example:</strong>
         * <p>3600s</p>
         */
        public Builder configItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }

        /**
         * <p>配置范围。取值范围：</p>
         * <ul>
         * <li>CLUSTER：集群级别。</li>
         * <li>NODE_GROUP：节点组级别。</li>
         * </ul>
         * <p>默认值：CLUSTER。</p>
         * 
         * <strong>example:</strong>
         * <p>NODE_GROUP</p>
         */
        public Builder configScope(String configScope) {
            this.configScope = configScope;
            return this;
        }

        /**
         * <p>节点组ID。ConfigScope取值NODE_GROUP时，该参数生效。NodeGroupId参数优先级高于NodeGroupName。</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>节点组名称。ConfigScope取值NODE_GROUP时，且参数NodeGroupId为空时生效，该参数生效。</p>
         * 
         * <strong>example:</strong>
         * <p>core-1</p>
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
