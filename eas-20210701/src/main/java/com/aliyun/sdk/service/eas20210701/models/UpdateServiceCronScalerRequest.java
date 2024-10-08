// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServiceCronScalerRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceCronScalerRequest</p>
 */
public class UpdateServiceCronScalerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeDates")
    private java.util.List < String > excludeDates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScaleJobs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ScaleJobs> scaleJobs;

    private UpdateServiceCronScalerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.excludeDates = builder.excludeDates;
        this.scaleJobs = builder.scaleJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceCronScalerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return excludeDates
     */
    public java.util.List < String > getExcludeDates() {
        return this.excludeDates;
    }

    /**
     * @return scaleJobs
     */
    public java.util.List < ScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    public static final class Builder extends Request.Builder<UpdateServiceCronScalerRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private java.util.List < String > excludeDates; 
        private java.util.List < ScaleJobs> scaleJobs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceCronScalerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.excludeDates = request.excludeDates;
            this.scaleJobs = request.scaleJobs;
        } 

        /**
         * <p>The region ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to query the service name, see <a href="~~412109~~">ListServices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The points in time that are excluded when you schedule a CronHPA job. The points in time must be specified by using a cron expression.</p>
         */
        public Builder excludeDates(java.util.List < String > excludeDates) {
            this.putBodyParameter("ExcludeDates", excludeDates);
            this.excludeDates = excludeDates;
            return this;
        }

        /**
         * <p>The description of the CronHPA job.</p>
         */
        public Builder scaleJobs(java.util.List < ScaleJobs> scaleJobs) {
            this.putBodyParameter("ScaleJobs", scaleJobs);
            this.scaleJobs = scaleJobs;
            return this;
        }

        @Override
        public UpdateServiceCronScalerRequest build() {
            return new UpdateServiceCronScalerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceCronScalerRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceCronScalerRequest</p>
     */
    public static class ScaleJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        @com.aliyun.core.annotation.Validation(required = true)
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("TargetSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer targetSize;

        private ScaleJobs(Builder builder) {
            this.name = builder.name;
            this.schedule = builder.schedule;
            this.targetSize = builder.targetSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleJobs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return targetSize
         */
        public Integer getTargetSize() {
            return this.targetSize;
        }

        public static final class Builder {
            private String name; 
            private String schedule; 
            private Integer targetSize; 

            /**
             * <p>The name of the CronHPA job.</p>
             * 
             * <strong>example:</strong>
             * <p>scale-job-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cron expression that is used to configure the execution time of the CronHPA job. For more information about how to configure cron expressions, see <strong>Description of special characters</strong> in this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>0 18 * * * *</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The number of instances that you want to configure for the CronHPA job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder targetSize(Integer targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            public ScaleJobs build() {
                return new ScaleJobs(this);
            } 

        } 

    }
}
