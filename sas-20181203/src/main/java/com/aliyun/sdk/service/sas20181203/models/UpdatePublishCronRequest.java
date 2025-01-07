// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdatePublishCronRequest} extends {@link RequestModel}
 *
 * <p>UpdatePublishCronRequest</p>
 */
public class UpdatePublishCronRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cron")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cron;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronDay")
    private String cronDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronTime")
    private Long cronTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronType")
    private String cronType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duration;

    private UpdatePublishCronRequest(Builder builder) {
        super(builder);
        this.cron = builder.cron;
        this.cronDay = builder.cronDay;
        this.cronTime = builder.cronTime;
        this.cronType = builder.cronType;
        this.duration = builder.duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublishCronRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cron
     */
    public String getCron() {
        return this.cron;
    }

    /**
     * @return cronDay
     */
    public String getCronDay() {
        return this.cronDay;
    }

    /**
     * @return cronTime
     */
    public Long getCronTime() {
        return this.cronTime;
    }

    /**
     * @return cronType
     */
    public String getCronType() {
        return this.cronType;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    public static final class Builder extends Request.Builder<UpdatePublishCronRequest, Builder> {
        private String cron; 
        private String cronDay; 
        private Long cronTime; 
        private String cronType; 
        private Integer duration; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePublishCronRequest request) {
            super(request);
            this.cron = request.cron;
            this.cronDay = request.cronDay;
            this.cronTime = request.cronTime;
            this.cronType = request.cronType;
            this.duration = request.duration;
        } 

        /**
         * <p>The cron expression that is used to specify the start time of the upgrade.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 5 10 * * ?</p>
         */
        public Builder cron(String cron) {
            this.putQueryParameter("Cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * <p>The day of a week on which you want to perform the upgrade. Valid values:</p>
         * <ul>
         * <li><strong>MON</strong></li>
         * <li><strong>TUE</strong></li>
         * <li><strong>WED</strong></li>
         * <li><strong>THU</strong></li>
         * <li><strong>FRI</strong></li>
         * <li><strong>SAT</strong></li>
         * <li><strong>SUN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUN</p>
         */
        public Builder cronDay(String cronDay) {
            this.putQueryParameter("CronDay", cronDay);
            this.cronDay = cronDay;
            return this;
        }

        /**
         * <p>The start timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657407600000</p>
         */
        public Builder cronTime(Long cronTime) {
            this.putQueryParameter("CronTime", cronTime);
            this.cronTime = cronTime;
            return this;
        }

        /**
         * <p>The type of the upgrade cycle. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: every day</li>
         * <li><strong>week</strong>: every week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder cronType(String cronType) {
            this.putQueryParameter("CronType", cronType);
            this.cronType = cronType;
            return this;
        }

        /**
         * <p>The duration of the upgrade. Unit: hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        @Override
        public UpdatePublishCronRequest build() {
            return new UpdatePublishCronRequest(this);
        } 

    } 

}
