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
 * {@link CreateTrafficControlTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficControlTaskResponseBody</p>
 */
public class CreateTrafficControlTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    private CreateTrafficControlTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlTaskId = builder.trafficControlTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficControlTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateTrafficControlTaskResponseBody model) {
            this.requestId = model.requestId;
            this.trafficControlTaskId = model.trafficControlTaskId;
        } 

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

        public CreateTrafficControlTaskResponseBody build() {
            return new CreateTrafficControlTaskResponseBody(this);
        } 

    } 

}
