// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateJobTemplateRequest</p>
 */
public class CreateJobTemplateRequest extends Request {
    @Query
    @NameInMap("ArrayRequest")
    private String arrayRequest;

    @Query
    @NameInMap("ClockTime")
    private String clockTime;

    @Query
    @NameInMap("CommandLine")
    @Validation(required = true)
    private String commandLine;

    @Query
    @NameInMap("Gpu")
    @Validation(maximum = 20000, minimum = 1)
    private Integer gpu;

    @Query
    @NameInMap("InputFileUrl")
    private String inputFileUrl;

    @Query
    @NameInMap("Mem")
    private String mem;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Node")
    @Validation(maximum = 5000, minimum = 1)
    private Integer node;

    @Query
    @NameInMap("PackagePath")
    private String packagePath;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("Queue")
    private String queue;

    @Query
    @NameInMap("ReRunable")
    private Boolean reRunable;

    @Query
    @NameInMap("RunasUser")
    private String runasUser;

    @Query
    @NameInMap("StderrRedirectPath")
    private String stderrRedirectPath;

    @Query
    @NameInMap("StdoutRedirectPath")
    private String stdoutRedirectPath;

    @Query
    @NameInMap("Task")
    @Validation(maximum = 20000, minimum = 1)
    private Integer task;

    @Query
    @NameInMap("Thread")
    @Validation(maximum = 20000, minimum = 1)
    private Integer thread;

    @Query
    @NameInMap("UnzipCmd")
    private String unzipCmd;

    @Query
    @NameInMap("Variables")
    private String variables;

    @Query
    @NameInMap("WithUnzipCmd")
    private Boolean withUnzipCmd;

    private CreateJobTemplateRequest(Builder builder) {
        super(builder);
        this.arrayRequest = builder.arrayRequest;
        this.clockTime = builder.clockTime;
        this.commandLine = builder.commandLine;
        this.gpu = builder.gpu;
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

    public static CreateJobTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateJobTemplateRequest, Builder> {
        private String arrayRequest; 
        private String clockTime; 
        private String commandLine; 
        private Integer gpu; 
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
            super();
        } 

        private Builder(CreateJobTemplateRequest request) {
            super(request);
            this.arrayRequest = request.arrayRequest;
            this.clockTime = request.clockTime;
            this.commandLine = request.commandLine;
            this.gpu = request.gpu;
            this.inputFileUrl = request.inputFileUrl;
            this.mem = request.mem;
            this.name = request.name;
            this.node = request.node;
            this.packagePath = request.packagePath;
            this.priority = request.priority;
            this.queue = request.queue;
            this.reRunable = request.reRunable;
            this.runasUser = request.runasUser;
            this.stderrRedirectPath = request.stderrRedirectPath;
            this.stdoutRedirectPath = request.stdoutRedirectPath;
            this.task = request.task;
            this.thread = request.thread;
            this.unzipCmd = request.unzipCmd;
            this.variables = request.variables;
            this.withUnzipCmd = request.withUnzipCmd;
        } 

        /**
         * The job array.
         * <p>
         * 
         * Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.
         */
        public Builder arrayRequest(String arrayRequest) {
            this.putQueryParameter("ArrayRequest", arrayRequest);
            this.arrayRequest = arrayRequest;
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
         * The command that is used to run the job.
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * The maximum GPU usage required by a single compute node. Valid values: 1 to 8.
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
         * The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
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
         * The name of the job template. The name must be 2 to 64 characters in length. It must start with a letter and can contain letters, digits, hyphens (-), and underscores (\_).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of compute nodes. Valid values: 1 to 500.
         * <p>
         * 
         * >  If the parameter is not specified, the Task, Thread, Mem, and Gpu parameters become invalid.
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
         * The priority of the job. Valid values: 0 to 9. A large value indicates a high priority.
         * <p>
         * 
         * Default value: 0
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The name of the queue in which the job is run.
         * <p>
         * 
         * You can call the [ListQueues](~~92176~~) operation to query the queue name.
         */
        public Builder queue(String queue) {
            this.putQueryParameter("Queue", queue);
            this.queue = queue;
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
         * The number of tasks required by a single compute node. Valid values: 1 to 1000.
         */
        public Builder task(Integer task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * The number of threads required by a single compute node. Valid values: 1 to 1000.
         */
        public Builder thread(Integer thread) {
            this.putQueryParameter("Thread", thread);
            this.thread = thread;
            return this;
        }

        /**
         * The command that is used to decompress the job files downloaded from an OSS bucket. The parameter takes effect only when WithUnzipCmd is set to true. Valid values:
         * <p>
         * 
         * *   tar xzf: decompresses GZIP files.
         * *   tar xf: decompresses TAR files.
         * *   unzip: decompresses ZIP files.
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

        /**
         * Specifies whether to decompress the job files downloaded from an OSS bucket. Valid values:
         * <p>
         * 
         * *   true: The job files are decompressed.
         * *   false: The job files are not decompressed.
         */
        public Builder withUnzipCmd(Boolean withUnzipCmd) {
            this.putQueryParameter("WithUnzipCmd", withUnzipCmd);
            this.withUnzipCmd = withUnzipCmd;
            return this;
        }

        @Override
        public CreateJobTemplateRequest build() {
            return new CreateJobTemplateRequest(this);
        } 

    } 

}
