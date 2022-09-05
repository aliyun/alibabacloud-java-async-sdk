// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDesktopGroupTimerRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopGroupTimerRequest</p>
 */
public class SetDesktopGroupTimerRequest extends Request {
    @Query
    @NameInMap("CronExpression")
    private String cronExpression;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResetType")
    private Integer resetType;

    @Query
    @NameInMap("TimerType")
    @Validation(required = true)
    private Integer timerType;

    private SetDesktopGroupTimerRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.desktopGroupId = builder.desktopGroupId;
        this.force = builder.force;
        this.regionId = builder.regionId;
        this.resetType = builder.resetType;
        this.timerType = builder.timerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDesktopGroupTimerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetType
     */
    public Integer getResetType() {
        return this.resetType;
    }

    /**
     * @return timerType
     */
    public Integer getTimerType() {
        return this.timerType;
    }

    public static final class Builder extends Request.Builder<SetDesktopGroupTimerRequest, Builder> {
        private String cronExpression; 
        private String desktopGroupId; 
        private Boolean force; 
        private String regionId; 
        private Integer resetType; 
        private Integer timerType; 

        private Builder() {
            super();
        } 

        private Builder(SetDesktopGroupTimerRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.desktopGroupId = request.desktopGroupId;
            this.force = request.force;
            this.regionId = request.regionId;
            this.resetType = request.resetType;
            this.timerType = request.timerType;
        } 

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
         * ResetType.
         */
        public Builder resetType(Integer resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * TimerType.
         */
        public Builder timerType(Integer timerType) {
            this.putQueryParameter("TimerType", timerType);
            this.timerType = timerType;
            return this;
        }

        @Override
        public SetDesktopGroupTimerRequest build() {
            return new SetDesktopGroupTimerRequest(this);
        } 

    } 

}
