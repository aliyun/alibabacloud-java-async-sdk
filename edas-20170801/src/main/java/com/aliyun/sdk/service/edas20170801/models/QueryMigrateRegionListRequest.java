// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMigrateRegionListRequest} extends {@link RequestModel}
 *
 * <p>QueryMigrateRegionListRequest</p>
 */
public class QueryMigrateRegionListRequest extends Request {
    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

    private QueryMigrateRegionListRequest(Builder builder) {
        super(builder);
        this.logicalRegionId = builder.logicalRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMigrateRegionListRequest create() {
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

    public static final class Builder extends Request.Builder<QueryMigrateRegionListRequest, Builder> {
        private String logicalRegionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMigrateRegionListRequest request) {
            super(request);
            this.logicalRegionId = request.logicalRegionId;
        } 

        /**
         * The ID of the namespace.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        @Override
        public QueryMigrateRegionListRequest build() {
            return new QueryMigrateRegionListRequest(this);
        } 

    } 

}
