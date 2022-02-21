// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStateConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteStateConfigurationsRequest</p>
 */
public class DeleteStateConfigurationsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StateConfigurationIds")
    @Validation(required = true)
    private String stateConfigurationIds;

    private DeleteStateConfigurationsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.stateConfigurationIds = builder.stateConfigurationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStateConfigurationsRequest create() {
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
     * @return stateConfigurationIds
     */
    public String getStateConfigurationIds() {
        return this.stateConfigurationIds;
    }

    public static final class Builder extends Request.Builder<DeleteStateConfigurationsRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String stateConfigurationIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStateConfigurationsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
            this.stateConfigurationIds = response.stateConfigurationIds;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StateConfigurationIds.
         */
        public Builder stateConfigurationIds(String stateConfigurationIds) {
            this.putQueryParameter("StateConfigurationIds", stateConfigurationIds);
            this.stateConfigurationIds = stateConfigurationIds;
            return this;
        }

        @Override
        public DeleteStateConfigurationsRequest build() {
            return new DeleteStateConfigurationsRequest(this);
        } 

    } 

}
