// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link SubYikeUserCreditRequest} extends {@link RequestModel}
 *
 * <p>SubYikeUserCreditRequest</p>
 */
public class SubYikeUserCreditRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credit")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer credit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YikeUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yikeUserId;

    private SubYikeUserCreditRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credit = builder.credit;
        this.yikeUserId = builder.yikeUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubYikeUserCreditRequest create() {
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
     * @return credit
     */
    public Integer getCredit() {
        return this.credit;
    }

    /**
     * @return yikeUserId
     */
    public String getYikeUserId() {
        return this.yikeUserId;
    }

    public static final class Builder extends Request.Builder<SubYikeUserCreditRequest, Builder> {
        private String regionId; 
        private Integer credit; 
        private String yikeUserId; 

        private Builder() {
            super();
        } 

        private Builder(SubYikeUserCreditRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credit = request.credit;
            this.yikeUserId = request.yikeUserId;
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
         * <p>50</p>
         */
        public Builder credit(Integer credit) {
            this.putQueryParameter("Credit", credit);
            this.credit = credit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder yikeUserId(String yikeUserId) {
            this.putQueryParameter("YikeUserId", yikeUserId);
            this.yikeUserId = yikeUserId;
            return this;
        }

        @Override
        public SubYikeUserCreditRequest build() {
            return new SubYikeUserCreditRequest(this);
        } 

    } 

}
