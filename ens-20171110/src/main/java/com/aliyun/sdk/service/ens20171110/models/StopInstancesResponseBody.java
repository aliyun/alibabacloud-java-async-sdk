// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>StopInstancesResponseBody</p>
 */
public class StopInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceResponses")
    private java.util.List < InstanceOperateResponse > instanceResponses;

    @NameInMap("RequestId")
    private String requestId;

    private StopInstancesResponseBody(Builder builder) {
        this.instanceResponses = builder.instanceResponses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceResponses
     */
    public java.util.List < InstanceOperateResponse > getInstanceResponses() {
        return this.instanceResponses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceOperateResponse > instanceResponses; 
        private String requestId; 

        /**
         * InstanceResponses.
         */
        public Builder instanceResponses(java.util.List < InstanceOperateResponse > instanceResponses) {
            this.instanceResponses = instanceResponses;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StopInstancesResponseBody build() {
            return new StopInstancesResponseBody(this);
        } 

    } 

}
