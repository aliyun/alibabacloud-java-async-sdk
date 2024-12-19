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
 * {@link GetUserTokenPageRequest} extends {@link RequestModel}
 *
 * <p>GetUserTokenPageRequest</p>
 */
public class GetUserTokenPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 86400, minimum = 60)
    private Long expireSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    private GetUserTokenPageRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.expireSeconds = builder.expireSeconds;
        this.extJson = builder.extJson;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserTokenPageRequest create() {
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
     * @return expireSeconds
     */
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<GetUserTokenPageRequest, Builder> {
        private String bizId; 
        private Long expireSeconds; 
        private String extJson; 
        private String thirdPartyUserId; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(GetUserTokenPageRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.expireSeconds = request.expireSeconds;
            this.extJson = request.extJson;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.userNick = request.userNick;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder expireSeconds(Long expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22******234</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UserNick.
         */
        public Builder userNick(String userNick) {
            this.putQueryParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public GetUserTokenPageRequest build() {
            return new GetUserTokenPageRequest(this);
        } 

    } 

}
