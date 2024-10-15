// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplicationConfigParam} extends {@link TeaModel}
 *
 * <p>ApplicationConfigParam</p>
 */
public class ApplicationConfigParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigAction")
    private String configAction;

    @com.aliyun.core.annotation.NameInMap("ConfigFileName")
    private String configFileName;

    @com.aliyun.core.annotation.NameInMap("ConfigItemDescription")
    private String configItemDescription;

    @com.aliyun.core.annotation.NameInMap("ConfigItemKey")
    private String configItemKey;

    @com.aliyun.core.annotation.NameInMap("ConfigItemValue")
    private String configItemValue;

    @com.aliyun.core.annotation.NameInMap("ConfigScope")
    private String configScope;

    @com.aliyun.core.annotation.NameInMap("EffectiveActions")
    private String effectiveActions;

    @com.aliyun.core.annotation.NameInMap("EffectiveType")
    private String effectiveType;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private ApplicationConfigParam(Builder builder) {
        this.configAction = builder.configAction;
        this.configFileName = builder.configFileName;
        this.configItemDescription = builder.configItemDescription;
        this.configItemKey = builder.configItemKey;
        this.configItemValue = builder.configItemValue;
        this.configScope = builder.configScope;
        this.effectiveActions = builder.effectiveActions;
        this.effectiveType = builder.effectiveType;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplicationConfigParam create() {
        return builder().build();
    }

    /**
     * @return configAction
     */
    public String getConfigAction() {
        return this.configAction;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    /**
     * @return configItemDescription
     */
    public String getConfigItemDescription() {
        return this.configItemDescription;
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
     * @return effectiveActions
     */
    public String getEffectiveActions() {
        return this.effectiveActions;
    }

    /**
     * @return effectiveType
     */
    public String getEffectiveType() {
        return this.effectiveType;
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
        private String configAction; 
        private String configFileName; 
        private String configItemDescription; 
        private String configItemKey; 
        private String configItemValue; 
        private String configScope; 
        private String effectiveActions; 
        private String effectiveType; 
        private String nodeGroupId; 
        private String nodeId; 

        /**
         * ConfigAction.
         */
        public Builder configAction(String configAction) {
            this.configAction = configAction;
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
         * ConfigItemDescription.
         */
        public Builder configItemDescription(String configItemDescription) {
            this.configItemDescription = configItemDescription;
            return this;
        }

        /**
         * ConfigItemKey.
         */
        public Builder configItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * ConfigItemValue.
         */
        public Builder configItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }

        /**
         * ConfigScope.
         */
        public Builder configScope(String configScope) {
            this.configScope = configScope;
            return this;
        }

        /**
         * EffectiveActions.
         */
        public Builder effectiveActions(String effectiveActions) {
            this.effectiveActions = effectiveActions;
            return this;
        }

        /**
         * EffectiveType.
         */
        public Builder effectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
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

        public ApplicationConfigParam build() {
            return new ApplicationConfigParam(this);
        } 

    } 

}
