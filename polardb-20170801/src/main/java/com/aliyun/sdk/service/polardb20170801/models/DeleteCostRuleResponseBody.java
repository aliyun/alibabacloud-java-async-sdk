// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteCostRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCostRuleResponseBody</p>
 */
public class DeleteCostRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AffectedModelApiIds")
    private java.util.List<String> affectedModelApiIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteCostRuleResponseBody(Builder builder) {
        this.affectedModelApiIds = builder.affectedModelApiIds;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCostRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectedModelApiIds
     */
    public java.util.List<String> getAffectedModelApiIds() {
        return this.affectedModelApiIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<String> affectedModelApiIds; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteCostRuleResponseBody model) {
            this.affectedModelApiIds = model.affectedModelApiIds;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of model API IDs affected by the deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ma-2ze3x6i1d7g5rto28&quot;]</p>
         */
        public Builder affectedModelApiIds(java.util.List<String> affectedModelApiIds) {
            this.affectedModelApiIds = affectedModelApiIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the deletion was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteCostRuleResponseBody build() {
            return new DeleteCostRuleResponseBody(this);
        } 

    } 

}
