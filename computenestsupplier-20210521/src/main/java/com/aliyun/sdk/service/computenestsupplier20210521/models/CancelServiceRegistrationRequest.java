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
 * {@link CancelServiceRegistrationRequest} extends {@link RequestModel}
 *
 * <p>CancelServiceRegistrationRequest</p>
 */
public class CancelServiceRegistrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registrationId;

    private CancelServiceRegistrationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.registrationId = builder.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelServiceRegistrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CancelServiceRegistrationRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String registrationId; 

        private Builder() {
            super();
        } 

        private Builder(CancelServiceRegistrationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.registrationId = request.registrationId;
        } 

        /**
         * <p>Client token, used to ensure the idempotence of requests. Generate a unique value for this parameter from your client to ensure it is unique across different requests. ClientToken supports only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-540930183f93xxxxxx</p>
         */
        public Builder registrationId(String registrationId) {
            this.putQueryParameter("RegistrationId", registrationId);
            this.registrationId = registrationId;
            return this;
        }

        @Override
        public CancelServiceRegistrationRequest build() {
            return new CancelServiceRegistrationRequest(this);
        } 

    } 

}
