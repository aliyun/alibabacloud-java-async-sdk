// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMaskingRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaskingRulesRequest</p>
 */
public class DeleteMaskingRulesRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("RuleNameList")
    @Validation(required = true)
    private String ruleNameList;

    private DeleteMaskingRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ruleNameList = builder.ruleNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMaskingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ruleNameList
     */
    public String getRuleNameList() {
        return this.ruleNameList;
    }

    public static final class Builder extends Request.Builder<DeleteMaskingRulesRequest, Builder> {
        private String DBClusterId; 
        private String ruleNameList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMaskingRulesRequest response) {
            super(response);
            this.DBClusterId = response.DBClusterId;
            this.ruleNameList = response.ruleNameList;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * RuleNameList.
         */
        public Builder ruleNameList(String ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        @Override
        public DeleteMaskingRulesRequest build() {
            return new DeleteMaskingRulesRequest(this);
        } 

    } 

}
