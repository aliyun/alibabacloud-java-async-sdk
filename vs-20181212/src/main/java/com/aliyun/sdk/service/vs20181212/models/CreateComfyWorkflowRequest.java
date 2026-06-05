// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateComfyWorkflowRequest} extends {@link RequestModel}
 *
 * <p>CreateComfyWorkflowRequest</p>
 */
public class CreateComfyWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workflow")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflow;

    private CreateComfyWorkflowRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.workflow = builder.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComfyWorkflowRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workflow
     */
    public String getWorkflow() {
        return this.workflow;
    }

    public static final class Builder extends Request.Builder<CreateComfyWorkflowRequest, Builder> {
        private String description; 
        private String name; 
        private String workflow; 

        private Builder() {
            super();
        } 

        private Builder(CreateComfyWorkflowRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.workflow = request.workflow;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workflow(String workflow) {
            this.putQueryParameter("Workflow", workflow);
            this.workflow = workflow;
            return this;
        }

        @Override
        public CreateComfyWorkflowRequest build() {
            return new CreateComfyWorkflowRequest(this);
        } 

    } 

}
