// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRDSPerformanceRequest</p>
 */
public class DescribeRDSPerformanceRequest extends Request {
    @Query
    @NameInMap("DbInstType")
    private String dbInstType;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Keys")
    @Validation(required = true)
    private String keys;

    @Query
    @NameInMap("RdsInstanceId")
    @Validation(required = true)
    private String rdsInstanceId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeRDSPerformanceRequest(Builder builder) {
        super(builder);
        this.dbInstType = builder.dbInstType;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.endTime = builder.endTime;
        this.keys = builder.keys;
        this.rdsInstanceId = builder.rdsInstanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDSPerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstType
     */
    public String getDbInstType() {
        return this.dbInstType;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return keys
     */
    public String getKeys() {
        return this.keys;
    }

    /**
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRDSPerformanceRequest, Builder> {
        private String dbInstType; 
        private String drdsInstanceId; 
        private Long endTime; 
        private String keys; 
        private String rdsInstanceId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRDSPerformanceRequest request) {
            super(request);
            this.dbInstType = request.dbInstType;
            this.drdsInstanceId = request.drdsInstanceId;
            this.endTime = request.endTime;
            this.keys = request.keys;
            this.rdsInstanceId = request.rdsInstanceId;
            this.startTime = request.startTime;
        } 

        /**
         * The type of the database engine.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * The ID of the Distributed Relational Database Service (DRDS) instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The end time of the query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The performance monitoring metrics. You can specify one or more metrics for a query at a time. Separate multiple metric parameters with commas (,).
         * <p>
         * 
         * >  For more information about the details of performance monitoring metrics, see [Storage monitoring](~~186705~~).
         */
        public Builder keys(String keys) {
            this.putQueryParameter("Keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * The ID of the storage-layer ApsaraDB RDS for MySQL instance.
         */
        public Builder rdsInstanceId(String rdsInstanceId) {
            this.putQueryParameter("RdsInstanceId", rdsInstanceId);
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }

        /**
         * The start time of the query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRDSPerformanceRequest build() {
            return new DescribeRDSPerformanceRequest(this);
        } 

    } 

}
