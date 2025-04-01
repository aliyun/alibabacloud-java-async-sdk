// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link UpdateSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>UpdateSavedQueryRequest</p>
 */
public class UpdateSavedQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The description of the template.</p>
         * <p>The description must be 1 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The query statement in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM resources;</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * <ul>
         * <li>The name must be 1 to 64 characters in length.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must be unique.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Query of All Alibaba Cloud Resources</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sq-GeAck****</p>
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
