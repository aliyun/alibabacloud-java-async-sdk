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
 * {@link QueryExperimentVisualizationDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryExperimentVisualizationDataResponseBody</p>
 */
public class QueryExperimentVisualizationDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("VisualizationData")
    private java.util.List<VisualizationData> visualizationData;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryExperimentVisualizationDataResponseBody(Builder builder) {
        this.visualizationData = builder.visualizationData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExperimentVisualizationDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return visualizationData
     */
    public java.util.List<VisualizationData> getVisualizationData() {
        return this.visualizationData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<VisualizationData> visualizationData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryExperimentVisualizationDataResponseBody model) {
            this.visualizationData = model.visualizationData;
            this.requestId = model.requestId;
        } 

        /**
         * VisualizationData.
         */
        public Builder visualizationData(java.util.List<VisualizationData> visualizationData) {
            this.visualizationData = visualizationData;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryExperimentVisualizationDataResponseBody build() {
            return new QueryExperimentVisualizationDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryExperimentVisualizationDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryExperimentVisualizationDataResponseBody</p>
     */
    public static class VisualizationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private VisualizationData(Builder builder) {
            this.createTime = builder.createTime;
            this.data = builder.data;
            this.dataId = builder.dataId;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisualizationData create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String createTime; 
            private String data; 
            private String dataId; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(VisualizationData model) {
                this.createTime = model.createTime;
                this.data = model.data;
                this.dataId = model.dataId;
                this.nodeId = model.nodeId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public VisualizationData build() {
                return new VisualizationData(this);
            } 

        } 

    }
}
