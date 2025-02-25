// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link DeleteStateConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteStateConfigurationsRequest</p>
 */
public class DeleteStateConfigurationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StateConfigurationIds")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteStateConfigurationsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.stateConfigurationIds = request.stateConfigurationIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>abcde3OARpx77No54nv6</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The IDs of desired-state configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sc-asfgdhj12345&quot;]</p>
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
