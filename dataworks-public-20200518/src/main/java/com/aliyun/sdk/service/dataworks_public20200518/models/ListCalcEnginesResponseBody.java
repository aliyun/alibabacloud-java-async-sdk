// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCalcEnginesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalcEnginesResponseBody</p>
 */
public class ListCalcEnginesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCalcEnginesResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalcEnginesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The query results for compute engines that are returned on multiple pages.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCalcEnginesResponseBody build() {
            return new ListCalcEnginesResponseBody(this);
        } 

    } 

    public static class CalcEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingProjectId")
        private Integer bindingProjectId;

        @com.aliyun.core.annotation.NameInMap("BindingProjectName")
        private String bindingProjectName;

        @com.aliyun.core.annotation.NameInMap("CalcEngineType")
        private String calcEngineType;

        @com.aliyun.core.annotation.NameInMap("DwRegion")
        private String dwRegion;

        @com.aliyun.core.annotation.NameInMap("EngineId")
        private Integer engineId;

        @com.aliyun.core.annotation.NameInMap("EngineInfo")
        private java.util.Map < String, ? > engineInfo;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TaskAuthType")
        private String taskAuthType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private CalcEngines(Builder builder) {
            this.bindingProjectId = builder.bindingProjectId;
            this.bindingProjectName = builder.bindingProjectName;
            this.calcEngineType = builder.calcEngineType;
            this.dwRegion = builder.dwRegion;
            this.engineId = builder.engineId;
            this.engineInfo = builder.engineInfo;
            this.envType = builder.envType;
            this.gmtCreate = builder.gmtCreate;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.region = builder.region;
            this.taskAuthType = builder.taskAuthType;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalcEngines create() {
            return builder().build();
        }

        /**
         * @return bindingProjectId
         */
        public Integer getBindingProjectId() {
            return this.bindingProjectId;
        }

        /**
         * @return bindingProjectName
         */
        public String getBindingProjectName() {
            return this.bindingProjectName;
        }

        /**
         * @return calcEngineType
         */
        public String getCalcEngineType() {
            return this.calcEngineType;
        }

        /**
         * @return dwRegion
         */
        public String getDwRegion() {
            return this.dwRegion;
        }

        /**
         * @return engineId
         */
        public Integer getEngineId() {
            return this.engineId;
        }

        /**
         * @return engineInfo
         */
        public java.util.Map < String, ? > getEngineInfo() {
            return this.engineInfo;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return taskAuthType
         */
        public String getTaskAuthType() {
            return this.taskAuthType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Integer bindingProjectId; 
            private String bindingProjectName; 
            private String calcEngineType; 
            private String dwRegion; 
            private Integer engineId; 
            private java.util.Map < String, ? > engineInfo; 
            private String envType; 
            private String gmtCreate; 
            private Boolean isDefault; 
            private String name; 
            private String region; 
            private String taskAuthType; 
            private Long tenantId; 

            /**
             * The ID of the workspace with which the compute engine is associated.
             */
            public Builder bindingProjectId(Integer bindingProjectId) {
                this.bindingProjectId = bindingProjectId;
                return this;
            }

            /**
             * The name of the workspace with which the compute engine is associated.
             */
            public Builder bindingProjectName(String bindingProjectName) {
                this.bindingProjectName = bindingProjectName;
                return this;
            }

            /**
             * The type of the compute engine.
             */
            public Builder calcEngineType(String calcEngineType) {
                this.calcEngineType = calcEngineType;
                return this;
            }

            /**
             * The region where the DataWorks workspace with which the compute engine is associated resides.
             */
            public Builder dwRegion(String dwRegion) {
                this.dwRegion = dwRegion;
                return this;
            }

            /**
             * The compute engine ID.
             */
            public Builder engineId(Integer engineId) {
                this.engineId = engineId;
                return this;
            }

            /**
             * The details of the compute engine.
             * <p>
             * 
             * *   ODPS
             * 
             *         {
             *           "pubEndpoint": "service.cn.maxcompute.aliyun.com/api",
             *           "endpoint": "service.cn.maxcompute.aliyun-inc.com/api",
             *           "initProperties": " 
             *           {\"odpsTypeMode\":\"STANDARD\",\"openPai\":false,\"openPaiGpu\":false}",
             *           "resourceGroupType": "ODPS",
             *           "resourceGroupId": "361826516****",
             *           "vpcEndpoint": "service.cn.maxcompute.aliyun-inc.com/api",
             *           "projectName": "onefall_test_zjk",
             *           "taskSameAsOwner": "true"
             *         }
             * 
             * *   EMR
             * 
             *         {
             *           "emrClusterId": "C-xxx",
             *           "specs": "{\"emrClusterId\":\"C-xxx\",\"emrAccessMode\":\"simple\",\"emrResourceQueueName\":\"default\",\"emrProjectId\":\"FP-xxx\"}",
             *           "endpoint": "emr.aliyuncs.com",
             *           "emrResourceQueueName": "default",
             *           "emrAccessMode": "simple",
             *           "resourceGroupType": "DW",
             *           "projectName": "xx-xxxx",
             *           "emrProjectId": "FP-xxxx",
             *           "taskSameAsOwner": "false"
             *         }   
             * 
             * *   BLINK
             * 
             *         {
             *           "bayesProjectId": "xxxx",
             *           "bayesProjectName": "xc_blxxixxxnk_1",
             *           "cluster": "xxxssxsx",
             *           "endpoint": "https://stream.console.aliyun.com",
             *           "engineType": "BLINK",
             *           "name": "xsxsxxxxx",
             *           "projectName": "xc_blxxxsxink_1",
             *           "queue": "root.xc_blxsxxxxxxink_1",
             *           "resourceGroupType": "DW",
             *           "specs": "{\"cluster\":\"xxxxxx\",\"bayesProjectName\":\"xc_blxxixxxnk_1\",\"bayesProjectId\":\"ssxxxsa\",\"name\":\"sxsxsxxx\",\"queue\":\"root.sxxsxxsx\"}",
             *           "taskSameAsOwner": false
             *         }
             * 
             * *   HOLO
             * 
             *         {
             *           "endpoint": "hgprecn-cn-xsxssxsx-cn-shanghai-internal.hologres.aliyuncs.com:80",
             *           "engineType": "ODPS",
             *           "odpsEndpoint": "hgprecn-cn-xsxssxxs-cn-shanghai-internal.hologres.aliyuncs.com:80",
             *           "odpsProjectName": "xsxssxsxsx",
             *           "projectName": "xsxssxsxsx",
             *           "resourceGroupType": "DW",
             *           "specs": "{\"pubEndpoint\":\"hgprecn-cn-xsxssxsxs-cn-shanghai.hologres.aliyuncs.com:80\",\"commonBuyInstanceId\":\"hgprecn-cn-xsxsxsxs\",\"project\":\"holo_upxsxgrade1\",\"common_buy_instance_id\":\"hgprecn-cn-xsxsxs\",\"endpoint\":\"hgprecn-cn-xsxxsxs-cn-shanghai-internal.hologres.aliyuncs.com:80\",\"port\":\"80\",\"host\":\"hgprecn-cn-xsxsxsxs-cn-shanghai-internal.hologres.aliyuncs.com\",\"vpcEndpoint\":\"hgprecn-cn-xsxsxsxs-cn-shanghai-vpc.hologres.aliyuncs.com:80\",\"authType\":2,\"region\":\"cn-shanghai\"}",
             *           "taskSameAsOwner": false
             *         }
             * 
             * *   MaxGraph
             * 
             *         {
             *           "endpoint": "http://pre-graphcompute.aliyuncs.com",
             *           "engineType": "ODPS",
             *           "odpsEndpoint": "http://pre-graphcompute.aliyuncs.com",
             *           "odpsProjectName": "xsxsxsxs",
             *           "projectName": "xsxsxsxs",
             *           "resourceGroupType": "DW",
             *           "taskSameAsOwner": false
             *         }
             * 
             * *   HYBRIDDB_FOR_POSTGRESQL
             * 
             *         {
             *           "endpoint": "hybriddb_for_postgresql_mo12121ck_endpoint",
             *           "engineType": "ODPS",
             *           "odpsEndpoint": "hybriddb_for_postgresql_m121212ock_endpoint",
             *           "odpsProjectName": "sxasaxsaxaxas",
             *           "projectName": "sxasaxsaxaxas",
             *           "resourceGroupType": "DW",
             *           "specs": "{\"connectionString\":\"gp-xsxsxsxxs.gpdb.rds.aliyuncs.com\",\"database\":\"xsxsxxsxs\",\"password\":\"xxxxxxx\",\"instanceId\":\"gp-cdcdacdacda\",\"port\":\"3432\",\"ownerId\":\"12121212\",\"username\":\"sdasaddsa\"}",
             *           "taskSameAsOwner": false
             *         }
             * 
             * *   ADB_MYSQL
             * 
             *         {
             *           "endpoint": "adb_mysql_mock_endpoint",
             *           "engineType": "ODPS",
             *           "odpsEndpoint": "adb_mysql_mock_endpoint",
             *           "odpsProjectName": "am-xsaxaxa",
             *           "projectName": "am-xsxsaxa",
             *           "resourceGroupType": "DW",
             *           "specs": "{\"connectionString\":\"am-xsaxsa.ads.aliyuncs.com:3306\",\"database\":\"xsaxsaxa\",\"password\":\"xsaxsaxassxsa\",\"instanceId\":\"am-xsaxsasx\",\"username\":\"xsaxsadsd\"}",
             *           "taskSameAsOwner": false
             *         }
             * 
             * *   HADOOP_CDH
             * 
             *         {
             *           "bindingBaseId": "xsaxsaxs",
             *           "endpoint": "xsaaaaa",
             *           "engineType": "ODPS",
             *           "odpsEndpoint": "axsxaxssxs",
             *           "odpsProjectName": "ssxxax",
             *           "projectName": "xsaxsaxsa",
             *           "resourceGroupId": 45208xxxxxx,
             *           "resourceGroupType": "GATEWAY",
             *           "specs": "{\"cluster\":{\"hive\":{\"hiveServer2Url\":\"jdbc:hive2://xxxxxxer-1-cn-shanghai-pre-kerberos-1:10000\",\"hiveMetastore\":\"thrift://xxxxxxxr-1-cn-shanghai-pre-kerberos-1:9083\",\"version\":\"2.1.1\"},\"configFiles\":{\"coreSite\":\"4534574xxxxxx\",\"hdfsSite\":\"453457919xxxxxxx\",\"mapredSite\":\"45345750xxxxxx\",\"yarnSite\":\"4534575xxxxx\",\"krb5Conf\":\"4534576xxxxx1\",\"hiveSite\":\"453457xxxxx20\"},\"spark\":{\"version\":\"2.4.0\"},\"cdh\":{\"version\":\"6.3.2\"},\"hdfs\":{\"version\":\"3.0.0\"},\"impala\":{\"impalaUrl\":\"jdbc:impala://cdh-xsxssxxsx-1-cn-shanghai-pre-kerberos-1:21050\",\"version\":\"3.2.0\"},\"yarn\":{\"YarnUrl\":\"http://cdh-xsxsxsxsxs-1-cn-shanghai-pre-kerberos-1:8032\",\"webUrl\":\"http://cdh-xsxsxssxxssx-1-cn-shanghai-pre-kerberos-1:8088\",\"version\":\"3.0.0\"},\"presto\":{\"prestoUrl\":\"jdbc:presto://cdh-xssxsxxsxsxs-1-cn-shanghai-pre-kerberos-1:8080/hive/default\",\"version\":\"0.244.1\"}},\"instanceId\":161sdads733,\"authDetail\":{\"principal\":\"hive@HADOOP.COM\",\"keytabFileId\":\"45345815xsxsxs3\",\"type\":\"kerberos\",\"username\":\"xsxsxsxsa@HADOOP.COM\"},\"resGroupStatus\":\"\",\"hadoopAuthType\":\"kerberos\",\"clusterIdentifier\":\"xssxsxsxsx\",\"clusterId\":xsxsx,\"resGroupId\":4520870619xsxssxxs,\"accessMode\":\"security\",\"authType\":2}",
             *           "taskSameAsOwner": false
             *         }
             */
            public Builder engineInfo(java.util.Map < String, ? > engineInfo) {
                this.engineInfo = engineInfo;
                return this;
            }

            /**
             * The environment in which the compute engine is used. Valid values:
             * <p>
             * 
             * *   **DEV**
             * *   **PRD**
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The time when the compute engine was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Indicates whether the compute engine is the default engine of the current type.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The display name of the compute engine.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region where the compute engine resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The identity that is used to access the compute engine. Valid values:
             * <p>
             * 
             * *   **USER**: the current user
             * *   **PROJECT**: the workspace executor
             * *   **SUBACCOUNT**: a RAM user
             * *   **STS_ROLE**: the Security Token Service (STS) role
             */
            public Builder taskAuthType(String taskAuthType) {
                this.taskAuthType = taskAuthType;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public CalcEngines build() {
                return new CalcEngines(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalcEngines")
        private java.util.List < CalcEngines> calcEngines;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.calcEngines = builder.calcEngines;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calcEngines
         */
        public java.util.List < CalcEngines> getCalcEngines() {
            return this.calcEngines;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CalcEngines> calcEngines; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The compute engines.
             */
            public Builder calcEngines(java.util.List < CalcEngines> calcEngines) {
                this.calcEngines = calcEngines;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of compute engine instances.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
