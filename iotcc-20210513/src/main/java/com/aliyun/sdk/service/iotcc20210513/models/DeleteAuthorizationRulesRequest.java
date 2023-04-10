// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAuthorizationRulesRequest</p>
 */
public class DeleteAuthorizationRulesRequest extends Request {
    @Query
    @NameInMap("AuthorizationRuleIds")
    @Validation(required = true)
    private java.util.List < String > authorizationRuleIds;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.authorizationRuleIds = builder.authorizationRuleIds;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAuthorizationRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRuleIds
     */
    public java.util.List < String > getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
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
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAuthorizationRulesRequest, Builder> {
        private java.util.List < String > authorizationRuleIds; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAuthorizationRulesRequest request) {
            super(request);
            this.authorizationRuleIds = request.authorizationRuleIds;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
        } 

        /**
         * AuthorizationRuleIds.
         */
        public Builder authorizationRuleIds(java.util.List < String > authorizationRuleIds) {
            this.putQueryParameter("AuthorizationRuleIds", authorizationRuleIds);
            this.authorizationRuleIds = authorizationRuleIds;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
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
        public DeleteAuthorizationRulesRequest build() {
            return new DeleteAuthorizationRulesRequest(this);
        } 

    } 

}
