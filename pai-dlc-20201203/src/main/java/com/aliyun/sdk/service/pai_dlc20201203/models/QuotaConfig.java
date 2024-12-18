// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link QuotaConfig} extends {@link TeaModel}
 *
 * <p>QuotaConfig</p>
 */
public class QuotaConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowedMaxPriority")
    private Integer allowedMaxPriority;

    @com.aliyun.core.annotation.NameInMap("EnableDLC")
    private Boolean enableDLC;

    @com.aliyun.core.annotation.NameInMap("EnableDSW")
    private Boolean enableDSW;

    @com.aliyun.core.annotation.NameInMap("EnableTideResource")
    private Boolean enableTideResource;

    @com.aliyun.core.annotation.NameInMap("ResourceLevel")
    private String resourceLevel;

    private QuotaConfig(Builder builder) {
        this.allowedMaxPriority = builder.allowedMaxPriority;
        this.enableDLC = builder.enableDLC;
        this.enableDSW = builder.enableDSW;
        this.enableTideResource = builder.enableTideResource;
        this.resourceLevel = builder.resourceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaConfig create() {
        return builder().build();
    }

    /**
     * @return allowedMaxPriority
     */
    public Integer getAllowedMaxPriority() {
        return this.allowedMaxPriority;
    }

    /**
     * @return enableDLC
     */
    public Boolean getEnableDLC() {
        return this.enableDLC;
    }

    /**
     * @return enableDSW
     */
    public Boolean getEnableDSW() {
        return this.enableDSW;
    }

    /**
     * @return enableTideResource
     */
    public Boolean getEnableTideResource() {
        return this.enableTideResource;
    }

    /**
     * @return resourceLevel
     */
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    public static final class Builder {
        private Integer allowedMaxPriority; 
        private Boolean enableDLC; 
        private Boolean enableDSW; 
        private Boolean enableTideResource; 
        private String resourceLevel; 

        /**
         * AllowedMaxPriority.
         */
        public Builder allowedMaxPriority(Integer allowedMaxPriority) {
            this.allowedMaxPriority = allowedMaxPriority;
            return this;
        }

        /**
         * EnableDLC.
         */
        public Builder enableDLC(Boolean enableDLC) {
            this.enableDLC = enableDLC;
            return this;
        }

        /**
         * EnableDSW.
         */
        public Builder enableDSW(Boolean enableDSW) {
            this.enableDSW = enableDSW;
            return this;
        }

        /**
         * EnableTideResource.
         */
        public Builder enableTideResource(Boolean enableTideResource) {
            this.enableTideResource = enableTideResource;
            return this;
        }

        /**
         * ResourceLevel.
         */
        public Builder resourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }

        public QuotaConfig build() {
            return new QuotaConfig(this);
        } 

    } 

}
