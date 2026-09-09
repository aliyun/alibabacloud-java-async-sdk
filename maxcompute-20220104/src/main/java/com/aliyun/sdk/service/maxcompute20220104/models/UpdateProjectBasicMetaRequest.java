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
 * {@link UpdateProjectBasicMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectBasicMetaRequest</p>
 */
public class UpdateProjectBasicMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("properties")
    private Properties properties;

    private UpdateProjectBasicMetaRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.comment = builder.comment;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectBasicMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return properties
     */
    public Properties getProperties() {
        return this.properties;
    }

    public static final class Builder extends Request.Builder<UpdateProjectBasicMetaRequest, Builder> {
        private String projectName; 
        private String comment; 
        private Properties properties; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectBasicMetaRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.comment = request.comment;
            this.properties = request.properties;
        } 

        /**
         * <p>The project name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>BI_Analysis</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The basic properties of the project.</p>
         */
        public Builder properties(Properties properties) {
            this.putBodyParameter("properties", properties);
            this.properties = properties;
            return this;
        }

        @Override
        public UpdateProjectBasicMetaRequest build() {
            return new UpdateProjectBasicMetaRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProjectBasicMetaRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectBasicMetaRequest</p>
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
             * <p>The data encryption algorithm. The supported encryption algorithms include AES256, AESCTR, and RC4.</p>
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
             * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of key used for data encryption, including the default key (MaxCompute Default Key) and Bring Your Own Key (BYOK). The default key (MaxCompute Default Key) is a default key created internally by MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
     * {@link UpdateProjectBasicMetaRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectBasicMetaRequest</p>
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
             * <li><strong>mandatory</strong>: The Lifecycle clause is required. You must configure the lifecycle of a table.</li>
             * <li><strong>optional</strong>: The Lifecycle clause is optional when you create a table. If the lifecycle of a table is not configured, the table is permanently valid.</li>
             * <li><strong>inherit</strong>: If the lifecycle of a table is not configured when you create a table, the lifecycle of the table is set to the value of odps.table.lifecycle.value.</li>
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
             * <p>The lifecycle of a table. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
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
     * {@link UpdateProjectBasicMetaRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectBasicMetaRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowFullScan")
        private Boolean allowFullScan;

        @com.aliyun.core.annotation.NameInMap("enableDataMasking")
        private Boolean enableDataMasking;

        @com.aliyun.core.annotation.NameInMap("enableDecimal2")
        private Boolean enableDecimal2;

        @com.aliyun.core.annotation.NameInMap("enableDr")
        private Boolean enableDr;

        @com.aliyun.core.annotation.NameInMap("enableTunnelQuotaRoute")
        private Boolean enableTunnelQuotaRoute;

        @com.aliyun.core.annotation.NameInMap("encryption")
        private Encryption encryption;

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
            this.enableDataMasking = builder.enableDataMasking;
            this.enableDecimal2 = builder.enableDecimal2;
            this.enableDr = builder.enableDr;
            this.enableTunnelQuotaRoute = builder.enableTunnelQuotaRoute;
            this.encryption = builder.encryption;
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
         * @return enableDataMasking
         */
        public Boolean getEnableDataMasking() {
            return this.enableDataMasking;
        }

        /**
         * @return enableDecimal2
         */
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        /**
         * @return enableDr
         */
        public Boolean getEnableDr() {
            return this.enableDr;
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
            private Boolean enableDataMasking; 
            private Boolean enableDecimal2; 
            private Boolean enableDr; 
            private Boolean enableTunnelQuotaRoute; 
            private Encryption encryption; 
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
                this.enableDataMasking = model.enableDataMasking;
                this.enableDecimal2 = model.enableDecimal2;
                this.enableDr = model.enableDr;
                this.enableTunnelQuotaRoute = model.enableTunnelQuotaRoute;
                this.encryption = model.encryption;
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
             * enableDataMasking.
             */
            public Builder enableDataMasking(Boolean enableDataMasking) {
                this.enableDataMasking = enableDataMasking;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Decimal data type of MaxCompute 2.0 for the project.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDecimal2(Boolean enableDecimal2) {
                this.enableDecimal2 = enableDecimal2;
                return this;
            }

            /**
             * enableDr.
             */
            public Builder enableDr(Boolean enableDr) {
                this.enableDr = enableDr;
                return this;
            }

            /**
             * <p>Specifies whether to enable resource group routing for the data transfer service.</p>
             * <ul>
             * <li>true: The data transfer tasks submitted by this project use the bound data transfer service resource group by default.</li>
             * <li>false: The data transfer tasks submitted by this project use the shared data transfer service resource group by default.</li>
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
             * <p>The number of days to retain backup data. During this period, you can restore the current version to any backed-up data version.
             * Valid values: [0, 30]. Default value: 1. A value of 0 indicates that the backup feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The maximum threshold for a single SQL statement consumption.
             * Unit: scan volume (GB) × complexity.</p>
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
             * <p>The time zone of the project, which is the <code>odps.sql.timezone</code> property.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/overview-of-dts">Data Transfer Service</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Data Transfer Service</a> resource group bound to the project.</p>
             * <ul>
             * <li><p>Default (shared data transfer service resource group): The project is not allowed to use subscription-based data transfer service resource groups. Regardless of the default data transfer service resource group setting, data transfer tasks submitted by this project automatically use the Default resource group.</p>
             * </li>
             * <li><p>Subscription-based data transfer service resource group: The project is allowed to use subscription-based data transfer service resource groups.</p>
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
             * <li><strong>1</strong>: Edition 1.0</li>
             * <li><strong>2</strong>: Edition 2.0</li>
             * <li><strong>hive</strong>: Hive-compatible type</li>
             * </ul>
             * <p>For more information about the differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
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
}
