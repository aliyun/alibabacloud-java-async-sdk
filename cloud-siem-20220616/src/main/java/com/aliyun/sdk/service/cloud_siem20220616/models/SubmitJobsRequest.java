// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitJobsRequest</p>
 */
public class SubmitJobsRequest extends Request {
    @Body
    @NameInMap("JsonParam")
    @Validation(required = true)
    private String jsonParam;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private SubmitJobsRequest(Builder builder) {
        super(builder);
        this.jsonParam = builder.jsonParam;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonParam
     */
    public String getJsonParam() {
        return this.jsonParam;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SubmitJobsRequest, Builder> {
        private String jsonParam; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitJobsRequest request) {
            super(request);
            this.jsonParam = request.jsonParam;
            this.regionId = request.regionId;
        } 

        /**
         * JsonParam.
         */
        public Builder jsonParam(String jsonParam) {
            this.putBodyParameter("JsonParam", jsonParam);
            this.jsonParam = jsonParam;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SubmitJobsRequest build() {
            return new SubmitJobsRequest(this);
        } 

    } 

}
