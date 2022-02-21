// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateForwardingRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateForwardingRuleAttributeRequest</p>
 */
public class UpdateForwardingRuleAttributeRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForwardingRule")
    @Validation(required = true)
    private java.util.Map < String, ? > forwardingRule;

    @Query
    @NameInMap("ForwardingRuleDescription")
    private String forwardingRuleDescription;

    @Query
    @NameInMap("ForwardingRuleName")
    private String forwardingRuleName;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateForwardingRuleAttributeRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.forwardingRule = builder.forwardingRule;
        this.forwardingRuleDescription = builder.forwardingRuleDescription;
        this.forwardingRuleName = builder.forwardingRuleName;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateForwardingRuleAttributeRequest create() {
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
     * @return forwardingRule
     */
    public java.util.Map < String, ? > getForwardingRule() {
        return this.forwardingRule;
    }

    /**
     * @return forwardingRuleDescription
     */
    public String getForwardingRuleDescription() {
        return this.forwardingRuleDescription;
    }

    /**
     * @return forwardingRuleName
     */
    public String getForwardingRuleName() {
        return this.forwardingRuleName;
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

    public static final class Builder extends Request.Builder<UpdateForwardingRuleAttributeRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private java.util.Map < String, ? > forwardingRule; 
        private String forwardingRuleDescription; 
        private String forwardingRuleName; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateForwardingRuleAttributeRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.forwardingRule = response.forwardingRule;
            this.forwardingRuleDescription = response.forwardingRuleDescription;
            this.forwardingRuleName = response.forwardingRuleName;
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
         * ForwardingRule.
         */
        public Builder forwardingRule(java.util.Map < String, ? > forwardingRule) {
            this.putQueryParameter("ForwardingRule", forwardingRule);
            this.forwardingRule = forwardingRule;
            return this;
        }

        /**
         * ForwardingRuleDescription.
         */
        public Builder forwardingRuleDescription(String forwardingRuleDescription) {
            this.putQueryParameter("ForwardingRuleDescription", forwardingRuleDescription);
            this.forwardingRuleDescription = forwardingRuleDescription;
            return this;
        }

        /**
         * ForwardingRuleName.
         */
        public Builder forwardingRuleName(String forwardingRuleName) {
            this.putQueryParameter("ForwardingRuleName", forwardingRuleName);
            this.forwardingRuleName = forwardingRuleName;
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
        public UpdateForwardingRuleAttributeRequest build() {
            return new UpdateForwardingRuleAttributeRequest(this);
        } 

    } 

}
