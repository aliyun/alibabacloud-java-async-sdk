// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetJMeterSampleMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterSampleMetricsRequest</p>
 */
public class GetJMeterSampleMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplerId")
    private Integer samplerId;

    private GetJMeterSampleMetricsRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.reportId = builder.reportId;
        this.samplerId = builder.samplerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterSampleMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return samplerId
     */
    public Integer getSamplerId() {
        return this.samplerId;
    }

    public static final class Builder extends Request.Builder<GetJMeterSampleMetricsRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String reportId; 
        private Integer samplerId; 

        private Builder() {
            super();
        } 

        private Builder(GetJMeterSampleMetricsRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.reportId = request.reportId;
            this.samplerId = request.samplerId;
        } 

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1637157070000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1637157073000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The report ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7R4RE352</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The sampler ID. This parameter value starts from 0. If this parameter value is -1, the data of the whole scenario is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder samplerId(Integer samplerId) {
            this.putQueryParameter("SamplerId", samplerId);
            this.samplerId = samplerId;
            return this;
        }

        @Override
        public GetJMeterSampleMetricsRequest build() {
            return new GetJMeterSampleMetricsRequest(this);
        } 

    } 

}
