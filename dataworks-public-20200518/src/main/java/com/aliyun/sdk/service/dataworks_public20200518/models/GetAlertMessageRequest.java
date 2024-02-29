// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertMessageRequest} extends {@link RequestModel}
 *
 * <p>GetAlertMessageRequest</p>
 */
public class GetAlertMessageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AlertId")
    @Validation(required = true)
    private String alertId;

    private GetAlertMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertId = builder.alertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alertId
     */
    public String getAlertId() {
        return this.alertId;
    }

    public static final class Builder extends Request.Builder<GetAlertMessageRequest, Builder> {
        private String regionId; 
        private String alertId; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertId = request.alertId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AlertId.
         */
        public Builder alertId(String alertId) {
            this.putBodyParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        @Override
        public GetAlertMessageRequest build() {
            return new GetAlertMessageRequest(this);
        } 

    } 

}
