// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ReprotectDiskReplicaGroupResponseBody</p>
 */
public class ReprotectDiskReplicaGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReprotectDiskReplicaGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReprotectDiskReplicaGroupResponseBody create() {
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

        public ReprotectDiskReplicaGroupResponseBody build() {
            return new ReprotectDiskReplicaGroupResponseBody(this);
        } 

    } 

}
