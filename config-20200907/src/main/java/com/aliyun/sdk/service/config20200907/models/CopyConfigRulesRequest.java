// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>CopyConfigRulesRequest</p>
 */
public class CopyConfigRulesRequest extends Request {
    @Query
    @NameInMap("DesAggregatorIds")
    private String desAggregatorIds;

    @Query
    @NameInMap("SrcAggregatorId")
    private String srcAggregatorId;

    @Query
    @NameInMap("SrcConfigRuleIds")
    @Validation(required = true)
    private String srcConfigRuleIds;

    private CopyConfigRulesRequest(Builder builder) {
        super(builder);
        this.desAggregatorIds = builder.desAggregatorIds;
        this.srcAggregatorId = builder.srcAggregatorId;
        this.srcConfigRuleIds = builder.srcConfigRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyConfigRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desAggregatorIds
     */
    public String getDesAggregatorIds() {
        return this.desAggregatorIds;
    }

    /**
     * @return srcAggregatorId
     */
    public String getSrcAggregatorId() {
        return this.srcAggregatorId;
    }

    /**
     * @return srcConfigRuleIds
     */
    public String getSrcConfigRuleIds() {
        return this.srcConfigRuleIds;
    }

    public static final class Builder extends Request.Builder<CopyConfigRulesRequest, Builder> {
        private String desAggregatorIds; 
        private String srcAggregatorId; 
        private String srcConfigRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(CopyConfigRulesRequest request) {
            super(request);
            this.desAggregatorIds = request.desAggregatorIds;
            this.srcAggregatorId = request.srcAggregatorId;
            this.srcConfigRuleIds = request.srcConfigRuleIds;
        } 

        /**
         * The IDs of the destination account groups into which the rules are replicated. Separate multiple account group IDs with commas (,).
         * <p>
         * 
         * > If you leave this parameter empty, the compliance packages are replicated into the same account group.
         */
        public Builder desAggregatorIds(String desAggregatorIds) {
            this.putQueryParameter("DesAggregatorIds", desAggregatorIds);
            this.desAggregatorIds = desAggregatorIds;
            return this;
        }

        /**
         * The ID of the account group to which the rules belong.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder srcAggregatorId(String srcAggregatorId) {
            this.putQueryParameter("SrcAggregatorId", srcAggregatorId);
            this.srcAggregatorId = srcAggregatorId;
            return this;
        }

        /**
         * The rule IDs. Separate multiple rule IDs with commas (,).
         */
        public Builder srcConfigRuleIds(String srcConfigRuleIds) {
            this.putQueryParameter("SrcConfigRuleIds", srcConfigRuleIds);
            this.srcConfigRuleIds = srcConfigRuleIds;
            return this;
        }

        @Override
        public CopyConfigRulesRequest build() {
            return new CopyConfigRulesRequest(this);
        } 

    } 

}
