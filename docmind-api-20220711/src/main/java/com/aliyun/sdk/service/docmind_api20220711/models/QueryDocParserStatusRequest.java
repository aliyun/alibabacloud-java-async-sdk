// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDocParserStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDocParserStatusRequest</p>
 */
public class QueryDocParserStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private QueryDocParserStatusRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDocParserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<QueryDocParserStatusRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(QueryDocParserStatusRequest request) {
            super(request);
            this.id = request.id;
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
        public QueryDocParserStatusRequest build() {
            return new QueryDocParserStatusRequest(this);
        } 

    } 

}
