// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Cron.
         */
        public Builder cron(String cron) {
            this.putQueryParameter("Cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * CronDay.
         */
        public Builder cronDay(String cronDay) {
            this.putQueryParameter("CronDay", cronDay);
            this.cronDay = cronDay;
            return this;
        }

        /**
         * CronTime.
         */
        public Builder cronTime(Long cronTime) {
            this.putQueryParameter("CronTime", cronTime);
            this.cronTime = cronTime;
            return this;
        }

        /**
         * CronType.
         */
        public Builder cronType(String cronType) {
            this.putQueryParameter("CronType", cronType);
            this.cronType = cronType;
            return this;
        }

        /**
         * Duration.
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
