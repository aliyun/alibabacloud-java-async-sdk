// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSL7QpsListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDoSL7QpsListRequest</p>
 */
public class DescribeDDoSL7QpsListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDDoSL7QpsListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.recordId = builder.recordId;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSL7QpsListRequest create() {
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
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDDoSL7QpsListRequest, Builder> {
        private String endTime; 
        private Integer interval; 
        private Long recordId; 
        private Long siteId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDoSL7QpsListRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.recordId = request.recordId;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The time span between the start time and the end time cannot exceed 31 days. If you do not specify this parameter, the current time is used as the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T19:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the queried data. Unit: seconds. Valid values: 60 (1 minute), 300 (5 minutes), 1800 (30 minutes), and 3600 (1 hour). The supported values vary based on the maximum time span of a single query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The record ID. You can call the <a href="~~ListRecords~~">ListRecords</a> operation to obtain the record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86510927836942****</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDDoSL7QpsListRequest build() {
            return new DescribeDDoSL7QpsListRequest(this);
        } 

    } 

}
