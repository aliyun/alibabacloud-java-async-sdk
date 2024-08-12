// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportAppOtaInfoRequest} extends {@link RequestModel}
 *
 * <p>ReportAppOtaInfoRequest</p>
 */
public class ReportAppOtaInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseVersion")
    private String baseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUid")
    private String clientUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    private String targetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskUid")
    private String taskUid;

    private ReportAppOtaInfoRequest(Builder builder) {
        super(builder);
        this.baseVersion = builder.baseVersion;
        this.clientType = builder.clientType;
        this.clientUid = builder.clientUid;
        this.note = builder.note;
        this.osType = builder.osType;
        this.project = builder.project;
        this.status = builder.status;
        this.targetVersion = builder.targetVersion;
        this.taskUid = builder.taskUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportAppOtaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseVersion
     */
    public String getBaseVersion() {
        return this.baseVersion;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return clientUid
     */
    public String getClientUid() {
        return this.clientUid;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * @return taskUid
     */
    public String getTaskUid() {
        return this.taskUid;
    }

    public static final class Builder extends Request.Builder<ReportAppOtaInfoRequest, Builder> {
        private String baseVersion; 
        private Integer clientType; 
        private String clientUid; 
        private String note; 
        private String osType; 
        private String project; 
        private Integer status; 
        private String targetVersion; 
        private String taskUid; 

        private Builder() {
            super();
        } 

        private Builder(ReportAppOtaInfoRequest request) {
            super(request);
            this.baseVersion = request.baseVersion;
            this.clientType = request.clientType;
            this.clientUid = request.clientUid;
            this.note = request.note;
            this.osType = request.osType;
            this.project = request.project;
            this.status = request.status;
            this.targetVersion = request.targetVersion;
            this.taskUid = request.taskUid;
        } 

        /**
         * BaseVersion.
         */
        public Builder baseVersion(String baseVersion) {
            this.putQueryParameter("BaseVersion", baseVersion);
            this.baseVersion = baseVersion;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * ClientUid.
         */
        public Builder clientUid(String clientUid) {
            this.putQueryParameter("ClientUid", clientUid);
            this.clientUid = clientUid;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TargetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        /**
         * TaskUid.
         */
        public Builder taskUid(String taskUid) {
            this.putQueryParameter("TaskUid", taskUid);
            this.taskUid = taskUid;
            return this;
        }

        @Override
        public ReportAppOtaInfoRequest build() {
            return new ReportAppOtaInfoRequest(this);
        } 

    } 

}
