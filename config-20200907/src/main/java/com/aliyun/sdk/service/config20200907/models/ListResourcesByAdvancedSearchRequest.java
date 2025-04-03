// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListResourcesByAdvancedSearchRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesByAdvancedSearchRequest</p>
 */
public class ListResourcesByAdvancedSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private ListResourcesByAdvancedSearchRequest(Builder builder) {
        super(builder);
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesByAdvancedSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<ListResourcesByAdvancedSearchRequest, Builder> {
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesByAdvancedSearchRequest request) {
            super(request);
            this.sql = request.sql;
        } 

        /**
         * <p>The SQL query statement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT ResourceId, ResourceName WHERE Tags.Kvpair=&quot;business:online&quot;</p>
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public ListResourcesByAdvancedSearchRequest build() {
            return new ListResourcesByAdvancedSearchRequest(this);
        } 

    } 

}
