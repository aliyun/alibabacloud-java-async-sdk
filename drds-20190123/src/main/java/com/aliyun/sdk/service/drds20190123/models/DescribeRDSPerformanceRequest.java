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

        private Builder(DescribeRDSPerformanceRequest response) {
            super(response);
            this.dbInstType = response.dbInstType;
            this.drdsInstanceId = response.drdsInstanceId;
            this.endTime = response.endTime;
            this.keys = response.keys;
            this.rdsInstanceId = response.rdsInstanceId;
            this.startTime = response.startTime;
        } 

        /**
         * DbInstType.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Keys.
         */
        public Builder keys(String keys) {
            this.putQueryParameter("Keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * RdsInstanceId.
         */
        public Builder rdsInstanceId(String rdsInstanceId) {
            this.putQueryParameter("RdsInstanceId", rdsInstanceId);
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }

        /**
         * StartTime.
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
