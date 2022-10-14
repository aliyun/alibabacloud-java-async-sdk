// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelQueryRequest} extends {@link RequestModel}
 *
 * <p>CancelQueryRequest</p>
 */
public class CancelQueryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("QueryId")
    private String queryId;

    private CancelQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<CancelQueryRequest, Builder> {
        private String regionId; 
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(CancelQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.queryId = request.queryId;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public CancelQueryRequest build() {
            return new CancelQueryRequest(this);
        } 

    } 

}
