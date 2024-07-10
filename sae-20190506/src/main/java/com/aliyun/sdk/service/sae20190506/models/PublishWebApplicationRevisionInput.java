// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishWebApplicationRevisionInput} extends {@link TeaModel}
 *
 * <p>PublishWebApplicationRevisionInput</p>
 */
public class PublishWebApplicationRevisionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Containers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Container > containers;

    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnableArmsMetrics")
    private Boolean enableArmsMetrics;

    @com.aliyun.core.annotation.NameInMap("TakeEffect")
    private Boolean takeEffect;

    private PublishWebApplicationRevisionInput(Builder builder) {
        this.containers = builder.containers;
        this.description = builder.description;
        this.enableArmsMetrics = builder.enableArmsMetrics;
        this.takeEffect = builder.takeEffect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishWebApplicationRevisionInput create() {
        return builder().build();
    }

    /**
     * @return containers
     */
    public java.util.List < Container > getContainers() {
        return this.containers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableArmsMetrics
     */
    public Boolean getEnableArmsMetrics() {
        return this.enableArmsMetrics;
    }

    /**
     * @return takeEffect
     */
    public Boolean getTakeEffect() {
        return this.takeEffect;
    }

    public static final class Builder {
        private java.util.List < Container > containers; 
        private String description; 
        private Boolean enableArmsMetrics; 
        private Boolean takeEffect; 

        /**
         * Containers.
         */
        public Builder containers(java.util.List < Container > containers) {
            this.containers = containers;
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
         * EnableArmsMetrics.
         */
        public Builder enableArmsMetrics(Boolean enableArmsMetrics) {
            this.enableArmsMetrics = enableArmsMetrics;
            return this;
        }

        /**
         * TakeEffect.
         */
        public Builder takeEffect(Boolean takeEffect) {
            this.takeEffect = takeEffect;
            return this;
        }

        public PublishWebApplicationRevisionInput build() {
            return new PublishWebApplicationRevisionInput(this);
        } 

    } 

}
