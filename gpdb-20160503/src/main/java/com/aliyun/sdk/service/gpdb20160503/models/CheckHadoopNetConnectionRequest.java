// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckHadoopNetConnectionRequest} extends {@link RequestModel}
 *
 * <p>CheckHadoopNetConnectionRequest</p>
 */
public class CheckHadoopNetConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmrInstanceId")
    private String emrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CheckHadoopNetConnectionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceId = builder.dataSourceId;
        this.emrInstanceId = builder.emrInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckHadoopNetConnectionRequest create() {
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
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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

    public static final class Builder extends Request.Builder<CheckHadoopNetConnectionRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceId; 
        private String emrInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckHadoopNetConnectionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceId = request.dataSourceId;
            this.emrInstanceId = request.emrInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * The E-MapReduce (EMR) Hadoop cluster ID.
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
        public CheckHadoopNetConnectionRequest build() {
            return new CheckHadoopNetConnectionRequest(this);
        } 

    } 

}
