// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetThreadResponseBody} extends {@link TeaModel}
 *
 * <p>GetThreadResponseBody</p>
 */
public class GetThreadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("variables")
    private Variables variables;

    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private GetThreadResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.threadId = builder.threadId;
        this.title = builder.title;
        this.updateTime = builder.updateTime;
        this.variables = builder.variables;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThreadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return variables
     */
    public Variables getVariables() {
        return this.variables;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String createTime; 
        private String digitalEmployeeName; 
        private String requestId; 
        private String status; 
        private String threadId; 
        private String title; 
        private String updateTime; 
        private Variables variables; 
        private Long version; 

        private Builder() {
        } 

        private Builder(GetThreadResponseBody model) {
            this.createTime = model.createTime;
            this.digitalEmployeeName = model.digitalEmployeeName;
            this.requestId = model.requestId;
            this.status = model.status;
            this.threadId = model.threadId;
            this.title = model.title;
            this.updateTime = model.updateTime;
            this.variables = model.variables;
            this.version = model.version;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * digitalEmployeeName.
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(Variables variables) {
            this.variables = variables;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public GetThreadResponseBody build() {
            return new GetThreadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetThreadResponseBody} extends {@link TeaModel}
     *
     * <p>GetThreadResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Variables(Builder builder) {
            this.project = builder.project;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String project; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.project = model.project;
                this.workspace = model.workspace;
            } 

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
}
