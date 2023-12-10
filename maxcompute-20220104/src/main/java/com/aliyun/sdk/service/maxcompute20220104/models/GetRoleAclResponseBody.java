// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleAclResponseBody</p>
 */
public class GetRoleAclResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
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

        public GetRoleAclResponseBody build() {
            return new GetRoleAclResponseBody(this);
        } 

    } 

    public static class Function extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        @NameInMap("schemaName")
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
             * schemaName.
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
    public static class Instance extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        @NameInMap("schemaName")
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
             * The operations that were performed on the instance.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * schemaName.
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
    public static class Package extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        @NameInMap("schemaName")
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
             * The operations that were performed on the package.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the package.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * schemaName.
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
    public static class Project extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        @NameInMap("schemaName")
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
             * The operations that were performed on the project.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the MaxCompute project.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * schemaName.
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
    public static class Resource extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        @NameInMap("schemaName")
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
             * schemaName.
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
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        @NameInMap("schemaName")
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
             * schemaName.
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
    public static class Data extends TeaModel {
        @NameInMap("function")
        private java.util.List < Function> function;

        @NameInMap("instance")
        private java.util.List < Instance> instance;

        @NameInMap("package")
        private java.util.List < Package> _package;

        @NameInMap("project")
        private java.util.List < Project> project;

        @NameInMap("resource")
        private java.util.List < Resource> resource;

        @NameInMap("table")
        private java.util.List < Table> table;

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
        public java.util.List < Function> getFunction() {
            return this.function;
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        /**
         * @return _package
         */
        public java.util.List < Package> get_package() {
            return this._package;
        }

        /**
         * @return project
         */
        public java.util.List < Project> getProject() {
            return this.project;
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
            private java.util.List < Instance> instance; 
            private java.util.List < Package> _package; 
            private java.util.List < Project> project; 
            private java.util.List < Resource> resource; 
            private java.util.List < Table> table; 

            /**
             * The function.
             */
            public Builder function(java.util.List < Function> function) {
                this.function = function;
                return this;
            }

            /**
             * The instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            /**
             * The package.
             */
            public Builder _package(java.util.List < Package> _package) {
                this._package = _package;
                return this;
            }

            /**
             * The project.
             */
            public Builder project(java.util.List < Project> project) {
                this.project = project;
                return this;
            }

            /**
             * The resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The table.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
