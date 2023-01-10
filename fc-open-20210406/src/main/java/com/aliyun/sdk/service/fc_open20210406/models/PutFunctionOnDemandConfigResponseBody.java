// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutFunctionOnDemandConfigResponseBody} extends {@link TeaModel}
 *
 * <p>PutFunctionOnDemandConfigResponseBody</p>
 */
public class PutFunctionOnDemandConfigResponseBody extends TeaModel {
    @NameInMap("maximumInstanceCount")
    private Long maximumInstanceCount;

    @NameInMap("resource")
    private String resource;

    private PutFunctionOnDemandConfigResponseBody(Builder builder) {
        this.maximumInstanceCount = builder.maximumInstanceCount;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutFunctionOnDemandConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return maximumInstanceCount
     */
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    public static final class Builder {
        private Long maximumInstanceCount; 
        private String resource; 

        /**
         * The maximum number of instances.
         */
        public Builder maximumInstanceCount(Long maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }

        /**
         * The description of the resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        public PutFunctionOnDemandConfigResponseBody build() {
            return new PutFunctionOnDemandConfigResponseBody(this);
        } 

    } 

}
