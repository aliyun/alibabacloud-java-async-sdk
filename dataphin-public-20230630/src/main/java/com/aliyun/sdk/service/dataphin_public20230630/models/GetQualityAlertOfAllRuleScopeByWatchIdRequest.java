// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQualityAlertOfAllRuleScopeByWatchIdRequest} extends {@link RequestModel}
 *
 * <p>GetQualityAlertOfAllRuleScopeByWatchIdRequest</p>
 */
public class GetQualityAlertOfAllRuleScopeByWatchIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long watchId;

    private GetQualityAlertOfAllRuleScopeByWatchIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.watchId = builder.watchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityAlertOfAllRuleScopeByWatchIdRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return watchId
     */
    public Long getWatchId() {
        return this.watchId;
    }

    public static final class Builder extends Request.Builder<GetQualityAlertOfAllRuleScopeByWatchIdRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private Long watchId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityAlertOfAllRuleScopeByWatchIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.watchId = request.watchId;
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
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder watchId(Long watchId) {
            this.putQueryParameter("WatchId", watchId);
            this.watchId = watchId;
            return this;
        }

        @Override
        public GetQualityAlertOfAllRuleScopeByWatchIdRequest build() {
            return new GetQualityAlertOfAllRuleScopeByWatchIdRequest(this);
        } 

    } 

}
