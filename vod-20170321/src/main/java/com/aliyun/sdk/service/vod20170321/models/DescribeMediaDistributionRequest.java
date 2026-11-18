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
         * <p>The end time of CreationTime. The end time must be later than the start time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC). The maximum time span between the start time and end time is six months.</p>
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
         * <li>hour: by hour. Statistics are collected based on the calendar hours within the specified time range.</li>
         * <li>day: by day. Statistics are collected based on the calendar days within the specified time range.</li>
         * <li>week: by week. Statistics are collected based on the calendar weeks within the specified time range.</li>
         * <li>month: by month. Statistics are collected based on the calendar months within the specified time range.</li>
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
         * <p>The start time of CreationTime. Format: yyyy-MM-ddTHH:mm:ssZ (UTC). The maximum time span between the start time and end time is six months.</p>
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
         * <p>The storage class. Valid values:</p>
         * <ul>
         * <li>Standard: standard storage.</li>
         * <li>IA: Infrequent Access.</li>
         * <li>Archive: Archive storage.</li>
         * <li>ColdArchive: Cold Archive storage.</li>
         * <li>SourceIA: Infrequent Access for source files.</li>
         * <li>SourceArchive: Archive storage for source files.</li>
         * <li>SourceColdArchive: Cold Archive storage for source files.</li>
         * <li>Changing: the media asset storage class is being changed.</li>
         * <li>SourceChanging: the source file storage class is being changed.</li>
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
