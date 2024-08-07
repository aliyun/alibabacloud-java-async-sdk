// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataRangeRequest} extends {@link RequestModel}
 *
 * <p>QueryDataRangeRequest</p>
 */
public class QueryDataRangeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private QueryDataRangeRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataRangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryDataRangeRequest, Builder> {
        private String keyword; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataRangeRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.type = request.type;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryDataRangeRequest build() {
            return new QueryDataRangeRequest(this);
        } 

    } 

}
