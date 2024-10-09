// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDedicatedHostClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostClusterAttributeResponseBody</p>
 */
public class ModifyDedicatedHostClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDedicatedHostClusterAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostClusterAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>11B55F58-D3A4-4A9B-9596-342420D02FF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDedicatedHostClusterAttributeResponseBody build() {
            return new ModifyDedicatedHostClusterAttributeResponseBody(this);
        } 

    } 

}
