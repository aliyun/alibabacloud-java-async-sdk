// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CheckLicenseRequest} extends {@link RequestModel}
 *
 * <p>CheckLicenseRequest</p>
 */
public class CheckLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nonce")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nonce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sign")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    private CheckLicenseRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.filter = builder.filter;
        this.nonce = builder.nonce;
        this.sign = builder.sign;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return nonce
     */
    public String getNonce() {
        return this.nonce;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<CheckLicenseRequest, Builder> {
        private String businessType; 
        private String filter; 
        private String nonce; 
        private String sign; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(CheckLicenseRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.filter = request.filter;
            this.nonce = request.nonce;
            this.sign = request.sign;
            this.time = request.time;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nonce(String nonce) {
            this.putQueryParameter("Nonce", nonce);
            this.nonce = nonce;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sign(String sign) {
            this.putQueryParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public CheckLicenseRequest build() {
            return new CheckLicenseRequest(this);
        } 

    } 

}
