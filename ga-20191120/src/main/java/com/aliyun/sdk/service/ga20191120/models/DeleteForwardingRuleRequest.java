// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteForwardingRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteForwardingRuleRequest</p>
 */
public class DeleteForwardingRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForwardingRuleId")
    @Validation(required = true)
    private String forwardingRuleId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteForwardingRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.forwardingRuleId = builder.forwardingRuleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteForwardingRuleRequest create() {
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
     * @return forwardingRuleId
     */
    public String getForwardingRuleId() {
        return this.forwardingRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteForwardingRuleRequest, Builder> {
        private String clientToken; 
        private String forwardingRuleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteForwardingRuleRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.forwardingRuleId = response.forwardingRuleId;
            this.regionId = response.regionId;
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
         * ForwardingRuleId.
         */
        public Builder forwardingRuleId(String forwardingRuleId) {
            this.putQueryParameter("ForwardingRuleId", forwardingRuleId);
            this.forwardingRuleId = forwardingRuleId;
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
        public DeleteForwardingRuleRequest build() {
            return new DeleteForwardingRuleRequest(this);
        } 

    } 

}
