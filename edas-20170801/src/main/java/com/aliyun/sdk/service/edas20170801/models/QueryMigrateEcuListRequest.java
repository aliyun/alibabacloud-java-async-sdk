// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMigrateEcuListRequest} extends {@link RequestModel}
 *
 * <p>QueryMigrateEcuListRequest</p>
 */
public class QueryMigrateEcuListRequest extends Request {
    @Query
    @NameInMap("LogicalRegionId")
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
         * The ID of the namespace.
         * <p>
         * 
         * *   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: `cn-beijing:test`.
         * *   The ID of the default namespace is in the `region ID` format. Example: `cn-beijing`.
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
