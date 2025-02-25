// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIgraphLabelLastBackflowRequest} extends {@link RequestModel}
 *
 * <p>GetIgraphLabelLastBackflowRequest</p>
 */
public class GetIgraphLabelLastBackflowRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("graphName")
    @Validation(required = true)
    private String graphName;

    @Path
    @NameInMap("labelName")
    @Validation(required = true)
    private String labelName;

    private GetIgraphLabelLastBackflowRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.labelName = builder.labelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIgraphLabelLastBackflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return labelName
     */
    public String getLabelName() {
        return this.labelName;
    }

    public static final class Builder extends Request.Builder<GetIgraphLabelLastBackflowRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String labelName; 

        private Builder() {
            super();
        } 

        private Builder(GetIgraphLabelLastBackflowRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
            this.labelName = request.labelName;
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
         * graphName.
         */
        public Builder graphName(String graphName) {
            this.putPathParameter("graphName", graphName);
            this.graphName = graphName;
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
        public GetIgraphLabelLastBackflowRequest build() {
            return new GetIgraphLabelLastBackflowRequest(this);
        } 

    } 

}
