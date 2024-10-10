// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesResponseBody</p>
 */
public class ListResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListResourcesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesResponseBody create() {
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
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourcesResponseBody build() {
            return new ListResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
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
             * <p>数据源名称</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>数据源类型</p>
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
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
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
             * <p>脚本所属类型</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_PYTHON</p>
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
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
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
             * <p>工作流脚本的id</p>
             * 
             * <strong>example:</strong>
             * <p>123348864897630XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>工作流的脚本路径</p>
             * 
             * <strong>example:</strong>
             * <p>root/demo</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>脚本的运行时信息</p>
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
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("SourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Resources(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSource = builder.dataSource;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.script = builder.script;
            this.sourcePath = builder.sourcePath;
            this.sourceType = builder.sourceType;
            this.targetPath = builder.targetPath;
            this.targetType = builder.targetType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
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
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return script
         */
        public Script getScript() {
            return this.script;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private DataSource dataSource; 
            private String id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private String projectId; 
            private Script script; 
            private String sourcePath; 
            private String sourceType; 
            private String targetPath; 
            private String targetType; 
            private String type; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>函数注册到的数据源信息</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>代表资源组的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>631478864897630XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>资源文件的最近修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>1724505917000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>代表资源名称的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>math.py</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>资源文件的责任人</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>资源文件的项目id</p>
             * 
             * <strong>example:</strong>
             * <p>344247</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>工作流的脚本信息</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>文件目标存储路径</p>
             * 
             * <strong>example:</strong>
             * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>文件资源来源存储类型</p>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>文件来源路径</p>
             * 
             * <strong>example:</strong>
             * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>文件目标存储类型</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>资源类型</p>
             * 
             * <strong>example:</strong>
             * <p>jar</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List < Resources> resources;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.resources = builder.resources;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
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
         * @return resources
         */
        public java.util.List < Resources> getResources() {
            return this.resources;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Resources> resources; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * TotalCount.
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
