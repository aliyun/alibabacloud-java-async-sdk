// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SearchSemanticViewsRequest} extends {@link RequestModel}
 *
 * <p>SearchSemanticViewsRequest</p>
 */
public class SearchSemanticViewsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    private SearchSemanticViewsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.queryText = builder.queryText;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSemanticViewsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<SearchSemanticViewsRequest, Builder> {
        private String DBClusterId; 
        private String queryText; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(SearchSemanticViewsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.queryText = request.queryText;
            this.topK = request.topK;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp*****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * QueryText.
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public SearchSemanticViewsRequest build() {
            return new SearchSemanticViewsRequest(this);
        } 

    } 

}
