// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

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
    @NameInMap("CommandLine")
    @Validation(required = true)
    private String commandLine;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
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
    @NameInMap("RegionId")
    private String regionId;

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
    @NameInMap("Variables")
    private String variables;

    private CreateJobTemplateRequest(Builder builder) {
        super(builder);
        this.arrayRequest = builder.arrayRequest;
        this.commandLine = builder.commandLine;
        this.name = builder.name;
        this.packagePath = builder.packagePath;
        this.priority = builder.priority;
        this.reRunable = builder.reRunable;
        this.regionId = builder.regionId;
        this.runasUser = builder.runasUser;
        this.stderrRedirectPath = builder.stderrRedirectPath;
        this.stdoutRedirectPath = builder.stdoutRedirectPath;
        this.variables = builder.variables;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreateJobTemplateRequest, Builder> {
        private String arrayRequest; 
        private String commandLine; 
        private String name; 
        private String packagePath; 
        private Integer priority; 
        private Boolean reRunable; 
        private String regionId; 
        private String runasUser; 
        private String stderrRedirectPath; 
        private String stdoutRedirectPath; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobTemplateRequest request) {
            super(request);
            this.arrayRequest = request.arrayRequest;
            this.commandLine = request.commandLine;
            this.name = request.name;
            this.packagePath = request.packagePath;
            this.priority = request.priority;
            this.reRunable = request.reRunable;
            this.regionId = request.regionId;
            this.runasUser = request.runasUser;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Variables.
         */
        public Builder variables(String variables) {
            this.putQueryParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public CreateJobTemplateRequest build() {
            return new CreateJobTemplateRequest(this);
        } 

    } 

}
