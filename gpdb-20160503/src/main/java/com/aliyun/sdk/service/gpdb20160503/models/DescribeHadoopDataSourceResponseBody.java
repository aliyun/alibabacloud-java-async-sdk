// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        this.HDFSConf = builder.HDFSConf;
        this.hadoopCoreConf = builder.hadoopCoreConf;
        this.hadoopCreateType = builder.hadoopCreateType;
        this.hadoopHostsAddress = builder.hadoopHostsAddress;
        this.hiveConf = builder.hiveConf;
        this.mapReduceConf = builder.mapReduceConf;
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
        private String HDFSConf; 
        private String hadoopCoreConf; 
        private String hadoopCreateType; 
        private String hadoopHostsAddress; 
        private String hiveConf; 
        private String mapReduceConf; 
        private String requestId; 
        private String statusMessage; 
        private String yarnConf; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataSourceDescription.
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * DataSourceDir.
         */
        public Builder dataSourceDir(String dataSourceDir) {
            this.dataSourceDir = dataSourceDir;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * DataSourceStatus.
         */
        public Builder dataSourceStatus(String dataSourceStatus) {
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * EmrInstanceId.
         */
        public Builder emrInstanceId(String emrInstanceId) {
            this.emrInstanceId = emrInstanceId;
            return this;
        }

        /**
         * HDFSConf.
         */
        public Builder HDFSConf(String HDFSConf) {
            this.HDFSConf = HDFSConf;
            return this;
        }

        /**
         * HadoopCoreConf.
         */
        public Builder hadoopCoreConf(String hadoopCoreConf) {
            this.hadoopCoreConf = hadoopCoreConf;
            return this;
        }

        /**
         * HadoopCreateType.
         */
        public Builder hadoopCreateType(String hadoopCreateType) {
            this.hadoopCreateType = hadoopCreateType;
            return this;
        }

        /**
         * HadoopHostsAddress.
         */
        public Builder hadoopHostsAddress(String hadoopHostsAddress) {
            this.hadoopHostsAddress = hadoopHostsAddress;
            return this;
        }

        /**
         * HiveConf.
         */
        public Builder hiveConf(String hiveConf) {
            this.hiveConf = hiveConf;
            return this;
        }

        /**
         * MapReduceConf.
         */
        public Builder mapReduceConf(String mapReduceConf) {
            this.mapReduceConf = mapReduceConf;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusMessage.
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        /**
         * YarnConf.
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
