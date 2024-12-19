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
 * {@link SetDesktopGroupTimerRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopGroupTimerRequest</p>
 */
public class SetDesktopGroupTimerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetType")
    private Integer resetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cron expression for the scheduled task. This parameter is required when <code>TimerType</code> is set to 2, 3, or 4.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 ? * 1-7</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The ID of the cloud computer pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-dbdkfmh883****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully execute the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
         * <p>The type of the disk that you want to reset.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>does not reset disks.</li>
         * <li>resets only the system disk.</li>
         * <li>resets only the user disk.</li>
         * <li>resets the system disk and the user disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resetType(Integer resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
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
        public SetDesktopGroupTimerRequest build() {
            return new SetDesktopGroupTimerRequest(this);
        } 

    } 

}
