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
         * The ID of the desktop group.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The information about the scheduled auto scaling tasks.
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
             * The number of cloud desktops that you want to create in the desktop group. Valid values: 0 to 200. You must configure this parameter for the scaling policy.
             */
            public Builder buyResAmount(Integer buyResAmount) {
                this.buyResAmount = buyResAmount;
                return this;
            }

            /**
             * The CRON expression that is used when an auto scaling task is triggered.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * The keep-alive duration after the cloud desktop is disconnected. Unit: milliseconds.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy of the multi-session desktop group.
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * The maximum number of cloud desktops in the workspace after scaling. Valid values: 0 to 200. You must configure this parameter for the scaling policy.
             */
            public Builder maxResAmount(Integer maxResAmount) {
                this.maxResAmount = maxResAmount;
                return this;
            }

            /**
             * The minimum number of cloud desktops that can be connected. Valid values: 0 to 200.
             */
            public Builder minResAmount(Integer minResAmount) {
                this.minResAmount = minResAmount;
                return this;
            }

            /**
             * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session desktop group. `Ratio of connected sessions = Number of connected sessions/(Total number of cloud desktops × Maximum number of sessions supported by each cloud desktop) × 100%`. When the ratio of connected sessions is greater than the specified threshold, desktop scale-out is automatically triggered. When the ratio of connected sessions is smaller than the specified threshold, desktop scale-in is automatically triggered under a specific condition.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * The type of the policy.
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
