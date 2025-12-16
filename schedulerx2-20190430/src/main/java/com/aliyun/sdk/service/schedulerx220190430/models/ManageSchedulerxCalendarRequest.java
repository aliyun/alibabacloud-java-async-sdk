// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ManageSchedulerxCalendarRequest} extends {@link RequestModel}
 *
 * <p>ManageSchedulerxCalendarRequest</p>
 */
public class ManageSchedulerxCalendarRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Incremental")
    private Boolean incremental;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MonthDaysContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monthDaysContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private ManageSchedulerxCalendarRequest(Builder builder) {
        super(builder);
        this.calendarName = builder.calendarName;
        this.incremental = builder.incremental;
        this.monthDaysContent = builder.monthDaysContent;
        this.regionId = builder.regionId;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageSchedulerxCalendarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calendarName
     */
    public String getCalendarName() {
        return this.calendarName;
    }

    /**
     * @return incremental
     */
    public Boolean getIncremental() {
        return this.incremental;
    }

    /**
     * @return monthDaysContent
     */
    public String getMonthDaysContent() {
        return this.monthDaysContent;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<ManageSchedulerxCalendarRequest, Builder> {
        private String calendarName; 
        private Boolean incremental; 
        private String monthDaysContent; 
        private String regionId; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(ManageSchedulerxCalendarRequest request) {
            super(request);
            this.calendarName = request.calendarName;
            this.incremental = request.incremental;
            this.monthDaysContent = request.monthDaysContent;
            this.regionId = request.regionId;
            this.year = request.year;
        } 

        /**
         * <p>The calendar name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025workday</p>
         */
        public Builder calendarName(String calendarName) {
            this.putBodyParameter("CalendarName", calendarName);
            this.calendarName = calendarName;
            return this;
        }

        /**
         * <p>Specifies whether to perform an incremental update. Default value: false.</p>
         * <ul>
         * <li>false: Updates the specified months and removes configurations for all other months.</li>
         * <li>true: Updates only the specified months and preserves existing configurations for other months.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder incremental(Boolean incremental) {
            this.putBodyParameter("Incremental", incremental);
            this.incremental = incremental;
            return this;
        }

        /**
         * <p>The month and days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},
         *   {&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},
         *   {&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
         *   {&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},
         *   {&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},
         *   {&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},
         *   {&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
         *   {&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
         *   {&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},
         *   {&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},
         *   {&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},
         *   {&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}
         * ]</p>
         */
        public Builder monthDaysContent(String monthDaysContent) {
            this.putBodyParameter("MonthDaysContent", monthDaysContent);
            this.monthDaysContent = monthDaysContent;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The year.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025</p>
         */
        public Builder year(Integer year) {
            this.putBodyParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public ManageSchedulerxCalendarRequest build() {
            return new ManageSchedulerxCalendarRequest(this);
        } 

    } 

}
