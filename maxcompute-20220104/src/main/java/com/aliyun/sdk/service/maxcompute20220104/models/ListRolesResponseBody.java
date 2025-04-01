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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListRolesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a06dfe716686526652451361e80ae</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

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

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

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

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Package extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Package model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

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

            public Package build() {
                return new Package(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

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

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

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

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

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
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Table model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

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

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Acl extends TeaModel {
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

            private Builder() {
            } 

            private Builder(Acl model) {
                this.function = model.function;
                this.instance = model.instance;
                this._package = model._package;
                this.project = model.project;
                this.resource = model.resource;
                this.table = model.table;
            } 

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

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Roles model) {
                this.acl = model.acl;
                this.name = model.name;
                this.policy = model.policy;
                this.type = model.type;
            } 

            /**
             * <p>The ACL-based permissions that are granted to the role.</p>
             */
            public Builder acl(Acl acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>roleA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The policy that is attached to the role.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Statement&quot;: [
             *             {
             *                   &quot;Action&quot;: [
             *                         &quot;odps:<em>&quot;
             *                   ],
             *                   &quot;Effect&quot;: &quot;Allow&quot;,
             *                   &quot;Resource&quot;: [
             *                         &quot;acs:odps:</em>:projects/{projectname}/authorization/packages&quot;
             *                   ]
             *             }
             *       ],
             *       &quot;Version&quot;: &quot;1&quot;
             * }</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The type of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
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
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("roles")
        private java.util.List<Roles> roles;

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
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        public static final class Builder {
            private java.util.List<Roles> roles; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.roles = model.roles;
            } 

            /**
             * <p>The MaxCompute project-level roles.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
