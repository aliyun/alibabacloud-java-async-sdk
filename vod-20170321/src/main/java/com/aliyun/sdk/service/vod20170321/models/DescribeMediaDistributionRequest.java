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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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

        /**
         * StorageClass.
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
