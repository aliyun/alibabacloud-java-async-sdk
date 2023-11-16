// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateK8sAccessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateK8sAccessInfoResponseBody</p>
 */
public class GenerateK8sAccessInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

        @NameInMap("InstallKey")
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
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AuditLogStore.
             */
            public Builder auditLogStore(String auditLogStore) {
                this.auditLogStore = auditLogStore;
                return this;
            }

            /**
             * AuditProject.
             */
            public Builder auditProject(String auditProject) {
                this.auditProject = auditProject;
                return this;
            }

            /**
             * AuditRegionId.
             */
            public Builder auditRegionId(String auditRegionId) {
                this.auditRegionId = auditRegionId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * InstallKey.
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
