// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRolesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Function(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
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

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

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

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Instance(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
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

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

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

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Package extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Package(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
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

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

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

            public Package build() {
                return new Package(this);
            } 

        } 

    }
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Project(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
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

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

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

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Resource(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
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

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

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

        private Table(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
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

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

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

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    public static class Acl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private java.util.List < Function> function;

        @com.aliyun.core.annotation.NameInMap("instance")
        private java.util.List < Instance> instance;

        @com.aliyun.core.annotation.NameInMap("package")
        private java.util.List < Package> _package;

        @com.aliyun.core.annotation.NameInMap("project")
        private java.util.List < Project> project;

        @com.aliyun.core.annotation.NameInMap("resource")
        private java.util.List < Resource> resource;

        @com.aliyun.core.annotation.NameInMap("table")
        private java.util.List < Table> table;

        private Acl(Builder builder) {
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

        public static Acl create() {
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

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acl")
        private Acl acl;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Roles(Builder builder) {
            this.acl = builder.acl;
            this.name = builder.name;
            this.policy = builder.policy;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public Acl getAcl() {
            return this.acl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Acl acl; 
            private String name; 
            private String policy; 
            private String type; 

            /**
             * The ACL-based permissions that are granted to the role.
             */
            public Builder acl(Acl acl) {
                this.acl = acl;
                return this;
            }

            /**
             * The name of the role.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The policy that is attached to the role.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The type of the role.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("roles")
        private java.util.List < Roles> roles;

        private Data(Builder builder) {
            this.roles = builder.roles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return roles
         */
        public java.util.List < Roles> getRoles() {
            return this.roles;
        }

        public static final class Builder {
            private java.util.List < Roles> roles; 

            /**
             * The MaxCompute project-level roles.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
