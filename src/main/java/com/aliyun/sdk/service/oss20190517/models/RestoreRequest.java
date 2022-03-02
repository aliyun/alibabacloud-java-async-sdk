// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return days
     */
    public Long getDays() {
        return this.days;
    }

    /**
     * @return jobParameters
     */
    public JobParameters getJobParameters() {
        return this.jobParameters;
    }

    public static final class Builder extends Request.Builder<RestoreRequest, Builder> {
        private Long days; 
        private JobParameters jobParameters; 

        private Builder() {
            super();
        } 

        private Builder(RestoreRequest request) {
            super(request);
            this.days = request.days;
            this.jobParameters = request.jobParameters;
        } 

        /**
         * description
         */
        public Builder days(Long days) {
            this.days = days;
            return this;
        }

        /**
         * description
         */
        public Builder jobParameters(JobParameters jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }

        @Override
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
        public String getTier() {
            return this.tier;
        }

        public static final class Builder {
            private String tier; 

            /**
             * description
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
