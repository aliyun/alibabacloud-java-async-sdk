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
 * {@link UpdateConstraintRequest} extends {@link RequestModel}
 *
 * <p>UpdateConstraintRequest</p>
 */
public class UpdateConstraintRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConstraintId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String constraintId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
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
         * <p>The configurations of the constraint.</p>
         * <p>Format: { &quot;LocalRoleName&quot;: &quot;&lt;role_name&gt;&quot; }.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;LocalRoleName&quot;: &quot;TestRole&quot; }</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the constraint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cons-bp1yx7x42v****</p>
         */
        public Builder constraintId(String constraintId) {
            this.putBodyParameter("ConstraintId", constraintId);
            this.constraintId = constraintId;
            return this;
        }

        /**
         * <p>The description of the constraint.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Launch as local role TestRole</p>
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
