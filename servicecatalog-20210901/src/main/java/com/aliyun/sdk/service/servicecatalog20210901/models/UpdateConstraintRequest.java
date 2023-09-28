// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConstraintRequest} extends {@link RequestModel}
 *
 * <p>UpdateConstraintRequest</p>
 */
public class UpdateConstraintRequest extends Request {
    @Body
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Body
    @NameInMap("ConstraintId")
    @Validation(required = true)
    private String constraintId;

    @Body
    @NameInMap("Description")
    private String description;

    private UpdateConstraintRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.constraintId = builder.constraintId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConstraintRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return constraintId
     */
    public String getConstraintId() {
        return this.constraintId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateConstraintRequest, Builder> {
        private String config; 
        private String constraintId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConstraintRequest request) {
            super(request);
            this.config = request.config;
            this.constraintId = request.constraintId;
            this.description = request.description;
        } 

        /**
         * The configurations of the constraint.
         * <p>
         * 
         * Format: { "LocalRoleName": "\<role_name>" }.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The ID of the constraint.
         */
        public Builder constraintId(String constraintId) {
            this.putBodyParameter("ConstraintId", constraintId);
            this.constraintId = constraintId;
            return this;
        }

        /**
         * The description of the constraint.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateConstraintRequest build() {
            return new UpdateConstraintRequest(this);
        } 

    } 

}
