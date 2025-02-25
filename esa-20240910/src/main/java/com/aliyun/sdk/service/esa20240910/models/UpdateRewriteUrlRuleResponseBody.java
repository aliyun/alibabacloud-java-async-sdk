// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateRewriteUrlRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRewriteUrlRuleResponseBody</p>
 */
public class UpdateRewriteUrlRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateRewriteUrlRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRewriteUrlRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateRewriteUrlRuleResponseBody build() {
            return new UpdateRewriteUrlRuleResponseBody(this);
        } 

    } 

}
