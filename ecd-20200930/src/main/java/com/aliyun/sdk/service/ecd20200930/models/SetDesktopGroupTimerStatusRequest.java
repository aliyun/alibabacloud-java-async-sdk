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
 * {@link SetDesktopGroupTimerStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopGroupTimerStatusRequest</p>
 */
public class SetDesktopGroupTimerStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the cloud computer share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-fgxsniu6at****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The status of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: enabled</li>
         * <li>2: disabled</li>
         * <li>3: deleted</li>
         * <li>100: unknown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: scheduled reset</li>
         * <li>2: scheduled startup</li>
         * <li>3: scheduled stop</li>
         * <li>4: scheduled restart</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
