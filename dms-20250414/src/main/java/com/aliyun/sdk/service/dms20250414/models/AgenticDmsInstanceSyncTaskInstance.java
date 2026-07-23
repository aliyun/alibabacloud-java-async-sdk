// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AgenticDmsInstanceSyncTaskInstance} extends {@link TeaModel}
 *
 * <p>AgenticDmsInstanceSyncTaskInstance</p>
 */
public class AgenticDmsInstanceSyncTaskInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.NameInMap("CrawlerTaskId")
    private String crawlerTaskId;

    @com.aliyun.core.annotation.NameInMap("DatasourceUuid")
    private String datasourceUuid;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("DmsInstanceId")
    private String dmsInstanceId;

    @com.aliyun.core.annotation.NameInMap("DmsInstanceSummary")
    private DmsInstanceSummary dmsInstanceSummary;

    @com.aliyun.core.annotation.NameInMap("DmsRegionId")
    private String dmsRegionId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorSummary")
    private String errorSummary;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AgenticDmsInstanceSyncTaskInstance(Builder builder) {
        this.catalogUuid = builder.catalogUuid;
        this.crawlerTaskId = builder.crawlerTaskId;
        this.datasourceUuid = builder.datasourceUuid;
        this.dbType = builder.dbType;
        this.dmsInstanceId = builder.dmsInstanceId;
        this.dmsInstanceSummary = builder.dmsInstanceSummary;
        this.dmsRegionId = builder.dmsRegionId;
        this.errorCode = builder.errorCode;
        this.errorSummary = builder.errorSummary;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.phase = builder.phase;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticDmsInstanceSyncTaskInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return crawlerTaskId
     */
    public String getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    /**
     * @return datasourceUuid
     */
    public String getDatasourceUuid() {
        return this.datasourceUuid;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return dmsInstanceId
     */
    public String getDmsInstanceId() {
        return this.dmsInstanceId;
    }

    /**
     * @return dmsInstanceSummary
     */
    public DmsInstanceSummary getDmsInstanceSummary() {
        return this.dmsInstanceSummary;
    }

    /**
     * @return dmsRegionId
     */
    public String getDmsRegionId() {
        return this.dmsRegionId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorSummary
     */
    public String getErrorSummary() {
        return this.errorSummary;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String catalogUuid; 
        private String crawlerTaskId; 
        private String datasourceUuid; 
        private String dbType; 
        private String dmsInstanceId; 
        private DmsInstanceSummary dmsInstanceSummary; 
        private String dmsRegionId; 
        private String errorCode; 
        private String errorSummary; 
        private String gmtCreate; 
        private String gmtModified; 
        private String phase; 
        private String status; 

        private Builder() {
        } 

        private Builder(AgenticDmsInstanceSyncTaskInstance model) {
            this.catalogUuid = model.catalogUuid;
            this.crawlerTaskId = model.crawlerTaskId;
            this.datasourceUuid = model.datasourceUuid;
            this.dbType = model.dbType;
            this.dmsInstanceId = model.dmsInstanceId;
            this.dmsInstanceSummary = model.dmsInstanceSummary;
            this.dmsRegionId = model.dmsRegionId;
            this.errorCode = model.errorCode;
            this.errorSummary = model.errorSummary;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.phase = model.phase;
            this.status = model.status;
        } 

        /**
         * CatalogUuid.
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * CrawlerTaskId.
         */
        public Builder crawlerTaskId(String crawlerTaskId) {
            this.crawlerTaskId = crawlerTaskId;
            return this;
        }

        /**
         * DatasourceUuid.
         */
        public Builder datasourceUuid(String datasourceUuid) {
            this.datasourceUuid = datasourceUuid;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * DmsInstanceId.
         */
        public Builder dmsInstanceId(String dmsInstanceId) {
            this.dmsInstanceId = dmsInstanceId;
            return this;
        }

        /**
         * DmsInstanceSummary.
         */
        public Builder dmsInstanceSummary(DmsInstanceSummary dmsInstanceSummary) {
            this.dmsInstanceSummary = dmsInstanceSummary;
            return this;
        }

        /**
         * DmsRegionId.
         */
        public Builder dmsRegionId(String dmsRegionId) {
            this.dmsRegionId = dmsRegionId;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorSummary.
         */
        public Builder errorSummary(String errorSummary) {
            this.errorSummary = errorSummary;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AgenticDmsInstanceSyncTaskInstance build() {
            return new AgenticDmsInstanceSyncTaskInstance(this);
        } 

    } 

    /**
     * 
     * {@link AgenticDmsInstanceSyncTaskInstance} extends {@link TeaModel}
     *
     * <p>AgenticDmsInstanceSyncTaskInstance</p>
     */
    public static class DmsInstanceSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceResourceId")
        private String instanceResourceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSource")
        private String instanceSource;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private DmsInstanceSummary(Builder builder) {
            this.alias = builder.alias;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceResourceId = builder.instanceResourceId;
            this.instanceSource = builder.instanceSource;
            this.port = builder.port;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DmsInstanceSummary create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceResourceId
         */
        public String getInstanceResourceId() {
            return this.instanceResourceId;
        }

        /**
         * @return instanceSource
         */
        public String getInstanceSource() {
            return this.instanceSource;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String alias; 
            private String dbType; 
            private String envType; 
            private String host; 
            private String instanceResourceId; 
            private String instanceSource; 
            private Integer port; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(DmsInstanceSummary model) {
                this.alias = model.alias;
                this.dbType = model.dbType;
                this.envType = model.envType;
                this.host = model.host;
                this.instanceResourceId = model.instanceResourceId;
                this.instanceSource = model.instanceSource;
                this.port = model.port;
                this.regionId = model.regionId;
            } 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * InstanceResourceId.
             */
            public Builder instanceResourceId(String instanceResourceId) {
                this.instanceResourceId = instanceResourceId;
                return this;
            }

            /**
             * InstanceSource.
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public DmsInstanceSummary build() {
                return new DmsInstanceSummary(this);
            } 

        } 

    }
}
