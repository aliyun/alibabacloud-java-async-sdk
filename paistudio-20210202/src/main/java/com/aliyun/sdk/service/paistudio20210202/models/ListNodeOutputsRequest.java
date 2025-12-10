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
 * {@link ListNodeOutputsRequest} extends {@link RequestModel}
 *
 * <p>ListNodeOutputsRequest</p>
 */
public class ListNodeOutputsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    private ListNodeOutputsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeOutputsRequest create() {
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<ListNodeOutputsRequest, Builder> {
        private String experimentId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeOutputsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.nodeId = request.nodeId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>node-5dzotrnwyzfxmbwwc8</p>
         */
        public Builder nodeId(String nodeId) {
            this.putPathParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public ListNodeOutputsRequest build() {
            return new ListNodeOutputsRequest(this);
        } 

    } 

}
