// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteRulesRequest</p>
 */
public class DeleteRulesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RuleIds")
    @Validation(required = true)
    private java.util.List < String > ruleIds;

    private DeleteRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRulesRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ruleIds
     */
    public java.util.List < String > getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<DeleteRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRulesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.ruleIds = response.ruleIds;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 同一个监听下的转发规则标识列表
         */
        public Builder ruleIds(java.util.List < String > ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        @Override
        public DeleteRulesRequest build() {
            return new DeleteRulesRequest(this);
        } 

    } 

}
