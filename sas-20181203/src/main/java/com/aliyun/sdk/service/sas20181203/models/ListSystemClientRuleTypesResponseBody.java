// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSystemClientRuleTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemClientRuleTypesResponseBody</p>
 */
public class ListSystemClientRuleTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleTypes")
    private java.util.List < String > ruleTypes;

    private ListSystemClientRuleTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleTypes = builder.ruleTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemClientRuleTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleTypes
     */
    public java.util.List < String > getRuleTypes() {
        return this.ruleTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > ruleTypes; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleTypes.
         */
        public Builder ruleTypes(java.util.List < String > ruleTypes) {
            this.ruleTypes = ruleTypes;
            return this;
        }

        public ListSystemClientRuleTypesResponseBody build() {
            return new ListSystemClientRuleTypesResponseBody(this);
        } 

    } 

}
