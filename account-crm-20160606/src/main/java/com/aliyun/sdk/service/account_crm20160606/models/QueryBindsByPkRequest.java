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
 * {@link QueryBindsByPkRequest} extends {@link RequestModel}
 *
 * <p>QueryBindsByPkRequest</p>
 */
public class QueryBindsByPkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> tenantIds;

    private QueryBindsByPkRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.pk = builder.pk;
        this.tenantIds = builder.tenantIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBindsByPkRequest create() {
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

    /**
     * @return tenantIds
     */
    public java.util.Map<String, ?> getTenantIds() {
        return this.tenantIds;
    }

    public static final class Builder extends Request.Builder<QueryBindsByPkRequest, Builder> {
        private String appName; 
        private String pk; 
        private java.util.Map<String, ?> tenantIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryBindsByPkRequest request) {
            super(request);
            this.appName = request.appName;
            this.pk = request.pk;
            this.tenantIds = request.tenantIds;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantIds(java.util.Map<String, ?> tenantIds) {
            String tenantIdsShrink = shrink(tenantIds, "TenantIds", "json");
            this.putQueryParameter("TenantIds", tenantIdsShrink);
            this.tenantIds = tenantIds;
            return this;
        }

        @Override
        public QueryBindsByPkRequest build() {
            return new QueryBindsByPkRequest(this);
        } 

    } 

}
