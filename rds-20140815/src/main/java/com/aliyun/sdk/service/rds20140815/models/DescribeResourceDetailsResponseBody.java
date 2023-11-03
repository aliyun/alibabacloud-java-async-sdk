// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceDetailsResponseBody</p>
 */
public class DescribeResourceDetailsResponseBody extends TeaModel {
    @NameInMap("BackupDataSize")
    private Long backupDataSize;

    @NameInMap("BackupLogSize")
    private Long backupLogSize;

    @NameInMap("BackupSize")
    private Long backupSize;

    @NameInMap("DbInstanceStorage")
    private Long dbInstanceStorage;

    @NameInMap("DbProxyInstanceName")
    private String dbProxyInstanceName;

    @NameInMap("DiskUsed")
    private Long diskUsed;

    @NameInMap("InstanceStorageType")
    private String instanceStorageType;

    @NameInMap("RdsEcsSecurityGroupRel")
    private java.util.List < RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

    @NameInMap("Region")
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SecurityIPList")
    private String securityIPList;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeResourceDetailsResponseBody(Builder builder) {
        this.backupDataSize = builder.backupDataSize;
        this.backupLogSize = builder.backupLogSize;
        this.backupSize = builder.backupSize;
        this.dbInstanceStorage = builder.dbInstanceStorage;
        this.dbProxyInstanceName = builder.dbProxyInstanceName;
        this.diskUsed = builder.diskUsed;
        this.instanceStorageType = builder.instanceStorageType;
        this.rdsEcsSecurityGroupRel = builder.rdsEcsSecurityGroupRel;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityIPList = builder.securityIPList;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupDataSize
     */
    public Long getBackupDataSize() {
        return this.backupDataSize;
    }

    /**
     * @return backupLogSize
     */
    public Long getBackupLogSize() {
        return this.backupLogSize;
    }

    /**
     * @return backupSize
     */
    public Long getBackupSize() {
        return this.backupSize;
    }

    /**
     * @return dbInstanceStorage
     */
    public Long getDbInstanceStorage() {
        return this.dbInstanceStorage;
    }

    /**
     * @return dbProxyInstanceName
     */
    public String getDbProxyInstanceName() {
        return this.dbProxyInstanceName;
    }

    /**
     * @return diskUsed
     */
    public Long getDiskUsed() {
        return this.diskUsed;
    }

    /**
     * @return instanceStorageType
     */
    public String getInstanceStorageType() {
        return this.instanceStorageType;
    }

    /**
     * @return rdsEcsSecurityGroupRel
     */
    public java.util.List < RdsEcsSecurityGroupRel> getRdsEcsSecurityGroupRel() {
        return this.rdsEcsSecurityGroupRel;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private Long backupDataSize; 
        private Long backupLogSize; 
        private Long backupSize; 
        private Long dbInstanceStorage; 
        private String dbProxyInstanceName; 
        private Long diskUsed; 
        private String instanceStorageType; 
        private java.util.List < RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel; 
        private String region; 
        private String requestId; 
        private String resourceGroupId; 
        private String securityIPList; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * The storage that is occupied by data backup files, excluding archived backup files, on the instance. Unit: bytes.
         */
        public Builder backupDataSize(Long backupDataSize) {
            this.backupDataSize = backupDataSize;
            return this;
        }

        /**
         * The storage that is occupied by log backup files, excluding archived backup files, on the instance. Unit: bytes.
         */
        public Builder backupLogSize(Long backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }

        /**
         * The storage that is used to store backup files. Unit: bytes. The value -1 indicates that no backup files are stored.
         */
        public Builder backupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }

        /**
         * Database Storage.
         */
        public Builder dbInstanceStorage(Long dbInstanceStorage) {
            this.dbInstanceStorage = dbInstanceStorage;
            return this;
        }

        /**
         * ProxyInstance name.
         */
        public Builder dbProxyInstanceName(String dbProxyInstanceName) {
            this.dbProxyInstanceName = dbProxyInstanceName;
            return this;
        }

        /**
         * The total storage that is occupied by data files and log files on the instance. Unit: bytes. The value -1 indicates that no data files or log files are stored on the instance.
         */
        public Builder diskUsed(Long diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }

        /**
         * Instance StorageType
         */
        public Builder instanceStorageType(String instanceStorageType) {
            this.instanceStorageType = instanceStorageType;
            return this;
        }

        /**
         * Whitelist Rules.
         */
        public Builder rdsEcsSecurityGroupRel(java.util.List < RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel) {
            this.rdsEcsSecurityGroupRel = rdsEcsSecurityGroupRel;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The IP address whitelist of the serverless instance. For more information, see [Use a database client or the CLI to connect to an ApsaraDB RDS for PostgreSQL instance](~~43185~~). If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. You can specify up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:
         * <p>
         * 
         * *   IP addresses, such as 10.10.XX.XX.
         * *   CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.
         * 
         * If this parameter is not specified, the default IP address whitelist is used.
         */
        public Builder securityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * The vSwitch ID.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VPC ID。
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeResourceDetailsResponseBody build() {
            return new DescribeResourceDetailsResponseBody(this);
        } 

    } 

    public static class RdsEcsSecurityGroupRel extends TeaModel {
        @NameInMap("SecurityGroupName")
        private String securityGroupName;

        private RdsEcsSecurityGroupRel(Builder builder) {
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsEcsSecurityGroupRel create() {
            return builder().build();
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String securityGroupName; 

            /**
             * The name of the security group.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public RdsEcsSecurityGroupRel build() {
                return new RdsEcsSecurityGroupRel(this);
            } 

        } 

    }
}
