// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetExperimentVisualizationMetaRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentVisualizationMetaRequest</p>
 */
public class GetExperimentVisualizationMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private String nodeIds;

    private GetExperimentVisualizationMetaRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentVisualizationMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<GetExperimentVisualizationMetaRequest, Builder> {
        private String experimentId; 
        private String nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentVisualizationMetaRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.nodeIds = request.nodeIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-rbvg5wzljzjhc9ks92</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(String nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        @Override
        public GetExperimentVisualizationMetaRequest build() {
            return new GetExperimentVisualizationMetaRequest(this);
        } 

    } 

}
