// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CloneTrafficControlTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CloneTrafficControlTaskResponseBody</p>
 */
public class CloneTrafficControlTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    private CloneTrafficControlTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlTaskId = builder.trafficControlTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneTrafficControlTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    public static final class Builder {
        private String requestId; 
        private String trafficControlTaskId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficControlTaskId.
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        public CloneTrafficControlTaskResponseBody build() {
            return new CloneTrafficControlTaskResponseBody(this);
        } 

    } 

}
