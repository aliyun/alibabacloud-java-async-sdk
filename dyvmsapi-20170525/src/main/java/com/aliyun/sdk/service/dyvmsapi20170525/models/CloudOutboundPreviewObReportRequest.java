// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudOutboundPreviewObReportRequest} extends {@link RequestModel}
 *
 * <p>CloudOutboundPreviewObReportRequest</p>
 */
public class CloudOutboundPreviewObReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndHour")
    private Long endHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    private Long start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartHour")
    private Long startHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long statisticMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeRangeType;

    private CloudOutboundPreviewObReportRequest(Builder builder) {
        super(builder);
        this.cnos = builder.cnos;
        this.endHour = builder.endHour;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.limit = builder.limit;
        this.start = builder.start;
        this.startHour = builder.startHour;
        this.startTime = builder.startTime;
        this.statisticMethod = builder.statisticMethod;
        this.timeRangeType = builder.timeRangeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudOutboundPreviewObReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return endHour
     */
    public Long getEndHour() {
        return this.endHour;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return startHour
     */
    public Long getStartHour() {
        return this.startHour;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisticMethod
     */
    public Long getStatisticMethod() {
        return this.statisticMethod;
    }

    /**
     * @return timeRangeType
     */
    public Long getTimeRangeType() {
        return this.timeRangeType;
    }

    public static final class Builder extends Request.Builder<CloudOutboundPreviewObReportRequest, Builder> {
        private String cnos; 
        private Long endHour; 
        private String endTime; 
        private Long enterpriseId; 
        private Long limit; 
        private Long start; 
        private Long startHour; 
        private String startTime; 
        private Long statisticMethod; 
        private Long timeRangeType; 

        private Builder() {
            super();
        } 

        private Builder(CloudOutboundPreviewObReportRequest request) {
            super(request);
            this.cnos = request.cnos;
            this.endHour = request.endHour;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.limit = request.limit;
            this.start = request.start;
            this.startHour = request.startHour;
            this.startTime = request.startTime;
            this.statisticMethod = request.statisticMethod;
            this.timeRangeType = request.timeRangeType;
        } 

        /**
         * <p>座席号；说明：根据座席工号查询指定座席的预览外呼统计支持按照多个座席工号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的预览外呼统计</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3008</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>统计时段结束时间；取值：0~23,默认值为24时</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder endHour(Long endHour) {
            this.putQueryParameter("EndHour", endHour);
            this.endHour = endHour;
            return this;
        }

        /**
         * <p>说明：统计日期的结束时间，格式：yyyy-MM-dd</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-13</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6000001</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>查询条数；取值：最大不能超过1000，默认10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>查询起始位置；取值：大于等于0，默认0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>统计时段开始时间；取值：0~23,默认值为0时</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startHour(Long startHour) {
            this.putQueryParameter("StartHour", startHour);
            this.startHour = startHour;
            return this;
        }

        /**
         * <p>说明：统计日期的开始时间，格式：yyyy-MM-dd</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-13</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>统计方法；说明：0:分时1：分日2：汇总</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder statisticMethod(Long statisticMethod) {
            this.putQueryParameter("StatisticMethod", statisticMethod);
            this.statisticMethod = statisticMethod;
            return this;
        }

        /**
         * <p>统计类型；说明：统计报表时间类型，1：日报表2：周报表3：月报表4：自定义时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeRangeType(Long timeRangeType) {
            this.putQueryParameter("TimeRangeType", timeRangeType);
            this.timeRangeType = timeRangeType;
            return this;
        }

        @Override
        public CloudOutboundPreviewObReportRequest build() {
            return new CloudOutboundPreviewObReportRequest(this);
        } 

    } 

}
