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
 * {@link QueryAccountRealNameInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountRealNameInfoRequest</p>
 */
public class QueryAccountRealNameInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    private QueryAccountRealNameInfoRequest(Builder builder) {
        super(builder);
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountRealNameInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAccountRealNameInfoRequest, Builder> {
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountRealNameInfoRequest request) {
            super(request);
            this.pk = request.pk;
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
        public QueryAccountRealNameInfoRequest build() {
            return new QueryAccountRealNameInfoRequest(this);
        } 

    } 

}
