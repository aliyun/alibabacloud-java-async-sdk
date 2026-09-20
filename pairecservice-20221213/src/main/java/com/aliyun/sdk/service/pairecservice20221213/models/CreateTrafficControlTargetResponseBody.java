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
 * {@link CreateTrafficControlTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficControlTargetResponseBody</p>
 */
public class CreateTrafficControlTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    private CreateTrafficControlTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlTargetId = builder.trafficControlTargetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficControlTargetResponseBody create() {
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
     * @return trafficControlTargetId
     */
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

    public static final class Builder {
        private String requestId; 
        private String trafficControlTargetId; 

        private Builder() {
        } 

        private Builder(CreateTrafficControlTargetResponseBody model) {
            this.requestId = model.requestId;
            this.trafficControlTargetId = model.trafficControlTargetId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The traffic control target ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }

        public CreateTrafficControlTargetResponseBody build() {
            return new CreateTrafficControlTargetResponseBody(this);
        } 

    } 

}
