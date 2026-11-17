// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListWebFilterRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWebFilterRulesRequest</p>
 */
public class ListWebFilterRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterRuleId")
    private String webFilterRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
    private String webFilterTemplateId;

    private ListWebFilterRulesRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.ruleAction = builder.ruleAction;
        this.webFilterRuleId = builder.webFilterRuleId;
        this.webFilterTemplateId = builder.webFilterTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebFilterRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return webFilterRuleId
     */
    public String getWebFilterRuleId() {
        return this.webFilterRuleId;
    }

    /**
     * @return webFilterTemplateId
     */
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

    public static final class Builder extends Request.Builder<ListWebFilterRulesRequest, Builder> {
        private Long pageNo; 
        private Long pageSize; 
        private String ruleAction; 
        private String webFilterRuleId; 
        private String webFilterTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(ListWebFilterRulesRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.ruleAction = request.ruleAction;
            this.webFilterRuleId = request.webFilterRuleId;
            this.webFilterTemplateId = request.webFilterTemplateId;
        } 

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. The value must be greater than or equal to 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The rule action for exact matching. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: Allows the request.</li>
         * <li><strong>Alert</strong>: Monitors the request.</li>
         * <li><strong>Deny</strong>: Blocks the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The ID of the web filtering rule for exact matching.</p>
         * 
         * <strong>example:</strong>
         * <p>wfr-8c1d2e3f4a5b6c7d</p>
         */
        public Builder webFilterRuleId(String webFilterRuleId) {
            this.putQueryParameter("WebFilterRuleId", webFilterRuleId);
            this.webFilterRuleId = webFilterRuleId;
            return this;
        }

        /**
         * <p>The ID of the web filtering template for exact matching.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        public Builder webFilterTemplateId(String webFilterTemplateId) {
            this.putQueryParameter("WebFilterTemplateId", webFilterTemplateId);
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }

        @Override
        public ListWebFilterRulesRequest build() {
            return new ListWebFilterRulesRequest(this);
        } 

    } 

}
