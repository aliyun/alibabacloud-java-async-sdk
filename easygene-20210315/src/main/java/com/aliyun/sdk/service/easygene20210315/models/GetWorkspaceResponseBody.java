// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceResponseBody</p>
 */
public class GetWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("JobLifecycle")
    private Integer jobLifecycle;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map < String, String > labels;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Storage")
    private String storage;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private GetWorkspaceResponseBody(Builder builder) {
        this.bucketName = builder.bucketName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.hostId = builder.hostId;
        this.jobLifecycle = builder.jobLifecycle;
        this.labels = builder.labels;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.location = builder.location;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.status = builder.status;
        this.storage = builder.storage;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return jobLifecycle
     */
    public Integer getJobLifecycle() {
        return this.jobLifecycle;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String bucketName; 
        private String createTime; 
        private String description; 
        private String hostId; 
        private Integer jobLifecycle; 
        private java.util.Map < String, String > labels; 
        private String lastModifiedTime; 
        private String location; 
        private String requestId; 
        private String role; 
        private String status; 
        private String storage; 
        private String workspace; 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * JobLifecycle.
         */
        public Builder jobLifecycle(Integer jobLifecycle) {
            this.jobLifecycle = jobLifecycle;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
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
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Storage.
         */
        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetWorkspaceResponseBody build() {
            return new GetWorkspaceResponseBody(this);
        } 

    } 

}
