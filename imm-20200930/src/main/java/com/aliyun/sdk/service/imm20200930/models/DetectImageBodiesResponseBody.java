// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageBodiesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageBodiesResponseBody</p>
 */
public class DetectImageBodiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bodies")
    private java.util.List < Body > bodies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageBodiesResponseBody(Builder builder) {
        this.bodies = builder.bodies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageBodiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bodies
     */
    public java.util.List < Body > getBodies() {
        return this.bodies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Body > bodies; 
        private String requestId; 

        /**
         * Bodies.
         */
        public Builder bodies(java.util.List < Body > bodies) {
            this.bodies = bodies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageBodiesResponseBody build() {
            return new DetectImageBodiesResponseBody(this);
        } 

    } 

}
