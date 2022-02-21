// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteForwardingRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteForwardingRulesRequest</p>
 */
public class DeleteForwardingRulesRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForwardingRuleIds")
    @Validation(required = true)
    private java.util.List < String > forwardingRuleIds;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteForwardingRulesRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.forwardingRuleIds = builder.forwardingRuleIds;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteForwardingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forwardingRuleIds
     */
    public java.util.List < String > getForwardingRuleIds() {
        return this.forwardingRuleIds;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteForwardingRulesRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private java.util.List < String > forwardingRuleIds; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteForwardingRulesRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.forwardingRuleIds = response.forwardingRuleIds;
            this.listenerId = response.listenerId;
            this.regionId = response.regionId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
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
         * ForwardingRuleIds.
         */
        public Builder forwardingRuleIds(java.util.List < String > forwardingRuleIds) {
            this.putQueryParameter("ForwardingRuleIds", forwardingRuleIds);
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
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
        public DeleteForwardingRulesRequest build() {
            return new DeleteForwardingRulesRequest(this);
        } 

    } 

}
