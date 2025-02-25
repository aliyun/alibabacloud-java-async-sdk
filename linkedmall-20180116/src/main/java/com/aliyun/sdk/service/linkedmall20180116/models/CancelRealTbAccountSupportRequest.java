// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link CancelRealTbAccountSupportRequest} extends {@link RequestModel}
 *
 * <p>CancelRealTbAccountSupportRequest</p>
 */
public class CancelRealTbAccountSupportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    private CancelRealTbAccountSupportRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRealTbAccountSupportRequest create() {
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

    public static final class Builder extends Request.Builder<CancelRealTbAccountSupportRequest, Builder> {
        private String regionId; 
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRealTbAccountSupportRequest request) {
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
         * <p>This parameter is required.</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public CancelRealTbAccountSupportRequest build() {
            return new CancelRealTbAccountSupportRequest(this);
        } 

    } 

}
