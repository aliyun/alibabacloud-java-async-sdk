// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDIJobRequest} extends {@link RequestModel}
 *
 * <p>StartDIJobRequest</p>
 */
public class StartDIJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("DIJobId")
    @Validation(required = true)
    private Long DIJobId;

    @Body
    @NameInMap("ForceToRerun")
    private Boolean forceToRerun;

    @Body
    @NameInMap("RealtimeStartSettings")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DIJobId.
         */
        public Builder DIJobId(Long DIJobId) {
            this.putBodyParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * ForceToRerun.
         */
        public Builder forceToRerun(Boolean forceToRerun) {
            this.putBodyParameter("ForceToRerun", forceToRerun);
            this.forceToRerun = forceToRerun;
            return this;
        }

        /**
         * RealtimeStartSettings.
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

    public static class FailoverSettings extends TeaModel {
        @NameInMap("Interval")
        private Long interval;

        @NameInMap("UpperLimit")
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

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * UpperLimit.
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
    public static class RealtimeStartSettings extends TeaModel {
        @NameInMap("FailoverSettings")
        private FailoverSettings failoverSettings;

        @NameInMap("StartTime")
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

            /**
             * FailoverSettings.
             */
            public Builder failoverSettings(FailoverSettings failoverSettings) {
                this.failoverSettings = failoverSettings;
                return this;
            }

            /**
             * StartTime.
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
