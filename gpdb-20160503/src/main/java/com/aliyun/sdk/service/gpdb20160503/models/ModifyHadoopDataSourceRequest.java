// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyHadoopDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyHadoopDataSourceRequest</p>
 */
public class ModifyHadoopDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

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

    private ModifyHadoopDataSourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceId = builder.dataSourceId;
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

    public static ModifyHadoopDataSourceRequest create() {
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
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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

    public static final class Builder extends Request.Builder<ModifyHadoopDataSourceRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceDescription; 
        private String dataSourceId; 
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

        private Builder(ModifyHadoopDataSourceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceDescription = request.dataSourceDescription;
            this.dataSourceId = request.dataSourceId;
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
         * DataSourceDescription.
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.putQueryParameter("DataSourceDescription", dataSourceDescription);
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>mysql</li>
         * </ul>
         * <ul>
         * <li>postgresql</li>
         * </ul>
         * <ul>
         * <li>hdfs</li>
         * </ul>
         * <ul>
         * <li>hive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * EmrInstanceId.
         */
        public Builder emrInstanceId(String emrInstanceId) {
            this.putQueryParameter("EmrInstanceId", emrInstanceId);
            this.emrInstanceId = emrInstanceId;
            return this;
        }

        /**
         * <p>The content of the Hadoop hdfs-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder HDFSConf(String HDFSConf) {
            this.putQueryParameter("HDFSConf", HDFSConf);
            this.HDFSConf = HDFSConf;
            return this;
        }

        /**
         * <p>The content of the Hadoop core-site.xml file.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder hadoopCoreConf(String hadoopCoreConf) {
            this.putQueryParameter("HadoopCoreConf", hadoopCoreConf);
            this.hadoopCoreConf = hadoopCoreConf;
            return this;
        }

        /**
         * <p>The type of the external service. Valid values:</p>
         * <ul>
         * <li>emr: E-MapReduce (EMR) Hadoop cluster.</li>
         * <li>selfCreate: self-managed Hadoop cluster.</li>
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
         * <p>The IP address and hostname of the Hadoop cluster (data source) in the /etc/hosts file.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1 localhost</p>
         */
        public Builder hadoopHostsAddress(String hadoopHostsAddress) {
            this.putQueryParameter("HadoopHostsAddress", hadoopHostsAddress);
            this.hadoopHostsAddress = hadoopHostsAddress;
            return this;
        }

        /**
         * <p>The content of the Hadoop hive-site.xml file. This parameter must be specified when DataSourceType is set to Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder hiveConf(String hiveConf) {
            this.putQueryParameter("HiveConf", hiveConf);
            this.hiveConf = hiveConf;
            return this;
        }

        /**
         * <p>The content of the Hadoop mapred-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" ?>
         * <!-- Created at 2023-08-15 13:53:28.962 -->
         * <configuration>
         *     <property>
         *         <name>mapreduce.map.speculative</name>
         *         <value>true</value>
         *     </property>
         *     <property>
         *         <name>mapreduce.jobhistory.keytab</name>
         *         <value></value>
         *     </property>
         * </configuration>
         */
        public Builder mapReduceConf(String mapReduceConf) {
            this.putQueryParameter("MapReduceConf", mapReduceConf);
            this.mapReduceConf = mapReduceConf;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The content of the Hadoop yarn-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder yarnConf(String yarnConf) {
            this.putQueryParameter("YarnConf", yarnConf);
            this.yarnConf = yarnConf;
            return this;
        }

        @Override
        public ModifyHadoopDataSourceRequest build() {
            return new ModifyHadoopDataSourceRequest(this);
        } 

    } 

}
