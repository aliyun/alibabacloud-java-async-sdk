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
 * {@link QueryEnumConfigByTypeRequest} extends {@link RequestModel}
 *
 * <p>QueryEnumConfigByTypeRequest</p>
 */
public class QueryEnumConfigByTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private QueryEnumConfigByTypeRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEnumConfigByTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryEnumConfigByTypeRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QueryEnumConfigByTypeRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryEnumConfigByTypeRequest build() {
            return new QueryEnumConfigByTypeRequest(this);
        } 

    } 

}
