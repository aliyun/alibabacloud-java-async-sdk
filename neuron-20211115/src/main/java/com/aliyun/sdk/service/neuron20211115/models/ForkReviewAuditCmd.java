// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ForkReviewAuditCmd} extends {@link TeaModel}
 *
 * <p>ForkReviewAuditCmd</p>
 */
public class ForkReviewAuditCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("approve")
    private Boolean approve;

    private ForkReviewAuditCmd(Builder builder) {
        this.approve = builder.approve;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForkReviewAuditCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approve
     */
    public Boolean getApprove() {
        return this.approve;
    }

    public static final class Builder {
        private Boolean approve; 

        private Builder() {
        } 

        private Builder(ForkReviewAuditCmd model) {
            this.approve = model.approve;
        } 

        /**
         * approve.
         */
        public Builder approve(Boolean approve) {
            this.approve = approve;
            return this;
        }

        public ForkReviewAuditCmd build() {
            return new ForkReviewAuditCmd(this);
        } 

    } 

}
