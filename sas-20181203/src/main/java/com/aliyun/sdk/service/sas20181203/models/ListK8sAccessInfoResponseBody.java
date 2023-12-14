// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sAccessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sAccessInfoResponseBody</p>
 */
public class ListK8sAccessInfoResponseBody extends TeaModel {
    @NameInMap("K8sAccessInfos")
    private java.util.List < K8sAccessInfos> k8sAccessInfos;

    @NameInMap("RequestId")
    private String requestId;

    private ListK8sAccessInfoResponseBody(Builder builder) {
        this.k8sAccessInfos = builder.k8sAccessInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sAccessInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return k8sAccessInfos
     */
    public java.util.List < K8sAccessInfos> getK8sAccessInfos() {
        return this.k8sAccessInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < K8sAccessInfos> k8sAccessInfos; 
        private String requestId; 

        /**
         * The information about the Kubernetes clusters.
         */
        public Builder k8sAccessInfos(java.util.List < K8sAccessInfos> k8sAccessInfos) {
            this.k8sAccessInfos = k8sAccessInfos;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListK8sAccessInfoResponseBody build() {
            return new ListK8sAccessInfoResponseBody(this);
        } 

    } 

    public static class K8sAccessInfos extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("AuditLogStore")
        private String auditLogStore;

        @NameInMap("AuditProject")
        private String auditProject;

        @NameInMap("AuditRegionId")
        private String auditRegionId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ExpireDate")
        private Long expireDate;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstallKey")
        private String installKey;

        @NameInMap("Vendor")
        private String vendor;

        private K8sAccessInfos(Builder builder) {
            this.aliUid = builder.aliUid;
            this.auditLogStore = builder.auditLogStore;
            this.auditProject = builder.auditProject;
            this.auditRegionId = builder.auditRegionId;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.expireDate = builder.expireDate;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.installKey = builder.installKey;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sAccessInfos create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return auditLogStore
         */
        public String getAuditLogStore() {
            return this.auditLogStore;
        }

        /**
         * @return auditProject
         */
        public String getAuditProject() {
            return this.auditProject;
        }

        /**
         * @return auditRegionId
         */
        public String getAuditRegionId() {
            return this.auditRegionId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return installKey
         */
        public String getInstallKey() {
            return this.installKey;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Long aliUid; 
            private String auditLogStore; 
            private String auditProject; 
            private String auditRegionId; 
            private String clusterId; 
            private String clusterName; 
            private Long expireDate; 
            private String groupId; 
            private String groupName; 
            private Long id; 
            private String installKey; 
            private String vendor; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The Simple Log Service Logstore that is used to store the audit logs.
             */
            public Builder auditLogStore(String auditLogStore) {
                this.auditLogStore = auditLogStore;
                return this;
            }

            /**
             * The Simple Log Service project that is used to store the audit logs.
             */
            public Builder auditProject(String auditProject) {
                this.auditProject = auditProject;
                return this;
            }

            /**
             * The ID of the region in which the server is deployed.
             */
            public Builder auditRegionId(String auditRegionId) {
                this.auditRegionId = auditRegionId;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the server group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The UUID of the access information.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The installation key of the Kubernetes cluster.
             */
            public Builder installKey(String installKey) {
                this.installKey = installKey;
                return this;
            }

            /**
             * The service provider.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public K8sAccessInfos build() {
                return new K8sAccessInfos(this);
            } 

        } 

    }
}
