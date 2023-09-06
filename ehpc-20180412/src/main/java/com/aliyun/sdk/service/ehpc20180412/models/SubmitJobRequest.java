// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitJobRequest</p>
 */
public class SubmitJobRequest extends Request {
    @Query
    @NameInMap("JobRetry")
    private JobRetry jobRetry;

    @Query
    @NameInMap("ArrayRequest")
    private String arrayRequest;

    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClockTime")
    private String clockTime;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CommandLine")
    @Validation(required = true)
    private String commandLine;

    @Query
    @NameInMap("ContainerId")
    private String containerId;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("Gpu")
    private Integer gpu;

    @Query
    @NameInMap("InputFileUrl")
    private String inputFileUrl;

    @Query
    @NameInMap("JobQueue")
    private String jobQueue;

    @Query
    @NameInMap("Mem")
    private String mem;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Node")
    private Integer node;

    @Query
    @NameInMap("PackagePath")
    private String packagePath;

    @Query
    @NameInMap("PostCmdLine")
    private String postCmdLine;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("ReRunable")
    private Boolean reRunable;

    @Query
    @NameInMap("RunasUser")
    @Validation(required = true)
    private String runasUser;

    @Query
    @NameInMap("RunasUserPassword")
    private String runasUserPassword;

    @Query
    @NameInMap("StderrRedirectPath")
    private String stderrRedirectPath;

    @Query
    @NameInMap("StdoutRedirectPath")
    private String stdoutRedirectPath;

    @Query
    @NameInMap("Task")
    private Integer task;

    @Query
    @NameInMap("Thread")
    private Integer thread;

    @Query
    @NameInMap("UnzipCmd")
    private String unzipCmd;

    @Query
    @NameInMap("Variables")
    private String variables;

    private SubmitJobRequest(Builder builder) {
        super(builder);
        this.jobRetry = builder.jobRetry;
        this.arrayRequest = builder.arrayRequest;
        this.async = builder.async;
        this.clockTime = builder.clockTime;
        this.clusterId = builder.clusterId;
        this.commandLine = builder.commandLine;
        this.containerId = builder.containerId;
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
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
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
        private String containerId; 
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
            this.containerId = request.containerId;
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
         * The job array.
         * <p>
         * 
         * Format: X-Y:Z. The minimum index value X is the first index. The maximum index value Y is the last index. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.
         */
        public Builder arrayRequest(String arrayRequest) {
            this.putQueryParameter("ArrayRequest", arrayRequest);
            this.arrayRequest = arrayRequest;
            return this;
        }

        /**
         * Specifies whether to use an asynchronous link to submit the job.
         * <p>
         * 
         * Default value: false.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The maximum running time of the job. Valid formats:
         * <p>
         * 
         * *   hh:mm:ss
         * *   mm:ss
         * *   ss
         * 
         * We recommend that you use the hh:mm:ss format. If the maximum running time is 12 hours, set the value to 12:00:00.
         */
        public Builder clockTime(String clockTime) {
            this.putQueryParameter("ClockTime", clockTime);
            this.clockTime = clockTime;
            return this;
        }

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The command that is used to run the job.
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * The ID of the containerized application. If you want to use a container application, you must specify its ID.
         * <p>
         * 
         * You can call the [ListContainerApps](~~87333~~) operation to query the container application ID.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * The number of CPU cores required by a single compute node.
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The maximum GPU usage required by a single compute node.
         * <p>
         * 
         * The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.
         */
        public Builder gpu(Integer gpu) {
            this.putQueryParameter("Gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * The URL of the job file that is uploaded to an Object Storage Service (OSS) bucket.
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
            return this;
        }

        /**
         * The name of the queue in which the job is run.
         * <p>
         * 
         * You can call the [ListQueues](~~92176~~) operation to query the name of the queue.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * The maximum memory usage required by a single compute node. Unit: GB, MB, or KB. The unit is case-insensitive.
         */
        public Builder mem(String mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        /**
         * The name of the job. The name must be 6 to 30 characters in length and start with a letter. It can contain letters, digits, and periods (.).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of compute nodes required to run the job.
         * <p>
         * 
         * > If the parameter is not specified, the Cpu, Task, Thread, Mem, and Gpu parameters become invalid.
         */
        public Builder node(Integer node) {
            this.putQueryParameter("Node", node);
            this.node = node;
            return this;
        }

        /**
         * The path that is used to run the job.
         */
        public Builder packagePath(String packagePath) {
            this.putQueryParameter("PackagePath", packagePath);
            this.packagePath = packagePath;
            return this;
        }

        /**
         * The command to perform on the job after the job is submitted.
         */
        public Builder postCmdLine(String postCmdLine) {
            this.putQueryParameter("PostCmdLine", postCmdLine);
            this.postCmdLine = postCmdLine;
            return this;
        }

        /**
         * The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Specifies whether the job can be rerun. Valid values:
         * <p>
         * 
         * *   true: The job can be rerun.
         * *   false: The job cannot be rerun.
         */
        public Builder reRunable(Boolean reRunable) {
            this.putQueryParameter("ReRunable", reRunable);
            this.reRunable = reRunable;
            return this;
        }

        /**
         * The name of the user that runs the job.
         * <p>
         * 
         * You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * The password that corresponds to the username.
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
            return this;
        }

        /**
         * The output file path of stderr.
         */
        public Builder stderrRedirectPath(String stderrRedirectPath) {
            this.putQueryParameter("StderrRedirectPath", stderrRedirectPath);
            this.stderrRedirectPath = stderrRedirectPath;
            return this;
        }

        /**
         * The output file path of stdout.
         */
        public Builder stdoutRedirectPath(String stdoutRedirectPath) {
            this.putQueryParameter("StdoutRedirectPath", stdoutRedirectPath);
            this.stdoutRedirectPath = stdoutRedirectPath;
            return this;
        }

        /**
         * The number of processes created for a single compute node.
         * <p>
         * 
         * The parameter is applicable to Message Passing Interface (MPI) jobs.
         */
        public Builder task(Integer task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * The number of threads created for a single compute node.
         * <p>
         * 
         * The parameter is applicable to OpenMP jobs.
         */
        public Builder thread(Integer thread) {
            this.putQueryParameter("Thread", thread);
            this.thread = thread;
            return this;
        }

        /**
         * The command for file decompression. The command that is used to decompress the job files downloaded from an OSS bucket. Valid values:
         * <p>
         * 
         * *   tar xzf: Decompresses GZIP files.
         * *   tar xf: Decompresses TAR files.
         * *   unzip: Decompresses ZIP files.
         */
        public Builder unzipCmd(String unzipCmd) {
            this.putQueryParameter("UnzipCmd", unzipCmd);
            this.unzipCmd = unzipCmd;
            return this;
        }

        /**
         * The runtime variables passed to the job. They can be accessed by using environment variables in the executable file.
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

    public static class JobRetry extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("OnExitCode")
        private Integer onExitCode;

        @NameInMap("Priority")
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

            /**
             * The number of retries for the job. Valid values: 1 to 10. You can only retry jobs that are run on the PBS clusters.
             * <p>
             * 
             * >  If this parameter is left empty, the JobRetry.Priority and JobRetry.OnExitCode parameters do not take effect.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The retry condition of the job. If the exit code is the value of the parameter, the job retry is triggered.
             * <p>
             * 
             * >  If this parameter is left empty, the job retry is triggered when the exit code is not 0.
             */
            public Builder onExitCode(Integer onExitCode) {
                this.onExitCode = onExitCode;
                return this;
            }

            /**
             * The priority of the job retry. Valid values: 0 to 9. A larger value indicates a higher priority.
             * <p>
             * 
             * >  If this parameter is left empty, the priority of the job retry is min {Priority of the original job +1, 9}.
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
