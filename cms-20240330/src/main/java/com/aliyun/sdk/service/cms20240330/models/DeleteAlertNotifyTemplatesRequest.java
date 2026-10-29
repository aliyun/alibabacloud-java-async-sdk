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
 * {@link DeleteAlertNotifyTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertNotifyTemplatesRequest</p>
 */
public class DeleteAlertNotifyTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> alertNotifyTemplateIds;

    private DeleteAlertNotifyTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertNotifyTemplateIds = builder.alertNotifyTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertNotifyTemplatesRequest create() {
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
     * @return alertNotifyTemplateIds
     */
    public java.util.List<String> getAlertNotifyTemplateIds() {
        return this.alertNotifyTemplateIds;
    }

    public static final class Builder extends Request.Builder<DeleteAlertNotifyTemplatesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> alertNotifyTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertNotifyTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertNotifyTemplateIds = request.alertNotifyTemplateIds;
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
        public Builder alertNotifyTemplateIds(java.util.List<String> alertNotifyTemplateIds) {
            String alertNotifyTemplateIdsShrink = shrink(alertNotifyTemplateIds, "alertNotifyTemplateIds", "json");
            this.putQueryParameter("alertNotifyTemplateIds", alertNotifyTemplateIdsShrink);
            this.alertNotifyTemplateIds = alertNotifyTemplateIds;
            return this;
        }

        @Override
        public DeleteAlertNotifyTemplatesRequest build() {
            return new DeleteAlertNotifyTemplatesRequest(this);
        } 

    } 

}
