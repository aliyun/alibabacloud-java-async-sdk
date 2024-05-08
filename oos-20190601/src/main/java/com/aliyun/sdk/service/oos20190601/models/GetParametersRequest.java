// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParametersRequest} extends {@link RequestModel}
 *
 * <p>GetParametersRequest</p>
 */
public class GetParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    @com.aliyun.core.annotation.Validation(required = true)
    private String names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetParametersRequest(Builder builder) {
        super(builder);
        this.names = builder.names;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetParametersRequest, Builder> {
        private String names; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetParametersRequest request) {
            super(request);
            this.names = request.names;
            this.regionId = request.regionId;
        } 

        /**
         * The names of the common parameters.
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetParametersRequest build() {
            return new GetParametersRequest(this);
        } 

    } 

}
