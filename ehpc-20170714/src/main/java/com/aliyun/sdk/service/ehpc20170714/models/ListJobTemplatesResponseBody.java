// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobTemplatesResponseBody</p>
 */
public class ListJobTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private Templates templates;

    @NameInMap("TotalCount")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobTemplatesResponseBody build() {
            return new ListJobTemplatesResponseBody(this);
        } 

    } 

    public static class JobTemplates extends TeaModel {
        @NameInMap("ArrayRequest")
        private String arrayRequest;

        @NameInMap("CommandLine")
        private String commandLine;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PackagePath")
        private String packagePath;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ReRunable")
        private Boolean reRunable;

        @NameInMap("RunasUser")
        private String runasUser;

        @NameInMap("StderrRedirectPath")
        private String stderrRedirectPath;

        @NameInMap("StdoutRedirectPath")
        private String stdoutRedirectPath;

        @NameInMap("Variables")
        private String variables;

        private JobTemplates(Builder builder) {
            this.arrayRequest = builder.arrayRequest;
            this.commandLine = builder.commandLine;
            this.id = builder.id;
            this.name = builder.name;
            this.packagePath = builder.packagePath;
            this.priority = builder.priority;
            this.reRunable = builder.reRunable;
            this.runasUser = builder.runasUser;
            this.stderrRedirectPath = builder.stderrRedirectPath;
            this.stdoutRedirectPath = builder.stdoutRedirectPath;
            this.variables = builder.variables;
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
         * @return commandLine
         */
        public String getCommandLine() {
            return this.commandLine;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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

        public static final class Builder {
            private String arrayRequest; 
            private String commandLine; 
            private String id; 
            private String name; 
            private String packagePath; 
            private Integer priority; 
            private Boolean reRunable; 
            private String runasUser; 
            private String stderrRedirectPath; 
            private String stdoutRedirectPath; 
            private String variables; 

            /**
             * ArrayRequest.
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * CommandLine.
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PackagePath.
             */
            public Builder packagePath(String packagePath) {
                this.packagePath = packagePath;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ReRunable.
             */
            public Builder reRunable(Boolean reRunable) {
                this.reRunable = reRunable;
                return this;
            }

            /**
             * RunasUser.
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
                return this;
            }

            /**
             * StderrRedirectPath.
             */
            public Builder stderrRedirectPath(String stderrRedirectPath) {
                this.stderrRedirectPath = stderrRedirectPath;
                return this;
            }

            /**
             * StdoutRedirectPath.
             */
            public Builder stdoutRedirectPath(String stdoutRedirectPath) {
                this.stdoutRedirectPath = stdoutRedirectPath;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(String variables) {
                this.variables = variables;
                return this;
            }

            public JobTemplates build() {
                return new JobTemplates(this);
            } 

        } 

    }
    public static class Templates extends TeaModel {
        @NameInMap("JobTemplates")
        private java.util.List < JobTemplates> jobTemplates;

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
        public java.util.List < JobTemplates> getJobTemplates() {
            return this.jobTemplates;
        }

        public static final class Builder {
            private java.util.List < JobTemplates> jobTemplates; 

            /**
             * JobTemplates.
             */
            public Builder jobTemplates(java.util.List < JobTemplates> jobTemplates) {
                this.jobTemplates = jobTemplates;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
