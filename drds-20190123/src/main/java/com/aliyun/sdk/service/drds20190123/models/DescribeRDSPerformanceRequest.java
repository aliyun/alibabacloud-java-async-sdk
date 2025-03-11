// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRDSPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRDSPerformanceRequest</p>
 */
public class DescribeRDSPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstType")
    private String dbInstType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * <p>The ID of the Distributed Relational Database Service (DRDS) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds*********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1603209690000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The performance monitoring metrics. You can specify one or more metrics for a query at a time. Separate multiple metric parameters with commas (,).</p>
         * <blockquote>
         * <p> For more information about the details of performance monitoring metrics, see <a href="https://help.aliyun.com/document_detail/186705.html">Storage monitoring</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL_MemCpuUsage</p>
         */
        public Builder keys(String keys) {
            this.putQueryParameter("Keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * <p>The ID of the storage-layer ApsaraDB RDS for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-************</p>
         */
        public Builder rdsInstanceId(String rdsInstanceId) {
            this.putQueryParameter("RdsInstanceId", rdsInstanceId);
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1603123290000</p>
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
