// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DsgRunSensIdentifyRequest} extends {@link RequestModel}
 *
 * <p>DsgRunSensIdentifyRequest</p>
 */
public class DsgRunSensIdentifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EsMetaParams")
    private java.util.List < EsMetaParams> esMetaParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private DsgRunSensIdentifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.esMetaParams = builder.esMetaParams;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgRunSensIdentifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return esMetaParams
     */
    public java.util.List < EsMetaParams> getEsMetaParams() {
        return this.esMetaParams;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DsgRunSensIdentifyRequest, Builder> {
        private String regionId; 
        private java.util.List < EsMetaParams> esMetaParams; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DsgRunSensIdentifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.esMetaParams = request.esMetaParams;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The parameters that you need to configure to scan specified metadata.</p>
         */
        public Builder esMetaParams(java.util.List < EsMetaParams> esMetaParams) {
            String esMetaParamsShrink = shrink(esMetaParams, "EsMetaParams", "json");
            this.putBodyParameter("EsMetaParams", esMetaParamsShrink);
            this.esMetaParams = esMetaParams;
            return this;
        }

        /**
         * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DsgRunSensIdentifyRequest build() {
            return new DsgRunSensIdentifyRequest(this);
        } 

    } 

    /**
     * 
     * {@link DsgRunSensIdentifyRequest} extends {@link TeaModel}
     *
     * <p>DsgRunSensIdentifyRequest</p>
     */
    public static class EsMetaParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableNameList")
        private java.util.List < String > tableNameList;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private EsMetaParams(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dbType = builder.dbType;
            this.instanceId = builder.instanceId;
            this.projectName = builder.projectName;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
            this.tableNameList = builder.tableNameList;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EsMetaParams create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableNameList
         */
        public java.util.List < String > getTableNameList() {
            return this.tableNameList;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String clusterId; 
            private String dbType; 
            private Long instanceId; 
            private String projectName; 
            private String schemaName; 
            private String tableName; 
            private java.util.List < String > tableNameList; 
            private String user; 

            /**
             * <p>The cluster ID. You can obtain the ID based on the data source you use.</p>
             * 
             * <strong>example:</strong>
             * <p>101010</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>ODPS.ODPS</li>
             * <li>EMR</li>
             * <li>HOLO.POSTGRES</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ODPS.ODPS</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The instance ID. You can obtain the ID based on the data source you use.</p>
             * 
             * <strong>example:</strong>
             * <p>hgprecn-cn-9lb37k181024</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the name.</p>
             * 
             * <strong>example:</strong>
             * <p>1666676756691024</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The name of the schema.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>table1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The names of the tables.</p>
             */
            public Builder tableNameList(java.util.List < String > tableNameList) {
                this.tableNameList = tableNameList;
                return this;
            }

            /**
             * <p>The username of the operator. We recommend that you enter the username of your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx-uat</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public EsMetaParams build() {
                return new EsMetaParams(this);
            } 

        } 

    }
}
