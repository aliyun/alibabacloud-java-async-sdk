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
 * {@link GetConstraintRequest} extends {@link RequestModel}
 *
 * <p>GetConstraintRequest</p>
 */
public class GetConstraintRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConstraintId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String constraintId;

    private GetConstraintRequest(Builder builder) {
        super(builder);
        this.constraintId = builder.constraintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConstraintRequest create() {
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

    public static final class Builder extends Request.Builder<GetConstraintRequest, Builder> {
        private String constraintId; 

        private Builder() {
            super();
        } 

        private Builder(GetConstraintRequest request) {
            super(request);
            this.constraintId = request.constraintId;
        } 

        /**
         * <p>The ID of the constraint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cons-bp1yx7x42v****</p>
         */
        public Builder constraintId(String constraintId) {
            this.putQueryParameter("ConstraintId", constraintId);
            this.constraintId = constraintId;
            return this;
        }

        @Override
        public GetConstraintRequest build() {
            return new GetConstraintRequest(this);
        } 

    } 

}
