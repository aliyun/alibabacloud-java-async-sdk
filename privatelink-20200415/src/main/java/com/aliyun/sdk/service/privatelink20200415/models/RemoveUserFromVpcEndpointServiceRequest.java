// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromVpcEndpointServiceRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserFromVpcEndpointServiceRequest</p>
 */
public class RemoveUserFromVpcEndpointServiceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("UserARN")
    private String userARN;

    @Query
    @NameInMap("UserId")
    @Validation()
    private Long userId;

    private RemoveUserFromVpcEndpointServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.userARN = builder.userARN;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserFromVpcEndpointServiceRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return userARN
     */
    public String getUserARN() {
        return this.userARN;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemoveUserFromVpcEndpointServiceRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String serviceId; 
        private String userARN; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserFromVpcEndpointServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.userARN = request.userARN;
            this.userId = request.userId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The region ID of the endpoint service for which you want to remove the account ID from the whitelist. You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The endpoint service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The whitelist in the format of Aliyun Resource Name (ARN).
         */
        public Builder userARN(String userARN) {
            this.putQueryParameter("UserARN", userARN);
            this.userARN = userARN;
            return this;
        }

        /**
         * The account ID that you want to remove from the whitelist.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RemoveUserFromVpcEndpointServiceRequest build() {
            return new RemoveUserFromVpcEndpointServiceRequest(this);
        } 

    } 

}
