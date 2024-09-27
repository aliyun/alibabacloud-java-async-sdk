// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHadoopConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHadoopConfigsRequest</p>
 */
public class DescribeHadoopConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmrInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String emrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeHadoopConfigsRequest(Builder builder) {
        super(builder);
        this.configName = builder.configName;
        this.DBInstanceId = builder.DBInstanceId;
        this.emrInstanceId = builder.emrInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHadoopConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return emrInstanceId
     */
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeHadoopConfigsRequest, Builder> {
        private String configName; 
        private String DBInstanceId; 
        private String emrInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHadoopConfigsRequest request) {
            super(request);
            this.configName = request.configName;
            this.DBInstanceId = request.DBInstanceId;
            this.emrInstanceId = request.emrInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the configuration file. Valid values:</p>
         * <ul>
         * <li>hdfs-site</li>
         * <li>core-site</li>
         * <li>yarn-site</li>
         * <li>mapred-site</li>
         * <li>hive-site</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hdfs-site</p>
         */
        public Builder configName(String configName) {
            this.putQueryParameter("ConfigName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The E-MapReduce (EMR) Hadoop cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-xxx</p>
         */
        public Builder emrInstanceId(String emrInstanceId) {
            this.putQueryParameter("EmrInstanceId", emrInstanceId);
            this.emrInstanceId = emrInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeHadoopConfigsRequest build() {
            return new DescribeHadoopConfigsRequest(this);
        } 

    } 

}
