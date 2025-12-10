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
 * {@link QueryExperimentVisualizationDataRequest} extends {@link RequestModel}
 *
 * <p>QueryExperimentVisualizationDataRequest</p>
 */
public class QueryExperimentVisualizationDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<QueryExperimentVisualizationDataRequestBody> body;

    private QueryExperimentVisualizationDataRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExperimentVisualizationDataRequest create() {
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
     * @return body
     */
    public java.util.List<QueryExperimentVisualizationDataRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<QueryExperimentVisualizationDataRequest, Builder> {
        private String experimentId; 
        private java.util.List<QueryExperimentVisualizationDataRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(QueryExperimentVisualizationDataRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.body = request.body;
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
         */
        public Builder body(java.util.List<QueryExperimentVisualizationDataRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public QueryExperimentVisualizationDataRequest build() {
            return new QueryExperimentVisualizationDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryExperimentVisualizationDataRequest} extends {@link TeaModel}
     *
     * <p>QueryExperimentVisualizationDataRequest</p>
     */
    public static class QueryExperimentVisualizationDataRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("VisualizationDataIds")
        private java.util.List<String> visualizationDataIds;

        private QueryExperimentVisualizationDataRequestBody(Builder builder) {
            this.endTime = builder.endTime;
            this.nodeId = builder.nodeId;
            this.startTime = builder.startTime;
            this.visualizationDataIds = builder.visualizationDataIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryExperimentVisualizationDataRequestBody create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return visualizationDataIds
         */
        public java.util.List<String> getVisualizationDataIds() {
            return this.visualizationDataIds;
        }

        public static final class Builder {
            private String endTime; 
            private String nodeId; 
            private String startTime; 
            private java.util.List<String> visualizationDataIds; 

            private Builder() {
            } 

            private Builder(QueryExperimentVisualizationDataRequestBody model) {
                this.endTime = model.endTime;
                this.nodeId = model.nodeId;
                this.startTime = model.startTime;
                this.visualizationDataIds = model.visualizationDataIds;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * VisualizationDataIds.
             */
            public Builder visualizationDataIds(java.util.List<String> visualizationDataIds) {
                this.visualizationDataIds = visualizationDataIds;
                return this;
            }

            public QueryExperimentVisualizationDataRequestBody build() {
                return new QueryExperimentVisualizationDataRequestBody(this);
            } 

        } 

    }
}
