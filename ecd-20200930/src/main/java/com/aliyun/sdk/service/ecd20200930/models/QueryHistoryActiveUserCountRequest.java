// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryActiveUserCountRequest} extends {@link RequestModel}
 *
 * <p>QueryHistoryActiveUserCountRequest</p>
 */
public class QueryHistoryActiveUserCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDate")
    private String dataDate;

    private QueryHistoryActiveUserCountRequest(Builder builder) {
        super(builder);
        this.dataDate = builder.dataDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryActiveUserCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDate
     */
    public String getDataDate() {
        return this.dataDate;
    }

    public static final class Builder extends Request.Builder<QueryHistoryActiveUserCountRequest, Builder> {
        private String dataDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryHistoryActiveUserCountRequest request) {
            super(request);
            this.dataDate = request.dataDate;
        } 

        /**
         * DataDate.
         */
        public Builder dataDate(String dataDate) {
            this.putQueryParameter("DataDate", dataDate);
            this.dataDate = dataDate;
            return this;
        }

        @Override
        public QueryHistoryActiveUserCountRequest build() {
            return new QueryHistoryActiveUserCountRequest(this);
        } 

    } 

}
