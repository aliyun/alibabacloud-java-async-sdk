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
 * {@link RemoveServiceSharedAccountsRequest} extends {@link RequestModel}
 *
 * <p>RemoveServiceSharedAccountsRequest</p>
 */
public class RemoveServiceSharedAccountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAliUids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> userAliUids;

    private RemoveServiceSharedAccountsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
        this.userAliUids = builder.userAliUids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveServiceSharedAccountsRequest create() {
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userAliUids
     */
    public java.util.List<Long> getUserAliUids() {
        return this.userAliUids;
    }

    public static final class Builder extends Request.Builder<RemoveServiceSharedAccountsRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String serviceId; 
        private String type; 
        private java.util.List<Long> userAliUids; 

        private Builder() {
            super();
        } 

        private Builder(RemoveServiceSharedAccountsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.type = request.type;
            this.userAliUids = request.userAliUids;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a54420****</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The share type of the service. Default value: SharedAccount. Valid values:</p>
         * <ul>
         * <li>SharedAccount: The service is shared by multiple accounts.</li>
         * <li>Reseller: The service is distributed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SharedAccount</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Whitelist accounts for service sharing.</p>
         * <p>This parameter is required.</p>
         */
        public Builder userAliUids(java.util.List<Long> userAliUids) {
            this.putQueryParameter("UserAliUids", userAliUids);
            this.userAliUids = userAliUids;
            return this;
        }

        @Override
        public RemoveServiceSharedAccountsRequest build() {
            return new RemoveServiceSharedAccountsRequest(this);
        } 

    } 

}
