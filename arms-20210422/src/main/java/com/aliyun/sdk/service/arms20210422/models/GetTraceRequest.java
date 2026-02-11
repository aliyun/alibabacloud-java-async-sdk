// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link GetTraceRequest} extends {@link RequestModel}
 *
 * <p>GetTraceRequest</p>
 */
public class GetTraceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceID;

    private GetTraceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.traceID = builder.traceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceRequest create() {
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
     * @return traceID
     */
    public String getTraceID() {
        return this.traceID;
    }

    public static final class Builder extends Request.Builder<GetTraceRequest, Builder> {
        private String regionId; 
        private String traceID; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.traceID = request.traceID;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder traceID(String traceID) {
            this.putQueryParameter("TraceID", traceID);
            this.traceID = traceID;
            return this;
        }

        @Override
        public GetTraceRequest build() {
            return new GetTraceRequest(this);
        } 

    } 

}
