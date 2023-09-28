// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConstraintRequest} extends {@link RequestModel}
 *
 * <p>DeleteConstraintRequest</p>
 */
public class DeleteConstraintRequest extends Request {
    @Body
    @NameInMap("ConstraintId")
    @Validation(required = true)
    private String constraintId;

    private DeleteConstraintRequest(Builder builder) {
        super(builder);
        this.constraintId = builder.constraintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConstraintRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return constraintId
     */
    public String getConstraintId() {
        return this.constraintId;
    }

    public static final class Builder extends Request.Builder<DeleteConstraintRequest, Builder> {
        private String constraintId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConstraintRequest request) {
            super(request);
            this.constraintId = request.constraintId;
        } 

        /**
         * The ID of the constraint.
         */
        public Builder constraintId(String constraintId) {
            this.putBodyParameter("ConstraintId", constraintId);
            this.constraintId = constraintId;
            return this;
        }

        @Override
        public DeleteConstraintRequest build() {
            return new DeleteConstraintRequest(this);
        } 

    } 

}
