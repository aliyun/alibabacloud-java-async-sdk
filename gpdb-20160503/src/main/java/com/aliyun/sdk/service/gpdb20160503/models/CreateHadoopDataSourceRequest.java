// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHadoopDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateHadoopDataSourceRequest</p>
 */
public class CreateHadoopDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmrInstanceId")
    private String emrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HDFSConf")
    private String HDFSConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HadoopCoreConf")
    private String hadoopCoreConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HadoopCreateType")
    private String hadoopCreateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HadoopHostsAddress")
    private String hadoopHostsAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveConf")
    private String hiveConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MapReduceConf")
    private String mapReduceConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YarnConf")
    private String yarnConf;

    private CreateHadoopDataSourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceType = builder.dataSourceType;
        this.emrInstanceId = builder.emrInstanceId;
        this.HDFSConf = builder.HDFSConf;
        this.hadoopCoreConf = builder.hadoopCoreConf;
        this.hadoopCreateType = builder.hadoopCreateType;
        this.hadoopHostsAddress = builder.hadoopHostsAddress;
        this.hiveConf = builder.hiveConf;
        this.mapReduceConf = builder.mapReduceConf;
        this.regionId = builder.regionId;
        this.yarnConf = builder.yarnConf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHadoopDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dataSourceDescription
     */
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return emrInstanceId
     */
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    /**
     * @return HDFSConf
     */
    public String getHDFSConf() {
        return this.HDFSConf;
    }

    /**
     * @return hadoopCoreConf
     */
    public String getHadoopCoreConf() {
        return this.hadoopCoreConf;
    }

    /**
     * @return hadoopCreateType
     */
    public String getHadoopCreateType() {
        return this.hadoopCreateType;
    }

    /**
     * @return hadoopHostsAddress
     */
    public String getHadoopHostsAddress() {
        return this.hadoopHostsAddress;
    }

    /**
     * @return hiveConf
     */
    public String getHiveConf() {
        return this.hiveConf;
    }

    /**
     * @return mapReduceConf
     */
    public String getMapReduceConf() {
        return this.mapReduceConf;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return yarnConf
     */
    public String getYarnConf() {
        return this.yarnConf;
    }

    public static final class Builder extends Request.Builder<CreateHadoopDataSourceRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceDescription; 
        private String dataSourceName; 
        private String dataSourceType; 
        private String emrInstanceId; 
        private String HDFSConf; 
        private String hadoopCoreConf; 
        private String hadoopCreateType; 
        private String hadoopHostsAddress; 
        private String hiveConf; 
        private String mapReduceConf; 
        private String regionId; 
        private String yarnConf; 

        private Builder() {
            super();
        } 

        private Builder(CreateHadoopDataSourceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceDescription = request.dataSourceDescription;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceType = request.dataSourceType;
            this.emrInstanceId = request.emrInstanceId;
            this.HDFSConf = request.HDFSConf;
            this.hadoopCoreConf = request.hadoopCoreConf;
            this.hadoopCreateType = request.hadoopCreateType;
            this.hadoopHostsAddress = request.hadoopHostsAddress;
            this.hiveConf = request.hiveConf;
            this.mapReduceConf = request.mapReduceConf;
            this.regionId = request.regionId;
            this.yarnConf = request.yarnConf;
        } 

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Service description.</p>
         * 
         * <strong>example:</strong>
         * <p>pxf for hdfs data source</p>
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.putQueryParameter("DataSourceDescription", dataSourceDescription);
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs_pxf</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>Type of Hadoop external table to be enabled, with values:</p>
         * <ul>
         * <li><p>HDFS </p>
         * </li>
         * <li><p>Hive</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>When HadoopCreateType=Emr, this field should contain the EMR instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-1234567</p>
         */
        public Builder emrInstanceId(String emrInstanceId) {
            this.putQueryParameter("EmrInstanceId", emrInstanceId);
            this.emrInstanceId = emrInstanceId;
            return this;
        }

        /**
         * <p>Content string of the Hadoop hdfs-site.xml file. This field is required when enabling an HDFS external table.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" ?>
         * <!-- Created at 2023-08-15 13:52:43.945 -->
         * <configuration>
         *     <property>
         *         <name>dfs.datanode.cache.revocation.timeout.ms</name>
         *         <value>900000</value>
         *     </property>
         *     <property>
         *         <name>dfs.namenode.resource.check.interval</name>
         *         <value>5000</value>
         *     </property>
         * </configuration>
         */
        public Builder HDFSConf(String HDFSConf) {
            this.putQueryParameter("HDFSConf", HDFSConf);
            this.HDFSConf = HDFSConf;
            return this;
        }

        /**
         * <p>Content string of the Hadoop core-site.xml file.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" ?>
         * <!-- Created at 2023-08-15 13:52:39.527 -->
         * <configuration>
         *     <property>
         *         <name>hadoop.http.authentication.kerberos.keytab</name>
         *         <value>/etc/emr/hadoop-conf/http.keytab</value>
         *     </property>
         *     <property>
         *         <name>fs.oss.idle.timeout.millisecond</name>
         *         <value>30000</value>
         *     </property>
         *     <property>
         *         <name>fs.oss.download.thread.concurrency</name>
         *         <value>32</value>
         *     </property>
         * </configuration>
         */
        public Builder hadoopCoreConf(String hadoopCoreConf) {
            this.putQueryParameter("HadoopCoreConf", hadoopCoreConf);
            this.hadoopCoreConf = hadoopCoreConf;
            return this;
        }

        /**
         * <p>External service type:</p>
         * <ul>
         * <li><p>emr</p>
         * </li>
         * <li><p>hadoop: Self-built Hadoop</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>emr</p>
         */
        public Builder hadoopCreateType(String hadoopCreateType) {
            this.putQueryParameter("HadoopCreateType", hadoopCreateType);
            this.hadoopCreateType = hadoopCreateType;
            return this;
        }

        /**
         * <p>Address and hostname of the Hadoop cluster&quot;s source node in the /etc/hosts file.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.220.128 master-1-1.c-xxx.cn-shanghai.emr.aliyuncs.com
         * 192.168.220.129 core-1-1.c-xxx.cn-shanghai.emr.aliyuncs.com
         * 192.168.220.130 core-1-2.c-xxx.cn-shanghai.emr.aliyuncs.com</p>
         */
        public Builder hadoopHostsAddress(String hadoopHostsAddress) {
            this.putQueryParameter("HadoopHostsAddress", hadoopHostsAddress);
            this.hadoopHostsAddress = hadoopHostsAddress;
            return this;
        }

        /**
         * <p>Content string of the Hadoop hive-site.xml file. This field is required when enabling a HIVE external table.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" ?>
         * <!-- Created at 2023-08-15 13:52:50.646 -->
         * <configuration>
         *     <property>
         *         <name>hive.exec.reducers.bytes.per.reducer</name>
         *         <value>256000000</value>
         *     </property>
         *     <property>
         *         <name>hive.stats.column.autogather</name>
         *         <value>false</value>
         *     </property>
         * </configuration>
         */
        public Builder hiveConf(String hiveConf) {
            this.putQueryParameter("HiveConf", hiveConf);
            this.hiveConf = hiveConf;
            return this;
        }

        /**
         * <p>Content string of the Hadoop mapred-site.xml file. This field is required when enabling an HDFS external table.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder mapReduceConf(String mapReduceConf) {
            this.putQueryParameter("MapReduceConf", mapReduceConf);
            this.mapReduceConf = mapReduceConf;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Content string of the Hadoop yarn-site.xml file. This field is required when enabling an HDFS external table.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" ?>
         * <!-- Created at 2023-08-15 13:53:29.021 -->
         * <configuration>
         *     <property>
         *         <name>yarn.nodemanager.linux-container-executor.nonsecure-mode.local-user</name>
         *         <value>hadoop</value>
         *     </property>
         *     <property>
         *         <name>yarn.scheduler.fair.dynamic.max.assign</name>
         *         <value>true</value>
         *     </property>
         * </configuration>
         */
        public Builder yarnConf(String yarnConf) {
            this.putQueryParameter("YarnConf", yarnConf);
            this.yarnConf = yarnConf;
            return this;
        }

        @Override
        public CreateHadoopDataSourceRequest build() {
            return new CreateHadoopDataSourceRequest(this);
        } 

    } 

}
