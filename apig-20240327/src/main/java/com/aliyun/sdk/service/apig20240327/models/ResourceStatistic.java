// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ResourceStatistic} extends {@link TeaModel}
 *
 * <p>ResourceStatistic</p>
 */
public class ResourceStatistic extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resourceCount")
    private Integer resourceCount;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private ResourceStatistic(Builder builder) {
        this.resourceCount = builder.resourceCount;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceStatistic create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceCount
     */
    public Integer getResourceCount() {
        return this.resourceCount;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private Integer resourceCount; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(ResourceStatistic model) {
            this.resourceCount = model.resourceCount;
            this.resourceType = model.resourceType;
        } 

        /**
         * resourceCount.
         */
        public Builder resourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public ResourceStatistic build() {
            return new ResourceStatistic(this);
        } 

    } 

}
