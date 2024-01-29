// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("HostId")
    private String hostId;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Workspaces")
    private java.util.List < Workspaces> workspaces;

    private ListWorkspacesResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaces
     */
    public java.util.List < Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < Workspaces> workspaces; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Workspaces.
         */
        public Builder workspaces(java.util.List < Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    public static class Workspaces extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("JobLifecycle")
        private Integer jobLifecycle;

        @NameInMap("Labels")
        private java.util.Map < String, String > labels;

        @NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("Location")
        private String location;

        @NameInMap("Role")
        private String role;

        @NameInMap("Status")
        private String status;

        @NameInMap("Storage")
        private String storage;

        @NameInMap("Workspace")
        private String workspace;

        private Workspaces(Builder builder) {
            this.bucketName = builder.bucketName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.jobLifecycle = builder.jobLifecycle;
            this.labels = builder.labels;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.location = builder.location;
            this.role = builder.role;
            this.status = builder.status;
            this.storage = builder.storage;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
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
            private Integer jobLifecycle; 
            private java.util.Map < String, String > labels; 
            private String lastModifiedTime; 
            private String location; 
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
             * RAM Role
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

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
