// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link ListServicesRequest} extends {@link RequestModel}
 *
 * <p>ListServicesRequest</p>
 */
public class ListServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListServicesRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListServicesRequest, Builder> {
        private String appType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListServicesRequest request) {
            super(request);
            this.appType = request.appType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The type of the application. You can leave this parameter empty or set this parameter to <code>XTRACE</code>. We recommend that you leave this parameter empty.</p>
         * <ul>
         * <li>If you leave this parameter empty, applications monitored by Managed Service for OpenTelemetry or Application Real-Time Monitoring Service (ARMS) can be queried.</li>
         * <li>If you set this parameter to <code>XTRACE</code>, only applications monitored by Managed Service for OpenTelemetry can be queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XTRACE</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListServicesRequest build() {
            return new ListServicesRequest(this);
        } 

    } 

}
