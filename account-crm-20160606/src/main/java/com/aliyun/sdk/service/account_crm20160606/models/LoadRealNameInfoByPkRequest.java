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
 * {@link LoadRealNameInfoByPkRequest} extends {@link RequestModel}
 *
 * <p>LoadRealNameInfoByPkRequest</p>
 */
public class LoadRealNameInfoByPkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private LoadRealNameInfoByPkRequest(Builder builder) {
        super(builder);
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadRealNameInfoByPkRequest create() {
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

    public static final class Builder extends Request.Builder<LoadRealNameInfoByPkRequest, Builder> {
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(LoadRealNameInfoByPkRequest request) {
            super(request);
            this.pk = request.pk;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public LoadRealNameInfoByPkRequest build() {
            return new LoadRealNameInfoByPkRequest(this);
        } 

    } 

}
