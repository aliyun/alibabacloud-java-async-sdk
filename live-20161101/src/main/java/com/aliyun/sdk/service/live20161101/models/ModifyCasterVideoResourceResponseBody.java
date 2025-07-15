// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyCasterVideoResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCasterVideoResourceResponseBody</p>
 */
public class ModifyCasterVideoResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private ModifyCasterVideoResourceResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterVideoResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 
        private String resourceId; 

        private Builder() {
        } 

        private Builder(ModifyCasterVideoResourceResponseBody model) {
            this.casterId = model.casterId;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
        } 

        /**
         * <p>The ID of the production studio. This parameter is used in the requests of the following operations: DescribeCasterVideoResources, AddCasterLayout, and DescribeCasterLayouts.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>98461064-1c94-4dc1-85ce-94098764****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public ModifyCasterVideoResourceResponseBody build() {
            return new ModifyCasterVideoResourceResponseBody(this);
        } 

    } 

}
