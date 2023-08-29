// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnregisterMessageRequest} extends {@link RequestModel}
 *
 * <p>UnregisterMessageRequest</p>
 */
public class UnregisterMessageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Properties")
    @Validation(required = true)
    private String properties;

    private UnregisterMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnregisterMessageRequest create() {
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
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    public static final class Builder extends Request.Builder<UnregisterMessageRequest, Builder> {
        private String regionId; 
        private String properties; 

        private Builder() {
            super();
        } 

        private Builder(UnregisterMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.properties = request.properties;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(String properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
            return this;
        }

        @Override
        public UnregisterMessageRequest build() {
            return new UnregisterMessageRequest(this);
        } 

    } 

}
