// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetAliyunPKByAliyunIDRequest} extends {@link RequestModel}
 *
 * <p>GetAliyunPKByAliyunIDRequest</p>
 */
public class GetAliyunPKByAliyunIDRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaId")
    private String havanaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    private GetAliyunPKByAliyunIDRequest(Builder builder) {
        super(builder);
        this.aliyunId = builder.aliyunId;
        this.email = builder.email;
        this.havanaId = builder.havanaId;
        this.mobile = builder.mobile;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliyunPKByAliyunIDRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunId
     */
    public String getAliyunId() {
        return this.aliyunId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return havanaId
     */
    public String getHavanaId() {
        return this.havanaId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<GetAliyunPKByAliyunIDRequest, Builder> {
        private String aliyunId; 
        private String email; 
        private String havanaId; 
        private String mobile; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(GetAliyunPKByAliyunIDRequest request) {
            super(request);
            this.aliyunId = request.aliyunId;
            this.email = request.email;
            this.havanaId = request.havanaId;
            this.mobile = request.mobile;
            this.pk = request.pk;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliyunId(String aliyunId) {
            this.putQueryParameter("AliyunId", aliyunId);
            this.aliyunId = aliyunId;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * HavanaId.
         */
        public Builder havanaId(String havanaId) {
            this.putQueryParameter("HavanaId", havanaId);
            this.havanaId = havanaId;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * PK.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public GetAliyunPKByAliyunIDRequest build() {
            return new GetAliyunPKByAliyunIDRequest(this);
        } 

    } 

}
