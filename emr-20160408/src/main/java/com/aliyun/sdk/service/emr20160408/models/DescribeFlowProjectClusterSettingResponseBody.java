// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowProjectClusterSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowProjectClusterSettingResponseBody</p>
 */
public class DescribeFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("DefaultQueue")
    private String defaultQueue;

    @NameInMap("DefaultUser")
    private String defaultUser;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("HostList")
    private HostList hostList;

    @NameInMap("K8sClusterId")
    private String k8sClusterId;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("QueueList")
    private QueueList queueList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserList")
    private UserList userList;

    private DescribeFlowProjectClusterSettingResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.defaultQueue = builder.defaultQueue;
        this.defaultUser = builder.defaultUser;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.hostList = builder.hostList;
        this.k8sClusterId = builder.k8sClusterId;
        this.projectId = builder.projectId;
        this.queueList = builder.queueList;
        this.requestId = builder.requestId;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowProjectClusterSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return defaultQueue
     */
    public String getDefaultQueue() {
        return this.defaultQueue;
    }

    /**
     * @return defaultUser
     */
    public String getDefaultUser() {
        return this.defaultUser;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hostList
     */
    public HostList getHostList() {
        return this.hostList;
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return queueList
     */
    public QueueList getQueueList() {
        return this.queueList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userList
     */
    public UserList getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String clusterId; 
        private String defaultQueue; 
        private String defaultUser; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private HostList hostList; 
        private String k8sClusterId; 
        private String projectId; 
        private QueueList queueList; 
        private String requestId; 
        private UserList userList; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DefaultQueue.
         */
        public Builder defaultQueue(String defaultQueue) {
            this.defaultQueue = defaultQueue;
            return this;
        }

        /**
         * DefaultUser.
         */
        public Builder defaultUser(String defaultUser) {
            this.defaultUser = defaultUser;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * HostList.
         */
        public Builder hostList(HostList hostList) {
            this.hostList = hostList;
            return this;
        }

        /**
         * K8sClusterId.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * QueueList.
         */
        public Builder queueList(QueueList queueList) {
            this.queueList = queueList;
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
         * UserList.
         */
        public Builder userList(UserList userList) {
            this.userList = userList;
            return this;
        }

        public DescribeFlowProjectClusterSettingResponseBody build() {
            return new DescribeFlowProjectClusterSettingResponseBody(this);
        } 

    } 

    public static class HostList extends TeaModel {
        @NameInMap("Host")
        private java.util.List < String > host;

        private HostList(Builder builder) {
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostList create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public java.util.List < String > getHost() {
            return this.host;
        }

        public static final class Builder {
            private java.util.List < String > host; 

            /**
             * Host.
             */
            public Builder host(java.util.List < String > host) {
                this.host = host;
                return this;
            }

            public HostList build() {
                return new HostList(this);
            } 

        } 

    }
    public static class QueueList extends TeaModel {
        @NameInMap("Queue")
        private java.util.List < String > queue;

        private QueueList(Builder builder) {
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueList create() {
            return builder().build();
        }

        /**
         * @return queue
         */
        public java.util.List < String > getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private java.util.List < String > queue; 

            /**
             * Queue.
             */
            public Builder queue(java.util.List < String > queue) {
                this.queue = queue;
                return this;
            }

            public QueueList build() {
                return new QueueList(this);
            } 

        } 

    }
    public static class UserList extends TeaModel {
        @NameInMap("User")
        private java.util.List < String > user;

        private UserList(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List < String > getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < String > user; 

            /**
             * User.
             */
            public Builder user(java.util.List < String > user) {
                this.user = user;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
