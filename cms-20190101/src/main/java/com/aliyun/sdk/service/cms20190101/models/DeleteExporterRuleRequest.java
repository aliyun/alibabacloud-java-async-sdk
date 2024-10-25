// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExporterRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteExporterRuleRequest</p>
 */
public class DeleteExporterRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private DeleteExporterRuleRequest(Builder builder) {
        super(builder);
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExporterRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DeleteExporterRuleRequest, Builder> {
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExporterRuleRequest request) {
            super(request);
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>The name of the data export rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myRuleName</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DeleteExporterRuleRequest build() {
            return new DeleteExporterRuleRequest(this);
        } 

    } 

}
