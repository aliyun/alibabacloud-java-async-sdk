// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDesktopGroupScaleTimerRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopGroupScaleTimerRequest</p>
 */
public class SetDesktopGroupScaleTimerRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScaleTimerInfos")
    private java.util.List < ScaleTimerInfos> scaleTimerInfos;

    private SetDesktopGroupScaleTimerRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.regionId = builder.regionId;
        this.scaleTimerInfos = builder.scaleTimerInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDesktopGroupScaleTimerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scaleTimerInfos
     */
    public java.util.List < ScaleTimerInfos> getScaleTimerInfos() {
        return this.scaleTimerInfos;
    }

    public static final class Builder extends Request.Builder<SetDesktopGroupScaleTimerRequest, Builder> {
        private String desktopGroupId; 
        private String regionId; 
        private java.util.List < ScaleTimerInfos> scaleTimerInfos; 

        private Builder() {
            super();
        } 

        private Builder(SetDesktopGroupScaleTimerRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.regionId = request.regionId;
            this.scaleTimerInfos = request.scaleTimerInfos;
        } 

        /**
         * The ID of the cloud computer pool.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by WUYING Workspace.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The information about the scheduled auto scaling task.
         */
        public Builder scaleTimerInfos(java.util.List < ScaleTimerInfos> scaleTimerInfos) {
            this.putQueryParameter("ScaleTimerInfos", scaleTimerInfos);
            this.scaleTimerInfos = scaleTimerInfos;
            return this;
        }

        @Override
        public SetDesktopGroupScaleTimerRequest build() {
            return new SetDesktopGroupScaleTimerRequest(this);
        } 

    } 

    public static class ScaleTimerInfos extends TeaModel {
        @NameInMap("BuyResAmount")
        private Integer buyResAmount;

        @NameInMap("Cron")
        private String cron;

        @NameInMap("KeepDuration")
        private Long keepDuration;

        @NameInMap("LoadPolicy")
        private Integer loadPolicy;

        @NameInMap("MaxResAmount")
        private Integer maxResAmount;

        @NameInMap("MinResAmount")
        private Integer minResAmount;

        @NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @NameInMap("Type")
        private String type;

        private ScaleTimerInfos(Builder builder) {
            this.buyResAmount = builder.buyResAmount;
            this.cron = builder.cron;
            this.keepDuration = builder.keepDuration;
            this.loadPolicy = builder.loadPolicy;
            this.maxResAmount = builder.maxResAmount;
            this.minResAmount = builder.minResAmount;
            this.ratioThreshold = builder.ratioThreshold;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleTimerInfos create() {
            return builder().build();
        }

        /**
         * @return buyResAmount
         */
        public Integer getBuyResAmount() {
            return this.buyResAmount;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return keepDuration
         */
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        /**
         * @return loadPolicy
         */
        public Integer getLoadPolicy() {
            return this.loadPolicy;
        }

        /**
         * @return maxResAmount
         */
        public Integer getMaxResAmount() {
            return this.maxResAmount;
        }

        /**
         * @return minResAmount
         */
        public Integer getMinResAmount() {
            return this.minResAmount;
        }

        /**
         * @return ratioThreshold
         */
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer buyResAmount; 
            private String cron; 
            private Long keepDuration; 
            private Integer loadPolicy; 
            private Integer maxResAmount; 
            private Integer minResAmount; 
            private Float ratioThreshold; 
            private String type; 

            /**
             * One option for the auto scaling policy. This option specifies the number of cloud computers that you want to create in the cloud computer pool. Valid values: 0 to 200.
             */
            public Builder buyResAmount(Integer buyResAmount) {
                this.buyResAmount = buyResAmount;
                return this;
            }

            /**
             * The cron expression of the trigger time.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * The keep-alive duration of a session after the session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session always keeps alive.
             * <p>
             * 
             * If a session is disconnected by the end user or accidentally due to a factor and the end user does not re-establish a connection with the session within the keep-alive duration, the session expires and unsaved data is deleted. If the end user successfully re-establishes a connection with the session within the keep-alive duration, the end user returns to the session and can still access the original data.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy for the multi-session cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: depth-first
             * *   1: breadth first.
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * One option for the auto scaling policy. This option specifies the maximum number of cloud computers that you can create in the cloud computer pool. Valid values: 0 to 200.
             */
            public Builder maxResAmount(Integer maxResAmount) {
                this.maxResAmount = maxResAmount;
                return this;
            }

            /**
             * One option for the auto scaling policy. This option specifies the minimum number of cloud computers that you must create in the cloud computer pool. Valid values: 0 to 200.
             */
            public Builder minResAmount(Integer minResAmount) {
                this.minResAmount = minResAmount;
                return this;
            }

            /**
             * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session cloud computer pool. Formula:
             * <p>
             * 
             * `Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%`.
             * 
             * When the specified threshold is reached, new cloud computers are automatically created. When the specified threshold is not reached, idle cloud computers are released.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * The type of the auto scaling policy.
             * <p>
             * 
             * Valid values:
             * 
             * *   drop
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   normal
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   peak
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   rise
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ScaleTimerInfos build() {
                return new ScaleTimerInfos(this);
            } 

        } 

    }
}
