// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReserveInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ReserveInstancesResponseBody</p>
 */
public class ReserveInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReserveInstancesResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReserveInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > instanceIds; 
        private String requestId; 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReserveInstancesResponseBody build() {
            return new ReserveInstancesResponseBody(this);
        } 

    } 

}
