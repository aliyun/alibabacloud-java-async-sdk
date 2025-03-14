// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListK8sAccessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sAccessInfoResponseBody</p>
 */
public class ListK8sAccessInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("K8sAccessInfos")
    private java.util.List<K8sAccessInfos> k8sAccessInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sAccessInfos
     */
    public java.util.List<K8sAccessInfos> getK8sAccessInfos() {
        return this.k8sAccessInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<K8sAccessInfos> k8sAccessInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListK8sAccessInfoResponseBody model) {
            this.k8sAccessInfos = model.k8sAccessInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the Kubernetes clusters.</p>
         */
        public Builder k8sAccessInfos(java.util.List<K8sAccessInfos> k8sAccessInfos) {
            this.k8sAccessInfos = k8sAccessInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListK8sAccessInfoResponseBody build() {
            return new ListK8sAccessInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListK8sAccessInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sAccessInfoResponseBody</p>
     */
    public static class K8sAccessInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AuditLogStore")
        private String auditLogStore;

        @com.aliyun.core.annotation.NameInMap("AuditProject")
        private String auditProject;

        @com.aliyun.core.annotation.NameInMap("AuditRegionId")
        private String auditRegionId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private Long expireDate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstallKey")
        private String installKey;

        @com.aliyun.core.annotation.NameInMap("Vendor")
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

            private Builder() {
            } 

            private Builder(K8sAccessInfos model) {
                this.aliUid = model.aliUid;
                this.auditLogStore = model.auditLogStore;
                this.auditProject = model.auditProject;
                this.auditRegionId = model.auditRegionId;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.expireDate = model.expireDate;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.id = model.id;
                this.installKey = model.installKey;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1960721413485****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore that is used to store the audit logs.</p>
             * 
             * <strong>example:</strong>
             * <p>audit-cf6baf6afa106eca665296fdf68b****</p>
             */
            public Builder auditLogStore(String auditLogStore) {
                this.auditLogStore = auditLogStore;
                return this;
            }

            /**
             * <p>The Simple Log Service project that is used to store the audit logs.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-custom-your-project-sd89eh****</p>
             */
            public Builder auditProject(String auditProject) {
                this.auditProject = auditProject;
                return this;
            }

            /**
             * <p>The ID of the region in which the server is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder auditRegionId(String auditRegionId) {
                this.auditRegionId = auditRegionId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c0da5e4cb82a848c4a57c4dc9f49a****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1690596321613</p>
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>11088522</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The UUID of the access information.</p>
             * 
             * <strong>example:</strong>
             * <p>67070</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The installation key of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder installKey(String installKey) {
                this.installKey = installKey;
                return this;
            }

            /**
             * <p>The service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
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
