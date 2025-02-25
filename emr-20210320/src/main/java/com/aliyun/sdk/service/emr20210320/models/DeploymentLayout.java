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
 * {@link DeploymentLayout} extends {@link TeaModel}
 *
 * <p>DeploymentLayout</p>
 */
public class DeploymentLayout extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("ComponentName")
    private String componentName;

    @com.aliyun.core.annotation.NameInMap("NodeSelector")
    private NodeSelector nodeSelector;

    private DeploymentLayout(Builder builder) {
        this.applicationName = builder.applicationName;
        this.componentName = builder.componentName;
        this.nodeSelector = builder.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentLayout create() {
        return builder().build();
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return nodeSelector
     */
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public static final class Builder {
        private String applicationName; 
        private String componentName; 
        private NodeSelector nodeSelector; 

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            return this;
        }

        /**
         * NodeSelector.
         */
        public Builder nodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public DeploymentLayout build() {
            return new DeploymentLayout(this);
        } 

    } 

}
