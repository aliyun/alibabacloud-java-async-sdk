// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPictureUrlRequest</p>
 */
public class GetPictureUrlRequest extends Request {
    @Body
    @NameInMap("ExpireTime")
    @Validation(required = true)
    private String expireTime;

    @Body
    @NameInMap("OriginUrl")
    @Validation(required = true)
    private String originUrl;

    @Body
    @NameInMap("Protocol")
    private String protocol;

    private GetPictureUrlRequest(Builder builder) {
        super(builder);
        this.expireTime = builder.expireTime;
        this.originUrl = builder.originUrl;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPictureUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return originUrl
     */
    public String getOriginUrl() {
        return this.originUrl;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<GetPictureUrlRequest, Builder> {
        private String expireTime; 
        private String originUrl; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(GetPictureUrlRequest response) {
            super(response);
            this.expireTime = response.expireTime;
            this.originUrl = response.originUrl;
            this.protocol = response.protocol;
        } 

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * OriginUrl.
         */
        public Builder originUrl(String originUrl) {
            this.putBodyParameter("OriginUrl", originUrl);
            this.originUrl = originUrl;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public GetPictureUrlRequest build() {
            return new GetPictureUrlRequest(this);
        } 

    } 

}
