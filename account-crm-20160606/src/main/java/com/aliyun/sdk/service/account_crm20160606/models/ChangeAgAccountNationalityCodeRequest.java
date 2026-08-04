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
 * {@link ChangeAgAccountNationalityCodeRequest} extends {@link RequestModel}
 *
 * <p>ChangeAgAccountNationalityCodeRequest</p>
 */
public class ChangeAgAccountNationalityCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NationalityCode")
    private String nationalityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    private ChangeAgAccountNationalityCodeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.mpk = builder.mpk;
        this.nationalityCode = builder.nationalityCode;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAgAccountNationalityCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return nationalityCode
     */
    public String getNationalityCode() {
        return this.nationalityCode;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<ChangeAgAccountNationalityCodeRequest, Builder> {
        private String appName; 
        private String mpk; 
        private String nationalityCode; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAgAccountNationalityCodeRequest request) {
            super(request);
            this.appName = request.appName;
            this.mpk = request.mpk;
            this.nationalityCode = request.nationalityCode;
            this.pk = request.pk;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Mpk.
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * NationalityCode.
         */
        public Builder nationalityCode(String nationalityCode) {
            this.putQueryParameter("NationalityCode", nationalityCode);
            this.nationalityCode = nationalityCode;
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
        public ChangeAgAccountNationalityCodeRequest build() {
            return new ChangeAgAccountNationalityCodeRequest(this);
        } 

    } 

}
