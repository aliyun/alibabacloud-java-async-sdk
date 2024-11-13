// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScheduledPreloadExecutionsRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledPreloadExecutionsRequest</p>
 */
public class CreateScheduledPreloadExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Executions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Executions> executions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private CreateScheduledPreloadExecutionsRequest(Builder builder) {
        super(builder);
        this.executions = builder.executions;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledPreloadExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executions
     */
    public java.util.List < Executions> getExecutions() {
        return this.executions;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<CreateScheduledPreloadExecutionsRequest, Builder> {
        private java.util.List < Executions> executions; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledPreloadExecutionsRequest request) {
            super(request);
            this.executions = request.executions;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder executions(java.util.List < Executions> executions) {
            String executionsShrink = shrink(executions, "Executions", "json");
            this.putBodyParameter("Executions", executionsShrink);
            this.executions = executions;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public CreateScheduledPreloadExecutionsRequest build() {
            return new CreateScheduledPreloadExecutionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduledPreloadExecutionsRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledPreloadExecutionsRequest</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("SliceLen")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
        private Integer sliceLen;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Executions(Builder builder) {
            this.endTime = builder.endTime;
            this.interval = builder.interval;
            this.sliceLen = builder.sliceLen;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return sliceLen
         */
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer interval; 
            private Integer sliceLen; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder sliceLen(Integer sliceLen) {
                this.sliceLen = sliceLen;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
