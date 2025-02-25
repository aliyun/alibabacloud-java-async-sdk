// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SwitchInstanceZoneFailOverRequest} extends {@link RequestModel}
 *
 * <p>SwitchInstanceZoneFailOverRequest</p>
 */
public class SwitchInstanceZoneFailOverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteFaultTime")
    private String siteFaultTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetZoneId")
    private String targetZoneId;

    private SwitchInstanceZoneFailOverRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.siteFaultTime = builder.siteFaultTime;
        this.targetZoneId = builder.targetZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchInstanceZoneFailOverRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return siteFaultTime
     */
    public String getSiteFaultTime() {
        return this.siteFaultTime;
    }

    /**
     * @return targetZoneId
     */
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

    public static final class Builder extends Request.Builder<SwitchInstanceZoneFailOverRequest, Builder> {
        private String instanceId; 
        private String siteFaultTime; 
        private String targetZoneId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchInstanceZoneFailOverRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.siteFaultTime = request.siteFaultTime;
            this.targetZoneId = request.targetZoneId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The duration for which the fault lasts. Unit: minutes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>5</li>
         * <li>10</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder siteFaultTime(String siteFaultTime) {
            this.putQueryParameter("SiteFaultTime", siteFaultTime);
            this.siteFaultTime = siteFaultTime;
            return this;
        }

        /**
         * <p>The ID of the destination zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder targetZoneId(String targetZoneId) {
            this.putQueryParameter("TargetZoneId", targetZoneId);
            this.targetZoneId = targetZoneId;
            return this;
        }

        @Override
        public SwitchInstanceZoneFailOverRequest build() {
            return new SwitchInstanceZoneFailOverRequest(this);
        } 

    } 

}
