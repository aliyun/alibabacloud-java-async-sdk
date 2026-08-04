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
 * {@link QueryAccountSiteRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountSiteRequest</p>
 */
public class QueryAccountSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private QueryAccountSiteRequest(Builder builder) {
        super(builder);
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountSiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<QueryAccountSiteRequest, Builder> {
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountSiteRequest request) {
            super(request);
            this.pk = request.pk;
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
        public QueryAccountSiteRequest build() {
            return new QueryAccountSiteRequest(this);
        } 

    } 

}
