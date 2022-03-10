// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksBloodRelationshipResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorksBloodRelationshipResponseBody</p>
 */
public class QueryWorksBloodRelationshipResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("AreaId")
        private String areaId;

        @NameInMap("AreaName")
        private String areaName;

        @NameInMap("Caption")
        private String caption;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("IsMeasure")
        private Boolean isMeasure;

        @NameInMap("PathId")
        private String pathId;

        @NameInMap("Uid")
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
             * 所属位置：
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * AreaName.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * 字段显示名称
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * 字段类型
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * 是否是度量
             */
            public Builder isMeasure(Boolean isMeasure) {
                this.isMeasure = isMeasure;
                return this;
            }

            /**
             * 全局唯一的PathId。位于cube的level中pathId
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * 字段唯一ID。即cube中的name
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
        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("ComponentType")
        private Integer componentType;

        @NameInMap("ComponentTypeName")
        private String componentTypeName;

        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("QueryParams")
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
             * 组件ID or  sheetId
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * 组件类型
             */
            public Builder componentType(Integer componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * ComponentTypeName.
             */
            public Builder componentTypeName(String componentTypeName) {
                this.componentTypeName = componentTypeName;
                return this;
            }

            /**
             * 数据集ID
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * 查询参数引用的列信息
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
