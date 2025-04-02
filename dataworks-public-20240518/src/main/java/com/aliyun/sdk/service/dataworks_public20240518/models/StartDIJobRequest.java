// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @Deprecated
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceToRerun")
    private Boolean forceToRerun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealtimeStartSettings")
    private RealtimeStartSettings realtimeStartSettings;

    private StartDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.forceToRerun = builder.forceToRerun;
        this.id = builder.id;
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
        private Long id; 
        private RealtimeStartSettings realtimeStartSettings; 

        private Builder() {
            super();
        } 

        private Builder(StartDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.forceToRerun = request.forceToRerun;
            this.id = request.id;
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
         * <p>This parameter is deprecated. Use the Id parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully rerun all synchronization steps. If you do not configure this parameter, the system does not perform the forcible rerun operation.</p>
         * <ul>
         * <li>If the system does not perform the forcible rerun operation, only the steps that are not run start to run.</li>
         * <li>If the system performs the forcible rerun operation, all steps start to rerun.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceToRerun(Boolean forceToRerun) {
            this.putQueryParameter("ForceToRerun", forceToRerun);
            this.forceToRerun = forceToRerun;
            return this;
        }

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The settings for starting real-time synchronization.</p>
         * <pre><code>{
         *   &quot;StartTime&quot;:1663765058
         * }
         * </code></pre>
         */
        public Builder realtimeStartSettings(RealtimeStartSettings realtimeStartSettings) {
            String realtimeStartSettingsShrink = shrink(realtimeStartSettings, "RealtimeStartSettings", "json");
            this.putQueryParameter("RealtimeStartSettings", realtimeStartSettingsShrink);
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
        @Deprecated
        private Long interval;

        @com.aliyun.core.annotation.NameInMap("UpperLimit")
        @Deprecated
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
             * <p>This parameter is deprecated. Use advanced parameters for failover settings when you create a task.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>This parameter is deprecated. Use advanced parameters for failover settings when you create a task.</p>
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
        @Deprecated
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
             * <p>This parameter is deprecated. Use advanced parameters for failover settings when you create a task.</p>
             */
            public Builder failoverSettings(FailoverSettings failoverSettings) {
                this.failoverSettings = failoverSettings;
                return this;
            }

            /**
             * <p>The start time.</p>
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
