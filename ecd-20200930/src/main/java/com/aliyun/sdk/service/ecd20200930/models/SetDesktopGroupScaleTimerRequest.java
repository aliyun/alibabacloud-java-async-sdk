// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link SetDesktopGroupScaleTimerRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopGroupScaleTimerRequest</p>
 */
public class SetDesktopGroupScaleTimerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleTimerInfos")
    private java.util.List<ScaleTimerInfos> scaleTimerInfos;

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
    public java.util.List<ScaleTimerInfos> getScaleTimerInfos() {
        return this.scaleTimerInfos;
    }

    public static final class Builder extends Request.Builder<SetDesktopGroupScaleTimerRequest, Builder> {
        private String desktopGroupId; 
        private String regionId; 
        private java.util.List<ScaleTimerInfos> scaleTimerInfos; 

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
         * <p>The cloud computer pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of scheduled task information for automatic scaling.</p>
         */
        public Builder scaleTimerInfos(java.util.List<ScaleTimerInfos> scaleTimerInfos) {
            this.putQueryParameter("ScaleTimerInfos", scaleTimerInfos);
            this.scaleTimerInfos = scaleTimerInfos;
            return this;
        }

        @Override
        public SetDesktopGroupScaleTimerRequest build() {
            return new SetDesktopGroupScaleTimerRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetDesktopGroupScaleTimerRequest} extends {@link TeaModel}
     *
     * <p>SetDesktopGroupScaleTimerRequest</p>
     */
    public static class ScaleTimerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyResAmount")
        private Integer buyResAmount;

        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("KeepDuration")
        private Long keepDuration;

        @com.aliyun.core.annotation.NameInMap("LoadPolicy")
        private Integer loadPolicy;

        @com.aliyun.core.annotation.NameInMap("MaxResAmount")
        private Integer maxResAmount;

        @com.aliyun.core.annotation.NameInMap("MinResAmount")
        private Integer minResAmount;

        @com.aliyun.core.annotation.NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(ScaleTimerInfos model) {
                this.buyResAmount = model.buyResAmount;
                this.cron = model.cron;
                this.keepDuration = model.keepDuration;
                this.loadPolicy = model.loadPolicy;
                this.maxResAmount = model.maxResAmount;
                this.minResAmount = model.minResAmount;
                this.ratioThreshold = model.ratioThreshold;
                this.type = model.type;
            } 

            /**
             * <p>The number of cloud computers to purchase, which is one of the scaling policy parameters. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder buyResAmount(Integer buyResAmount) {
                this.buyResAmount = buyResAmount;
                return this;
            }

            /**
             * <p>The cron expression for the trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 12 ? * 1</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The duration for which a session is retained after disconnection. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
             * <p>When a session is disconnected because the user actively disconnects or because of other unexpected factors, the timer starts from the moment of disconnection. If the user does not reconnect to the session within this retention duration, the session is logged off and all unsaved data is destroyed. If the user successfully reconnects within this retention duration, the user can still access the original session and the data that existed before the disconnection.</p>
             * 
             * <strong>example:</strong>
             * <p>180000</p>
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * <p>The load balancing policy for the multi-session cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * <p>The maximum number of cloud computers, which is one of the scaling policy parameters. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxResAmount(Integer maxResAmount) {
                this.maxResAmount = maxResAmount;
                return this;
            }

            /**
             * <p>The minimum number of cloud computers, which is one of the scaling policy parameters. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minResAmount(Integer minResAmount) {
                this.minResAmount = minResAmount;
                return this;
            }

            /**
             * <p>The session occupancy threshold, which is used as the trigger condition for automatic scaling of the multi-session cloud computer pool. The session occupancy is calculated by using the following formula:</p>
             * <p><code>Session occupancy = Number of attached sessions / (Total number of cloud computer resources × Maximum number of sessions supported per cloud computer) × 100%</code></p>
             * <p>When the session occupancy reaches this threshold, new cloud computers are created. When the session occupancy does not reach this threshold, excess cloud computers are deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>rise</p>
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
