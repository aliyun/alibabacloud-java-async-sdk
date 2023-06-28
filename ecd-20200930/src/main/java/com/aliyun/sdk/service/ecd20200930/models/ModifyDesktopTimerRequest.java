// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopTimerRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopTimerRequest</p>
 */
public class ModifyDesktopTimerRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("DesktopTimers")
    private java.util.List < DesktopTimers> desktopTimers;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UseDesktopTimers")
    private Boolean useDesktopTimers;

    private ModifyDesktopTimerRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopTimers = builder.desktopTimers;
        this.regionId = builder.regionId;
        this.useDesktopTimers = builder.useDesktopTimers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopTimerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopTimers
     */
    public java.util.List < DesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return useDesktopTimers
     */
    public Boolean getUseDesktopTimers() {
        return this.useDesktopTimers;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopTimerRequest, Builder> {
        private java.util.List < String > desktopId; 
        private java.util.List < DesktopTimers> desktopTimers; 
        private String regionId; 
        private Boolean useDesktopTimers; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopTimerRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopTimers = request.desktopTimers;
            this.regionId = request.regionId;
            this.useDesktopTimers = request.useDesktopTimers;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * DesktopTimers.
         */
        public Builder desktopTimers(java.util.List < DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UseDesktopTimers.
         */
        public Builder useDesktopTimers(Boolean useDesktopTimers) {
            this.putQueryParameter("UseDesktopTimers", useDesktopTimers);
            this.useDesktopTimers = useDesktopTimers;
            return this;
        }

        @Override
        public ModifyDesktopTimerRequest build() {
            return new ModifyDesktopTimerRequest(this);
        } 

    } 

    public static class DesktopTimers extends TeaModel {
        @NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("Enforce")
        private Boolean enforce;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("ResetType")
        private String resetType;

        @NameInMap("TimerType")
        private String timerType;

        private DesktopTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.operationType = builder.operationType;
            this.resetType = builder.resetType;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTimers create() {
            return builder().build();
        }

        /**
         * @return allowClientSetting
         */
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private String operationType; 
            private String resetType; 
            private String timerType; 

            /**
             * AllowClientSetting.
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Enforce.
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * TimerType.
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public DesktopTimers build() {
                return new DesktopTimers(this);
            } 

        } 

    }
}
