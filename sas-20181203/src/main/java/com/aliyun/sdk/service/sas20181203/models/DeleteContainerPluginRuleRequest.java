// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContainerPluginRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteContainerPluginRuleRequest</p>
 */
public class DeleteContainerPluginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleId;

    private DeleteContainerPluginRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContainerPluginRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteContainerPluginRuleRequest, Builder> {
        private String lang; 
        private Integer ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContainerPluginRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.ruleId = request.ruleId;
        } 

        /**
         * The language of the content within the request and the response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the rule. You can call the addContainerWebDefenseRule operation to query the ID.
         */
        public Builder ruleId(Integer ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteContainerPluginRuleRequest build() {
            return new DeleteContainerPluginRuleRequest(this);
        } 

    } 

}
