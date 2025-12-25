// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link UpdateCalendarRequest} extends {@link RequestModel}
 *
 * <p>UpdateCalendarRequest</p>
 */
public class UpdateCalendarRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Incremental")
    private Boolean incremental;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Months")
    @com.aliyun.core.annotation.Validation(required = true)
    private String months;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private UpdateCalendarRequest(Builder builder) {
        super(builder);
        this.calendarName = builder.calendarName;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.incremental = builder.incremental;
        this.months = builder.months;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCalendarRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return incremental
     */
    public Boolean getIncremental() {
        return this.incremental;
    }

    /**
     * @return months
     */
    public String getMonths() {
        return this.months;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<UpdateCalendarRequest, Builder> {
        private String calendarName; 
        private String clientToken; 
        private String clusterId; 
        private Boolean incremental; 
        private String months; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCalendarRequest request) {
            super(request);
            this.calendarName = request.calendarName;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.incremental = request.incremental;
            this.months = request.months;
            this.year = request.year;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        public Builder calendarName(String calendarName) {
            this.putBodyParameter("CalendarName", calendarName);
            this.calendarName = calendarName;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Incremental.
         */
        public Builder incremental(Boolean incremental) {
            this.putBodyParameter("Incremental", incremental);
            this.incremental = incremental;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},{&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},{&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},{&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},{&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},{&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},{&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},{&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},{&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},{&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},{&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},{&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}]</p>
         */
        public Builder months(String months) {
            this.putBodyParameter("Months", months);
            this.months = months;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        public Builder year(Integer year) {
            this.putBodyParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public UpdateCalendarRequest build() {
            return new UpdateCalendarRequest(this);
        } 

    } 

}
