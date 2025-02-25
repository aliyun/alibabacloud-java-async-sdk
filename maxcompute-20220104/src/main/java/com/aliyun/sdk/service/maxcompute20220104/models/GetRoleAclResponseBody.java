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
 * {@link GetRoleAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleAclResponseBody</p>
 */
public class GetRoleAclResponseBody extends TeaModel {
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

    private GetRoleAclResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleAclResponseBody create() {
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
         * <p>error message</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
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
         * <p>0a06dc0916696898838762018e9564</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRoleAclResponseBody build() {
            return new GetRoleAclResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
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
             * <p>functionA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Schema name.</p>
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
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        private Instance(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
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
             * <p>The operations that were performed on the instance.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
     */
    public static class Package extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        private Package(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Package create() {
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
             * <p>The operations that were performed on the package.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>packageA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Package build() {
                return new Package(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        private Project(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
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
             * <p>The operations that were performed on the project.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>projectA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
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
             * <p>resourceA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Schema name.</p>
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
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
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
             * <p>tableA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Schema name.</p>
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
     * {@link GetRoleAclResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private java.util.List<Function> function;

        @com.aliyun.core.annotation.NameInMap("instance")
        private java.util.List<Instance> instance;

        @com.aliyun.core.annotation.NameInMap("package")
        private java.util.List<Package> _package;

        @com.aliyun.core.annotation.NameInMap("project")
        private java.util.List<Project> project;

        @com.aliyun.core.annotation.NameInMap("resource")
        private java.util.List<Resource> resource;

        @com.aliyun.core.annotation.NameInMap("table")
        private java.util.List<Table> table;

        private Data(Builder builder) {
            this.function = builder.function;
            this.instance = builder.instance;
            this._package = builder._package;
            this.project = builder.project;
            this.resource = builder.resource;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public java.util.List<Function> getFunction() {
            return this.function;
        }

        /**
         * @return instance
         */
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        /**
         * @return _package
         */
        public java.util.List<Package> get_package() {
            return this._package;
        }

        /**
         * @return project
         */
        public java.util.List<Project> getProject() {
            return this.project;
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
            private java.util.List<Instance> instance; 
            private java.util.List<Package> _package; 
            private java.util.List<Project> project; 
            private java.util.List<Resource> resource; 
            private java.util.List<Table> table; 

            /**
             * <p>The function.</p>
             */
            public Builder function(java.util.List<Function> function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The instance.</p>
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The package.</p>
             */
            public Builder _package(java.util.List<Package> _package) {
                this._package = _package;
                return this;
            }

            /**
             * <p>The project.</p>
             */
            public Builder project(java.util.List<Project> project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The resource.</p>
             */
            public Builder resource(java.util.List<Resource> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The table.</p>
             */
            public Builder table(java.util.List<Table> table) {
                this.table = table;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
