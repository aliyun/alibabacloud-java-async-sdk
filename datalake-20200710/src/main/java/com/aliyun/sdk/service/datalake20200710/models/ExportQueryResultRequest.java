// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportQueryResultRequest} extends {@link RequestModel}
 *
 * <p>ExportQueryResultRequest</p>
 */
public class ExportQueryResultRequest extends Request {
    @Query
    @NameInMap("QueryId")
    private String queryId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ExportQueryResultRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportQueryResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ExportQueryResultRequest, Builder> {
        private String queryId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ExportQueryResultRequest response) {
            super(response);
            this.queryId = response.queryId;
            this.regionId = response.regionId;
        } 

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ExportQueryResultRequest build() {
            return new ExportQueryResultRequest(this);
        } 

    } 

}
