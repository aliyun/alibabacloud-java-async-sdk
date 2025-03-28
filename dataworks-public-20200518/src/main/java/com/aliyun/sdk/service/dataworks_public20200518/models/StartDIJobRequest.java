// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link StartDIJobRequest} extends {@link RequestModel}
 *
 * <p>StartDIJobRequest</p>
 */
public class StartDIJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceToRerun")
    private Boolean forceToRerun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RealtimeStartSettings")
    private RealtimeStartSettings realtimeStartSettings;

    private StartDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.forceToRerun = builder.forceToRerun;
        this.realtimeStartSettings = builder.realtimeStartSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDIJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return forceToRerun
     */
    public Boolean getForceToRerun() {
        return this.forceToRerun;
    }

    /**
     * @return realtimeStartSettings
     */
    public RealtimeStartSettings getRealtimeStartSettings() {
        return this.realtimeStartSettings;
    }

    public static final class Builder extends Request.Builder<StartDIJobRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 
        private Boolean forceToRerun; 
        private RealtimeStartSettings realtimeStartSettings; 

        private Builder() {
            super();
        } 

        private Builder(StartDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.forceToRerun = request.forceToRerun;
            this.realtimeStartSettings = request.realtimeStartSettings;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11743</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putBodyParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully rerun all synchronization steps. If you do not configure this parameter, the system does not forcefully rerun the task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceToRerun(Boolean forceToRerun) {
            this.putBodyParameter("ForceToRerun", forceToRerun);
            this.forceToRerun = forceToRerun;
            return this;
        }

        /**
         * <p>The settings for the start.</p>
         */
        public Builder realtimeStartSettings(RealtimeStartSettings realtimeStartSettings) {
            String realtimeStartSettingsShrink = shrink(realtimeStartSettings, "RealtimeStartSettings", "json");
            this.putBodyParameter("RealtimeStartSettings", realtimeStartSettingsShrink);
            this.realtimeStartSettings = realtimeStartSettings;
            return this;
        }

        @Override
        public StartDIJobRequest build() {
            return new StartDIJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartDIJobRequest} extends {@link TeaModel}
     *
     * <p>StartDIJobRequest</p>
     */
    public static class FailoverSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interval")
        private Long interval;

        @com.aliyun.core.annotation.NameInMap("UpperLimit")
        private Long upperLimit;

        private FailoverSettings(Builder builder) {
            this.interval = builder.interval;
            this.upperLimit = builder.upperLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailoverSettings create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return upperLimit
         */
        public Long getUpperLimit() {
            return this.upperLimit;
        }

        public static final class Builder {
            private Long interval; 
            private Long upperLimit; 

            private Builder() {
            } 

            private Builder(FailoverSettings model) {
                this.interval = model.interval;
                this.upperLimit = model.upperLimit;
            } 

            /**
             * <p>The failover interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The maximum number of failovers.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder upperLimit(Long upperLimit) {
                this.upperLimit = upperLimit;
                return this;
            }

            public FailoverSettings build() {
                return new FailoverSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartDIJobRequest} extends {@link TeaModel}
     *
     * <p>StartDIJobRequest</p>
     */
    public static class RealtimeStartSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailoverSettings")
        private FailoverSettings failoverSettings;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private RealtimeStartSettings(Builder builder) {
            this.failoverSettings = builder.failoverSettings;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeStartSettings create() {
            return builder().build();
        }

        /**
         * @return failoverSettings
         */
        public FailoverSettings getFailoverSettings() {
            return this.failoverSettings;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private FailoverSettings failoverSettings; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(RealtimeStartSettings model) {
                this.failoverSettings = model.failoverSettings;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The failover settings.</p>
             */
            public Builder failoverSettings(FailoverSettings failoverSettings) {
                this.failoverSettings = failoverSettings;
                return this;
            }

            /**
             * <p>The timestamp of the start offset. Unit: seconds. If you do not configure this parameter, the offset is not reset by default.</p>
             * 
             * <strong>example:</strong>
             * <p>1671516776</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public RealtimeStartSettings build() {
                return new RealtimeStartSettings(this);
            } 

        } 

    }
}
