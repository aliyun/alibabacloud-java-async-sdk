// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceCronScalerRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceCronScalerRequest</p>
 */
public class UpdateServiceCronScalerRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("ExcludeDates")
    private java.util.List < String > excludeDates;

    @Body
    @NameInMap("ScaleJobs")
    @Validation(required = true)
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
         * 服务所在区域
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 服务名字
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 需要排除的时间点的cron表达式
         */
        public Builder excludeDates(java.util.List < String > excludeDates) {
            this.putBodyParameter("ExcludeDates", excludeDates);
            this.excludeDates = excludeDates;
            return this;
        }

        /**
         * 定时伸缩任务描述
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

    public static class ScaleJobs extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Schedule")
        @Validation(required = true)
        private String schedule;

        @NameInMap("TargetSize")
        @Validation(required = true)
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 要执行伸缩任务的cron表达式
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * 执行伸缩任务的目标replica
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
