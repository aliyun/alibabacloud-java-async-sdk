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
 * {@link SubmitJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitJobRequest</p>
 */
public class SubmitJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobRetry")
    private JobRetry jobRetry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArrayRequest")
    private String arrayRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockTime")
    private String clockTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandLine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandLine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gpu")
    private Integer gpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFileUrl")
    private String inputFileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobQueue")
    private String jobQueue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mem")
    private String mem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Node")
    private Integer node;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackagePath")
    private String packagePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCmdLine")
    private String postCmdLine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReRunable")
    private Boolean reRunable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runasUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUserPassword")
    private String runasUserPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StderrRedirectPath")
    private String stderrRedirectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StdoutRedirectPath")
    private String stdoutRedirectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    private Integer task;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Thread")
    private Integer thread;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnzipCmd")
    private String unzipCmd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    private SubmitJobRequest(Builder builder) {
        super(builder);
        this.jobRetry = builder.jobRetry;
        this.arrayRequest = builder.arrayRequest;
        this.async = builder.async;
        this.clockTime = builder.clockTime;
        this.clusterId = builder.clusterId;
        this.commandLine = builder.commandLine;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.inputFileUrl = builder.inputFileUrl;
        this.jobQueue = builder.jobQueue;
        this.mem = builder.mem;
        this.name = builder.name;
        this.node = builder.node;
        this.packagePath = builder.packagePath;
        this.postCmdLine = builder.postCmdLine;
        this.priority = builder.priority;
        this.reRunable = builder.reRunable;
        this.runasUser = builder.runasUser;
        this.runasUserPassword = builder.runasUserPassword;
        this.stderrRedirectPath = builder.stderrRedirectPath;
        this.stdoutRedirectPath = builder.stdoutRedirectPath;
        this.task = builder.task;
        this.thread = builder.thread;
        this.unzipCmd = builder.unzipCmd;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobRetry
     */
    public JobRetry getJobRetry() {
        return this.jobRetry;
    }

    /**
     * @return arrayRequest
     */
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clockTime
     */
    public String getClockTime() {
        return this.clockTime;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return commandLine
     */
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return inputFileUrl
     */
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
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
     * @return postCmdLine
     */
    public String getPostCmdLine() {
        return this.postCmdLine;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return runasUserPassword
     */
    public String getRunasUserPassword() {
        return this.runasUserPassword;
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

    public static final class Builder extends Request.Builder<SubmitJobRequest, Builder> {
        private JobRetry jobRetry; 
        private String arrayRequest; 
        private Boolean async; 
        private String clockTime; 
        private String clusterId; 
        private String commandLine; 
        private Integer cpu; 
        private Integer gpu; 
        private String inputFileUrl; 
        private String jobQueue; 
        private String mem; 
        private String name; 
        private Integer node; 
        private String packagePath; 
        private String postCmdLine; 
        private Integer priority; 
        private Boolean reRunable; 
        private String runasUser; 
        private String runasUserPassword; 
        private String stderrRedirectPath; 
        private String stdoutRedirectPath; 
        private Integer task; 
        private Integer thread; 
        private String unzipCmd; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(SubmitJobRequest request) {
            super(request);
            this.jobRetry = request.jobRetry;
            this.arrayRequest = request.arrayRequest;
            this.async = request.async;
            this.clockTime = request.clockTime;
            this.clusterId = request.clusterId;
            this.commandLine = request.commandLine;
            this.cpu = request.cpu;
            this.gpu = request.gpu;
            this.inputFileUrl = request.inputFileUrl;
            this.jobQueue = request.jobQueue;
            this.mem = request.mem;
            this.name = request.name;
            this.node = request.node;
            this.packagePath = request.packagePath;
            this.postCmdLine = request.postCmdLine;
            this.priority = request.priority;
            this.reRunable = request.reRunable;
            this.runasUser = request.runasUser;
            this.runasUserPassword = request.runasUserPassword;
            this.stderrRedirectPath = request.stderrRedirectPath;
            this.stdoutRedirectPath = request.stdoutRedirectPath;
            this.task = request.task;
            this.thread = request.thread;
            this.unzipCmd = request.unzipCmd;
            this.variables = request.variables;
        } 

        /**
         * JobRetry.
         */
        public Builder jobRetry(JobRetry jobRetry) {
            this.putQueryParameter("JobRetry", jobRetry);
            this.jobRetry = jobRetry;
            return this;
        }

        /**
         * <p>The job array.</p>
         * <p>Format: X-Y:Z. The minimum index value X is the first index. The maximum index value Y is the last index. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
         * 
         * <strong>example:</strong>
         * <p>1-10:2</p>
         */
        public Builder arrayRequest(String arrayRequest) {
            this.putQueryParameter("ArrayRequest", arrayRequest);
            this.arrayRequest = arrayRequest;
            return this;
        }

        /**
         * <p>Specifies whether to use an asynchronous link to submit the job.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The maximum running time of the job. Valid formats:</p>
         * <ul>
         * <li>hh:mm:ss</li>
         * <li>mm:ss</li>
         * <li>ss</li>
         * </ul>
         * <p>We recommend that you use the hh:mm:ss format. If the maximum running time is 12 hours, set the value to 12:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
        public Builder clockTime(String clockTime) {
            this.putQueryParameter("ClockTime", clockTime);
            this.clockTime = clockTime;
            return this;
        }

        /**
         * <p>The command that is used to run the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the user that runs the job.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the users of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>./LammpsTest/lammps.pbs</p>
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * <p>The number of CPU cores required by a single compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The maximum GPU usage required by a single compute node.</p>
         * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpu(Integer gpu) {
            this.putQueryParameter("Gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * <p>The URL of the job file that is uploaded to an Object Storage Service (OSS) bucket.</p>
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
            return this;
        }

        /**
         * <p>The name of the queue in which the job is run.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/92176.html">ListQueues</a> operation to query the name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * <p>The maximum memory usage required by a single compute node. Unit: GB, MB, or KB. The unit is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>1GB</p>
         */
        public Builder mem(String mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        /**
         * <p>job1</p>
         * 
         * <strong>example:</strong>
         * <p>jobtest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of compute nodes required to run the job.</p>
         * <blockquote>
         * <p>If the parameter is not specified, the Cpu, Task, Thread, Mem, and Gpu parameters become invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder node(Integer node) {
            this.putQueryParameter("Node", node);
            this.node = node;
            return this;
        }

        /**
         * <p>The path that is used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>./Tem</p>
         */
        public Builder packagePath(String packagePath) {
            this.putQueryParameter("PackagePath", packagePath);
            this.packagePath = packagePath;
            return this;
        }

        /**
         * <p>The command to perform on the job after the job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>example.sh</p>
         */
        public Builder postCmdLine(String postCmdLine) {
            this.putQueryParameter("PostCmdLine", postCmdLine);
            this.postCmdLine = postCmdLine;
            return this;
        }

        /**
         * <p>The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
            this.putQueryParameter("ReRunable", reRunable);
            this.reRunable = reRunable;
            return this;
        }

        /**
         * <p>The password that corresponds to the username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * <p>The name of the job. The name must be 6 to 30 characters in length and start with a letter. It can contain letters, digits, and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
            return this;
        }

        /**
         * <p>The output file path of stderr.</p>
         * 
         * <strong>example:</strong>
         * <p>./LammpsTest</p>
         */
        public Builder stderrRedirectPath(String stderrRedirectPath) {
            this.putQueryParameter("StderrRedirectPath", stderrRedirectPath);
            this.stderrRedirectPath = stderrRedirectPath;
            return this;
        }

        /**
         * <p>The output file path of stdout.</p>
         * 
         * <strong>example:</strong>
         * <p>./LammpsTest</p>
         */
        public Builder stdoutRedirectPath(String stdoutRedirectPath) {
            this.putQueryParameter("StdoutRedirectPath", stdoutRedirectPath);
            this.stdoutRedirectPath = stdoutRedirectPath;
            return this;
        }

        /**
         * <p>The number of processes created for a single compute node.</p>
         * <p>The parameter is applicable to Message Passing Interface (MPI) jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder task(Integer task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * <p>The number of threads created for a single compute node.</p>
         * <p>The parameter is applicable to OpenMP jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder thread(Integer thread) {
            this.putQueryParameter("Thread", thread);
            this.thread = thread;
            return this;
        }

        /**
         * <p>The command for file decompression. The command that is used to decompress the job files downloaded from an OSS bucket. Valid values:</p>
         * <ul>
         * <li>tar xzf: Decompresses GZIP files.</li>
         * <li>tar xf: Decompresses TAR files.</li>
         * <li>unzip: Decompresses ZIP files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tar xzf</p>
         */
        public Builder unzipCmd(String unzipCmd) {
            this.putQueryParameter("UnzipCmd", unzipCmd);
            this.unzipCmd = unzipCmd;
            return this;
        }

        /**
         * <p>The runtime variables passed to the job. They can be accessed by using environment variables in the executable file.</p>
         * 
         * <strong>example:</strong>
         * <p>[{Name:test1,Value:value1},{Name:test2,Value:value2}]</p>
         */
        public Builder variables(String variables) {
            this.putQueryParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public SubmitJobRequest build() {
            return new SubmitJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitJobRequest</p>
     */
    public static class JobRetry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("OnExitCode")
        private Integer onExitCode;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private JobRetry(Builder builder) {
            this.count = builder.count;
            this.onExitCode = builder.onExitCode;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobRetry create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return onExitCode
         */
        public Integer getOnExitCode() {
            return this.onExitCode;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private Integer count; 
            private Integer onExitCode; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(JobRetry model) {
                this.count = model.count;
                this.onExitCode = model.onExitCode;
                this.priority = model.priority;
            } 

            /**
             * <p>The number of retries for the job. Valid values: 1 to 10. You can only retry jobs that are run on the PBS clusters.</p>
             * <blockquote>
             * <p> If this parameter is left empty, the JobRetry.Priority and JobRetry.OnExitCode parameters do not take effect.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The retry condition of the job. If the exit code is the value of the parameter, the job retry is triggered.</p>
             * <blockquote>
             * <p> If this parameter is left empty, the job retry is triggered when the exit code is not 0.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder onExitCode(Integer onExitCode) {
                this.onExitCode = onExitCode;
                return this;
            }

            /**
             * <p>The priority of the job retry. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
             * <blockquote>
             * <p> If this parameter is left empty, the priority of the job retry is min {Priority of the original job +1, 9}.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public JobRetry build() {
                return new JobRetry(this);
            } 

        } 

    }
}
