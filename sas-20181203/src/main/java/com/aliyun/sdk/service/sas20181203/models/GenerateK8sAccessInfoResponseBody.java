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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>061955B2-BC40-589F-AF63-C40A901EE279</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateK8sAccessInfoResponseBody build() {
            return new GenerateK8sAccessInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateK8sAccessInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateK8sAccessInfoResponseBody</p>
     */
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
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1766185894104***</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore that is used to store the audit logs.</p>
             * 
             * <strong>example:</strong>
             * <p>audit-cf6baf6afa106eca665296fdf68b65bf</p>
             */
            public Builder auditLogStore(String auditLogStore) {
                this.auditLogStore = auditLogStore;
                return this;
            }

            /**
             * <p>The Simple Log Service project that is used to store the audit logs.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-custom-your-project-sd89ehaaa</p>
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
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The expiration time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1804230578566</p>
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11618788</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The installation key of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>BC66185***</p>
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
