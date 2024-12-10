// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBaselineSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetBaselineSummaryRequest</p>
 */
public class GetBaselineSummaryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuspEventSource")
    private String suspEventSource;

    private GetBaselineSummaryRequest(Builder builder) {
        super(builder);
        this.dateType = builder.dateType;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.suspEventSource = builder.suspEventSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dateType
     */
    public String getDateType() {
        return this.dateType;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return suspEventSource
     */
    public String getSuspEventSource() {
        return this.suspEventSource;
    }

    public static final class Builder extends Request.Builder<GetBaselineSummaryRequest, Builder> {
        private String dateType; 
        private Long endDate; 
        private Long startDate; 
        private String suspEventSource; 

        private Builder() {
            super();
        } 

        private Builder(GetBaselineSummaryRequest request) {
            super(request);
            this.dateType = request.dateType;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.suspEventSource = request.suspEventSource;
        } 

        /**
         * <p>Time filter type, supports filtering by the last 7 days, the last 30 days, the last half year, or custom time periods.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder dateType(String dateType) {
            this.putBodyParameter("DateType", dateType);
            this.dateType = dateType;
            return this;
        }

        /**
         * <p>End time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1732156885986</p>
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1729478485000</p>
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Alert event source.</p>
         * 
         * <strong>example:</strong>
         * <p>该字段暂未使用，有问题请联系管理员</p>
         */
        public Builder suspEventSource(String suspEventSource) {
            this.putBodyParameter("SuspEventSource", suspEventSource);
            this.suspEventSource = suspEventSource;
            return this;
        }

        @Override
        public GetBaselineSummaryRequest build() {
            return new GetBaselineSummaryRequest(this);
        } 

    } 

}
