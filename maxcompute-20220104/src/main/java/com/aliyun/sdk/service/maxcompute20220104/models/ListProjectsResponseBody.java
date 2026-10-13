// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListProjectsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0b16399216671970335563173e2340</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class IpWhiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipList")
        private String ipList;

        @com.aliyun.core.annotation.NameInMap("vpcIpList")
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

            private Builder() {
            } 

            private Builder(IpWhiteList model) {
                this.ipList = model.ipList;
                this.vpcIpList = model.vpcIpList;
            } 

            /**
             * <p>The IP address whitelist for the Internet and cloud service interconnection network.</p>
             * <blockquote>
             * <p>If you configure only the IP address whitelist for the Internet and cloud service interconnection network, access from the Internet and cloud service interconnection network is restricted by the configuration, and all access from VPCs is prohibited.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.88.111.3</p>
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * <p>The IP address whitelist for VPCs.</p>
             * <blockquote>
             * <p>If you configure only the IP address whitelist for VPCs, access from VPCs is restricted by the configuration, and all access from the Internet and cloud service interconnection network is prohibited.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.88.111.3</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Encryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("key")
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

            private Builder() {
            } 

            private Builder(Encryption model) {
                this.algorithm = model.algorithm;
                this.enable = model.enable;
                this.key = model.key;
            } 

            /**
             * <p>The data encryption algorithm. The encryption algorithms supported by the key include AES256, AESCTR, and RC4.</p>
             * 
             * <strong>example:</strong>
             * <p>AES256</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>Specifies whether to enable data encryption for the project. For more information about data encryption, see 
             * &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of the key used for data encryption. Valid values include the default key (MaxCompute Default Key) and Bring Your Own Key (BYOK). The default key is a default key created internally by MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>dafault</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ExternalProjectProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isExternalCatalogBound")
        private String isExternalCatalogBound;

        private ExternalProjectProperties(Builder builder) {
            this.isExternalCatalogBound = builder.isExternalCatalogBound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalProjectProperties create() {
            return builder().build();
        }

        /**
         * @return isExternalCatalogBound
         */
        public String getIsExternalCatalogBound() {
            return this.isExternalCatalogBound;
        }

        public static final class Builder {
            private String isExternalCatalogBound; 

            private Builder() {
            } 

            private Builder(ExternalProjectProperties model) {
                this.isExternalCatalogBound = model.isExternalCatalogBound;
            } 

            /**
             * <p>Specifies whether the project is an external project of &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Data Lakehouse Solution 2.0</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Data Lakehouse Solution 2.0</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isExternalCatalogBound(String isExternalCatalogBound) {
                this.isExternalCatalogBound = isExternalCatalogBound;
                return this;
            }

            public ExternalProjectProperties build() {
                return new ExternalProjectProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class TableLifecycle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(TableLifecycle model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The lifecycle type. Valid values:</p>
             * <ul>
             * <li><strong>mandatory</strong>: The LIFECYCLE clause is required. You must specify a lifecycle for the table.</li>
             * <li><strong>optional</strong>: The LIFECYCLE clause is optional when you create a table. If you do not specify a lifecycle for the table, the table never expires.</li>
             * <li><strong>inherit</strong>: If you do not specify a lifecycle for a table when you create the table, the lifecycle of the table is the value of the odps.table.lifecycle.value parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>optional</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The lifecycle of the table. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
             * 
             * <strong>example:</strong>
             * <p>37231</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowFullScan")
        private Boolean allowFullScan;

        @com.aliyun.core.annotation.NameInMap("enableDecimal2")
        private Boolean enableDecimal2;

        @com.aliyun.core.annotation.NameInMap("enableTunnelQuotaRoute")
        private Boolean enableTunnelQuotaRoute;

        @com.aliyun.core.annotation.NameInMap("encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("externalProjectProperties")
        private ExternalProjectProperties externalProjectProperties;

        @com.aliyun.core.annotation.NameInMap("retentionDays")
        private Long retentionDays;

        @com.aliyun.core.annotation.NameInMap("sqlMeteringMax")
        private String sqlMeteringMax;

        @com.aliyun.core.annotation.NameInMap("tableLifecycle")
        private TableLifecycle tableLifecycle;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("tunnelQuota")
        private String tunnelQuota;

        @com.aliyun.core.annotation.NameInMap("typeSystem")
        private String typeSystem;

        private Properties(Builder builder) {
            this.allowFullScan = builder.allowFullScan;
            this.enableDecimal2 = builder.enableDecimal2;
            this.enableTunnelQuotaRoute = builder.enableTunnelQuotaRoute;
            this.encryption = builder.encryption;
            this.externalProjectProperties = builder.externalProjectProperties;
            this.retentionDays = builder.retentionDays;
            this.sqlMeteringMax = builder.sqlMeteringMax;
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
         * @return enableDecimal2
         */
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
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
         * @return externalProjectProperties
         */
        public ExternalProjectProperties getExternalProjectProperties() {
            return this.externalProjectProperties;
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
            private Boolean enableDecimal2; 
            private Boolean enableTunnelQuotaRoute; 
            private Encryption encryption; 
            private ExternalProjectProperties externalProjectProperties; 
            private Long retentionDays; 
            private String sqlMeteringMax; 
            private TableLifecycle tableLifecycle; 
            private String timezone; 
            private String tunnelQuota; 
            private String typeSystem; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.allowFullScan = model.allowFullScan;
                this.enableDecimal2 = model.enableDecimal2;
                this.enableTunnelQuotaRoute = model.enableTunnelQuotaRoute;
                this.encryption = model.encryption;
                this.externalProjectProperties = model.externalProjectProperties;
                this.retentionDays = model.retentionDays;
                this.sqlMeteringMax = model.sqlMeteringMax;
                this.tableLifecycle = model.tableLifecycle;
                this.timezone = model.timezone;
                this.tunnelQuota = model.tunnelQuota;
                this.typeSystem = model.typeSystem;
            } 

            /**
             * <p>Specifies whether to allow full table scans in the project. Full table scans consume a large amount of resources. To improve processing efficiency, this feature is disabled by default.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowFullScan(Boolean allowFullScan) {
                this.allowFullScan = allowFullScan;
                return this;
            }

            /**
             * <p>Specifies whether to enable the DECIMAL data type of MaxCompute V2.0 for the project.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDecimal2(Boolean enableDecimal2) {
                this.enableDecimal2 = enableDecimal2;
                return this;
            }

            /**
             * <p>Specifies whether to enable EPS resource group routing for the data transfer service.</p>
             * <ul>
             * <li>true: Data transfer tasks submitted by default in the project use the bound EPS resource group for the data transfer service.</li>
             * <li>false: Data transfer tasks submitted by default in the project use the shared EPS resource group for the data transfer service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
                this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
                return this;
            }

            /**
             * <p>The storage encryption properties.</p>
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The properties of the external project.</p>
             */
            public Builder externalProjectProperties(ExternalProjectProperties externalProjectProperties) {
                this.externalProjectProperties = externalProjectProperties;
                return this;
            }

            /**
             * <p>The retention period of backup data in days. During this period, you can restore the current version to any backed-up data version. Valid values: 0 to 30. Default value: 1. A value of 0 indicates that the backup feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The maximum threshold for the consumption of a single SQL statement. Unit: scanned data volume (GB) × complexity.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder sqlMeteringMax(String sqlMeteringMax) {
                this.sqlMeteringMax = sqlMeteringMax;
                return this;
            }

            /**
             * <p>The lifecycle properties of tables.</p>
             */
            public Builder tableLifecycle(TableLifecycle tableLifecycle) {
                this.tableLifecycle = tableLifecycle;
                return this;
            }

            /**
             * <p>The time zone of the project, which is the odps.sql.timezone property.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The EPS resource group of the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/overview-of-dts">data transfer service</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">data transfer service</a> bound to the project.</p>
             * <ul>
             * <li><p>Default (shared EPS resource group for the data transfer service): The project is not allowed to use the subscription EPS resource group for the data transfer service. Regardless of the default EPS resource group setting, data transfer tasks submitted by default in this project automatically use the Default EPS resource group.</p>
             * </li>
             * <li><p>Subscription EPS resource group for the data transfer service: The project is allowed to use the subscription EPS resource group for the data transfer service.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            /**
             * <p>The data type edition. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute V1.0 data type edition</li>
             * <li><strong>2</strong>: MaxCompute V2.0 data type edition</li>
             * <li><strong>hive</strong>: Hive-compatible data type edition</li>
             * </ul>
             * <p>For more information about the differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/data-type-editions">Data type editions</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type editions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class SaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
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

            private Builder() {
            } 

            private Builder(SaleTag model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The instance ID of the default compute quota.</p>
             * 
             * <strong>example:</strong>
             * <p>b7afb7d1-<strong><strong>-</strong></strong>-****-c393669c307b</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The billing method of the default compute quota.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ProjectProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exceptionPolicy")
        private String exceptionPolicy;

        @com.aliyun.core.annotation.NameInMap("protected")
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

            private Builder() {
            } 

            private Builder(ProjectProtection model) {
                this.exceptionPolicy = model.exceptionPolicy;
                this._protected = model._protected;
            } 

            /**
             * <p>If you enable data protection for the project, you can configure exceptions or trusted projects to allow specified users to transfer data of specified objects to specified projects. All scenarios described in the exception policy can bypass the data protection mechanism.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Version&quot;: &quot;1&quot;,
             *       &quot;Statement&quot;: [
             *             {
             *                   &quot;Effect&quot;: &quot;Allow&quot;,
             *                   &quot;Principal&quot;: &quot;&quot;,
             *                   &quot;Action&quot;: [
             *                         &quot;odps:[, , ...]&quot;
             *                   ],
             *                   &quot;Resource&quot;: &quot;acs:odps:*:&quot;,
             *                   &quot;Condition&quot;: {
             *                         &quot;StringEquals&quot;: {
             *                               &quot;odps:TaskType&quot;: [
             *                                     &quot;&quot;
             *                               ]
             *                         }
             *                   }
             *             }
             *       ]
             * }</p>
             */
            public Builder exceptionPolicy(String exceptionPolicy) {
                this.exceptionPolicy = exceptionPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> for the project to prohibit or allow data stream out of the project. The default enabling status is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class SecurityProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableDownloadPrivilege")
        private Boolean enableDownloadPrivilege;

        @com.aliyun.core.annotation.NameInMap("labelSecurity")
        private Boolean labelSecurity;

        @com.aliyun.core.annotation.NameInMap("objectCreatorHasAccessPermission")
        private Boolean objectCreatorHasAccessPermission;

        @com.aliyun.core.annotation.NameInMap("objectCreatorHasGrantPermission")
        private Boolean objectCreatorHasGrantPermission;

        @com.aliyun.core.annotation.NameInMap("projectProtection")
        private ProjectProtection projectProtection;

        @com.aliyun.core.annotation.NameInMap("usingAcl")
        private Boolean usingAcl;

        @com.aliyun.core.annotation.NameInMap("usingPolicy")
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

            private Builder() {
            } 

            private Builder(SecurityProperties model) {
                this.enableDownloadPrivilege = model.enableDownloadPrivilege;
                this.labelSecurity = model.labelSecurity;
                this.objectCreatorHasAccessPermission = model.objectCreatorHasAccessPermission;
                this.objectCreatorHasGrantPermission = model.objectCreatorHasGrantPermission;
                this.projectProtection = model.projectProtection;
                this.usingAcl = model.usingAcl;
                this.usingPolicy = model.usingPolicy;
            } 

            /**
             * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/download-control">download control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a> feature. By default, this feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
                this.enableDownloadPrivilege = enableDownloadPrivilege;
                return this;
            }

            /**
             * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/label-based-access-control">label-based access control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature. By default, this feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder labelSecurity(Boolean labelSecurity) {
                this.labelSecurity = labelSecurity;
                return this;
            }

            /**
             * <p>Specifies whether to allow object creators to have access permissions on the objects. By default, this is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
                this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
                return this;
            }

            /**
             * <p>Specifies whether to allow object creators to have authorization permissions on the objects. By default, this is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
                this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
                return this;
            }

            /**
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> properties.</p>
             */
            public Builder projectProtection(ProjectProtection projectProtection) {
                this.projectProtection = projectProtection;
                return this;
            }

            /**
             * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature. By default, this feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder usingAcl(Boolean usingAcl) {
                this.usingAcl = usingAcl;
                return this;
            }

            /**
             * <p>Specifies whether to use the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature. By default, this feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("costStorage")
        private String costStorage;

        @com.aliyun.core.annotation.NameInMap("createdTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("defaultQuota")
        private String defaultQuota;

        @com.aliyun.core.annotation.NameInMap("ipWhiteList")
        private IpWhiteList ipWhiteList;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("saleTag")
        private SaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("securityProperties")
        private SecurityProperties securityProperties;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("threeTierModel")
        private Boolean threeTierModel;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Projects(Builder builder) {
            this.comment = builder.comment;
            this.costStorage = builder.costStorage;
            this.createdTime = builder.createdTime;
            this.defaultQuota = builder.defaultQuota;
            this.ipWhiteList = builder.ipWhiteList;
            this.name = builder.name;
            this.owner = builder.owner;
            this.properties = builder.properties;
            this.regionId = builder.regionId;
            this.saleTag = builder.saleTag;
            this.securityProperties = builder.securityProperties;
            this.status = builder.status;
            this.threeTierModel = builder.threeTierModel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
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
            private Properties properties; 
            private String regionId; 
            private SaleTag saleTag; 
            private SecurityProperties securityProperties; 
            private String status; 
            private Boolean threeTierModel; 
            private String type; 

            private Builder() {
            } 

            private Builder(Projects model) {
                this.comment = model.comment;
                this.costStorage = model.costStorage;
                this.createdTime = model.createdTime;
                this.defaultQuota = model.defaultQuota;
                this.ipWhiteList = model.ipWhiteList;
                this.name = model.name;
                this.owner = model.owner;
                this.properties = model.properties;
                this.regionId = model.regionId;
                this.saleTag = model.saleTag;
                this.securityProperties = model.securityProperties;
                this.status = model.status;
                this.threeTierModel = model.threeTierModel;
                this.type = model.type;
            } 

            /**
             * <p>The project description.</p>
             * 
             * <strong>example:</strong>
             * <p>BI_Analysis</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The total storage size. This value indicates the current storage size of the project and is consistent with the billing metric. It represents the logical storage size after data compression at the project level.</p>
             * 
             * <strong>example:</strong>
             * <p>16489027</p>
             */
            public Builder costStorage(String costStorage) {
                this.costStorage = costStorage;
                return this;
            }

            /**
             * <p>The creation time. The time is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1704380838000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The default compute quota.
             * This is used to allocate compute resources. If no compute quota is specified, jobs initiated in the project consume resources from the default quota. For more information about how to use compute resources, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/use-of-computing-resources">Use of computing resources</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Use of computing resources</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>os_PayAsYouGoQuota</p>
             */
            public Builder defaultQuota(String defaultQuota) {
                this.defaultQuota = defaultQuota;
                return this;
            }

            /**
             * <p>The IP address whitelist.</p>
             */
            public Builder ipWhiteList(IpWhiteList ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The account information of the project owner.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$odps****@aliyunid.com</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The basic properties of the project.</p>
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance ID and billing method of the default compute quota.</p>
             */
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The security properties.</p>
             */
            public Builder securityProperties(SecurityProperties securityProperties) {
                this.securityProperties = securityProperties;
                return this;
            }

            /**
             * <p>The project status. Valid values:</p>
             * <ul>
             * <li><strong>AVAILABLE</strong>: normal</li>
             * <li><strong>READONLY</strong>: read-only</li>
             * <li><strong>FROZEN</strong>: frozen</li>
             * <li><strong>DELETING</strong>: deleting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether to support schema-based storage.
             * MaxCompute supports schemas, which are located under projects and used to classify objects such as tables, resources, and UDFs. A project can contain multiple schemas. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder threeTierModel(Boolean threeTierModel) {
                this.threeTierModel = threeTierModel;
                return this;
            }

            /**
             * <p>The project type. Valid values:</p>
             * <ul>
             * <li><strong>managed</strong>: internal project</li>
             * <li><strong>external</strong>: external project</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>managed</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxItem")
        private Integer maxItem;

        @com.aliyun.core.annotation.NameInMap("projects")
        private java.util.List<Projects> projects;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
            this.projects = builder.projects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Integer getMaxItem() {
            return this.maxItem;
        }

        /**
         * @return projects
         */
        public java.util.List<Projects> getProjects() {
            return this.projects;
        }

        public static final class Builder {
            private String nextToken; 
            private String marker; 
            private Integer maxItem; 
            private java.util.List<Projects> projects; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nextToken = model.nextToken;
                this.marker = model.marker;
                this.maxItem = model.maxItem;
                this.projects = model.projects;
            } 

            /**
             * <p>The pagination token. The current operation only supports sequential pagination. A non-empty nextToken value indicates that more data is available. You can use the nextToken value as a parameter to query the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kvikyUl3ChyRxN+qLPvtOb</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The marker used to specify the starting point of the returned results. The results are sorted in alphabetical order and returned starting from the first item after the marker.</p>
             * 
             * <strong>example:</strong>
             * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * <p>The maximum number of results to return per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * <p>The list of projects.</p>
             */
            public Builder projects(java.util.List<Projects> projects) {
                this.projects = projects;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
