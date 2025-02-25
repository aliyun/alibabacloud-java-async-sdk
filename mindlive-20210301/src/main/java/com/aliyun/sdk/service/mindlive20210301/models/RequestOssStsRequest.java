// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestOssStsRequest} extends {@link RequestModel}
 *
 * <p>RequestOssStsRequest</p>
 */
public class RequestOssStsRequest extends Request {
    @Query
    @NameInMap("AppCode")
    @Validation(required = true)
    private String appCode;

    @Query
    @NameInMap("ExpireSeconds")
    @Validation(required = true)
    private Long expireSeconds;

    private RequestOssStsRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.expireSeconds = builder.expireSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestOssStsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return expireSeconds
     */
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public static final class Builder extends Request.Builder<RequestOssStsRequest, Builder> {
        private String appCode; 
        private Long expireSeconds; 

        private Builder() {
            super();
        } 

        private Builder(RequestOssStsRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.expireSeconds = request.expireSeconds;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * ExpireSeconds.
         */
        public Builder expireSeconds(Long expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
            return this;
        }

        @Override
        public RequestOssStsRequest build() {
            return new RequestOssStsRequest(this);
        } 

    } 

}
