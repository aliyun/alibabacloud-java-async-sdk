// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobTemplatesResponseBody</p>
 */
public class ListJobTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private Templates templates;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public Templates getTemplates() {
        return this.templates;
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
        private String requestId; 
        private Templates templates; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobTemplatesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.templates = model.templates;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of job templates.</p>
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobTemplatesResponseBody build() {
            return new ListJobTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobTemplatesResponseBody</p>
     */
    public static class JobTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayRequest")
        private String arrayRequest;

        @com.aliyun.core.annotation.NameInMap("ClockTime")
        private String clockTime;

        @com.aliyun.core.annotation.NameInMap("CommandLine")
        private String commandLine;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InputFileUrl")
        private String inputFileUrl;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private String mem;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Node")
        private Integer node;

        @com.aliyun.core.annotation.NameInMap("PackagePath")
        private String packagePath;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("ReRunable")
        private Boolean reRunable;

        @com.aliyun.core.annotation.NameInMap("RunasUser")
        private String runasUser;

        @com.aliyun.core.annotation.NameInMap("StderrRedirectPath")
        private String stderrRedirectPath;

        @com.aliyun.core.annotation.NameInMap("StdoutRedirectPath")
        private String stdoutRedirectPath;

        @com.aliyun.core.annotation.NameInMap("Task")
        private Integer task;

        @com.aliyun.core.annotation.NameInMap("Thread")
        private Integer thread;

        @com.aliyun.core.annotation.NameInMap("UnzipCmd")
        private String unzipCmd;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private String variables;

        @com.aliyun.core.annotation.NameInMap("WithUnzipCmd")
        private Boolean withUnzipCmd;

        private JobTemplates(Builder builder) {
            this.arrayRequest = builder.arrayRequest;
            this.clockTime = builder.clockTime;
            this.commandLine = builder.commandLine;
            this.gpu = builder.gpu;
            this.id = builder.id;
            this.inputFileUrl = builder.inputFileUrl;
            this.mem = builder.mem;
            this.name = builder.name;
            this.node = builder.node;
            this.packagePath = builder.packagePath;
            this.priority = builder.priority;
            this.queue = builder.queue;
            this.reRunable = builder.reRunable;
            this.runasUser = builder.runasUser;
            this.stderrRedirectPath = builder.stderrRedirectPath;
            this.stdoutRedirectPath = builder.stdoutRedirectPath;
            this.task = builder.task;
            this.thread = builder.thread;
            this.unzipCmd = builder.unzipCmd;
            this.variables = builder.variables;
            this.withUnzipCmd = builder.withUnzipCmd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobTemplates create() {
            return builder().build();
        }

        /**
         * @return arrayRequest
         */
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        /**
         * @return clockTime
         */
        public String getClockTime() {
            return this.clockTime;
        }

        /**
         * @return commandLine
         */
        public String getCommandLine() {
            return this.commandLine;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inputFileUrl
         */
        public String getInputFileUrl() {
            return this.inputFileUrl;
        }

        /**
         * @return mem
         */
        public String getMem() {
            return this.mem;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return node
         */
        public Integer getNode() {
            return this.node;
        }

        /**
         * @return packagePath
         */
        public String getPackagePath() {
            return this.packagePath;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return reRunable
         */
        public Boolean getReRunable() {
            return this.reRunable;
        }

        /**
         * @return runasUser
         */
        public String getRunasUser() {
            return this.runasUser;
        }

        /**
         * @return stderrRedirectPath
         */
        public String getStderrRedirectPath() {
            return this.stderrRedirectPath;
        }

        /**
         * @return stdoutRedirectPath
         */
        public String getStdoutRedirectPath() {
            return this.stdoutRedirectPath;
        }

        /**
         * @return task
         */
        public Integer getTask() {
            return this.task;
        }

        /**
         * @return thread
         */
        public Integer getThread() {
            return this.thread;
        }

        /**
         * @return unzipCmd
         */
        public String getUnzipCmd() {
            return this.unzipCmd;
        }

        /**
         * @return variables
         */
        public String getVariables() {
            return this.variables;
        }

        /**
         * @return withUnzipCmd
         */
        public Boolean getWithUnzipCmd() {
            return this.withUnzipCmd;
        }

        public static final class Builder {
            private String arrayRequest; 
            private String clockTime; 
            private String commandLine; 
            private Integer gpu; 
            private String id; 
            private String inputFileUrl; 
            private String mem; 
            private String name; 
            private Integer node; 
            private String packagePath; 
            private Integer priority; 
            private String queue; 
            private Boolean reRunable; 
            private String runasUser; 
            private String stderrRedirectPath; 
            private String stdoutRedirectPath; 
            private Integer task; 
            private Integer thread; 
            private String unzipCmd; 
            private String variables; 
            private Boolean withUnzipCmd; 

            private Builder() {
            } 

            private Builder(JobTemplates model) {
                this.arrayRequest = model.arrayRequest;
                this.clockTime = model.clockTime;
                this.commandLine = model.commandLine;
                this.gpu = model.gpu;
                this.id = model.id;
                this.inputFileUrl = model.inputFileUrl;
                this.mem = model.mem;
                this.name = model.name;
                this.node = model.node;
                this.packagePath = model.packagePath;
                this.priority = model.priority;
                this.queue = model.queue;
                this.reRunable = model.reRunable;
                this.runasUser = model.runasUser;
                this.stderrRedirectPath = model.stderrRedirectPath;
                this.stdoutRedirectPath = model.stdoutRedirectPath;
                this.task = model.task;
                this.thread = model.thread;
                this.unzipCmd = model.unzipCmd;
                this.variables = model.variables;
                this.withUnzipCmd = model.withUnzipCmd;
            } 

            /**
             * <p>The queue of the job.</p>
             * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
             * 
             * <strong>example:</strong>
             * <p>2-7:2</p>
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * <p>The maximum running time of the job. Valid formats:</p>
             * <ul>
             * <li>hh:mm:ss</li>
             * <li>mm:ss</li>
             * <li>ss</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12:00:00</p>
             */
            public Builder clockTime(String clockTime) {
                this.clockTime = clockTime;
                return this;
            }

            /**
             * <p>The command that is used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>./LammpsTest/lammps.pbs</p>
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
                return this;
            }

            /**
             * <p>The maximum GPU usage for individual compute nodes. Valid values: 1 to 8.</p>
             * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The ID of the job template.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-job-tmpl-6RxO5y****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-beijing.aliyuncs.com/test.py">https://test.oss-cn-beijing.aliyuncs.com/test.py</a></p>
             */
            public Builder inputFileUrl(String inputFileUrl) {
                this.inputFileUrl = inputFileUrl;
                return this;
            }

            /**
             * <p>The maximum memory usage of a single compute node. The unit can be GB, MB, or KB, and is case-insensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>1GB</p>
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The name of the job template.</p>
             * 
             * <strong>example:</strong>
             * <p>job1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of compute nodes. Valid values: 1 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder node(Integer node) {
                this.node = node;
                return this;
            }

            /**
             * <p>The path that is used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>./jobfolder</p>
             */
            public Builder packagePath(String packagePath) {
                this.packagePath = packagePath;
                return this;
            }

            /**
             * <p>The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The queue of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>Specifies whether the job can be rerun. Valid values:</p>
             * <ul>
             * <li>true: The job can be rerun.</li>
             * <li>false: The job cannot be rerun.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder reRunable(Boolean reRunable) {
                this.reRunable = reRunable;
                return this;
            }

            /**
             * <p>The name of the user that runs the job.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
                return this;
            }

            /**
             * <p>The output file path of stderr.</p>
             * 
             * <strong>example:</strong>
             * <p>./LammpsTest</p>
             */
            public Builder stderrRedirectPath(String stderrRedirectPath) {
                this.stderrRedirectPath = stderrRedirectPath;
                return this;
            }

            /**
             * <p>The output file path of stdout.</p>
             * 
             * <strong>example:</strong>
             * <p>./Lammps</p>
             */
            public Builder stdoutRedirectPath(String stdoutRedirectPath) {
                this.stdoutRedirectPath = stdoutRedirectPath;
                return this;
            }

            /**
             * <p>The number of tasks required by a single compute node. Valid values: 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder task(Integer task) {
                this.task = task;
                return this;
            }

            /**
             * <p>The number of threads required by a single task. Valid values: 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder thread(Integer thread) {
                this.thread = thread;
                return this;
            }

            /**
             * <p>The command that is used to decompress the job files downloaded from an OSS bucket. The parameter takes effect only when WithUnzipCmd is set to true. Valid values:</p>
             * <ul>
             * <li>tar xzf: decompresses GZIP files.</li>
             * <li>tar xf: decompresses TAR files.</li>
             * <li>unzip: decompresses ZIP files.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tar xzf</p>
             */
            public Builder unzipCmd(String unzipCmd) {
                this.unzipCmd = unzipCmd;
                return this;
            }

            /**
             * <p>The environment variables of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>[{Name:,Value:},{Name:,Value:}]</p>
             */
            public Builder variables(String variables) {
                this.variables = variables;
                return this;
            }

            /**
             * <p>Specifies whether to decompress the job files downloaded from an OSS bucket. Valid value:</p>
             * <ul>
             * <li>true: decompresses the job file.</li>
             * <li>false: does not decompress the job file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder withUnzipCmd(Boolean withUnzipCmd) {
                this.withUnzipCmd = withUnzipCmd;
                return this;
            }

            public JobTemplates build() {
                return new JobTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobTemplates")
        private java.util.List<JobTemplates> jobTemplates;

        private Templates(Builder builder) {
            this.jobTemplates = builder.jobTemplates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return jobTemplates
         */
        public java.util.List<JobTemplates> getJobTemplates() {
            return this.jobTemplates;
        }

        public static final class Builder {
            private java.util.List<JobTemplates> jobTemplates; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.jobTemplates = model.jobTemplates;
            } 

            /**
             * JobTemplates.
             */
            public Builder jobTemplates(java.util.List<JobTemplates> jobTemplates) {
                this.jobTemplates = jobTemplates;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
