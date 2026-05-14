// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListModelCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelCatalogResponseBody</p>
 */
public class ListModelCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("modelList")
    private java.util.List<ModelList> modelList;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListModelCatalogResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.modelList = builder.modelList;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelCatalogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return modelList
     */
    public java.util.List<ModelList> getModelList() {
        return this.modelList;
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

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<ModelList> modelList; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListModelCatalogResponseBody model) {
            this.maxResults = model.maxResults;
            this.modelList = model.modelList;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>maxResults</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * modelList.
         */
        public Builder modelList(java.util.List<ModelList> modelList) {
            this.modelList = modelList;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListModelCatalogResponseBody build() {
            return new ListModelCatalogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelCatalogResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelCatalogResponseBody</p>
     */
    public static class ModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultParams")
        private String defaultParams;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("modelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("paramsExample")
        private String paramsExample;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("serviceDeployRegion")
        private String serviceDeployRegion;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        private ModelList(Builder builder) {
            this.defaultParams = builder.defaultParams;
            this.extra = builder.extra;
            this.modelType = builder.modelType;
            this.paramsExample = builder.paramsExample;
            this.provider = builder.provider;
            this.serviceDeployRegion = builder.serviceDeployRegion;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelList create() {
            return builder().build();
        }

        /**
         * @return defaultParams
         */
        public String getDefaultParams() {
            return this.defaultParams;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return paramsExample
         */
        public String getParamsExample() {
            return this.paramsExample;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return serviceDeployRegion
         */
        public String getServiceDeployRegion() {
            return this.serviceDeployRegion;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String defaultParams; 
            private String extra; 
            private String modelType; 
            private String paramsExample; 
            private String provider; 
            private String serviceDeployRegion; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(ModelList model) {
                this.defaultParams = model.defaultParams;
                this.extra = model.extra;
                this.modelType = model.modelType;
                this.paramsExample = model.paramsExample;
                this.provider = model.provider;
                this.serviceDeployRegion = model.serviceDeployRegion;
                this.taskType = model.taskType;
            } 

            /**
             * defaultParams.
             */
            public Builder defaultParams(String defaultParams) {
                this.defaultParams = defaultParams;
                return this;
            }

            /**
             * extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * modelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * paramsExample.
             */
            public Builder paramsExample(String paramsExample) {
                this.paramsExample = paramsExample;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * serviceDeployRegion.
             */
            public Builder serviceDeployRegion(String serviceDeployRegion) {
                this.serviceDeployRegion = serviceDeployRegion;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public ModelList build() {
                return new ModelList(this);
            } 

        } 

    }
}
