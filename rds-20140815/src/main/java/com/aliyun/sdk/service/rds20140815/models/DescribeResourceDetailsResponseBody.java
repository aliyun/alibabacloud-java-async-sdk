// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeResourceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceDetailsResponseBody</p>
 */
public class DescribeResourceDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupDataSize")
    private Long backupDataSize;

    @com.aliyun.core.annotation.NameInMap("BackupLogSize")
    private Long backupLogSize;

    @com.aliyun.core.annotation.NameInMap("BackupSize")
    private Long backupSize;

    @com.aliyun.core.annotation.NameInMap("DbInstanceStorage")
    private Long dbInstanceStorage;

    @com.aliyun.core.annotation.NameInMap("DbProxyInstanceName")
    private String dbProxyInstanceName;

    @com.aliyun.core.annotation.NameInMap("DiskUsed")
    private Long diskUsed;

    @com.aliyun.core.annotation.NameInMap("InstanceStorageType")
    private String instanceStorageType;

    @com.aliyun.core.annotation.NameInMap("RdsEcsSecurityGroupRel")
    private java.util.List<RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RdsEcsSecurityGroupRel> getRdsEcsSecurityGroupRel() {
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
        private java.util.List<RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel; 
        private String region; 
        private String requestId; 
        private String resourceGroupId; 
        private String securityIPList; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeResourceDetailsResponseBody model) {
            this.backupDataSize = model.backupDataSize;
            this.backupLogSize = model.backupLogSize;
            this.backupSize = model.backupSize;
            this.dbInstanceStorage = model.dbInstanceStorage;
            this.dbProxyInstanceName = model.dbProxyInstanceName;
            this.diskUsed = model.diskUsed;
            this.instanceStorageType = model.instanceStorageType;
            this.rdsEcsSecurityGroupRel = model.rdsEcsSecurityGroupRel;
            this.region = model.region;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.securityIPList = model.securityIPList;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The storage that is occupied by data backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>8139046912</p>
         */
        public Builder backupDataSize(Long backupDataSize) {
            this.backupDataSize = backupDataSize;
            return this;
        }

        /**
         * <p>The size of the backup log. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>21183797</p>
         */
        public Builder backupLogSize(Long backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }

        /**
         * <p>The size of the backup data. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>53002759</p>
         */
        public Builder backupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }

        /**
         * <p>The disk capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder dbInstanceStorage(Long dbInstanceStorage) {
            this.dbInstanceStorage = dbInstanceStorage;
            return this;
        }

        /**
         * <p>The name of the proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mr-n1m1wjrylfolvrt67s</p>
         */
        public Builder dbProxyInstanceName(String dbProxyInstanceName) {
            this.dbProxyInstanceName = dbProxyInstanceName;
            return this;
        }

        /**
         * <p>The total storage used. The value is the sum of the DataSize and LogSize values. Unit: bytes. The value -1 indicates that no data files or log files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>4871684096</p>
         */
        public Builder diskUsed(Long diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }

        /**
         * <p>The storage type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder instanceStorageType(String instanceStorageType) {
            this.instanceStorageType = instanceStorageType;
            return this;
        }

        /**
         * <p>The rule for the IP address whitelist of the instance.</p>
         */
        public Builder rdsEcsSecurityGroupRel(java.util.List<RdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel) {
            this.rdsEcsSecurityGroupRel = rdsEcsSecurityGroupRel;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EA815761-F7AC-5CFE-A1AC-709D6A00B58A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv3h25bj7yhq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The IP address whitelist of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure IP address whitelists</a>. If the returned IP address whitelist contains more than one entry, these entries are separated with commas (,). Each entry is unique and up to 1,000 entries are returned. The entries in the IP address whitelist must be in one of the following formats:</p>
         * <ul>
         * <li>IP addresses, such as 10.10.XX.XX.</li>
         * <li>CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</li>
         * </ul>
         * <p>If this parameter is not specified, the default IP address whitelist is used.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.1.14,172.16.1.13,172.16.1.44,172.16.1.43,172.16.1.74,172.16.1.73</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <p> The vSwitch must belong to the same zone as the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zelwi1jd271p670lzl8h</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9rbibex7v0lxbeyo6at</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeResourceDetailsResponseBody build() {
            return new DescribeResourceDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceDetailsResponseBody</p>
     */
    public static class RdsEcsSecurityGroupRel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
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

            private Builder() {
            } 

            private Builder(RdsEcsSecurityGroupRel model) {
                this.securityGroupName = model.securityGroupName;
            } 

            /**
             * <p>The name of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>test_switch</p>
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
