// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginPageRequest} extends {@link RequestModel}
 *
 * <p>GetLoginPageRequest</p>
 */
public class GetLoginPageRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("FailUrl")
    private String failUrl;

    @Body
    @NameInMap("TargetUrl")
    private String targetUrl;

    @Query
    @NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @Query
    @NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private GetLoginPageRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.failUrl = builder.failUrl;
        this.targetUrl = builder.targetUrl;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginPageRequest create() {
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
     * @return failUrl
     */
    public String getFailUrl() {
        return this.failUrl;
    }

    /**
     * @return targetUrl
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<GetLoginPageRequest, Builder> {
        private String bizId; 
        private String failUrl; 
        private String targetUrl; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetLoginPageRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.failUrl = request.failUrl;
            this.targetUrl = request.targetUrl;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
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
         * FailUrl.
         */
        public Builder failUrl(String failUrl) {
            this.putBodyParameter("FailUrl", failUrl);
            this.failUrl = failUrl;
            return this;
        }

        /**
         * TargetUrl.
         */
        public Builder targetUrl(String targetUrl) {
            this.putBodyParameter("TargetUrl", targetUrl);
            this.targetUrl = targetUrl;
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

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public GetLoginPageRequest build() {
            return new GetLoginPageRequest(this);
        } 

    } 

}
