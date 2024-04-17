// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
    private String requestId;

    private GetProjectResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    public static class IpWhiteList extends TeaModel {
        @NameInMap("ipList")
        private String ipList;

        @NameInMap("vpcIpList")
        private String vpcIpList;

        private IpWhiteList(Builder builder) {
            this.ipList = builder.ipList;
            this.vpcIpList = builder.vpcIpList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhiteList create() {
            return builder().build();
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        /**
         * @return vpcIpList
         */
        public String getVpcIpList() {
            return this.vpcIpList;
        }

        public static final class Builder {
            private String ipList; 
            private String vpcIpList; 

            /**
             * The list of IP addresses.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * The list of virtual private cloud (VPC) IP addresses.
             */
            public Builder vpcIpList(String vpcIpList) {
                this.vpcIpList = vpcIpList;
                return this;
            }

            public IpWhiteList build() {
                return new IpWhiteList(this);
            } 

        } 

    }
    public static class Encryption extends TeaModel {
        @NameInMap("algorithm")
        private String algorithm;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("key")
        private String key;

        private Encryption(Builder builder) {
            this.algorithm = builder.algorithm;
            this.enable = builder.enable;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String algorithm; 
            private Boolean enable; 
            private String key; 

            /**
             * The name of the encryption algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * Indicates whether data encryption is enabled. Valid values: true and false.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The key of the encryption algorithm.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    public static class StorageTierSize extends TeaModel {
        @NameInMap("longTermSize")
        private Long longTermSize;

        @NameInMap("lowFrequencySize")
        private Long lowFrequencySize;

        @NameInMap("standardSize")
        private Long standardSize;

        private StorageTierSize(Builder builder) {
            this.longTermSize = builder.longTermSize;
            this.lowFrequencySize = builder.lowFrequencySize;
            this.standardSize = builder.standardSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageTierSize create() {
            return builder().build();
        }

        /**
         * @return longTermSize
         */
        public Long getLongTermSize() {
            return this.longTermSize;
        }

        /**
         * @return lowFrequencySize
         */
        public Long getLowFrequencySize() {
            return this.lowFrequencySize;
        }

        /**
         * @return standardSize
         */
        public Long getStandardSize() {
            return this.standardSize;
        }

        public static final class Builder {
            private Long longTermSize; 
            private Long lowFrequencySize; 
            private Long standardSize; 

            /**
             * The long-term storage.
             */
            public Builder longTermSize(Long longTermSize) {
                this.longTermSize = longTermSize;
                return this;
            }

            /**
             * The IA storage.
             */
            public Builder lowFrequencySize(Long lowFrequencySize) {
                this.lowFrequencySize = lowFrequencySize;
                return this;
            }

            /**
             * The standard storage.
             */
            public Builder standardSize(Long standardSize) {
                this.standardSize = standardSize;
                return this;
            }

            public StorageTierSize build() {
                return new StorageTierSize(this);
            } 

        } 

    }
    public static class StorageTierInfo extends TeaModel {
        @NameInMap("projectBackupSize")
        private Long projectBackupSize;

        @NameInMap("projectTotalSize")
        private Long projectTotalSize;

        @NameInMap("storageTierSize")
        private StorageTierSize storageTierSize;

        private StorageTierInfo(Builder builder) {
            this.projectBackupSize = builder.projectBackupSize;
            this.projectTotalSize = builder.projectTotalSize;
            this.storageTierSize = builder.storageTierSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageTierInfo create() {
            return builder().build();
        }

        /**
         * @return projectBackupSize
         */
        public Long getProjectBackupSize() {
            return this.projectBackupSize;
        }

        /**
         * @return projectTotalSize
         */
        public Long getProjectTotalSize() {
            return this.projectTotalSize;
        }

        /**
         * @return storageTierSize
         */
        public StorageTierSize getStorageTierSize() {
            return this.storageTierSize;
        }

        public static final class Builder {
            private Long projectBackupSize; 
            private Long projectTotalSize; 
            private StorageTierSize storageTierSize; 

            /**
             * The backup storage.
             */
            public Builder projectBackupSize(Long projectBackupSize) {
                this.projectBackupSize = projectBackupSize;
                return this;
            }

            /**
             * The total storage.
             */
            public Builder projectTotalSize(Long projectTotalSize) {
                this.projectTotalSize = projectTotalSize;
                return this;
            }

            /**
             * The tiered storage.
             */
            public Builder storageTierSize(StorageTierSize storageTierSize) {
                this.storageTierSize = storageTierSize;
                return this;
            }

            public StorageTierInfo build() {
                return new StorageTierInfo(this);
            } 

        } 

    }
    public static class TableLifecycle extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("value")
        private String value;

        private TableLifecycle(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableLifecycle create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * The type of the lifecycle. Valid values: -**mandatory**: The lifecycle clause is required. You must configure a lifecycle for a table. -**optional**: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire. -**inherit**: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used by default.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TableLifecycle build() {
                return new TableLifecycle(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("allowFullScan")
        private Boolean allowFullScan;

        @NameInMap("elderTunnelQuota")
        private String elderTunnelQuota;

        @NameInMap("enableDecimal2")
        private Boolean enableDecimal2;

        @NameInMap("enableFdcCacheForce")
        private Boolean enableFdcCacheForce;

        @NameInMap("enableTunnelQuotaRoute")
        private Boolean enableTunnelQuotaRoute;

        @NameInMap("encryption")
        private Encryption encryption;

        @NameInMap("fdcQuota")
        private String fdcQuota;

        @NameInMap("retentionDays")
        private Long retentionDays;

        @NameInMap("sqlMeteringMax")
        private String sqlMeteringMax;

        @NameInMap("storageTierInfo")
        private StorageTierInfo storageTierInfo;

        @NameInMap("tableLifecycle")
        private TableLifecycle tableLifecycle;

        @NameInMap("timezone")
        private String timezone;

        @NameInMap("tunnelQuota")
        private String tunnelQuota;

        @NameInMap("typeSystem")
        private String typeSystem;

        private Properties(Builder builder) {
            this.allowFullScan = builder.allowFullScan;
            this.elderTunnelQuota = builder.elderTunnelQuota;
            this.enableDecimal2 = builder.enableDecimal2;
            this.enableFdcCacheForce = builder.enableFdcCacheForce;
            this.enableTunnelQuotaRoute = builder.enableTunnelQuotaRoute;
            this.encryption = builder.encryption;
            this.fdcQuota = builder.fdcQuota;
            this.retentionDays = builder.retentionDays;
            this.sqlMeteringMax = builder.sqlMeteringMax;
            this.storageTierInfo = builder.storageTierInfo;
            this.tableLifecycle = builder.tableLifecycle;
            this.timezone = builder.timezone;
            this.tunnelQuota = builder.tunnelQuota;
            this.typeSystem = builder.typeSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return allowFullScan
         */
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        /**
         * @return elderTunnelQuota
         */
        public String getElderTunnelQuota() {
            return this.elderTunnelQuota;
        }

        /**
         * @return enableDecimal2
         */
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        /**
         * @return enableFdcCacheForce
         */
        public Boolean getEnableFdcCacheForce() {
            return this.enableFdcCacheForce;
        }

        /**
         * @return enableTunnelQuotaRoute
         */
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        /**
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return fdcQuota
         */
        public String getFdcQuota() {
            return this.fdcQuota;
        }

        /**
         * @return retentionDays
         */
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return sqlMeteringMax
         */
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        /**
         * @return storageTierInfo
         */
        public StorageTierInfo getStorageTierInfo() {
            return this.storageTierInfo;
        }

        /**
         * @return tableLifecycle
         */
        public TableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return tunnelQuota
         */
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        /**
         * @return typeSystem
         */
        public String getTypeSystem() {
            return this.typeSystem;
        }

        public static final class Builder {
            private Boolean allowFullScan; 
            private String elderTunnelQuota; 
            private Boolean enableDecimal2; 
            private Boolean enableFdcCacheForce; 
            private Boolean enableTunnelQuotaRoute; 
            private Encryption encryption; 
            private String fdcQuota; 
            private Long retentionDays; 
            private String sqlMeteringMax; 
            private StorageTierInfo storageTierInfo; 
            private TableLifecycle tableLifecycle; 
            private String timezone; 
            private String tunnelQuota; 
            private String typeSystem; 

            /**
             * Indicates whether a full table scan on the project is enabled.
             */
            public Builder allowFullScan(Boolean allowFullScan) {
                this.allowFullScan = allowFullScan;
                return this;
            }

            /**
             * This operation does not return a value for this parameter.
             */
            public Builder elderTunnelQuota(String elderTunnelQuota) {
                this.elderTunnelQuota = elderTunnelQuota;
                return this;
            }

            /**
             * Indicates whether the DECIMAL data type in MaxCompute V2.0 is enabled.
             */
            public Builder enableDecimal2(Boolean enableDecimal2) {
                this.enableDecimal2 = enableDecimal2;
                return this;
            }

            /**
             * enableFdcCacheForce.
             */
            public Builder enableFdcCacheForce(Boolean enableFdcCacheForce) {
                this.enableFdcCacheForce = enableFdcCacheForce;
                return this;
            }

            /**
             * Indicates whether tunnel quota routing is enabled.
             */
            public Builder enableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
                this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
                return this;
            }

            /**
             * The encryption information.
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * fdcQuota.
             */
            public Builder fdcQuota(String fdcQuota) {
                this.fdcQuota = fdcQuota;
                return this;
            }

            /**
             * The number of days for which backup data can be retained.
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The upper limit for the resources that are consumed by an SQL statement.
             */
            public Builder sqlMeteringMax(String sqlMeteringMax) {
                this.sqlMeteringMax = sqlMeteringMax;
                return this;
            }

            /**
             * The information about the tiered storage.
             */
            public Builder storageTierInfo(StorageTierInfo storageTierInfo) {
                this.storageTierInfo = storageTierInfo;
                return this;
            }

            /**
             * The lifecycle of the table in the project.
             */
            public Builder tableLifecycle(TableLifecycle tableLifecycle) {
                this.tableLifecycle = tableLifecycle;
                return this;
            }

            /**
             * The time zone of the project.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * The name of the tunnel quota.
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            /**
             * The data type edition. Valid values: -**1**: MaxCompute V1.0 data type edition. -**2**: MaxCompute V2.0 data type edition. -**hive**: Hive-compatible data type edition.
             */
            public Builder typeSystem(String typeSystem) {
                this.typeSystem = typeSystem;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class SaleTag extends TeaModel {
        @NameInMap("resourceId")
        private String resourceId;

        @NameInMap("resourceType")
        private String resourceType;

        private SaleTag(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public SaleTag build() {
                return new SaleTag(this);
            } 

        } 

    }
    public static class ProjectProtection extends TeaModel {
        @NameInMap("exceptionPolicy")
        private String exceptionPolicy;

        @NameInMap("protected")
        private Boolean _protected;

        private ProjectProtection(Builder builder) {
            this.exceptionPolicy = builder.exceptionPolicy;
            this._protected = builder._protected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectProtection create() {
            return builder().build();
        }

        /**
         * @return exceptionPolicy
         */
        public String getExceptionPolicy() {
            return this.exceptionPolicy;
        }

        /**
         * @return _protected
         */
        public Boolean get_protected() {
            return this._protected;
        }

        public static final class Builder {
            private String exceptionPolicy; 
            private Boolean _protected; 

            /**
             * The exception policy. If cross-project data access operations are required, the project owner must configure an exception policy in advance to allow the specified user to transfer data of a specified object from the current project to a specified project. After the exception policy is configured, data of the object can be transferred to the specified project even if the project data protection feature is enabled.
             */
            public Builder exceptionPolicy(String exceptionPolicy) {
                this.exceptionPolicy = exceptionPolicy;
                return this;
            }

            /**
             * Indicates whether project data protection is enabled.
             */
            public Builder _protected(Boolean _protected) {
                this._protected = _protected;
                return this;
            }

            public ProjectProtection build() {
                return new ProjectProtection(this);
            } 

        } 

    }
    public static class SecurityProperties extends TeaModel {
        @NameInMap("enableDownloadPrivilege")
        private Boolean enableDownloadPrivilege;

        @NameInMap("labelSecurity")
        private Boolean labelSecurity;

        @NameInMap("objectCreatorHasAccessPermission")
        private Boolean objectCreatorHasAccessPermission;

        @NameInMap("objectCreatorHasGrantPermission")
        private Boolean objectCreatorHasGrantPermission;

        @NameInMap("projectProtection")
        private ProjectProtection projectProtection;

        @NameInMap("usingAcl")
        private Boolean usingAcl;

        @NameInMap("usingPolicy")
        private Boolean usingPolicy;

        private SecurityProperties(Builder builder) {
            this.enableDownloadPrivilege = builder.enableDownloadPrivilege;
            this.labelSecurity = builder.labelSecurity;
            this.objectCreatorHasAccessPermission = builder.objectCreatorHasAccessPermission;
            this.objectCreatorHasGrantPermission = builder.objectCreatorHasGrantPermission;
            this.projectProtection = builder.projectProtection;
            this.usingAcl = builder.usingAcl;
            this.usingPolicy = builder.usingPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityProperties create() {
            return builder().build();
        }

        /**
         * @return enableDownloadPrivilege
         */
        public Boolean getEnableDownloadPrivilege() {
            return this.enableDownloadPrivilege;
        }

        /**
         * @return labelSecurity
         */
        public Boolean getLabelSecurity() {
            return this.labelSecurity;
        }

        /**
         * @return objectCreatorHasAccessPermission
         */
        public Boolean getObjectCreatorHasAccessPermission() {
            return this.objectCreatorHasAccessPermission;
        }

        /**
         * @return objectCreatorHasGrantPermission
         */
        public Boolean getObjectCreatorHasGrantPermission() {
            return this.objectCreatorHasGrantPermission;
        }

        /**
         * @return projectProtection
         */
        public ProjectProtection getProjectProtection() {
            return this.projectProtection;
        }

        /**
         * @return usingAcl
         */
        public Boolean getUsingAcl() {
            return this.usingAcl;
        }

        /**
         * @return usingPolicy
         */
        public Boolean getUsingPolicy() {
            return this.usingPolicy;
        }

        public static final class Builder {
            private Boolean enableDownloadPrivilege; 
            private Boolean labelSecurity; 
            private Boolean objectCreatorHasAccessPermission; 
            private Boolean objectCreatorHasGrantPermission; 
            private ProjectProtection projectProtection; 
            private Boolean usingAcl; 
            private Boolean usingPolicy; 

            /**
             * Indicates whether Download control is enabled.
             */
            public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
                this.enableDownloadPrivilege = enableDownloadPrivilege;
                return this;
            }

            /**
             * Indicates whether label-based access control is enabled.
             */
            public Builder labelSecurity(Boolean labelSecurity) {
                this.labelSecurity = labelSecurity;
                return this;
            }

            /**
             * Indicates whether the object creator is allowed to perform operations on objects.
             */
            public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
                this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
                return this;
            }

            /**
             * Indicates whether the object creator is allowed to authorize other users to perform operations on objects.
             */
            public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
                this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
                return this;
            }

            /**
             * Indicates whether project data protection is enabled.
             */
            public Builder projectProtection(ProjectProtection projectProtection) {
                this.projectProtection = projectProtection;
                return this;
            }

            /**
             * Indicates whether ACL-based access control is enabled.
             */
            public Builder usingAcl(Boolean usingAcl) {
                this.usingAcl = usingAcl;
                return this;
            }

            /**
             * Indicates whether policy-based access control is enabled.
             */
            public Builder usingPolicy(Boolean usingPolicy) {
                this.usingPolicy = usingPolicy;
                return this;
            }

            public SecurityProperties build() {
                return new SecurityProperties(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("comment")
        private String comment;

        @NameInMap("costStorage")
        private String costStorage;

        @NameInMap("createdTime")
        private Long createdTime;

        @NameInMap("defaultQuota")
        private String defaultQuota;

        @NameInMap("ipWhiteList")
        private IpWhiteList ipWhiteList;

        @NameInMap("name")
        private String name;

        @NameInMap("owner")
        private String owner;

        @NameInMap("productType")
        private String productType;

        @NameInMap("properties")
        private Properties properties;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("saleTag")
        private SaleTag saleTag;

        @NameInMap("securityProperties")
        private SecurityProperties securityProperties;

        @NameInMap("status")
        private String status;

        @NameInMap("superAdmins")
        private java.util.List < String > superAdmins;

        @NameInMap("threeTierModel")
        private Boolean threeTierModel;

        @NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.comment = builder.comment;
            this.costStorage = builder.costStorage;
            this.createdTime = builder.createdTime;
            this.defaultQuota = builder.defaultQuota;
            this.ipWhiteList = builder.ipWhiteList;
            this.name = builder.name;
            this.owner = builder.owner;
            this.productType = builder.productType;
            this.properties = builder.properties;
            this.regionId = builder.regionId;
            this.saleTag = builder.saleTag;
            this.securityProperties = builder.securityProperties;
            this.status = builder.status;
            this.superAdmins = builder.superAdmins;
            this.threeTierModel = builder.threeTierModel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return costStorage
         */
        public String getCostStorage() {
            return this.costStorage;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return defaultQuota
         */
        public String getDefaultQuota() {
            return this.defaultQuota;
        }

        /**
         * @return ipWhiteList
         */
        public IpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return saleTag
         */
        public SaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return securityProperties
         */
        public SecurityProperties getSecurityProperties() {
            return this.securityProperties;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return superAdmins
         */
        public java.util.List < String > getSuperAdmins() {
            return this.superAdmins;
        }

        /**
         * @return threeTierModel
         */
        public Boolean getThreeTierModel() {
            return this.threeTierModel;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String costStorage; 
            private Long createdTime; 
            private String defaultQuota; 
            private IpWhiteList ipWhiteList; 
            private String name; 
            private String owner; 
            private String productType; 
            private Properties properties; 
            private String regionId; 
            private SaleTag saleTag; 
            private SecurityProperties securityProperties; 
            private String status; 
            private java.util.List < String > superAdmins; 
            private Boolean threeTierModel; 
            private String type; 

            /**
             * The comment of the project.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The storage usage.
             */
            public Builder costStorage(String costStorage) {
                this.costStorage = costStorage;
                return this;
            }

            /**
             * Create time
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The default computing quota.
             */
            public Builder defaultQuota(String defaultQuota) {
                this.defaultQuota = defaultQuota;
                return this;
            }

            /**
             * The IP address whitelist.
             */
            public Builder ipWhiteList(IpWhiteList ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            /**
             * The name of the MaxCompute project.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The owner of the project.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The billing method of the project.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The properties of the project.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RegionID
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The tag.
             */
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * The permission properties.
             */
            public Builder securityProperties(SecurityProperties securityProperties) {
                this.securityProperties = securityProperties;
                return this;
            }

            /**
             * The status of the project. Valid values: -**AVAILABLE**: The project was available. -**READONLY**: The project was read only. -**FROZEN**: The project was frozen. -**DELETING**: The project was being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The Super_Administrator role.
             */
            public Builder superAdmins(java.util.List < String > superAdmins) {
                this.superAdmins = superAdmins;
                return this;
            }

            /**
             * Indicates whether the current project supports the three-layer model of MaxCompute.
             */
            public Builder threeTierModel(Boolean threeTierModel) {
                this.threeTierModel = threeTierModel;
                return this;
            }

            /**
             * The type of the project. Valid values: -**managed**: The project is an internal project. -**external**: The project is an external project.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
