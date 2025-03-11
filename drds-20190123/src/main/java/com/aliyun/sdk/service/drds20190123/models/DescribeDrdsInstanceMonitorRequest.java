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
 * {@link DescribeDrdsInstanceMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsInstanceMonitorRequest</p>
 */
public class DescribeDrdsInstanceMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodMultiple")
    private Integer periodMultiple;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDrdsInstanceMonitorRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.periodMultiple = builder.periodMultiple;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return periodMultiple
     */
    public Integer getPeriodMultiple() {
        return this.periodMultiple;
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
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsInstanceMonitorRequest, Builder> {
        private String drdsInstanceId; 
        private Long endTime; 
        private String key; 
        private Integer periodMultiple; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsInstanceMonitorRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.periodMultiple = request.periodMultiple;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the instance.</p>
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
         * <p>The end time of the query. Specify the value in the UNIX timestamp format. The timestamp must be in UTC. Unit: ms.</p>
         * <blockquote>
         * <p> If the time range that you specify is less than 1 hour, the monitoring data that is collected in a 1-hour period before the end time is returned.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The performance monitoring metrics. You can specify one or more metrics. Separate multiple metric names with commas (,).</p>
         * <blockquote>
         * <p> For more information about performance monitoring metrics, see <a href="https://help.aliyun.com/document_detail/186703.html">Monitor instances</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The multiple of the default time interval that you want to use to collect monitoring data. By default, the system collects monitoring data of resources at an interval of 1 minute. If you set the value of this parameter to 2, the system collects monitoring data of the instance at an interval of 2 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder periodMultiple(Integer periodMultiple) {
            this.putQueryParameter("PeriodMultiple", periodMultiple);
            this.periodMultiple = periodMultiple;
            return this;
        }

        /**
         * <p>The ID of the region where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the value in the UNIX timestamp format. The timestamp must be in UTC. Unit: ms.</p>
         * <p>This parameter is required.</p>
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
        public DescribeDrdsInstanceMonitorRequest build() {
            return new DescribeDrdsInstanceMonitorRequest(this);
        } 

    } 

}
