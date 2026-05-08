// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link QueryQwenConferenceSgTicketSearchPopRequest} extends {@link RequestModel}
 *
 * <p>QueryQwenConferenceSgTicketSearchPopRequest</p>
 */
public class QueryQwenConferenceSgTicketSearchPopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    private QueryQwenConferenceSgTicketSearchPopRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQwenConferenceSgTicketSearchPopRequest create() {
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

    public static final class Builder extends Request.Builder<QueryQwenConferenceSgTicketSearchPopRequest, Builder> {
        private String keyword; 

        private Builder() {
            super();
        } 

        private Builder(QueryQwenConferenceSgTicketSearchPopRequest request) {
            super(request);
            this.keyword = request.keyword;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        @Override
        public QueryQwenConferenceSgTicketSearchPopRequest build() {
            return new QueryQwenConferenceSgTicketSearchPopRequest(this);
        } 

    } 

}
