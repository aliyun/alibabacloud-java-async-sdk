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
 * {@link ResourceLimitDetails} extends {@link TeaModel}
 *
 * <p>ResourceLimitDetails</p>
 */
public class ResourceLimitDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GCLevel")
    private String GCLevel;

    @com.aliyun.core.annotation.NameInMap("ResourceLimit")
    private java.util.Map<String, ?> resourceLimit;

    @com.aliyun.core.annotation.NameInMap("ShouldIgnoreResourceCheck")
    private Boolean shouldIgnoreResourceCheck;

    private ResourceLimitDetails(Builder builder) {
        this.GCLevel = builder.GCLevel;
        this.resourceLimit = builder.resourceLimit;
        this.shouldIgnoreResourceCheck = builder.shouldIgnoreResourceCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceLimitDetails create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return GCLevel
     */
    public String getGCLevel() {
        return this.GCLevel;
    }

    /**
     * @return resourceLimit
     */
    public java.util.Map<String, ?> getResourceLimit() {
        return this.resourceLimit;
    }

    /**
     * @return shouldIgnoreResourceCheck
     */
    public Boolean getShouldIgnoreResourceCheck() {
        return this.shouldIgnoreResourceCheck;
    }

    public static final class Builder {
        private String GCLevel; 
        private java.util.Map<String, ?> resourceLimit; 
        private Boolean shouldIgnoreResourceCheck; 

        private Builder() {
        } 

        private Builder(ResourceLimitDetails model) {
            this.GCLevel = model.GCLevel;
            this.resourceLimit = model.resourceLimit;
            this.shouldIgnoreResourceCheck = model.shouldIgnoreResourceCheck;
        } 

        /**
         * GCLevel.
         */
        public Builder GCLevel(String GCLevel) {
            this.GCLevel = GCLevel;
            return this;
        }

        /**
         * ResourceLimit.
         */
        public Builder resourceLimit(java.util.Map<String, ?> resourceLimit) {
            this.resourceLimit = resourceLimit;
            return this;
        }

        /**
         * ShouldIgnoreResourceCheck.
         */
        public Builder shouldIgnoreResourceCheck(Boolean shouldIgnoreResourceCheck) {
            this.shouldIgnoreResourceCheck = shouldIgnoreResourceCheck;
            return this;
        }

        public ResourceLimitDetails build() {
            return new ResourceLimitDetails(this);
        } 

    } 

}
