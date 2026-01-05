// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link UpdateConstraintResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateConstraintResponseBody</p>
 */
public class UpdateConstraintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConstraintId")
    private String constraintId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateConstraintResponseBody(Builder builder) {
        this.constraintId = builder.constraintId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConstraintResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateConstraintResponseBody model) {
            this.constraintId = model.constraintId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>cons-bp1yx7x42v****</p>
         */
        public Builder constraintId(String constraintId) {
            this.constraintId = constraintId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateConstraintResponseBody build() {
            return new UpdateConstraintResponseBody(this);
        } 

    } 

}
