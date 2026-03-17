// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppInstanceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetAppInstanceForPartnerRequest</p>
 */
public class GetAppInstanceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    private GetAppInstanceForPartnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppInstanceForPartnerRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<GetAppInstanceForPartnerRequest, Builder> {
        private String regionId; 
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppInstanceForPartnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public GetAppInstanceForPartnerRequest build() {
            return new GetAppInstanceForPartnerRequest(this);
        } 

    } 

}
