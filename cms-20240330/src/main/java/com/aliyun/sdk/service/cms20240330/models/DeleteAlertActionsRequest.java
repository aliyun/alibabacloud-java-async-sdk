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
 * {@link DeleteAlertActionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertActionsRequest</p>
 */
public class DeleteAlertActionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertActionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> alertActionIds;

    private DeleteAlertActionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertActionIds = builder.alertActionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertActionsRequest create() {
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
     * @return alertActionIds
     */
    public java.util.List<String> getAlertActionIds() {
        return this.alertActionIds;
    }

    public static final class Builder extends Request.Builder<DeleteAlertActionsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> alertActionIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertActionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertActionIds = request.alertActionIds;
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
         */
        public Builder alertActionIds(java.util.List<String> alertActionIds) {
            String alertActionIdsShrink = shrink(alertActionIds, "alertActionIds", "json");
            this.putQueryParameter("alertActionIds", alertActionIdsShrink);
            this.alertActionIds = alertActionIds;
            return this;
        }

        @Override
        public DeleteAlertActionsRequest build() {
            return new DeleteAlertActionsRequest(this);
        } 

    } 

}
