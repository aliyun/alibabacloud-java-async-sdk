// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDedicatedBlockStorageClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedBlockStorageClusterAttributeResponseBody</p>
 */
public class ModifyDedicatedBlockStorageClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDedicatedBlockStorageClusterAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedBlockStorageClusterAttributeResponseBody create() {
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
         * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDedicatedBlockStorageClusterAttributeResponseBody build() {
            return new ModifyDedicatedBlockStorageClusterAttributeResponseBody(this);
        } 

    } 

}
