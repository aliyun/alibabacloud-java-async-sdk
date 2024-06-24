// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackageResponseBody} extends {@link TeaModel}
 *
 * <p>GetPackageResponseBody</p>
 */
public class GetPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPackageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPackageResponseBody build() {
            return new GetPackageResponseBody(this);
        } 

    } 

    public static class AllowedProjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private AllowedProjectList(Builder builder) {
            this.label = builder.label;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowedProjectList create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String label; 
            private String project; 

            /**
             * The security level for sensitive data.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The name of the MaxCompute project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public AllowedProjectList build() {
                return new AllowedProjectList(this);
            } 

        } 

    }
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        private Function(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 
            private String schemaName; 

            /**
             * The operations that were performed on the function.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of schema.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        private Resource(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 
            private String schemaName; 

            /**
             * The operations that were performed on the resource.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of schema.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        private Table(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 
            private String schemaName; 

            /**
             * The operations that were performed on the table.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of schema.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private java.util.List < Function> function;

        @com.aliyun.core.annotation.NameInMap("resource")
        private java.util.List < Resource> resource;

        @com.aliyun.core.annotation.NameInMap("table")
        private java.util.List < Table> table;

        private ResourceList(Builder builder) {
            this.function = builder.function;
            this.resource = builder.resource;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public java.util.List < Function> getFunction() {
            return this.function;
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        /**
         * @return table
         */
        public java.util.List < Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < Function> function; 
            private java.util.List < Resource> resource; 
            private java.util.List < Table> table; 

            /**
             * The functions.
             */
            public Builder function(java.util.List < Function> function) {
                this.function = function;
                return this;
            }

            /**
             * The resources.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The tables.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedProjectList")
        private java.util.List < AllowedProjectList> allowedProjectList;

        @com.aliyun.core.annotation.NameInMap("resourceList")
        private ResourceList resourceList;

        private Data(Builder builder) {
            this.allowedProjectList = builder.allowedProjectList;
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowedProjectList
         */
        public java.util.List < AllowedProjectList> getAllowedProjectList() {
            return this.allowedProjectList;
        }

        /**
         * @return resourceList
         */
        public ResourceList getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private java.util.List < AllowedProjectList> allowedProjectList; 
            private ResourceList resourceList; 

            /**
             * The projects in which the package is installed.
             */
            public Builder allowedProjectList(java.util.List < AllowedProjectList> allowedProjectList) {
                this.allowedProjectList = allowedProjectList;
                return this;
            }

            /**
             * The details of the resources that are included in the package.
             */
            public Builder resourceList(ResourceList resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
