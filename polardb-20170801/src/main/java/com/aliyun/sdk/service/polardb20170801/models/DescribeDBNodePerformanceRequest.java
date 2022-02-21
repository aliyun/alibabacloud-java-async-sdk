// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBNodePerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBNodePerformanceRequest</p>
 */
public class DescribeDBNodePerformanceRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @Query
    @NameInMap("DBNodeId")
    @Validation(required = true)
    private String DBNodeId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeDBNodePerformanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeId = builder.DBNodeId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBNodePerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeId
     */
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDBNodePerformanceRequest, Builder> {
        private String DBClusterId; 
        private String DBNodeId; 
        private String endTime; 
        private String key; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBNodePerformanceRequest response) {
            super(response);
            this.DBClusterId = response.DBClusterId;
            this.DBNodeId = response.DBNodeId;
            this.endTime = response.endTime;
            this.key = response.key;
            this.startTime = response.startTime;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBNodeId.
         */
        public Builder DBNodeId(String DBNodeId) {
            this.putQueryParameter("DBNodeId", DBNodeId);
            this.DBNodeId = DBNodeId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBNodePerformanceRequest build() {
            return new DescribeDBNodePerformanceRequest(this);
        } 

    } 

}
