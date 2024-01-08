// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskReplicaGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDiskReplicaGroupResponseBody</p>
 */
public class ModifyDiskReplicaGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDiskReplicaGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskReplicaGroupResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDiskReplicaGroupResponseBody build() {
            return new ModifyDiskReplicaGroupResponseBody(this);
        } 

    } 

}
