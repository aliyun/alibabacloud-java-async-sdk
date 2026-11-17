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
 * {@link CreateWebFilterRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWebFilterRulesResponseBody</p>
 */
public class CreateWebFilterRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebFilterRuleIds")
    private java.util.List<String> webFilterRuleIds;

    private CreateWebFilterRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webFilterRuleIds = builder.webFilterRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebFilterRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webFilterRuleIds
     */
    public java.util.List<String> getWebFilterRuleIds() {
        return this.webFilterRuleIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> webFilterRuleIds; 

        private Builder() {
        } 

        private Builder(CreateWebFilterRulesResponseBody model) {
            this.requestId = model.requestId;
            this.webFilterRuleIds = model.webFilterRuleIds;
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

        /**
         * <p>The list of IDs of the newly created web filtering rules. The order of the IDs corresponds one-to-one with the order of the input Rules parameter.</p>
         */
        public Builder webFilterRuleIds(java.util.List<String> webFilterRuleIds) {
            this.webFilterRuleIds = webFilterRuleIds;
            return this;
        }

        public CreateWebFilterRulesResponseBody build() {
            return new CreateWebFilterRulesResponseBody(this);
        } 

    } 

}
