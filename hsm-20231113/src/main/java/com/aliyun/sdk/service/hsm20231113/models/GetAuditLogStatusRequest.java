// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditLogStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAuditLogStatusRequest</p>
 */
public class GetAuditLogStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GetOssBucket")
    private Boolean getOssBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetAuditLogStatusRequest(Builder builder) {
        super(builder);
        this.getOssBucket = builder.getOssBucket;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditLogStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return getOssBucket
     */
    public Boolean getGetOssBucket() {
        return this.getOssBucket;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAuditLogStatusRequest, Builder> {
        private Boolean getOssBucket; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuditLogStatusRequest request) {
            super(request);
            this.getOssBucket = request.getOssBucket;
            this.regionId = request.regionId;
        } 

        /**
         * GetOssBucket.
         */
        public Builder getOssBucket(Boolean getOssBucket) {
            this.putQueryParameter("GetOssBucket", getOssBucket);
            this.getOssBucket = getOssBucket;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAuditLogStatusRequest build() {
            return new GetAuditLogStatusRequest(this);
        } 

    } 

}
