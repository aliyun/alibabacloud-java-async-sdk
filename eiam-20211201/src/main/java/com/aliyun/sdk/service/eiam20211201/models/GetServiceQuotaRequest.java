// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetServiceQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetServiceQuotaRequest</p>
 */
public class GetServiceQuotaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaType;

    private GetServiceQuotaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.quotaType = builder.quotaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceQuotaRequest create() {
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
     * @return quotaType
     */
    public String getQuotaType() {
        return this.quotaType;
    }

    public static final class Builder extends Request.Builder<GetServiceQuotaRequest, Builder> {
        private String regionId; 
        private String quotaType; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceQuotaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.quotaType = request.quotaType;
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
         * <p>Quota 配额的唯一标识。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceTrialTimes。</p>
         */
        public Builder quotaType(String quotaType) {
            this.putQueryParameter("QuotaType", quotaType);
            this.quotaType = quotaType;
            return this;
        }

        @Override
        public GetServiceQuotaRequest build() {
            return new GetServiceQuotaRequest(this);
        } 

    } 

}
