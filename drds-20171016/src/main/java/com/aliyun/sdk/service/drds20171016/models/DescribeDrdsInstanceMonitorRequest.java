// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDrdsInstanceMonitorRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.periodMultiple = builder.periodMultiple;
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
            this.startTime = request.startTime;
        } 

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
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
         * PeriodMultiple.
         */
        public Builder periodMultiple(Integer periodMultiple) {
            this.putQueryParameter("PeriodMultiple", periodMultiple);
            this.periodMultiple = periodMultiple;
            return this;
        }

        /**
         * StartTime.
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
