// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RestoreRequest} extends {@link RequestModel}
 *
 * <p>RestoreRequest</p>
 */
public class RestoreRequest extends Request {
    @NameInMap("Days")
    private Long days;

    @NameInMap("JobParameters")
    private JobParameters jobParameters;


    private RestoreRequest(Builder builder) {
        super(builder);
        this.days = builder.days;
        this.jobParameters = builder.jobParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreRequest create() {
        return builder().build();
    }

    /**
     * @return days
     */
    public Long days() {
        return this.days;
    }

    /**
     * @return jobParameters
     */
    public JobParameters jobParameters() {
        return this.jobParameters;
    }

    public static final class Builder extends Request.Builder<RestoreRequest.Builder> {
        private Long days; 
        private JobParameters jobParameters; 

        /**
         * <p>description</p>
         */
        public Builder days(Long days) {
            this.days = days;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder jobParameters(JobParameters jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }

        public RestoreRequest build() {
            return new RestoreRequest(this);
        } 

    } 

    public static class JobParameters extends TeaModel {
        @NameInMap("Tier")
        private String tier;


        private JobParameters(Builder builder) {
            this.tier = builder.tier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobParameters create() {
            return builder().build();
        }

        /**
         * @return tier
         */
        public String tier() {
            return this.tier;
        }

        public static final class Builder extends Request.Builder<JobParameters.Builder> {
            private String tier; 

            /**
             * <p>description</p>
             */
            public Builder tier(String tier) {
                this.tier = tier;
                return this;
            }

            public JobParameters build() {
                return new JobParameters(this);
            } 

        } 

    }
}
