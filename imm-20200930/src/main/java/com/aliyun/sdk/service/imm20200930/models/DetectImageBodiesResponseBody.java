// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetectImageBodiesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageBodiesResponseBody</p>
 */
public class DetectImageBodiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bodies")
    private java.util.List<Body> bodies;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodies
     */
    public java.util.List<Body> getBodies() {
        return this.bodies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Body> bodies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetectImageBodiesResponseBody model) {
            this.bodies = model.bodies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The human bodies.</p>
         */
        public Builder bodies(java.util.List<Body> bodies) {
            this.bodies = bodies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>501339F9-4B70-0CE2-AB8C-866C********</p>
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
