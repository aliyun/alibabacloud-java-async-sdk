// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLSamplesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLSamplesRequest</p>
 */
public class DescribeSQLSamplesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("SqlId")
    @Validation(required = true)
    private String sqlId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private DescribeSQLSamplesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbName = builder.dbName;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.sqlId = builder.sqlId;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLSamplesRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeSQLSamplesRequest, Builder> {
        private String regionId; 
        private String dbName; 
        private String endTime; 
        private String instanceId; 
        private String sqlId; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSQLSamplesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbName = request.dbName;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.sqlId = request.sqlId;
            this.startTime = request.startTime;
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
         * The database name.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The end time of querying the slow query execution.
         * <p>
         * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SQL ID.
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The start time of querying the slow query execution.
         * <p>
         * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The tenant ID.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeSQLSamplesRequest build() {
            return new DescribeSQLSamplesRequest(this);
        } 

    } 

}
