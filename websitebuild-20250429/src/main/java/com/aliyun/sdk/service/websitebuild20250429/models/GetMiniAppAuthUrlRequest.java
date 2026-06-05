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
 * {@link GetMiniAppAuthUrlRequest} extends {@link RequestModel}
 *
 * <p>GetMiniAppAuthUrlRequest</p>
 */
public class GetMiniAppAuthUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedirectUri")
    private String redirectUri;

    private GetMiniAppAuthUrlRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.channel = builder.channel;
        this.redirectUri = builder.redirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiniAppAuthUrlRequest create() {
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
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public static final class Builder extends Request.Builder<GetMiniAppAuthUrlRequest, Builder> {
        private String bizId; 
        private String channel; 
        private String redirectUri; 

        private Builder() {
            super();
        } 

        private Builder(GetMiniAppAuthUrlRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.channel = request.channel;
            this.redirectUri = request.redirectUri;
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
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * RedirectUri.
         */
        public Builder redirectUri(String redirectUri) {
            this.putQueryParameter("RedirectUri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        @Override
        public GetMiniAppAuthUrlRequest build() {
            return new GetMiniAppAuthUrlRequest(this);
        } 

    } 

}
