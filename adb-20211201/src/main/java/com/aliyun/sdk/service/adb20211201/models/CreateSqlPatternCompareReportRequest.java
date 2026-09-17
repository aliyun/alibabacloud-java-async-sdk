// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateSqlPatternCompareReportRequest} extends {@link RequestModel}
 *
 * <p>CreateSqlPatternCompareReportRequest</p>
 */
public class CreateSqlPatternCompareReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompareEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compareEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompareStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compareStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String patternType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private CreateSqlPatternCompareReportRequest(Builder builder) {
        super(builder);
        this.compareEndTime = builder.compareEndTime;
        this.compareStartTime = builder.compareStartTime;
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.patternType = builder.patternType;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlPatternCompareReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compareEndTime
     */
    public String getCompareEndTime() {
        return this.compareEndTime;
    }

    /**
     * @return compareStartTime
     */
    public String getCompareStartTime() {
        return this.compareStartTime;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return patternType
     */
    public String getPatternType() {
        return this.patternType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateSqlPatternCompareReportRequest, Builder> {
        private String compareEndTime; 
        private String compareStartTime; 
        private String DBClusterId; 
        private String endTime; 
        private String patternType; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSqlPatternCompareReportRequest request) {
            super(request);
            this.compareEndTime = request.compareEndTime;
            this.compareStartTime = request.compareStartTime;
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.patternType = request.patternType;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of time window 2. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T01:00Z</p>
         */
        public Builder compareEndTime(String compareEndTime) {
            this.putQueryParameter("CompareEndTime", compareEndTime);
            this.compareEndTime = compareEndTime;
            return this;
        }

        /**
         * <p>The start time of time window 2. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T00:00Z</p>
         */
        public Builder compareStartTime(String compareStartTime) {
            this.putQueryParameter("CompareStartTime", compareStartTime);
            this.compareStartTime = compareStartTime;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-2ze1234567890****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of time window 1. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The report type. Valid values:</p>
         * <ul>
         * <li><code>NEW</code>: Patterns that are new in time window 2.</li>
         * <li><code>CHANGED</code>: Patterns that exist in both time windows and have an increased average value in at least one metric.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CHANGED</p>
         */
        public Builder patternType(String patternType) {
            this.putQueryParameter("PatternType", patternType);
            this.patternType = patternType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start time of time window 1. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateSqlPatternCompareReportRequest build() {
            return new CreateSqlPatternCompareReportRequest(this);
        } 

    } 

}
