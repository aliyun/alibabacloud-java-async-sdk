// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link QueryMigrateEcuListRequest} extends {@link RequestModel}
 *
 * <p>QueryMigrateEcuListRequest</p>
 */
public class QueryMigrateEcuListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

    private QueryMigrateEcuListRequest(Builder builder) {
        super(builder);
        this.logicalRegionId = builder.logicalRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMigrateEcuListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public static final class Builder extends Request.Builder<QueryMigrateEcuListRequest, Builder> {
        private String logicalRegionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMigrateEcuListRequest request) {
            super(request);
            this.logicalRegionId = request.logicalRegionId;
        } 

        /**
         * <p>The ID of the namespace.</p>
         * <ul>
         * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: <code>cn-beijing:test</code>.</li>
         * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: <code>cn-beijing</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou or cn-hangzhou:test</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        @Override
        public QueryMigrateEcuListRequest build() {
            return new QueryMigrateEcuListRequest(this);
        } 

    } 

}
