// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultipleTraceRequest} extends {@link RequestModel}
 *
 * <p>GetMultipleTraceRequest</p>
 */
public class GetMultipleTraceRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TraceIDs")
    private java.util.List < String > traceIDs;

    private GetMultipleTraceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.traceIDs = builder.traceIDs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultipleTraceRequest create() {
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
     * @return traceIDs
     */
    public java.util.List < String > getTraceIDs() {
        return this.traceIDs;
    }

    public static final class Builder extends Request.Builder<GetMultipleTraceRequest, Builder> {
        private String regionId; 
        private java.util.List < String > traceIDs; 

        private Builder() {
            super();
        } 

        private Builder(GetMultipleTraceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.traceIDs = request.traceIDs;
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
         * TraceIDs.
         */
        public Builder traceIDs(java.util.List < String > traceIDs) {
            this.putQueryParameter("TraceIDs", traceIDs);
            this.traceIDs = traceIDs;
            return this;
        }

        @Override
        public GetMultipleTraceRequest build() {
            return new GetMultipleTraceRequest(this);
        } 

    } 

}
