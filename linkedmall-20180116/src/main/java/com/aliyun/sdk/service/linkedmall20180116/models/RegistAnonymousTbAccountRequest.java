// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegistAnonymousTbAccountRequest} extends {@link RequestModel}
 *
 * <p>RegistAnonymousTbAccountRequest</p>
 */
public class RegistAnonymousTbAccountRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    private String thirdPartyUserId;

    private RegistAnonymousTbAccountRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistAnonymousTbAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static final class Builder extends Request.Builder<RegistAnonymousTbAccountRequest, Builder> {
        private String bizId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(RegistAnonymousTbAccountRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.thirdPartyUserId = request.thirdPartyUserId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public RegistAnonymousTbAccountRequest build() {
            return new RegistAnonymousTbAccountRequest(this);
        } 

    } 

}
