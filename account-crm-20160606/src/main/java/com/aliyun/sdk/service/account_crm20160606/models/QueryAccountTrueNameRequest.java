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
 * {@link QueryAccountTrueNameRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountTrueNameRequest</p>
 */
public class QueryAccountTrueNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaId")
    private String havanaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    private QueryAccountTrueNameRequest(Builder builder) {
        super(builder);
        this.havanaId = builder.havanaId;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTrueNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return havanaId
     */
    public String getHavanaId() {
        return this.havanaId;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<QueryAccountTrueNameRequest, Builder> {
        private String havanaId; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountTrueNameRequest request) {
            super(request);
            this.havanaId = request.havanaId;
            this.pk = request.pk;
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
         * PK.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public QueryAccountTrueNameRequest build() {
            return new QueryAccountTrueNameRequest(this);
        } 

    } 

}
