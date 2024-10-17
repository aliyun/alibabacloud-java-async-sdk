// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The query results for compute engines that are returned on multiple pages.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCalcEnginesResponseBody build() {
            return new ListCalcEnginesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCalcEnginesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalcEnginesResponseBody</p>
     */
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
             * <p>The ID of the workspace with which the compute engine is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder bindingProjectId(Integer bindingProjectId) {
                this.bindingProjectId = bindingProjectId;
                return this;
            }

            /**
             * <p>The name of the workspace with which the compute engine is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder bindingProjectName(String bindingProjectName) {
                this.bindingProjectName = bindingProjectName;
                return this;
            }

            /**
             * <p>The type of the compute engine.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS</p>
             */
            public Builder calcEngineType(String calcEngineType) {
                this.calcEngineType = calcEngineType;
                return this;
            }

            /**
             * <p>The region where the DataWorks workspace with which the compute engine is associated resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder dwRegion(String dwRegion) {
                this.dwRegion = dwRegion;
                return this;
            }

            /**
             * <p>The compute engine ID.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder engineId(Integer engineId) {
                this.engineId = engineId;
                return this;
            }

            /**
             * <p>The details of the compute engine.</p>
             * <ul>
             * <li><p>ODPS</p>
             * <pre><code>{
             *   &quot;pubEndpoint&quot;: &quot;service.cn.maxcompute.aliyun.com/api&quot;,
             *   &quot;endpoint&quot;: &quot;service.cn.maxcompute.aliyun-inc.com/api&quot;,
             *   &quot;initProperties&quot;: &quot; 
             *   {\&quot;odpsTypeMode\&quot;:\&quot;STANDARD\&quot;,\&quot;openPai\&quot;:false,\&quot;openPaiGpu\&quot;:false}&quot;,
             *   &quot;resourceGroupType&quot;: &quot;ODPS&quot;,
             *   &quot;resourceGroupId&quot;: &quot;361826516****&quot;,
             *   &quot;vpcEndpoint&quot;: &quot;service.cn.maxcompute.aliyun-inc.com/api&quot;,
             *   &quot;projectName&quot;: &quot;onefall_test_zjk&quot;,
             *   &quot;taskSameAsOwner&quot;: &quot;true&quot;
             * }
             * </code></pre>
             * </li>
             * <li><p>EMR</p>
             * <pre><code>{
             *   &quot;emrClusterId&quot;: &quot;C-xxx&quot;,
             *   &quot;specs&quot;: &quot;{\&quot;emrClusterId\&quot;:\&quot;C-xxx\&quot;,\&quot;emrAccessMode\&quot;:\&quot;simple\&quot;,\&quot;emrResourceQueueName\&quot;:\&quot;default\&quot;,\&quot;emrProjectId\&quot;:\&quot;FP-xxx\&quot;}&quot;,
             *   &quot;endpoint&quot;: &quot;emr.aliyuncs.com&quot;,
             *   &quot;emrResourceQueueName&quot;: &quot;default&quot;,
             *   &quot;emrAccessMode&quot;: &quot;simple&quot;,
             *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
             *   &quot;projectName&quot;: &quot;xx-xxxx&quot;,
             *   &quot;emrProjectId&quot;: &quot;FP-xxxx&quot;,
             *   &quot;taskSameAsOwner&quot;: &quot;false&quot;
             * }   
             * </code></pre>
             * </li>
             * <li><p>BLINK</p>
             * <pre><code>{
             *   &quot;bayesProjectId&quot;: &quot;xxxx&quot;,
             *   &quot;bayesProjectName&quot;: &quot;xc_blxxixxxnk_1&quot;,
             *   &quot;cluster&quot;: &quot;xxxssxsx&quot;,
             *   &quot;endpoint&quot;: &quot;https://stream.console.aliyun.com&quot;,
             *   &quot;engineType&quot;: &quot;BLINK&quot;,
             *   &quot;name&quot;: &quot;xsxsxxxxx&quot;,
             *   &quot;projectName&quot;: &quot;xc_blxxxsxink_1&quot;,
             *   &quot;queue&quot;: &quot;root.xc_blxsxxxxxxink_1&quot;,
             *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
             *   &quot;specs&quot;: &quot;{\&quot;cluster\&quot;:\&quot;xxxxxx\&quot;,\&quot;bayesProjectName\&quot;:\&quot;xc_blxxixxxnk_1\&quot;,\&quot;bayesProjectId\&quot;:\&quot;ssxxxsa\&quot;,\&quot;name\&quot;:\&quot;sxsxsxxx\&quot;,\&quot;queue\&quot;:\&quot;root.sxxsxxsx\&quot;}&quot;,
             *   &quot;taskSameAsOwner&quot;: false
             * }
             * </code></pre>
             * </li>
             * <li><p>HOLO</p>
             * <pre><code>{
             *   &quot;endpoint&quot;: &quot;hgprecn-cn-xsxssxsx-cn-shanghai-internal.hologres.aliyuncs.com:80&quot;,
             *   &quot;engineType&quot;: &quot;ODPS&quot;,
             *   &quot;odpsEndpoint&quot;: &quot;hgprecn-cn-xsxssxxs-cn-shanghai-internal.hologres.aliyuncs.com:80&quot;,
             *   &quot;odpsProjectName&quot;: &quot;xsxssxsxsx&quot;,
             *   &quot;projectName&quot;: &quot;xsxssxsxsx&quot;,
             *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
             *   &quot;specs&quot;: &quot;{\&quot;pubEndpoint\&quot;:\&quot;hgprecn-cn-xsxssxsxs-cn-shanghai.hologres.aliyuncs.com:80\&quot;,\&quot;commonBuyInstanceId\&quot;:\&quot;hgprecn-cn-xsxsxsxs\&quot;,\&quot;project\&quot;:\&quot;holo_upxsxgrade1\&quot;,\&quot;common_buy_instance_id\&quot;:\&quot;hgprecn-cn-xsxsxs\&quot;,\&quot;endpoint\&quot;:\&quot;hgprecn-cn-xsxxsxs-cn-shanghai-internal.hologres.aliyuncs.com:80\&quot;,\&quot;port\&quot;:\&quot;80\&quot;,\&quot;host\&quot;:\&quot;hgprecn-cn-xsxsxsxs-cn-shanghai-internal.hologres.aliyuncs.com\&quot;,\&quot;vpcEndpoint\&quot;:\&quot;hgprecn-cn-xsxsxsxs-cn-shanghai-vpc.hologres.aliyuncs.com:80\&quot;,\&quot;authType\&quot;:2,\&quot;region\&quot;:\&quot;cn-shanghai\&quot;}&quot;,
             *   &quot;taskSameAsOwner&quot;: false
             * }
             * </code></pre>
             * </li>
             * <li><p>MaxGraph</p>
             * <pre><code>{
             *   &quot;endpoint&quot;: &quot;http://pre-graphcompute.aliyuncs.com&quot;,
             *   &quot;engineType&quot;: &quot;ODPS&quot;,
             *   &quot;odpsEndpoint&quot;: &quot;http://pre-graphcompute.aliyuncs.com&quot;,
             *   &quot;odpsProjectName&quot;: &quot;xsxsxsxs&quot;,
             *   &quot;projectName&quot;: &quot;xsxsxsxs&quot;,
             *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
             *   &quot;taskSameAsOwner&quot;: false
             * }
             * </code></pre>
             * </li>
             * <li><p>HYBRIDDB_FOR_POSTGRESQL</p>
             * <pre><code>{
             *   &quot;endpoint&quot;: &quot;hybriddb_for_postgresql_mo12121ck_endpoint&quot;,
             *   &quot;engineType&quot;: &quot;ODPS&quot;,
             *   &quot;odpsEndpoint&quot;: &quot;hybriddb_for_postgresql_m121212ock_endpoint&quot;,
             *   &quot;odpsProjectName&quot;: &quot;sxasaxsaxaxas&quot;,
             *   &quot;projectName&quot;: &quot;sxasaxsaxaxas&quot;,
             *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
             *   &quot;specs&quot;: &quot;{\&quot;connectionString\&quot;:\&quot;gp-xsxsxsxxs.gpdb.rds.aliyuncs.com\&quot;,\&quot;database\&quot;:\&quot;xsxsxxsxs\&quot;,\&quot;password\&quot;:\&quot;xxxxxxx\&quot;,\&quot;instanceId\&quot;:\&quot;gp-cdcdacdacda\&quot;,\&quot;port\&quot;:\&quot;3432\&quot;,\&quot;ownerId\&quot;:\&quot;12121212\&quot;,\&quot;username\&quot;:\&quot;sdasaddsa\&quot;}&quot;,
             *   &quot;taskSameAsOwner&quot;: false
             * }
             * </code></pre>
             * </li>
             * <li><p>ADB_MYSQL</p>
             * <pre><code>{
             *   &quot;endpoint&quot;: &quot;adb_mysql_mock_endpoint&quot;,
             *   &quot;engineType&quot;: &quot;ODPS&quot;,
             *   &quot;odpsEndpoint&quot;: &quot;adb_mysql_mock_endpoint&quot;,
             *   &quot;odpsProjectName&quot;: &quot;am-xsaxaxa&quot;,
             *   &quot;projectName&quot;: &quot;am-xsxsaxa&quot;,
             *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
             *   &quot;specs&quot;: &quot;{\&quot;connectionString\&quot;:\&quot;am-xsaxsa.ads.aliyuncs.com:3306\&quot;,\&quot;database\&quot;:\&quot;xsaxsaxa\&quot;,\&quot;password\&quot;:\&quot;xsaxsaxassxsa\&quot;,\&quot;instanceId\&quot;:\&quot;am-xsaxsasx\&quot;,\&quot;username\&quot;:\&quot;xsaxsadsd\&quot;}&quot;,
             *   &quot;taskSameAsOwner&quot;: false
             * }
             * </code></pre>
             * </li>
             * <li><p>HADOOP_CDH</p>
             * <pre><code>{
             *   &quot;bindingBaseId&quot;: &quot;xsaxsaxs&quot;,
             *   &quot;endpoint&quot;: &quot;xsaaaaa&quot;,
             *   &quot;engineType&quot;: &quot;ODPS&quot;,
             *   &quot;odpsEndpoint&quot;: &quot;axsxaxssxs&quot;,
             *   &quot;odpsProjectName&quot;: &quot;ssxxax&quot;,
             *   &quot;projectName&quot;: &quot;xsaxsaxsa&quot;,
             *   &quot;resourceGroupId&quot;: 45208xxxxxx,
             *   &quot;resourceGroupType&quot;: &quot;GATEWAY&quot;,
             *   &quot;specs&quot;: &quot;{\&quot;cluster\&quot;:{\&quot;hive\&quot;:{\&quot;hiveServer2Url\&quot;:\&quot;jdbc:hive2://xxxxxxer-1-cn-shanghai-pre-kerberos-1:10000\&quot;,\&quot;hiveMetastore\&quot;:\&quot;thrift://xxxxxxxr-1-cn-shanghai-pre-kerberos-1:9083\&quot;,\&quot;version\&quot;:\&quot;2.1.1\&quot;},\&quot;configFiles\&quot;:{\&quot;coreSite\&quot;:\&quot;4534574xxxxxx\&quot;,\&quot;hdfsSite\&quot;:\&quot;453457919xxxxxxx\&quot;,\&quot;mapredSite\&quot;:\&quot;45345750xxxxxx\&quot;,\&quot;yarnSite\&quot;:\&quot;4534575xxxxx\&quot;,\&quot;krb5Conf\&quot;:\&quot;4534576xxxxx1\&quot;,\&quot;hiveSite\&quot;:\&quot;453457xxxxx20\&quot;},\&quot;spark\&quot;:{\&quot;version\&quot;:\&quot;2.4.0\&quot;},\&quot;cdh\&quot;:{\&quot;version\&quot;:\&quot;6.3.2\&quot;},\&quot;hdfs\&quot;:{\&quot;version\&quot;:\&quot;3.0.0\&quot;},\&quot;impala\&quot;:{\&quot;impalaUrl\&quot;:\&quot;jdbc:impala://cdh-xsxssxxsx-1-cn-shanghai-pre-kerberos-1:21050\&quot;,\&quot;version\&quot;:\&quot;3.2.0\&quot;},\&quot;yarn\&quot;:{\&quot;YarnUrl\&quot;:\&quot;http://cdh-xsxsxsxsxs-1-cn-shanghai-pre-kerberos-1:8032\&quot;,\&quot;webUrl\&quot;:\&quot;http://cdh-xsxsxssxxssx-1-cn-shanghai-pre-kerberos-1:8088\&quot;,\&quot;version\&quot;:\&quot;3.0.0\&quot;},\&quot;presto\&quot;:{\&quot;prestoUrl\&quot;:\&quot;jdbc:presto://cdh-xssxsxxsxsxs-1-cn-shanghai-pre-kerberos-1:8080/hive/default\&quot;,\&quot;version\&quot;:\&quot;0.244.1\&quot;}},\&quot;instanceId\&quot;:161sdads733,\&quot;authDetail\&quot;:{\&quot;principal\&quot;:\&quot;hive@HADOOP.COM\&quot;,\&quot;keytabFileId\&quot;:\&quot;45345815xsxsxs3\&quot;,\&quot;type\&quot;:\&quot;kerberos\&quot;,\&quot;username\&quot;:\&quot;xsxsxsxsa@HADOOP.COM\&quot;},\&quot;resGroupStatus\&quot;:\&quot;\&quot;,\&quot;hadoopAuthType\&quot;:\&quot;kerberos\&quot;,\&quot;clusterIdentifier\&quot;:\&quot;xssxsxsxsx\&quot;,\&quot;clusterId\&quot;:xsxsx,\&quot;resGroupId\&quot;:4520870619xsxssxxs,\&quot;accessMode\&quot;:\&quot;security\&quot;,\&quot;authType\&quot;:2}&quot;,
             *   &quot;taskSameAsOwner&quot;: false
             * }
             * </code></pre>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pubEndpoint&quot;:&quot;<a href="http://service.cn.maxcompute.aliyun.com/api%22,%22endpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22resourceGroupType%22:%22ODPS%22,%22resourceGroupId%22:%22361826516****%22,%22vpcEndpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22projectName%22:%22onefall_test_zjk%22,%22taskSameAsOwner%22:%22true%22%7D">http://service.cn.maxcompute.aliyun.com/api&quot;,&quot;endpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;resourceGroupType&quot;:&quot;ODPS&quot;,&quot;resourceGroupId&quot;:&quot;361826516****&quot;,&quot;vpcEndpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;projectName&quot;:&quot;onefall_test_zjk&quot;,&quot;taskSameAsOwner&quot;:&quot;true&quot;}</a></p>
             */
            public Builder engineInfo(java.util.Map < String, ? > engineInfo) {
                this.engineInfo = engineInfo;
                return this;
            }

            /**
             * <p>The environment in which the compute engine is used. Valid values:</p>
             * <ul>
             * <li><strong>DEV</strong></li>
             * <li><strong>PRD</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRD</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The time when the compute engine was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Oct 10, 2019 3:42:44 PM</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Indicates whether the compute engine is the default engine of the current type.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The display name of the compute engine.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region where the compute engine resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The identity that is used to access the compute engine. Valid values:</p>
             * <ul>
             * <li><strong>USER</strong>: the current user</li>
             * <li><strong>PROJECT</strong>: the workspace executor</li>
             * <li><strong>SUBACCOUNT</strong>: a RAM user</li>
             * <li><strong>STS_ROLE</strong>: the Security Token Service (STS) role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROJECT</p>
             */
            public Builder taskAuthType(String taskAuthType) {
                this.taskAuthType = taskAuthType;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
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
    /**
     * 
     * {@link ListCalcEnginesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalcEnginesResponseBody</p>
     */
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
             * <p>The compute engines.</p>
             */
            public Builder calcEngines(java.util.List < CalcEngines> calcEngines) {
                this.calcEngines = calcEngines;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of compute engine instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
