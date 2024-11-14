// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDiskReplicaGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiskReplicaGroupResponseBody</p>
 */
public class CreateDiskReplicaGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReplicaGroupId")
    private String replicaGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDiskReplicaGroupResponseBody(Builder builder) {
        this.replicaGroupId = builder.replicaGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskReplicaGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return replicaGroupId
     */
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String replicaGroupId; 
        private String requestId; 

        /**
         * <p>The ID of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDiskReplicaGroupResponseBody build() {
            return new CreateDiskReplicaGroupResponseBody(this);
        } 

    } 

}
