// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTreeDataRequest} extends {@link RequestModel}
 *
 * <p>QueryTreeDataRequest</p>
 */
public class QueryTreeDataRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private QueryTreeDataRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTreeDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<QueryTreeDataRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(QueryTreeDataRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public QueryTreeDataRequest build() {
            return new QueryTreeDataRequest(this);
        } 

    } 

}
