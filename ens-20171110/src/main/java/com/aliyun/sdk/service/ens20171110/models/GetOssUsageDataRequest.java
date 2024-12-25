// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link GetOssUsageDataRequest} extends {@link RequestModel}
 *
 * <p>GetOssUsageDataRequest</p>
 */
public class GetOssUsageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private GetOssUsageDataRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.endTime = builder.endTime;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUsageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetOssUsageDataRequest, Builder> {
        private String bucket; 
        private String endTime; 
        private String period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetOssUsageDataRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.endTime = request.endTime;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The name of the logical Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>ens-sink-bucketzyp1656903494</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time must be in UTC. Format: 2010-01-21T09:50:23Z.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The aggregation granularity. Unit: minutes.</p>
         * <p>Default value: 5. Valid values: 5 to 1440.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time must be in UTC. Format: 2010-01-21T09:50:23Z.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-11T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetOssUsageDataRequest build() {
            return new GetOssUsageDataRequest(this);
        } 

    } 

}
