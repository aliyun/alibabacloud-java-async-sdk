// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetAlertActionRequest} extends {@link RequestModel}
 *
 * <p>GetAlertActionRequest</p>
 */
public class GetAlertActionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("alertActionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertActionId;

    private GetAlertActionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertActionId = builder.alertActionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertActionRequest create() {
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
     * @return alertActionId
     */
    public String getAlertActionId() {
        return this.alertActionId;
    }

    public static final class Builder extends Request.Builder<GetAlertActionRequest, Builder> {
        private String regionId; 
        private String alertActionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertActionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertActionId = request.alertActionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder alertActionId(String alertActionId) {
            this.putPathParameter("alertActionId", alertActionId);
            this.alertActionId = alertActionId;
            return this;
        }

        @Override
        public GetAlertActionRequest build() {
            return new GetAlertActionRequest(this);
        } 

    } 

}
