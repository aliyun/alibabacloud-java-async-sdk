// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link RequestUploadTokenRequest} extends {@link RequestModel}
 *
 * <p>RequestUploadTokenRequest</p>
 */
public class RequestUploadTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    @com.aliyun.core.annotation.Validation(required = true)
    private String os;

    private RequestUploadTokenRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.os = builder.os;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestUploadTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    public static final class Builder extends Request.Builder<RequestUploadTokenRequest, Builder> {
        private Long appKey; 
        private String os; 

        private Builder() {
            super();
        } 

        private Builder(RequestUploadTokenRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.os = request.os;
        } 

        /**
         * <p>appKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24780725</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        @Override
        public RequestUploadTokenRequest build() {
            return new RequestUploadTokenRequest(this);
        } 

    } 

}
