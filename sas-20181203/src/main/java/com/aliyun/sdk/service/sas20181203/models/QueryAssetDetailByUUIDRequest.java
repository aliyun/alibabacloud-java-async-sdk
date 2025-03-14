// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryAssetDetailByUUIDRequest} extends {@link RequestModel}
 *
 * <p>QueryAssetDetailByUUIDRequest</p>
 */
public class QueryAssetDetailByUUIDRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Requests")
    private String requests;

    private QueryAssetDetailByUUIDRequest(Builder builder) {
        super(builder);
        this.requests = builder.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAssetDetailByUUIDRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requests
     */
    public String getRequests() {
        return this.requests;
    }

    public static final class Builder extends Request.Builder<QueryAssetDetailByUUIDRequest, Builder> {
        private String requests; 

        private Builder() {
            super();
        } 

        private Builder(QueryAssetDetailByUUIDRequest request) {
            super(request);
            this.requests = request.requests;
        } 

        /**
         * <p>A key-value pair that consists of the user ID and the asset list.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;AliUid&quot;: &quot;176618589410****&quot;,
         *       &quot;UuidList&quot;: [
         *             &quot;429fe207-3014-40c6-972b-cdff1d7a****&quot;,
         *             &quot;429fe207-3014-40c6-972b-cdff1d7b****&quot;,
         *             &quot;429fe207-3014-40c6-972b-cdff1d7c****&quot;
         *       ]
         * }</p>
         */
        public Builder requests(String requests) {
            this.putBodyParameter("Requests", requests);
            this.requests = requests;
            return this;
        }

        @Override
        public QueryAssetDetailByUUIDRequest build() {
            return new QueryAssetDetailByUUIDRequest(this);
        } 

    } 

}
