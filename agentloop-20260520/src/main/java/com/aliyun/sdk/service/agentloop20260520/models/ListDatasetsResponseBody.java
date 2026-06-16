// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ListDatasetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetsResponseBody</p>
 */
public class ListDatasetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("datasets")
    private java.util.List<Datasets> datasets;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListDatasetsResponseBody(Builder builder) {
        this.datasets = builder.datasets;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasets
     */
    public java.util.List<Datasets> getDatasets() {
        return this.datasets;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Datasets> datasets; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListDatasetsResponseBody model) {
            this.datasets = model.datasets;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * datasets.
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDatasetsResponseBody build() {
            return new ListDatasetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetsResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("datasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Datasets(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.createTime = builder.createTime;
            this.datasetName = builder.datasetName;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String agentSpace; 
            private String createTime; 
            private String datasetName; 
            private String description; 
            private String regionId; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.agentSpace = model.agentSpace;
                this.createTime = model.createTime;
                this.datasetName = model.datasetName;
                this.description = model.description;
                this.regionId = model.regionId;
                this.updateTime = model.updateTime;
            } 

            /**
             * agentSpace.
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-19T02:11:02Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * datasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-18T02:21:32Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
}
