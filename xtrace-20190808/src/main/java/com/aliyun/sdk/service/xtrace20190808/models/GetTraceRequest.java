// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTraceRequest} extends {@link RequestModel}
 *
 * <p>GetTraceRequest</p>
 */
public class GetTraceRequest extends Request {
    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TraceID")
    @Validation(required = true)
    private String traceID;

    private GetTraceRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
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
        private String appType; 
        private String regionId; 
        private String traceID; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceRequest response) {
            super(response);
            this.appType = response.appType;
            this.regionId = response.regionId;
            this.traceID = response.traceID;
        } 

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
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
         * TraceID.
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
