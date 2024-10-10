// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryWorksBloodRelationshipResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorksBloodRelationshipResponseBody</p>
 */
public class QueryWorksBloodRelationshipResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryWorksBloodRelationshipResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksBloodRelationshipResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The response.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryWorksBloodRelationshipResponseBody build() {
            return new QueryWorksBloodRelationshipResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWorksBloodRelationshipResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorksBloodRelationshipResponseBody</p>
     */
    public static class QueryParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("IsMeasure")
        private Boolean isMeasure;

        @com.aliyun.core.annotation.NameInMap("PathId")
        private String pathId;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private QueryParams(Builder builder) {
            this.areaId = builder.areaId;
            this.areaName = builder.areaName;
            this.caption = builder.caption;
            this.dataType = builder.dataType;
            this.isMeasure = builder.isMeasure;
            this.pathId = builder.pathId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParams create() {
            return builder().build();
        }

        /**
         * @return areaId
         */
        public String getAreaId() {
            return this.areaId;
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return isMeasure
         */
        public Boolean getIsMeasure() {
            return this.isMeasure;
        }

        /**
         * @return pathId
         */
        public String getPathId() {
            return this.pathId;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String areaId; 
            private String areaName; 
            private String caption; 
            private String dataType; 
            private Boolean isMeasure; 
            private String pathId; 
            private String uid; 

            /**
             * <p>Indices whether the metric. Valid values:</p>
             * <p>true false</p>
             * 
             * <strong>example:</strong>
             * <p>area_column</p>
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The ID of the owning location.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the owning location.</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The globally unique PathId.</p>
             * 
             * <strong>example:</strong>
             * <p>order_number</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The display name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>number</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The type of the field. Valid values:</p>
             * <ul>
             * <li>string: string type</li>
             * <li>date: a date type that contains only the year, month, and day parts</li>
             * <li>datetime: a common date type</li>
             * <li>time: a date type that contains only hours, minutes, and seconds.</li>
             * <li>number: numeric</li>
             * <li>boolean: Boolean type</li>
             * <li>geographical: geographical location</li>
             * <li>url: string type</li>
             * <li>imageUrl: the type of the image link.</li>
             * <li>multivalue: a multi-value column</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMeasure(Boolean isMeasure) {
                this.isMeasure = isMeasure;
                return this;
            }

            /**
             * <p>The unique ID of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>schema7d1944eb-443e-48c6-8123-bf45a99e7e74.dc78a4ed-880d-452e-b017-90cfc10c83e5_company_sales_record.[Ndc78a4_order_level].[Ndc78a4_order_level].[Ndc78a4_order_level]</p>
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * <p>A list of query parameter reference columns.</p>
             * 
             * <strong>example:</strong>
             * <p>Ndc78a4_order_number</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public QueryParams build() {
                return new QueryParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryWorksBloodRelationshipResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorksBloodRelationshipResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private Integer componentType;

        @com.aliyun.core.annotation.NameInMap("ComponentTypeName")
        private String componentTypeName;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("QueryParams")
        private java.util.List < QueryParams> queryParams;

        private Result(Builder builder) {
            this.componentId = builder.componentId;
            this.componentName = builder.componentName;
            this.componentType = builder.componentType;
            this.componentTypeName = builder.componentTypeName;
            this.datasetId = builder.datasetId;
            this.queryParams = builder.queryParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentType
         */
        public Integer getComponentType() {
            return this.componentType;
        }

        /**
         * @return componentTypeName
         */
        public String getComponentTypeName() {
            return this.componentTypeName;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return queryParams
         */
        public java.util.List < QueryParams> getQueryParams() {
            return this.queryParams;
        }

        public static final class Builder {
            private String componentId; 
            private String componentName; 
            private Integer componentType; 
            private String componentTypeName; 
            private String datasetId; 
            private java.util.List < QueryParams> queryParams; 

            /**
             * <p>List of work blood information.</p>
             * 
             * <strong>example:</strong>
             * <p>0696083a-ca72-4d89-8e7a-c017910e0***</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The ID of the component that you want to modify.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the component.</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>Line</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder componentType(Integer componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The type of the image component.</p>
             * 
             * <strong>example:</strong>
             * <p>LINE</p>
             */
            public Builder componentTypeName(String componentTypeName) {
                this.componentTypeName = componentTypeName;
                return this;
            }

            /**
             * <p>Column (Measure)</p>
             * 
             * <strong>example:</strong>
             * <p>dc78a4ed-880d-452e-b017-90cfc10c83e5_company_sales_record</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The name of the component type.</p>
             */
            public Builder queryParams(java.util.List < QueryParams> queryParams) {
                this.queryParams = queryParams;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
