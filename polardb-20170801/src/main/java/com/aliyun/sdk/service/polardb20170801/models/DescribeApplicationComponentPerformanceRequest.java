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
 * {@link DescribeApplicationComponentPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationComponentPerformanceRequest</p>
 */
public class DescribeApplicationComponentPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentId;

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

    private DescribeApplicationComponentPerformanceRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.componentId = builder.componentId;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.key = builder.key;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationComponentPerformanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
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

    public static final class Builder extends Request.Builder<DescribeApplicationComponentPerformanceRequest, Builder> {
        private String applicationId; 
        private String componentId; 
        private String endTime; 
        private String interval; 
        private String key; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationComponentPerformanceRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.componentId = request.componentId;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.key = request.key;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the application component. You can obtain the ID from the Components parameter returned by the DescribeApplicationAttribute operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pac-*******************</p>
         */
        public Builder componentId(String componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The end time of the query. The end time must be later than or equal to the start time. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T02:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The sampling granularity of the performance data. Unit: seconds.</p>
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
         * <p>The performance metrics to query. Separate multiple metrics with commas (,). You can specify up to 5 metrics.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDBCPU</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC.</p>
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
         * <p>The type of the performance data.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeApplicationComponentPerformanceRequest build() {
            return new DescribeApplicationComponentPerformanceRequest(this);
        } 

    } 

}
