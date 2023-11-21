// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>CreateSavedQueryRequest</p>
 */
public class CreateSavedQueryRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateSavedQueryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expression = builder.expression;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavedQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateSavedQueryRequest, Builder> {
        private String description; 
        private String expression; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateSavedQueryRequest request) {
            super(request);
            this.description = request.description;
            this.expression = request.expression;
            this.name = request.name;
        } 

        /**
         * The description of the template.
         * <p>
         * 
         * The description must be 1 to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The query statement in the template.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * The name of the template.
         * <p>
         * 
         * *   The name must be 1 to 64 characters in length.
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must be unique.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateSavedQueryRequest build() {
            return new CreateSavedQueryRequest(this);
        } 

    } 

}
