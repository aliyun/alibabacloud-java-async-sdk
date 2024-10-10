// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WebApplicationStatus} extends {@link TeaModel}
 *
 * <p>WebApplicationStatus</p>
 */
public class WebApplicationStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Long instanceCount;

    @com.aliyun.core.annotation.NameInMap("WebScalingConfig")
    private WebScalingConfig webScalingConfig;

    private WebApplicationStatus(Builder builder) {
        this.instanceCount = builder.instanceCount;
        this.webScalingConfig = builder.webScalingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebApplicationStatus create() {
        return builder().build();
    }

    /**
     * @return instanceCount
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return webScalingConfig
     */
    public WebScalingConfig getWebScalingConfig() {
        return this.webScalingConfig;
    }

    public static final class Builder {
        private Long instanceCount; 
        private WebScalingConfig webScalingConfig; 

        /**
         * InstanceCount.
         */
        public Builder instanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * WebScalingConfig.
         */
        public Builder webScalingConfig(WebScalingConfig webScalingConfig) {
            this.webScalingConfig = webScalingConfig;
            return this;
        }

        public WebApplicationStatus build() {
            return new WebApplicationStatus(this);
        } 

    } 

}
