// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrivateIpRequest} extends {@link RequestModel}
 *
 * <p>GetPrivateIpRequest</p>
 */
public class GetPrivateIpRequest extends Request {
    @Query
    @NameInMap("ClientInstanceId")
    @Validation(required = true)
    private String clientInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetPrivateIpRequest(Builder builder) {
        super(builder);
        this.clientInstanceId = builder.clientInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInstanceId
     */
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetPrivateIpRequest, Builder> {
        private String clientInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrivateIpRequest response) {
            super(response);
            this.clientInstanceId = response.clientInstanceId;
            this.regionId = response.regionId;
        } 

        /**
         * ClientInstanceId.
         */
        public Builder clientInstanceId(String clientInstanceId) {
            this.putQueryParameter("ClientInstanceId", clientInstanceId);
            this.clientInstanceId = clientInstanceId;
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

        @Override
        public GetPrivateIpRequest build() {
            return new GetPrivateIpRequest(this);
        } 

    } 

}
