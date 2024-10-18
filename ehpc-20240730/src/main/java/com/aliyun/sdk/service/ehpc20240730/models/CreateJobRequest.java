// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobSpec")
    private JobSpec jobSpec;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobName = builder.jobName;
        this.jobSpec = builder.jobSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobSpec
     */
    public JobSpec getJobSpec() {
        return this.jobSpec;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private String clusterId; 
        private String jobName; 
        private JobSpec jobSpec; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobName = request.jobName;
            this.jobSpec = request.jobSpec;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
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
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestJob</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The job configurations.</p>
         */
        public Builder jobSpec(JobSpec jobSpec) {
            String jobSpecShrink = shrink(jobSpec, "JobSpec", "json");
            this.putQueryParameter("JobSpec", jobSpecShrink);
            this.jobSpec = jobSpec;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("Gpus")
        private Integer gpus;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private Integer nodes;

        private Resources(Builder builder) {
            this.cores = builder.cores;
            this.gpus = builder.gpus;
            this.memory = builder.memory;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return gpus
         */
        public Integer getGpus() {
            return this.gpus;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return nodes
         */
        public Integer getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private Integer cores; 
            private Integer gpus; 
            private String memory; 
            private Integer nodes; 

            /**
             * <p>The number of vCPUs to be allocated to each compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The number of GPUs to be allocated to each compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpus(Integer gpus) {
                this.gpus = gpus;
                return this;
            }

            /**
             * <p>The memory size to be allocated to each compute node. The memory size is in string format. Unit: MB or GB.</p>
             * 
             * <strong>example:</strong>
             * <p>4gb</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of compute nodes to be allocated to the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodes(Integer nodes) {
                this.nodes = nodes;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class JobSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayRequest")
        private String arrayRequest;

        @com.aliyun.core.annotation.NameInMap("CommandLine")
        @com.aliyun.core.annotation.Validation(required = true)
        private String commandLine;

        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("PostCmdLine")
        private String postCmdLine;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private Resources resources;

        @com.aliyun.core.annotation.NameInMap("RunasUser")
        private String runasUser;

        @com.aliyun.core.annotation.NameInMap("RunasUserPassword")
        private String runasUserPassword;

        @com.aliyun.core.annotation.NameInMap("StderrPath")
        private String stderrPath;

        @com.aliyun.core.annotation.NameInMap("StdoutPath")
        private String stdoutPath;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private String variables;

        @com.aliyun.core.annotation.NameInMap("WallTime")
        private String wallTime;

        private JobSpec(Builder builder) {
            this.arrayRequest = builder.arrayRequest;
            this.commandLine = builder.commandLine;
            this.jobQueue = builder.jobQueue;
            this.postCmdLine = builder.postCmdLine;
            this.priority = builder.priority;
            this.resources = builder.resources;
            this.runasUser = builder.runasUser;
            this.runasUserPassword = builder.runasUserPassword;
            this.stderrPath = builder.stderrPath;
            this.stdoutPath = builder.stdoutPath;
            this.variables = builder.variables;
            this.wallTime = builder.wallTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSpec create() {
            return builder().build();
        }

        /**
         * @return arrayRequest
         */
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        /**
         * @return commandLine
         */
        public String getCommandLine() {
            return this.commandLine;
        }

        /**
         * @return jobQueue
         */
        public String getJobQueue() {
            return this.jobQueue;
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
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
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
         * @return stderrPath
         */
        public String getStderrPath() {
            return this.stderrPath;
        }

        /**
         * @return stdoutPath
         */
        public String getStdoutPath() {
            return this.stdoutPath;
        }

        /**
         * @return variables
         */
        public String getVariables() {
            return this.variables;
        }

        /**
         * @return wallTime
         */
        public String getWallTime() {
            return this.wallTime;
        }

        public static final class Builder {
            private String arrayRequest; 
            private String commandLine; 
            private String jobQueue; 
            private String postCmdLine; 
            private String priority; 
            private Resources resources; 
            private String runasUser; 
            private String runasUserPassword; 
            private String stderrPath; 
            private String stdoutPath; 
            private String variables; 
            private String wallTime; 

            /**
             * <p>The jobs in the queue.</p>
             * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
             * 
             * <strong>example:</strong>
             * <p>1-5:2</p>
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * <p>The command or script to run the job. If you want to use a command, you must specify the full path of the command, for example, /bin/ping.</p>
             * <p>If you want to use a script, you must make sure that you have the execution permissions on it. By default, the user root directory ~/ is used as the default script path on the cluster side. If your script is not in that directory, you must specify the full path in this parameter, such as /home/xxx/job.sh</p>
             * <p>If you want to run the job directly by using the CLI, you must specify the absolute path of the command and add two hyphens and a space (-- ) before the path, such as -- /bin/ping -c 10 localhost.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/xxx/test.job</p>
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
                return this;
            }

            /**
             * <p>The queue to which the job belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>comp</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The post-processing command of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>/bin/sleep 10</p>
             */
            public Builder postCmdLine(String postCmdLine) {
                this.postCmdLine = postCmdLine;
                return this;
            }

            /**
             * <p>The job priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The resource configurations of the job.</p>
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The cluster-side user as which you want to submit the job.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
                return this;
            }

            /**
             * <p>The password of the user specified by the RunasUser parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder runasUserPassword(String runasUserPassword) {
                this.runasUserPassword = runasUserPassword;
                return this;
            }

            /**
             * <p>The path of the standard error output file of the job. You need to specify the full path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/xxx/job.err</p>
             */
            public Builder stderrPath(String stderrPath) {
                this.stderrPath = stderrPath;
                return this;
            }

            /**
             * <p>The path of the standard output file of the job. You need to specify the full path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/xxx/job.out</p>
             */
            public Builder stdoutPath(String stdoutPath) {
                this.stdoutPath = stdoutPath;
                return this;
            }

            /**
             * <p>The environment variables of the job. The value is a string in the JSON array format. Each array member is a JSON object that contains two members: Name and Value. Name indicates the name of the environment variable, and Value indicates the value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Name&quot;:&quot;x&quot;, &quot;Value&quot;:&quot;y&quot;}]</p>
             */
            public Builder variables(String variables) {
                this.variables = variables;
                return this;
            }

            /**
             * <p>The maximum duration for which the job can be run. Format: <code>hour: minute: second</code>. For example, <code>01:00:00</code> indicates 1 hour.</p>
             * 
             * <strong>example:</strong>
             * <p>360:48:50</p>
             */
            public Builder wallTime(String wallTime) {
                this.wallTime = wallTime;
                return this;
            }

            public JobSpec build() {
                return new JobSpec(this);
            } 

        } 

    }
}
