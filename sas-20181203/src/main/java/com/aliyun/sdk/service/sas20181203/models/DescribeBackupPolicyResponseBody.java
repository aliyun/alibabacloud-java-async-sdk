// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupPolicyDetail")
    private BackupPolicyDetail backupPolicyDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupPolicyDetail = builder.backupPolicyDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPolicyDetail
     */
    public BackupPolicyDetail getBackupPolicyDetail() {
        return this.backupPolicyDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupPolicyDetail backupPolicyDetail; 
        private String requestId; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder backupPolicyDetail(BackupPolicyDetail backupPolicyDetail) {
            this.backupPolicyDetail = backupPolicyDetail;
            return this;
        }

        /**
         * The ID of the region in which backup data is stored.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    public static class BackupPolicyDetail extends TeaModel {
        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PolicyVersion")
        private String policyVersion;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UuidList")
        private java.util.List < String > uuidList;

        private BackupPolicyDetail(Builder builder) {
            this.clientStatus = builder.clientStatus;
            this.id = builder.id;
            this.name = builder.name;
            this.policy = builder.policy;
            this.policyVersion = builder.policyVersion;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.uuidList = builder.uuidList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPolicyDetail create() {
            return builder().build();
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuidList
         */
        public java.util.List < String > getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private String clientStatus; 
            private Long id; 
            private String name; 
            private String policy; 
            private String policyVersion; 
            private String regionId; 
            private String status; 
            private java.util.List < String > uuidList; 

            /**
             * ClientStatus.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * DescribeBackupPolicy
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Queries the details of an anti-ransomware policy for servers.
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the anti-ransomware policy.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UuidList.
             */
            public Builder uuidList(java.util.List < String > uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public BackupPolicyDetail build() {
                return new BackupPolicyDetail(this);
            } 

        } 

    }
}
