// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTraceAppByNameRequest} extends {@link RequestModel}
 *
 * <p>SearchTraceAppByNameRequest</p>
 */
public class SearchTraceAppByNameRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TraceAppName")
    private String traceAppName;

    private SearchTraceAppByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.traceAppName = builder.traceAppName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTraceAppByNameRequest create() {
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
     * @return traceAppName
     */
    public String getTraceAppName() {
        return this.traceAppName;
    }

    public static final class Builder extends Request.Builder<SearchTraceAppByNameRequest, Builder> {
        private String regionId; 
        private String traceAppName; 

        private Builder() {
            super();
        } 

        private Builder(SearchTraceAppByNameRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.traceAppName = response.traceAppName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TraceAppName.
         */
        public Builder traceAppName(String traceAppName) {
            this.putQueryParameter("TraceAppName", traceAppName);
            this.traceAppName = traceAppName;
            return this;
        }

        @Override
        public SearchTraceAppByNameRequest build() {
            return new SearchTraceAppByNameRequest(this);
        } 

    } 

}
