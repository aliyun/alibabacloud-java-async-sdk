// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBNodePerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBNodePerformanceRequest</p>
 */
public class DescribeDBNodePerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDBNodePerformanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeId = builder.DBNodeId;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.key = builder.key;
        this.startTime = builder.startTime;
        this.type = builder.type;
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDBNodePerformanceRequest, Builder> {
        private String DBClusterId; 
        private String DBNodeId; 
        private String endTime; 
        private String interval; 
        private String key; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBNodePerformanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBNodeId = request.DBNodeId;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.key = request.key;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the cluster node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        public Builder DBNodeId(String DBNodeId) {
            this.putQueryParameter("DBNodeId", DBNodeId);
            this.DBNodeId = DBNodeId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:01Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The interval at which performance data is collected. Valid values:</p>
         * <ul>
         * <li>5</li>
         * <li>30</li>
         * <li>60</li>
         * <li>600</li>
         * <li>1800</li>
         * <li>3600</li>
         * <li>86400</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The performance metrics that you want to query. Separate multiple metrics with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/141787.html">Performance parameters</a>.</p>
         * <blockquote>
         * <p> You can specify a maximum of five performance metrics.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDBDiskUsage</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The special metric. Set the value to tair, which indicates the PolarTair architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>tair</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDBNodePerformanceRequest build() {
            return new DescribeDBNodePerformanceRequest(this);
        } 

    } 

}
