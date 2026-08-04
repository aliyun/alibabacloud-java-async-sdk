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
 * {@link QueryAccountAddressInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountAddressInfoRequest</p>
 */
public class QueryAccountAddressInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressVersion")
    private String addressVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaId")
    private String havanaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    private QueryAccountAddressInfoRequest(Builder builder) {
        super(builder);
        this.addressVersion = builder.addressVersion;
        this.havanaId = builder.havanaId;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountAddressInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressVersion
     */
    public String getAddressVersion() {
        return this.addressVersion;
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

    public static final class Builder extends Request.Builder<QueryAccountAddressInfoRequest, Builder> {
        private String addressVersion; 
        private String havanaId; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountAddressInfoRequest request) {
            super(request);
            this.addressVersion = request.addressVersion;
            this.havanaId = request.havanaId;
            this.pk = request.pk;
        } 

        /**
         * AddressVersion.
         */
        public Builder addressVersion(String addressVersion) {
            this.putQueryParameter("AddressVersion", addressVersion);
            this.addressVersion = addressVersion;
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
         * PK.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public QueryAccountAddressInfoRequest build() {
            return new QueryAccountAddressInfoRequest(this);
        } 

    } 

}
