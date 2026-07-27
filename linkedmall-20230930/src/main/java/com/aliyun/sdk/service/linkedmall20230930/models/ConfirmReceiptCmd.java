// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ConfirmReceiptCmd} extends {@link TeaModel}
 *
 * <p>ConfirmReceiptCmd</p>
 */
public class ConfirmReceiptCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disputeId")
    private String disputeId;

    private ConfirmReceiptCmd(Builder builder) {
        this.disputeId = builder.disputeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmReceiptCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disputeId
     */
    public String getDisputeId() {
        return this.disputeId;
    }

    public static final class Builder {
        private String disputeId; 

        private Builder() {
        } 

        private Builder(ConfirmReceiptCmd model) {
            this.disputeId = model.disputeId;
        } 

        /**
         * disputeId.
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        public ConfirmReceiptCmd build() {
            return new ConfirmReceiptCmd(this);
        } 

    } 

}
