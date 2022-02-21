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

        private Builder(CreateJobTemplateRequest response) {
            super(response);
            this.arrayRequest = response.arrayRequest;
            this.clockTime = response.clockTime;
            this.commandLine = response.commandLine;
            this.gpu = response.gpu;
            this.inputFileUrl = response.inputFileUrl;
            this.mem = response.mem;
            this.name = response.name;
            this.node = response.node;
            this.packagePath = response.packagePath;
            this.priority = response.priority;
            this.queue = response.queue;
            this.reRunable = response.reRunable;
            this.runasUser = response.runasUser;
            this.stderrRedirectPath = response.stderrRedirectPath;
            this.stdoutRedirectPath = response.stdoutRedirectPath;
            this.task = response.task;
            this.thread = response.thread;
            this.unzipCmd = response.unzipCmd;
            this.variables = response.variables;
            this.withUnzipCmd = response.withUnzipCmd;
        } 

        /**
         * ArrayRequest.
         */
        public Builder arrayRequest(String arrayRequest) {
            this.putQueryParameter("ArrayRequest", arrayRequest);
            this.arrayRequest = arrayRequest;
            return this;
        }

        /**
         * ClockTime.
         */
        public Builder clockTime(String clockTime) {
            this.putQueryParameter("ClockTime", clockTime);
            this.clockTime = clockTime;
            return this;
        }

        /**
         * CommandLine.
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * Gpu.
         */
        public Builder gpu(Integer gpu) {
            this.putQueryParameter("Gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * InputFileUrl.
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
            return this;
        }

        /**
         * Mem.
         */
        public Builder mem(String mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Node.
         */
        public Builder node(Integer node) {
            this.putQueryParameter("Node", node);
            this.node = node;
            return this;
        }

        /**
         * PackagePath.
         */
        public Builder packagePath(String packagePath) {
            this.putQueryParameter("PackagePath", packagePath);
            this.packagePath = packagePath;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Queue.
         */
        public Builder queue(String queue) {
            this.putQueryParameter("Queue", queue);
            this.queue = queue;
            return this;
        }

        /**
         * ReRunable.
         */
        public Builder reRunable(Boolean reRunable) {
            this.putQueryParameter("ReRunable", reRunable);
            this.reRunable = reRunable;
            return this;
        }

        /**
         * RunasUser.
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * StderrRedirectPath.
         */
        public Builder stderrRedirectPath(String stderrRedirectPath) {
            this.putQueryParameter("StderrRedirectPath", stderrRedirectPath);
            this.stderrRedirectPath = stderrRedirectPath;
            return this;
        }

        /**
         * StdoutRedirectPath.
         */
        public Builder stdoutRedirectPath(String stdoutRedirectPath) {
            this.putQueryParameter("StdoutRedirectPath", stdoutRedirectPath);
            this.stdoutRedirectPath = stdoutRedirectPath;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(Integer task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * Thread.
         */
        public Builder thread(Integer thread) {
            this.putQueryParameter("Thread", thread);
            this.thread = thread;
            return this;
        }

        /**
         * UnzipCmd.
         */
        public Builder unzipCmd(String unzipCmd) {
            this.putQueryParameter("UnzipCmd", unzipCmd);
            this.unzipCmd = unzipCmd;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(String variables) {
            this.putQueryParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * WithUnzipCmd.
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
