// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartReplicaGroupDrillResponseBody} extends {@link TeaModel}
 *
 * <p>StartReplicaGroupDrillResponseBody</p>
 */
public class StartReplicaGroupDrillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrillId")
    private String drillId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartReplicaGroupDrillResponseBody(Builder builder) {
        this.drillId = builder.drillId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartReplicaGroupDrillResponseBody create() {
        return builder().build();
    }

    /**
     * @return drillId
     */
    public String getDrillId() {
        return this.drillId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String drillId; 
        private String requestId; 

        /**
         * The drill ID.
         */
        public Builder drillId(String drillId) {
            this.drillId = drillId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartReplicaGroupDrillResponseBody build() {
            return new StartReplicaGroupDrillResponseBody(this);
        } 

    } 

}
