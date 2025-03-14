// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ChangeSecurityScoreRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeSecurityScoreRuleResponseBody</p>
 */
public class ChangeSecurityScoreRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeSecurityScoreRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeSecurityScoreRuleResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ChangeSecurityScoreRuleResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23AD0BD2-8771-5647-819E-6BA51E21****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeSecurityScoreRuleResponseBody build() {
            return new ChangeSecurityScoreRuleResponseBody(this);
        } 

    } 

}
