// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CopyConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>CopyConfigRulesRequest</p>
 */
public class CopyConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesAggregatorIds")
    private String desAggregatorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcAggregatorId")
    private String srcAggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcConfigRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The IDs of the destination account groups into which the rules are replicated. Separate multiple account group IDs with commas (,).</p>
         * <blockquote>
         * <p>If you leave this parameter empty, the compliance packages are replicated into the same account group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ca-4b4e626622af005d****</p>
         */
        public Builder desAggregatorIds(String desAggregatorIds) {
            this.putQueryParameter("DesAggregatorIds", desAggregatorIds);
            this.desAggregatorIds = desAggregatorIds;
            return this;
        }

        /**
         * <p>The ID of the account group to which the rules belong.</p>
         * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-24db626622af0060****</p>
         */
        public Builder srcAggregatorId(String srcAggregatorId) {
            this.putQueryParameter("SrcAggregatorId", srcAggregatorId);
            this.srcAggregatorId = srcAggregatorId;
            return this;
        }

        /**
         * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-4b57626622af0065****,cr-47c1626622af0050****</p>
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
