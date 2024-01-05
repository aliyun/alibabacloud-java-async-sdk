// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIgraphLabelBackFlowRequest} extends {@link RequestModel}
 *
 * <p>GetIgraphLabelBackFlowRequest</p>
 */
public class GetIgraphLabelBackFlowRequest extends Request {
    @Path
    @NameInMap("graphName")
    @Validation(required = true)
    private String graphName;

    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("labelName")
    private String labelName;

    private GetIgraphLabelBackFlowRequest(Builder builder) {
        super(builder);
        this.graphName = builder.graphName;
        this.instanceId = builder.instanceId;
        this.labelName = builder.labelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIgraphLabelBackFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return labelName
     */
    public String getLabelName() {
        return this.labelName;
    }

    public static final class Builder extends Request.Builder<GetIgraphLabelBackFlowRequest, Builder> {
        private String graphName; 
        private String instanceId; 
        private String labelName; 

        private Builder() {
            super();
        } 

        private Builder(GetIgraphLabelBackFlowRequest request) {
            super(request);
            this.graphName = request.graphName;
            this.instanceId = request.instanceId;
            this.labelName = request.labelName;
        } 

        /**
         * graphName.
         */
        public Builder graphName(String graphName) {
            this.putPathParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * labelName.
         */
        public Builder labelName(String labelName) {
            this.putPathParameter("labelName", labelName);
            this.labelName = labelName;
            return this;
        }

        @Override
        public GetIgraphLabelBackFlowRequest build() {
            return new GetIgraphLabelBackFlowRequest(this);
        } 

    } 

}
