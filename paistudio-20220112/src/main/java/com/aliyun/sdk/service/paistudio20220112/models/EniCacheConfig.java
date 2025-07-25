// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link EniCacheConfig} extends {@link TeaModel}
 *
 * <p>EniCacheConfig</p>
 */
public class EniCacheConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CachePoolSize")
    @com.aliyun.core.annotation.Validation(maximum = 255)
    private Integer cachePoolSize;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    private EniCacheConfig(Builder builder) {
        this.cachePoolSize = builder.cachePoolSize;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EniCacheConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cachePoolSize
     */
    public Integer getCachePoolSize() {
        return this.cachePoolSize;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private Integer cachePoolSize; 
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(EniCacheConfig model) {
            this.cachePoolSize = model.cachePoolSize;
            this.enabled = model.enabled;
        } 

        /**
         * CachePoolSize.
         */
        public Builder cachePoolSize(Integer cachePoolSize) {
            this.cachePoolSize = cachePoolSize;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public EniCacheConfig build() {
            return new EniCacheConfig(this);
        } 

    } 

}
