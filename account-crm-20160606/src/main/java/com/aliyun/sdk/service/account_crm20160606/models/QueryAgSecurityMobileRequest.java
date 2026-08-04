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
 * {@link QueryAgSecurityMobileRequest} extends {@link RequestModel}
 *
 * <p>QueryAgSecurityMobileRequest</p>
 */
public class QueryAgSecurityMobileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private QueryAgSecurityMobileRequest(Builder builder) {
        super(builder);
        this.agAccountType = builder.agAccountType;
        this.appName = builder.appName;
        this.mpk = builder.mpk;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAgSecurityMobileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agAccountType
     */
    public String getAgAccountType() {
        return this.agAccountType;
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
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<QueryAgSecurityMobileRequest, Builder> {
        private String agAccountType; 
        private String appName; 
        private String mpk; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(QueryAgSecurityMobileRequest request) {
            super(request);
            this.agAccountType = request.agAccountType;
            this.appName = request.appName;
            this.mpk = request.mpk;
            this.pk = request.pk;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agAccountType(String agAccountType) {
            this.putQueryParameter("AgAccountType", agAccountType);
            this.agAccountType = agAccountType;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public QueryAgSecurityMobileRequest build() {
            return new QueryAgSecurityMobileRequest(this);
        } 

    } 

}
