// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
         * <p>Specifies whether to obtain the list of OSS buckets that can be used to store audit logs. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder getOssBucket(Boolean getOssBucket) {
            this.putQueryParameter("GetOssBucket", getOssBucket);
            this.getOssBucket = getOssBucket;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
        public GetAuditLogStatusRequest build() {
            return new GetAuditLogStatusRequest(this);
        } 

    } 

}
