// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotaConfig} extends {@link TeaModel}
 *
 * <p>QuotaConfig</p>
 */
public class QuotaConfig extends TeaModel {
    @NameInMap("AllowedMaxPriority")
    private Integer allowedMaxPriority;

    @NameInMap("EnableDLC")
    private Boolean enableDLC;

    @NameInMap("EnableDSW")
    private Boolean enableDSW;

    @NameInMap("EnableTideResource")
    private Boolean enableTideResource;

    @NameInMap("ResourceLevel")
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
         * 允许的最大优先级
         */
        public Builder allowedMaxPriority(Integer allowedMaxPriority) {
            this.allowedMaxPriority = allowedMaxPriority;
            return this;
        }

        /**
         * 是否开启DLC
         */
        public Builder enableDLC(Boolean enableDLC) {
            this.enableDLC = enableDLC;
            return this;
        }

        /**
         * 是否开启DSW
         */
        public Builder enableDSW(Boolean enableDSW) {
            this.enableDSW = enableDSW;
            return this;
        }

        /**
         * 是否使用潮汐资源
         */
        public Builder enableTideResource(Boolean enableTideResource) {
            this.enableTideResource = enableTideResource;
            return this;
        }

        /**
         * 资源级别(L0, L1)
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
