// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>UpdateSavedQueryRequest</p>
 */
public class UpdateSavedQueryRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Expression")
    private String expression;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    private UpdateSavedQueryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expression = builder.expression;
        this.name = builder.name;
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSavedQueryRequest create() {
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

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<UpdateSavedQueryRequest, Builder> {
        private String description; 
        private String expression; 
        private String name; 
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSavedQueryRequest request) {
            super(request);
            this.description = request.description;
            this.expression = request.expression;
            this.name = request.name;
            this.queryId = request.queryId;
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

        /**
         * The ID of the template.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public UpdateSavedQueryRequest build() {
            return new UpdateSavedQueryRequest(this);
        } 

    } 

}
