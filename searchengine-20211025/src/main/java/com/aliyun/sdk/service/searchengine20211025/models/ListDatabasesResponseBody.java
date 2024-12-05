// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponseBody</p>
 */
public class ListDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListDatabasesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>NodeTreeVO</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListDatabasesResponseBody build() {
            return new ListDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesResponseBody</p>
     */
    public static class SqlInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private java.util.List < ? > children;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Integer isDir;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parent")
        private Long parent;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SqlInstances(Builder builder) {
            this.children = builder.children;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.isDir = builder.isDir;
            this.name = builder.name;
            this.parent = builder.parent;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlInstances create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < ? > getChildren() {
            return this.children;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isDir
         */
        public Integer getIsDir() {
            return this.isDir;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parent
         */
        public Long getParent() {
            return this.parent;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ? > children; 
            private Long id; 
            private Long instanceId; 
            private Integer isDir; 
            private String name; 
            private Long parent; 
            private Long templateId; 
            private String type; 

            /**
             * children.
             */
            public Builder children(java.util.List < ? > children) {
                this.children = children;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * isDir.
             */
            public Builder isDir(Integer isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parent.
             */
            public Builder parent(Long parent) {
                this.parent = parent;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>table, instance, template, function</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SqlInstances build() {
                return new SqlInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private java.util.List < ? > children;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Integer isDir;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parent")
        private Long parent;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Tables(Builder builder) {
            this.children = builder.children;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.isDir = builder.isDir;
            this.name = builder.name;
            this.parent = builder.parent;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < ? > getChildren() {
            return this.children;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isDir
         */
        public Integer getIsDir() {
            return this.isDir;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parent
         */
        public Long getParent() {
            return this.parent;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ? > children; 
            private Long id; 
            private Long instanceId; 
            private Integer isDir; 
            private String name; 
            private Long parent; 
            private Long templateId; 
            private String type; 

            /**
             * children.
             */
            public Builder children(java.util.List < ? > children) {
                this.children = children;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * isDir.
             */
            public Builder isDir(Integer isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parent.
             */
            public Builder parent(Long parent) {
                this.parent = parent;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>table, instance, template, function</p>
             * 
             * <strong>example:</strong>
             * <p>table</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private java.util.List < ? > children;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Integer isDir;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parent")
        private Long parent;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Templates(Builder builder) {
            this.children = builder.children;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.isDir = builder.isDir;
            this.name = builder.name;
            this.parent = builder.parent;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < ? > getChildren() {
            return this.children;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isDir
         */
        public Integer getIsDir() {
            return this.isDir;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parent
         */
        public Long getParent() {
            return this.parent;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ? > children; 
            private Long id; 
            private Long instanceId; 
            private Integer isDir; 
            private String name; 
            private Long parent; 
            private Long templateId; 
            private String type; 

            /**
             * children.
             */
            public Builder children(java.util.List < ? > children) {
                this.children = children;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * isDir.
             */
            public Builder isDir(Integer isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parent.
             */
            public Builder parent(Long parent) {
                this.parent = parent;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>table, instance, template, function</p>
             * 
             * <strong>example:</strong>
             * <p>template</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("functions")
        private java.util.Map < String, java.util.List<ResultDatabasesFunctionsValue>> functions;

        @com.aliyun.core.annotation.NameInMap("sqlInstances")
        private java.util.List < SqlInstances> sqlInstances;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List < Tables> tables;

        @com.aliyun.core.annotation.NameInMap("templates")
        private java.util.List < Templates> templates;

        private Databases(Builder builder) {
            this.database = builder.database;
            this.functions = builder.functions;
            this.sqlInstances = builder.sqlInstances;
            this.tables = builder.tables;
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return functions
         */
        public java.util.Map < String, java.util.List<ResultDatabasesFunctionsValue>> getFunctions() {
            return this.functions;
        }

        /**
         * @return sqlInstances
         */
        public java.util.List < SqlInstances> getSqlInstances() {
            return this.sqlInstances;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return templates
         */
        public java.util.List < Templates> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private String database; 
            private java.util.Map < String, java.util.List<ResultDatabasesFunctionsValue>> functions; 
            private java.util.List < SqlInstances> sqlInstances; 
            private java.util.List < Tables> tables; 
            private java.util.List < Templates> templates; 

            /**
             * database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * functions.
             */
            public Builder functions(java.util.Map < String, java.util.List<ResultDatabasesFunctionsValue>> functions) {
                this.functions = functions;
                return this;
            }

            /**
             * sqlInstances.
             */
            public Builder sqlInstances(java.util.List < SqlInstances> sqlInstances) {
                this.sqlInstances = sqlInstances;
                return this;
            }

            /**
             * tables.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * templates.
             */
            public Builder templates(java.util.List < Templates> templates) {
                this.templates = templates;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("databases")
        private java.util.List < Databases> databases;

        private Result(Builder builder) {
            this.databases = builder.databases;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 

            /**
             * databases.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
