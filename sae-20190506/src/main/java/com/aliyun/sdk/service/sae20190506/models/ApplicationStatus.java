// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplicationStatus} extends {@link TeaModel}
 *
 * <p>ApplicationStatus</p>
 */
public class ApplicationStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Long instanceCount;

    @com.aliyun.core.annotation.NameInMap("scaleConfig")
    private ScaleConfig scaleConfig;

    private ApplicationStatus(Builder builder) {
        this.instanceCount = builder.instanceCount;
        this.scaleConfig = builder.scaleConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplicationStatus create() {
        return builder().build();
    }

    /**
     * @return instanceCount
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return scaleConfig
     */
    public ScaleConfig getScaleConfig() {
        return this.scaleConfig;
    }

    public static final class Builder {
        private Long instanceCount; 
        private ScaleConfig scaleConfig; 

        /**
         * instanceCount.
         */
        public Builder instanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * scaleConfig.
         */
        public Builder scaleConfig(ScaleConfig scaleConfig) {
            this.scaleConfig = scaleConfig;
            return this;
        }

        public ApplicationStatus build() {
            return new ApplicationStatus(this);
        } 

    } 

}
