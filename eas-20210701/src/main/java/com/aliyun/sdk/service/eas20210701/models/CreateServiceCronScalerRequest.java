// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateServiceCronScalerRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceCronScalerRequest</p>
 */
public class CreateServiceCronScalerRequest extends Request {
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
    private java.util.List<String> excludeDates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScaleJobs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ScaleJobs> scaleJobs;

    private CreateServiceCronScalerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.excludeDates = builder.excludeDates;
        this.scaleJobs = builder.scaleJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceCronScalerRequest create() {
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
    public java.util.List<String> getExcludeDates() {
        return this.excludeDates;
    }

    /**
     * @return scaleJobs
     */
    public java.util.List<ScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    public static final class Builder extends Request.Builder<CreateServiceCronScalerRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private java.util.List<String> excludeDates; 
        private java.util.List<ScaleJobs> scaleJobs; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceCronScalerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.excludeDates = request.excludeDates;
            this.scaleJobs = request.scaleJobs;
        } 

        /**
         * <p>The region where the service is deployed.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the service. For information about how to view the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
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
         * <p>The list of cron expressions for the dates to be excluded.</p>
         */
        public Builder excludeDates(java.util.List<String> excludeDates) {
            this.putBodyParameter("ExcludeDates", excludeDates);
            this.excludeDates = excludeDates;
            return this;
        }

        /**
         * <p>The scheduled scaling jobs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scaleJobs(java.util.List<ScaleJobs> scaleJobs) {
            this.putBodyParameter("ScaleJobs", scaleJobs);
            this.scaleJobs = scaleJobs;
            return this;
        }

        @Override
        public CreateServiceCronScalerRequest build() {
            return new CreateServiceCronScalerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceCronScalerRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceCronScalerRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private ScaleJobs(Builder builder) {
            this.name = builder.name;
            this.schedule = builder.schedule;
            this.targetSize = builder.targetSize;
            this.timeZone = builder.timeZone;
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

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String name; 
            private String schedule; 
            private Integer targetSize; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(ScaleJobs model) {
                this.name = model.name;
                this.schedule = model.schedule;
                this.targetSize = model.targetSize;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The name of the scheduled scaling job.</p>
             * 
             * <strong>example:</strong>
             * <p>scale-job-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cron expression for the scaling job. For information about how to configure a cron expression, see the <strong>Supplementary request parameter descriptions</strong> section.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0 18 * * * *</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The target number of instances for the scaling job.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder targetSize(Integer targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            /**
             * <p>The time zone configuration used to parse the execution time of the scheduled scaling job.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public ScaleJobs build() {
                return new ScaleJobs(this);
            } 

        } 

    }
}
