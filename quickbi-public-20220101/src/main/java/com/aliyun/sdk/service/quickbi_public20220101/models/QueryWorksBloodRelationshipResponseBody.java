// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The response.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryWorksBloodRelationshipResponseBody build() {
            return new QueryWorksBloodRelationshipResponseBody(this);
        } 

    } 

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
             * Indices whether the metric. Valid values:
             * <p>
             * 
             * true false
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * The ID of the owning location.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * The globally unique PathId.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * The display name of the field.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The type of the field. Valid values:
             * <p>
             * 
             * *   string: string type
             * *   date: a date type that contains only the year, month, and day parts
             * *   datetime: a common date type
             * *   time: a date type that contains only hours, minutes, and seconds.
             * *   number: numeric
             * *   boolean: Boolean type
             * *   geographical: geographical location
             * *   url: string type
             * *   imageUrl: the type of the image link.
             * *   multivalue: a multi-value column
             */
            public Builder isMeasure(Boolean isMeasure) {
                this.isMeasure = isMeasure;
                return this;
            }

            /**
             * The unique ID of the field.
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * A list of query parameter reference columns.
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
             * List of work blood information.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * The ID of the component that you want to modify.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * Line
             */
            public Builder componentType(Integer componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * The type of the image component.
             */
            public Builder componentTypeName(String componentTypeName) {
                this.componentTypeName = componentTypeName;
                return this;
            }

            /**
             * Column (Measure)
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * The name of the component type.
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
