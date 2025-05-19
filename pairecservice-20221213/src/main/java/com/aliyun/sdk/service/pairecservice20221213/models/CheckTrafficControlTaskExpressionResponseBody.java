// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CheckTrafficControlTaskExpressionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckTrafficControlTaskExpressionResponseBody</p>
 */
public class CheckTrafficControlTaskExpressionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsValie")
    private Boolean isValie;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckTrafficControlTaskExpressionResponseBody(Builder builder) {
        this.isValie = builder.isValie;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTrafficControlTaskExpressionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isValie
     */
    public Boolean getIsValie() {
        return this.isValie;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isValie; 
        private String reason; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckTrafficControlTaskExpressionResponseBody model) {
            this.isValie = model.isValie;
            this.reason = model.reason;
            this.requestId = model.requestId;
        } 

        /**
         * IsValie.
         */
        public Builder isValie(Boolean isValie) {
            this.isValie = isValie;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckTrafficControlTaskExpressionResponseBody build() {
            return new CheckTrafficControlTaskExpressionResponseBody(this);
        } 

    } 

}
