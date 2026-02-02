// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DeleteQosRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteQosRulesRequest</p>
 */
public class DeleteQosRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> qosRuleId;

    private DeleteQosRulesRequest(Builder builder) {
        super(builder);
        this.qosRuleId = builder.qosRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQosRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qosRuleId
     */
    public java.util.List<String> getQosRuleId() {
        return this.qosRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteQosRulesRequest, Builder> {
        private java.util.List<String> qosRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQosRulesRequest request) {
            super(request);
            this.qosRuleId = request.qosRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder qosRuleId(java.util.List<String> qosRuleId) {
            this.putQueryParameter("QosRuleId", qosRuleId);
            this.qosRuleId = qosRuleId;
            return this;
        }

        @Override
        public DeleteQosRulesRequest build() {
            return new DeleteQosRulesRequest(this);
        } 

    } 

}
