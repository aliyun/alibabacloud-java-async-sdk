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
 * {@link GetProfileTypeByPkRequest} extends {@link RequestModel}
 *
 * <p>GetProfileTypeByPkRequest</p>
 */
public class GetProfileTypeByPkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private GetProfileTypeByPkRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProfileTypeByPkRequest create() {
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
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<GetProfileTypeByPkRequest, Builder> {
        private String appName; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(GetProfileTypeByPkRequest request) {
            super(request);
            this.appName = request.appName;
            this.pk = request.pk;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
        public GetProfileTypeByPkRequest build() {
            return new GetProfileTypeByPkRequest(this);
        } 

    } 

}
