// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowRequest</p>
 */
public class UpdateFlowRequest extends Request {
    @Body
    @NameInMap("Definition")
    private String definition;

    @Body
    @NameInMap("FlowDescription")
    private String flowDescription;

    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Body
    @NameInMap("FlowName")
    private String flowName;

    private UpdateFlowRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.flowDescription = builder.flowDescription;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return flowDescription
     */
    public String getFlowDescription() {
        return this.flowDescription;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    public static final class Builder extends Request.Builder<UpdateFlowRequest, Builder> {
        private String definition; 
        private String flowDescription; 
        private String flowId; 
        private String flowName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowRequest request) {
            super(request);
            this.definition = request.definition;
            this.flowDescription = request.flowDescription;
            this.flowId = request.flowId;
            this.flowName = request.flowName;
        } 

        /**
         * The new definition that you want to specify for the workflow.
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * The new description that you want to specify for the workflow.
         */
        public Builder flowDescription(String flowDescription) {
            this.putBodyParameter("FlowDescription", flowDescription);
            this.flowDescription = flowDescription;
            return this;
        }

        /**
         * The ID of the workflow whose information you want to update.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * The new name that you want to specify for the workflow.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        @Override
        public UpdateFlowRequest build() {
            return new UpdateFlowRequest(this);
        } 

    } 

}
