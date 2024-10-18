// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponseBody</p>
 */
public class ListFunctionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFunctionsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89FB2BF0-EB00-5D03-9C34-05931001XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionsResponseBody build() {
            return new ListFunctionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private RuntimeResource(Builder builder) {
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String resourceGroupId; 

            /**
             * <p>The ID of the resource group used when you run the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>S_resgrop_xxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        private Runtime(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        public static final class Builder {
            private String command; 

            /**
             * <p>The command.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_FUNCTION</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private Runtime runtime;

        private Script(Builder builder) {
            this.id = builder.id;
            this.path = builder.path;
            this.runtime = builder.runtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        public static final class Builder {
            private String id; 
            private String path; 
            private Runtime runtime; 

            /**
             * <p>The script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>652567824470354XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The script path.</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The runtime.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class Functions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArmResource")
        private String armResource;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        @com.aliyun.core.annotation.NameInMap("CommandDescription")
        private String commandDescription;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EmbeddedCode")
        private String embeddedCode;

        @com.aliyun.core.annotation.NameInMap("EmbeddedCodeType")
        private String embeddedCodeType;

        @com.aliyun.core.annotation.NameInMap("EmbeddedResourceType")
        private String embeddedResourceType;

        @com.aliyun.core.annotation.NameInMap("ExampleDescription")
        private String exampleDescription;

        @com.aliyun.core.annotation.NameInMap("FileResource")
        private String fileResource;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ReturnValueDescription")
        private String returnValueDescription;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Functions(Builder builder) {
            this.armResource = builder.armResource;
            this.className = builder.className;
            this.commandDescription = builder.commandDescription;
            this.createTime = builder.createTime;
            this.dataSource = builder.dataSource;
            this.databaseName = builder.databaseName;
            this.description = builder.description;
            this.embeddedCode = builder.embeddedCode;
            this.embeddedCodeType = builder.embeddedCodeType;
            this.embeddedResourceType = builder.embeddedResourceType;
            this.exampleDescription = builder.exampleDescription;
            this.fileResource = builder.fileResource;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.parameterDescription = builder.parameterDescription;
            this.projectId = builder.projectId;
            this.returnValueDescription = builder.returnValueDescription;
            this.runtimeResource = builder.runtimeResource;
            this.script = builder.script;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return armResource
         */
        public String getArmResource() {
            return this.armResource;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return commandDescription
         */
        public String getCommandDescription() {
            return this.commandDescription;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return embeddedCode
         */
        public String getEmbeddedCode() {
            return this.embeddedCode;
        }

        /**
         * @return embeddedCodeType
         */
        public String getEmbeddedCodeType() {
            return this.embeddedCodeType;
        }

        /**
         * @return embeddedResourceType
         */
        public String getEmbeddedResourceType() {
            return this.embeddedResourceType;
        }

        /**
         * @return exampleDescription
         */
        public String getExampleDescription() {
            return this.exampleDescription;
        }

        /**
         * @return fileResource
         */
        public String getFileResource() {
            return this.fileResource;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parameterDescription
         */
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return returnValueDescription
         */
        public String getReturnValueDescription() {
            return this.returnValueDescription;
        }

        /**
         * @return runtimeResource
         */
        public RuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        /**
         * @return script
         */
        public Script getScript() {
            return this.script;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String armResource; 
            private String className; 
            private String commandDescription; 
            private Long createTime; 
            private DataSource dataSource; 
            private String databaseName; 
            private String description; 
            private String embeddedCode; 
            private String embeddedCodeType; 
            private String embeddedResourceType; 
            private String exampleDescription; 
            private String fileResource; 
            private String id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private String parameterDescription; 
            private String projectId; 
            private String returnValueDescription; 
            private RuntimeResource runtimeResource; 
            private Script script; 
            private String type; 

            /**
             * <p>The file resources in an Advanced RISC Machines (ARM) cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.jar,yyy.jar</p>
             */
            public Builder armResource(String armResource) {
                this.armResource = armResource;
                return this;
            }

            /**
             * <p>The fully qualified class name of the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>com.demo.Main</p>
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * <p>The description of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>testUdf(xx,yy)</p>
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
                return this;
            }

            /**
             * <p>The time when the UDF was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1655953028000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data source information about the UDF.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The name of the database. This parameter is returned for E-MapReduce (EMR) functions.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The overall description of the UDF.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The code of the embedded UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>print(&quot;hello,world!&quot;)</p>
             */
            public Builder embeddedCode(String embeddedCode) {
                this.embeddedCode = embeddedCode;
                return this;
            }

            /**
             * <p>The type of the nested code.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Python2</li>
             * <li>Python3</li>
             * <li>Java8</li>
             * <li>Java11</li>
             * <li>Java17</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Python2</p>
             */
            public Builder embeddedCodeType(String embeddedCodeType) {
                this.embeddedCodeType = embeddedCodeType;
                return this;
            }

            /**
             * <p>The type of the nested resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>File: general resources</li>
             * <li>Embedded: embedded resources</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>File</p>
             */
            public Builder embeddedResourceType(String embeddedResourceType) {
                this.embeddedResourceType = embeddedResourceType;
                return this;
            }

            /**
             * <p>The description of the example.</p>
             */
            public Builder exampleDescription(String exampleDescription) {
                this.exampleDescription = exampleDescription;
                return this;
            }

            /**
             * <p>The files resources.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.jar,yyy.jar</p>
             */
            public Builder fileResource(String fileResource) {
                this.fileResource = fileResource;
                return this;
            }

            /**
             * <p>The ID of the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>580667964888595XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the UDF was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1655953028000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the UDF.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the UDF belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>307XXX</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The description of the return value.</p>
             */
            public Builder returnValueDescription(String returnValueDescription) {
                this.returnValueDescription = returnValueDescription;
                return this;
            }

            /**
             * <p>The information about the resource group used when you run the UDF.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The script information about the UDF.</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The UDF type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>MATH: mathematical operation function</li>
             * <li>AGGREGATE: aggregate function</li>
             * <li>STRING: string processing function</li>
             * <li>DATE: date function</li>
             * <li>ANALYTIC: window function</li>
             * <li>OTHER: others</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MATH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Functions")
        private java.util.List < Functions> functions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.functions = builder.functions;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return functions
         */
        public java.util.List < Functions> getFunctions() {
            return this.functions;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Functions> functions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The UDFs.</p>
             */
            public Builder functions(java.util.List < Functions> functions) {
                this.functions = functions;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>294</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
