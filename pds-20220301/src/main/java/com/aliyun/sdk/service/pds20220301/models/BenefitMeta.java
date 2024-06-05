// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BenefitMeta} extends {@link TeaModel}
 *
 * <p>BenefitMeta</p>
 */
public class BenefitMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("quota")
    private Long quota;

    private BenefitMeta(Builder builder) {
        this.config = builder.config;
        this.enabled = builder.enabled;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BenefitMeta create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    public static final class Builder {
        private String config; 
        private Boolean enabled; 
        private Long quota; 

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * quota.
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        public BenefitMeta build() {
            return new BenefitMeta(this);
        } 

    } 

}
