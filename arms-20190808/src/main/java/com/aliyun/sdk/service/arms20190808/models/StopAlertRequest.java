// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAlertRequest} extends {@link RequestModel}
 *
 * <p>StopAlertRequest</p>
 */
public class StopAlertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StopAlertRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAlertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public String getAlertId() {
        return this.alertId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopAlertRequest, Builder> {
        private String alertId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopAlertRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the alert rule.
         */
        public Builder alertId(String alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
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

        @Override
        public StopAlertRequest build() {
            return new StopAlertRequest(this);
        } 

    } 

}
