// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DeleteGtmRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGtmRecoveryPlanResponseBody</p>
 */
public class DeleteGtmRecoveryPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteGtmRecoveryPlanResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGtmRecoveryPlanResponseBody create() {
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

        private Builder(DeleteGtmRecoveryPlanResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteGtmRecoveryPlanResponseBody build() {
            return new DeleteGtmRecoveryPlanResponseBody(this);
        } 

    } 

}
