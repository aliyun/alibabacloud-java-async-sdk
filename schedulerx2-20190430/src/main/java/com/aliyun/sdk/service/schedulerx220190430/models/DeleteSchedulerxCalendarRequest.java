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
 * {@link DeleteSchedulerxCalendarRequest} extends {@link RequestModel}
 *
 * <p>DeleteSchedulerxCalendarRequest</p>
 */
public class DeleteSchedulerxCalendarRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private DeleteSchedulerxCalendarRequest(Builder builder) {
        super(builder);
        this.calendarName = builder.calendarName;
        this.regionId = builder.regionId;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchedulerxCalendarRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSchedulerxCalendarRequest, Builder> {
        private String calendarName; 
        private String regionId; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSchedulerxCalendarRequest request) {
            super(request);
            this.calendarName = request.calendarName;
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
        public DeleteSchedulerxCalendarRequest build() {
            return new DeleteSchedulerxCalendarRequest(this);
        } 

    } 

}
