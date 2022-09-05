// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDesktopGroupTimerStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopGroupTimerStatusRequest</p>
 */
public class SetDesktopGroupTimerStatusRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TimerType")
    @Validation(required = true)
    private Integer timerType;

    private SetDesktopGroupTimerStatusRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.timerType = builder.timerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDesktopGroupTimerStatusRequest create() {
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return timerType
     */
    public Integer getTimerType() {
        return this.timerType;
    }

    public static final class Builder extends Request.Builder<SetDesktopGroupTimerStatusRequest, Builder> {
        private String desktopGroupId; 
        private String regionId; 
        private Integer status; 
        private Integer timerType; 

        private Builder() {
            super();
        } 

        private Builder(SetDesktopGroupTimerStatusRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.regionId = request.regionId;
            this.status = request.status;
            this.timerType = request.timerType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public SetDesktopGroupTimerStatusRequest build() {
            return new SetDesktopGroupTimerStatusRequest(this);
        } 

    } 

}
