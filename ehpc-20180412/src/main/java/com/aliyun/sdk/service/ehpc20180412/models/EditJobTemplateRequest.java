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
 * {@link EditJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>EditJobTemplateRequest</p>
 */
public class EditJobTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArrayRequest")
    private String arrayRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockTime")
    private String clockTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandLine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandLine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gpu")
    @com.aliyun.core.annotation.Validation(maximum = 20000, minimum = 1)
    private Integer gpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFileUrl")
    private String inputFileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mem")
    private String mem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Node")
    @com.aliyun.core.annotation.Validation(maximum = 5000, minimum = 1)
    private Integer node;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackagePath")
    private String packagePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Queue")
    private String queue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReRunable")
    private Boolean reRunable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUser")
    private String runasUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StderrRedirectPath")
    private String stderrRedirectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StdoutRedirectPath")
    private String stdoutRedirectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    @com.aliyun.core.annotation.Validation(maximum = 20000, minimum = 1)
    private Integer task;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Thread")
    @com.aliyun.core.annotation.Validation(maximum = 20000, minimum = 1)
    private Integer thread;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnzipCmd")
    private String unzipCmd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithUnzipCmd")
    private Boolean withUnzipCmd;

    private EditJobTemplateRequest(Builder builder) {
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
        this.templateId = builder.templateId;
        this.thread = builder.thread;
        this.unzipCmd = builder.unzipCmd;
        this.variables = builder.variables;
        this.withUnzipCmd = builder.withUnzipCmd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditJobTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
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

    public static final class Builder extends Request.Builder<EditJobTemplateRequest, Builder> {
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
        private String templateId; 
        private Integer thread; 
        private String unzipCmd; 
        private String variables; 
        private Boolean withUnzipCmd; 

        private Builder() {
            super();
        } 

        private Builder(EditJobTemplateRequest request) {
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
            this.templateId = request.templateId;
            this.thread = request.thread;
            this.unzipCmd = request.unzipCmd;
            this.variables = request.variables;
            this.withUnzipCmd = request.withUnzipCmd;
        } 

        /**
         * <p>The job array.</p>
         * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
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
         * <p>./LammpsTest/lammps.pbs</p>
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * <p>The maximum GPU usage required by a single compute node. Valid values: 1 to 8.</p>
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
         * <p>The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-beijing.aliyuncs.com/test.py">https://test.oss-cn-beijing.aliyuncs.com/test.py</a></p>
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
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
         * <p>The name of the job template.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87248.html">ListJobTemplates</a> operation to obtain the job template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jobTemapleteName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of the compute nodes. Valid values: 1 to 500.</p>
         * <blockquote>
         * <p> If the parameter is not specified, the Task, Thread, Mem, and Gpu parameters become invalid.</p>
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
         * <p>./packageFolder</p>
         */
        public Builder packagePath(String packagePath) {
            this.putQueryParameter("PackagePath", packagePath);
            this.packagePath = packagePath;
            return this;
        }

        /**
         * <p>The priority of the job. Valid values: 0 to 9. A large value indicates a high priority.</p>
         * <p>Default value: 0</p>
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
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        public Builder queue(String queue) {
            this.putQueryParameter("Queue", queue);
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
            this.putQueryParameter("ReRunable", reRunable);
            this.reRunable = reRunable;
            return this;
        }

        /**
         * <p>The name of the user that runs the job.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the users of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * <p>The output file path of stderr.</p>
         * 
         * <strong>example:</strong>
         * <p>./Lammps</p>
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
         * <p>The number of tasks required by a single compute node. Valid values: 1 to 1000.</p>
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
         * <p>The ID of the job template.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87248.html">ListJobTemplates</a> operation to obtain the job template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-job-tmpl-6RxO5y****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The number of threads required by a single compute node. Valid values: 1 to 1000.</p>
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
            this.putQueryParameter("UnzipCmd", unzipCmd);
            this.unzipCmd = unzipCmd;
            return this;
        }

        /**
         * <p>The runtime variables passed to the job. They can be accessed by using environment variables in the executable file.</p>
         * 
         * <strong>example:</strong>
         * <p>[{Name:,Value:},{Name:,Value:}]</p>
         */
        public Builder variables(String variables) {
            this.putQueryParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * <p>Specifies whether to decompress the job files downloaded from an OSS bucket. Valid values:</p>
         * <ul>
         * <li>true: The job files are decompressed.</li>
         * <li>false: The job files are not decompressed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withUnzipCmd(Boolean withUnzipCmd) {
            this.putQueryParameter("WithUnzipCmd", withUnzipCmd);
            this.withUnzipCmd = withUnzipCmd;
            return this;
        }

        @Override
        public EditJobTemplateRequest build() {
            return new EditJobTemplateRequest(this);
        } 

    } 

}
