// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link StartAlertRequest} extends {@link RequestModel}
 *
 * <p>StartAlertRequest</p>
 */
public class StartAlertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StartAlertRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAlertRequest create() {
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

    public static final class Builder extends Request.Builder<StartAlertRequest, Builder> {
        private String alertId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartAlertRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the alert rule. You can call the SearchAlertRules operation and view the <code>Id</code> parameter in the response. For more information, see <a href="https://help.aliyun.com/document_detail/175825.html">SearchAlertRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1610***</p>
         */
        public Builder alertId(String alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * <p>The ID of the region. Set the value to <code>cn-hangzhou</code>.</p>
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

        @Override
        public StartAlertRequest build() {
            return new StartAlertRequest(this);
        } 

    } 

}
