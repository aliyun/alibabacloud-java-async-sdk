// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateReportSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateReportSubscriptionRequest</p>
 */
public class UpdateReportSubscriptionRequest extends Request {
    @Body
    @NameInMap("DayOfWeek")
    private Integer dayOfWeek;

    @Body
    @NameInMap("HourOfDay")
    private Integer hourOfDay;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("ReportName")
    private String reportName;

    @Body
    @NameInMap("Subscribe")
    private Integer subscribe;

    private UpdateReportSubscriptionRequest(Builder builder) {
        super(builder);
        this.dayOfWeek = builder.dayOfWeek;
        this.hourOfDay = builder.hourOfDay;
        this.operaUid = builder.operaUid;
        this.reportName = builder.reportName;
        this.subscribe = builder.subscribe;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateReportSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dayOfWeek
     */
    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * @return hourOfDay
     */
    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return reportName
     */
    public String getReportName() {
        return this.reportName;
    }

    /**
     * @return subscribe
     */
    public Integer getSubscribe() {
        return this.subscribe;
    }

    public static final class Builder extends Request.Builder<UpdateReportSubscriptionRequest, Builder> {
        private Integer dayOfWeek; 
        private Integer hourOfDay; 
        private String operaUid; 
        private String reportName; 
        private Integer subscribe; 

        private Builder() {
            super();
        } 

        private Builder(UpdateReportSubscriptionRequest request) {
            super(request);
            this.dayOfWeek = request.dayOfWeek;
            this.hourOfDay = request.hourOfDay;
            this.operaUid = request.operaUid;
            this.reportName = request.reportName;
            this.subscribe = request.subscribe;
        } 

        /**
         * DayOfWeek.
         */
        public Builder dayOfWeek(Integer dayOfWeek) {
            this.putBodyParameter("DayOfWeek", dayOfWeek);
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * HourOfDay.
         */
        public Builder hourOfDay(Integer hourOfDay) {
            this.putBodyParameter("HourOfDay", hourOfDay);
            this.hourOfDay = hourOfDay;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ReportName.
         */
        public Builder reportName(String reportName) {
            this.putBodyParameter("ReportName", reportName);
            this.reportName = reportName;
            return this;
        }

        /**
         * Subscribe.
         */
        public Builder subscribe(Integer subscribe) {
            this.putBodyParameter("Subscribe", subscribe);
            this.subscribe = subscribe;
            return this;
        }

        @Override
        public UpdateReportSubscriptionRequest build() {
            return new UpdateReportSubscriptionRequest(this);
        } 

    } 

}
