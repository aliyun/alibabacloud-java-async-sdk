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
 * {@link CreateApplicationCustomRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationCustomRulesResponseBody</p>
 */
public class CreateApplicationCustomRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleIds")
    private java.util.List<String> applicationCustomRuleIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationCustomRulesResponseBody(Builder builder) {
        this.applicationCustomRuleIds = builder.applicationCustomRuleIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationCustomRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCustomRuleIds
     */
    public java.util.List<String> getApplicationCustomRuleIds() {
        return this.applicationCustomRuleIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> applicationCustomRuleIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApplicationCustomRulesResponseBody model) {
            this.applicationCustomRuleIds = model.applicationCustomRuleIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of IDs for the newly created custom application rules. The order of the IDs corresponds to the order of the rules in the Rules request parameter.</p>
         */
        public Builder applicationCustomRuleIds(java.util.List<String> applicationCustomRuleIds) {
            this.applicationCustomRuleIds = applicationCustomRuleIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationCustomRulesResponseBody build() {
            return new CreateApplicationCustomRulesResponseBody(this);
        } 

    } 

}
