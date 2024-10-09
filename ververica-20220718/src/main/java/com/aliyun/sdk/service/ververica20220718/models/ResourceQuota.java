// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResourceQuota} extends {@link TeaModel}
 *
 * <p>ResourceQuota</p>
 */
public class ResourceQuota extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("limit")
    private ResourceSpec limit;

    @com.aliyun.core.annotation.NameInMap("used")
    private ResourceSpec used;

    private ResourceQuota(Builder builder) {
        this.limit = builder.limit;
        this.used = builder.used;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceQuota create() {
        return builder().build();
    }

    /**
     * @return limit
     */
    public ResourceSpec getLimit() {
        return this.limit;
    }

    /**
     * @return used
     */
    public ResourceSpec getUsed() {
        return this.used;
    }

    public static final class Builder {
        private ResourceSpec limit; 
        private ResourceSpec used; 

        /**
         * limit.
         */
        public Builder limit(ResourceSpec limit) {
            this.limit = limit;
            return this;
        }

        /**
         * used.
         */
        public Builder used(ResourceSpec used) {
            this.used = used;
            return this;
        }

        public ResourceQuota build() {
            return new ResourceQuota(this);
        } 

    } 

}
