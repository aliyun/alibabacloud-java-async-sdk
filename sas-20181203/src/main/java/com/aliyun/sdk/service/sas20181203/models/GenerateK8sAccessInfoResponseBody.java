// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateK8sAccessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateK8sAccessInfoResponseBody</p>
 */
public class GenerateK8sAccessInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateK8sAccessInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateK8sAccessInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateK8sAccessInfoResponseBody build() {
            return new GenerateK8sAccessInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("InstallKey")
        private String installKey;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.auditLogStore = builder.auditLogStore;
            this.auditProject = builder.auditProject;
            this.auditRegionId = builder.auditRegionId;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.expireDate = builder.expireDate;
            this.groupId = builder.groupId;
            this.installKey = builder.installKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return installKey
         */
        public String getInstallKey() {
            return this.installKey;
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
            private String installKey; 

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
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The cluster name.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The expiration time. Unit: milliseconds.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The server group ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The installation key of the server.
             */
            public Builder installKey(String installKey) {
                this.installKey = installKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
