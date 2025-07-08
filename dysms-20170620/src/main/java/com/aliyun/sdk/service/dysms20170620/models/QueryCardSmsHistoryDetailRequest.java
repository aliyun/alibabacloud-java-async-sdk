// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryCardSmsHistoryDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsHistoryDetailRequest</p>
 */
public class QueryCardSmsHistoryDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private QueryCardSmsHistoryDetailRequest(Builder builder) {
        super(builder);
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsHistoryDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<QueryCardSmsHistoryDetailRequest, Builder> {
        private String gmtCreate; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(QueryCardSmsHistoryDetailRequest request) {
            super(request);
            this.gmtCreate = request.gmtCreate;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public QueryCardSmsHistoryDetailRequest build() {
            return new QueryCardSmsHistoryDetailRequest(this);
        } 

    } 

}
