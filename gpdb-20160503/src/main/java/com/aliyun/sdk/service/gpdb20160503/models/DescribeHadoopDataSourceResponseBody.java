// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHadoopDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHadoopDataSourceResponseBody</p>
 */
public class DescribeHadoopDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.NameInMap("DataSourceDir")
    private String dataSourceDir;

    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.NameInMap("DataSourceStatus")
    private String dataSourceStatus;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("EmrInstanceId")
    private String emrInstanceId;

    @com.aliyun.core.annotation.NameInMap("ExternalDataServiceId")
    private String externalDataServiceId;

    @com.aliyun.core.annotation.NameInMap("HDFSConf")
    private String HDFSConf;

    @com.aliyun.core.annotation.NameInMap("HadoopCoreConf")
    private String hadoopCoreConf;

    @com.aliyun.core.annotation.NameInMap("HadoopCreateType")
    private String hadoopCreateType;

    @com.aliyun.core.annotation.NameInMap("HadoopHostsAddress")
    private String hadoopHostsAddress;

    @com.aliyun.core.annotation.NameInMap("HiveConf")
    private String hiveConf;

    @com.aliyun.core.annotation.NameInMap("MapReduceConf")
    private String mapReduceConf;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusMessage")
    private String statusMessage;

    @com.aliyun.core.annotation.NameInMap("YarnConf")
    private String yarnConf;

    private DescribeHadoopDataSourceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceDir = builder.dataSourceDir;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceStatus = builder.dataSourceStatus;
        this.dataSourceType = builder.dataSourceType;
        this.emrInstanceId = builder.emrInstanceId;
        this.externalDataServiceId = builder.externalDataServiceId;
        this.HDFSConf = builder.HDFSConf;
        this.hadoopCoreConf = builder.hadoopCoreConf;
        this.hadoopCreateType = builder.hadoopCreateType;
        this.hadoopHostsAddress = builder.hadoopHostsAddress;
        this.hiveConf = builder.hiveConf;
        this.mapReduceConf = builder.mapReduceConf;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.statusMessage = builder.statusMessage;
        this.yarnConf = builder.yarnConf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHadoopDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataSourceDescription
     */
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    /**
     * @return dataSourceDir
     */
    public String getDataSourceDir() {
        return this.dataSourceDir;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceStatus
     */
    public String getDataSourceStatus() {
        return this.dataSourceStatus;
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
     * @return externalDataServiceId
     */
    public String getExternalDataServiceId() {
        return this.externalDataServiceId;
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
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * @return yarnConf
     */
    public String getYarnConf() {
        return this.yarnConf;
    }

    public static final class Builder {
        private String createTime; 
        private String dataSourceDescription; 
        private String dataSourceDir; 
        private String dataSourceId; 
        private String dataSourceName; 
        private String dataSourceStatus; 
        private String dataSourceType; 
        private String emrInstanceId; 
        private String externalDataServiceId; 
        private String HDFSConf; 
        private String hadoopCoreConf; 
        private String hadoopCreateType; 
        private String hadoopHostsAddress; 
        private String hiveConf; 
        private String mapReduceConf; 
        private String modifyTime; 
        private String requestId; 
        private String statusMessage; 
        private String yarnConf; 

        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the service. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>pxf for hdfs data source</p>
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * <p>The service directory in which Hadoop-related configuration files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>HadoopDir</p>
         */
        public Builder dataSourceDir(String dataSourceDir) {
            this.dataSourceDir = dataSourceDir;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs_pxf</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder dataSourceStatus(String dataSourceStatus) {
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The E-MapReduce (EMR) Hadoop cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-1234567</p>
         */
        public Builder emrInstanceId(String emrInstanceId) {
            this.emrInstanceId = emrInstanceId;
            return this;
        }

        /**
         * <p>The Id of External Data Service</p>
         * 
         * <strong>example:</strong>
         * <p>2988</p>
         */
        public Builder externalDataServiceId(String externalDataServiceId) {
            this.externalDataServiceId = externalDataServiceId;
            return this;
        }

        /**
         * <p>The content of the Hadoop hdfs-site.xml file.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder HDFSConf(String HDFSConf) {
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
            this.hadoopCoreConf = hadoopCoreConf;
            return this;
        }

        /**
         * <p>The type of the external service. Valid values:</p>
         * <ul>
         * <li>emr</li>
         * <li>selfCreate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder hadoopCreateType(String hadoopCreateType) {
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
            this.hadoopHostsAddress = hadoopHostsAddress;
            return this;
        }

        /**
         * <p>The content of the Hadoop hive-site.xml file.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder hiveConf(String hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }

        /**
         * <p>The content of the Hadoop mapred-site.xml file.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder mapReduceConf(String mapReduceConf) {
            this.mapReduceConf = mapReduceConf;
            return this;
        }

        /**
         * <p>The time when the service was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-23T02:11:47Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        /**
         * <p>The content of the Hadoop yarn-site.xml file.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder yarnConf(String yarnConf) {
            this.yarnConf = yarnConf;
            return this;
        }

        public DescribeHadoopDataSourceResponseBody build() {
            return new DescribeHadoopDataSourceResponseBody(this);
        } 

    } 

}
