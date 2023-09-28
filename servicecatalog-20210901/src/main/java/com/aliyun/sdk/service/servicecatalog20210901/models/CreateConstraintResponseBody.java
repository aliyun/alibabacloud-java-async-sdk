// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConstraintResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConstraintResponseBody</p>
 */
public class CreateConstraintResponseBody extends TeaModel {
    @NameInMap("ConstraintId")
    private String constraintId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateConstraintResponseBody(Builder builder) {
        this.constraintId = builder.constraintId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConstraintResponseBody create() {
        return builder().build();
    }

    /**
     * @return constraintId
     */
    public String getConstraintId() {
        return this.constraintId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String constraintId; 
        private String requestId; 

        /**
         * The ID of the constraint.
         */
        public Builder constraintId(String constraintId) {
            this.constraintId = constraintId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConstraintResponseBody build() {
            return new CreateConstraintResponseBody(this);
        } 

    } 

}
