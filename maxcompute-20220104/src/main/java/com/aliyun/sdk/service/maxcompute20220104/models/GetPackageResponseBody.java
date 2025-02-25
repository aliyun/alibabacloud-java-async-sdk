// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>040002</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>error message.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0b57ff8316614119858417939e3e54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPackageResponseBody build() {
            return new GetPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageResponseBody</p>
     */
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
             * <p>The security level for sensitive data.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>proejctB</p>
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
    /**
     * 
     * {@link GetPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageResponseBody</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
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
            private java.util.List<String> actions; 
            private String name; 
            private String schemaName; 

            /**
             * <p>The operations that were performed on the function.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>function_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of schema.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link GetPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
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
            private java.util.List<String> actions; 
            private String name; 
            private String schemaName; 

            /**
             * <p>The operations that were performed on the resource.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>res_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of schema.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link GetPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageResponseBody</p>
     */
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
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
            private java.util.List<String> actions; 
            private String name; 
            private String schemaName; 

            /**
             * <p>The operations that were performed on the table.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>dim_odps</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of schema.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link GetPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private java.util.List<Function> function;

        @com.aliyun.core.annotation.NameInMap("resource")
        private java.util.List<Resource> resource;

        @com.aliyun.core.annotation.NameInMap("table")
        private java.util.List<Table> table;

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
        public java.util.List<Function> getFunction() {
            return this.function;
        }

        /**
         * @return resource
         */
        public java.util.List<Resource> getResource() {
            return this.resource;
        }

        /**
         * @return table
         */
        public java.util.List<Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<Function> function; 
            private java.util.List<Resource> resource; 
            private java.util.List<Table> table; 

            /**
             * <p>The functions.</p>
             */
            public Builder function(java.util.List<Function> function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The resources.</p>
             */
            public Builder resource(java.util.List<Resource> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The tables.</p>
             */
            public Builder table(java.util.List<Table> table) {
                this.table = table;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedProjectList")
        private java.util.List<AllowedProjectList> allowedProjectList;

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
        public java.util.List<AllowedProjectList> getAllowedProjectList() {
            return this.allowedProjectList;
        }

        /**
         * @return resourceList
         */
        public ResourceList getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private java.util.List<AllowedProjectList> allowedProjectList; 
            private ResourceList resourceList; 

            /**
             * <p>The projects in which the package is installed.</p>
             */
            public Builder allowedProjectList(java.util.List<AllowedProjectList> allowedProjectList) {
                this.allowedProjectList = allowedProjectList;
                return this;
            }

            /**
             * <p>The details of the resources that are included in the package.</p>
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
