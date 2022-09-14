// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

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
    @NameInMap("ArrayRequest")
    private String arrayRequest;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CommandLine")
    @Validation(required = true)
    private String commandLine;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PackagePath")
    private String packagePath;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("ReRunable")
    private Boolean reRunable;

    @Query
    @NameInMap("RunasUser")
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
    @NameInMap("Variables")
    private String variables;

    private SubmitJobRequest(Builder builder) {
        super(builder);
        this.arrayRequest = builder.arrayRequest;
        this.clusterId = builder.clusterId;
        this.commandLine = builder.commandLine;
        this.name = builder.name;
        this.packagePath = builder.packagePath;
        this.priority = builder.priority;
        this.reRunable = builder.reRunable;
        this.runasUser = builder.runasUser;
        this.runasUserPassword = builder.runasUserPassword;
        this.stderrRedirectPath = builder.stderrRedirectPath;
        this.stdoutRedirectPath = builder.stdoutRedirectPath;
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
     * @return arrayRequest
     */
    public String getArrayRequest() {
        return this.arrayRequest;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<SubmitJobRequest, Builder> {
        private String arrayRequest; 
        private String clusterId; 
        private String commandLine; 
        private String name; 
        private String packagePath; 
        private Integer priority; 
        private Boolean reRunable; 
        private String runasUser; 
        private String runasUserPassword; 
        private String stderrRedirectPath; 
        private String stdoutRedirectPath; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(SubmitJobRequest request) {
            super(request);
            this.arrayRequest = request.arrayRequest;
            this.clusterId = request.clusterId;
            this.commandLine = request.commandLine;
            this.name = request.name;
            this.packagePath = request.packagePath;
            this.priority = request.priority;
            this.reRunable = request.reRunable;
            this.runasUser = request.runasUser;
            this.runasUserPassword = request.runasUserPassword;
            this.stderrRedirectPath = request.stderrRedirectPath;
            this.stdoutRedirectPath = request.stdoutRedirectPath;
            this.variables = request.variables;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * RunasUserPassword.
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
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
         * Variables.
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

}
