// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeMediaDistributionRequest} extends {@link RequestModel}
 *
 * <p>DescribeMediaDistributionRequest</p>
 */
public class DescribeMediaDistributionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageClass")
    private String storageClass;

    private DescribeMediaDistributionRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.startTime = builder.startTime;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMediaDistributionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<DescribeMediaDistributionRequest, Builder> {
        private String endTime; 
        private String interval; 
        private String startTime; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMediaDistributionRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.startTime = request.startTime;
            this.storageClass = request.storageClass;
        } 

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The maximum time range to query is 6 months.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:59:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The statistical interval. Default value: day. Valid values:</p>
         * <ul>
         * <li>hour: natural hour of the start and end time.</li>
         * <li>day: natural day of the start and end time.</li>
         * <li>week: natural week of the start and end time.</li>
         * <li>month: natural month of the start and end time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The maximum time range to query is 6 months.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The hierarchical storage type. Valid values:</p>
         * <ul>
         * <li>Standard</li>
         * <li>IA</li>
         * <li>Archive</li>
         * <li>ColdArchive</li>
         * <li>SourceIA</li>
         * <li>SourceArchive</li>
         * <li>SourceColdArchive</li>
         * <li>Changing</li>
         * <li>SourceChanging</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public DescribeMediaDistributionRequest build() {
            return new DescribeMediaDistributionRequest(this);
        } 

    } 

}
