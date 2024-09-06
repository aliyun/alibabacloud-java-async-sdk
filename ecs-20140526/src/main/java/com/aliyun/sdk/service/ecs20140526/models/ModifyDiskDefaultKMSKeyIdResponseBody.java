// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskDefaultKMSKeyIdResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDiskDefaultKMSKeyIdResponseBody</p>
 */
public class ModifyDiskDefaultKMSKeyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDiskDefaultKMSKeyIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskDefaultKMSKeyIdResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDiskDefaultKMSKeyIdResponseBody build() {
            return new ModifyDiskDefaultKMSKeyIdResponseBody(this);
        } 

    } 

}
