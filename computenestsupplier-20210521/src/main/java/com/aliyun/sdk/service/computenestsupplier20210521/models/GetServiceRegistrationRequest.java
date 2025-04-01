// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetServiceRegistrationRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRegistrationRequest</p>
 */
public class GetServiceRegistrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    private GetServiceRegistrationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.registrationId = builder.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRegistrationRequest create() {
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
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    public static final class Builder extends Request.Builder<GetServiceRegistrationRequest, Builder> {
        private String regionId; 
        private String registrationId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceRegistrationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.registrationId = request.registrationId;
        } 

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Service registration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-1b4aabc1c9eb4109****</p>
         */
        public Builder registrationId(String registrationId) {
            this.putQueryParameter("RegistrationId", registrationId);
            this.registrationId = registrationId;
            return this;
        }

        @Override
        public GetServiceRegistrationRequest build() {
            return new GetServiceRegistrationRequest(this);
        } 

    } 

}
